package com.tencent.mm.plugin.appbrand.jsapi.contact;

/* loaded from: classes7.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.contact.JsApiChattingTask f80556d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.n7 f80557e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.contact.m0 f80558f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.contact.n0 f80559g;

    public h0(com.tencent.mm.plugin.appbrand.jsapi.contact.n0 n0Var, com.tencent.mm.plugin.appbrand.jsapi.contact.JsApiChattingTask jsApiChattingTask, com.tencent.mm.plugin.appbrand.page.n7 n7Var, com.tencent.mm.plugin.appbrand.jsapi.contact.m0 m0Var) {
        this.f80559g = n0Var;
        this.f80556d = jsApiChattingTask;
        this.f80557e = n7Var;
        this.f80558f = m0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiPrivateEnterContact", "privateEnterContact go to the customized chattingUI");
        android.content.Intent intent = new android.content.Intent();
        intent.setFlags(67108864);
        com.tencent.mm.plugin.appbrand.jsapi.contact.JsApiChattingTask jsApiChattingTask = this.f80556d;
        intent.putExtra("Chat_User", jsApiChattingTask.f80486h);
        intent.putExtra("app_brand_chatting_from_scene", 2);
        intent.putExtra("key_temp_session_from", jsApiChattingTask.f80484f);
        intent.putExtra("finish_direct", true);
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        boolean a17 = z65.c.a();
        e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
        if (e0Var != null) {
            a17 = ((h62.d) e0Var).fj(e42.d0.clicfg_android_appbrand_contact_support_send_video, a17);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandContactABTests", "isSupportSendVideo#get, " + a17);
        if (!a17) {
            intent.putExtra("key_need_send_video", false);
        }
        k91.z5 z5Var = new k91.z5();
        com.tencent.mm.plugin.appbrand.jsapi.contact.n0 n0Var = this.f80559g;
        z5Var.f305863a = n0Var.f80577h;
        z5Var.f305866d = n0Var.f80578i;
        z5Var.f305872j = 5;
        intent.putExtra("app_brand_chatting_expose_params", z5Var.a());
        intent.putExtra("keyPrivateAppId", n0Var.f80577h);
        intent.putExtra("keyPrivateUserName", n0Var.f80578i);
        intent.putExtra("keyPrivateTitle", n0Var.f80579m);
        intent.putExtra("keyPrivateSubTitle", n0Var.f80580n);
        intent.putExtra("keyPrivateHeadImage", n0Var.f80581o);
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = this.f80557e;
        int i17 = n7Var.getRuntime().e3() ? 2 : 1;
        java.lang.String Y1 = n7Var.Y1();
        java.lang.String appId = n7Var.getAppId();
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiPrivateEnterContact", "doEnterChattingCustomized, scene: %d, sceneNote: %s, fromAppId: %s", java.lang.Integer.valueOf(i17), Y1, appId);
        intent.putExtra("app_brand_chatting_from_scene_new", i17);
        intent.putExtra("app_brand_chatting_from_scene_note_new", Y1);
        intent.putExtra("app_brand_chatting_from_app_id", appId);
        android.app.Activity r07 = n7Var.getRuntime().r0();
        if (r07 != null) {
            nf.g.a(r07).f(new com.tencent.mm.plugin.appbrand.jsapi.contact.g0(this));
            j45.l.v(r07, ".ui.chatting.AppBrandServiceChattingUI", intent, n0Var.f80591y);
        } else {
            com.tencent.mm.plugin.appbrand.jsapi.contact.m0 m0Var = this.f80558f;
            if (m0Var != null) {
                ((com.tencent.mm.plugin.appbrand.jsapi.contact.f0) m0Var).a(false, "fail:internal error invalid android context", null);
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiPrivateEnterContact", "privateEnterContact mmActivity is null, invoke fail!");
        }
    }
}
