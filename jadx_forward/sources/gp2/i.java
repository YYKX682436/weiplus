package gp2;

/* loaded from: classes10.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gp2.l0 f355759d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f355760e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f355761f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(gp2.l0 l0Var, long j17, long j18) {
        super(0);
        this.f355759d = l0Var;
        this.f355760e = j17;
        this.f355761f = j18;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17 = gp2.l0.N;
        gp2.l0 l0Var = this.f355759d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(l0Var.t(), "[NearbyEndLive] livePlayerView onLiveEndedCallback notify.");
        yz5.p pVar = l0Var.f355790p;
        if (pVar != null) {
            pVar.mo149xb9724478(java.lang.Long.valueOf(this.f355760e), java.lang.Long.valueOf(this.f355761f));
        }
        return jz5.f0.f384359a;
    }
}
