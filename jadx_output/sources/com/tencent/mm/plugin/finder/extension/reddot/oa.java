package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public class oa {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.autogen.mmdata.rpt.FinderReddotExposeStrategyStruct f105753a = new com.tencent.mm.autogen.mmdata.rpt.FinderReddotExposeStrategyStruct();

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f105754b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f105755c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f105756d;

    public oa() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f105754b = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.EnterFindMoreFriendsUIEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotTrigger$1
            {
                this.__eventId = 281608775;
            }

            /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x00b5 A[Catch: Exception -> 0x012d, TryCatch #0 {Exception -> 0x012d, blocks: (B:6:0x001f, B:9:0x0033, B:10:0x0036, B:13:0x0058, B:14:0x006f, B:17:0x007e, B:19:0x008d, B:21:0x009f, B:22:0x00a2, B:24:0x00a8, B:31:0x00b8, B:32:0x00b5, B:36:0x00bb, B:38:0x00cb, B:40:0x00d9, B:42:0x00ed, B:43:0x00f0, B:49:0x00fc, B:54:0x0102, B:55:0x0105, B:57:0x007b), top: B:5:0x001f }] */
            @Override // com.tencent.mm.sdk.event.IListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean callback(com.tencent.mm.autogen.events.EnterFindMoreFriendsUIEvent r18) {
                /*
                    Method dump skipped, instructions count: 310
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotTrigger$1.callback(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
        this.f105755c = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.QuitFindMoreFriendsUIEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotTrigger$2
            {
                this.__eventId = -971114274;
            }

            /* JADX WARN: Code restructure failed: missing block: B:57:0x00db, code lost:
            
                com.tencent.mm.plugin.finder.extension.reddot.oa.f(r10, r14);
             */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0057 A[Catch: Exception -> 0x00df, TRY_LEAVE, TryCatch #0 {Exception -> 0x00df, blocks: (B:7:0x0029, B:9:0x0031, B:13:0x003c, B:15:0x0044, B:19:0x004f, B:21:0x0057, B:28:0x0081, B:30:0x0089, B:35:0x0096, B:36:0x0099, B:38:0x00a1, B:42:0x00ac, B:44:0x00b2, B:49:0x00bf, B:50:0x00c8, B:52:0x00d0, B:57:0x00db, B:61:0x00c5, B:65:0x006a), top: B:6:0x0029 }] */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0066 A[ADDED_TO_REGION] */
            /* JADX WARN: Removed duplicated region for block: B:30:0x0089 A[Catch: Exception -> 0x00df, TryCatch #0 {Exception -> 0x00df, blocks: (B:7:0x0029, B:9:0x0031, B:13:0x003c, B:15:0x0044, B:19:0x004f, B:21:0x0057, B:28:0x0081, B:30:0x0089, B:35:0x0096, B:36:0x0099, B:38:0x00a1, B:42:0x00ac, B:44:0x00b2, B:49:0x00bf, B:50:0x00c8, B:52:0x00d0, B:57:0x00db, B:61:0x00c5, B:65:0x006a), top: B:6:0x0029 }] */
            /* JADX WARN: Removed duplicated region for block: B:35:0x0096 A[Catch: Exception -> 0x00df, TryCatch #0 {Exception -> 0x00df, blocks: (B:7:0x0029, B:9:0x0031, B:13:0x003c, B:15:0x0044, B:19:0x004f, B:21:0x0057, B:28:0x0081, B:30:0x0089, B:35:0x0096, B:36:0x0099, B:38:0x00a1, B:42:0x00ac, B:44:0x00b2, B:49:0x00bf, B:50:0x00c8, B:52:0x00d0, B:57:0x00db, B:61:0x00c5, B:65:0x006a), top: B:6:0x0029 }] */
            /* JADX WARN: Removed duplicated region for block: B:38:0x00a1 A[Catch: Exception -> 0x00df, TryCatch #0 {Exception -> 0x00df, blocks: (B:7:0x0029, B:9:0x0031, B:13:0x003c, B:15:0x0044, B:19:0x004f, B:21:0x0057, B:28:0x0081, B:30:0x0089, B:35:0x0096, B:36:0x0099, B:38:0x00a1, B:42:0x00ac, B:44:0x00b2, B:49:0x00bf, B:50:0x00c8, B:52:0x00d0, B:57:0x00db, B:61:0x00c5, B:65:0x006a), top: B:6:0x0029 }] */
            /* JADX WARN: Removed duplicated region for block: B:44:0x00b2 A[Catch: Exception -> 0x00df, TryCatch #0 {Exception -> 0x00df, blocks: (B:7:0x0029, B:9:0x0031, B:13:0x003c, B:15:0x0044, B:19:0x004f, B:21:0x0057, B:28:0x0081, B:30:0x0089, B:35:0x0096, B:36:0x0099, B:38:0x00a1, B:42:0x00ac, B:44:0x00b2, B:49:0x00bf, B:50:0x00c8, B:52:0x00d0, B:57:0x00db, B:61:0x00c5, B:65:0x006a), top: B:6:0x0029 }] */
            /* JADX WARN: Removed duplicated region for block: B:49:0x00bf A[Catch: Exception -> 0x00df, TryCatch #0 {Exception -> 0x00df, blocks: (B:7:0x0029, B:9:0x0031, B:13:0x003c, B:15:0x0044, B:19:0x004f, B:21:0x0057, B:28:0x0081, B:30:0x0089, B:35:0x0096, B:36:0x0099, B:38:0x00a1, B:42:0x00ac, B:44:0x00b2, B:49:0x00bf, B:50:0x00c8, B:52:0x00d0, B:57:0x00db, B:61:0x00c5, B:65:0x006a), top: B:6:0x0029 }] */
            /* JADX WARN: Removed duplicated region for block: B:52:0x00d0 A[Catch: Exception -> 0x00df, TryCatch #0 {Exception -> 0x00df, blocks: (B:7:0x0029, B:9:0x0031, B:13:0x003c, B:15:0x0044, B:19:0x004f, B:21:0x0057, B:28:0x0081, B:30:0x0089, B:35:0x0096, B:36:0x0099, B:38:0x00a1, B:42:0x00ac, B:44:0x00b2, B:49:0x00bf, B:50:0x00c8, B:52:0x00d0, B:57:0x00db, B:61:0x00c5, B:65:0x006a), top: B:6:0x0029 }] */
            /* JADX WARN: Removed duplicated region for block: B:60:0x00c3  */
            @Override // com.tencent.mm.sdk.event.IListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean callback(com.tencent.mm.autogen.events.QuitFindMoreFriendsUIEvent r18) {
                /*
                    Method dump skipped, instructions count: 250
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotTrigger$2.callback(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
        this.f105756d = java.util.Arrays.asList("FinderEntrance", "NearbyEntrance", "FinderLiveEntrance");
    }

    public static void a(com.tencent.mm.plugin.finder.extension.reddot.oa oaVar, java.lang.String str) {
        oaVar.getClass();
        ((c61.l7) i95.n0.c(c61.l7.class)).nk().U0(str);
    }

    public static boolean b(com.tencent.mm.plugin.finder.extension.reddot.oa oaVar, java.lang.String str) {
        oaVar.getClass();
        boolean m07 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().m0(str);
        if (m07) {
            oaVar.n(3, ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0(str));
        }
        return m07 && (oaVar.k(str) ^ true);
    }

    public static boolean c(com.tencent.mm.plugin.finder.extension.reddot.oa oaVar, java.lang.String str) {
        boolean z17;
        oaVar.getClass();
        r45.f03 I0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0(str);
        int i17 = oaVar.i(I0);
        boolean z18 = false;
        if (i17 == 1) {
            oaVar.n(1, I0);
            z17 = true;
        } else {
            z17 = false;
        }
        boolean z19 = !oaVar.k(str);
        if (z17 && z19) {
            z18 = true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderRedDotTrigger", "checkRedDotExposeLimitWhenEnter 最终是否发起sync=%s, path=%s, strategy=%s, needSync=%s,enableSync(进入发现页是否允许发起sync)=%s ", java.lang.Boolean.valueOf(z18), str, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z19));
        return z18;
    }

    public static void d(com.tencent.mm.plugin.finder.extension.reddot.oa oaVar, com.tencent.mm.plugin.finder.extension.reddot.pa paVar) {
        oaVar.getClass();
        j75.f Ni = ((en3.v) ((ra0.v) i95.n0.c(ra0.v.class))).Ni();
        if (Ni != null) {
            Ni.B3(new sa0.k(null, 1002, 4, oaVar.l("NewLife.Entrance")));
        }
        oaVar.m(paVar, "newlife sync");
    }

    public static void e(com.tencent.mm.plugin.finder.extension.reddot.oa oaVar, com.tencent.mm.plugin.finder.extension.reddot.pa paVar, java.lang.String str) {
        ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).Zi(new tg0.q2(3002, oaVar.l(str), false, null));
        oaVar.m(paVar, "web search sync");
    }

    public static void f(com.tencent.mm.plugin.finder.extension.reddot.oa oaVar, com.tencent.mm.plugin.finder.extension.reddot.pa paVar) {
        oaVar.getClass();
        hm4.c cVar = (hm4.c) ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).f397137h.getValue();
        if (cVar.b()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TingSyncExtension", "syncOnRedDotExposeReplace");
            w71.m1 a17 = cVar.a();
            if (a17 != null) {
                urgen.ur_C563.UR_379F.UR_0E0E(((w71.n1) a17).getCppPointer(), 10);
            }
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.TingSyncExtension", "handleNotifySync no need do sync");
        }
        oaVar.m(paVar, "ting sync");
    }

    public static boolean g(com.tencent.mm.plugin.finder.extension.reddot.oa oaVar, com.tencent.mm.autogen.events.QuitFindMoreFriendsUIEvent quitFindMoreFriendsUIEvent, java.lang.String str, int i17) {
        boolean z17;
        oaVar.getClass();
        int P = com.tencent.mm.sdk.platformtools.t8.P(quitFindMoreFriendsUIEvent.f54640g.f6858b, -1);
        if (P <= -1 || P >= 255) {
            P = -1;
        }
        if (P <= -1 || P == i17) {
            return false;
        }
        r45.f03 I0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0(str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkFinderRedDotExposeLimitWhenQuit path=");
        int i18 = oaVar.i(I0);
        if (com.tencent.mm.sdk.platformtools.t8.D0("FinderEntrance", str) && com.tencent.mm.plugin.finder.storage.aj0.f126440a.H()) {
            com.tencent.mm.plugin.finder.extension.reddot.w1 w1Var = (com.tencent.mm.plugin.finder.extension.reddot.w1) i95.n0.c(com.tencent.mm.plugin.finder.extension.reddot.w1.class);
            w1Var.getClass();
            if (com.tencent.mm.plugin.finder.extension.reddot.w1.hj(w1Var, 0, 1, null)) {
                z17 = false;
                sb6.append(str);
                sb6.append(" strategy=");
                sb6.append(i18);
                sb6.append(" pathCanDispose=");
                sb6.append(z17);
                if (i18 == 2 && z17) {
                    oaVar.n(2, I0);
                    oaVar.j(str);
                }
                if (i18 == 1 || !z17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FinderRedDotTrigger", sb6.toString());
                    return false;
                }
                oaVar.n(100, I0);
                oaVar.j(str);
                return oaVar.k(str);
            }
        }
        z17 = true;
        sb6.append(str);
        sb6.append(" strategy=");
        sb6.append(i18);
        sb6.append(" pathCanDispose=");
        sb6.append(z17);
        if (i18 == 2) {
            oaVar.n(2, I0);
            oaVar.j(str);
        }
        if (i18 == 1) {
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderRedDotTrigger", sb6.toString());
        return false;
    }

    public static boolean h(com.tencent.mm.plugin.finder.extension.reddot.oa oaVar, com.tencent.mm.autogen.events.QuitFindMoreFriendsUIEvent quitFindMoreFriendsUIEvent, java.lang.String str, int i17) {
        oaVar.getClass();
        int P = com.tencent.mm.sdk.platformtools.t8.P(quitFindMoreFriendsUIEvent.f54640g.f6858b, -1);
        if (P <= -1 || P >= 255) {
            P = -1;
        }
        if (P > -1 && P != i17) {
            boolean m07 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().m0(str);
            if (m07) {
                oaVar.n(3, ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0(str));
            }
            boolean k17 = oaVar.k(str);
            if (m07 && k17) {
                return true;
            }
        }
        return false;
    }

    public final int i(r45.f03 f03Var) {
        r45.q40 q40Var;
        if (f03Var != null && (q40Var = f03Var.f373897q) != null) {
            int i17 = f03Var.f373900t;
            if (i17 > 0 && f03Var.f373901u > 0) {
                try {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FinderRedDotTrigger", "[checkFinderTipsShowInfo] path=%s expose_count=%d expose_count_limit=%d strategy=%d", f03Var.f373892i, java.lang.Integer.valueOf(q40Var.f383656d), java.lang.Integer.valueOf(f03Var.f373900t), java.lang.Integer.valueOf(f03Var.f373901u));
                    int i18 = f03Var.f373897q.f383656d;
                    int i19 = f03Var.f373900t;
                    if (i18 >= i19 && i18 >= i19) {
                        return f03Var.f373901u;
                    }
                } catch (java.lang.Exception unused) {
                }
                return 0;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderRedDotTrigger", "[checkFinderTipsShowInfo] expose_count_limit=%d expose_limit_strategy=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(f03Var.f373901u));
        }
        return 0;
    }

    public final void j(java.lang.String str) {
        zy2.fa nk6 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
        if (!com.tencent.mm.plugin.finder.extension.reddot.z2.f106043c.a(str)) {
            nk6.N(str);
            return;
        }
        java.util.Iterator it = nk6.C("exposeTrigger [revokeRedDot]", str, new com.tencent.mm.plugin.finder.extension.reddot.oa$$a()).iterator();
        while (it.hasNext()) {
            nk6.o0("exposeTrigger [revokeRedDot]", (com.tencent.mm.plugin.finder.extension.reddot.jb) it.next());
        }
    }

    public final boolean k(java.lang.String str) {
        if (this.f105756d.contains(str)) {
            if (com.tencent.mm.plugin.finder.storage.aj0.f126440a.K() ? ((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.z70.f(com.tencent.mm.plugin.finder.storage.z70.f128432a, com.tencent.mm.plugin.finder.storage.t70.f127590a, "曝光n次不点击sync是否从进入发现页改为离开发现页", e42.c0.clicfg_finder_reddot_sync_when_quit_find_tab, java.lang.Boolean.FALSE, false, com.tencent.mm.plugin.finder.storage.fh0.f126777d, 8, null)).booleanValue() : ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.aj0.W).getValue()).r()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final int l(java.lang.String str) {
        com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0(str);
        int i17 = 0;
        if (L0 != null) {
            if (L0.f1()) {
                i17 = 1;
            } else if (L0.e1()) {
                i17 = 7;
            } else {
                if (L0.Q0(false) == 9) {
                    i17 = 8;
                } else {
                    if (L0.Q0(false) == 4) {
                        i17 = 3;
                    }
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderRedDotTrigger", "getCgiBizId() called with: cgiBizId:%s", java.lang.Integer.valueOf(i17));
        return i17;
    }

    public final void m(com.tencent.mm.plugin.finder.extension.reddot.pa paVar, java.lang.String str) {
        boolean z17;
        boolean z18 = false;
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            z17 = false;
        }
        if (z17 || z65.c.a()) {
            z18 = true;
        } else {
            kb2.b bVar = kb2.b.f306225a;
        }
        if (z18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderRedDotTrigger", paVar + str);
        }
    }

    public final void n(int i17, r45.f03 f03Var) {
        if (f03Var != null && f03Var.f373897q != null) {
            try {
                com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().L0(f03Var.f373892i);
                com.tencent.mm.autogen.mmdata.rpt.FinderReddotExposeStrategyStruct finderReddotExposeStrategyStruct = this.f105753a;
                finderReddotExposeStrategyStruct.f57767i = i17;
                finderReddotExposeStrategyStruct.f57763e = finderReddotExposeStrategyStruct.b("Path", f03Var.f373892i, true);
                finderReddotExposeStrategyStruct.f57764f = f03Var.f373900t;
                finderReddotExposeStrategyStruct.f57765g = f03Var.f373901u;
                finderReddotExposeStrategyStruct.f57766h = f03Var.f373897q.f383656d;
                finderReddotExposeStrategyStruct.f57762d = finderReddotExposeStrategyStruct.b("TipsId", L0 != null ? L0.field_tipsId : "", true);
                finderReddotExposeStrategyStruct.f57768j = f03Var.f373902v;
                finderReddotExposeStrategyStruct.f57769k = c01.id.c();
                finderReddotExposeStrategyStruct.k();
                com.tencent.mm.autogen.events.FinderRedDotEraseEvent finderRedDotEraseEvent = new com.tencent.mm.autogen.events.FinderRedDotEraseEvent();
                am.xc xcVar = finderRedDotEraseEvent.f54318g;
                xcVar.f8372a = L0;
                xcVar.f8373b = f03Var;
                finderRedDotEraseEvent.e();
                nn3.f fVar = (nn3.f) ((ra0.x) i95.n0.c(ra0.x.class));
                fVar.getClass();
                java.lang.Object[] objArr = new java.lang.Object[1];
                objArr[0] = java.lang.Boolean.valueOf(L0 != null);
                com.tencent.mars.xlog.Log.i("MicroMsg.NewLifeReporter", "reportNewLifeRedDotErase", objArr);
                if (L0.getType() >= 100001 && L0.getType() < 199999) {
                    fVar.Ri("red_dot_erase", L0, f03Var, 1);
                } else if (L0.getType() < 300000 || L0.getType() >= 399999) {
                } else {
                    fVar.Ri("red_dot_erase", L0, f03Var, 1);
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }
}
