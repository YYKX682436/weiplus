package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes14.dex */
public final class wm implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.xm f214833d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f214834e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f214835f;

    public wm(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.xm xmVar, yz5.l lVar, yz5.a aVar) {
        this.f214833d = xmVar;
        this.f214834e = lVar;
        this.f214835f = aVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surface, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.xm xmVar = this.f214833d;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = xmVar.f214883k;
        if (n3Var != null) {
            n3Var.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.vm(xmVar, surface, this.f214834e, this.f214835f));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("handler");
            throw null;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        this.f214833d.d();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surface, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
    }
}
