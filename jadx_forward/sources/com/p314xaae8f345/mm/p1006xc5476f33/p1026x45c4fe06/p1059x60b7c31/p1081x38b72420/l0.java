package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420;

/* loaded from: classes7.dex */
public class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.C12066xe058977c f162104d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 f162105e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.m0 f162106f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.n0 f162107g;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.n0 n0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.C12066xe058977c c12066xe058977c, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.m0 m0Var) {
        this.f162107g = n0Var;
        this.f162104d = c12066xe058977c;
        this.f162105e = n7Var;
        this.f162106f = m0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiPrivateEnterContact", "privateEnterContact go to the customized chattingUI");
        android.content.Intent intent = new android.content.Intent();
        intent.setFlags(67108864);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.C12066xe058977c c12066xe058977c = this.f162104d;
        intent.putExtra("Chat_User", c12066xe058977c.f162019h);
        intent.putExtra("app_brand_chatting_from_scene", 2);
        intent.putExtra("key_temp_session_from", c12066xe058977c.f162017f);
        intent.putExtra("finish_direct", true);
        k91.z5 z5Var = new k91.z5();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.n0 n0Var = this.f162107g;
        z5Var.f387396a = n0Var.f162110h;
        z5Var.f387399d = n0Var.f162116q;
        z5Var.f387405j = 5;
        intent.putExtra("app_brand_chatting_expose_params", z5Var.a());
        intent.putExtra("keyPrivateAppId", n0Var.f162110h);
        intent.putExtra("keyPrivateUserName", n0Var.f162111i);
        intent.putExtra("keyPrivateTitle", n0Var.f162112m);
        intent.putExtra("keyPrivateSubTitle", n0Var.f162113n);
        intent.putExtra("keyPrivateHeadImage", n0Var.f162114o);
        if (n0Var.f162121v) {
            intent.putExtra("sendMessageTitle", n0Var.f162118s);
            intent.putExtra("sendMessagePath", n0Var.f162119t);
            intent.putExtra("sendMessageImg", n0Var.f162120u);
            intent.putExtra("sendMessageLocalImg", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.n2.b(n0Var.f162122w));
            intent.putExtra("needDelThumb", n0Var.f162123x);
        }
        intent.putExtra("showMessageCard", n0Var.f162121v);
        android.app.Activity r07 = this.f162105e.mo32091x9a3f0ba2().r0();
        if (r07 != null) {
            nf.g.a(r07).f(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.k0(this));
            j45.l.v(r07, ".ui.chatting.AppBrandServiceChattingUI", intent, n0Var.f162124y);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.m0 m0Var = this.f162106f;
            if (m0Var != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.f0) m0Var).a(false, "fail:internal error invalid android context", null);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiPrivateEnterContact", "privateEnterContact mmActivity is null, invoke fail!");
        }
    }
}
