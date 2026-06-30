package vr5;

/* loaded from: classes13.dex */
public class a extends android.database.sqlite.SQLiteOpenHelper {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.Object f521350e = new java.lang.Object();

    /* renamed from: d, reason: collision with root package name */
    public android.database.sqlite.SQLiteDatabase f521351d;

    public a(android.content.Context context) {
        super(context, "LookupResult.db", (android.database.sqlite.SQLiteDatabase.CursorFactory) null, 1);
    }

    public void a(java.lang.String[] strArr) {
        if (strArr.length > 0) {
            synchronized (f521350e) {
                android.database.sqlite.SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        sQLiteDatabase = b();
                        sQLiteDatabase.beginTransaction();
                        sQLiteDatabase.delete("lookupDB", "host IN (" + android.text.TextUtils.join(",", java.util.Collections.nCopies(strArr.length, "?")) + ")", strArr);
                        sQLiteDatabase.setTransactionSuccessful();
                        try {
                            sQLiteDatabase.endTransaction();
                        } catch (java.lang.Exception e17) {
                            or5.b.b("db end transaction error " + e17, new java.lang.Object[0]);
                        }
                    } catch (java.lang.Exception e18) {
                        or5.b.b("delete by hostname fail" + e18, new java.lang.Object[0]);
                        if (sQLiteDatabase != null) {
                            try {
                                sQLiteDatabase.endTransaction();
                            } catch (java.lang.Exception e19) {
                                or5.b.b("db end transaction error " + e19, new java.lang.Object[0]);
                            }
                        }
                    }
                } catch (java.lang.Throwable th6) {
                    if (sQLiteDatabase != null) {
                        try {
                            sQLiteDatabase.endTransaction();
                        } catch (java.lang.Exception e27) {
                            or5.b.b("db end transaction error " + e27, new java.lang.Object[0]);
                        }
                    }
                    throw th6;
                }
            }
        }
    }

    public final android.database.sqlite.SQLiteDatabase b() {
        if (this.f521351d == null) {
            try {
                this.f521351d = getWritableDatabase();
            } catch (java.lang.Exception e17) {
                or5.b.b("get db error " + e17, new java.lang.Object[0]);
            }
        }
        return this.f521351d;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE lookupDB (host TEXT PRIMARY KEY,result TEXT)");
        } catch (java.lang.Exception e17) {
            or5.b.b("create db fail " + e17, new java.lang.Object[0]);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i17, int i18) {
        if (i17 != i18) {
            try {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS lookupDB");
                onCreate(sQLiteDatabase);
            } catch (java.lang.Exception e17) {
                or5.b.b("upgrade db fail " + e17, new java.lang.Object[0]);
            }
        }
    }
}
