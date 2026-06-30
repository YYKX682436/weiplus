package com.tencent.mm.plugin.appbrand.networking;

/* loaded from: classes7.dex */
public final class g0 implements com.tencent.mm.plugin.appbrand.networking.e0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.networking.h0 f86087d;

    public g0(com.tencent.mm.plugin.appbrand.networking.h0 h0Var) {
        this.f86087d = h0Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.networking.e0
    public final void f() {
        com.tencent.mm.plugin.appbrand.e9 C0 = this.f86087d.f86090d.C0();
        java.util.HashMap hashMap = new java.util.HashMap();
        be1.y E = be1.z.E(com.tencent.mm.sdk.platformtools.x2.f193071a);
        hashMap.put("isConnected", java.lang.Boolean.valueOf(E != be1.y.None));
        java.lang.String str = E.f19540d;
        hashMap.put("networkType", str);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandOnNetworkStatusChangeEvent", "networkType = %s", str);
        be1.a aVar = new be1.a();
        aVar.u(C0);
        aVar.t(hashMap);
        aVar.m();
    }
}
