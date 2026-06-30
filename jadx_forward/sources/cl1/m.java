package cl1;

/* loaded from: classes8.dex */
public class m implements cl1.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.C12767x7016a6fb f124419a;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.C12767x7016a6fb c12767x7016a6fb) {
        this.f124419a = c12767x7016a6fb;
    }

    @Override // cl1.k0
    public void a(float f17, float f18) {
    }

    @Override // cl1.k0
    public void b(java.lang.Object obj, int i17) {
        cl1.n0 n0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e4;
        if (obj == null || (c11714x918fd2e4 = (n0Var = (cl1.n0) obj).f124421a) == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDesktopView", "AppBrandDesktopView removeUsage username: %s, versionType: %d", c11714x918fd2e4.f157894d, java.lang.Integer.valueOf(c11714x918fd2e4.f157896f));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.j1 c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.v.f173600a.c();
        if (c17 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e42 = n0Var.f124421a;
            if (c17.x0(c11714x918fd2e42.f157894d, c11714x918fd2e42.f157896f)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.C12767x7016a6fb c12767x7016a6fb = this.f124419a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.C12767x7016a6fb.g1(c12767x7016a6fb, false);
                c12767x7016a6fb.f172615f2.D(false, n0Var, i17, false, 2);
                c12767x7016a6fb.f172632w2 = true;
            }
        }
    }

    @Override // cl1.k0
    public void c(int i17, int i18, java.lang.Object obj) {
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.C12767x7016a6fb.f172613h0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.C12767x7016a6fb c12767x7016a6fb = this.f124419a;
        c12767x7016a6fb.getClass();
        boolean z17 = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDesktopView", "reorderCollection %d", 0);
        if (c12767x7016a6fb.f172616g2.e() == 2) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int i27 = 0;
            while (true) {
                java.util.ArrayList arrayList2 = c12767x7016a6fb.f172617h2;
                if (i27 >= arrayList2.size()) {
                    break;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e4 = ((cl1.n0) arrayList2.get(i27)).f124421a;
                if (c11714x918fd2e4 != null) {
                    arrayList.add(c11714x918fd2e4);
                }
                i27++;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.h a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.v.f173600a.a();
            if (a17 != null && !(z17 = a17.Lg(arrayList, 0))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandDesktopView", "reorederCollection failed, needProcessResult: %b");
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDesktopView", "collection reorderCollection result: %b, startPos: %d, endPos: %d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        cl1.n0 n0Var = (cl1.n0) obj;
        if (i17 != i18) {
            c12767x7016a6fb.f172615f2.b(n0Var.f124421a, i17 - 1, i18 - 1);
        }
        c12767x7016a6fb.k1();
        c12767x7016a6fb.f172632w2 = z17;
    }

    @Override // cl1.k0
    public void d(java.lang.Object obj, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e4;
        if (obj != null && (obj instanceof cl1.n0)) {
            cl1.n0 n0Var = (cl1.n0) obj;
            if (n0Var.f124422b != 2 || (c11714x918fd2e4 = n0Var.f124421a) == null) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDesktopView", "desktop removeCollection %s", c11714x918fd2e4.f157898h);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.h a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.v.f173600a.a();
            if (a17 == null) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e42 = n0Var.f124421a;
            if (a17.nh(c11714x918fd2e42.f157894d, c11714x918fd2e42.f157896f)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.C12767x7016a6fb c12767x7016a6fb = this.f124419a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.C12767x7016a6fb.g1(c12767x7016a6fb, false);
                c12767x7016a6fb.f172615f2.D(false, n0Var, i17, true, 3);
                c12767x7016a6fb.k1();
                c12767x7016a6fb.f172632w2 = true;
            }
        }
    }

    @Override // cl1.k0
    public void e(java.lang.Object obj) {
        if (obj instanceof cl1.n0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.h a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.v.f173600a.a();
            cl1.n0 n0Var = (cl1.n0) obj;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e4 = n0Var.f124421a;
            if (a17 == null || c11714x918fd2e4 == null) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDesktopView", "desktop addCollection %s", c11714x918fd2e4.f157898h);
            int Dc = a17.Dc(c11714x918fd2e4.f157894d, c11714x918fd2e4.f157896f);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.C12767x7016a6fb c12767x7016a6fb = this.f124419a;
            if (Dc == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.C12767x7016a6fb.g1(c12767x7016a6fb, true);
                c12767x7016a6fb.f172615f2.D(true, n0Var, 0, true, 2);
                return;
            }
            if (Dc == -2) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 y17 = db5.e1.y(c12767x7016a6fb.getContext(), c12767x7016a6fb.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571635ky, java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5.class)).y7())), "", c12767x7016a6fb.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1), null);
                if (y17 != null) {
                    y17.o(true);
                    y17.setCanceledOnTouchOutside(false);
                    y17.show();
                    return;
                }
                return;
            }
            if (Dc != -3) {
                dp.a.m125854x26a183b(c12767x7016a6fb.getContext(), c12767x7016a6fb.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571615ke), 0).show();
                return;
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 y18 = db5.e1.y(c12767x7016a6fb.getContext(), c12767x7016a6fb.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571571j6), "", c12767x7016a6fb.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1), null);
            if (y18 != null) {
                y18.o(true);
                y18.setCanceledOnTouchOutside(false);
                y18.show();
            }
        }
    }

    @Override // cl1.k0
    public void f(int i17, boolean z17, boolean z18) {
    }
}
