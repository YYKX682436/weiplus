package q4;

/* loaded from: classes13.dex */
public class c implements p4.b {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f441539e = new java.lang.String[0];

    /* renamed from: d, reason: collision with root package name */
    public final android.database.sqlite.SQLiteDatabase f441540d;

    public c(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        this.f441540d = sQLiteDatabase;
    }

    public void a() {
        this.f441540d.beginTransaction();
    }

    public void b() {
        this.f441540d.endTransaction();
    }

    public void c(java.lang.String str) {
        this.f441540d.execSQL(str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f441540d.close();
    }

    public android.database.Cursor f(java.lang.String str) {
        return i(new p4.a(str));
    }

    public android.database.Cursor i(p4.h hVar) {
        return this.f441540d.rawQueryWithFactory(new q4.a(this, hVar), hVar.a(), f441539e, null);
    }

    public void j() {
        this.f441540d.setTransactionSuccessful();
    }
}
