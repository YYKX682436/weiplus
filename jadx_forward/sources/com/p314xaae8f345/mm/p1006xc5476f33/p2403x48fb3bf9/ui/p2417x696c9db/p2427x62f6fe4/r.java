package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4;

/* loaded from: classes8.dex */
public final class r implements com.p314xaae8f345.p3210x3857dc.InterfaceC27815xc8aac369 {

    /* renamed from: a, reason: collision with root package name */
    public long f267349a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.ViewOnClickListenerC19428xb021cc2c f267350b;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.ViewOnClickListenerC19428xb021cc2c viewOnClickListenerC19428xb021cc2c) {
        this.f267350b = viewOnClickListenerC19428xb021cc2c;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.InterfaceC27815xc8aac369
    /* renamed from: onSetRequestedOrientation */
    public boolean mo74541x45294025(int i17) {
        return false;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.InterfaceC27815xc8aac369
    /* renamed from: onVideoEmptied */
    public void mo51514xbb35520() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.ViewOnClickListenerC19428xb021cc2c viewOnClickListenerC19428xb021cc2c = this.f267350b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(viewOnClickListenerC19428xb021cc2c.f267240d, "onVideoEmptied");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.ViewOnClickListenerC19428xb021cc2c.a(viewOnClickListenerC19428xb021cc2c);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.InterfaceC27815xc8aac369
    /* renamed from: onVideoEnded */
    public void mo51515x653dba3e() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.ViewOnClickListenerC19428xb021cc2c viewOnClickListenerC19428xb021cc2c = this.f267350b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(viewOnClickListenerC19428xb021cc2c.f267240d, "onVideoEnded");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.ViewOnClickListenerC19428xb021cc2c.d(viewOnClickListenerC19428xb021cc2c, false);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.ViewOnClickListenerC19428xb021cc2c.a(viewOnClickListenerC19428xb021cc2c);
        viewOnClickListenerC19428xb021cc2c.getMpShareVideoReport().b(viewOnClickListenerC19428xb021cc2c.f267258x, 7, viewOnClickListenerC19428xb021cc2c.getEnterId(), 101);
        viewOnClickListenerC19428xb021cc2c.getMpShareVideoReport().f267376i = 4;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.InterfaceC27815xc8aac369
    /* renamed from: onVideoEnterFullscreen */
    public void mo51516x80540b37(boolean z17, long j17, double d17, double d18, boolean z18, boolean z19, double d19, double d27, double[] dArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.ViewOnClickListenerC19428xb021cc2c viewOnClickListenerC19428xb021cc2c = this.f267350b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(viewOnClickListenerC19428xb021cc2c.f267240d, "onVideoEnterFullscreen isVideoTag:" + z17 + ", id:" + j17 + ", width:" + d17 + ", height:" + d18 + ", paused:" + z18 + ", seeking:" + z19 + ", currentTime:" + d19 + ", duration:" + d27 + ", buffered:" + java.util.Arrays.toString(dArr));
        boolean z27 = z18 ^ true;
        viewOnClickListenerC19428xb021cc2c.E = z27;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.ViewOnClickListenerC19428xb021cc2c.d(viewOnClickListenerC19428xb021cc2c, z27);
        if (viewOnClickListenerC19428xb021cc2c.E) {
            viewOnClickListenerC19428xb021cc2c.getMpShareVideoReport().f267376i = 1;
            viewOnClickListenerC19428xb021cc2c.getMpShareVideoReport().b(viewOnClickListenerC19428xb021cc2c.f267258x, viewOnClickListenerC19428xb021cc2c.getMpShareVideoReport().a(), viewOnClickListenerC19428xb021cc2c.getEnterId(), 101);
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.InterfaceC27815xc8aac369
    /* renamed from: onVideoError */
    public void mo51517x653fc18c(int i17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.ViewOnClickListenerC19428xb021cc2c viewOnClickListenerC19428xb021cc2c = this.f267350b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(viewOnClickListenerC19428xb021cc2c.f267240d, "onVideoError " + i17 + ", " + str);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.ViewOnClickListenerC19428xb021cc2c.d(viewOnClickListenerC19428xb021cc2c, false);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.ViewOnClickListenerC19428xb021cc2c.a(viewOnClickListenerC19428xb021cc2c);
        viewOnClickListenerC19428xb021cc2c.getMpShareVideoReport().f267376i = 4;
        viewOnClickListenerC19428xb021cc2c.getMpShareVideoReport().f267372e = str;
        viewOnClickListenerC19428xb021cc2c.getMpShareVideoReport().b(viewOnClickListenerC19428xb021cc2c.f267258x, 11, viewOnClickListenerC19428xb021cc2c.getEnterId(), 101);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.InterfaceC27815xc8aac369
    /* renamed from: onVideoExitFullscreen */
    public void mo51518xf70b0875() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f267350b.f267240d, "onVideoExitFullscreen");
    }

    @Override // com.p314xaae8f345.p3210x3857dc.InterfaceC27815xc8aac369
    /* renamed from: onVideoPause */
    public void mo51519x65d3157a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.ViewOnClickListenerC19428xb021cc2c viewOnClickListenerC19428xb021cc2c = this.f267350b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(viewOnClickListenerC19428xb021cc2c.f267240d, "onVideoPause");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.ViewOnClickListenerC19428xb021cc2c.d(viewOnClickListenerC19428xb021cc2c, false);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.ViewOnClickListenerC19428xb021cc2c.a(viewOnClickListenerC19428xb021cc2c);
        if (viewOnClickListenerC19428xb021cc2c.getMpShareVideoReport().f267376i != 3) {
            viewOnClickListenerC19428xb021cc2c.getMpShareVideoReport().b(viewOnClickListenerC19428xb021cc2c.f267258x, 8, viewOnClickListenerC19428xb021cc2c.getEnterId(), 101);
        }
        viewOnClickListenerC19428xb021cc2c.getMpShareVideoReport().f267376i = 3;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.InterfaceC27815xc8aac369
    /* renamed from: onVideoPlay */
    public void mo51520x4d9b9b30() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.ViewOnClickListenerC19428xb021cc2c viewOnClickListenerC19428xb021cc2c = this.f267350b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(viewOnClickListenerC19428xb021cc2c.f267240d, "onVideoPlay");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.ViewOnClickListenerC19428xb021cc2c.d(viewOnClickListenerC19428xb021cc2c, true);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.ViewOnClickListenerC19428xb021cc2c.a(viewOnClickListenerC19428xb021cc2c);
        if (viewOnClickListenerC19428xb021cc2c.getMpShareVideoReport().f267376i != 2) {
            viewOnClickListenerC19428xb021cc2c.getMpShareVideoReport().b(viewOnClickListenerC19428xb021cc2c.f267258x, viewOnClickListenerC19428xb021cc2c.getMpShareVideoReport().a(), viewOnClickListenerC19428xb021cc2c.getEnterId(), 101);
        }
        viewOnClickListenerC19428xb021cc2c.getMpShareVideoReport().f267376i = 2;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.InterfaceC27815xc8aac369
    /* renamed from: onVideoPlaying */
    public void mo51521x4f11eeb2() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.ViewOnClickListenerC19428xb021cc2c viewOnClickListenerC19428xb021cc2c = this.f267350b;
        java.lang.String str = viewOnClickListenerC19428xb021cc2c.f267240d;
        if (!viewOnClickListenerC19428xb021cc2c.E) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.ViewOnClickListenerC19428xb021cc2c.d(viewOnClickListenerC19428xb021cc2c, true);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.ViewOnClickListenerC19428xb021cc2c.a(viewOnClickListenerC19428xb021cc2c);
        }
        viewOnClickListenerC19428xb021cc2c.getMpShareVideoReport().f267376i = 2;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.InterfaceC27815xc8aac369
    /* renamed from: onVideoRateChange */
    public void mo51522x53fe47ac(double d17) {
    }

    @Override // com.p314xaae8f345.p3210x3857dc.InterfaceC27815xc8aac369
    /* renamed from: onVideoSeeked */
    public void mo51523x59df1e13() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.ViewOnClickListenerC19428xb021cc2c viewOnClickListenerC19428xb021cc2c = this.f267350b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(viewOnClickListenerC19428xb021cc2c.f267240d, "onVideoSeeked");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.ViewOnClickListenerC19428xb021cc2c.a(viewOnClickListenerC19428xb021cc2c);
        viewOnClickListenerC19428xb021cc2c.getMpShareVideoReport().b(viewOnClickListenerC19428xb021cc2c.f267258x, 13, viewOnClickListenerC19428xb021cc2c.getEnterId(), 101);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.InterfaceC27815xc8aac369
    /* renamed from: onVideoSeeking */
    public void mo51524xe204b4ee() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.ViewOnClickListenerC19428xb021cc2c viewOnClickListenerC19428xb021cc2c = this.f267350b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(viewOnClickListenerC19428xb021cc2c.f267240d, "onVideoSeeking");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.d0(viewOnClickListenerC19428xb021cc2c));
    }

    @Override // com.p314xaae8f345.p3210x3857dc.InterfaceC27815xc8aac369
    /* renamed from: onVideoSizeUpdate */
    public void mo51525x78db6326(double d17, double d18) {
        ot0.m1 m1Var = this.f267350b.f267258x;
        if (!(m1Var != null && m1Var.f454878m == 0)) {
            if (!(m1Var != null && m1Var.f454879n == 0)) {
                return;
            }
        }
        if (m1Var != null) {
            m1Var.f454878m = (int) d17;
        }
        if (m1Var == null) {
            return;
        }
        m1Var.f454879n = (int) d18;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.InterfaceC27815xc8aac369
    /* renamed from: onVideoTimeUpdate */
    public void mo51526x26b58cf2(double d17, double d18, double[] dArr) {
        if (java.lang.System.currentTimeMillis() - this.f267349a >= 500) {
            this.f267349a = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.q(this.f267350b, d18, d17, dArr));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.ViewOnClickListenerC19428xb021cc2c viewOnClickListenerC19428xb021cc2c = this.f267350b;
        viewOnClickListenerC19428xb021cc2c.D = d17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.ViewOnClickListenerC19428xb021cc2c.a(viewOnClickListenerC19428xb021cc2c);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.InterfaceC27815xc8aac369
    /* renamed from: onVideoVolumeChange */
    public void mo51527x6b84ff66(boolean z17) {
    }

    @Override // com.p314xaae8f345.p3210x3857dc.InterfaceC27815xc8aac369
    /* renamed from: onVideoWaiting */
    public void mo51528xaf06b4d1() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.ViewOnClickListenerC19428xb021cc2c viewOnClickListenerC19428xb021cc2c = this.f267350b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(viewOnClickListenerC19428xb021cc2c.f267240d, "onVideoWaiting");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.d0(viewOnClickListenerC19428xb021cc2c));
    }
}
