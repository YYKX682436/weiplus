package com.tencent.mm.plugin.appbrand.jsapi.coverview;

/* loaded from: classes15.dex */
public class v implements com.tencent.mm.plugin.appbrand.jsapi.coverview.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.t f80715a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f80716b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f80717c;

    public v(com.tencent.mm.plugin.appbrand.jsapi.coverview.x xVar, com.tencent.mm.plugin.appbrand.jsapi.t tVar, boolean z17, int i17) {
        this.f80715a = tVar;
        this.f80716b = z17;
        this.f80717c = i17;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.coverview.r0
    public void a(android.view.View view, int i17, int i18, int i19, int i27) {
        java.lang.String f17;
        if (view instanceof com.tencent.mm.plugin.appbrand.jsapi.coverview.WxaScrollView) {
            boolean z17 = this.f80716b;
            com.tencent.mm.plugin.appbrand.jsapi.t tVar = this.f80715a;
            c01.l2 b17 = tVar.M(z17).b(this.f80717c, false);
            if (b17 == null || (f17 = b17.f(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, null)) == null) {
                return;
            }
            android.view.ViewGroup targetView = ((com.tencent.mm.plugin.appbrand.jsapi.coverview.WxaScrollView) view).getTargetView();
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, f17);
            hashMap.put("scrollLeft", java.lang.Integer.valueOf(ik1.w.d(i17)));
            hashMap.put("scrollTop", java.lang.Integer.valueOf(ik1.w.d(i18)));
            hashMap.put("scrollWidth", java.lang.Integer.valueOf(ik1.w.d(targetView.getWidth())));
            hashMap.put("scrollHeight", java.lang.Integer.valueOf(ik1.w.d(targetView.getHeight())));
            com.tencent.mm.plugin.appbrand.jsapi.coverview.q0 q0Var = new com.tencent.mm.plugin.appbrand.jsapi.coverview.q0();
            q0Var.t(hashMap);
            tVar.i(q0Var, null);
        }
    }
}
