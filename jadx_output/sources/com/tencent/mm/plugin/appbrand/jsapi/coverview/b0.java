package com.tencent.mm.plugin.appbrand.jsapi.coverview;

/* loaded from: classes7.dex */
public class b0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c01.l2 f80678d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.t f80679e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f80680f;

    public b0(com.tencent.mm.plugin.appbrand.jsapi.coverview.e0 e0Var, c01.l2 l2Var, com.tencent.mm.plugin.appbrand.jsapi.t tVar, int i17) {
        this.f80678d = l2Var;
        this.f80679e = tVar;
        this.f80680f = i17;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/jsapi/coverview/JsApiInsertTextView$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        c01.l2 l2Var = this.f80678d;
        com.tencent.mm.plugin.appbrand.jsapi.coverview.j.a(this.f80679e, view, this.f80680f, motionEvent, l2Var.f(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, ""), "webview".equals(l2Var.f("sendTo", null)));
        yj0.a.i(true, this, "com/tencent/mm/plugin/appbrand/jsapi/coverview/JsApiInsertTextView$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
