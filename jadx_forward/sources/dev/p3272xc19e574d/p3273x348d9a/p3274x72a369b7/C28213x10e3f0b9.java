package dev.p3272xc19e574d.p3273x348d9a.p3274x72a369b7;

/* renamed from: dev.fluttercommunity.plus.connectivity.ConnectivityBroadcastReceiver */
/* loaded from: classes13.dex */
public class C28213x10e3f0b9 extends android.content.BroadcastReceiver implements io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.StreamHandler {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f310943h = 0;

    /* renamed from: d, reason: collision with root package name */
    public final sy5.a f310944d;

    /* renamed from: e, reason: collision with root package name */
    public io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.EventSink f310945e;

    /* renamed from: f, reason: collision with root package name */
    public final android.os.Handler f310946f = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: g, reason: collision with root package name */
    public android.net.ConnectivityManager.NetworkCallback f310947g;

    public C28213x10e3f0b9(android.content.Context context, sy5.a aVar) {
        this.f310944d = aVar;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.StreamHandler
    /* renamed from: onCancel */
    public void mo14279x3d6f0539(java.lang.Object obj) {
        android.net.ConnectivityManager.NetworkCallback networkCallback = this.f310947g;
        if (networkCallback != null) {
            this.f310944d.f495429a.unregisterNetworkCallback(networkCallback);
            this.f310947g = null;
        }
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.StreamHandler
    /* renamed from: onListen */
    public void mo14280x4d3de486(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.EventSink eventSink) {
        this.f310945e = eventSink;
        sy5.c cVar = new sy5.c(this);
        this.f310947g = cVar;
        sy5.a aVar = this.f310944d;
        aVar.f495429a.registerDefaultNetworkCallback(cVar);
        android.net.ConnectivityManager connectivityManager = aVar.f495429a;
        this.f310946f.post(new sy5.RunnableC30205x2d1840(this, aVar.a(connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork()))));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.EventSink eventSink = this.f310945e;
        if (eventSink != null) {
            sy5.a aVar = this.f310944d;
            android.net.ConnectivityManager connectivityManager = aVar.f495429a;
            eventSink.mo138418x90b54003(aVar.a(connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())));
        }
    }
}
