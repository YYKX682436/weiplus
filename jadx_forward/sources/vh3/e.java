package vh3;

/* loaded from: classes14.dex */
public final class e implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1872xc84b4196.C16526x1c450e56 f518579d;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1872xc84b4196.C16526x1c450e56 c16526x1c450e56) {
        this.f518579d = c16526x1c450e56;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surface, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1872xc84b4196.C16526x1c450e56 c16526x1c450e56 = this.f518579d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c16526x1c450e56.m66769x23aed0ac(), "onSurfaceTextureAvailable surface:" + surface + " [" + i17 + ", " + i18 + "] listener:" + c16526x1c450e56.f230331e);
        c16526x1c450e56.getClass();
        vh3.a aVar = c16526x1c450e56.f230331e;
        if (aVar != null) {
            ((uh3.a) aVar).s(surface);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1872xc84b4196.C16526x1c450e56 c16526x1c450e56 = this.f518579d;
        vh3.a aVar = c16526x1c450e56.f230331e;
        if (aVar != null) {
            ((uh3.a) aVar).u(surface);
            z17 = false;
        } else {
            z17 = true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c16526x1c450e56.m66769x23aed0ac(), "onSurfaceTextureDestroyed surface:" + surface + " result:" + z17 + " listener:" + c16526x1c450e56.f230331e);
        return z17;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surface, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1872xc84b4196.C16526x1c450e56 c16526x1c450e56 = this.f518579d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c16526x1c450e56.m66769x23aed0ac(), "onSurfaceTextureSizeChanged surface:" + surface + " [" + i17 + ", " + i18 + "] listener:" + c16526x1c450e56.f230331e);
        vh3.a aVar = c16526x1c450e56.f230331e;
        if (aVar != null) {
            ((uh3.a) aVar).t(surface, i17, i18);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        vh3.a aVar = this.f518579d.f230331e;
    }
}
