package fr4;

/* loaded from: classes8.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f347399d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f347400e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.ij3 f347401f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f347402g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f347403h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f347404i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f347405m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f347406n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f347407o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f347408p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ fr4.g0 f347409q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f347410r;

    public x(java.lang.String str, java.lang.String str2, r45.ij3 ij3Var, boolean z17, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, android.content.Context context, fr4.g0 g0Var, java.lang.String str8) {
        this.f347399d = str;
        this.f347400e = str2;
        this.f347401f = ij3Var;
        this.f347402g = z17;
        this.f347403h = str3;
        this.f347404i = str4;
        this.f347405m = str5;
        this.f347406n = str6;
        this.f347407o = str7;
        this.f347408p = context;
        this.f347409q = g0Var;
        this.f347410r = str8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r45.ij3 ij3Var = this.f347401f;
        try {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Chat_Self", this.f347399d);
            intent.putExtra("Chat_User", this.f347400e);
            boolean z17 = true;
            intent.putExtra("finish_direct", true);
            intent.putExtra("key_w1w_need_choose_id", ij3Var.f458630d.f471870h);
            intent.putExtra("key_w1w_avatar_style", this.f347402g);
            if (ij3Var.f458630d.f471871i) {
                z17 = false;
            }
            intent.putExtra("key_w1w_disable_sendmsg", z17);
            intent.putExtra("key_w1w_nickname", this.f347403h);
            intent.putExtra("key_w1w_refer_scene", this.f347404i);
            intent.putExtra("key_w1w_refer_scene_note", this.f347405m);
            intent.putExtra("key_w1w_refer_session_id", this.f347406n);
            intent.putExtra("key_w1w_refer_ext_info", this.f347407o);
            android.content.Context context = this.f347408p;
            if (context != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("W1w.W1wPersonalMsgService", "[launchChatting] starting ChattingUI for sessionId=" + ij3Var.f458630d.f471868f);
                j45.l.u(context, ".ui.chatting.ChattingUI", intent, null);
                pm0.v.K(null, new fr4.w(this.f347409q, this.f347410r));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("W1w.W1wPersonalMsgService", "[launchChatting] successfully launched chatting interface");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("W1w.W1wPersonalMsgService", "[launchChatting] Context is null, cannot start activity");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("W1w.W1wPersonalMsgService", "Error starting activity: " + e17.getMessage());
        }
    }
}
