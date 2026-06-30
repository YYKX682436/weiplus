package p4;

/* loaded from: classes13.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f433278a;

    public c(int i17) {
        this.f433278a = i17;
    }

    public final void a(java.lang.String str) {
        if (!str.equalsIgnoreCase(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26949xb6e0a66f.f58244x57107208) && str.trim().length() != 0) {
            try {
                android.database.sqlite.SQLiteDatabase.deleteDatabase(new java.io.File(str));
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public abstract void b(p4.b bVar, int i17, int i18);
}
