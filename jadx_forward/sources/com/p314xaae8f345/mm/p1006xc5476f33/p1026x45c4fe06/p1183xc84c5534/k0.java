package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534;

/* loaded from: classes7.dex */
public abstract class k0 {

    /* renamed from: a, reason: collision with root package name */
    public static volatile com.p314xaae8f345.mm.p2809x52b77bcb.AbstractC22920xf0d5c107 f169423a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.Object f169424b = new java.lang.Object();

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t tVar) {
        final com.p314xaae8f345.mm.p2809x52b77bcb.AbstractC22920xf0d5c107 l0Var;
        int rj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).rj(e42.c0.clicfg_appbrand_js_thread_hang_sample_rate, 0);
        if (rj6 > 0 && (rj6 >= 10000 || new java.util.Random().nextInt(10000) < rj6)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 t37 = c0Var.t3();
            if (t37 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandJsThreadHangMonitor", "skip attach, runtime is null, appId:%s", c0Var.mo48798x74292566());
                return;
            }
            if (t37.s2()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandJsThreadHangMonitor", "skip attach for remote debug, appId:%s", c0Var.mo48798x74292566());
                return;
            }
            final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0 l0Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0) tVar.h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0.class);
            final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.y) tVar.h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.y.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0 f0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0) tVar.h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0.class);
            if (l0Var2 == null || yVar == null || f0Var == null) {
                java.lang.Object[] objArr = new java.lang.Object[4];
                objArr[0] = c0Var.mo48798x74292566();
                objArr[1] = java.lang.Boolean.valueOf(l0Var2 != null);
                objArr[2] = java.lang.Boolean.valueOf(yVar != null);
                objArr[3] = java.lang.Boolean.valueOf(f0Var != null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandJsThreadHangMonitor", "skip attach, addon missing, appId:%s, hasV8:%b, hasDestroy:%b, hasJsThread:%b", objArr);
                return;
            }
            if (f169423a != null) {
                l0Var = f169423a;
            } else {
                synchronized (f169424b) {
                    if (f169423a != null) {
                        l0Var = f169423a;
                    } else {
                        sk1.b.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                        l0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.l0();
                        l0Var.m83351x68ac462(2000L);
                        f169423a = l0Var;
                    }
                }
            }
            final java.lang.String mo48798x74292566 = c0Var.mo48798x74292566();
            f0Var.k0(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.report.k0$$a
                @Override // java.lang.Runnable
                public final void run() {
                    final long L = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0.this.L();
                    final java.lang.String str = mo48798x74292566;
                    if (L == 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandJsThreadHangMonitor", "attach on JS thread but isolatePtr still 0, appId:%s", str);
                        return;
                    }
                    final com.p314xaae8f345.mm.p2809x52b77bcb.AbstractC22920xf0d5c107 abstractC22920xf0d5c107 = l0Var;
                    abstractC22920xf0d5c107.m83345x4dbd62a6(L, str);
                    yVar.f0(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.x() { // from class: com.tencent.mm.plugin.appbrand.report.k0$$b
                        @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.x
                        /* renamed from: onDestroy */
                        public final void mo32099xac79a11b() {
                            com.p314xaae8f345.mm.p2809x52b77bcb.AbstractC22920xf0d5c107.this.m83346xa5ddc598(L);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandJsThreadHangMonitor", "detach appId:%s, reason:js_runtime_destroy", str);
                        }
                    }, true);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandJsThreadHangMonitor", "attach appId:%s, isolatePtr:0x%x", str, java.lang.Long.valueOf(L));
                }
            });
        }
    }
}
