package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* loaded from: classes7.dex */
public final class d3 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 31;
    public static final java.lang.String NAME = "startRecord";

    /* renamed from: m, reason: collision with root package name */
    public static volatile java.lang.String f79175m;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStartRecordVoice$StartRecordVoice f79176g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.page.v5 f79177h;

    /* renamed from: i, reason: collision with root package name */
    public mi1.w0 f79178i;

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public void A(com.tencent.mm.plugin.appbrand.e9 e9Var, org.json.JSONObject jSONObject, int i17) {
        boolean a17;
        si1.e1.a(e9Var.getAppId(), new com.tencent.mm.plugin.appbrand.jsapi.audio.z2(this, e9Var, jSONObject, i17));
        android.app.Activity activity = e9Var.getContext() instanceof android.app.Activity ? (android.app.Activity) e9Var.getContext() : null;
        if (activity == null) {
            e9Var.a(i17, o("fail"));
            a17 = false;
        } else {
            a17 = nf.t.a(activity, e9Var, "android.permission.RECORD_AUDIO", 116, "", "");
            if (a17) {
                si1.e1.c(e9Var.getAppId());
            }
        }
        if (!a17) {
            e9Var.a(i17, o("fail"));
            return;
        }
        com.tencent.mm.plugin.appbrand.page.i3 x07 = e9Var.t3().x0();
        if (x07.getCurrentPage() == null || x07.getCurrentPage().getCurrentPageView() == null) {
            e9Var.a(i17, o("fail"));
            return;
        }
        if (f79175m != null) {
            e9Var.a(i17, o("fail:audio is recording, don't start record again"));
            return;
        }
        this.f79177h = x07.getCurrentPage().getCurrentPageView();
        int i18 = 60;
        int optInt = jSONObject.optInt("duration", 60);
        if (optInt <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiStartRecordVoice", "duration is invalid, less than 0");
        } else {
            i18 = optInt;
        }
        if (i18 > 600) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiStartRecordVoice", "duration is invalid, more than %d", 600);
            i18 = 600;
        }
        this.f79177h.R(new com.tencent.mm.plugin.appbrand.jsapi.audio.w2(this, e9Var));
        this.f79177h.w(new com.tencent.mm.plugin.appbrand.jsapi.audio.x2(this, e9Var));
        com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStartRecordVoice$StartRecordVoice jsApiStartRecordVoice$StartRecordVoice = new com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStartRecordVoice$StartRecordVoice(this, e9Var, i18, i17);
        this.f79176g = jsApiStartRecordVoice$StartRecordVoice;
        f79175m = jsApiStartRecordVoice$StartRecordVoice.f79123m;
        this.f79176g.d();
        D(true);
    }

    public final void D(boolean z17) {
        if (this.f79177h == null) {
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.u3.e()) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.jsapi.audio.y2(this, z17));
            return;
        }
        if (z17) {
            this.f79178i = mi1.c.a(this.f79177h.t3()).h(mi1.d.VOICE);
            com.tencent.mm.plugin.appbrand.m6.a(this.f79177h.getAppId()).f85710c = this.f79178i;
        } else {
            mi1.w0 w0Var = this.f79178i;
            if (w0Var != null) {
                w0Var.dismiss();
                this.f79178i = null;
            }
        }
    }
}
