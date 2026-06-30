package dw3;

/* loaded from: classes4.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 f325810d;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624) {
        this.f325810d = c16993xacc19624;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaFileUtil", "handleNoNeedRemuxCaptureVideo");
        boolean o17 = gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEIXIN_CAMERASAVEVIDEO_STATE_BOOLEAN, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaFileUtil", "handleNoNeedRemuxCaptureVideo videoState : " + o17 + ' ');
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624 = this.f325810d;
        if (o17) {
            java.lang.String h17 = ai3.d.h("mp4");
            ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).Ai(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, c16993xacc19624.B, h17);
            q75.c.f(h17, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        }
        ((pc0.u1) ((qc0.z0) i95.n0.c(qc0.z0.class))).Bi(c16993xacc19624.B);
        dw3.c0.f325715a.j(c16993xacc19624.A);
    }
}
