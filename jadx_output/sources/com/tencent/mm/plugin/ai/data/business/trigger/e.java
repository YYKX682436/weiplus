package com.tencent.mm.plugin.ai.data.business.trigger;

/* loaded from: classes8.dex */
public class e implements com.tencent.mm.plugin.ai.data.business.trigger.h {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f74662a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f74663b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f74664c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f74665d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f74666e;

    public e() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f74665d = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.QuitFindMoreFriendsUIEvent>(a0Var) { // from class: com.tencent.mm.plugin.ai.data.business.trigger.FindMoreFriendsUIReporter$1
            {
                this.__eventId = -971114274;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.QuitFindMoreFriendsUIEvent quitFindMoreFriendsUIEvent) {
                com.tencent.mm.autogen.events.QuitFindMoreFriendsUIEvent quitFindMoreFriendsUIEvent2 = quitFindMoreFriendsUIEvent;
                try {
                    com.tencent.mm.plugin.ai.data.business.trigger.e.c(com.tencent.mm.plugin.ai.data.business.trigger.e.this, quitFindMoreFriendsUIEvent2);
                    int P = com.tencent.mm.sdk.platformtools.t8.P(quitFindMoreFriendsUIEvent2.f54640g.f6858b, -1);
                    if (P > -1 && P < 255) {
                        jx3.f.INSTANCE.idkeyStat(1437L, P, 1L, false);
                        return false;
                    }
                    jx3.f.INSTANCE.idkeyStat(1437L, 255L, 1L, false);
                    return false;
                } catch (java.lang.Exception unused) {
                    return false;
                }
            }
        };
        this.f74666e = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.EnterFindMoreFriendsUIEvent>(a0Var) { // from class: com.tencent.mm.plugin.ai.data.business.trigger.FindMoreFriendsUIReporter$2
            {
                this.__eventId = 281608775;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.EnterFindMoreFriendsUIEvent enterFindMoreFriendsUIEvent) {
                com.tencent.mm.plugin.ai.data.business.trigger.e eVar = com.tencent.mm.plugin.ai.data.business.trigger.e.this;
                try {
                    eVar.f74662a = z71.b.a().b("FinderEntrance");
                    eVar.f74663b = z71.b.a().b("FinderLiveEntrance");
                    eVar.f74664c = z71.b.a().b("NewLife.Entrance");
                    com.tencent.mm.plugin.ai.data.business.trigger.e.d(eVar);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FindMoreFriendsUIReporter", e17, "enter ui but finder reddot json error", new java.lang.Object[0]);
                }
                return false;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void c(com.tencent.mm.plugin.ai.data.business.trigger.e eVar, com.tencent.mm.autogen.events.QuitFindMoreFriendsUIEvent quitFindMoreFriendsUIEvent) {
        eVar.getClass();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        int[] iArr = quitFindMoreFriendsUIEvent.f54640g.f6861e;
        if ((iArr == null || iArr.length <= 0) != false) {
            iArr = z71.f.Bi().wi();
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        am.hp hpVar = quitFindMoreFriendsUIEvent.f54640g;
        stringBuffer.append(hpVar.f6857a);
        stringBuffer.append(",2,");
        stringBuffer.append(hpVar.f6858b);
        stringBuffer.append(",");
        stringBuffer.append(hpVar.f6859c);
        stringBuffer.append(",");
        stringBuffer.append(hpVar.f6860d);
        stringBuffer.append(",");
        stringBuffer.append(hpVar.f6860d - hpVar.f6859c);
        stringBuffer.append(",");
        int i17 = 0;
        while (true) {
            if (i17 >= iArr.length) {
                break;
            }
            if (i17 == 12) {
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                if (vd2.t3.f435921a.f()) {
                    int i18 = iArr[i17];
                    stringBuffer.append(i18 != 0 ? i18 : 2);
                    stringBuffer.append(",");
                } else {
                    stringBuffer.append("-1,");
                }
            } else {
                int i19 = iArr[i17];
                stringBuffer.append(i19 != 0 ? i19 : 2);
                stringBuffer.append(",");
            }
            i17++;
        }
        com.tencent.mm.autogen.mmdata.rpt.FindFriendsEntryRedDotStruct findFriendsEntryRedDotStruct = new com.tencent.mm.autogen.mmdata.rpt.FindFriendsEntryRedDotStruct(stringBuffer.toString());
        findFriendsEntryRedDotStruct.f56435x = findFriendsEntryRedDotStruct.b("Reserved2", "", true);
        findFriendsEntryRedDotStruct.f56436y = findFriendsEntryRedDotStruct.b("Reserved3", "", true);
        am.g20 g20Var = (am.g20) z71.f.Bi().f470521f.get(2);
        findFriendsEntryRedDotStruct.f56437z = findFriendsEntryRedDotStruct.b("FindFriendsTab", g20Var == null ? "" : java.lang.String.format("{\"tabId\":%d;\"redDot\":%d;\"unread\":%d}", java.lang.Integer.valueOf(g20Var.f6731a), java.lang.Integer.valueOf(g20Var.f6732b ? 1 : 0), java.lang.Integer.valueOf(g20Var.f6733c)), true);
        if (com.tencent.mm.sdk.platformtools.t8.D0("1", findFriendsEntryRedDotStruct.f56432u) && com.tencent.mm.sdk.platformtools.t8.K0(eVar.f74662a)) {
            eVar.f74662a = z71.b.a().b("FinderEntrance");
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0("1", findFriendsEntryRedDotStruct.f56433v) && com.tencent.mm.sdk.platformtools.t8.K0(eVar.f74663b)) {
            eVar.f74663b = z71.b.a().b("FinderLiveEntrance");
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(eVar.f74664c)) {
            eVar.f74664c = z71.b.a().b("NewLife.Entrance");
        }
        findFriendsEntryRedDotStruct.A = findFriendsEntryRedDotStruct.b("FinderJson", eVar.f74662a, true);
        findFriendsEntryRedDotStruct.B = findFriendsEntryRedDotStruct.b("FinderLiveJson", eVar.f74663b, true);
        findFriendsEntryRedDotStruct.C = findFriendsEntryRedDotStruct.b("SessionId", ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri(), true);
        findFriendsEntryRedDotStruct.D = findFriendsEntryRedDotStruct.b("IsShowFinderEntrance", z71.b.a().c() ? "1" : "0", true);
        z71.b.a().getClass();
        findFriendsEntryRedDotStruct.E = findFriendsEntryRedDotStruct.b("IsShowFinderRedDot", ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().f0() ? "1" : "0", true);
        findFriendsEntryRedDotStruct.F = findFriendsEntryRedDotStruct.b("IsShowFinderLiveEntrance", z71.b.a().d() ? "1" : "0", true);
        z71.b.a().getClass();
        findFriendsEntryRedDotStruct.G = findFriendsEntryRedDotStruct.b("IsShowFinderLiveRedDot", ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().E() ? "1" : "0", true);
        findFriendsEntryRedDotStruct.f56414J = findFriendsEntryRedDotStruct.b("k1kNewLifeRedDotJson", eVar.f74664c, true);
        z71.b.a().getClass();
        findFriendsEntryRedDotStruct.H = findFriendsEntryRedDotStruct.b("IsShowBrowseEntrance", ((lf0.h0) ((mf0.g0) i95.n0.c(mf0.g0.class))).Ni() ? "1" : "0", true);
        z71.b.a().getClass();
        findFriendsEntryRedDotStruct.I = findFriendsEntryRedDotStruct.b("IsShowBrowseRedDot", ((vd0.o2) ((wd0.s1) i95.n0.c(wd0.s1.class))).Bi() ? "1" : "0", true);
        z71.b.a().getClass();
        findFriendsEntryRedDotStruct.K = findFriendsEntryRedDotStruct.b("IsShowTingEntrance", ((ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class))).fj() ? "1" : "0", true);
        z71.b.a().getClass();
        findFriendsEntryRedDotStruct.L = findFriendsEntryRedDotStruct.b("IsShowTingRedDot", ((ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class))).Ri() ? "1" : "0", true);
        findFriendsEntryRedDotStruct.M = z71.f.Bi().f470519d;
        findFriendsEntryRedDotStruct.N = z71.f.Bi().Ai();
        findFriendsEntryRedDotStruct.O = com.tencent.mars.comm.NetStatusUtil.getIOSOldNetType(com.tencent.mm.sdk.platformtools.x2.f193071a);
        findFriendsEntryRedDotStruct.P = z71.a.b();
        c81.b wi6 = c81.b.wi();
        wi6.requireAccountInitialized();
        findFriendsEntryRedDotStruct.T = wi6.f39656d.a() == null ? 0 : r2.getInt("last_m7_step_count", 0);
        c81.b wi7 = c81.b.wi();
        wi7.requireAccountInitialized();
        findFriendsEntryRedDotStruct.U = wi7.f39656d.a() != null ? r2.getInt("last_hk_step_count", 0) : 0;
        com.tencent.mm.autogen.mmdata.rpt.AiWeixinGpsInfoStruct aiWeixinGpsInfoStruct = z71.m.wi().f470535f;
        if (aiWeixinGpsInfoStruct != null) {
            findFriendsEntryRedDotStruct.Q = findFriendsEntryRedDotStruct.b("MagicNumA", aiWeixinGpsInfoStruct.f55030g, true);
            findFriendsEntryRedDotStruct.R = findFriendsEntryRedDotStruct.b("MagicNumB", aiWeixinGpsInfoStruct.f55031h, true);
            findFriendsEntryRedDotStruct.S = aiWeixinGpsInfoStruct.f55028e;
        }
        findFriendsEntryRedDotStruct.k();
        eVar.f74663b = "";
        eVar.f74662a = "";
        com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUIReporter", "report find friend entry [%d %d] network[%d]", java.lang.Long.valueOf(findFriendsEntryRedDotStruct.M), java.lang.Long.valueOf(findFriendsEntryRedDotStruct.N), java.lang.Integer.valueOf(findFriendsEntryRedDotStruct.O));
        com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUIReporter", "report find friend cost[%d] [%s]", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), findFriendsEntryRedDotStruct.n());
    }

    public static void d(com.tencent.mm.plugin.ai.data.business.trigger.e eVar) {
        eVar.getClass();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        c81.b wi6 = c81.b.wi();
        wi6.requireAccountInitialized();
        com.tencent.mm.autogen.mmdata.rpt.CalendarStatisticsStruct b17 = wi6.f39656d.b("calendar_statistics_discover");
        if (b17.f55496e == 0) {
            b17.f55496e = java.lang.System.currentTimeMillis();
        }
        b17.f55498g++;
        c81.b wi7 = c81.b.wi();
        wi7.requireAccountInitialized();
        wi7.f39656d.getClass();
        c81.b wi8 = c81.b.wi();
        wi8.requireAccountInitialized();
        c81.a aVar = wi8.f39656d;
        java.lang.String m17 = b17.m();
        com.tencent.mm.sdk.platformtools.o4 a17 = aVar.a();
        if (a17 != null) {
            a17.putString("calendar_statistics_discover", m17);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUIReporter", "noteFindMoreFriendsUIInfo struct[%s] cost[%d]", b17.m(), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
    }

    @Override // com.tencent.mm.plugin.ai.data.business.trigger.h
    public void a() {
        this.f74665d.alive();
        this.f74666e.alive();
    }

    @Override // com.tencent.mm.plugin.ai.data.business.trigger.h
    public void b() {
        this.f74665d.dead();
        this.f74666e.dead();
    }
}
