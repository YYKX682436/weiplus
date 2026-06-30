package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public final class x5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x5 f173909d = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x5();

    @Override // java.lang.Runnable
    public final void run() {
        cm.h hVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12567x34ba321 a17;
        try {
            java.util.LinkedHashMap linkedHashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l.f165742b;
            synchronized (linkedHashMap) {
                hVar = null;
                o6Var = linkedHashMap.isEmpty() ? null : (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) linkedHashMap.values().toArray()[linkedHashMap.size() - 1];
            }
            if (o6Var == null || (a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.a(o6Var)) == null) {
                return;
            }
            java.lang.String e17 = lj.f.e(android.os.Looper.getMainLooper().getThread().getStackTrace());
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7074xa61db380 c7074xa61db380 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7074xa61db380();
            c7074xa61db380.f143812d = c7074xa61db380.b("AppId", o6Var.f156336n, true);
            c7074xa61db380.f143813e = a17.f169672i;
            int i17 = a17.f169669f;
            if (i17 == 1) {
                hVar = cm.h.release;
            } else if (i17 == 2) {
                hVar = cm.h.debug;
            } else if (i17 == 3) {
                hVar = cm.h.demo;
            }
            c7074xa61db380.f143814f = hVar;
            c7074xa61db380.f143815g = a17.f169670g;
            c7074xa61db380.f143816h = a17.f169671h;
            c7074xa61db380.f143817i = c7074xa61db380.b("InstanceId", a17.f169667d, true);
            c7074xa61db380.f143818j = c7074xa61db380.b("ProcessName", bm5.f1.a(), true);
            c7074xa61db380.f143819k = c7074xa61db380.b("ThreadName", com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29, true);
            c7074xa61db380.f143820l = c7074xa61db380.b("Stack", e17, true);
            c7074xa61db380.f143821m = c7074xa61db380.b("StackID", com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(e17), true);
            c7074xa61db380.f143822n = ((java.lang.Number) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y5.f173946c).mo141623x754a37bb()).longValue();
            c7074xa61db380.k();
        } catch (java.lang.Exception unused) {
        }
    }
}
