package com.tencent.mm.plugin.appbrand.jsapi.coverview;

/* loaded from: classes7.dex */
public class a0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c01.l2 f80669d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.t f80670e;

    public a0(com.tencent.mm.plugin.appbrand.jsapi.coverview.e0 e0Var, c01.l2 l2Var, com.tencent.mm.plugin.appbrand.jsapi.t tVar) {
        this.f80669d = l2Var;
        this.f80670e = tVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/jsapi/coverview/JsApiInsertTextView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        c01.l2 l2Var = this.f80669d;
        if (!l2Var.g("clickable")) {
            yj0.a.h(this, "com/tencent/mm/plugin/appbrand/jsapi/coverview/JsApiInsertTextView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertTextView", "onClick");
        com.tencent.mm.plugin.appbrand.jsapi.n5 c0Var = new com.tencent.mm.plugin.appbrand.jsapi.coverview.c0(null);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, l2Var.f(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, ""));
        c0Var.t(hashMap);
        boolean equals = "webview".equals(l2Var.f("sendTo", null));
        com.tencent.mm.plugin.appbrand.jsapi.t tVar = this.f80670e;
        if (equals) {
            tVar.p(c0Var);
        } else {
            tVar.i(c0Var, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/jsapi/coverview/JsApiInsertTextView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
