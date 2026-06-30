package com.tencent.mm.plugin.appbrand.menu;

/* loaded from: classes7.dex */
public class j extends nh1.a {

    /* renamed from: b, reason: collision with root package name */
    public static final nh1.e f85972b;

    static {
        nh1.e eVar = new nh1.e();
        f85972b = eVar;
        eVar.a(new com.tencent.mm.plugin.appbrand.menu.devtools.n());
        eVar.a(new com.tencent.mm.plugin.appbrand.menu.devtools.b0());
        eVar.a(new com.tencent.mm.plugin.appbrand.menu.devtools.p0());
        eVar.a(new com.tencent.mm.plugin.appbrand.menu.devtools.o());
        eVar.a(new com.tencent.mm.plugin.appbrand.menu.devtools.c0());
        eVar.a(new com.tencent.mm.plugin.appbrand.menu.devtools.j0());
        eVar.a(new com.tencent.mm.plugin.appbrand.menu.devtools.p());
        eVar.a(new com.tencent.mm.plugin.appbrand.menu.devtools.k0());
        eVar.a(new com.tencent.mm.plugin.appbrand.menu.devtools.l());
        eVar.a(new com.tencent.mm.plugin.appbrand.menu.devtools.k());
        eVar.a(com.tencent.mm.plugin.appbrand.menu.devtools.g0.f85900a);
        eVar.a(com.tencent.mm.plugin.appbrand.menu.devtools.r0.f85921a);
        eVar.a(new com.tencent.mm.plugin.appbrand.menu.devtools.q());
        eVar.a(new jf.j());
        eVar.a(new jf.o());
        eVar.a(new jf.c());
        eVar.a(new com.tencent.mm.plugin.appbrand.menu.devtools.c());
        eVar.a(new com.tencent.mm.plugin.appbrand.menu.devtools.w0());
        eVar.a(new com.tencent.mm.plugin.appbrand.menu.devtools.q0());
        eVar.a(new com.tencent.mm.plugin.appbrand.menu.devtools.o0());
        eVar.a(com.tencent.mm.plugin.appbrand.menu.devtools.g.f85899a);
        eVar.a(new com.tencent.mm.plugin.appbrand.menu.devtools.w());
        eVar.a(new com.tencent.mm.plugin.appbrand.menu.devtools.a());
    }

    public j() {
        super(26);
    }

    @Override // nh1.a
    public void a(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, db5.g4 g4Var, java.lang.String str) {
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = (com.tencent.mm.plugin.appbrand.page.n7) v5Var;
        boolean z17 = false;
        int i17 = 0;
        while (true) {
            java.util.ArrayList arrayList = (java.util.ArrayList) f85972b.f337089a;
            if (i17 >= arrayList.size()) {
                break;
            }
            if (((nh1.b) arrayList.get(i17)).c(context, n7Var, str)) {
                z17 = true;
                break;
            }
            i17++;
        }
        if (z17) {
            g4Var.g(26, context.getString(com.tencent.mm.R.string.f490110l6), com.tencent.mm.R.raw.appbrand_menu_enable_debug);
        }
    }

    @Override // nh1.a
    public void c(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str, com.tencent.mm.plugin.appbrand.menu.u0 u0Var) {
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = (com.tencent.mm.plugin.appbrand.page.n7) v5Var;
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490110l6);
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (z65.c.a()) {
            string = com.tencent.mm.sdk.platformtools.x2.n() ? java.lang.String.format(java.util.Locale.ENGLISH, "%s (%s)", string, "mm") : java.lang.String.format(java.util.Locale.ENGLISH, "%s (%s)", string, bm5.f1.a().substring(com.tencent.mm.sdk.platformtools.x2.f193072b.length()));
        }
        java.lang.String str3 = string;
        nh1.e eVar = f85972b;
        eVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int i17 = 0;
        while (true) {
            java.util.ArrayList arrayList3 = (java.util.ArrayList) eVar.f337089a;
            if (i17 >= arrayList3.size()) {
                break;
            }
            nh1.b bVar = (nh1.b) arrayList3.get(i17);
            if (bVar.c(context, n7Var, str)) {
                arrayList.add(bVar.b(context, n7Var, str));
                arrayList2.add(bVar);
            }
            i17++;
        }
        boolean z17 = n7Var.S() || n7Var.k2();
        xi1.g windowAndroid = n7Var.getWindowAndroid();
        nh1.d dVar = new nh1.d(eVar, arrayList2, context, n7Var, str);
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, false, 0);
        if (windowAndroid.shouldInLargeScreenCompatMode()) {
            k0Var.f211853c2 = (int) (windowAndroid.getVDisplayMetrics().widthPixels * windowAndroid.getScale());
        }
        k0Var.T1 = z17;
        k0Var.X1 = z17;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f488089gx, (android.view.ViewGroup) null);
        if (!android.text.TextUtils.isEmpty(str3)) {
            ((android.widget.TextView) inflate.findViewById(android.R.id.title)).setText(str3);
        }
        nh1.f fVar = new nh1.f(k0Var, dVar);
        android.view.View inflate2 = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f488088gw, (android.view.ViewGroup) null);
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) inflate2.findViewById(com.tencent.mm.R.id.gti);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.GridLayoutManager(context, 3));
        recyclerView.setAdapter(new nh1.j(arrayList, fVar));
        k0Var.o(inflate2);
        k0Var.s(inflate, true);
        k0Var.v();
        com.tencent.mm.plugin.appbrand.report.v0.e(n7Var.getAppId(), n7Var.X1(), 33, "", com.tencent.mm.sdk.platformtools.t8.i1(), 1, 0);
    }
}
