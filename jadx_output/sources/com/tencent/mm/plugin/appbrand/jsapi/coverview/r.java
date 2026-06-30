package com.tencent.mm.plugin.appbrand.jsapi.coverview;

/* loaded from: classes7.dex */
public class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c01.l2 f80709d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.t f80710e;

    public r(com.tencent.mm.plugin.appbrand.jsapi.coverview.u uVar, c01.l2 l2Var, com.tencent.mm.plugin.appbrand.jsapi.t tVar) {
        this.f80709d = l2Var;
        this.f80710e = tVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/jsapi/coverview/JsApiInsertImageView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        c01.l2 l2Var = this.f80709d;
        if (!l2Var.g("clickable")) {
            yj0.a.h(this, "com/tencent/mm/plugin/appbrand/jsapi/coverview/JsApiInsertImageView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.n5 tVar = new com.tencent.mm.plugin.appbrand.jsapi.coverview.t(null);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, l2Var.f(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, ""));
        tVar.t(hashMap);
        com.tencent.mm.plugin.appbrand.jsapi.t tVar2 = this.f80710e;
        tVar.p(tVar2);
        if ("webview".equals(l2Var.f("sendTo", null))) {
            tVar2.p(tVar);
        } else {
            tVar2.i(tVar, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/jsapi/coverview/JsApiInsertImageView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
