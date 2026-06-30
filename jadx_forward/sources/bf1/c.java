package bf1;

/* loaded from: classes7.dex */
public final class c implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f101109d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f101110e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f101111f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bf1.f f101112g;

    public c(java.lang.String str, long j17, long j18, bf1.f fVar) {
        this.f101109d = str;
        this.f101110e = j17;
        this.f101111f = j18;
        this.f101112g = fVar;
    }

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "AppBrandVideoCache#Exo";
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f101109d;
        android.net.Uri parse = android.net.Uri.parse(str);
        java.lang.String f17 = oe1.v1.h().f(str);
        r9.n nVar = new r9.n(parse, this.f101110e, this.f101111f, f17);
        s9.l lVar = new s9.l();
        bf1.f fVar = this.f101112g;
        fVar.f101117a.a(f17, new bf1.b());
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.ExoVideoCacheHandler", "cache, offset:%s, length:%s, url:%s", java.lang.Long.valueOf(this.f101110e), java.lang.Long.valueOf(this.f101111f), str);
            s9.m.a(nVar, fVar.f101117a, fVar.f101118b.mo10288xb8a7ce81(), new byte[131072], null, 0, lVar, false);
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SameLayer.ExoVideoCacheHandler", e17, "cache IOException", new java.lang.Object[0]);
        } catch (java.lang.IllegalArgumentException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SameLayer.ExoVideoCacheHandler", e18, "cache IllegalArgumentException", new java.lang.Object[0]);
        } catch (java.lang.InterruptedException e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SameLayer.ExoVideoCacheHandler", e19, "cache InterruptedException", new java.lang.Object[0]);
        } catch (java.lang.Exception e27) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SameLayer.ExoVideoCacheHandler", e27, "cache Exception", new java.lang.Object[0]);
        }
        fVar.f101119c.remove(str);
    }
}
