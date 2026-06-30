package com.tencent.mm.modelstat;

/* loaded from: classes12.dex */
public class t extends u31.b implements com.tencent.mm.modelbase.i1 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f71579d = tp3.b.a("ã\u00ad¢¬ç¿»¨ª§£¬®¥í") + "$" + tp3.b.a("µ´¨£¤±°");

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f71580e = tp3.b.a("µ¹ªªä¤®°è£¿°®°·");

    public static long l(com.tencent.mm.vfs.r6 r6Var, long j17) {
        long C;
        long j18 = 0;
        try {
            com.tencent.mm.vfs.r6[] G = r6Var.G();
            for (int i17 = 0; i17 < G.length; i17++) {
                if (G[i17].y()) {
                    C = l(G[i17], j17);
                } else {
                    if (G[i17].C() > j17) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.NetStatMsgExtension", "getFolderSize filesize:%s [%s]", java.lang.Long.valueOf(G[i17].C()), G[i17].u());
                    }
                    C = G[i17].C();
                }
                j18 += C;
            }
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.NetStatMsgExtension", "getFolderSize :%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
        return j18;
    }

    /* JADX WARN: Removed duplicated region for block: B:159:0x061d  */
    @Override // com.tencent.mm.modelbase.t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.modelbase.q0 b1(com.tencent.mm.modelbase.p0 r24) {
        /*
            Method dump skipped, instructions count: 1757
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.modelstat.t.b1(com.tencent.mm.modelbase.p0):com.tencent.mm.modelbase.q0");
    }

    @Override // u31.c
    public void si(final int i17, final int i18, final int i19, final int i27) {
        if (!gm0.j1.b().m()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetStatMsgExtension", "account not initialized");
        } else {
            if (!gm0.j1.i().f273208a.f273299d) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NetStatMsgExtension", "kernel has not startup");
                return;
            }
            ((ku5.t0) ku5.t0.f312615d).h(new java.lang.Runnable() { // from class: com.tencent.mm.modelstat.t$$a
                @Override // java.lang.Runnable
                public final void run() {
                    int i28 = i17;
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(i28);
                    int i29 = i18;
                    java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i29);
                    int i37 = i19;
                    java.lang.Integer valueOf3 = java.lang.Integer.valueOf(i37);
                    int i38 = i27;
                    com.tencent.mars.xlog.Log.i("MicroMsg.NetStatMsgExtension", "reportNetFlow wifi[%d, %d] mobile[%d, %d]", valueOf, valueOf2, valueOf3, java.lang.Integer.valueOf(i38));
                    if (com.tencent.mm.network.y2.a(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                        com.tencent.mm.modelstat.b0.b(i28 > 0 ? i28 : 0L, i29 > 0 ? i29 : 0L, 0);
                    } else {
                        com.tencent.mm.modelstat.b0.a(i37 > 0 ? i37 : 0L, i38 > 0 ? i38 : 0L, 0);
                    }
                }
            }, "reportNetFlow");
        }
    }

    @Override // com.tencent.mm.modelbase.t0
    public void x5(com.tencent.mm.modelbase.r0 r0Var) {
    }
}
