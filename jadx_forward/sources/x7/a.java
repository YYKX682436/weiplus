package x7;

/* loaded from: classes13.dex */
public class a extends android.database.sqlite.SQLiteOpenHelper implements x7.b {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String[] f533931d = {"_id", "url", "length", "mime"};

    public a(android.content.Context context) {
        super(context, "AndroidVideoCache.db", (android.database.sqlite.SQLiteDatabase.CursorFactory) null, 1);
        context.getClass();
    }

    public u7.u a(java.lang.String str) {
        java.lang.Throwable th6;
        android.database.Cursor cursor;
        str.getClass();
        u7.u uVar = null;
        try {
            cursor = getReadableDatabase().query("SourceInfo", f533931d, "url=?", new java.lang.String[]{str}, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        uVar = new u7.u(cursor.getString(cursor.getColumnIndexOrThrow("url")), cursor.getLong(cursor.getColumnIndexOrThrow("length")), cursor.getString(cursor.getColumnIndexOrThrow("mime")));
                    }
                } catch (java.lang.Throwable th7) {
                    th6 = th7;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th6;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return uVar;
        } catch (java.lang.Throwable th8) {
            th6 = th8;
            cursor = null;
        }
    }

    public void b(java.lang.String str, u7.u uVar) {
        java.lang.Object[] objArr = {str, uVar};
        for (int i17 = 0; i17 < 2; i17++) {
            objArr[i17].getClass();
        }
        boolean z17 = a(str) != null;
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("url", uVar.f506613a);
        contentValues.put("length", java.lang.Long.valueOf(uVar.f506614b));
        contentValues.put("mime", uVar.f506615c);
        if (z17) {
            getWritableDatabase().update("SourceInfo", contentValues, "url=?", new java.lang.String[]{str});
        } else {
            getWritableDatabase().insert("SourceInfo", null, contentValues);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        sQLiteDatabase.execSQL("CREATE TABLE SourceInfo (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,url TEXT NOT NULL,mime TEXT,length INTEGER);");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i17, int i18) {
        throw new java.lang.IllegalStateException("Should not be called. There is no any migration");
    }
}
