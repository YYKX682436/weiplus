package com.tencent.mm.plugin.appbrand.jsapi.coverview;

/* loaded from: classes7.dex */
public class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c01.l2 f80705d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.t f80706e;

    public p(com.tencent.mm.plugin.appbrand.jsapi.coverview.u uVar, c01.l2 l2Var, com.tencent.mm.plugin.appbrand.jsapi.t tVar) {
        this.f80705d = l2Var;
        this.f80706e = tVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/jsapi/coverview/JsApiInsertImageView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertImageView", "onClick");
        com.tencent.mm.plugin.appbrand.jsapi.n5 tVar = new com.tencent.mm.plugin.appbrand.jsapi.coverview.t(null);
        java.util.HashMap hashMap = new java.util.HashMap();
        c01.l2 l2Var = this.f80705d;
        hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, l2Var.f(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, ""));
        tVar.t(hashMap);
        boolean equals = "webview".equals(l2Var.f("sendTo", null));
        com.tencent.mm.plugin.appbrand.jsapi.t tVar2 = this.f80706e;
        if (equals) {
            tVar2.p(tVar);
        } else {
            tVar2.i(tVar, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/jsapi/coverview/JsApiInsertImageView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
