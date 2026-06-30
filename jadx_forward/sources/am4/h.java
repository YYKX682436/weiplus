package am4;

/* loaded from: classes11.dex */
public final class h extends tl4.e {
    @Override // tl4.e, p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.v
    public void d() {
        super.d();
        ((ku5.t0) ku5.t0.f394148d).h(new am4.a(this), "MicroMsg.TingRadioChannelMediaSessionCallBack");
    }

    @Override // tl4.e, p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.v
    public void e() {
        super.e();
        ((ku5.t0) ku5.t0.f394148d).h(new am4.b(this), "MicroMsg.TingRadioChannelMediaSessionCallBack");
    }

    @Override // p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.v
    public void g(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingRadioChannelMediaSessionCallBack", "onSeekTo:" + j17);
        d75.b.g(new am4.c(this, j17));
    }

    @Override // p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.v
    public void h() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingRadioChannelMediaSessionCallBack", "onSkipToNext");
        d75.b.g(new am4.d(this));
        ((ku5.t0) ku5.t0.f394148d).h(new am4.e(this), "MicroMsg.TingRadioChannelMediaSessionCallBack");
    }

    @Override // p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.v
    public void i() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingRadioChannelMediaSessionCallBack", "onSkipToPrevious");
        d75.b.g(new am4.f(this));
        ((ku5.t0) ku5.t0.f394148d).h(new am4.g(this), "MicroMsg.TingRadioChannelMediaSessionCallBack");
    }

    @Override // tl4.e
    public bw5.eq0 m() {
        return bw5.eq0.AudioRadio;
    }
}
