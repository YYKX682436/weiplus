package com.p314xaae8f345.mm.p2829xfa87f9de;

/* loaded from: classes8.dex */
public abstract class s0 {
    public static void a(android.content.Intent intent) {
        if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g4.b() || intent == null) {
            return;
        }
        intent.setComponent(new android.content.ComponentName(com.p314xaae8f345.mm.ui.u2.f292595a, "com.tencent.mm.booter.MMReceivers$ToolsProcessReceiver"));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.sendBroadcast(intent);
    }

    public static void b(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XWeb.MM.XWebToolsProcessUtil", "sendBroadCastToToolsProcess, action:" + str);
        if (!com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b.f19974x4fbc8495.mo40975xf7b3660d() && "com.tencent.mm.intent.ACTION_START_TOOLS_PROCESS".equals(str)) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("XWeb.MM.XWebToolsProcessUtil", "sendBroadCastToToolsProcess, ignore in background", new java.lang.Object[0]);
            return;
        }
        if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g4.b() && "com.tencent.mm.intent.ACTION_START_TOOLS_PROCESS".equals(str)) {
            if (com.p314xaae8f345.p3210x3857dc.t1.f()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XWeb.MM.XWebToolsProcessUtil", "sendBroadCastToToolsProcess, already downgrade to sys");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XWeb.MM.XWebToolsProcessUtil", "sendBroadCastToToolsProcess, preinit child process");
            tx5.j.d(80019, null);
            tx5.j.d(80020, null);
            return;
        }
        if ("com.tencent.mm.intent.ACTION_KILL_TOOLS_PROCESS".equals(str)) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.o(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b + ":tools")) {
                return;
            }
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setComponent(new android.content.ComponentName(com.p314xaae8f345.mm.ui.u2.f292595a, "com.tencent.mm.booter.MMReceivers$ToolsProcessReceiver"));
        intent.putExtra("tools_process_action_code_key", str);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.sendBroadcast(intent);
    }
}
