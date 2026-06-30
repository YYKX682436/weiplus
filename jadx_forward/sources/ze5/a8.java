package ze5;

/* loaded from: classes5.dex */
public final class a8 implements sb5.s2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f553354a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v11.e0 f553355b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f553356c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dh0.j f553357d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f553358e;

    public a8(long j17, v11.e0 e0Var, yz5.l lVar, dh0.j jVar, java.lang.String str) {
        this.f553354a = j17;
        this.f553355b = e0Var;
        this.f553356c = lVar;
        this.f553357d = jVar;
        this.f553358e = str;
    }

    public void a() {
        java.lang.String str;
        long j17 = this.f553354a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemMarkdownMvvm", "[THINKING_TRACE] onThinkingEnd: msgSvrId=%d", java.lang.Long.valueOf(j17));
        if (this.f553357d != null) {
            java.lang.String talker = this.f553358e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
            str = eh0.k.f334421a.b(talker, j17);
        } else {
            str = null;
        }
        java.lang.String str2 = str;
        if (str2 != null) {
            this.f553356c.mo146xb9724478(ze5.l8.b(ze5.m8.f553631a, str2, this.f553355b, false, null, null, 0L, 56, null));
        }
    }

    public void b(java.lang.String streamText) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(streamText, "streamText");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemMarkdownMvvm", "[THINKING_TRACE] onThinkingUpdate: msgSvrId=%d, textLen=%d", java.lang.Long.valueOf(this.f553354a), java.lang.Integer.valueOf(streamText.length()));
        this.f553356c.mo146xb9724478(ze5.l8.b(ze5.m8.f553631a, streamText, this.f553355b, true, null, null, 0L, 56, null));
    }
}
