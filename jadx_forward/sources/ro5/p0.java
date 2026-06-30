package ro5;

/* loaded from: classes14.dex */
public final class p0 implements android.graphics.SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f479808d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ro5.f0 f479809e;

    public p0(yz5.p pVar, ro5.f0 f0Var) {
        this.f479808d = pVar;
        this.f479809e = f0Var;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(((dp5.a) this.f479809e.f479725b).f323805d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(surfaceTexture);
        this.f479808d.mo149xb9724478(valueOf, surfaceTexture);
    }
}
