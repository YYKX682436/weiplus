package com.tencent.mm.plugin.appbrand.jsapi.lbs;

/* loaded from: classes13.dex */
public class n0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f81463d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f81464e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map.Entry f81465f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f81466g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f81467h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f81468i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.lbs.v0 f81469m;

    public n0(com.tencent.mm.plugin.appbrand.jsapi.lbs.v0 v0Var, int i17, java.lang.String str, java.util.Map.Entry entry, com.tencent.mm.plugin.appbrand.e9 e9Var, int i18, com.tencent.mm.ui.widget.dialog.y1 y1Var) {
        this.f81469m = v0Var;
        this.f81463d = i17;
        this.f81464e = str;
        this.f81465f = entry;
        this.f81466g = e9Var;
        this.f81467h = i18;
        this.f81468i = y1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/jsapi/lbs/JsApiOpenMapApp$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.appbrand.jsapi.lbs.v0 v0Var = this.f81469m;
        int size = ((java.util.HashMap) v0Var.f81494h).size();
        java.util.Map.Entry entry = this.f81465f;
        if (this.f81463d < size) {
            java.util.HashMap hashMap = v0Var.f81498o;
            java.lang.String str = this.f81464e;
            if (hashMap.containsKey(str)) {
                v0Var.f81500q.f144594p = (java.lang.String) v0Var.f81498o.get(str);
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenMapApp", "app: %s, poiId:%s", str, v0Var.f81498o.get(str));
            }
            ((za3.d) v0Var.f81502s).g(v0Var.f81500q, v0Var.f81501r, (java.lang.String) entry.getKey(), false, false);
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f81466g;
        g0Var.d(12809, 25, entry.getValue(), "", "", "", 4, java.lang.Integer.valueOf(v0Var.H() ? 1 : 0), e9Var.getAppId());
        com.tencent.mm.plugin.appbrand.jsapi.lbs.v0.E(v0Var, e9Var, this.f81467h, v0Var.o("ok"));
        this.f81468i.q();
        v0Var.f81503t = false;
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/jsapi/lbs/JsApiOpenMapApp$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
