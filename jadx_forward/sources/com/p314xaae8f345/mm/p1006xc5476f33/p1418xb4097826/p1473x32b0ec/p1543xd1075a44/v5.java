package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class v5 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d6 f201570a;

    public v5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d6 d6Var) {
        this.f201570a = d6Var;
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d6 d6Var = this.f201570a;
            if (!d6Var.g()) {
                r45.n73 n73Var = (r45.n73) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) d6Var.f199594c.P0(mm2.g1.class)).f410604i).mo144003x754a37bb();
                r45.z53 z53Var = n73Var != null ? (r45.z53) n73Var.m75936x14adae67(1) : null;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.x2 x2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.x2.f184205a;
                cl0.g gVar = new cl0.g();
                gVar.o("result", 2);
                gVar.h("appid", z53Var != null ? z53Var.m75945x2fec8307(0) : null);
                gVar.o("game_type", 2 - (z53Var != null ? z53Var.m75939xb282bd08(13) : 0));
                x2Var.c(22, gVar);
                return;
            }
            r45.xq1 xq1Var = ((mm2.c1) d6Var.f199594c.S0().a(mm2.c1.class)).C2;
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.z4 z4Var = ml2.z4.A1;
            cl0.g gVar2 = new cl0.g();
            gVar2.o("result", 2);
            gVar2.h("appid", xq1Var != null ? xq1Var.m75945x2fec8307(2) : null);
            zl2.r4 r4Var = zl2.r4.f555483a;
            r45.a83 a83Var = ((mm2.c1) d6Var.f199594c.P0(mm2.c1.class)).f410361j6;
            gVar2.o("game_type", r4Var.j3(a83Var != null ? a83Var.m75939xb282bd08(2) : 0));
            zy2.zb.y6(zbVar, z4Var, gVar2.toString(), null, 4, null);
        }
    }
}
