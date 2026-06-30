package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

@yn.c(m177365x976763e5 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.lg.class)
/* loaded from: classes4.dex */
public class ol extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.lg {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f281182e = java.util.Collections.synchronizedList(new java.util.ArrayList());

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f281183f = java.util.Collections.synchronizedList(new java.util.ArrayList());

    /* renamed from: g, reason: collision with root package name */
    public boolean f281184g = true;

    /* renamed from: h, reason: collision with root package name */
    public final android.util.SparseArray f281185h = new android.util.SparseArray();

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void E() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryStateComponent", "onChattingEnterAnimEnd: hashCode:%s", java.lang.Integer.valueOf(hashCode()));
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hg
    public void I() {
        super.I();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryStateComponent", "onComponentUnInstall: hashCode:%s", java.lang.Integer.valueOf(hashCode()));
        this.f281182e.clear();
        this.f281185h.clear();
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void K() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryStateComponent", "onChattingExitAnimStart: hashCode:%s", java.lang.Integer.valueOf(hashCode()));
        this.f281182e.clear();
        this.f281185h.clear();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6936x5d31fefc c6936x5d31fefc = mf4.d.f407696d;
        c6936x5d31fefc.f142454g = c6936x5d31fefc.b("SourceUserName", "", false);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6936x5d31fefc c6936x5d31fefc2 = mf4.d.f407696d;
        c6936x5d31fefc2.f142453f = 0L;
        c6936x5d31fefc2.f142455h = 0L;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6928x97fb96f7 c6928x97fb96f7 = mf4.d.f407703k;
        c6928x97fb96f7.f142425d = c6928x97fb96f7.b("SourceUserName", "", true);
        c6928x97fb96f7.f142426e = 0L;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void x() {
        long j17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryStateComponent", "onChattingResume: hashCode:%s", java.lang.Integer.valueOf(hashCode()));
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6928x97fb96f7 c6928x97fb96f7 = mf4.d.f407703k;
        int i17 = 1;
        c6928x97fb96f7.f142425d = c6928x97fb96f7.b("SourceUserName", this.f280113d.x(), true);
        if (this.f281184g) {
            j17 = 2;
        } else {
            java.lang.String x17 = this.f280113d.x();
            if (android.text.TextUtils.isEmpty(x17)) {
                i17 = 0;
            } else if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(ef4.w.f334001t.e(), x17)) {
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(x17, true);
                i17 = n17.t2() ? 3 : n17.r2() ? 4 : 5;
            }
            j17 = i17;
        }
        c6928x97fb96f7.f142426e = j17;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void y() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryStateComponent", "onChattingPause: hashCode:%s", java.lang.Integer.valueOf(hashCode()));
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void z() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryStateComponent", "onChattingEnterAnimStart: user %s hashCode:%s", this.f280113d.x(), java.lang.Integer.valueOf(hashCode()));
        this.f280113d.f542250l.m78680x8f8ecf18(3);
        this.f281182e.clear();
        this.f281183f.clear();
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.f7) ((sb5.e0) this.f280113d.f542241c.a(sb5.e0.class))).f280549f = 0;
        java.lang.String x17 = this.f280113d.x();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x17)) {
            this.f281184g = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(x17);
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6925xaa80d9da c6925xaa80d9da = mf4.d.f407702j;
        c6925xaa80d9da.f142397d = c6925xaa80d9da.b("UserName", this.f280113d.x(), true);
        boolean z17 = this.f281184g;
        c6925xaa80d9da.f142398e = z17 ? 4L : 5L;
        c6925xaa80d9da.f142399f = 0L;
        if (z17) {
            this.f280113d.f542256r = com.p314xaae8f345.mm.ui.x2.a(java.lang.String.valueOf(4L));
        } else {
            this.f280113d.f542256r = com.p314xaae8f345.mm.ui.x2.a(java.lang.String.valueOf(5L));
        }
    }
}
