package e01;

/* loaded from: classes5.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f327377a = new java.util.ArrayList();

    public final void a(java.lang.String str, java.util.Map map) {
        java.lang.String str2 = str + "chatting.";
        java.lang.String str3 = (java.lang.String) map.get(str2 + com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25618xca866da5.f47003xb618721a);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str3 == null) {
            str3 = "";
        }
        if (str2.equals(".sysmsg.banner.monitorbanner_n.") && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingMonitoredBannerStorage", "monitorbanner_n must NOT contain fingerprint.");
            return;
        }
        java.lang.String str4 = (java.lang.String) map.get(str2.concat("deviceuuid"));
        if (str4 == null) {
            str4 = "";
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4) && !ot5.h.f430410a.a(str4, wo.w0.k(), "MicroMsg.ChattingMonitoredBannerStorage", false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingMonitoredBannerStorage", "deviceUuid not match:".concat(str4));
            return;
        }
        java.lang.String str5 = (java.lang.String) map.get(str2.concat("url"));
        if (str5 == null) {
            str5 = "";
        }
        java.lang.String str6 = (java.lang.String) map.get(str2.concat("wording"));
        if (str6 == null) {
            str6 = "";
        }
        long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) map.get(str2.concat("duration")), 0L);
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str2.concat("autotrigger")), 0) == 1;
        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str2.concat("closable")), 0) == 1;
        java.lang.String str7 = str + "mainframe.";
        java.lang.String str8 = (java.lang.String) map.get(str7 + "url");
        if (str8 == null) {
            str8 = "";
        }
        java.lang.String str9 = (java.lang.String) map.get(str7 + "wording");
        java.lang.String str10 = str9 != null ? str9 : "";
        java.lang.String str11 = str8;
        java.lang.String str12 = str3;
        long V2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) map.get(str7 + "duration"), 0L);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str7);
        sb6.append("autotrigger");
        boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(sb6.toString()), 0) == 1;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(str7);
        sb7.append("closable");
        boolean z28 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(sb7.toString()), 0) == 1;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str10) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str6)) {
            return;
        }
        c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CHATTING_MONITOR_MAIN_WORDING_STRING_SYNC, str6);
        c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CHATTING_MONITOR_MAIN_URL_STRING_SYNC, str5);
        c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CHATTING_MONITOR_MAIN_INTERVAL_LONG_SYNC, java.lang.Long.valueOf(V));
        c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CHATTING_MONITOR_MAIN_CLOSABLE_BOOLEAN_SYNC, java.lang.Boolean.valueOf(z19));
        c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CHATTING_MONITOR_MAIN_AUTOTRIGGER_BOOLEAN_SYNC, java.lang.Boolean.valueOf(z18));
        c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CHATTING_MONITOR_FINGER_PRINT_STRING_SYNC, str12);
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 p17 = c01.d9.b().p();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CHATTING_BANNER_CLOSED_BOOLEAN_SYNC;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        p17.x(u3Var, bool);
        c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MAIN_MONITOR_MAIN_WORDING_STRING_SYNC, str10);
        c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MAIN_MONITOR_MAIN_URL_STRING_SYNC, str11);
        c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MAIN_MONITOR_MAIN_INTERVAL_LONG_SYNC, java.lang.Long.valueOf(V2));
        c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MAIN_MONITOR_MAIN_CLOSABLE_BOOLEAN_SYNC, java.lang.Boolean.valueOf(z28));
        c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MAIN_MONITOR_MAIN_AUTOTRIGGER_BOOLEAN_SYNC, java.lang.Boolean.valueOf(z27));
        c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MONITOR_BANNER_MSG_COME_TIME_TICKS_LONG_SYNC, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()));
        c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MAIN_BANNER_CLOSED_BOOLEAN_SYNC, bool);
        c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MONITOR_IS_TRIGGERED_BOOLEAN_SYNC, bool);
        c01.d9.b().p().i(true);
        b();
    }

    public void b() {
        synchronized (e01.d.class) {
            java.util.Iterator it = this.f327377a.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.df dfVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.df) ((e01.b) it.next());
                dfVar.f280469a.f280113d.q().mo50293x3498a0(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.cf(dfVar));
            }
        }
    }

    public void c(e01.c cVar) {
        if (cVar == e01.c.Main) {
            c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MAIN_MONITOR_MAIN_INTERVAL_LONG_SYNC, 0L);
            b();
        } else if (cVar == e01.c.Chatting) {
            if (((java.lang.Boolean) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CHATTING_MONITOR_MAIN_AUTOTRIGGER_BOOLEAN_SYNC, java.lang.Boolean.FALSE)).booleanValue()) {
                c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CHATTING_BANNER_CLOSED_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
            } else {
                c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CHATTING_MONITOR_MAIN_INTERVAL_LONG_SYNC, 0L);
            }
            b();
        }
    }

    public boolean d(e01.c cVar) {
        long longValue;
        boolean booleanValue;
        boolean booleanValue2;
        java.lang.String str;
        long i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        long longValue2 = ((java.lang.Long) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MONITOR_BANNER_MSG_COME_TIME_TICKS_LONG_SYNC, -1L)).longValue();
        java.lang.String str2 = (java.lang.String) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CHATTING_MONITOR_FINGER_PRINT_STRING_SYNC, "");
        if (cVar == e01.c.Chatting) {
            longValue = ((java.lang.Long) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CHATTING_MONITOR_MAIN_INTERVAL_LONG_SYNC, 0L)).longValue();
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 p17 = c01.d9.b().p();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CHATTING_BANNER_CLOSED_BOOLEAN_SYNC;
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            booleanValue = ((java.lang.Boolean) p17.m(u3Var, bool)).booleanValue();
            booleanValue2 = ((java.lang.Boolean) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CHATTING_MONITOR_MAIN_AUTOTRIGGER_BOOLEAN_SYNC, bool)).booleanValue();
            str = (java.lang.String) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CHATTING_MONITOR_MAIN_WORDING_STRING_SYNC, "");
        } else {
            longValue = ((java.lang.Long) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MAIN_MONITOR_MAIN_INTERVAL_LONG_SYNC, 0L)).longValue();
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 p18 = c01.d9.b().p();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MAIN_BANNER_CLOSED_BOOLEAN_SYNC;
            java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
            booleanValue = ((java.lang.Boolean) p18.m(u3Var2, bool2)).booleanValue();
            booleanValue2 = ((java.lang.Boolean) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MAIN_MONITOR_MAIN_AUTOTRIGGER_BOOLEAN_SYNC, bool2)).booleanValue();
            str = (java.lang.String) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MAIN_MONITOR_MAIN_WORDING_STRING_SYNC, "");
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && !str2.equals(android.os.Build.FINGERPRINT)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(633L, 5L, 1L, false);
            return false;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || booleanValue || longValue2 < 0) {
            return false;
        }
        if (booleanValue2 && !((java.lang.Boolean) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MONITOR_IS_TRIGGERED_BOOLEAN_SYNC, java.lang.Boolean.FALSE)).booleanValue()) {
            return false;
        }
        if (longValue == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingMonitoredBannerStorage", "hy: should always show");
            return true;
        }
        if (longValue2 + longValue > i17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingMonitoredBannerStorage", "hy: still in show time. show banner");
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingMonitoredBannerStorage", "hy: expired.");
        return false;
    }

    public void e(int i17, java.util.Map map) {
        if (map == null) {
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("banner-SvrIdMMKVName").getInt("SvrIdKey", 0) == i17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingMonitoredBannerStorage", "error! svrId=" + i17);
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("banner-SvrIdMMKVName").putInt("SvrIdKey", i17);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(633L, 3L, 1L, false);
            map.toString();
            a(".sysmsg.banner.monitorbanner_n.", map);
            a(".sysmsg.banner.monitorbanner_o.", map);
        }
    }
}
