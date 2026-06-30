package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* loaded from: classes7.dex */
public class k1 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 295;
    public static final java.lang.String NAME = "operateRecorder";

    /* renamed from: n, reason: collision with root package name */
    public static final java.util.Vector f79240n = new java.util.Vector();

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.audio.j1 f79241g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.page.v5 f79242h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.v0 f79243i;

    /* renamed from: m, reason: collision with root package name */
    public mi1.w0 f79244m;

    public static void C(com.tencent.mm.plugin.appbrand.jsapi.audio.k1 k1Var, boolean z17) {
        k1Var.getClass();
        if (!com.tencent.mm.sdk.platformtools.u3.e()) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.jsapi.audio.g1(k1Var, z17));
            return;
        }
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = k1Var.f79242h;
        if (v5Var == null || v5Var.t3() == null) {
            return;
        }
        if (z17) {
            k1Var.f79244m = mi1.c.a(k1Var.f79242h.t3()).h(mi1.d.VOICE);
            return;
        }
        mi1.w0 w0Var = k1Var.f79244m;
        if (w0Var != null) {
            w0Var.dismiss();
            k1Var.f79244m = null;
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public void A(com.tencent.mm.plugin.appbrand.e9 e9Var, org.json.JSONObject jSONObject, int i17) {
        boolean a17;
        si1.e1.a(e9Var.getAppId(), new com.tencent.mm.plugin.appbrand.jsapi.audio.h1(this, e9Var, jSONObject, i17));
        android.app.Activity activity = e9Var.getContext() instanceof android.app.Activity ? (android.app.Activity) e9Var.getContext() : null;
        if (activity == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Record.JsApiOperateRecorder", "operateRecorder, pageContext is null");
            e9Var.a(i17, o("fail"));
            a17 = false;
        } else {
            a17 = nf.t.a(activity, e9Var, "android.permission.RECORD_AUDIO", 116, "", "");
            if (a17) {
                si1.e1.c(e9Var.getAppId());
            }
        }
        if (!a17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Record.JsApiOperateRecorder", "operateRecorder, requestPermission fail");
            e9Var.a(i17, o("fail:system permission denied"));
            return;
        }
        com.tencent.mm.plugin.appbrand.page.i3 x07 = e9Var.t3().x0();
        if (x07.getCurrentPage() == null || x07.getCurrentPage().getCurrentPageView() == null) {
            e9Var.a(i17, o("fail"));
            return;
        }
        this.f79242h = x07.getCurrentPage().getCurrentPageView();
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Record.JsApiOperateRecorder", "operateRecorder, data is null");
            e9Var.a(i17, o("fail:data is null"));
            return;
        }
        java.lang.String appId = e9Var.getAppId();
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.JsApiOperateRecorder", "operateRecorder appId:%s, data:%s", appId, jSONObject.toString());
        if (this.f79241g == null) {
            this.f79241g = new com.tencent.mm.plugin.appbrand.jsapi.audio.j1(this, e9Var, i17);
        }
        com.tencent.mm.plugin.appbrand.jsapi.audio.j1 j1Var = this.f79241g;
        j1Var.f79223h = i17;
        j1Var.f79225m = appId;
        j1Var.f79226n = jSONObject.toString();
        this.f79241g.f79224i = bm5.f1.a();
        if (this.f79243i == null) {
            this.f79243i = new com.tencent.mm.plugin.appbrand.jsapi.audio.f1(this, appId, e9Var, i17);
        }
        com.tencent.mm.plugin.appbrand.jsapi.audio.j1 j1Var2 = this.f79241g;
        j1Var2.f79219d = this.f79243i;
        j1Var2.c();
    }
}
