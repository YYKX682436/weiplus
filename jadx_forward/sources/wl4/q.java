package wl4;

/* loaded from: classes11.dex */
public final class q extends tl4.e {

    /* renamed from: k, reason: collision with root package name */
    public final bw5.eq0 f528631k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.p314xaae8f345.p3118xeeebfacc.C26845xac206036 c26845xac206036, rl4.c config, bw5.eq0 appId) {
        super(c26845xac206036);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        this.f528631k = appId;
    }

    @Override // tl4.e, p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.v
    public void d() {
        super.d();
    }

    @Override // tl4.e, p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.v
    public void e() {
        super.e();
    }

    @Override // p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.v
    public void g(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingRadioChannelMediaSessionCallBack", "onSeekTo:" + j17);
        d75.b.g(new wl4.n(this, j17));
    }

    @Override // p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.v
    public void h() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingRadioChannelMediaSessionCallBack", "onSkipToNext");
        d75.b.g(new wl4.o(this));
    }

    @Override // p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.v
    public void i() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingRadioChannelMediaSessionCallBack", "onSkipToPrevious");
        d75.b.g(new wl4.p(this));
    }

    @Override // tl4.e
    public bw5.eq0 m() {
        return this.f528631k;
    }
}
