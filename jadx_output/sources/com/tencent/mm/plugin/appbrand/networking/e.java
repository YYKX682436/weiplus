package com.tencent.mm.plugin.appbrand.networking;

/* loaded from: classes7.dex */
public final class e implements hm0.w {
    @Override // hm0.w
    public void onNetworkChange(int i17) {
        if (gm0.j1.a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWeakNetReceiver.MMReceiver", "mmNetEventReceiver.onNetworkChange(status:" + i17 + ')');
            com.tencent.mm.plugin.appbrand.networking.h.f86089b = i17;
            int a17 = com.tencent.mm.plugin.appbrand.networking.h.a();
            com.tencent.mm.plugin.appbrand.task.u0.f89199h.a().N(new com.tencent.mm.plugin.appbrand.networking.g(a17 != 4, a17));
        }
    }
}
