package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public abstract class d3 implements com.tencent.mm.plugin.appbrand.jsapi.v, com.tencent.mm.plugin.appbrand.jsapi.w {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.dialog.k0 f86511d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f86512e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.page.v5 f86513f;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f86515h;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.page.c3 f86518n;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f86514g = null;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Set f86516i = new java.util.HashSet();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Set f86517m = new java.util.HashSet();

    public d3(com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.util.List list, boolean z17) {
        this.f86512e = v5Var.getAppId();
        this.f86513f = v5Var;
        this.f86515h = list;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(v5Var.getContext(), false, !z17 ? 1 : 0);
        this.f86511d = k0Var;
        xi1.g windowAndroid = v5Var.t3().getWindowAndroid();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageActionSheet", "AppBrandPageActionSheet: width [%d]", java.lang.Integer.valueOf(windowAndroid.getVDisplayMetrics().widthPixels));
        if (windowAndroid.shouldInLargeScreenCompatMode()) {
            k0Var.f211853c2 = (int) (windowAndroid.getVDisplayMetrics().widthPixels * windowAndroid.getScale());
        }
        e(k0Var);
    }

    public static void a(com.tencent.mm.plugin.appbrand.page.d3 d3Var, db5.g4 g4Var, boolean z17) {
        for (com.tencent.mm.plugin.appbrand.menu.u0 u0Var : d3Var.f86515h) {
            if (u0Var != null && u0Var.f85994b == z17) {
                android.content.Context context = d3Var.f86513f.getContext();
                com.tencent.mm.plugin.appbrand.page.v5 v5Var = d3Var.f86513f;
                java.lang.String str = d3Var.f86512e;
                nh1.a aVar = u0Var.f85997e;
                if (!aVar.b(context, v5Var, g4Var, str, u0Var)) {
                    aVar.a(context, v5Var, g4Var, str);
                }
            }
        }
    }

    public static void b(com.tencent.mm.plugin.appbrand.page.d3 d3Var, android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.appbrand.menu.u0 menuInfo;
        boolean z17;
        d3Var.getClass();
        int itemId = menuItem.getItemId();
        java.util.Iterator it = d3Var.f86515h.iterator();
        while (true) {
            if (!it.hasNext()) {
                menuInfo = null;
                break;
            } else {
                menuInfo = (com.tencent.mm.plugin.appbrand.menu.u0) it.next();
                if (menuInfo.f85993a == itemId) {
                    break;
                }
            }
        }
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = d3Var.f86513f;
        android.content.Context context = v5Var.getContext();
        if (menuInfo == null) {
            z17 = false;
        } else {
            menuInfo.f85997e.c(context, v5Var, d3Var.f86512e, menuInfo);
            z17 = true;
        }
        if (z17) {
            com.tencent.mm.plugin.appbrand.page.c3 c3Var = d3Var.f86518n;
            if (c3Var != null) {
                kotlin.jvm.internal.o.g(menuInfo, "menuInfo");
                com.tencent.mm.plugin.appbrand.page.ne neVar = ((com.tencent.mm.plugin.appbrand.page.le) c3Var).f86863a;
                com.tencent.mars.xlog.Log.i(neVar.f86931a, "beforeMenuClick#reportOnActionSheetHideIfNeed");
                neVar.a(3 == menuInfo.f85993a);
            }
            d3Var.f86511d.u();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.v
    public void c() {
        d();
    }

    public final boolean d() {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f86513f;
        try {
            this.f86511d.u();
            v5Var.O(this);
            v5Var.K(this);
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandPageActionSheet", "hide exception = %s", e17);
            return false;
        }
    }

    public void e(com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f86513f;
        android.view.View y27 = v5Var.y2();
        com.tencent.mm.ui.widget.dialog.k0 k0Var2 = this.f86511d;
        if (y27 != null) {
            k0Var2.s(y27, true);
            this.f86514g = y27;
        }
        android.view.View u17 = v5Var.u1();
        if (u17 != null) {
            k0Var2.o(u17);
        }
        k0Var2.f211872n = new com.tencent.mm.plugin.appbrand.page.y2(this);
        k0Var2.f211881s = new com.tencent.mm.plugin.appbrand.page.z2(this);
        k0Var2.f211874o = new com.tencent.mm.plugin.appbrand.page.a3(this);
        k0Var2.f211884v = new com.tencent.mm.plugin.appbrand.page.b3(this);
        if (al1.j0.BLACK == v5Var.t1()) {
            k0Var2.l(android.graphics.Color.parseColor("#000000"));
        }
    }

    public void f(com.tencent.mm.ui.widget.dialog.k0 k0Var) {
    }

    public final boolean g() {
        boolean z17;
        boolean z18;
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f86513f;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f86511d;
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
                    k0Var.d().getDecorView().addOnAttachStateChangeListener(new com.tencent.mm.plugin.appbrand.page.x2(this));
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
                k0Var.d().getDecorView().addOnAttachStateChangeListener(new com.tencent.mm.plugin.appbrand.page.x2(this));
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
                k0Var.d().getDecorView().addOnAttachStateChangeListener(new com.tencent.mm.plugin.appbrand.page.x2(this));
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
            k0Var.d().getDecorView().addOnAttachStateChangeListener(new com.tencent.mm.plugin.appbrand.page.x2(this));
            k0Var.d().setFlags(131072, 131072);
            k0Var.d().setSoftInputMode(48);
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandPageActionSheet", e17, "showActionSheet", new java.lang.Object[0]);
            return false;
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.w
    public void onDestroy() {
        d();
    }
}
