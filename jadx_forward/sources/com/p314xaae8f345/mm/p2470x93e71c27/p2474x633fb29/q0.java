package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29;

/* loaded from: classes11.dex */
public class q0 implements com.p314xaae8f345.mm.p944x882e457a.i1 {
    @Override // com.p314xaae8f345.mm.p944x882e457a.t0
    public com.p314xaae8f345.mm.p944x882e457a.q0 b1(com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        boolean z17;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 o27;
        r45.j4 j4Var = p0Var.f152259a;
        if (j4Var == null || j4Var.f459093g != 47) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f("MicroMsg.EmojiExtension", "parseEmojiMsg failed, invalid cmdAM");
            return null;
        }
        java.lang.String g17 = x51.j1.g(j4Var.f459091e);
        java.lang.String g18 = x51.j1.g(j4Var.f459092f);
        if (((java.lang.String) c01.d9.b().p().l(2, null)).equals(g17)) {
            g17 = g18;
        }
        java.lang.String g19 = x51.j1.g(j4Var.f459094h);
        s25.a wi6 = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi();
        long j17 = j4Var.f459101r;
        java.lang.String str = j4Var.f459099p;
        ((y12.h) wi6).getClass();
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.K3(g17)) {
            g30.e eVar = (g30.e) i95.n0.c(g30.e.class);
            eVar.getClass();
            com.p314xaae8f345.mm.p2621x8fb0427b.g5 a17 = com.p314xaae8f345.mm.p2621x8fb0427b.g5.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(g19, "msg", null), g17, g19, str);
            if (a17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiBypService", "prepareEmoji failed. emoji msg info is null.");
            } else {
                a17.f275491h = j17;
                java.lang.Long valueOf = java.lang.Long.valueOf(j17);
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiBypService", "prepareEmoji msgSvrId[%d], stack[%s]", valueOf, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
                gm0.j1.e().j(new g30.c(eVar, a17.f275490g));
                r45.j4 j4Var2 = p0Var.f152259a;
                if (j4Var2 != null && j4Var2.f459101r == a17.f275491h) {
                    a17.f275502s = c01.w9.q(p0Var);
                    a17.f275503t = j4Var2.f459102s;
                    a17.f275504u = j4Var2.f459098o;
                }
                ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
                com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 u17 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().u1(a17.f275487d);
                if (u17 != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiBypService", "downloadEmoji: db emoji info not null %s msgInfomd5 %s svrId %s", u17.f68671x4b6e68b9, a17.f275487d, java.lang.Long.valueOf(a17.f275491h));
                    n22.m.b(a17, u17);
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
                    com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().G2(u17);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiBypService", "downloadEmoji: create emoji info %s", a17.f275487d);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiBypService", "createEmojiInfo: %s", a17.f275487d);
                    u17 = new com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4();
                    n22.m.b(a17, u17);
                    u17.f68685x2261e7f9 = 1;
                    u17.f68682x29d3a50c = 8;
                    u17.f68653x95b20dd4 = 65;
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
                    com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().J0(u17);
                }
                if (a17.f275501r) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiBypService", "insertEmojiMsg: %s, %s msgSvrId: %s", a17.f275487d, u17.f68671x4b6e68b9, java.lang.Long.valueOf(a17.f275491h));
                    if (a17.f275491h == 0 || (o27 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(a17.f275484a, a17.f275491h)) == null || o27.I0() != a17.f275491h) {
                        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(a17.f275484a, true);
                        if (n17 == null || ((int) n17.E2) == 0) {
                            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3(a17.f275484a);
                            z3Var.mo43621x7650bebc(2);
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().h0(z3Var);
                        }
                        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                        f9Var.m124850x7650bebc(47);
                        f9Var.u1(a17.f275484a);
                        f9Var.j1(c01.z1.J(a17.f275485b) ? 1 : 0);
                        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.s5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.s5.class))).fj(f9Var, u17.mo42933xb5885648());
                        f9Var.o1(a17.f275491h);
                        f9Var.d1(com.p314xaae8f345.mm.p2621x8fb0427b.y4.e(a17.f275485b, 0L, (u17.k() || u17.B1()) ? false : true, u17.mo42933xb5885648(), false, a17.f275492i));
                        f9Var.e1(c01.w9.m(f9Var.Q0(), a17.f275504u));
                        f9Var.r1(3);
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17.f275493j)) {
                            f9Var.u3(a17.f275493j);
                        }
                        c01.w9.n(f9Var, p0Var);
                        c01.w9.x(f9Var);
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiBypService", "start download emoji %s, fileExist %b", u17.mo42933xb5885648(), java.lang.Boolean.valueOf(u17.E0()));
                if (!u17.E0()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiBypService", "cdnurl and cncrypt url is null. ");
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().m0(new xg3.l0(a17.f275484a, "update", null, 0));
                }
            }
        } else {
            com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0 b0Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class);
            b0Var.getClass();
            com.p314xaae8f345.mm.p2621x8fb0427b.g5 a18 = com.p314xaae8f345.mm.p2621x8fb0427b.g5.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(g19, "msg", null), g17, g19, str);
            if (a18 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiFeatureService", "prepareEmoji failed. emoji msg info is null.");
            } else {
                a18.f275491h = j17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiFeatureService", "summerbadcr prepareEmoji msgSvrId[%d]", java.lang.Long.valueOf(j17));
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a18.E)) {
                    byte[] decode = android.util.Base64.decode(a18.E, 0);
                    r45.sq4 sq4Var = new r45.sq4();
                    try {
                        sq4Var.mo11468x92b714fd(decode);
                        com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().a().y0(sq4Var, a18.f275490g, a18.f275487d);
                        java.util.LinkedList linkedList = sq4Var.f467458d;
                        if (linkedList != null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiFeatureService", "emoji desc %s", java.lang.Integer.valueOf(linkedList.size()));
                        }
                    } catch (java.io.IOException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.EmojiFeatureService", e17, "", new java.lang.Object[0]);
                    }
                }
                java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("C2CEmojiNotAutoDownloadTimeRange");
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.f179066a;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17)) {
                    try {
                    } catch (java.lang.Exception e18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmojiLogic", "isInNotAutoDownloadTimeRange :%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e18));
                    }
                    if (d11.b.a(d17)) {
                        z17 = true;
                        b0Var.wi(a18, p0Var, !z17);
                    }
                }
                z17 = false;
                b0Var.wi(a18, p0Var, !z17);
            }
        }
        c01.ea w17 = c01.w9.w(j4Var.f459099p);
        if (w17 == null) {
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiExtension", "bizClientMsgId = %s", w17.f118679e);
        if (w17.f118683i == null || w17.f118684j != 1) {
            return null;
        }
        java.lang.String g27 = x51.j1.g(j4Var.f459091e);
        c01.d9.b().p().w(73729, 1);
        com.p314xaae8f345.mm.p2621x8fb0427b.t8 t8Var = new com.p314xaae8f345.mm.p2621x8fb0427b.t8();
        t8Var.f66507xad49e234 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h7a);
        t8Var.f66508xad24a2e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        t8Var.f66510xe6e11023 = "";
        t8Var.f66512x7236dff2 = t8Var.f66507xad49e234;
        t8Var.f66514x49f69af2 = g27;
        t8Var.f66515x29cbf907 = 18;
        int i18 = j4Var.f459095i;
        t8Var.f66516x10a0fed7 = i18 > 3 ? i18 : 3;
        t8Var.f66517x29d4cc45 = j4Var.f459101r;
        t8Var.f66518x114ef53e = g27;
        t8Var.f66520x2262335f = j4Var.f459093g;
        t8Var.f66511xff7bdab7 = 0;
        t8Var.f66513xe76baaa9 = g27;
        t8Var.f66519x11bb99f1 = w17.f118683i;
        r21.w.Bi().mo880xb970c2b9(t8Var);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5672xb6c0812b c5672xb6c0812b = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5672xb6c0812b();
        c5672xb6c0812b.f135997g.f88959a = g27;
        c5672xb6c0812b.e();
        return null;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.t0
    public void x5(com.p314xaae8f345.mm.p944x882e457a.r0 r0Var) {
    }
}
