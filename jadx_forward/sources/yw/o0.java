package yw;

/* loaded from: classes11.dex */
public final class o0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.mm.biz.a1 f547946d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(com.p314xaae8f345.p3133xd0ce8b26.mm.biz.a1 a1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f547946d = a1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yw.o0(this.f547946d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        yw.o0 o0Var = (yw.o0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        o0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        yw.q0 q0Var = yw.q0.f547962a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init finder live dot mode: ");
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.a1 finderLiveInfo = this.f547946d;
        sb6.append(finderLiveInfo.c().name());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFlutterDigestHelper", sb6.toString());
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0 b0Var = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270730a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderLiveInfo, "$finderLiveInfo");
        boolean l17 = b0Var.l(finderLiveInfo);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270735f = finderLiveInfo;
        if (l17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFlutterDigestHelper", "update main session by finder info change");
            yw.q0.b(yw.q0.f547962a, yw.d0.f547829m, null, 2, null);
        }
        return jz5.f0.f384359a;
    }
}
