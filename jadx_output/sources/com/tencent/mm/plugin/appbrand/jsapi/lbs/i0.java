package com.tencent.mm.plugin.appbrand.jsapi.lbs;

/* loaded from: classes13.dex */
public class i0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f81424d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f81425e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f81426f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f81427g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f81428h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.lbs.v0 f81429i;

    public i0(com.tencent.mm.plugin.appbrand.jsapi.lbs.v0 v0Var, android.widget.TextView textView, android.widget.LinearLayout linearLayout, com.tencent.mm.plugin.appbrand.e9 e9Var, com.tencent.mm.ui.widget.dialog.y1 y1Var, int i17) {
        this.f81429i = v0Var;
        this.f81424d = textView;
        this.f81425e = linearLayout;
        this.f81426f = e9Var;
        this.f81427g = y1Var;
        this.f81428h = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/jsapi/lbs/JsApiOpenMapApp$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f81424d.setVisibility(8);
        android.widget.LinearLayout linearLayout = this.f81425e;
        linearLayout.removeAllViews();
        com.tencent.mm.plugin.appbrand.jsapi.lbs.v0 v0Var = this.f81429i;
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f81426f;
        v0Var.I(e9Var, this.f81427g, linearLayout, this.f81428h);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12809, 22, "", "", "", "", 4, java.lang.Integer.valueOf(v0Var.H() ? 1 : 0), e9Var.getAppId());
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/jsapi/lbs/JsApiOpenMapApp$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
