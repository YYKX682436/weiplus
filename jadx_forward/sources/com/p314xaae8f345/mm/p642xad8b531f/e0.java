package com.p314xaae8f345.mm.p642xad8b531f;

/* loaded from: classes12.dex */
public class e0 implements com.p314xaae8f345.mm.p642xad8b531f.g0 {
    @Override // com.p314xaae8f345.mm.p642xad8b531f.g0
    public void a(android.content.Context context, android.content.Intent intent) {
        if (context == null || intent == null) {
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("tools_process_action_code_key");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ToolsProcessReceiver", "onReceive, action = " + stringExtra);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            return;
        }
        if (stringExtra.equals("com.tencent.mm.intent.ACTION_KILL_TOOLS_PROCESS")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40530x65a4a38();
            boolean b17 = com.p314xaae8f345.mm.app.d7.b();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ToolsProcessReceiver", "onReceive, ACTION_KILL_TOOLS_PROCESS, x5 kernel video isLocked = %b", java.lang.Boolean.valueOf(b17));
            if (b17) {
                return;
            }
            int myPid = android.os.Process.myPid();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(myPid));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/booter/MMProcessReceivers$ToolsProcessReceiverImpl", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
            android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(obj, "com/tencent/mm/booter/MMProcessReceivers$ToolsProcessReceiverImpl", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
            return;
        }
        if (stringExtra.equals("com.tencent.mm.intent.ACTION_RELOAD_RESOURCES")) {
            java.lang.String stringExtra2 = intent.getStringExtra("tools_language");
            if (stringExtra2 == null) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ToolsProcessReceiver", "onReceive, language %s", stringExtra2);
            java.util.Locale s17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.s(stringExtra2);
            if ("language_default".equalsIgnoreCase(stringExtra2)) {
                s17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f274381b;
                java.util.Locale.setDefault(s17);
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.u(context.getApplicationContext(), s17);
            android.content.res.Resources resources = context.getApplicationContext().getResources();
            android.content.Context applicationContext = context.getApplicationContext();
            java.lang.reflect.Method method = j65.j.f379488f;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e = j65.j.d(resources, applicationContext, j65.v.f(applicationContext, stringExtra2), false);
            com.p314xaae8f345.p3210x3857dc.a3.C(s17);
            return;
        }
        if (stringExtra.equals("com.tencent.mm.intent.ACTION_TOOLS_REMOVE_COOKIE")) {
            try {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("__webView_ad").W("AdWUID");
                com.p314xaae8f345.p3210x3857dc.a3.c(true);
                return;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ToolsProcessReceiver", "clear cookie faild : " + e17.getMessage());
                return;
            }
        }
        if (stringExtra.equals("com.tencent.mm.intent.ACIONT_TOOLS_LOAD_DEX")) {
            return;
        }
        if (stringExtra.equals("com.tencent.mm.intent.ACTION_CLEAR_WEBVIEW_CACHE")) {
            boolean booleanExtra = intent.getBooleanExtra("tools_clean_webview_cache_ignore_cookie", true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ToolsProcessReceiver", "WebViewCacheClearTask, clearAllWebViewCache, includeCookie = %b", java.lang.Boolean.valueOf(booleanExtra));
            com.p314xaae8f345.p3210x3857dc.a3.c(booleanExtra);
            return;
        }
        if (stringExtra.equals("com.tencent.mm.intent.ACTION_START_TOOLS_PROCESS")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ToolsProcessReceiver", "start tools process task, try to pre load tbs");
            return;
        }
        if (stringExtra.equals("com.tencent.mm.intent.ACTION_START_TOOLS_PROCESS_DO_NOTHING")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ToolsProcessReceiver", "start tools process and do nothing");
            return;
        }
        if (stringExtra.equals("com.tencent.mm.intent.ACTION_CHECK_MINIQB_CAN_OPEN_FILE")) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.c4.a(intent);
            return;
        }
        if (stringExtra.equals("com.tencent.mm.intent.ACTION_PRELOAD_SEARCH")) {
            java.lang.String url = intent.getStringExtra("tools_param_preload_url");
            intent.getIntExtra("tools_param_preload_search_biz", -1);
            boolean booleanExtra2 = intent.getBooleanExtra("tools_param_preload_search_biz_need_reset", false);
            qx4.l0 l0Var = qx4.l0.f448955a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
            l0Var.e(url, booleanExtra2, 0);
        }
    }
}
