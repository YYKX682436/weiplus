package ro5;

/* loaded from: classes14.dex */
public final class q0 implements android.graphics.SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f479818d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dp5.f f479819e;

    public q0(yz5.p pVar, dp5.f fVar) {
        this.f479818d = pVar;
        this.f479819e = fVar;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(((dp5.a) this.f479819e).f323805d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(surfaceTexture);
        this.f479818d.mo149xb9724478(valueOf, surfaceTexture);
    }
}
