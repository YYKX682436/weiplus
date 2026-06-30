package bf1;

/* loaded from: classes7.dex */
public final class d implements r9.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s9.h f19580a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s9.h f19581b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bf1.f f19582c;

    public d(s9.h hVar, bf1.f fVar) {
        this.f19581b = hVar;
        this.f19582c = fVar;
        this.f19580a = hVar;
    }

    @Override // r9.k
    public int a(byte[] bArr, int i17, int i18) {
        return this.f19580a.a(bArr, i17, i18);
    }

    @Override // r9.k
    public long b(r9.n nVar) {
        long b17 = this.f19581b.b(nVar);
        android.net.Uri uri = nVar.f393383a;
        java.lang.String uri2 = uri != null ? uri.toString() : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.CancellableCacheLogic", "open#DataSource, url: " + uri2);
        java.util.concurrent.Future future = (java.util.concurrent.Future) kotlin.jvm.internal.m0.c(this.f19582c.f19586c).remove(uri2);
        if (future != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.CancellableCacheLogic", "open#DataSource, url: " + uri2 + ", cancel cache, success: " + future.cancel(true));
        }
        return b17;
    }

    @Override // r9.k
    public void close() {
        this.f19580a.close();
    }

    @Override // r9.k
    public android.net.Uri getUri() {
        return this.f19580a.getUri();
    }
}
