package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes7.dex */
public class u7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 f157524d;

    public u7(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 interfaceC11702x4ae7c33) {
        this.f157524d = interfaceC11702x4ae7c33;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        boolean z17;
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            ((ku5.t0) ku5.t0.f394148d).b(this, "MicroMsg.AppBrand.WxaCommLibPreloadNotify");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 interfaceC11702x4ae7c33 = this.f157524d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 interfaceC11702x4ae7c332 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.e8.f157048a;
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.e8.class) {
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.e8.f157048a == null || interfaceC11702x4ae7c33.compareTo(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.e8.f157048a) != 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.e8.f157048a = interfaceC11702x4ae7c33;
                z17 = true;
            } else {
                z17 = false;
            }
        }
        int c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l.c();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.WxaCommLibPreloadNotify", "IPC_resetAppBrandCommLibReader#invoke() waitForPreloaded entered, process[%s], pkgInfo[%s], globalReaderUpdated[%b], runningRuntimeCount[%d]", bm5.f1.a(), this.f157524d, java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(c17));
        if (!z17 || c17 > 0) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.x6 x6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.x6.P;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.b0 b0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.r.f170693a;
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.r.class) {
            for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0 x0Var : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.r.e()) {
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.r.m(x0Var)) {
                    java.util.Queue queue = (java.util.Queue) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.r.f170696d.get(x0Var);
                    if (queue != null) {
                        java.util.Iterator it = queue.iterator();
                        while (it.hasNext()) {
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) it.next()).h();
                        }
                    }
                    java.util.Queue queue2 = (java.util.Queue) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.r.f170695c.get(x0Var);
                    if (queue2 != null) {
                        java.util.Iterator it6 = queue2.iterator();
                        while (it6.hasNext()) {
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) it6.next()).h();
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.r.j(x0Var, null, true, null, x6Var, 2);
                }
            }
        }
    }
}
