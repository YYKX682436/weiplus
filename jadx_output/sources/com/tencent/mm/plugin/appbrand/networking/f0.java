package com.tencent.mm.plugin.appbrand.networking;

/* loaded from: classes7.dex */
public final class f0 extends com.tencent.mm.plugin.appbrand.networking.h0 {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f86083f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.networking.NetworkServiceBySystemReceiver$mNetworkStateChangedReceiver$1 f86084g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.tencent.mm.plugin.appbrand.networking.NetworkServiceBySystemReceiver$mNetworkStateChangedReceiver$1] */
    public f0(com.tencent.mm.plugin.appbrand.AppBrandRuntime rt6) {
        super(rt6);
        kotlin.jvm.internal.o.g(rt6, "rt");
        this.f86083f = "Luggage.WXA.NetworkServiceBySystemReceiver";
        this.f86084g = new android.content.BroadcastReceiver() { // from class: com.tencent.mm.plugin.appbrand.networking.NetworkServiceBySystemReceiver$mNetworkStateChangedReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(android.content.Context context, android.content.Intent intent) {
                kotlin.jvm.internal.o.g(context, "context");
                kotlin.jvm.internal.o.g(intent, "intent");
                com.tencent.mm.plugin.appbrand.networking.f0.this.a();
            }
        };
    }

    @Override // com.tencent.mm.plugin.appbrand.networking.h0, lm0.b
    public void b() {
        super.b();
        try {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.d(context);
            context.unregisterReceiver(this.f86084g);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e(this.f86083f, "unregister network receiver, t=" + th6);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.networking.h0, lm0.b
    public void c() {
        super.c();
        try {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.d(context);
            com.tencent.mm.plugin.appbrand.networking.NetworkServiceBySystemReceiver$mNetworkStateChangedReceiver$1 networkServiceBySystemReceiver$mNetworkStateChangedReceiver$1 = this.f86084g;
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            intentFilter.addAction(io.flutter.plugins.connectivity.patched.PatchedConnectivityBroadcastReceiver.CONNECTIVITY_ACTION);
            context.registerReceiver(networkServiceBySystemReceiver$mNetworkStateChangedReceiver$1, intentFilter);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e(this.f86083f, "register network receiver, t=" + th6);
        }
    }
}
