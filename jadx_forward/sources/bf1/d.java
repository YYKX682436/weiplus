package bf1;

/* loaded from: classes7.dex */
public final class d implements r9.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s9.h f101113a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s9.h f101114b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bf1.f f101115c;

    public d(s9.h hVar, bf1.f fVar) {
        this.f101114b = hVar;
        this.f101115c = fVar;
        this.f101113a = hVar;
    }

    @Override // r9.k
    public int a(byte[] bArr, int i17, int i18) {
        return this.f101113a.a(bArr, i17, i18);
    }

    @Override // r9.k
    public long b(r9.n nVar) {
        long b17 = this.f101114b.b(nVar);
        android.net.Uri uri = nVar.f474916a;
        java.lang.String uri2 = uri != null ? uri.toString() : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.CancellableCacheLogic", "open#DataSource, url: " + uri2);
        java.util.concurrent.Future future = (java.util.concurrent.Future) p3321xbce91901.jvm.p3324x21ffc6bd.m0.c(this.f101115c.f101119c).remove(uri2);
        if (future != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.CancellableCacheLogic", "open#DataSource, url: " + uri2 + ", cancel cache, success: " + future.cancel(true));
        }
        return b17;
    }

    @Override // r9.k
    /* renamed from: close */
    public void mo10286x5a5ddf8() {
        this.f101113a.mo10286x5a5ddf8();
    }

    @Override // r9.k
    /* renamed from: getUri */
    public android.net.Uri mo10287xb5887636() {
        return this.f101113a.mo10287xb5887636();
    }
}
