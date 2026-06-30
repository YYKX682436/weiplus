package com.tencent.mm.console;

/* loaded from: classes.dex */
public class r4 implements com.tencent.mm.console.g5 {
    @Override // com.tencent.mm.console.g5
    public void a(android.content.Intent intent) {
        int i17;
        if (!z65.c.a() && !com.tencent.mm.sdk.platformtools.s9.f192974b) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("enable");
        if (android.text.TextUtils.isEmpty(stringExtra)) {
            ((r40.k) ((uc.o) i95.n0.c(uc.o.class))).getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.Shell", "FINDER_SUPPORT_FIND_PAGE_LIVE: enabled: %s", java.lang.Integer.valueOf(((java.lang.Number) kb2.c.f306226a.r()).intValue()));
            return;
        }
        try {
            i17 = java.lang.Integer.parseInt(stringExtra);
        } catch (java.lang.Throwable unused) {
            i17 = -1;
        }
        if (i17 != 0 && i17 != 1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Shell", "FINDER_SUPPORT_FIND_PAGE_LIVE, bad args, use 0 for disable an 1 for enable.");
            return;
        }
        ((r40.k) ((uc.o) i95.n0.c(uc.o.class))).getClass();
        lb2.j jVar = kb2.c.f306226a;
        jVar.n(i17);
        ((r40.k) ((uc.o) i95.n0.c(uc.o.class))).getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Shell", "FINDER_SUPPORT_FIND_PAGE_LIVE: status updated, enabled: %s", java.lang.Integer.valueOf(((java.lang.Number) jVar.r()).intValue()));
    }
}
