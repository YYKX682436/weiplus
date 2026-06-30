package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class j1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f79595d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ui1.z f79596e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.h24 f79597f;

    public j1(com.tencent.mm.plugin.appbrand.y yVar, ui1.z zVar, r45.h24 h24Var) {
        this.f79595d = yVar;
        this.f79596e = zVar;
        this.f79597f = h24Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/jsapi/auth/JsApiAuthorize2$requestUserPrompt$2$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String str = this.f79597f.f375780n.f376774e;
        com.tencent.mm.plugin.appbrand.y yVar = this.f79595d;
        this.f79596e.h(yVar, str, (com.tencent.mm.plugin.appbrand.jsapi.r1) yVar.q(com.tencent.mm.plugin.appbrand.jsapi.r1.class)).r(yVar);
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/jsapi/auth/JsApiAuthorize2$requestUserPrompt$2$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
