package gk4;

/* loaded from: classes10.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk4.r f354116d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f354117e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hk4.a f354118f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(gk4.r rVar, long j17, hk4.a aVar) {
        super(0);
        this.f354116d = rVar;
        this.f354117e = j17;
        this.f354118f = aVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f354116d.f354135g, "seek firstPlayer:" + this.f354117e + " finished, isPlaying:" + this.f354118f.a());
        if (this.f354118f.a()) {
            this.f354116d.f354144p = gk4.e.f354076e;
            this.f354116d.l();
        }
        return jz5.f0.f384359a;
    }
}
