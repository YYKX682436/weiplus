package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public abstract class d3 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.w {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f168044d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f168045e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f168046f;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f168048h;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.c3 f168051n;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f168047g = null;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Set f168049i = new java.util.HashSet();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Set f168050m = new java.util.HashSet();

    public d3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, java.util.List list, boolean z17) {
        this.f168045e = v5Var.mo48798x74292566();
        this.f168046f = v5Var;
        this.f168048h = list;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(v5Var.mo50352x76847179(), false, !z17 ? 1 : 0);
        this.f168044d = k0Var;
        xi1.g mo48803xee5260a9 = v5Var.t3().mo48803xee5260a9();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPageActionSheet", "AppBrandPageActionSheet: width [%d]", java.lang.Integer.valueOf(mo48803xee5260a9.mo48807xad90d981().widthPixels));
        if (mo48803xee5260a9.mo51620x1ab1e3d4()) {
            k0Var.f293386c2 = (int) (mo48803xee5260a9.mo48807xad90d981().widthPixels * mo48803xee5260a9.mo51614x7520af94());
        }
        e(k0Var);
    }

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d3 d3Var, db5.g4 g4Var, boolean z17) {
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.u0 u0Var : d3Var.f168048h) {
            if (u0Var != null && u0Var.f167527b == z17) {
                android.content.Context mo50352x76847179 = d3Var.f168046f.mo50352x76847179();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = d3Var.f168046f;
                java.lang.String str = d3Var.f168045e;
                nh1.a aVar = u0Var.f167530e;
                if (!aVar.b(mo50352x76847179, v5Var, g4Var, str, u0Var)) {
                    aVar.a(mo50352x76847179, v5Var, g4Var, str);
                }
            }
        }
    }

    public static void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d3 d3Var, android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.u0 menuInfo;
        boolean z17;
        d3Var.getClass();
        int itemId = menuItem.getItemId();
        java.util.Iterator it = d3Var.f168048h.iterator();
        while (true) {
            if (!it.hasNext()) {
                menuInfo = null;
                break;
            } else {
                menuInfo = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.u0) it.next();
                if (menuInfo.f167526a == itemId) {
                    break;
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = d3Var.f168046f;
        android.content.Context mo50352x76847179 = v5Var.mo50352x76847179();
        if (menuInfo == null) {
            z17 = false;
        } else {
            menuInfo.f167530e.c(mo50352x76847179, v5Var, d3Var.f168045e, menuInfo);
            z17 = true;
        }
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.c3 c3Var = d3Var.f168051n;
            if (c3Var != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuInfo, "menuInfo");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ne neVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.le) c3Var).f168396a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(neVar.f168464a, "beforeMenuClick#reportOnActionSheetHideIfNeed");
                neVar.a(3 == menuInfo.f167526a);
            }
            d3Var.f168044d.u();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v
    public void c() {
        d();
    }

    public final boolean d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f168046f;
        try {
            this.f168044d.u();
            v5Var.O(this);
            v5Var.K(this);
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandPageActionSheet", "hide exception = %s", e17);
            return false;
        }
    }

    public void e(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f168046f;
        android.view.View y27 = v5Var.y2();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2 = this.f168044d;
        if (y27 != null) {
            k0Var2.s(y27, true);
            this.f168047g = y27;
        }
        android.view.View u17 = v5Var.u1();
        if (u17 != null) {
            k0Var2.o(u17);
        }
        k0Var2.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.y2(this);
        k0Var2.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.z2(this);
        k0Var2.f293407o = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.a3(this);
        k0Var2.f293417v = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.b3(this);
        if (al1.j0.BLACK == v5Var.t1()) {
            k0Var2.l(android.graphics.Color.parseColor("#000000"));
        }
    }

    public void f(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var) {
    }

    public final boolean g() {
        boolean z17;
        boolean z18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f168046f;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = this.f168044d;
        try {
            if (!v5Var.S() && !v5Var.k2()) {
                z17 = false;
                k0Var.T1 = z17;
                if (!v5Var.S() && !v5Var.k2()) {
                    z18 = false;
                    k0Var.X1 = z18;
                    f(k0Var);
                    k0Var.v();
                    v5Var.R(this);
                    v5Var.w(this);
                    k0Var.d().getDecorView().addOnAttachStateChangeListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.x2(this));
                    k0Var.d().setFlags(131072, 131072);
                    k0Var.d().setSoftInputMode(48);
                    return true;
                }
                z18 = true;
                k0Var.X1 = z18;
                f(k0Var);
                k0Var.v();
                v5Var.R(this);
                v5Var.w(this);
                k0Var.d().getDecorView().addOnAttachStateChangeListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.x2(this));
                k0Var.d().setFlags(131072, 131072);
                k0Var.d().setSoftInputMode(48);
                return true;
            }
            z17 = true;
            k0Var.T1 = z17;
            if (!v5Var.S()) {
                z18 = false;
                k0Var.X1 = z18;
                f(k0Var);
                k0Var.v();
                v5Var.R(this);
                v5Var.w(this);
                k0Var.d().getDecorView().addOnAttachStateChangeListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.x2(this));
                k0Var.d().setFlags(131072, 131072);
                k0Var.d().setSoftInputMode(48);
                return true;
            }
            z18 = true;
            k0Var.X1 = z18;
            f(k0Var);
            k0Var.v();
            v5Var.R(this);
            v5Var.w(this);
            k0Var.d().getDecorView().addOnAttachStateChangeListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.x2(this));
            k0Var.d().setFlags(131072, 131072);
            k0Var.d().setSoftInputMode(48);
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandPageActionSheet", e17, "showActionSheet", new java.lang.Object[0]);
            return false;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.w
    /* renamed from: onDestroy */
    public void mo32094xac79a11b() {
        d();
    }
}
