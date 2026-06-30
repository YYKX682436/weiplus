package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030;

/* loaded from: classes12.dex */
public final class p implements wh.u0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p f149157a = new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p();

    @Override // wh.u0
    /* renamed from: apply */
    public java.lang.Object mo40854x58b836e(java.lang.Object obj) {
        rh.c3 spl = (rh.c3) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(spl, "spl");
        oh.f fVar = new oh.f();
        if (!(((java.lang.Boolean) ((jz5.n) oh.f.f426713g).mo141623x754a37bb()).booleanValue() || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(oh.f.f426711e, java.lang.Boolean.TRUE))) {
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a("/sys/class/kgsl/kgsl-3d0/gpubusy"));
            if (r6Var.m()) {
                oh.f.f426712f = 0;
                oh.f.f426711e = java.lang.Boolean.FALSE;
                java.lang.String a17 = wh.m.a(r6Var.o());
                if (a17 != null) {
                    if (!r26.n0.B(a17, " ", false)) {
                        a17 = null;
                    }
                    if (a17 != null) {
                        java.util.List f07 = r26.n0.f0(r26.n0.u0(a17).toString(), new java.lang.String[]{" "}, false, 0, 6, null);
                        if (f07.size() == 2) {
                            long F1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F1((java.lang.String) f07.get(0), 0L);
                            long F12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F1((java.lang.String) f07.get(1), 0L);
                            if (F1 < 0 || F12 < 0) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GpuBusySnapshot", "format invalid: ".concat(a17));
                            } else {
                                fVar.f426714d = rh.x2.b(java.lang.Float.valueOf(F12 == 0 ? 0.0f : ri.b0.e((((float) F1) * 100.0f) / ((float) F12), 2)));
                            }
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GpuBusySnapshot", "format not match: ".concat(a17));
                        }
                    }
                }
            } else {
                java.lang.String str = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134252a;
                if (com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134272u) {
                    int i17 = oh.f.f426712f + 1;
                    oh.f.f426712f = i17;
                    if (i17 >= 20) {
                        oh.f.f426711e = java.lang.Boolean.TRUE;
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GpuBusySnapshot", "file not exists: " + r6Var.o() + ", checkCount=" + oh.f.f426712f);
            }
        }
        java.lang.Float f17 = (java.lang.Float) fVar.f426714d.f477085a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BatteryMonitorService", "onSampling " + spl.f476879g + ' ' + spl.f476873a + ", val = " + f17 + '%');
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f17);
        return f17.floatValue() >= 0.0f ? f17 : rh.c3.f476872o;
    }
}
