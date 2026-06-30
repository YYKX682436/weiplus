package am4;

/* loaded from: classes11.dex */
public final class h extends tl4.e {
    @Override // tl4.e, android.support.v4.media.session.v
    public void d() {
        super.d();
        ((ku5.t0) ku5.t0.f312615d).h(new am4.a(this), "MicroMsg.TingRadioChannelMediaSessionCallBack");
    }

    @Override // tl4.e, android.support.v4.media.session.v
    public void e() {
        super.e();
        ((ku5.t0) ku5.t0.f312615d).h(new am4.b(this), "MicroMsg.TingRadioChannelMediaSessionCallBack");
    }

    @Override // android.support.v4.media.session.v
    public void g(long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TingRadioChannelMediaSessionCallBack", "onSeekTo:" + j17);
        d75.b.g(new am4.c(this, j17));
    }

    @Override // android.support.v4.media.session.v
    public void h() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TingRadioChannelMediaSessionCallBack", "onSkipToNext");
        d75.b.g(new am4.d(this));
        ((ku5.t0) ku5.t0.f312615d).h(new am4.e(this), "MicroMsg.TingRadioChannelMediaSessionCallBack");
    }

    @Override // android.support.v4.media.session.v
    public void i() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TingRadioChannelMediaSessionCallBack", "onSkipToPrevious");
        d75.b.g(new am4.f(this));
        ((ku5.t0) ku5.t0.f312615d).h(new am4.g(this), "MicroMsg.TingRadioChannelMediaSessionCallBack");
    }

    @Override // tl4.e
    public bw5.eq0 m() {
        return bw5.eq0.AudioRadio;
    }
}
