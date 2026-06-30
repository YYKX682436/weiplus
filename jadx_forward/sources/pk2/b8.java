package pk2;

/* loaded from: classes3.dex */
public final class b8 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f437118h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f437118h = "anchorlive.more.sharefriend";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        pk2.c7 c7Var;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var;
        pk2.g8 g8Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        boolean E = E();
        java.lang.String str = o9Var.f437605a;
        if (E) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "share2Friend is disabled");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "share2Friend isLandscape:" + o9Var.h());
        boolean h17 = o9Var.h();
        pk2.d9 d9Var = o9Var.f437615f;
        if (!h17 || ((com.p314xaae8f345.mm.ui.bk.A() && !com.p314xaae8f345.mm.ui.bk.Q()) || zl2.r4.f555483a.x1())) {
            D(o9Var);
            o9Var.j(qo0.b.f446868c3, null);
            if (d9Var != null && (k0Var = d9Var.f437193c) != null) {
                k0Var.u();
            }
            if (d9Var != null && (c7Var = d9Var.f437195e) != null) {
                c7Var.a().h();
            }
        } else {
            o9Var.j(qo0.b.f446868c3, null);
            if (d9Var != null && (g8Var = d9Var.f437191a) != null) {
                ((pk2.k9) g8Var).b(new pk2.z7(this, o9Var));
            }
        }
        zl2.r4 r4Var = zl2.r4.f555483a;
        if (r4Var.w1()) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.T8((zy2.zb) c17, ml2.t1.f409487i, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f409449f), null, null, null, null, false, 124, null);
        } else {
            i95.m c18 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            zy2.zb.T8((zy2.zb) c18, ml2.t1.f409487i, r4Var.l(this.f445960a.f437607b), null, null, null, null, false, 124, null);
        }
        i95.m c19 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
        zy2.zb.I8((zy2.zb) c19, ml2.u1.f409618t, null, null, null, null, null, false, 126, null);
    }

    public final void D(pk2.o9 o9Var) {
        o25.y1 y1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o9Var.f437605a, "share2FriendImpl");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = o9Var.f437611d;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = ((mm2.c1) o9Var.c(mm2.c1.class)).f410379n;
        if (c19792x256d2725 != null) {
            o9Var.k(c19792x256d2725, ((mm2.e1) o9Var.c(mm2.e1.class)).f410521r);
            qe2.a.f(c19792x256d2725, (mm2.n0) o9Var.c(mm2.n0.class));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(c19792x256d2725, 16384);
            a17.m59367x7b6790db(((mm2.c1) o9Var.c(mm2.c1.class)).f410319c3);
            a17.m59422xb121f1ef(zl2.r4.f555483a.Z0());
            android.os.Bundle bundle = new android.os.Bundle();
            pk2.d9 d9Var = o9Var.f437615f;
            bundle.putInt("quick_share_item_count", (d9Var == null || (y1Var = d9Var.f437199i) == null) ? 0 : ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) y1Var).f270255e);
            i95.m c17 = i95.n0.c(c61.ub.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            c61.ub.ah((c61.ub) c17, abstractActivityC21394xb3d2c0cf, a17, bundle, 0, new pk2.a8(o9Var), 8, null);
            ((mm2.c1) o9Var.c(mm2.c1.class)).O1 = false;
        }
    }

    public final boolean E() {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = ((mm2.c1) this.f445960a.c(mm2.c1.class)).f410379n;
        return c19792x256d2725 == null || c19792x256d2725.m76784x5db1b11() == 0 || !hc2.o0.d(c19792x256d2725);
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f437118h;
    }

    @Override // qk2.f
    public boolean o() {
        return zl2.r4.f555483a.n(((mm2.c1) this.f445960a.c(mm2.c1.class)).Q1);
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        int i17 = this.f445961b;
        boolean z17 = i17 == 0 || i17 == 3;
        boolean E = E();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o9Var.f437605a, "share2Friend is disabled:" + E);
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(E ? com.p314xaae8f345.mm.R.C30867xcad56011.owv : com.p314xaae8f345.mm.R.C30867xcad56011.dyd);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        C(menu.j(0, string, com.p314xaae8f345.mm.R.raw.f79181x28396080, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m), E));
        pk2.o9 o9Var2 = this.f445960a;
        if (z17) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.I8((zy2.zb) c17, ml2.u1.f409595m, zl2.r4.f555483a.l(o9Var2.f437607b), null, null, null, null, false, 124, null);
        } else {
            i95.m c18 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            zy2.zb.I8((zy2.zb) c18, ml2.u1.f409595m, zl2.r4.f555483a.l(o9Var2.f437607b), null, null, null, null, false, 124, null);
        }
    }

    @Override // qk2.h
    public boolean x() {
        return !E();
    }

    @Override // qk2.h
    public int y() {
        return 0;
    }
}
