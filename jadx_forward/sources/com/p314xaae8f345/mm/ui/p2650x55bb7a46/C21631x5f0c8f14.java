package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* renamed from: com.tencent.mm.ui.chatting.ChattingUIProxy */
/* loaded from: classes11.dex */
public class C21631x5f0c8f14 implements com.p314xaae8f345.mm.ui.InterfaceC21384xb1a4d3ab {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b f279813a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f f279814b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f279815c = false;

    /* renamed from: d, reason: collision with root package name */
    public int f279816d = -1;

    public C21631x5f0c8f14(com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b) {
        this.f279813a = abstractC21611x7536149b;
        this.f279814b = activityC21401x6ce6f73f;
    }

    @Override // com.p314xaae8f345.mm.ui.InterfaceC21384xb1a4d3ab
    /* renamed from: onEnterBegin */
    public void mo78433x94b667f0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUIProxy", "[onEnterBegin]");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b = this.f279813a;
        abstractC21611x7536149b.s0();
        if (abstractC21611x7536149b.f39298x5262fd1e || abstractC21611x7536149b.f279688i) {
            abstractC21611x7536149b.L0();
        }
        abstractC21611x7536149b.L0();
        abstractC21611x7536149b.n0();
        if (this.f279816d == -1 || !(this.f279814b instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf)) {
            return;
        }
        abstractC21611x7536149b.m78647x143f1b92().G0(this.f279816d);
    }

    @Override // com.p314xaae8f345.mm.ui.InterfaceC21384xb1a4d3ab
    /* renamed from: onEnterEnd */
    public void mo78434x27949de2() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUIProxy", "[onEnterEnd]");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b = this.f279813a;
        if (abstractC21611x7536149b.J0(256)) {
            abstractC21611x7536149b.m0();
            abstractC21611x7536149b.M0();
            abstractC21611x7536149b.f279685f.f542243e.l0();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.InterfaceC21384xb1a4d3ab
    /* renamed from: onExitBegin */
    public void mo78435xaae90f0c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUIProxy", "[onExitBegin]");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b = this.f279813a;
        if (!abstractC21611x7536149b.H0()) {
            abstractC21611x7536149b.N0();
        }
        if (this.f279814b instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            this.f279816d = abstractC21611x7536149b.m78647x143f1b92().f290206u0;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.InterfaceC21384xb1a4d3ab
    /* renamed from: onExitEnd */
    public void mo78436x13e5bfe() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUIProxy", "[onExitEnd]");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b = this.f279813a;
        abstractC21611x7536149b.l0();
        abstractC21611x7536149b.o0();
        abstractC21611x7536149b.p0(512, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.h1(abstractC21611x7536149b));
        abstractC21611x7536149b.t0();
        abstractC21611x7536149b.P0();
        abstractC21611x7536149b.P0();
    }

    @Override // com.p314xaae8f345.mm.ui.InterfaceC21384xb1a4d3ab
    /* renamed from: onInit */
    public void mo78437xc39adf8f(int i17, boolean z17) {
        boolean z18;
        this.f279815c = true;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b = this.f279813a;
        abstractC21611x7536149b.f279688i = true;
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = this.f279814b;
        java.util.List<p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670> m7675x1626d96d = activityC21401x6ce6f73f.mo7595x9cdc264().m7675x1626d96d();
        if (m7675x1626d96d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUIProxy", "fragments is null");
        } else if (m7675x1626d96d.size() >= 5) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingUIProxy", "fragments more than 5! %s", java.lang.Integer.valueOf(m7675x1626d96d.size()));
            java.util.Iterator<p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670> it = m7675x1626d96d.iterator();
            while (it.hasNext()) {
                if (it.next() instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingUIProxy", "fragments more than 5 and find a ChattingUIFragment!!");
                    z18 = false;
                    break;
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUIProxy", "fragments size %s", java.lang.Integer.valueOf(m7675x1626d96d.size()));
        }
        z18 = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUIProxy", "[onInit] isPreload：%s ok:%s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        if (z18) {
            p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = activityC21401x6ce6f73f.mo7595x9cdc264().m7630xb2c12e75();
            m7630xb2c12e75.h(i17, abstractC21611x7536149b, null, 1);
            m7630xb2c12e75.e();
            activityC21401x6ce6f73f.mo7595x9cdc264().m7662x588126d7();
        } else {
            p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e752 = activityC21401x6ce6f73f.mo7595x9cdc264().m7630xb2c12e75();
            m7630xb2c12e752.k(i17, abstractC21611x7536149b, null);
            m7630xb2c12e752.g();
        }
        if (z17) {
            mo78435xaae90f0c();
            mo78436x13e5bfe();
        }
        abstractC21611x7536149b.f279688i = false;
    }
}
