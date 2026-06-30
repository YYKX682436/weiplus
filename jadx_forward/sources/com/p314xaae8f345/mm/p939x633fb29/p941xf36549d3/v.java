package com.p314xaae8f345.mm.p939x633fb29.p941xf36549d3;

/* loaded from: classes5.dex */
public class v implements l75.q0 {
    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        if (str == null || str.length() <= 0 || !"event_updated".equals(str)) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.c z07 = com.p314xaae8f345.mm.p939x633fb29.p941xf36549d3.z.Ai().z0("100205");
        if (z07.m77959x7b953cf2()) {
            java.util.Map t07 = z07.t0();
            int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) t07.get("main_thread_watch_enable"), 65535);
            int P2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) t07.get("main_thread_watch_timeout"), 5000);
            int P3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) t07.get("main_thread_watch_log_loop"), 0);
            int P4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) t07.get("main_thread_watch_report"), 0);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("system_config_prefs", 4).edit().putInt("main_thread_watch_enable", P).putInt("main_thread_watch_timeout", P2).putInt("main_thread_watch_log_loop", P3).putInt("main_thread_watch_report", P4).commit();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreNewABTest", "summeranr MM_MAIN_THREAD_WATCH enable[%d] timeout[%d], loop[%d] report[%d]", java.lang.Integer.valueOf(P), java.lang.Integer.valueOf(P2), java.lang.Integer.valueOf(P3), java.lang.Integer.valueOf(P4));
        }
        com.p314xaae8f345.mm.p939x633fb29.p941xf36549d3.z.Bi().getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.c z08 = com.p314xaae8f345.mm.p939x633fb29.p941xf36549d3.z.Ai().z0("100229");
        if (!z08.m77959x7b953cf2()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("system_config_prefs", 4).edit().remove("client_server_diff_time_enable").remove("client_server_diff_time_interval").commit();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreNewABTest", "[oneliang] client server diff time abtest is not valid, then delete data");
            return;
        }
        java.util.Map t08 = z08.t0();
        int P5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) t08.get("UseSvrTime"), 0);
        int P6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) t08.get("MinDiffTime"), 0);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("system_config_prefs", 4).edit().putInt("client_server_diff_time_enable", P5).putInt("client_server_diff_time_interval", P6).commit();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreNewABTest", "[oneliang] client server diff time enable[%d] diffTime[%d]", java.lang.Integer.valueOf(P5), java.lang.Integer.valueOf(P6));
    }
}
