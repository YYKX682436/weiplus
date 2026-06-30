package com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36;

/* loaded from: classes14.dex */
public class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.ViewOnClickListenerC15534xde6dcfdd f218717d;

    public u0(com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.ViewOnClickListenerC15534xde6dcfdd viewOnClickListenerC15534xde6dcfdd) {
        this.f218717d = viewOnClickListenerC15534xde6dcfdd;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.ViewOnClickListenerC15534xde6dcfdd viewOnClickListenerC15534xde6dcfdd = this.f218717d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.C15533x22cea970 c15533x22cea970 = viewOnClickListenerC15534xde6dcfdd.f218636e;
        c15533x22cea970.f218632q.cancel();
        c15533x22cea970.f218633r.cancel();
        c15533x22cea970.f218634s.cancel();
        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.TextureViewSurfaceTextureListenerC15532xe9ad4809 textureViewSurfaceTextureListenerC15532xe9ad4809 = viewOnClickListenerC15534xde6dcfdd.f218635d;
        textureViewSurfaceTextureListenerC15532xe9ad4809.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionPreviewLayout", "release");
        textureViewSurfaceTextureListenerC15532xe9ad4809.f218601g.clearAnimation();
        textureViewSurfaceTextureListenerC15532xe9ad4809.f218602h.clearAnimation();
        textureViewSurfaceTextureListenerC15532xe9ad4809.f218612t.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManager", "releaseYTSdk");
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.m120758x9cf0d20b().m120760xb056bd31();
        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.d0 d0Var = textureViewSurfaceTextureListenerC15532xe9ad4809.f218610r;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = d0Var.f218733c;
        if (n3Var != null) {
            n3Var.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.a0(d0Var));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerCamera", "back thread is not running");
        }
        tz2.u uVar = textureViewSurfaceTextureListenerC15532xe9ad4809.f218614v;
        if (uVar != null) {
            uVar.mo63481x41012807();
        }
        textureViewSurfaceTextureListenerC15532xe9ad4809.f218619y0.cancel();
        wu5.c cVar = textureViewSurfaceTextureListenerC15532xe9ad4809.G;
        if (cVar != null) {
            cVar.cancel(false);
            textureViewSurfaceTextureListenerC15532xe9ad4809.G = null;
        }
        if (textureViewSurfaceTextureListenerC15532xe9ad4809.P) {
            android.content.Context context = textureViewSurfaceTextureListenerC15532xe9ad4809.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.j0) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.j0.class)).f218681d.f504850a) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashRecordManagerForPay", "releaseRecord");
                h72.s.e().d();
            }
        }
        gm0.j1.d().q(5965, textureViewSurfaceTextureListenerC15532xe9ad4809);
    }
}
