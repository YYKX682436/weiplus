package com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic;

/* loaded from: classes11.dex */
public final class t0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f256329d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.u0 f256330e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f256331f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f256332g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.u0 u0Var, boolean z18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(0);
        this.f256329d = z17;
        this.f256330e = u0Var;
        this.f256331f = z18;
        this.f256332g = interfaceC29045xdcb5ca57;
    }

    public static final void a(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, boolean z17) {
        try {
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.valueOf(z17)));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TingRadioChannelFloatBallAnimationUIC", e17, "exitWithAnimation exception", new java.lang.Object[0]);
        }
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17 = this.f256329d;
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = this.f256332g;
        if (z17) {
            sl4.a a17 = jm4.t2.a(bw5.eq0.AudioRadio);
            if (a17 == null) {
                a(interfaceC29045xdcb5ca57, false);
            } else if ((a17 instanceof zl4.e) && (a17 instanceof xl4.e)) {
                zl4.e eVar = (zl4.e) a17;
                eVar.i(true);
                eVar.f490797s = false;
                eVar.f174665d.f174591s = false;
                boolean A0 = eVar.A0(true);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingRadioChannelFloatBallAnimationUIC", "exitWithAnimation added: " + A0);
                if (A0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.s0 s0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.s0(interfaceC29045xdcb5ca57, a17);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.u0 u0Var = this.f256330e;
                    if (!u0Var.O6(s0Var)) {
                        if (this.f256331f) {
                            u0Var.m158354x19263085().finish();
                        }
                        a(interfaceC29045xdcb5ca57, false);
                    }
                } else {
                    a(interfaceC29045xdcb5ca57, false);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TingRadioChannelFloatBallAnimationUIC", "exitWithAnimation floatBallHelper invalid");
                a(interfaceC29045xdcb5ca57, false);
            }
        } else {
            a(interfaceC29045xdcb5ca57, false);
        }
        return jz5.f0.f384359a;
    }
}
