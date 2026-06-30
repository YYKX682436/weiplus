package ff1;

/* loaded from: classes15.dex */
public class d implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12277x3bbbdb47 f343134d;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12277x3bbbdb47 abstractC12277x3bbbdb47) {
        this.f343134d = abstractC12277x3bbbdb47;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12277x3bbbdb47 abstractC12277x3bbbdb47 = this.f343134d;
        android.view.Surface surface = abstractC12277x3bbbdb47.f165191f;
        ((ku5.t0) ku5.t0.f394148d).g(new ff1.e(abstractC12277x3bbbdb47, surface));
        abstractC12277x3bbbdb47.f165191f = new android.view.Surface(surfaceTexture);
        abstractC12277x3bbbdb47.e("on texture available %d*%d mIsPrepared[%b] mSurface[%d] ", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(abstractC12277x3bbbdb47.f165193h), java.lang.Integer.valueOf(abstractC12277x3bbbdb47.f165191f.hashCode()));
        ye1.e eVar = abstractC12277x3bbbdb47.f165192g;
        if (eVar == null || !abstractC12277x3bbbdb47.f165193h) {
            abstractC12277x3bbbdb47.h();
        } else {
            eVar.mo1864x42c875eb(abstractC12277x3bbbdb47.f165191f);
            if (abstractC12277x3bbbdb47.H) {
                abstractC12277x3bbbdb47.f165192g.mo1865x68ac462();
            } else {
                abstractC12277x3bbbdb47.I = true;
                abstractC12277x3bbbdb47.f165192g.c(0.0f, 0.0f);
                abstractC12277x3bbbdb47.f165192g.mo1865x68ac462();
            }
            abstractC12277x3bbbdb47.H = false;
        }
        ff1.c0 c0Var = abstractC12277x3bbbdb47.f165201s;
        if (c0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12278xb84f839e abstractC12278xb84f839e = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12278xb84f839e) c0Var;
            abstractC12278xb84f839e.k("MicroMsg.Video.AbstractVideoView", "on surface available", new java.lang.Object[0]);
            abstractC12278xb84f839e.p(false);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12277x3bbbdb47 abstractC12277x3bbbdb47 = this.f343134d;
        abstractC12277x3bbbdb47.e("on texture destroyed mIsPrepared[%b]", java.lang.Boolean.valueOf(abstractC12277x3bbbdb47.f165193h));
        android.view.Surface surface = abstractC12277x3bbbdb47.f165191f;
        ((ku5.t0) ku5.t0.f394148d).g(new ff1.e(abstractC12277x3bbbdb47, surface));
        abstractC12277x3bbbdb47.f165191f = null;
        if (abstractC12277x3bbbdb47.f165192g == null || !abstractC12277x3bbbdb47.f165193h) {
            abstractC12277x3bbbdb47.j();
            abstractC12277x3bbbdb47.H = false;
        } else if (abstractC12277x3bbbdb47.c()) {
            abstractC12277x3bbbdb47.H = true;
            abstractC12277x3bbbdb47.f165192g.mo1857x65825f6();
        }
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12277x3bbbdb47.Q;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12277x3bbbdb47 abstractC12277x3bbbdb47 = this.f343134d;
        abstractC12277x3bbbdb47.e("on texture size changed width : " + i17 + " height : " + i18, new java.lang.Object[0]);
        ye1.e eVar = abstractC12277x3bbbdb47.f165192g;
        if (eVar != null && abstractC12277x3bbbdb47.f165193h && abstractC12277x3bbbdb47.f165194i == i17 && abstractC12277x3bbbdb47.f165195m == i18) {
            eVar.mo1865x68ac462();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
        ff1.d0 d0Var;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12277x3bbbdb47.Q;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12277x3bbbdb47 abstractC12277x3bbbdb47 = this.f343134d;
        abstractC12277x3bbbdb47.d("on surface texture updated", new java.lang.Object[0]);
        if (abstractC12277x3bbbdb47.I) {
            ye1.e eVar = abstractC12277x3bbbdb47.f165192g;
            if (eVar != null) {
                eVar.mo1857x65825f6();
                if (abstractC12277x3bbbdb47.L) {
                    abstractC12277x3bbbdb47.f165192g.c(0.0f, 0.0f);
                } else {
                    abstractC12277x3bbbdb47.f165192g.c(1.0f, 1.0f);
                }
            }
            abstractC12277x3bbbdb47.I = false;
        }
        if (abstractC12277x3bbbdb47.G > 0 && (d0Var = abstractC12277x3bbbdb47.f165198p) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12278xb84f839e abstractC12278xb84f839e = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12278xb84f839e) d0Var;
            abstractC12278xb84f839e.k("MicroMsg.Video.AbstractVideoView", "onTextureUpdate ", new java.lang.Object[0]);
            abstractC12278xb84f839e.i();
            abstractC12277x3bbbdb47.f165198p = null;
        }
        abstractC12277x3bbbdb47.G = java.lang.System.currentTimeMillis();
        if (abstractC12277x3bbbdb47.f165188J) {
            abstractC12277x3bbbdb47.e("flush surface pause now time[%d]", java.lang.Integer.valueOf(abstractC12277x3bbbdb47.mo51447x9746038c()));
            ye1.e eVar2 = abstractC12277x3bbbdb47.f165192g;
            if (eVar2 != null) {
                eVar2.mo1857x65825f6();
                abstractC12277x3bbbdb47.mo51456x764d819b(abstractC12277x3bbbdb47.L);
            }
            abstractC12277x3bbbdb47.f165188J = false;
        }
    }
}
