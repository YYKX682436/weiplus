package gp2;

/* loaded from: classes10.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gp2.l0 f355766d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f355767e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f355768f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(gp2.l0 l0Var, long j17, long j18) {
        super(0);
        this.f355766d = l0Var;
        this.f355767e = j17;
        this.f355768f = j18;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        gp2.l0 l0Var = this.f355766d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(l0Var.t(), "[NearbyEndLive] livePlayerView liveStatus end notify.");
        yz5.p pVar = l0Var.f355790p;
        if (pVar != null) {
            pVar.mo149xb9724478(java.lang.Long.valueOf(this.f355767e), java.lang.Long.valueOf(this.f355768f));
        }
        return jz5.f0.f384359a;
    }
}
