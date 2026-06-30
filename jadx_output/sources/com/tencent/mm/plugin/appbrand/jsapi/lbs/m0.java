package com.tencent.mm.plugin.appbrand.jsapi.lbs;

/* loaded from: classes13.dex */
public class m0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f81458d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f81459e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f81460f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f81461g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.lbs.v0 f81462h;

    public m0(com.tencent.mm.plugin.appbrand.jsapi.lbs.v0 v0Var, com.tencent.mm.ui.widget.dialog.y1 y1Var, com.tencent.mm.plugin.appbrand.e9 e9Var, java.lang.String str, int i17) {
        this.f81462h = v0Var;
        this.f81458d = y1Var;
        this.f81459e = e9Var;
        this.f81460f = str;
        this.f81461g = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/jsapi/lbs/JsApiOpenMapApp$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f81458d.q();
        com.tencent.mm.plugin.appbrand.jsapi.lbs.v0 v0Var = this.f81462h;
        v0Var.f81503t = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenMapApp", "click tencent map: %s", java.lang.Boolean.valueOf(((java.util.HashMap) v0Var.f81494h).containsKey("com.tencent.map")));
        boolean H = v0Var.H();
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f81459e;
        if (H) {
            if (v0Var.f81498o.containsKey("tencent")) {
                v0Var.f81500q.f144594p = (java.lang.String) v0Var.f81498o.get("tencent");
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenMapApp", "poiid:%s", v0Var.f81500q.f144594p);
            }
            ((za3.d) v0Var.f81502s).g(v0Var.f81500q, v0Var.f81501r, "com.tencent.map", false, false);
        } else {
            v0Var.getClass();
            gw4.f fVar = new gw4.f(e9Var.Z0());
            fVar.f276157b = "mmdownloadapp_JjNedmtv7FDUquSYR5";
            ((fw4.l) ((gw4.g) i95.n0.c(gw4.g.class))).wi(fVar, null);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12809, 25, this.f81460f, "", "", "", 4, java.lang.Integer.valueOf(v0Var.H() ? 1 : 0), e9Var.getAppId());
        com.tencent.mm.plugin.appbrand.jsapi.lbs.v0.E(v0Var, e9Var, this.f81461g, v0Var.o("ok"));
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/jsapi/lbs/JsApiOpenMapApp$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
