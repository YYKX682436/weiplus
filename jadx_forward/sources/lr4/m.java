package lr4;

/* loaded from: classes8.dex */
public final class m implements gr4.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lr4.n f402284a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kr4.g f402285b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fr4.g0 f402286c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f402287d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f402288e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f402289f;

    public m(lr4.n nVar, kr4.g gVar, fr4.g0 g0Var, java.lang.String str, int i17, java.lang.String str2) {
        this.f402284a = nVar;
        this.f402285b = gVar;
        this.f402286c = g0Var;
        this.f402287d = str;
        this.f402288e = i17;
        this.f402289f = str2;
    }

    @Override // gr4.e
    public final void a(r45.ij3 ij3Var) {
        jz5.f0 f0Var;
        lr4.n nVar = this.f402284a;
        r45.xq4 xq4Var = ij3Var.f458630d;
        kr4.g gVar = this.f402285b;
        if (xq4Var != null) {
            int Ri = ((fr4.g0) ((gr4.f) i95.n0.c(gr4.f.class))).Ri(xq4Var.f471868f);
            java.lang.String msg_session_id = xq4Var.f471868f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(msg_session_id, "msg_session_id");
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = gVar.Z;
            java.lang.String d17 = z3Var != null ? z3Var.d1() : null;
            if (d17 == null) {
                d17 = "";
            }
            fr4.g0 g0Var = this.f402286c;
            g0Var.ij(msg_session_id, d17, g0Var.Di(), xq4Var.f471869g, xq4Var.f471871i, Ri);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("W1w.W1wPersonalMsgConvClickListener", "session_info is null, using default values");
        }
        android.content.Intent intent = new android.content.Intent();
        java.lang.String str = this.f402289f;
        intent.putExtra("Chat_User", gVar.f69048xbed8694c);
        intent.putExtra("Chat_Self", this.f402287d);
        r45.xq4 xq4Var2 = ij3Var.f458630d;
        intent.putExtra("key_w1w_need_choose_id", xq4Var2 != null ? xq4Var2.f471870h : true);
        intent.putExtra("key_w1w_disable_sendmsg", ij3Var.f458630d != null ? !r1.f471871i : false);
        intent.putExtra("finish_direct", true);
        intent.putExtra("key_w1w_conv_is_hello", this.f402288e == 1);
        try {
            android.content.Intent intent2 = nVar.f402290a.m7548xe6e42394().getIntent();
            if (intent2 != null) {
                intent.putExtra("key_w1w_refer_scene", intent2.getStringExtra("key_w1w_refer_scene"));
                intent.putExtra("key_w1w_refer_scene_note", intent2.getStringExtra("key_w1w_refer_scene_note"));
                intent.putExtra("key_w1w_refer_session_id", intent2.getStringExtra("key_w1w_refer_session_id"));
                java.lang.String stringExtra = intent2.getStringExtra("key_w1w_refer_ext_info");
                fr4.s[] sVarArr = fr4.s.f347393d;
                intent.putExtra("key_w1w_refer_ext_info", mr4.a.d(stringExtra, "w1w-personal-msg-chat-list", str));
            }
            j45.l.u(nVar.f402290a.m7550xf0c4608a(), ".ui.chatting.ChattingUI", intent, null);
            pm0.v.K(null, new lr4.l(gVar));
            yz5.l lVar = nVar.f402291b;
            if (lVar != null) {
                lVar.mo146xb9724478(gVar);
            }
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("W1w.W1wPersonalMsgConvClickListener", "no activity attached to fragment, maybe internet is not connected");
        }
    }
}
