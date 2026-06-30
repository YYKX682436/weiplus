package xt2;

/* loaded from: classes3.dex */
public final class c4 implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xt2.b5 f538195a;

    public c4(xt2.b5 b5Var) {
        this.f538195a = b5Var;
    }

    @Override // al5.c2
    /* renamed from: onStatusChange */
    public final void mo2289xd6191dc1(boolean z17) {
        xt2.b5 b5Var = this.f538195a;
        xt2.b4 b4Var = new xt2.b4(b5Var);
        b5Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        p3325xe03a0797.p3326xc267989b.i2 i2Var = p3325xe03a0797.p3326xc267989b.i2.f392010d;
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.r2 d17 = p3325xe03a0797.p3326xc267989b.l.d(i2Var, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new xt2.x4(h0Var, b5Var, null), 2, null);
        dk2.ef efVar = dk2.ef.f314905a;
        gk2.e eVar = b5Var.f538170i;
        dk2.xf k17 = efVar.k(eVar);
        if (k17 != null) {
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = b5Var.f538169h;
            long m75942xfb822ef2 = ((mm2.e1) eVar.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
            long j17 = ((mm2.e1) eVar.a(mm2.e1.class)).f410516m;
            java.lang.String str = ((mm2.c1) eVar.a(mm2.c1.class)).f410385o;
            r45.hx0 hx0Var = new r45.hx0();
            r45.vv2 vv2Var = new r45.vv2();
            vv2Var.set(0, java.lang.Integer.valueOf(z17 ? 1 : 0));
            hx0Var.set(1, hc2.b.a(vv2Var));
            hx0Var.set(0, 112);
            ((dk2.r4) k17).a0(abstractActivityC21394xb3d2c0cf, m75942xfb822ef2, j17, str, hx0Var, new xt2.w4(d17, h0Var, b4Var, z17));
        }
    }
}
