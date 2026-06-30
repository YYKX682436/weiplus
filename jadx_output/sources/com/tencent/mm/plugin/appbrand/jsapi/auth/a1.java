package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public class a1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ui1.z f79403d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.y0 f79404e;

    public a1(com.tencent.mm.plugin.appbrand.jsapi.auth.y0 y0Var, ui1.z zVar) {
        this.f79404e = y0Var;
        this.f79403d = zVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/jsapi/auth/JsApiAuthorize$AuthorizeTask$5$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.appbrand.jsapi.auth.y0 y0Var = this.f79404e;
        com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize$AuthorizeTask jsApiAuthorize$AuthorizeTask = y0Var.f79792e;
        com.tencent.mm.plugin.appbrand.y yVar = jsApiAuthorize$AuthorizeTask.f79331g;
        this.f79403d.h(yVar, jsApiAuthorize$AuthorizeTask.B, (com.tencent.mm.plugin.appbrand.jsapi.r1) yVar.q(com.tencent.mm.plugin.appbrand.jsapi.r1.class)).r(y0Var.f79792e.f79331g);
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/jsapi/auth/JsApiAuthorize$AuthorizeTask$5$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
