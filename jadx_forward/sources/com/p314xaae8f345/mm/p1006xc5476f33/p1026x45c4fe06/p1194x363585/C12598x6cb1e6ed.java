package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585;

/* renamed from: com.tencent.mm.plugin.appbrand.task.AppBrandTaskPreloadReceiver */
/* loaded from: classes7.dex */
public class C12598x6cb1e6ed extends android.content.BroadcastReceiver {
    public static void a(java.lang.String str, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0 x0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0 x0Var2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.x6 x6Var;
        if (intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandTaskPreloadReceiver", "[PreloadProfile][%s] Receiver get NULL intent", str);
            return;
        }
        intent.setExtrasClassLoader(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.C12596x96aa9e2c.class.getClassLoader());
        int intExtra = intent.getIntExtra("EXTRA_KEY_LEVEL", 2);
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long longExtra = intent.getLongExtra("EXTRA_KEY_TRIGGER_TIME", -1L);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.C12596x96aa9e2c c12596x96aa9e2c = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.C12596x96aa9e2c) intent.getParcelableExtra("preloadProfiler");
        com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99.f129158d.getClass();
        com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99 enumC3941xa739ed99 = com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99.m32222xcee59d22()[intent.getIntExtra("Luggage.LuggageServiceType", 2)];
        com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99 enumC3941xa739ed992 = com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99.f129161g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0 x0Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0.NIL;
        if (enumC3941xa739ed99 == enumC3941xa739ed992) {
            x0Var2 = x0Var3;
        } else {
            if (enumC3941xa739ed99 == com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99.f129160f) {
                x0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0.WAGAME;
            } else {
                if (enumC3941xa739ed99 != com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99.f129159e) {
                    throw new java.lang.IllegalStateException("unknown type:" + enumC3941xa739ed99.name());
                }
                x0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0.WASERVICE;
            }
            x0Var2 = x0Var;
        }
        int i17 = 0;
        boolean booleanExtra = intent.getBooleanExtra("EXTRA_KEY_AGGRESSIVE", false);
        int g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.g(intent, "EXTRA_KEY_PRELOAD_SCENE", -1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.x6[] m52677xcee59d22 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.x6.m52677xcee59d22();
        int length = m52677xcee59d22.length;
        while (true) {
            if (i17 >= length) {
                x6Var = null;
                break;
            }
            x6Var = m52677xcee59d22[i17];
            if (g17 == x6Var.ordinal()) {
                break;
            } else {
                i17++;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.x6 x6Var2 = x6Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.o0.f156738c = true;
        if (x0Var2 == x0Var3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProcessProfileInit[applaunch][PreloadProfile][preload]", "dl: AppBrandProcessPreloader said I can not preload [nil] type.");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.C12596x96aa9e2c c12596x96aa9e2c2 = c12596x96aa9e2c == null ? new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.C12596x96aa9e2c() : c12596x96aa9e2c;
            c12596x96aa9e2c2.f170515h = android.os.SystemClock.elapsedRealtime();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.m0(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.l0(x0Var2, booleanExtra, intExtra, c12596x96aa9e2c2, x6Var2)));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTaskPreloadReceiver", "[PreloadProfile][%s] Trigger cost [%d]ms Receiver cost [%d]ms, at [%d], level [%d], scene[%s]", str, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - longExtra), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), java.lang.Long.valueOf(elapsedRealtime), java.lang.Integer.valueOf(intExtra), x6Var2);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        a("", intent);
    }
}
