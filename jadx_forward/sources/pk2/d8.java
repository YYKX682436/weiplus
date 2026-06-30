package pk2;

/* loaded from: classes3.dex */
public final class d8 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f437189h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f437190i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d8(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f437189h = helper.f437623j;
        this.f437190i = "anchorlive.more.sharemoments";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        pk2.g8 g8Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        boolean E = E();
        java.lang.String str = o9Var.f437605a;
        if (E) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "share2SNS is disabled");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "share2SNS isLandscape:" + o9Var.h());
        if (!o9Var.h() || ((com.p314xaae8f345.mm.ui.bk.A() && !com.p314xaae8f345.mm.ui.bk.Q()) || zl2.r4.f555483a.x1())) {
            D(o9Var);
        } else {
            pk2.d9 d9Var = o9Var.f437615f;
            if (d9Var != null && (g8Var = d9Var.f437191a) != null) {
                ((pk2.k9) g8Var).b(new pk2.c8(this, o9Var));
            }
        }
        zl2.r4 r4Var = zl2.r4.f555483a;
        boolean w17 = r4Var.w1();
        pk2.o9 o9Var2 = this.f445960a;
        if (w17) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.T8((zy2.zb) c17, ml2.t1.f409497m, r4Var.l(o9Var2.f437607b), null, null, null, null, false, 124, null);
        } else {
            i95.m c18 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            zy2.zb.T8((zy2.zb) c18, ml2.t1.f409497m, r4Var.l(o9Var2.f437607b), null, null, null, null, false, 124, null);
        }
        i95.m c19 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
        zy2.zb.I8((zy2.zb) c19, ml2.u1.f409615s, null, null, null, null, null, false, 126, null);
    }

    public final void D(pk2.o9 o9Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o9Var.f437605a, "share2SNSImpl");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = o9Var.f437611d;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = ((mm2.c1) o9Var.c(mm2.c1.class)).f410379n;
        if (c19792x256d2725 != null) {
            o9Var.k(c19792x256d2725, ((mm2.e1) o9Var.c(mm2.e1.class)).f410521r);
            qe2.a.f(c19792x256d2725, (mm2.n0) o9Var.c(mm2.n0.class));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(c19792x256d2725, 16384);
            a17.m59367x7b6790db(((mm2.c1) o9Var.c(mm2.c1.class)).f410319c3);
            a17.m59422xb121f1ef(zl2.r4.f555483a.Z0());
            i95.m c17 = i95.n0.c(c61.ub.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            c61.ub.I2((c61.ub) c17, abstractActivityC21394xb3d2c0cf, new so2.h1(a17), null, 0, 0, 28, null);
            ((mm2.c1) o9Var.c(mm2.c1.class)).O1 = false;
            df2.od odVar = (df2.od) o9Var.e(df2.od.class);
            if (odVar != null) {
                odVar.e7(r45.n72.kActionType_ShareLive);
            }
        }
    }

    public final boolean E() {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = ((mm2.c1) this.f445960a.c(mm2.c1.class)).f410379n;
        return c19792x256d2725 == null || c19792x256d2725.m76784x5db1b11() == 0 || !hc2.o0.f(c19792x256d2725);
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f437190i;
    }

    @Override // qk2.f
    public boolean o() {
        return zl2.r4.f555483a.n(((mm2.c1) this.f445960a.c(mm2.c1.class)).Q1);
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        boolean E = E();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o9Var.f437605a, "share2Sns is disabled:" + E);
        int i17 = this.f437189h;
        java.lang.String string = o9Var.f437611d.getResources().getString(E ? com.p314xaae8f345.mm.R.C30867xcad56011.owx : com.p314xaae8f345.mm.R.C30867xcad56011.dye);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        C(menu.j(i17, string, com.p314xaae8f345.mm.R.raw.f78691x7ae93edb, 0, E));
        boolean n17 = n();
        pk2.o9 o9Var2 = this.f445960a;
        if (n17) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.I8((zy2.zb) c17, ml2.u1.f409598n, zl2.r4.f555483a.l(o9Var2.f437607b), null, null, null, null, false, 124, null);
        } else {
            i95.m c18 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            zy2.zb.I8((zy2.zb) c18, ml2.u1.f409598n, zl2.r4.f555483a.l(o9Var2.f437607b), null, null, null, null, false, 124, null);
        }
    }

    @Override // qk2.h
    public boolean x() {
        return !E();
    }

    @Override // qk2.h
    public int y() {
        return this.f437189h;
    }
}
