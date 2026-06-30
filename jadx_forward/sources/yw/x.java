package yw;

/* loaded from: classes11.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.mm.biz.a1 f548030d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yw.y f548031e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f548032f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.p314xaae8f345.p3133xd0ce8b26.mm.biz.a1 a1Var, yw.y yVar, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f548030d = a1Var;
        this.f548031e = yVar;
        this.f548032f = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yw.x(this.f548030d, this.f548031e, this.f548032f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yw.x) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.z0 c17;
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.z0 c18;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        boolean p17 = yw.h1.f547865a.p();
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (!p17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AffBizCppToNativeManagerImpl", "on digest finder live info changed, switch is off");
            ((ku5.t0) ku5.t0.f394148d).q(new yw.u(this.f548031e, this.f548032f));
            return f0Var;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0 b0Var = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270730a;
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.a1 a1Var = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270735f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("update finder live dot, current mode: ");
        sb6.append((a1Var == null || (c18 = a1Var.c()) == null) ? null : c18.name());
        sb6.append(", current exportId: ");
        sb6.append(a1Var != null ? a1Var.b() : null);
        sb6.append(", current nickname: ");
        sb6.append(a1Var != null ? a1Var.m118661x8010e5e4() : null);
        sb6.append(", update mode: ");
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.a1 a1Var2 = this.f548030d;
        sb6.append((a1Var2 == null || (c17 = a1Var2.c()) == null) ? null : c17.name());
        sb6.append(", update exportId: ");
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.a1 a1Var3 = this.f548030d;
        sb6.append(a1Var3 != null ? a1Var3.b() : null);
        sb6.append(", update nickname: ");
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.a1 a1Var4 = this.f548030d;
        sb6.append(a1Var4 != null ? a1Var4.m118661x8010e5e4() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AffBizCppToNativeManagerImpl", sb6.toString());
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.a1 a1Var5 = this.f548030d;
        if (a1Var5 == null) {
            a1Var5 = com.p314xaae8f345.p3133xd0ce8b26.mm.biz.a1.f299385h;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a1Var5);
        boolean l17 = b0Var.l(a1Var5);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270735f = this.f548030d;
        if (l17) {
            ((ku5.t0) ku5.t0.f394148d).h(yw.v.f548013d, "BizFlutterDigestHelper");
        }
        ((ku5.t0) ku5.t0.f394148d).q(new yw.w(this.f548031e, this.f548032f));
        return f0Var;
    }
}
