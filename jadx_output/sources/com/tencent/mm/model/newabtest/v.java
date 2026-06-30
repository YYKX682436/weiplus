package com.tencent.mm.model.newabtest;

/* loaded from: classes5.dex */
public class v implements l75.q0 {
    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        if (str == null || str.length() <= 0 || !"event_updated".equals(str)) {
            return;
        }
        com.tencent.mm.storage.c z07 = com.tencent.mm.model.newabtest.z.Ai().z0("100205");
        if (z07.isValid()) {
            java.util.Map t07 = z07.t0();
            int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) t07.get("main_thread_watch_enable"), 65535);
            int P2 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) t07.get("main_thread_watch_timeout"), 5000);
            int P3 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) t07.get("main_thread_watch_log_loop"), 0);
            int P4 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) t07.get("main_thread_watch_report"), 0);
            com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("system_config_prefs", 4).edit().putInt("main_thread_watch_enable", P).putInt("main_thread_watch_timeout", P2).putInt("main_thread_watch_log_loop", P3).putInt("main_thread_watch_report", P4).commit();
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreNewABTest", "summeranr MM_MAIN_THREAD_WATCH enable[%d] timeout[%d], loop[%d] report[%d]", java.lang.Integer.valueOf(P), java.lang.Integer.valueOf(P2), java.lang.Integer.valueOf(P3), java.lang.Integer.valueOf(P4));
        }
        com.tencent.mm.model.newabtest.z.Bi().getClass();
        com.tencent.mm.storage.c z08 = com.tencent.mm.model.newabtest.z.Ai().z0("100229");
        if (!z08.isValid()) {
            com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("system_config_prefs", 4).edit().remove("client_server_diff_time_enable").remove("client_server_diff_time_interval").commit();
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreNewABTest", "[oneliang] client server diff time abtest is not valid, then delete data");
            return;
        }
        java.util.Map t08 = z08.t0();
        int P5 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) t08.get("UseSvrTime"), 0);
        int P6 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) t08.get("MinDiffTime"), 0);
        com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("system_config_prefs", 4).edit().putInt("client_server_diff_time_enable", P5).putInt("client_server_diff_time_interval", P6).commit();
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreNewABTest", "[oneliang] client server diff time enable[%d] diffTime[%d]", java.lang.Integer.valueOf(P5), java.lang.Integer.valueOf(P6));
    }
}
