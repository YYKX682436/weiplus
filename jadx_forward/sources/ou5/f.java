package ou5;

/* loaded from: classes12.dex */
public class f extends android.database.sqlite.SQLiteOpenHelper implements ou5.h {

    /* renamed from: d, reason: collision with root package name */
    public final android.database.sqlite.SQLiteDatabase f430595d;

    public f(android.content.Context context) {
        super(context, "Scheduler.db", (android.database.sqlite.SQLiteDatabase.CursorFactory) null, 1);
        try {
            this.f430595d = getWritableDatabase();
        } catch (java.lang.Exception e17) {
            ku5.o.f394132c.e("ExperienceStorage", "%s", e17.toString());
        }
    }

    public static android.content.ContentValues a(ou5.c cVar) {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("taskName", cVar.f430585a);
        contentValues.put("threadTime", java.lang.Long.valueOf(cVar.f430586b));
        contentValues.put("time", java.lang.Long.valueOf(cVar.f430587c));
        contentValues.put(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, java.lang.Long.valueOf(cVar.f430589e));
        contentValues.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54480x74e6a74f, java.lang.Float.valueOf(cVar.f430590f));
        contentValues.put("scheduler", cVar.f430588d);
        return contentValues;
    }

    public void b(java.util.Collection collection) {
        android.database.sqlite.SQLiteDatabase sQLiteDatabase = this.f430595d;
        if (sQLiteDatabase != null) {
            try {
                if (collection.size() <= 0) {
                    return;
                }
                try {
                    sQLiteDatabase.beginTransaction();
                    java.util.Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        ou5.b bVar = (ou5.b) it.next();
                        ou5.c cVar = new ou5.c(bVar.f430575a, bVar.f430578d, bVar.f430579e, "");
                        cVar.f430589e = java.lang.System.currentTimeMillis();
                        sQLiteDatabase.insert("DisposedTask", null, a(cVar));
                    }
                } catch (java.lang.Exception e17) {
                    ku5.o.f394132c.e("ExperienceStorage", "%s", e17.toString());
                }
            } finally {
                sQLiteDatabase.setTransactionSuccessful();
                sQLiteDatabase.endTransaction();
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase == null) {
            return;
        }
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS DisposedTask(_ID INTEGER PRIMARY KEY AUTOINCREMENT  NOT NULL, taskName TEXT NOT NULL, threadTime LONG NOT NULL, time LONG NOT NULL, rate REAL NOT NULL, timestamp LONG NOT NULL, scheduler TEXT NOT NULL )");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS timestampIndex ON DisposedTask(timestamp)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS taskNameIndex ON DisposedTask(taskName)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i17, int i18) {
    }
}
