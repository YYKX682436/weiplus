package ro5;

/* loaded from: classes14.dex */
public final class e0 implements bp5.h {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.SurfaceTexture f479719d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f479720e;

    /* renamed from: f, reason: collision with root package name */
    public android.util.Size f479721f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f479722g;

    public e0(android.graphics.SurfaceTexture surfaceTexture) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surfaceTexture, "surfaceTexture");
        this.f479719d = surfaceTexture;
        this.f479720e = "MicroMsg.ILinkVoIPRenderLogic-" + hashCode() + '-' + surfaceTexture;
        this.f479721f = new android.util.Size(0, 0);
    }

    @Override // bp5.h
    /* renamed from: getNeedRecreate */
    public boolean mo11007x8d92861b() {
        return this.f479722g;
    }

    @Override // bp5.h
    /* renamed from: getRenderSize */
    public android.util.Size mo11008x356c92ad() {
        return this.f479721f;
    }

    @Override // bp5.h
    /* renamed from: getRenderTarget */
    public java.lang.Object mo11009x8dd3293d() {
        return this.f479719d;
    }

    @Override // bp5.h
    /* renamed from: setNeedRecreate */
    public void mo11010xc3db8127(boolean z17) {
        this.f479722g = z17;
    }
}
