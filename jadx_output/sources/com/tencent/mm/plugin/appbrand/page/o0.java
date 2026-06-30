package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.z1 f86935d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.p0 f86936e;

    public o0(com.tencent.mm.plugin.appbrand.page.p0 p0Var, r45.z1 z1Var) {
        this.f86936e = p0Var;
        this.f86935d = z1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean booleanValue;
        com.tencent.mm.plugin.appbrand.page.p0 p0Var = this.f86936e;
        com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader appBrandMenuHeader = p0Var.f86983e;
        com.tencent.mm.plugin.appbrand.o6 o6Var = p0Var.f86980b;
        r45.z1 z1Var = this.f86935d;
        if (z1Var != null) {
            java.lang.Boolean bool = appBrandMenuHeader.F;
            if (bool != null) {
                booleanValue = bool.booleanValue();
            } else {
                com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader S2 = o6Var.S2(false);
                if (S2 == null) {
                    booleanValue = false;
                } else {
                    java.lang.Boolean valueOf = java.lang.Boolean.valueOf(java.lang.Boolean.parseBoolean(S2.qe("gameComponent")));
                    appBrandMenuHeader.F = valueOf;
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandMenuHeader", "canShowActivityInfo:%b", valueOf);
                    booleanValue = appBrandMenuHeader.F.booleanValue();
                }
            }
            if (booleanValue) {
                appBrandMenuHeader.D.setVisibility(0);
                java.util.LinkedList linkedList = new java.util.LinkedList();
                r45.e70 e70Var = z1Var.f391578d;
                if (e70Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(e70Var.f373063d)) {
                    linkedList.add(new com.tencent.mm.plugin.appbrand.page.x0(1, z1Var.f391578d));
                }
                r45.e70 e70Var2 = z1Var.f391579e;
                if (e70Var2 != null && !com.tencent.mm.sdk.platformtools.t8.K0(e70Var2.f373063d)) {
                    linkedList.add(new com.tencent.mm.plugin.appbrand.page.x0(0, z1Var.f391579e));
                }
                if (!linkedList.isEmpty()) {
                    android.view.View view = appBrandMenuHeader.f86366z;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/page/AppBrandMenuHeader", "showActivityInfo", "(Lcom/tencent/mm/protocal/protobuf/ActivityInfo;Lcom/tencent/mm/plugin/appbrand/AppBrandRuntimeWC;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/appbrand/page/AppBrandMenuHeader", "showActivityInfo", "(Lcom/tencent/mm/protocal/protobuf/ActivityInfo;Lcom/tencent/mm/plugin/appbrand/AppBrandRuntimeWC;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    appBrandMenuHeader.D.N(new com.tencent.mm.plugin.appbrand.page.q0(appBrandMenuHeader, appBrandMenuHeader.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.aih)));
                    appBrandMenuHeader.D.setAdapter(new com.tencent.mm.plugin.appbrand.page.s0(appBrandMenuHeader, linkedList, o6Var));
                    androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(appBrandMenuHeader.f86348e.getContext());
                    linearLayoutManager.Q(1);
                    appBrandMenuHeader.D.setLayoutManager(linearLayoutManager);
                    appBrandMenuHeader.D.setNestedScrollingEnabled(false);
                    appBrandMenuHeader.D.setOverScrollMode(2);
                    return;
                }
            }
        }
        appBrandMenuHeader.D.setVisibility(8);
    }
}
