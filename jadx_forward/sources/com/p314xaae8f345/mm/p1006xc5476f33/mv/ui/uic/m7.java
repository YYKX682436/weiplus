package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class m7 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.q7 f232828a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f232829b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f232830c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f232831d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm3.u f232832e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.hf2 f232833f;

    public m7(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.q7 q7Var, java.lang.String str, java.lang.String str2, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, fm3.u uVar, r45.hf2 hf2Var) {
        this.f232828a = q7Var;
        this.f232829b = str;
        this.f232830c = str2;
        this.f232831d = h0Var;
        this.f232832e = uVar;
        this.f232833f = hf2Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j
    public final void a(boolean z17, java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.g8 g8Var;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.q7 q7Var = this.f232828a;
        if (!z17 && (g8Var = q7Var.f232921d) != null) {
            g8Var.a(java.lang.System.currentTimeMillis(), 1, "2", 10, null);
        }
        if (z17) {
            java.lang.String str2 = this.f232829b;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Retr_Msg_Type", 2);
            intent.putExtra("content_type_forward_to_wework", 11);
            intent.putExtra("Retr_Msg_content", this.f232830c);
            intent.putExtra("Multi_Retr", true);
            intent.putExtra("Retr_go_to_chattingUI", false);
            intent.putExtra("Retr_show_success_tips", true);
            intent.putExtra("Retr_Msg_thumb_path", (java.lang.String) this.f232831d.f391656d);
            intent.putExtra("custom_send_text", str);
            intent.putExtra("Retr_MsgQuickShare", true);
            intent.putExtra("Select_Conv_User", str2);
            android.app.Activity m80379x76847179 = q7Var.m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m80379x76847179, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            j45.l.w((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m80379x76847179, ".ui.transmit.MsgRetransmitUI", intent, 1, new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.l7(this.f232832e, q7Var, str2, this.f232833f));
        }
    }
}
