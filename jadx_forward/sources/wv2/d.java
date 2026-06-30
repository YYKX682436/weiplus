package wv2;

/* loaded from: classes10.dex */
public final class d implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wv2.f f531536a;

    public d(wv2.f fVar) {
        this.f531536a = fVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        int i18 = fVar.f152149b;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ((r45.iq2) fVar.f152151d).m75936x14adae67(1);
        if (c19792x256d2725 != null) {
            c19792x256d2725.m76784x5db1b11();
        }
        wv2.f fVar2 = this.f531536a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = fVar2.f531538h;
        c14994x9b99c079.m59433x2b7e608b("doPostSceneEnd");
        java.util.concurrent.CountDownLatch countDownLatch = fVar2.f531541n;
        if (i17 == 0 && i18 == 0) {
            fVar2.f531540m = new wv2.h(c14994x9b99c079);
            countDownLatch.countDown();
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a.P(c14994x9b99c079.m59260x51f8f5b0(), i17, i18);
            if (c14994x9b99c079.m59328xcaae1dc7()) {
                mv2.f0 f0Var = mv2.f0.f413094a;
                pm0.v.X(new mv2.w(c14994x9b99c079.m59260x51f8f5b0()));
            }
            fVar2.f531540m = new wv2.n(c14994x9b99c079, 2);
            countDownLatch.countDown();
        }
        return jz5.f0.f384359a;
    }
}
