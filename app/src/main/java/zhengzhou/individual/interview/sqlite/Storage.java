package zhengzhou.individual.interview.sqlite;

import android.content.Context;

import androidx.room.Room;

public class Storage {
    public static LikeDatabase db;

    public static void init(Context context) {
        db = Room.databaseBuilder(context,
                LikeDatabase.class, "likeStatus").build();
    }
}