package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421;

/* loaded from: classes.dex */
public final class m2 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.e {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.e
    public void a(android.content.Intent intent) {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (!z65.c.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.DebuggerShell", "[AfterLaunchTiming] SetAfterLaunchAdvance ignored, not debug env");
            return;
        }
        ?? r07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(intent.getStringExtra("enabled"), 0) == 1 ? 1 : 0;
        jz5.g gVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s.f172081a;
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (z65.c.a()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("appbrand_debug_expt");
            M.getClass();
            M.putInt("afterlaunch_advance_override", r07);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DebuggerShell", "[AfterLaunchTiming] SetAfterLaunchAdvance enabled=%b", java.lang.Boolean.valueOf((boolean) r07));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.e
    /* renamed from: name */
    public java.lang.String mo50165x337a8b() {
        return "SetAfterLaunchAdvance";
    }
}
