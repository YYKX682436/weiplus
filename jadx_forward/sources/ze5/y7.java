package ze5;

/* loaded from: classes5.dex */
public final class y7 implements sb5.t2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f553858a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ af5.d1 f553859b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.p f553860c;

    public y7(long j17, af5.d1 d1Var, yz5.p pVar) {
        this.f553858a = j17;
        this.f553859b = d1Var;
        this.f553860c = pVar;
    }

    public void a(v11.n0 thinkingState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thinkingState, "thinkingState");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemMarkdownMvvm", "[THINKING_TRACE] onThinkingStatusChanged: msgSvrId=%d, state=%s", java.lang.Long.valueOf(this.f553858a), thinkingState.name());
        this.f553859b.m48330xfcfee142(new v11.m0(thinkingState, thinkingState != v11.n0.f513978d ? this.f553860c : null));
    }
}
