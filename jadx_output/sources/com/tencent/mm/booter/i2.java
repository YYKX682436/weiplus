package com.tencent.mm.booter;

/* loaded from: classes11.dex */
public abstract class i2 {
    public static void a() {
        int b17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("EnableForgroundService", 0);
        int b18 = kk.m.b(c01.d9.b().C(), 101);
        boolean z17 = z65.c.a() || (b17 > 0 && b18 >= 0 && b18 <= b17);
        if (!z17) {
            z17 = o45.wf.f343033k;
        }
        if (!z17) {
            z17 = z65.c.a();
        }
        if (com.tencent.mm.sdk.platformtools.a0.f192439b == 1) {
            z17 = false;
        }
        com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("system_config_prefs", 0).edit().putBoolean("set_service", z17).commit();
        com.tencent.mars.xlog.Log.i("MicroMsg.PostTaskSetPushForegroundService", "Set service, userHash:%d, prob:%d, enabled: %b  isalpha:%b channel:%d", java.lang.Integer.valueOf(b18), java.lang.Integer.valueOf(b17), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(o45.wf.f343033k), java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.a0.f192439b));
    }
}
