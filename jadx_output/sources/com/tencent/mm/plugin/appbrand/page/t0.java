package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class t0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.rd5 f87105d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f87106e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f87107f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader f87108g;

    public t0(com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader appBrandMenuHeader, r45.rd5 rd5Var, com.tencent.mm.plugin.appbrand.o6 o6Var, java.lang.String str) {
        this.f87108g = appBrandMenuHeader;
        this.f87105d = rd5Var;
        this.f87106e = o6Var;
        this.f87107f = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/page/AppBrandMenuHeader$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        l81.b1 b1Var = new l81.b1();
        r45.rd5 rd5Var = this.f87105d;
        b1Var.f317014b = rd5Var.f384746i;
        b1Var.f317022f = rd5Var.f384747m;
        b1Var.f317032k = com.tencent.mm.plugin.appbrand.jsapi.pay.s1.CTRL_INDEX;
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(this.f87108g.getContext(), b1Var);
        com.tencent.mm.plugin.appbrand.report.v0.f(this.f87106e.f74803n, this.f87106e.N2().X1(), this.f87107f, 4, this.f87108g.f86349f ? 2 : 1);
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/page/AppBrandMenuHeader$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
