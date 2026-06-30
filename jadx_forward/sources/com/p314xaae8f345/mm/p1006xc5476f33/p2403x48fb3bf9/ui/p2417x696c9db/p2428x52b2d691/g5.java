package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class g5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f267647d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.k f267648e;

    public g5(java.lang.String str, nw4.k kVar) {
        this.f267647d = str;
        this.f267648e = kVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiHandleMPPageAction$showNavShadow$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.HashMap hashMap = new java.util.HashMap(1);
        hashMap.put("traceId", this.f267647d);
        nw4.g gVar = this.f267648e.f422396d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(gVar, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.jsapi.JsApiHandler");
        ((nw4.n) gVar).o("onNavShadowClick", hashMap);
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiHandleMPPageAction$showNavShadow$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
