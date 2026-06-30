package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420;

/* loaded from: classes7.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.C12066xe058977c f162037d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k91.z5 f162038e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 f162039f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.b0 f162040g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.c0 f162041h;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.c0 c0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.C12066xe058977c c12066xe058977c, k91.z5 z5Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.b0 b0Var) {
        this.f162041h = c0Var;
        this.f162037d = c12066xe058977c;
        this.f162038e = z5Var;
        this.f162039f = n7Var;
        this.f162040g = b0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiEnterContact", "go to the chattingUI");
        android.content.Intent intent = new android.content.Intent();
        intent.setFlags(67108864);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.C12066xe058977c c12066xe058977c = this.f162037d;
        intent.putExtra("Chat_User", c12066xe058977c.f162019h);
        intent.putExtra("app_brand_chatting_from_scene", 2);
        intent.putExtra("app_brand_chatting_expose_params", this.f162038e.a());
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.c0 c0Var = this.f162041h;
        if (c0Var.f162068o) {
            intent.putExtra("sendMessageTitle", c0Var.f162065i);
            intent.putExtra("sendMessagePath", c0Var.f162066m);
            intent.putExtra("sendMessageImg", c0Var.f162067n);
            intent.putExtra("sendMessageLocalImg", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.n2.b(c0Var.f162069p));
            intent.putExtra("needDelThumb", c0Var.f162070q);
        }
        intent.putExtra("showMessageCard", c0Var.f162068o);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var = this.f162039f;
        int i17 = n7Var.mo32091x9a3f0ba2().e3() ? 2 : 1;
        java.lang.String Y1 = n7Var.Y1();
        java.lang.String mo48798x74292566 = n7Var.mo48798x74292566();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiEnterContact", "doEnterChatting, scene: %d, sceneNote: %s, fromAppId: %s", java.lang.Integer.valueOf(i17), Y1, mo48798x74292566);
        intent.putExtra("app_brand_chatting_from_scene_new", i17);
        intent.putExtra("app_brand_chatting_from_scene_note_new", Y1);
        intent.putExtra("app_brand_chatting_from_app_id", mo48798x74292566);
        android.app.Activity r07 = n7Var.mo32091x9a3f0ba2().r0();
        if (r07 != null) {
            nf.g.a(r07).f(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.z(this));
            j45.l.v(r07, ".ui.chatting.AppBrandServiceChattingUI", intent, c0Var.f162071r);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.b0 b0Var = this.f162040g;
            if (b0Var != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.w) b0Var).a(false, "fail:internal error invalid android context", null);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiEnterContact", "mmActivity is null, invoke fail!");
        }
    }
}
