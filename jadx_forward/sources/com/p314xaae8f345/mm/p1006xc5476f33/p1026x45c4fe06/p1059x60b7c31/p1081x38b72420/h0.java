package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420;

/* loaded from: classes7.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.C12066xe058977c f162089d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 f162090e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.m0 f162091f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.n0 f162092g;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.n0 n0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.C12066xe058977c c12066xe058977c, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.m0 m0Var) {
        this.f162092g = n0Var;
        this.f162089d = c12066xe058977c;
        this.f162090e = n7Var;
        this.f162091f = m0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiPrivateEnterContact", "privateEnterContact go to the customized chattingUI");
        android.content.Intent intent = new android.content.Intent();
        intent.setFlags(67108864);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.C12066xe058977c c12066xe058977c = this.f162089d;
        intent.putExtra("Chat_User", c12066xe058977c.f162019h);
        intent.putExtra("app_brand_chatting_from_scene", 2);
        intent.putExtra("key_temp_session_from", c12066xe058977c.f162017f);
        intent.putExtra("finish_direct", true);
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        boolean a17 = z65.c.a();
        e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
        if (e0Var != null) {
            a17 = ((h62.d) e0Var).fj(e42.d0.clicfg_android_appbrand_contact_support_send_video, a17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandContactABTests", "isSupportSendVideo#get, " + a17);
        if (!a17) {
            intent.putExtra("key_need_send_video", false);
        }
        k91.z5 z5Var = new k91.z5();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.n0 n0Var = this.f162092g;
        z5Var.f387396a = n0Var.f162110h;
        z5Var.f387399d = n0Var.f162111i;
        z5Var.f387405j = 5;
        intent.putExtra("app_brand_chatting_expose_params", z5Var.a());
        intent.putExtra("keyPrivateAppId", n0Var.f162110h);
        intent.putExtra("keyPrivateUserName", n0Var.f162111i);
        intent.putExtra("keyPrivateTitle", n0Var.f162112m);
        intent.putExtra("keyPrivateSubTitle", n0Var.f162113n);
        intent.putExtra("keyPrivateHeadImage", n0Var.f162114o);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var = this.f162090e;
        int i17 = n7Var.mo32091x9a3f0ba2().e3() ? 2 : 1;
        java.lang.String Y1 = n7Var.Y1();
        java.lang.String mo48798x74292566 = n7Var.mo48798x74292566();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiPrivateEnterContact", "doEnterChattingCustomized, scene: %d, sceneNote: %s, fromAppId: %s", java.lang.Integer.valueOf(i17), Y1, mo48798x74292566);
        intent.putExtra("app_brand_chatting_from_scene_new", i17);
        intent.putExtra("app_brand_chatting_from_scene_note_new", Y1);
        intent.putExtra("app_brand_chatting_from_app_id", mo48798x74292566);
        android.app.Activity r07 = n7Var.mo32091x9a3f0ba2().r0();
        if (r07 != null) {
            nf.g.a(r07).f(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.g0(this));
            j45.l.v(r07, ".ui.chatting.AppBrandServiceChattingUI", intent, n0Var.f162124y);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.m0 m0Var = this.f162091f;
            if (m0Var != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.f0) m0Var).a(false, "fail:internal error invalid android context", null);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiPrivateEnterContact", "privateEnterContact mmActivity is null, invoke fail!");
        }
    }
}
