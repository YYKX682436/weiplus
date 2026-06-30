package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29;

/* loaded from: classes14.dex */
public final class u2 implements android.graphics.SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.b3 f231687d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.SurfaceTexture f231688e;

    public u2(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.b3 b3Var, android.graphics.SurfaceTexture surfaceTexture) {
        this.f231687d = b3Var;
        this.f231688e = surfaceTexture;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.b3 b3Var = this.f231687d;
        b3Var.getClass();
        b3Var.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.x2(b3Var));
        this.f231688e.updateTexImage();
    }
}
