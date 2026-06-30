package com.p314xaae8f345.mm.p642xad8b531f;

/* loaded from: classes11.dex */
public abstract class i2 {
    public static void a() {
        int b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("EnableForgroundService", 0);
        int b18 = kk.m.b(c01.d9.b().C(), 101);
        boolean z17 = z65.c.a() || (b17 > 0 && b18 >= 0 && b18 <= b17);
        if (!z17) {
            z17 = o45.wf.f424566k;
        }
        if (!z17) {
            z17 = z65.c.a();
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273972b == 1) {
            z17 = false;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("system_config_prefs", 0).edit().putBoolean("set_service", z17).commit();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PostTaskSetPushForegroundService", "Set service, userHash:%d, prob:%d, enabled: %b  isalpha:%b channel:%d", java.lang.Integer.valueOf(b18), java.lang.Integer.valueOf(b17), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(o45.wf.f424566k), java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273972b));
    }
}
