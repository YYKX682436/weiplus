package com.tencent.mm.plugin.appbrand.ad.ui;

/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f74942a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.dialog.k0 f74943b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.page.v5 f74944c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f74945d;

    public e(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.util.List list) {
        this.f74942a = context;
        this.f74944c = v5Var;
        this.f74945d = list;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, false, 0);
        this.f74943b = k0Var;
        android.view.View z27 = v5Var.z2(context);
        if (z27 != null) {
            k0Var.s(z27, true);
        }
        k0Var.f211872n = new com.tencent.mm.plugin.appbrand.ad.ui.a(this);
        k0Var.f211881s = new com.tencent.mm.plugin.appbrand.ad.ui.b(this);
        k0Var.f211874o = new com.tencent.mm.plugin.appbrand.ad.ui.c(this);
        k0Var.f211884v = new com.tencent.mm.plugin.appbrand.ad.ui.d(this);
        if (al1.j0.BLACK == v5Var.t1()) {
            k0Var.l(android.graphics.Color.parseColor("#000000"));
        }
    }

    public static void a(com.tencent.mm.plugin.appbrand.ad.ui.e eVar, db5.g4 g4Var, boolean z17) {
        for (com.tencent.mm.plugin.appbrand.menu.u0 u0Var : eVar.f74945d) {
            if (u0Var != null && u0Var.f85994b == z17) {
                com.tencent.mm.plugin.appbrand.page.v5 v5Var = eVar.f74944c;
                u0Var.f85997e.a(eVar.f74942a, v5Var, g4Var, v5Var.getAppId());
            }
        }
    }

    public static void b(com.tencent.mm.plugin.appbrand.ad.ui.e eVar, android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.appbrand.menu.u0 u0Var;
        boolean z17;
        eVar.getClass();
        int itemId = menuItem.getItemId();
        java.util.Iterator it = eVar.f74945d.iterator();
        while (true) {
            if (!it.hasNext()) {
                u0Var = null;
                break;
            } else {
                u0Var = (com.tencent.mm.plugin.appbrand.menu.u0) it.next();
                if (u0Var.f85993a == itemId) {
                    break;
                }
            }
        }
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = eVar.f74944c;
        java.lang.String appId = v5Var.getAppId();
        if (u0Var == null) {
            z17 = false;
        } else {
            u0Var.f85997e.c(eVar.f74942a, v5Var, appId, u0Var);
            z17 = true;
        }
        if (z17) {
            eVar.f74943b.u();
        }
    }
}
