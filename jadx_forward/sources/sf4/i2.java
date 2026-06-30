package sf4;

/* loaded from: classes4.dex */
public final class i2 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.b1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sf4.j2 f489027d;

    public i2(sf4.j2 j2Var) {
        this.f489027d = j2Var;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void E(java.lang.String str, java.lang.String str2) {
        sf4.j2 j2Var = this.f489027d;
        j2Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Gallery.StoryVideoViewMgr", "videoViewCallback onVideoEnded: " + str + ", meidiaId:" + str2);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6936x5d31fefc c6936x5d31fefc = mf4.d.f407696d;
        c6936x5d31fefc.f142466s = c6936x5d31fefc.f142466s + 1;
        if4.h hVar = j2Var.f489037f;
        if (hVar == null || !mf4.b.f407675a.a()) {
            return;
        }
        long j17 = hVar.f372787b;
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        java.util.Map map = mf4.b.f407677c;
        if (map.containsKey(valueOf)) {
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(map.get(java.lang.Long.valueOf(j17)));
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void I(java.lang.String str, java.lang.String str2, int i17, int i18) {
        sf4.j2 j2Var = this.f489027d;
        j2Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Gallery.StoryVideoViewMgr", "videoViewCallback onGetVideoSize: " + str + ", " + j2Var.f489035d + ", meidiaId:" + str2);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void N(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
        this.f489027d.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Gallery.StoryVideoViewMgr", "videoViewCallback onError: " + str + ", meidiaId:" + str2 + ", errorMsg:" + str3 + ", what:" + i17 + ", extra:" + i18);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void N5(java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
        bool.booleanValue();
        sf4.j2 j2Var = this.f489027d;
        j2Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Gallery.StoryVideoViewMgr", "videoViewCallback onVideoWaiting: " + str + ", meidiaId:" + str2);
        if4.h hVar = j2Var.f489037f;
        if (hVar != null) {
            long j17 = mf4.c.f407685d;
            long j18 = hVar.f372787b;
            if (j17 > 0 && j18 != 0 && j18 == 0 && mf4.c.f407684c <= 0 && mf4.c.f407683b > 0) {
                mf4.c.f407692k = true;
            }
            if (mf4.b.f407675a.a()) {
                java.lang.Long valueOf = java.lang.Long.valueOf(j18);
                java.util.Map map = mf4.b.f407677c;
                if (map.containsKey(valueOf)) {
                    p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(map.get(java.lang.Long.valueOf(j18)));
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void i(java.lang.String str, java.lang.String str2) {
        this.f489027d.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Gallery.StoryVideoViewMgr", "videoViewCallback onVideoPause: " + str + ", meidiaId:" + str2);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void l(java.lang.String str, java.lang.String str2) {
        sf4.j2 j2Var = this.f489027d;
        j2Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("videoViewCallback onVideoPlay: ");
        sb6.append(str);
        sb6.append(' ');
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18499x2fc2446b c18499x2fc2446b = j2Var.f489032a;
        sb6.append(c18499x2fc2446b != null ? c18499x2fc2446b.mo66135x23a7af9b() : null);
        sb6.append(", ");
        sb6.append(j2Var.f489035d);
        sb6.append(", meidiaId:");
        sb6.append(str2);
        sb6.append(", isVideoPause:false");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Gallery.StoryVideoViewMgr", sb6.toString());
        r26.i0.q(str, j2Var.f489035d, false, 2, null);
        if4.h hVar = j2Var.f489037f;
        if (hVar != null) {
            long j17 = mf4.c.f407685d;
            long j18 = hVar.f372787b;
            if (j17 > 0) {
                long j19 = mf4.c.f407684c;
                long j27 = mf4.c.f407683b;
                if (j18 != 0 && j18 == 0 && j19 <= 0 && j27 > 0) {
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    mf4.c.f407684c = java.lang.System.currentTimeMillis() - j27;
                    mf4.c.f407690i = java.lang.System.currentTimeMillis();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryBrowseIDKeyStat", "canPlay " + mf4.c.f407684c);
                    mf4.c.f407692k = false;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                    g0Var.C(988L, 34L, mf4.c.f407684c);
                    g0Var.C(988L, 35L, 1L);
                    g0Var.C(988L, 71L, mf4.c.f407684c);
                    g0Var.C(988L, 70L, 1L);
                    if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) || com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40077x31713d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                        g0Var.C(988L, 73L, mf4.c.f407684c);
                        g0Var.C(988L, 72L, 1L);
                    }
                    long j28 = mf4.c.f407684c;
                    if (j28 <= 400) {
                        g0Var.C(988L, 100L, j28);
                    } else if (j28 <= 800) {
                        g0Var.C(988L, 101L, j28);
                    } else if (j28 <= 1600) {
                        g0Var.C(988L, 102L, j28);
                    } else if (j28 <= 3200) {
                        g0Var.C(988L, 103L, j28);
                    } else if (j28 <= 5000) {
                        g0Var.C(988L, 104L, j28);
                    } else {
                        g0Var.C(988L, 105L, j28);
                    }
                }
            }
            if (mf4.b.f407675a.a()) {
                java.lang.Long valueOf = java.lang.Long.valueOf(j18);
                java.util.Map map = mf4.b.f407677c;
                map.containsKey(valueOf);
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(map.get(java.lang.Long.valueOf(j18)));
                if (j18 == mf4.b.f407676b && map.containsKey(java.lang.Long.valueOf(j18))) {
                    p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(map.get(java.lang.Long.valueOf(j18)));
                }
            }
            sf4.u1 u1Var = sf4.u1.f489116a;
            if (sf4.u1.f489130o != j18) {
                sf4.u1.f489130o = j18;
                if (sf4.u1.f489118c != 0) {
                    sf4.o1 o1Var = sf4.u1.f489126k;
                    if (o1Var != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GroupData.StoryVideoPreloadMgr", "resetWalk");
                        o1Var.f489075e = o1Var.f489071a;
                        o1Var.f489076f = o1Var.f489072b;
                        o1Var.f489077g = 0;
                    }
                    u1Var.m(true);
                }
            }
            java.lang.String username = hVar.f372789d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
            nf4.g g17 = ef4.w.f334001t.g();
            nf4.f L0 = g17.L0(username);
            boolean t07 = L0.t0();
            long j29 = L0.f66290xe188436;
            long j37 = L0.f66294x10ed17fb;
            if (j29 == j37) {
                return;
            }
            L0.f66290xe188436 = j37;
            L0.f66291xea0d6f28 = c01.id.c();
            boolean b17 = g17.b1(L0);
            boolean t08 = L0.t0();
            if (b17 && t07 && !t08) {
                g17.mo142179xf35bbb4("notify_story_read", 1, L0);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void m2(java.lang.String str, java.lang.String str2, boolean z17) {
        sf4.j2 j2Var = this.f489027d;
        j2Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("videoViewCallback onVideoWaitingEnd: ");
        sb6.append(str);
        sb6.append(' ');
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18499x2fc2446b c18499x2fc2446b = j2Var.f489032a;
        sb6.append(c18499x2fc2446b != null ? c18499x2fc2446b.mo66135x23a7af9b() : null);
        sb6.append(", ");
        sb6.append(j2Var.f489035d);
        sb6.append(", meidiaId:");
        sb6.append(str2);
        sb6.append(", isVideoPause:false");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Gallery.StoryVideoViewMgr", sb6.toString());
        r26.i0.q(str, j2Var.f489035d, false, 2, null);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void o(java.lang.String str, java.lang.String str2) {
        this.f489027d.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Gallery.StoryVideoViewMgr", "videoViewCallback onPrepared: " + str + ", meidiaId:" + str2);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    /* renamed from: onSeekComplete */
    public void mo55683xe1fdf750(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void p2(java.lang.String str, java.lang.String str2) {
        this.f489027d.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Gallery.StoryVideoViewMgr", "onVideoFirstFrameDraw: " + str + ", meidiaId:" + str2);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void v3(java.lang.String str, java.lang.String str2, int i17, int i18, int i19) {
    }
}
