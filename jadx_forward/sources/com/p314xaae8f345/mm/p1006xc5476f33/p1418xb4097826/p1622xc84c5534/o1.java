package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes3.dex */
public final class o1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.n1 f206737d;

    public o1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.n1 n1Var) {
        this.f206737d = n1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.m1 m1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.m1();
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        android.os.Debug.MemoryInfo[] processMemoryInfo = ((android.app.ActivityManager) systemService).getProcessMemoryInfo(new int[]{android.os.Process.myPid()});
        if (processMemoryInfo != null && processMemoryInfo.length == 1) {
            android.os.Debug.MemoryInfo memoryInfo = processMemoryInfo[0];
            m1Var.f206655a = memoryInfo.getTotalPss();
            m1Var.f206656b = memoryInfo.dalvikPss;
            m1Var.f206657c = memoryInfo.nativePss;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.n1 n1Var = this.f206737d;
        if (n1Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.e0 e0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.e0) n1Var;
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.d0(m1Var, e0Var.f197794a, e0Var.f197795b));
        }
    }
}
