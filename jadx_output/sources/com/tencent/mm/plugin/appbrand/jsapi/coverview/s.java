package com.tencent.mm.plugin.appbrand.jsapi.coverview;

/* loaded from: classes7.dex */
public class s implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c01.l2 f80711d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.t f80712e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f80713f;

    public s(com.tencent.mm.plugin.appbrand.jsapi.coverview.u uVar, c01.l2 l2Var, com.tencent.mm.plugin.appbrand.jsapi.t tVar, int i17) {
        this.f80711d = l2Var;
        this.f80712e = tVar;
        this.f80713f = i17;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/jsapi/coverview/JsApiInsertImageView$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        c01.l2 l2Var = this.f80711d;
        com.tencent.mm.plugin.appbrand.jsapi.coverview.j.a(this.f80712e, view, this.f80713f, motionEvent, l2Var.f(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, ""), "webview".equals(l2Var.f("sendTo", null)));
        yj0.a.i(true, this, "com/tencent/mm/plugin/appbrand/jsapi/coverview/JsApiInsertImageView$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
