package fr4;

/* loaded from: classes8.dex */
public final class q implements gr4.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f347385a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f347386b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f347387c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f347388d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f347389e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f347390f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 f347391g;

    public q(java.lang.String str, java.lang.String str2, java.lang.String str3, android.content.Context context, java.lang.String str4, java.lang.String str5, com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010) {
        this.f347385a = str;
        this.f347386b = str2;
        this.f347387c = str3;
        this.f347388d = context;
        this.f347389e = str4;
        this.f347390f = str5;
        this.f347391g = abstractViewOnAttachStateChangeListenerC21400xb429b010;
    }

    @Override // gr4.e
    public final void a(r45.ij3 ij3Var) {
        java.lang.String str;
        java.lang.String str2 = this.f347389e;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f347385a, "1");
        int Ri = ((fr4.g0) i95.n0.c(fr4.g0.class)).Ri(ij3Var.f458630d.f471868f);
        if (ij3Var.f458630d != null) {
            fr4.g0 g0Var = (fr4.g0) i95.n0.c(fr4.g0.class);
            java.lang.String msg_session_id = ij3Var.f458630d.f471868f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(msg_session_id, "msg_session_id");
            java.lang.String str3 = this.f347386b;
            java.lang.String str4 = this.f347387c;
            r45.xq4 xq4Var = ij3Var.f458630d;
            str = "key_w1w_refer_ext_info";
            g0Var.ij(msg_session_id, str3, str4, xq4Var.f471869g, xq4Var.f471871i, Ri);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("W1w.W1wPersonalMsgConvClickListener", "can_change_identity: " + ij3Var.f458630d.f471870h + ", can_recv_msg: " + ij3Var.f458630d.f471871i);
        } else {
            str = "key_w1w_refer_ext_info";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("W1w.W1wPersonalMsgConvClickListener", "session_info is null, using default needChooseId=true, disableSendMsg=false");
        }
        try {
            android.content.Intent intent = new android.content.Intent();
            java.lang.String str5 = this.f347390f;
            com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010 = this.f347391g;
            intent.putExtra("Chat_User", str2);
            intent.putExtra("Chat_Self", str5);
            intent.putExtra("key_w1w_need_choose_id", ij3Var.f458630d.f471870h);
            intent.putExtra("key_w1w_avatar_style", b17);
            intent.putExtra("key_w1w_disable_sendmsg", !ij3Var.f458630d.f471871i);
            intent.putExtra("finish_direct", true);
            intent.addFlags(67108864);
            java.lang.String m78394x7e63ed49 = abstractViewOnAttachStateChangeListenerC21400xb429b010.m78394x7e63ed49("key_w1w_refer_scene");
            if (m78394x7e63ed49 == null) {
                m78394x7e63ed49 = "0";
            }
            intent.putExtra("key_w1w_refer_scene", m78394x7e63ed49);
            java.lang.String m78394x7e63ed492 = abstractViewOnAttachStateChangeListenerC21400xb429b010.m78394x7e63ed49("key_w1w_refer_scene_note");
            java.lang.String str6 = "";
            if (m78394x7e63ed492 == null) {
                m78394x7e63ed492 = "";
            }
            intent.putExtra("key_w1w_refer_scene_note", m78394x7e63ed492);
            java.lang.String m78394x7e63ed493 = abstractViewOnAttachStateChangeListenerC21400xb429b010.m78394x7e63ed49("key_w1w_refer_session_id");
            if (m78394x7e63ed493 == null) {
                m78394x7e63ed493 = "";
            }
            intent.putExtra("key_w1w_refer_session_id", m78394x7e63ed493);
            java.lang.String str7 = str;
            java.lang.String m78394x7e63ed494 = abstractViewOnAttachStateChangeListenerC21400xb429b010.m78394x7e63ed49(str7);
            if (m78394x7e63ed494 != null) {
                str6 = m78394x7e63ed494;
            }
            intent.putExtra(str7, str6);
            intent.putExtra("key_w1w_conv_is_hello", Ri == 1);
            j45.l.u(this.f347388d, ".ui.chatting.ChattingUI", intent, null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("W1wPersonalMsgLiteAppStoreHelper", "Failed to start chatting via global service", e17);
        }
        pm0.v.K(null, new fr4.p(str2));
    }
}
