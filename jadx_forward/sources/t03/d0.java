package t03;

/* loaded from: classes11.dex */
public final class d0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t03.k0 f495969d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f495970e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f495971f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f495972g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(t03.k0 k0Var, int i17, int i18, long j17) {
        super(0);
        this.f495969d = k0Var;
        this.f495970e = i17;
        this.f495971f = i18;
        this.f495972g = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        t03.k0 k0Var = this.f495969d;
        java.lang.String str = k0Var.f495998g;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setOnStateChangeListener ");
        int i17 = this.f495970e;
        sb6.append(i17);
        sb6.append(' ');
        int i18 = this.f495971f;
        sb6.append(i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("event", "onStateChange");
        hashMap.put("playerId", java.lang.Long.valueOf(this.f495972g));
        hashMap.put("lastState", java.lang.Integer.valueOf(i17));
        hashMap.put("currentState", java.lang.Integer.valueOf(i18));
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.EventSink eventSink = ((v03.b) k0Var.f495996e).f513836h;
        if (eventSink != null) {
            eventSink.mo138418x90b54003(hashMap);
        }
        return jz5.f0.f384359a;
    }
}
