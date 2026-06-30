package u6;

/* loaded from: classes13.dex */
public abstract class b implements u6.e {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f506373d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.res.AssetManager f506374e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f506375f;

    public b(android.content.res.AssetManager assetManager, java.lang.String str) {
        this.f506374e = assetManager;
        this.f506373d = str;
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

    public abstract java.lang.Object d(android.content.res.AssetManager assetManager, java.lang.String str);

    @Override // u6.e
    public void e(com.p147xb1cd08cc.p148x5de23a5.g gVar, u6.d dVar) {
        try {
            java.lang.Object d17 = d(this.f506374e, this.f506373d);
            this.f506375f = d17;
            dVar.c(d17);
        } catch (java.io.IOException e17) {
            android.util.Log.isLoggable("AssetPathFetcher", 3);
            dVar.d(e17);
        }
    }

    @Override // u6.e
    public void h() {
        java.lang.Object obj = this.f506375f;
        if (obj == null) {
            return;
        }
        try {
            c(obj);
        } catch (java.io.IOException unused) {
        }
    }
}
