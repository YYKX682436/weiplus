package zr0;

/* loaded from: classes10.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zr0.c f556638d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.opengl.EGLContext f556639e;

    public a(zr0.c cVar, android.opengl.EGLContext eGLContext) {
        this.f556638d = cVar;
        this.f556639e = eGLContext;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        rs0.h n17 = rs0.g.n(rs0.i.f480829a, null, null, 0, 0, this.f556639e, 14, null);
        zr0.c cVar = this.f556638d;
        cVar.f556647h = n17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseCustomRenderCallback", "eglSetupBySurface finish,envCost:" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        cVar.b();
    }
}
