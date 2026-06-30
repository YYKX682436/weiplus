package u6;

/* loaded from: classes13.dex */
public abstract class r implements u6.e {

    /* renamed from: d, reason: collision with root package name */
    public final android.net.Uri f506394d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.ContentResolver f506395e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f506396f;

    public r(android.content.ContentResolver contentResolver, android.net.Uri uri) {
        this.f506395e = contentResolver;
        this.f506394d = uri;
    }

    @Override // u6.e
    public t6.a b() {
        return t6.a.LOCAL;
    }

    public abstract void c(java.lang.Object obj);

    @Override // u6.e
    /* renamed from: cancel */
    public void mo751xae7a2e7a() {
    }

    public abstract java.lang.Object d(android.net.Uri uri, android.content.ContentResolver contentResolver);

    @Override // u6.e
    public final void e(com.p147xb1cd08cc.p148x5de23a5.g gVar, u6.d dVar) {
        try {
            java.lang.Object d17 = d(this.f506394d, this.f506395e);
            this.f506396f = d17;
            dVar.c(d17);
        } catch (java.io.FileNotFoundException e17) {
            android.util.Log.isLoggable("LocalUriFetcher", 3);
            dVar.d(e17);
        }
    }

    @Override // u6.e
    public void h() {
        java.lang.Object obj = this.f506396f;
        if (obj != null) {
            try {
                c(obj);
            } catch (java.io.IOException unused) {
            }
        }
    }
}
