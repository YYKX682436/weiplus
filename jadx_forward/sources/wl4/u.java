package wl4;

/* loaded from: classes11.dex */
public final class u extends tl4.e {
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
        if (!l()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingRadioChannelMediaSessionCallBack", "onSeekTo call too much, just return");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingRadioChannelMediaSessionCallBack", "onSeekTo:" + j17);
        d75.b.g(new wl4.r(this, j17));
    }

    @Override // p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.v
    public void h() {
        if (!l()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingRadioChannelMediaSessionCallBack", "onSkipToNext call too much, just return");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingRadioChannelMediaSessionCallBack", "onSkipToNext");
            d75.b.g(new wl4.s(this));
        }
    }

    @Override // p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.v
    public void i() {
        if (!l()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingRadioChannelMediaSessionCallBack", "onSkipToPrevious call too much, just return");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingRadioChannelMediaSessionCallBack", "onSkipToPrevious");
            d75.b.g(new wl4.t(this));
        }
    }

    @Override // tl4.e, p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.v
    public void j() {
        super.j();
    }

    @Override // tl4.e
    public bw5.eq0 m() {
        return bw5.eq0.TingMusic;
    }
}
