package dev.p3272xc19e574d.p3273x348d9a.p3275xd0d13ae7.p3276x72a369b7;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Ldev/fluttercommunity/plus/patched/connectivity/ConnectivityBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "Lio/flutter/plugin/common/EventChannel$StreamHandler;", "flutter_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: dev.fluttercommunity.plus.patched.connectivity.ConnectivityBroadcastReceiver */
/* loaded from: classes11.dex */
public final class C28214x10e3f0b9 extends android.content.BroadcastReceiver implements io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.StreamHandler {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f310948h = 0;

    /* renamed from: d, reason: collision with root package name */
    public final vy5.a f310949d;

    /* renamed from: e, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f310950e;

    /* renamed from: f, reason: collision with root package name */
    public io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.EventSink f310951f;

    /* renamed from: g, reason: collision with root package name */
    public android.net.ConnectivityManager.NetworkCallback f310952g;

    public C28214x10e3f0b9(android.content.Context context, vy5.a connectivity, p3325xe03a0797.p3326xc267989b.y0 coroutineScope) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(connectivity, "connectivity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coroutineScope, "coroutineScope");
        this.f310949d = connectivity;
        this.f310950e = coroutineScope;
    }

    public final void a(java.util.List list) {
        p3325xe03a0797.p3326xc267989b.l.d(this.f310950e, null, null, new vy5.d(list, this, null), 3, null);
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.StreamHandler
    /* renamed from: onCancel */
    public void mo14279x3d6f0539(java.lang.Object obj) {
        android.net.ConnectivityManager.NetworkCallback networkCallback = this.f310952g;
        if (networkCallback != null) {
            android.net.ConnectivityManager connectivityManager = this.f310949d.f523048a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(networkCallback);
            connectivityManager.unregisterNetworkCallback(networkCallback);
            this.f310952g = null;
        }
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.StreamHandler
    /* renamed from: onListen */
    public void mo14280x4d3de486(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.EventSink eventSink) {
        this.f310951f = eventSink;
        vy5.b bVar = new vy5.b(this);
        this.f310952g = bVar;
        vy5.a aVar = this.f310949d;
        aVar.f523048a.registerDefaultNetworkCallback(bVar);
        a(aVar.b());
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.EventSink eventSink = this.f310951f;
        if (eventSink != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eventSink);
            eventSink.mo138418x90b54003(this.f310949d.b());
        }
    }
}
