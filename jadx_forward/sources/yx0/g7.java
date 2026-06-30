package yx0;

/* loaded from: classes5.dex */
public final class g7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356 f548872d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f548873e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f548874f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a f548875g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f548876h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yx0.o f548877i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7(com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356 c4116xf4b2c356, yx0.b8 b8Var, yz5.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a, yz5.l lVar2, yx0.o oVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f548872d = c4116xf4b2c356;
        this.f548873e = b8Var;
        this.f548874f = lVar;
        this.f548875g = c16997xb0aa383a;
        this.f548876h = lVar2;
        this.f548877i = oVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yx0.g7(this.f548872d, this.f548873e, this.f548874f, this.f548875g, this.f548876h, this.f548877i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.g7) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.String m33856x92013dca = this.f548872d.m33856x92013dca();
        com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4012xe1ac9984 c4012xe1ac9984 = this.f548873e.T;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m33856x92013dca, c4012xe1ac9984 != null ? c4012xe1ac9984.m32610x92013dca() : null);
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (b17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShootComposingCorePlugin", "switchMusic >> musicSelected.");
            yz5.l lVar = this.f548874f;
            if (lVar != null) {
                lVar.mo146xb9724478(java.lang.Boolean.TRUE);
            }
            return f0Var;
        }
        switch (this.f548873e.f548725s.ordinal()) {
            case 0:
            case 1:
            case 3:
            case 4:
            case 5:
            case 6:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShootComposingCorePlugin", "switchMusic >> but state is " + this.f548873e.f548725s);
                yz5.l lVar2 = this.f548874f;
                if (lVar2 != null) {
                    lVar2.mo146xb9724478(java.lang.Boolean.FALSE);
                }
                return f0Var;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                p3325xe03a0797.p3326xc267989b.l.f(null, new yx0.c7(this.f548873e, null), 1, null);
                break;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        h0Var.f391656d = this.f548872d.m33856x92013dca();
        this.f548873e.q0(yx0.v.f549233n);
        yx0.b8 b8Var = this.f548873e;
        b8Var.f548727u = p3325xe03a0797.p3326xc267989b.l.d(b8Var.L, null, null, new yx0.f7(this.f548875g, b8Var, this.f548872d, h0Var, this.f548874f, this.f548876h, this.f548877i, null), 3, null);
        return f0Var;
    }
}
