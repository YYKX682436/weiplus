package bf1;

/* loaded from: classes7.dex */
public final class c implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f19576d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f19577e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f19578f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bf1.f f19579g;

    public c(java.lang.String str, long j17, long j18, bf1.f fVar) {
        this.f19576d = str;
        this.f19577e = j17;
        this.f19578f = j18;
        this.f19579g = fVar;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "AppBrandVideoCache#Exo";
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f19576d;
        android.net.Uri parse = android.net.Uri.parse(str);
        java.lang.String f17 = oe1.v1.h().f(str);
        r9.n nVar = new r9.n(parse, this.f19577e, this.f19578f, f17);
        s9.l lVar = new s9.l();
        bf1.f fVar = this.f19579g;
        fVar.f19584a.a(f17, new bf1.b());
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.ExoVideoCacheHandler", "cache, offset:%s, length:%s, url:%s", java.lang.Long.valueOf(this.f19577e), java.lang.Long.valueOf(this.f19578f), str);
            s9.m.a(nVar, fVar.f19584a, fVar.f19585b.createDataSource(), new byte[131072], null, 0, lVar, false);
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SameLayer.ExoVideoCacheHandler", e17, "cache IOException", new java.lang.Object[0]);
        } catch (java.lang.IllegalArgumentException e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SameLayer.ExoVideoCacheHandler", e18, "cache IllegalArgumentException", new java.lang.Object[0]);
        } catch (java.lang.InterruptedException e19) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SameLayer.ExoVideoCacheHandler", e19, "cache InterruptedException", new java.lang.Object[0]);
        } catch (java.lang.Exception e27) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SameLayer.ExoVideoCacheHandler", e27, "cache Exception", new java.lang.Object[0]);
        }
        fVar.f19586c.remove(str);
    }
}
