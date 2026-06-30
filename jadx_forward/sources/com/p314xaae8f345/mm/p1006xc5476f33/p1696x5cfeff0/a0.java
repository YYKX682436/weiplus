package com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0;

/* loaded from: classes14.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.d0 f218595d;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.d0 d0Var) {
        this.f218595d = d0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.d0 d0Var = this.f218595d;
        d0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerCamera", "closeCamera start");
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.v.b().d(d0Var.f218748r);
        wo.d1 d1Var = d0Var.f218734d;
        if (d1Var != null) {
            try {
                if (d0Var.f218741k) {
                    d0Var.f218741k = false;
                    d1Var.l();
                    d0Var.f218734d.g(null);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerCamera", "stop preview, not previewing");
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerCamera", "Error setting camera preview: " + e17.getMessage());
            }
            try {
                try {
                    d0Var.f218734d.g(null);
                    d0Var.f218734d.d();
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerCamera", "Error setting camera preview: " + e18.getMessage());
                }
            } finally {
                d0Var.f218734d = null;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerCamera", "closeCamera end");
        if (d0Var.f218732b == null) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = d0Var.f218733c;
        if (n3Var != null) {
            n3Var.mo50302x6b17ad39(null);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerCamera", "stop camera thread");
        d0Var.f218732b.quitSafely();
        d0Var.f218732b = null;
        d0Var.f218733c = null;
        d0Var.f218747q = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerCamera", "stop camera thread finish");
    }
}
