package com.tencent.mm.feature.performance;

/* loaded from: classes12.dex */
public final class p implements wh.u0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.feature.performance.p f67624a = new com.tencent.mm.feature.performance.p();

    @Override // wh.u0
    public java.lang.Object apply(java.lang.Object obj) {
        rh.c3 spl = (rh.c3) obj;
        kotlin.jvm.internal.o.g(spl, "spl");
        oh.f fVar = new oh.f();
        if (!(((java.lang.Boolean) ((jz5.n) oh.f.f345180g).getValue()).booleanValue() || kotlin.jvm.internal.o.b(oh.f.f345178e, java.lang.Boolean.TRUE))) {
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a("/sys/class/kgsl/kgsl-3d0/gpubusy"));
            if (r6Var.m()) {
                oh.f.f345179f = 0;
                oh.f.f345178e = java.lang.Boolean.FALSE;
                java.lang.String a17 = wh.m.a(r6Var.o());
                if (a17 != null) {
                    if (!r26.n0.B(a17, " ", false)) {
                        a17 = null;
                    }
                    if (a17 != null) {
                        java.util.List f07 = r26.n0.f0(r26.n0.u0(a17).toString(), new java.lang.String[]{" "}, false, 0, 6, null);
                        if (f07.size() == 2) {
                            long F1 = com.tencent.mm.sdk.platformtools.t8.F1((java.lang.String) f07.get(0), 0L);
                            long F12 = com.tencent.mm.sdk.platformtools.t8.F1((java.lang.String) f07.get(1), 0L);
                            if (F1 < 0 || F12 < 0) {
                                com.tencent.mars.xlog.Log.w("MicroMsg.GpuBusySnapshot", "format invalid: ".concat(a17));
                            } else {
                                fVar.f345181d = rh.x2.b(java.lang.Float.valueOf(F12 == 0 ? 0.0f : ri.b0.e((((float) F1) * 100.0f) / ((float) F12), 2)));
                            }
                        } else {
                            com.tencent.mars.xlog.Log.w("MicroMsg.GpuBusySnapshot", "format not match: ".concat(a17));
                        }
                    }
                }
            } else {
                java.lang.String str = com.tencent.matrix.lifecycle.owners.f0.f52719a;
                if (com.tencent.matrix.lifecycle.owners.f0.f52739u) {
                    int i17 = oh.f.f345179f + 1;
                    oh.f.f345179f = i17;
                    if (i17 >= 20) {
                        oh.f.f345178e = java.lang.Boolean.TRUE;
                    }
                }
                com.tencent.mars.xlog.Log.w("MicroMsg.GpuBusySnapshot", "file not exists: " + r6Var.o() + ", checkCount=" + oh.f.f345179f);
            }
        }
        java.lang.Float f17 = (java.lang.Float) fVar.f345181d.f395552a;
        com.tencent.mars.xlog.Log.i("MicroMsg.BatteryMonitorService", "onSampling " + spl.f395346g + ' ' + spl.f395340a + ", val = " + f17 + '%');
        kotlin.jvm.internal.o.d(f17);
        return f17.floatValue() >= 0.0f ? f17 : rh.c3.f395339o;
    }
}
