package fr4;

/* loaded from: classes8.dex */
public final class y implements gr4.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fr4.g0 f347411a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f347412b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f347413c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f347414d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f347415e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f347416f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f347417g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f347418h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f347419i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f347420j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f347421k;

    public y(fr4.g0 g0Var, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, android.content.Context context) {
        this.f347411a = g0Var;
        this.f347412b = str;
        this.f347413c = str2;
        this.f347414d = str3;
        this.f347415e = z17;
        this.f347416f = str4;
        this.f347417g = str5;
        this.f347418h = str6;
        this.f347419i = str7;
        this.f347420j = str8;
        this.f347421k = context;
    }

    @Override // gr4.e
    public final void a(r45.ij3 ij3Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("W1w.W1wPersonalMsgService", "[launchChatting] session info response received: sessionId=" + ij3Var.f458630d.f471868f + ", canRecvMsg=" + ij3Var.f458630d.f471871i);
        int Ri = ((fr4.g0) ((gr4.f) i95.n0.c(gr4.f.class))).Ri(ij3Var.f458630d.f471868f);
        fr4.g0 g0Var = this.f347411a;
        java.lang.String msg_session_id = ij3Var.f458630d.f471868f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(msg_session_id, "msg_session_id");
        java.lang.String str = this.f347412b;
        java.lang.String str2 = this.f347413c;
        r45.xq4 xq4Var = ij3Var.f458630d;
        g0Var.ij(msg_session_id, str, str2, xq4Var.f471869g, xq4Var.f471871i, Ri);
        ((ku5.t0) ku5.t0.f394148d).B(new fr4.x(this.f347413c, this.f347414d, ij3Var, this.f347415e, this.f347416f, this.f347417g, this.f347418h, this.f347419i, this.f347420j, this.f347421k, this.f347411a, this.f347412b));
    }
}
