package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1;

/* loaded from: classes7.dex */
public final class i1 implements com.p314xaae8f345.mm.app.h4 {
    @Override // com.p314xaae8f345.mm.app.h4
    public void a(java.lang.Thread crashThread, java.lang.String str, java.lang.Throwable thr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(crashThread, "crashThread");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thr, "thr");
    }

    @Override // com.p314xaae8f345.mm.app.h4
    public void e(int i17, java.lang.String str) {
        if (str != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.j1 j1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.j1.f172270a;
            if (r26.n0.B(str, "com.eclipsesource.mmv8", false) || r26.n0.B(str, "mmv8.so", false)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.V8CrashMonitor", "found v8 crash");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0 q0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0.f156760a;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17 = q0Var.a();
                if (a17 != null) {
                    a17.G(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.j1.f172274e, false);
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a18 = q0Var.a();
                j1Var.b((a18 != null ? a18.getInt(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.j1.f172275f, 0) : 0) + 1);
            }
        }
    }
}
