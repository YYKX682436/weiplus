package com.tencent.mm.plugin.appbrand.jsapi.lbs;

/* loaded from: classes13.dex */
public class l0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f81452d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f81453e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f81454f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f81455g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.lbs.v0 f81456h;

    public l0(com.tencent.mm.plugin.appbrand.jsapi.lbs.v0 v0Var, java.lang.String str, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17, com.tencent.mm.ui.widget.dialog.y1 y1Var) {
        this.f81456h = v0Var;
        this.f81452d = str;
        this.f81453e = e9Var;
        this.f81454f = i17;
        this.f81455g = y1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/jsapi/lbs/JsApiOpenMapApp$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.appbrand.jsapi.lbs.v0 v0Var = this.f81456h;
        if (v0Var.f81498o.containsKey(v0Var.f81497n)) {
            v0Var.f81500q.f144594p = (java.lang.String) v0Var.f81498o.get(v0Var.f81497n);
            java.lang.String str = v0Var.f81497n;
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenMapApp", "app: %s, poiId:%s", str, v0Var.f81498o.get(str));
        }
        ((za3.d) v0Var.f81502s).g(v0Var.f81500q, v0Var.f81501r, this.f81452d, false, false);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.util.HashMap hashMap = (java.util.HashMap) v0Var.f81494h;
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f81453e;
        g0Var.d(12809, 25, hashMap.get(this.f81452d), "", "", "", 4, java.lang.Integer.valueOf(v0Var.H() ? 1 : 0), e9Var.getAppId());
        com.tencent.mm.plugin.appbrand.jsapi.lbs.v0.E(v0Var, e9Var, this.f81454f, v0Var.o("ok"));
        this.f81455g.q();
        v0Var.f81503t = false;
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/jsapi/lbs/JsApiOpenMapApp$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
