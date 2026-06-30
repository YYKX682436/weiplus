package com.p314xaae8f345.mm.p1006xc5476f33.ai.p1020x2eefaa.p1021xbba4bfc0.p1023xc0d355b8;

/* loaded from: classes8.dex */
public class e implements com.p314xaae8f345.mm.p1006xc5476f33.ai.p1020x2eefaa.p1021xbba4bfc0.p1023xc0d355b8.h {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f156195a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f156196b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f156197c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f156198d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f156199e;

    public e() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f156198d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5865x48f502ce>(a0Var) { // from class: com.tencent.mm.plugin.ai.data.business.trigger.FindMoreFriendsUIReporter$1
            {
                this.f39173x3fe91575 = -971114274;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5865x48f502ce c5865x48f502ce) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5865x48f502ce c5865x48f502ce2 = c5865x48f502ce;
                try {
                    com.p314xaae8f345.mm.p1006xc5476f33.ai.p1020x2eefaa.p1021xbba4bfc0.p1023xc0d355b8.e.c(com.p314xaae8f345.mm.p1006xc5476f33.ai.p1020x2eefaa.p1021xbba4bfc0.p1023xc0d355b8.e.this, c5865x48f502ce2);
                    int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(c5865x48f502ce2.f136173g.f88391b, -1);
                    if (P > -1 && P < 255) {
                        jx3.f.INSTANCE.mo68477x336bdfd8(1437L, P, 1L, false);
                        return false;
                    }
                    jx3.f.INSTANCE.mo68477x336bdfd8(1437L, 255L, 1L, false);
                    return false;
                } catch (java.lang.Exception unused) {
                    return false;
                }
            }
        };
        this.f156199e = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5329xe8d33657>(a0Var) { // from class: com.tencent.mm.plugin.ai.data.business.trigger.FindMoreFriendsUIReporter$2
            {
                this.f39173x3fe91575 = 281608775;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5329xe8d33657 c5329xe8d33657) {
                com.p314xaae8f345.mm.p1006xc5476f33.ai.p1020x2eefaa.p1021xbba4bfc0.p1023xc0d355b8.e eVar = com.p314xaae8f345.mm.p1006xc5476f33.ai.p1020x2eefaa.p1021xbba4bfc0.p1023xc0d355b8.e.this;
                try {
                    eVar.f156195a = z71.b.a().b("FinderEntrance");
                    eVar.f156196b = z71.b.a().b("FinderLiveEntrance");
                    eVar.f156197c = z71.b.a().b("NewLife.Entrance");
                    com.p314xaae8f345.mm.p1006xc5476f33.ai.p1020x2eefaa.p1021xbba4bfc0.p1023xc0d355b8.e.d(eVar);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FindMoreFriendsUIReporter", e17, "enter ui but finder reddot json error", new java.lang.Object[0]);
                }
                return false;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void c(com.p314xaae8f345.mm.p1006xc5476f33.ai.p1020x2eefaa.p1021xbba4bfc0.p1023xc0d355b8.e eVar, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5865x48f502ce c5865x48f502ce) {
        eVar.getClass();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        int[] iArr = c5865x48f502ce.f136173g.f88394e;
        if ((iArr == null || iArr.length <= 0) != false) {
            iArr = z71.f.Bi().wi();
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        am.hp hpVar = c5865x48f502ce.f136173g;
        stringBuffer.append(hpVar.f88390a);
        stringBuffer.append(",2,");
        stringBuffer.append(hpVar.f88391b);
        stringBuffer.append(",");
        stringBuffer.append(hpVar.f88392c);
        stringBuffer.append(",");
        stringBuffer.append(hpVar.f88393d);
        stringBuffer.append(",");
        stringBuffer.append(hpVar.f88393d - hpVar.f88392c);
        stringBuffer.append(",");
        int i17 = 0;
        while (true) {
            if (i17 >= iArr.length) {
                break;
            }
            if (i17 == 12) {
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                if (vd2.t3.f517454a.f()) {
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
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6454x5ac16463 c6454x5ac16463 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6454x5ac16463(stringBuffer.toString());
        c6454x5ac16463.f137968x = c6454x5ac16463.b("Reserved2", "", true);
        c6454x5ac16463.f137969y = c6454x5ac16463.b("Reserved3", "", true);
        am.g20 g20Var = (am.g20) z71.f.Bi().f552054f.get(2);
        c6454x5ac16463.f137970z = c6454x5ac16463.b("FindFriendsTab", g20Var == null ? "" : java.lang.String.format("{\"tabId\":%d;\"redDot\":%d;\"unread\":%d}", java.lang.Integer.valueOf(g20Var.f88264a), java.lang.Integer.valueOf(g20Var.f88265b ? 1 : 0), java.lang.Integer.valueOf(g20Var.f88266c)), true);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0("1", c6454x5ac16463.f137965u) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(eVar.f156195a)) {
            eVar.f156195a = z71.b.a().b("FinderEntrance");
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0("1", c6454x5ac16463.f137966v) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(eVar.f156196b)) {
            eVar.f156196b = z71.b.a().b("FinderLiveEntrance");
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(eVar.f156197c)) {
            eVar.f156197c = z71.b.a().b("NewLife.Entrance");
        }
        c6454x5ac16463.A = c6454x5ac16463.b("FinderJson", eVar.f156195a, true);
        c6454x5ac16463.B = c6454x5ac16463.b("FinderLiveJson", eVar.f156196b, true);
        c6454x5ac16463.C = c6454x5ac16463.b("SessionId", ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri(), true);
        c6454x5ac16463.D = c6454x5ac16463.b("IsShowFinderEntrance", z71.b.a().c() ? "1" : "0", true);
        z71.b.a().getClass();
        c6454x5ac16463.E = c6454x5ac16463.b("IsShowFinderRedDot", ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().f0() ? "1" : "0", true);
        c6454x5ac16463.F = c6454x5ac16463.b("IsShowFinderLiveEntrance", z71.b.a().d() ? "1" : "0", true);
        z71.b.a().getClass();
        c6454x5ac16463.G = c6454x5ac16463.b("IsShowFinderLiveRedDot", ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().E() ? "1" : "0", true);
        c6454x5ac16463.f137947J = c6454x5ac16463.b("k1kNewLifeRedDotJson", eVar.f156197c, true);
        z71.b.a().getClass();
        c6454x5ac16463.H = c6454x5ac16463.b("IsShowBrowseEntrance", ((lf0.h0) ((mf0.g0) i95.n0.c(mf0.g0.class))).Ni() ? "1" : "0", true);
        z71.b.a().getClass();
        c6454x5ac16463.I = c6454x5ac16463.b("IsShowBrowseRedDot", ((vd0.o2) ((wd0.s1) i95.n0.c(wd0.s1.class))).Bi() ? "1" : "0", true);
        z71.b.a().getClass();
        c6454x5ac16463.K = c6454x5ac16463.b("IsShowTingEntrance", ((ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class))).fj() ? "1" : "0", true);
        z71.b.a().getClass();
        c6454x5ac16463.L = c6454x5ac16463.b("IsShowTingRedDot", ((ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class))).Ri() ? "1" : "0", true);
        c6454x5ac16463.M = z71.f.Bi().f552052d;
        c6454x5ac16463.N = z71.f.Bi().Ai();
        c6454x5ac16463.O = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40064x8b9dd687(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        c6454x5ac16463.P = z71.a.b();
        c81.b wi6 = c81.b.wi();
        wi6.m134976x2690a4ac();
        c6454x5ac16463.T = wi6.f121189d.a() == null ? 0 : r2.getInt("last_m7_step_count", 0);
        c81.b wi7 = c81.b.wi();
        wi7.m134976x2690a4ac();
        c6454x5ac16463.U = wi7.f121189d.a() != null ? r2.getInt("last_hk_step_count", 0) : 0;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6295xdee69c3 c6295xdee69c3 = z71.m.wi().f552068f;
        if (c6295xdee69c3 != null) {
            c6454x5ac16463.Q = c6454x5ac16463.b("MagicNumA", c6295xdee69c3.f136563g, true);
            c6454x5ac16463.R = c6454x5ac16463.b("MagicNumB", c6295xdee69c3.f136564h, true);
            c6454x5ac16463.S = c6295xdee69c3.f136561e;
        }
        c6454x5ac16463.k();
        eVar.f156196b = "";
        eVar.f156195a = "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUIReporter", "report find friend entry [%d %d] network[%d]", java.lang.Long.valueOf(c6454x5ac16463.M), java.lang.Long.valueOf(c6454x5ac16463.N), java.lang.Integer.valueOf(c6454x5ac16463.O));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUIReporter", "report find friend cost[%d] [%s]", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), c6454x5ac16463.n());
    }

    public static void d(com.p314xaae8f345.mm.p1006xc5476f33.ai.p1020x2eefaa.p1021xbba4bfc0.p1023xc0d355b8.e eVar) {
        eVar.getClass();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        c81.b wi6 = c81.b.wi();
        wi6.m134976x2690a4ac();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6354xa0c7aa56 b17 = wi6.f121189d.b("calendar_statistics_discover");
        if (b17.f137029e == 0) {
            b17.f137029e = java.lang.System.currentTimeMillis();
        }
        b17.f137031g++;
        c81.b wi7 = c81.b.wi();
        wi7.m134976x2690a4ac();
        wi7.f121189d.getClass();
        c81.b wi8 = c81.b.wi();
        wi8.m134976x2690a4ac();
        c81.a aVar = wi8.f121189d;
        java.lang.String m17 = b17.m();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17 = aVar.a();
        if (a17 != null) {
            a17.putString("calendar_statistics_discover", m17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUIReporter", "noteFindMoreFriendsUIInfo struct[%s] cost[%d]", b17.m(), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.ai.p1020x2eefaa.p1021xbba4bfc0.p1023xc0d355b8.h
    public void a() {
        this.f156198d.mo48813x58998cd();
        this.f156199e.mo48813x58998cd();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.ai.p1020x2eefaa.p1021xbba4bfc0.p1023xc0d355b8.h
    public void b() {
        this.f156198d.mo48814x2efc64();
        this.f156199e.mo48814x2efc64();
    }
}
