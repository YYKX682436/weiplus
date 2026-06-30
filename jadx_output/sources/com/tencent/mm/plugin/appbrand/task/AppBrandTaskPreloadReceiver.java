package com.tencent.mm.plugin.appbrand.task;

/* loaded from: classes7.dex */
public class AppBrandTaskPreloadReceiver extends android.content.BroadcastReceiver {
    public static void a(java.lang.String str, android.content.Intent intent) {
        com.tencent.mm.plugin.appbrand.task.x0 x0Var;
        com.tencent.mm.plugin.appbrand.task.x0 x0Var2;
        com.tencent.mm.plugin.appbrand.service.x6 x6Var;
        if (intent == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandTaskPreloadReceiver", "[PreloadProfile][%s] Receiver get NULL intent", str);
            return;
        }
        intent.setExtrasClassLoader(com.tencent.mm.plugin.appbrand.task.AppBrandPreloadProfiler.class.getClassLoader());
        int intExtra = intent.getIntExtra("EXTRA_KEY_LEVEL", 2);
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long longExtra = intent.getLongExtra("EXTRA_KEY_TRIGGER_TIME", -1L);
        com.tencent.mm.plugin.appbrand.task.AppBrandPreloadProfiler appBrandPreloadProfiler = (com.tencent.mm.plugin.appbrand.task.AppBrandPreloadProfiler) intent.getParcelableExtra("preloadProfiler");
        com.tencent.luggage.sdk.processes.LuggageServiceType.f47625d.getClass();
        com.tencent.luggage.sdk.processes.LuggageServiceType luggageServiceType = com.tencent.luggage.sdk.processes.LuggageServiceType.values()[intent.getIntExtra("Luggage.LuggageServiceType", 2)];
        com.tencent.luggage.sdk.processes.LuggageServiceType luggageServiceType2 = com.tencent.luggage.sdk.processes.LuggageServiceType.f47628g;
        com.tencent.mm.plugin.appbrand.task.x0 x0Var3 = com.tencent.mm.plugin.appbrand.task.x0.NIL;
        if (luggageServiceType == luggageServiceType2) {
            x0Var2 = x0Var3;
        } else {
            if (luggageServiceType == com.tencent.luggage.sdk.processes.LuggageServiceType.f47627f) {
                x0Var = com.tencent.mm.plugin.appbrand.task.x0.WAGAME;
            } else {
                if (luggageServiceType != com.tencent.luggage.sdk.processes.LuggageServiceType.f47626e) {
                    throw new java.lang.IllegalStateException("unknown type:" + luggageServiceType.name());
                }
                x0Var = com.tencent.mm.plugin.appbrand.task.x0.WASERVICE;
            }
            x0Var2 = x0Var;
        }
        int i17 = 0;
        boolean booleanExtra = intent.getBooleanExtra("EXTRA_KEY_AGGRESSIVE", false);
        int g17 = com.tencent.mm.sdk.platformtools.c2.g(intent, "EXTRA_KEY_PRELOAD_SCENE", -1);
        com.tencent.mm.plugin.appbrand.service.x6[] values = com.tencent.mm.plugin.appbrand.service.x6.values();
        int length = values.length;
        while (true) {
            if (i17 >= length) {
                x6Var = null;
                break;
            }
            x6Var = values[i17];
            if (g17 == x6Var.ordinal()) {
                break;
            } else {
                i17++;
            }
        }
        com.tencent.mm.plugin.appbrand.service.x6 x6Var2 = x6Var;
        com.tencent.mm.plugin.appbrand.app.o0.f75205c = true;
        if (x0Var2 == x0Var3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandProcessProfileInit[applaunch][PreloadProfile][preload]", "dl: AppBrandProcessPreloader said I can not preload [nil] type.");
        } else {
            com.tencent.mm.plugin.appbrand.task.AppBrandPreloadProfiler appBrandPreloadProfiler2 = appBrandPreloadProfiler == null ? new com.tencent.mm.plugin.appbrand.task.AppBrandPreloadProfiler() : appBrandPreloadProfiler;
            appBrandPreloadProfiler2.f88982h = android.os.SystemClock.elapsedRealtime();
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.app.m0(new com.tencent.mm.plugin.appbrand.app.l0(x0Var2, booleanExtra, intExtra, appBrandPreloadProfiler2, x6Var2)));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTaskPreloadReceiver", "[PreloadProfile][%s] Trigger cost [%d]ms Receiver cost [%d]ms, at [%d], level [%d], scene[%s]", str, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - longExtra), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), java.lang.Long.valueOf(elapsedRealtime), java.lang.Integer.valueOf(intExtra), x6Var2);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        a("", intent);
    }
}
