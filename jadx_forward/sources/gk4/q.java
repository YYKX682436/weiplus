package gk4;

/* loaded from: classes10.dex */
public final class q implements android.graphics.SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk4.r f354127d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.SurfaceTexture f354128e;

    public q(gk4.r rVar, android.graphics.SurfaceTexture surfaceTexture) {
        this.f354127d = rVar;
        this.f354128e = surfaceTexture;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        gk4.r rVar = this.f354127d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(rVar.f354135g, "first frame available");
        rVar.l();
        this.f354128e.setOnFrameAvailableListener(null);
    }
}
