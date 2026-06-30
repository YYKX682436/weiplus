package com.p314xaae8f345.mm.p669x38b6e557;

/* loaded from: classes.dex */
public class r4 implements com.p314xaae8f345.mm.p669x38b6e557.g5 {
    @Override // com.p314xaae8f345.mm.p669x38b6e557.g5
    public void a(android.content.Intent intent) {
        int i17;
        if (!z65.c.a() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274507b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("enable");
        if (android.text.TextUtils.isEmpty(stringExtra)) {
            ((r40.k) ((uc.o) i95.n0.c(uc.o.class))).getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Shell", "FINDER_SUPPORT_FIND_PAGE_LIVE: enabled: %s", java.lang.Integer.valueOf(((java.lang.Number) kb2.c.f387759a.r()).intValue()));
            return;
        }
        try {
            i17 = java.lang.Integer.parseInt(stringExtra);
        } catch (java.lang.Throwable unused) {
            i17 = -1;
        }
        if (i17 != 0 && i17 != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Shell", "FINDER_SUPPORT_FIND_PAGE_LIVE, bad args, use 0 for disable an 1 for enable.");
            return;
        }
        ((r40.k) ((uc.o) i95.n0.c(uc.o.class))).getClass();
        lb2.j jVar = kb2.c.f387759a;
        jVar.n(i17);
        ((r40.k) ((uc.o) i95.n0.c(uc.o.class))).getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Shell", "FINDER_SUPPORT_FIND_PAGE_LIVE: status updated, enabled: %s", java.lang.Integer.valueOf(((java.lang.Number) jVar.r()).intValue()));
    }
}
