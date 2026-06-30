package com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36;

/* loaded from: classes14.dex */
public class q implements com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.s f218705a;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.s sVar) {
        this.f218705a = sVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.b0
    public void a(java.lang.Boolean bool, com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.d0 d0Var) {
        if (bool.booleanValue()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceFlashActionPreviewLayout", "startPreview open camera failed");
        vz2.c.k("openCamera", -1);
        vz2.c.b().B = 1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.TextureViewSurfaceTextureListenerC15532xe9ad4809 textureViewSurfaceTextureListenerC15532xe9ad4809 = this.f218705a.f218712b;
        textureViewSurfaceTextureListenerC15532xe9ad4809.f218611s.a7(textureViewSurfaceTextureListenerC15532xe9ad4809.d(90038, i65.a.r(textureViewSurfaceTextureListenerC15532xe9ad4809.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.c7m)));
    }
}
