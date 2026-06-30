package com.tencent.mm.plugin.appbrand.jsapi.lbs;

/* loaded from: classes13.dex */
public class h0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f81418d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f81419e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f81420f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.lbs.v0 f81421g;

    public h0(com.tencent.mm.plugin.appbrand.jsapi.lbs.v0 v0Var, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17, com.tencent.mm.ui.widget.dialog.y1 y1Var) {
        this.f81421g = v0Var;
        this.f81418d = e9Var;
        this.f81419e = i17;
        this.f81420f = y1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/jsapi/lbs/JsApiOpenMapApp$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.appbrand.jsapi.lbs.v0 v0Var = this.f81421g;
        com.tencent.mm.plugin.appbrand.jsapi.lbs.v0.E(v0Var, this.f81418d, this.f81419e, v0Var.o("cancel"));
        this.f81420f.q();
        v0Var.f81503t = false;
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/jsapi/lbs/JsApiOpenMapApp$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
