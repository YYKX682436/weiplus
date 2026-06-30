package vd0;

@j95.b
/* loaded from: classes8.dex */
public final class o2 extends i95.w implements wd0.s1 {

    /* renamed from: d, reason: collision with root package name */
    public long f517013d;

    public boolean Ai() {
        return (c01.z1.h() & 32) != 32;
    }

    public boolean Bi() {
        return (c01.z1.h() & 128) != 128;
    }

    public boolean Di() {
        return (c01.z1.h() & 2) != 2;
    }

    public void Ni(boolean z17) {
        if (!((c01.z1.h() & 1) == 1) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bm5.o1.f104252a.d(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20255x3061d76c()), 1)) {
            this.f517013d = c01.z1.h();
            java.lang.Object l17 = gm0.j1.u().c().l(68384, null);
            boolean m17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(l17 instanceof java.lang.Boolean ? (java.lang.Boolean) l17 : null, true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.SettingFindMoreReddotService", "syncSnsReddot: " + m17);
            Ri(m17, 2L);
            boolean o17 = gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_ENABLE_SHOW_ENTRANCE_REDDOT_BOOLEAN_SYNC, true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.SettingFindMoreReddotService", "finderInitState = " + o17);
            boolean o18 = gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_NEAR_BY_ENABLE_SHOW_ENTRANCE_REDDOT_BOOLEAN_SYNC, true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.SettingFindMoreReddotService", "initNearByState = " + o18);
            boolean o19 = gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_ENABLE_SHOW_ENTRANCE_REDDOT_BOOLEAN_SYNC, true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.SettingFindMoreReddotService", "isEnableShowFinderLiveEntranceRedDot = " + o19);
            Ri(o17, 8L);
            Ri(o18, 8192L);
            Ri(o19, 32L);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.SettingFindMoreReddotService", "syncDefaultReddot");
            Ri(true, 128L);
            Ri(true, 512L);
            Ri(true, 2048L);
            Ri(true, 131072L);
            if (this.f517013d == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.SettingFindMoreReddotService", "checkReddotSync but skip");
                return;
            }
            Ri(false, 1L);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.SettingFindMoreReddotService", "checkReddotSync sync = " + this.f517013d);
            gm0.j1.u().c().w(147458, java.lang.Long.valueOf(this.f517013d));
        }
        if (z17 || ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_data_report_app_event_monitor_type, 0) == 1) {
            java.lang.String j17 = gm0.j1.b().j();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MMKV_HAS_SYNC_FINDMORE").f(j17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.SettingFindMoreReddotService", "checkSyncOplog " + j17 + " already SyncOplog");
                return;
            }
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            java.util.Iterator it = kz5.c0.i(1L, 2L, 8L, 32L, 128L, 512L, 2048L, 8192L, 131072L).iterator();
            while (it.hasNext()) {
                long longValue = ((java.lang.Number) it.next()).longValue();
                linkedHashMap.put(java.lang.Long.valueOf(longValue), java.lang.Long.valueOf(longValue & c01.z1.h()));
            }
            for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
                long longValue2 = ((java.lang.Number) entry.getKey()).longValue();
                long longValue3 = ((java.lang.Number) entry.getValue()).longValue();
                r45.io4 io4Var = new r45.io4();
                io4Var.f458749d = longValue2;
                io4Var.f458750e = longValue3;
                ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(75, io4Var));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.SettingFindMoreReddotService", "SyncOplog switch " + longValue2 + ' ' + longValue3);
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MMKV_HAS_SYNC_FINDMORE").putInt(j17, 1);
        }
    }

    public final void Ri(boolean z17, long j17) {
        long j18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.SettingFindMoreReddotService", "switch ext change : open = " + z17 + " item value = " + j17);
        if (z17) {
            j18 = (~j17) & this.f517013d;
        } else {
            j18 = this.f517013d | j17;
        }
        this.f517013d = j18;
        gm0.j1.u().c().w(147458, java.lang.Long.valueOf(this.f517013d));
    }

    public boolean wi() {
        return (c01.z1.h() & 8) != 8;
    }
}
