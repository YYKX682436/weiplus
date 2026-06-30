package io.p3284xd2ae381c.p3310xe3a677a0.p3311x72a369b7.p3312xd0d13ae7;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0001 B\u001f\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u001a\u0010\t\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lio/flutter/plugins/connectivity/patched/PatchedConnectivityBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "Lio/flutter/plugin/common/EventChannel$StreamHandler;", "Ljz5/f0;", "sendEvent", "", "arguments", "Lio/flutter/plugin/common/EventChannel$EventSink;", "events", "onListen", "onCancel", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "onReceive", "Landroid/content/Context;", "Lio/flutter/plugins/connectivity/patched/PatchedConnectivity;", "connectivity", "Lio/flutter/plugins/connectivity/patched/PatchedConnectivity;", "Lkotlinx/coroutines/y0;", "coroutineScope", "Lkotlinx/coroutines/y0;", "", "TAG", "Ljava/lang/String;", "Lio/flutter/plugin/common/EventChannel$EventSink;", "Landroid/net/ConnectivityManager$NetworkCallback;", "networkCallback", "Landroid/net/ConnectivityManager$NetworkCallback;", "<init>", "(Landroid/content/Context;Lio/flutter/plugins/connectivity/patched/PatchedConnectivity;Lkotlinx/coroutines/y0;)V", "Companion", "flutter-lib_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: io.flutter.plugins.connectivity.patched.PatchedConnectivityBroadcastReceiver */
/* loaded from: classes11.dex */
public final class C28751x907cc752 extends android.content.BroadcastReceiver implements io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.StreamHandler {

    /* renamed from: CONNECTIVITY_ACTION */
    public static final java.lang.String f71926x1a5a11be = "android.net.conn.CONNECTIVITY_CHANGE";
    private final java.lang.String TAG;
    private final io.p3284xd2ae381c.p3310xe3a677a0.p3311x72a369b7.p3312xd0d13ae7.C28749xce279e1e connectivity;
    private final android.content.Context context;
    private final p3325xe03a0797.p3326xc267989b.y0 coroutineScope;
    private io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.EventSink events;
    private final android.net.ConnectivityManager.NetworkCallback networkCallback;

    public C28751x907cc752(android.content.Context context, io.p3284xd2ae381c.p3310xe3a677a0.p3311x72a369b7.p3312xd0d13ae7.C28749xce279e1e connectivity, p3325xe03a0797.p3326xc267989b.y0 coroutineScope) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(connectivity, "connectivity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coroutineScope, "coroutineScope");
        this.context = context;
        this.connectivity = connectivity;
        this.coroutineScope = coroutineScope;
        this.TAG = "MicroMsg.PatchedConnectivityBroadcastReceiver";
        this.networkCallback = new android.net.ConnectivityManager.NetworkCallback() { // from class: io.flutter.plugins.connectivity.patched.PatchedConnectivityBroadcastReceiver$networkCallback$1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(android.net.Network network) {
                java.lang.String str;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(network, "network");
                str = io.p3284xd2ae381c.p3310xe3a677a0.p3311x72a369b7.p3312xd0d13ae7.C28751x907cc752.this.TAG;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onAvailable:" + network);
                io.p3284xd2ae381c.p3310xe3a677a0.p3311x72a369b7.p3312xd0d13ae7.C28751x907cc752.this.m138875x2a27f2();
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(android.net.Network network) {
                java.lang.String str;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(network, "network");
                str = io.p3284xd2ae381c.p3310xe3a677a0.p3311x72a369b7.p3312xd0d13ae7.C28751x907cc752.this.TAG;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onLost:" + network);
                io.p3284xd2ae381c.p3310xe3a677a0.p3311x72a369b7.p3312xd0d13ae7.C28751x907cc752.this.m138875x2a27f2();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sendEvent */
    public final void m138875x2a27f2() {
        p3325xe03a0797.p3326xc267989b.l.d(this.coroutineScope, null, null, new io.p3284xd2ae381c.p3310xe3a677a0.p3311x72a369b7.p3312xd0d13ae7.C28753xa9bd95ad(this, null), 3, null);
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.StreamHandler
    /* renamed from: onCancel */
    public void mo14279x3d6f0539(java.lang.Object obj) {
        this.connectivity.getConnectivityManager().unregisterNetworkCallback(this.networkCallback);
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.StreamHandler
    /* renamed from: onListen */
    public void mo14280x4d3de486(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.EventSink events) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(events, "events");
        this.events = events;
        this.connectivity.getConnectivityManager().registerDefaultNetworkCallback(this.networkCallback);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        m138875x2a27f2();
    }
}
