package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes11.dex */
public final class x7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f274624d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f274625e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7(android.content.Context context, p3325xe03a0797.p3326xc267989b.q qVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f274624d = context;
        this.f274625e = qVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.sdk.p2603x2137b148.x7(this.f274624d, this.f274625e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x7 x7Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.x7) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        x7Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.lang.Object systemService = this.f274624d.getSystemService("connectivity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) systemService;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u7 u7Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.u7(this.f274624d, new com.p314xaae8f345.mm.sdk.p2603x2137b148.w7(linkedHashSet), null, 4, null);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        u7Var.f274557c = new com.p314xaae8f345.mm.sdk.p2603x2137b148.v7(java.lang.System.currentTimeMillis(), linkedHashSet, connectivityManager, u7Var, this.f274625e);
        try {
            connectivityManager.requestNetwork(new android.net.NetworkRequest.Builder().addCapability(12).addTransportType(0).build(), u7Var, 200);
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SimCardUtil", "doRequest, requestNetwork fail");
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            ((p3325xe03a0797.p3326xc267989b.r) this.f274625e).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(kz5.p0.f395529d));
        }
        return jz5.f0.f384359a;
    }
}
