package com.tencent.mm.plugin.appbrand.jsapi.contact;

/* loaded from: classes7.dex */
public class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.contact.JsApiChattingTask f80571d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.n7 f80572e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.contact.m0 f80573f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.contact.n0 f80574g;

    public l0(com.tencent.mm.plugin.appbrand.jsapi.contact.n0 n0Var, com.tencent.mm.plugin.appbrand.jsapi.contact.JsApiChattingTask jsApiChattingTask, com.tencent.mm.plugin.appbrand.page.n7 n7Var, com.tencent.mm.plugin.appbrand.jsapi.contact.m0 m0Var) {
        this.f80574g = n0Var;
        this.f80571d = jsApiChattingTask;
        this.f80572e = n7Var;
        this.f80573f = m0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiPrivateEnterContact", "privateEnterContact go to the customized chattingUI");
        android.content.Intent intent = new android.content.Intent();
        intent.setFlags(67108864);
        com.tencent.mm.plugin.appbrand.jsapi.contact.JsApiChattingTask jsApiChattingTask = this.f80571d;
        intent.putExtra("Chat_User", jsApiChattingTask.f80486h);
        intent.putExtra("app_brand_chatting_from_scene", 2);
        intent.putExtra("key_temp_session_from", jsApiChattingTask.f80484f);
        intent.putExtra("finish_direct", true);
        k91.z5 z5Var = new k91.z5();
        com.tencent.mm.plugin.appbrand.jsapi.contact.n0 n0Var = this.f80574g;
        z5Var.f305863a = n0Var.f80577h;
        z5Var.f305866d = n0Var.f80583q;
        z5Var.f305872j = 5;
        intent.putExtra("app_brand_chatting_expose_params", z5Var.a());
        intent.putExtra("keyPrivateAppId", n0Var.f80577h);
        intent.putExtra("keyPrivateUserName", n0Var.f80578i);
        intent.putExtra("keyPrivateTitle", n0Var.f80579m);
        intent.putExtra("keyPrivateSubTitle", n0Var.f80580n);
        intent.putExtra("keyPrivateHeadImage", n0Var.f80581o);
        if (n0Var.f80588v) {
            intent.putExtra("sendMessageTitle", n0Var.f80585s);
            intent.putExtra("sendMessagePath", n0Var.f80586t);
            intent.putExtra("sendMessageImg", n0Var.f80587u);
            intent.putExtra("sendMessageLocalImg", com.tencent.mm.plugin.appbrand.jsapi.share.n2.b(n0Var.f80589w));
            intent.putExtra("needDelThumb", n0Var.f80590x);
        }
        intent.putExtra("showMessageCard", n0Var.f80588v);
        android.app.Activity r07 = this.f80572e.getRuntime().r0();
        if (r07 != null) {
            nf.g.a(r07).f(new com.tencent.mm.plugin.appbrand.jsapi.contact.k0(this));
            j45.l.v(r07, ".ui.chatting.AppBrandServiceChattingUI", intent, n0Var.f80591y);
        } else {
            com.tencent.mm.plugin.appbrand.jsapi.contact.m0 m0Var = this.f80573f;
            if (m0Var != null) {
                ((com.tencent.mm.plugin.appbrand.jsapi.contact.f0) m0Var).a(false, "fail:internal error invalid android context", null);
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiPrivateEnterContact", "privateEnterContact mmActivity is null, invoke fail!");
        }
    }
}
