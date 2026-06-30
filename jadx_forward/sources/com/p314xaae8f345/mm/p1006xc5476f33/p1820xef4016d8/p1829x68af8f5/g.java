package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5;

/* loaded from: classes9.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16344xea85a40c f227391d;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16344xea85a40c c16344xea85a40c) {
        this.f227391d = c16344xea85a40c;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EnvelopeAppBarLayout", "tryStartShowEnvelopStory");
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16344xea85a40c c16344xea85a40c = this.f227391d;
        if (c16344xea85a40c.K1 != 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EnvelopeAppBarLayout", "do not have story, dont show ");
            return;
        }
        boolean z17 = true;
        if (!c16344xea85a40c.f227321w.h1(c16344xea85a40c.A1)) {
            if (((in5.s0) c16344xea85a40c.f227321w.p0(c16344xea85a40c.A1)) != null) {
                c16344xea85a40c.f227321w.i1(1);
                return;
            }
            return;
        }
        c16344xea85a40c.getClass();
        int g17 = bm5.o1.f104252a.g(bm5.h0.RepairerConfig_Pay_LuckyMoneyEnvelopePreviewVideo_Int, 0);
        if (g17 != 1 && (g17 == 2 || ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LUCKY_MONEY_STORY_DISABLE_AUTO_PLAY_INT_SYNC, 0)).intValue() != 0)) {
            z17 = false;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EnvelopeAppBarLayout", "tryStartPreviewVideo");
            c16344xea85a40c.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.h(c16344xea85a40c), 10L);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EnvelopeAppBarLayout", "disable auto play");
        }
        c16344xea85a40c.f227321w.i1(2);
    }
}
