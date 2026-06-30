package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class r0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.x0 f87048d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.s0 f87049e;

    public r0(com.tencent.mm.plugin.appbrand.page.s0 s0Var, com.tencent.mm.plugin.appbrand.page.x0 x0Var) {
        this.f87049e = s0Var;
        this.f87048d = x0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/page/AppBrandMenuHeader$7$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.appbrand.page.s0 s0Var = this.f87049e;
        com.tencent.mm.plugin.appbrand.page.n7 N2 = s0Var.f87071e.N2();
        if (N2 != null) {
            N2.V3();
        }
        com.tencent.mm.plugin.appbrand.service.c0 service = s0Var.f87071e.C0();
        com.tencent.mm.plugin.appbrand.page.x0 x0Var = this.f87048d;
        int i17 = x0Var.f87240a;
        java.lang.String data = x0Var.f87241b.f373064e;
        kotlin.jvm.internal.o.g(service, "service");
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("MicroMsg.EventOnGameComponentClick", "dispatch bizType:" + i17 + " data:" + data);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("bizType", java.lang.Integer.valueOf(i17));
        hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, data);
        com.tencent.mm.plugin.appbrand.page.cb cbVar = new com.tencent.mm.plugin.appbrand.page.cb();
        cbVar.t(hashMap);
        cbVar.u(service);
        cbVar.m();
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/page/AppBrandMenuHeader$7$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
