package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5;

/* loaded from: classes4.dex */
public class q0 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.b1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.b1 f227435d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16346x4deb5237 f227436e;

    public q0(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16346x4deb5237 c16346x4deb5237, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.b1 b1Var, int i17) {
        this.f227436e = c16346x4deb5237;
        this.f227435d = b1Var;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void E(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16346x4deb5237 c16346x4deb5237 = this.f227436e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EnvelopeStoryVideoManager", "on video end: %s, %s, callback:%s", str, str2, c16346x4deb5237.f227342n);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.a1 a1Var = c16346x4deb5237.f227342n;
        if (a1Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.e1) a1Var).f227382a.f227349o2.mo50305x3d8a09a2(1);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void I(java.lang.String str, java.lang.String str2, int i17, int i18) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void N(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EnvelopeStoryVideoManager", "onError: %s, %s, %s", str, str2, str3);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.b1 b1Var = this.f227435d;
        g0Var.d(19228, b1Var.f227356c, java.lang.Integer.valueOf(b1Var.f227366m.mo61527x6d590e18()), 2, java.lang.Integer.valueOf(b1Var.f227362i), java.lang.Integer.valueOf(b1Var.f227366m.m66134xdd2dfd95()), java.lang.Integer.valueOf(b1Var.f227361h), 0, java.lang.Integer.valueOf(i17));
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void N5(java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EnvelopeStoryVideoManager", "onVideoWaiting: %s, %s, %s", str, str2, bool);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16346x4deb5237 c16346x4deb5237 = this.f227436e;
        if (c16346x4deb5237.f227335d.isFinishing() || c16346x4deb5237.f227335d.isDestroyed()) {
            c16346x4deb5237.f();
            return;
        }
        int elapsedRealtime = ((int) android.os.SystemClock.elapsedRealtime()) / 1000;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.b1 b1Var = this.f227435d;
        b1Var.f227360g = elapsedRealtime;
        android.widget.ProgressBar progressBar = b1Var.f227372s;
        if (progressBar != null) {
            progressBar.bringToFront();
            b1Var.f227372s.setVisibility(0);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void i(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EnvelopeStoryVideoManager", "onVideoPause: %s, %s", str, str2);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void l(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EnvelopeStoryVideoManager", "onVideoPlay: %s, %s", str, str2);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void m2(java.lang.String str, java.lang.String str2, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EnvelopeStoryVideoManager", "onVideoWaitingEnd: %s, %s", str, str2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.b1 b1Var = this.f227435d;
        if (b1Var.f227360g > 0) {
            b1Var.f227361h = (int) (b1Var.f227361h + ((android.os.SystemClock.elapsedRealtime() / 1000) - b1Var.f227360g));
            b1Var.f227360g = 0;
        }
        android.widget.ProgressBar progressBar = b1Var.f227372s;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void o(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EnvelopeStoryVideoManager", "on prepared: %s, %s", str, str2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.b1 b1Var = this.f227435d;
        b1Var.f227366m.mo61527x6d590e18();
        b1Var.getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.p0(this), 10L);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    /* renamed from: onSeekComplete */
    public void mo55683xe1fdf750(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void p2(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EnvelopeStoryVideoManager", "onVideoFirstFrameDraw: %s, %s", str, str2);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void v3(java.lang.String str, java.lang.String str2, int i17, int i18, int i19) {
    }
}
