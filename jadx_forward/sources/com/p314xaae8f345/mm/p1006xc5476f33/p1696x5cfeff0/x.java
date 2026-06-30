package com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0;

/* loaded from: classes14.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.SurfaceTexture f218821d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.b0 f218822e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.d0 f218823f;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.d0 d0Var, android.graphics.SurfaceTexture surfaceTexture, com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.b0 b0Var) {
        this.f218823f = d0Var;
        this.f218821d = surfaceTexture;
        this.f218822e = b0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.b0 b0Var = this.f218822e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.d0 d0Var = this.f218823f;
        try {
            d0Var.f218734d.i(this.f218821d);
            com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.s.o(d0Var.f218735e, d0Var.f218736f, 5);
            try {
                d0Var.f218734d.k();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerCamera", "startPreview failed:" + e17.getMessage());
                d0Var.f218741k = false;
                if (b0Var != null) {
                    b0Var.a(java.lang.Boolean.FALSE, null);
                }
            }
        } catch (java.io.IOException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerCamera", "setPreviewTexture failed:" + e18.getMessage());
            d0Var.f218741k = false;
            if (b0Var != null) {
                b0Var.a(java.lang.Boolean.FALSE, null);
            }
        }
    }
}
