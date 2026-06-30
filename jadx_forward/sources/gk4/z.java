package gk4;

/* loaded from: classes10.dex */
public final class z implements android.graphics.SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk4.h0 f354172d;

    public z(gk4.h0 h0Var) {
        this.f354172d = h0Var;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        android.os.Looper myLooper = android.os.Looper.myLooper();
        gk4.h0 h0Var = this.f354172d;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = h0Var.f354093e;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(myLooper, n3Var != null ? n3Var.mo50280x23b2dd47() : null)) {
            h0Var.e(new gk4.y(surfaceTexture, h0Var));
            return;
        }
        try {
            surfaceTexture.updateTexImage();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(h0Var.f354089a, e17, "updateTexImage error", new java.lang.Object[0]);
        }
        gk4.h0.b(h0Var, surfaceTexture.getTimestamp());
    }
}
