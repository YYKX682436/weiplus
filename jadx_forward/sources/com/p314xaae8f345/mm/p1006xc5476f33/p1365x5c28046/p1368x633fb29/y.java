package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29;

/* loaded from: classes12.dex */
public final class y extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public y() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5417xb0026372 event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5417xb0026372) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = new com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4();
        am.n9 n9Var = event.f135764g;
        c21053xdbf1e5f4.f68657xb76d85ab = n9Var.f88940b;
        c21053xdbf1e5f4.f68673x225f1eb0 = n9Var.f88942d;
        c21053xdbf1e5f4.f68642xf11e6e15 = n9Var.f88943e;
        c21053xdbf1e5f4.f68659x5efe714f = n9Var.f88944f;
        c21053xdbf1e5f4.f68686x7b284d5e = n9Var.f88941c;
        c21053xdbf1e5f4.f68671x4b6e68b9 = n9Var.f88945g;
        c21053xdbf1e5f4.f68663x861009b5 = n9Var.f88946h;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 u17 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().u1(c21053xdbf1e5f4.mo42933xb5885648());
        int i17 = n9Var.f88939a;
        if (i17 != 3) {
            if (i17 != 1) {
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSEmojiLogic", "emoji download: %s", c21053xdbf1e5f4.mo42933xb5885648());
            java.util.Set set = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.b0.f179073a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(set);
            java.lang.String mo42933xb5885648 = c21053xdbf1e5f4.mo42933xb5885648();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo42933xb5885648, "getMd5(...)");
            set.add(mo42933xb5885648);
            if (u17 == null) {
                c21053xdbf1e5f4.f68685x2261e7f9 = 1;
                ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
                com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().J0(c21053xdbf1e5f4);
            }
            zq.h.f556505a.e(c21053xdbf1e5f4, new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.x(c21053xdbf1e5f4));
            return false;
        }
        java.lang.String N0 = c21053xdbf1e5f4.N0();
        am.o9 o9Var = event.f135765h;
        if (u17 == null || (u17.f68678x13320507 & 1) != 1) {
            o9Var.f89051a = N0;
        } else {
            java.io.File cacheDir = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getCacheDir();
            java.lang.String md52 = n9Var.f88945g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(md52, "md5");
            byte[] bytes = md52.getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            java.lang.String o17 = new com.p314xaae8f345.mm.vfs.r6(cacheDir, kk.k.g(bytes)).o();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
            if (com.p314xaae8f345.mm.vfs.w6.j(N0) && !com.p314xaae8f345.mm.vfs.w6.j(o17)) {
                com.p314xaae8f345.mm.vfs.w6.a(o17, ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).E(u17));
            }
            o9Var.f89051a = o17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSEmojiLogic", "gen path: %s", o9Var.f89051a);
        return false;
    }
}
