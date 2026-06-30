package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd;

/* loaded from: classes4.dex */
public class y2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.C17904x74018d8e f247375d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k91.z5 f247376e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ab4.r f247377f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z2 f247378g;

    public y2(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z2 z2Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.C17904x74018d8e c17904x74018d8e, k91.z5 z5Var, ab4.r rVar) {
        this.f247378g = z2Var;
        this.f247375d = c17904x74018d8e;
        this.f247376e = z5Var;
        this.f247377f = rVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z2 z2Var = this.f247378g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent$7");
        android.content.Intent intent = new android.content.Intent();
        intent.setFlags(67108864);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.C17904x74018d8e c17904x74018d8e = this.f247375d;
        intent.putExtra("Chat_User", c17904x74018d8e.f246539g);
        intent.putExtra("app_brand_chatting_from_scene", 3);
        intent.putExtra("app_brand_chatting_expose_params", this.f247376e.a());
        intent.putExtra("key_temp_session_from", c17904x74018d8e.f246538f);
        intent.putExtra("finish_direct", true);
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        boolean a17 = z65.c.a();
        e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
        if (e0Var != null) {
            a17 = ((h62.d) e0Var).fj(e42.d0.clicfg_android_appbrand_contact_support_send_video, a17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandContactABTests", "isSupportSendVideo#get, " + a17);
        if (!a17) {
            intent.putExtra("key_need_send_video", false);
        }
        intent.putExtra("app_brand_chatting_from_scene_new", 4);
        try {
            ab4.r rVar = this.f247377f;
            boolean z17 = rVar.D1 == 1;
            java.lang.String str3 = rVar.E1;
            java.lang.String str4 = rVar.G1;
            java.lang.String str5 = rVar.F1;
            if (!z17 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(str3, str5, str4)) {
                intent.putExtra("showMessageCard", false);
            } else {
                intent.putExtra("showMessageCard", true);
                intent.putExtra("sendMessageTitle", str3);
                intent.putExtra("sendMessagePath", str4);
                intent.putExtra("sendMessageImg", str5);
            }
        } catch (java.lang.Throwable th6) {
            intent.putExtra("showMessageCard", false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sns.AdLandingPageBtnComponent", th6.toString());
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("uxInfo", z2Var.u().o());
            str = jSONObject.toString();
        } catch (java.lang.Exception unused) {
            str = "";
        }
        intent.putExtra("sns_landing_pages_ux_info", str);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) z2Var.f246582d;
        abstractActivityC21394xb3d2c0cf.m78545xde66c1f2(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.x2(this));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.AdLandingPageBtnComponent", "open ServiceChattingUI， uxInfo=" + str);
        j45.l.v(abstractActivityC21394xb3d2c0cf, ".ui.chatting.AppBrandServiceChattingUI", intent, 1);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent$7");
    }
}
