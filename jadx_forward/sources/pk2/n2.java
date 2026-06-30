package pk2;

/* loaded from: classes3.dex */
public final class n2 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f437559h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f437560i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f437559h = helper.f437637q;
        this.f437560i = n() ? "anchorlive.more.silent" : "startlive.more.silent";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        boolean n17 = n();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = o9Var.f437611d;
        if (n17) {
            if (((mm2.c1) o9Var.c(mm2.c1.class)).O4) {
                db5.t7.h(abstractActivityC21394xb3d2c0cf, abstractActivityC21394xb3d2c0cf.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d4e));
                i95.m c17 = i95.n0.c(ml2.j0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                zy2.zb.T8((zy2.zb) c17, ml2.t1.f409532x, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f409449f), null, null, null, null, false, 124, null);
                i95.m c18 = i95.n0.c(ml2.j0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                zy2.zb.y6((zy2.zb) c18, ml2.z4.D, "2", null, 4, null);
            } else {
                i95.m c19 = i95.n0.c(ml2.j0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
                zy2.zb.y6((zy2.zb) c19, ml2.z4.D, "1", null, 4, null);
                db5.t7.h(abstractActivityC21394xb3d2c0cf, abstractActivityC21394xb3d2c0cf.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572993d52));
                i95.m c27 = i95.n0.c(ml2.j0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c27, "getService(...)");
                zy2.zb.T8((zy2.zb) c27, ml2.t1.f409529w, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f409449f), null, null, null, null, false, 124, null);
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("PARAM_FINDER_LIVE_IS_MUTE_MIC", !((mm2.c1) o9Var.c(mm2.c1.class)).O4);
            o9Var.j(qo0.b.f446934p4, bundle);
            return;
        }
        zl2.r4 r4Var = zl2.r4.f555483a;
        gk2.e eVar = o9Var.f437607b;
        if (eVar != null && ((mm2.c1) eVar.a(mm2.c1.class)).O4) {
            i95.m c28 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c28, "getService(...)");
            zy2.zb.T8((zy2.zb) c28, ml2.t1.f409532x, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f409448e), null, null, null, null, false, 124, null);
            r4Var.A2(eVar, abstractActivityC21394xb3d2c0cf, false);
            i95.m c29 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c29, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c29;
            ml2.c1 c1Var = ml2.c1.f408858e;
            zy2.zb.j5(zbVar, 22L, "2", null, 4, null);
            return;
        }
        i95.m c37 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c37, "getService(...)");
        zy2.zb.T8((zy2.zb) c37, ml2.t1.f409529w, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f409448e), null, null, null, null, false, 124, null);
        r4Var.A2(eVar, abstractActivityC21394xb3d2c0cf, true);
        i95.m c38 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c38, "getService(...)");
        zy2.zb zbVar2 = (zy2.zb) c38;
        ml2.c1 c1Var2 = ml2.c1.f408858e;
        zy2.zb.j5(zbVar2, 22L, "1", null, 4, null);
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f437560i;
    }

    @Override // qk2.f
    public boolean o() {
        return true;
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        java.lang.String string;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        zl2.r4 r4Var = zl2.r4.f555483a;
        if (r4Var.w1() && !r4Var.x1()) {
            return;
        }
        boolean n17 = n();
        int i17 = com.p314xaae8f345.mm.R.raw.f80168x53dab22f;
        if (!n17) {
            if (r4Var.T1((r45.q12) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) this.f445960a.c(mm2.g1.class)).f410601f).mo144003x754a37bb())) {
                return;
            }
            gk2.e eVar = o9Var.f437607b;
            boolean z17 = eVar != null && ((mm2.c1) eVar.a(mm2.c1.class)).O4;
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = o9Var.f437611d;
            if (z17) {
                string = abstractActivityC21394xb3d2c0cf.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dwx);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                i95.m c17 = i95.n0.c(ml2.j0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                zy2.zb.I8((zy2.zb) c17, ml2.u1.C, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f409448e), null, null, null, null, false, 124, null);
            } else {
                string = abstractActivityC21394xb3d2c0cf.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dxy);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                i95.m c18 = i95.n0.c(ml2.j0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                zy2.zb.I8((zy2.zb) c18, ml2.u1.A, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f409448e), null, null, null, null, false, 124, null);
                i17 = com.p314xaae8f345.mm.R.raw.f80167x277b931f;
            }
            s(menu, o9Var.f437637q, string, i17);
            return;
        }
        if (!((mm2.c1) o9Var.c(mm2.c1.class)).f410311a5 || ((mm2.e1) o9Var.c(mm2.e1.class)).f7()) {
            if (sn0.b.f491497e2 != null) {
                return;
            }
            boolean z18 = ((mm2.c1) o9Var.c(mm2.c1.class)).O4;
            int i18 = this.f437559h;
            if (z18) {
                java.lang.String string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dwx);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                s(menu, i18, string2, com.p314xaae8f345.mm.R.raw.f80168x53dab22f);
                i95.m c19 = i95.n0.c(ml2.j0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
                zy2.zb.I8((zy2.zb) c19, ml2.u1.C, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f409449f), null, null, null, null, false, 124, null);
                return;
            }
            java.lang.String string3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dxy);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
            s(menu, i18, string3, com.p314xaae8f345.mm.R.raw.f80167x277b931f);
            i95.m c27 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c27, "getService(...)");
            zy2.zb.I8((zy2.zb) c27, ml2.u1.A, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f409449f), null, null, null, null, false, 124, null);
        }
    }

    @Override // qk2.h
    public int y() {
        return this.f437559h;
    }
}
