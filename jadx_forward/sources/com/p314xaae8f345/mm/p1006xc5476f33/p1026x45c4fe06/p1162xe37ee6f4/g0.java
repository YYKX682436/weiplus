package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4;

/* loaded from: classes7.dex */
public final class g0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.e0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.h0 f167620d;

    public g0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.h0 h0Var) {
        this.f167620d = h0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.e0
    public final void f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 C0 = this.f167620d.f167623d.C0();
        java.util.HashMap hashMap = new java.util.HashMap();
        be1.y E = be1.z.E(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        hashMap.put("isConnected", java.lang.Boolean.valueOf(E != be1.y.None));
        java.lang.String str = E.f101073d;
        hashMap.put("networkType", str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandOnNetworkStatusChangeEvent", "networkType = %s", str);
        be1.a aVar = new be1.a();
        aVar.u(C0);
        aVar.t(hashMap);
        aVar.m();
    }
}
