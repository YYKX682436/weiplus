package sy5;

/* loaded from: classes13.dex */
public class d implements io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler {

    /* renamed from: d, reason: collision with root package name */
    public final sy5.a f495434d;

    public d(sy5.a aVar) {
        this.f495434d = aVar;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler
    /* renamed from: onMethodCall */
    public void mo294x9bfdc61e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        if (!"check".equals(c28687x4bb242ff.f71610xbfc5d0e1)) {
            result.mo65719xbc9fa82f();
            return;
        }
        sy5.a aVar = this.f495434d;
        android.net.ConnectivityManager connectivityManager = aVar.f495429a;
        result.mo65720x90b54003(aVar.a(connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())));
    }
}
