package com.tencent.mm.plugin.appbrand.jsapi.contact;

/* loaded from: classes7.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.contact.JsApiChattingTask f80504d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k91.z5 f80505e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.n7 f80506f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.contact.b0 f80507g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.contact.c0 f80508h;

    public a0(com.tencent.mm.plugin.appbrand.jsapi.contact.c0 c0Var, com.tencent.mm.plugin.appbrand.jsapi.contact.JsApiChattingTask jsApiChattingTask, k91.z5 z5Var, com.tencent.mm.plugin.appbrand.page.n7 n7Var, com.tencent.mm.plugin.appbrand.jsapi.contact.b0 b0Var) {
        this.f80508h = c0Var;
        this.f80504d = jsApiChattingTask;
        this.f80505e = z5Var;
        this.f80506f = n7Var;
        this.f80507g = b0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiEnterContact", "go to the chattingUI");
        android.content.Intent intent = new android.content.Intent();
        intent.setFlags(67108864);
        com.tencent.mm.plugin.appbrand.jsapi.contact.JsApiChattingTask jsApiChattingTask = this.f80504d;
        intent.putExtra("Chat_User", jsApiChattingTask.f80486h);
        intent.putExtra("app_brand_chatting_from_scene", 2);
        intent.putExtra("app_brand_chatting_expose_params", this.f80505e.a());
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
        com.tencent.mm.plugin.appbrand.jsapi.contact.c0 c0Var = this.f80508h;
        if (c0Var.f80535o) {
            intent.putExtra("sendMessageTitle", c0Var.f80532i);
            intent.putExtra("sendMessagePath", c0Var.f80533m);
            intent.putExtra("sendMessageImg", c0Var.f80534n);
            intent.putExtra("sendMessageLocalImg", com.tencent.mm.plugin.appbrand.jsapi.share.n2.b(c0Var.f80536p));
            intent.putExtra("needDelThumb", c0Var.f80537q);
        }
        intent.putExtra("showMessageCard", c0Var.f80535o);
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = this.f80506f;
        int i17 = n7Var.getRuntime().e3() ? 2 : 1;
        java.lang.String Y1 = n7Var.Y1();
        java.lang.String appId = n7Var.getAppId();
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiEnterContact", "doEnterChatting, scene: %d, sceneNote: %s, fromAppId: %s", java.lang.Integer.valueOf(i17), Y1, appId);
        intent.putExtra("app_brand_chatting_from_scene_new", i17);
        intent.putExtra("app_brand_chatting_from_scene_note_new", Y1);
        intent.putExtra("app_brand_chatting_from_app_id", appId);
        android.app.Activity r07 = n7Var.getRuntime().r0();
        if (r07 != null) {
            nf.g.a(r07).f(new com.tencent.mm.plugin.appbrand.jsapi.contact.z(this));
            j45.l.v(r07, ".ui.chatting.AppBrandServiceChattingUI", intent, c0Var.f80538r);
        } else {
            com.tencent.mm.plugin.appbrand.jsapi.contact.b0 b0Var = this.f80507g;
            if (b0Var != null) {
                ((com.tencent.mm.plugin.appbrand.jsapi.contact.w) b0Var).a(false, "fail:internal error invalid android context", null);
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiEnterContact", "mmActivity is null, invoke fail!");
        }
    }
}
