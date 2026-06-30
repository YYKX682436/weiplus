package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

@yn.c(m177365x976763e5 = sb5.t0.class)
/* loaded from: classes11.dex */
public class gc extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements sb5.t0, l75.z0 {

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fc f280628e;

    /* renamed from: g, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.p2621x8fb0427b.f9 f280630g;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashSet f280629f = new java.util.HashSet();

    /* renamed from: h, reason: collision with root package name */
    public final android.os.Handler f280631h = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ec(this, android.os.Looper.getMainLooper());

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hg
    public void I() {
        super.I();
        ((l75.a1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).wi()).e(this);
        com.p314xaae8f345.mm.p950x112e8cc1.f.d().a();
        this.f280631h.removeCallbacksAndMessages(null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void K() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetChatroomComponent", "[onChattingExitAnimStart] talker:%s, talker_name:%s", this.f280113d.u(), this.f280113d.x());
        if (this.f280113d.D()) {
            this.f280628e.b();
            ((l75.a1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).wi()).e(this);
            if (!this.f280629f.contains(this.f280113d.x())) {
                if (com.p314xaae8f345.mm.p950x112e8cc1.b.f152768a == null) {
                    synchronized (com.p314xaae8f345.mm.p950x112e8cc1.b.class) {
                        if (com.p314xaae8f345.mm.p950x112e8cc1.b.f152768a == null) {
                            com.p314xaae8f345.mm.p950x112e8cc1.b.f152768a = new com.p314xaae8f345.mm.p950x112e8cc1.b();
                        }
                    }
                }
                com.p314xaae8f345.mm.p950x112e8cc1.b bVar = com.p314xaae8f345.mm.p950x112e8cc1.b.f152768a;
                java.lang.String x17 = this.f280113d.x();
                bVar.getClass();
                s75.d.b(new com.p314xaae8f345.mm.p950x112e8cc1.a(bVar, x17), "checkDirtyBlock");
                this.f280629f.add(this.f280113d.x());
            }
            com.p314xaae8f345.mm.p950x112e8cc1.f.d().a();
            this.f280631h.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void a() {
        if (this.f280113d.D()) {
            gm0.j1.e().j(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.cc(this, this.f280113d.x()));
        }
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        xg3.v vVar = (xg3.v) obj;
        java.lang.String str = vVar.f535968b;
        boolean z17 = vVar.f535969c;
        if (str.equals(this.f280113d.x())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetChatroomComponent", "[onNotifyChange] talker:%s id:%s isInsertForWrap:%s", this.f280113d.x(), java.lang.Integer.valueOf(vVar.f535967a), java.lang.Boolean.valueOf(vVar.f535969c));
            if (i17 == 4 && !z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetChatroomComponent", "[onNotifyChange] resetDataPresenter! username:".concat(str));
                this.f280631h.sendEmptyMessage(8);
            }
            if (z17) {
                return;
            }
            if (i17 == 2 || i17 == 4) {
                com.p314xaae8f345.mm.p2621x8fb0427b.c3 i18 = ((com.p314xaae8f345.mm.p2621x8fb0427b.d3) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).wi()).i(this.f280113d.x());
                com.p314xaae8f345.mm.p950x112e8cc1.f.d().c(this.f280113d.x(), 1 + i18.f69291x16eb58cf, i18.f69293xcef36faa, 0, null);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void z() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetChatroomComponent", "[onChattingEnterAnimStart] talker:%s, talker_name:%s", this.f280113d.u(), this.f280113d.x());
        if (this.f280113d.D()) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.lang.Object wi6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).wi();
            ((l75.a1) wi6).f398472c.a(this, gm0.j1.e().a());
            this.f280628e = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fc(this, this.f280113d.x(), null);
            ((ku5.t0) ku5.t0.f394148d).g(this.f280628e);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetChatroomComponent", "[onChattingEnterAnimStart] cost:%sms talker:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), this.f280113d.x());
        }
    }
}
