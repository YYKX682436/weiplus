package qa1;

/* loaded from: classes14.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qa1.o f442500d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qa1.f0 f442501e;

    public b0(qa1.f0 f0Var, qa1.o oVar) {
        this.f442501e = f0Var;
        this.f442500d = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        qa1.o oVar = this.f442500d;
        qa1.f0 f0Var = this.f442501e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameRecordableSurfaceView.RecordableImp", "hy: onSurfaceTextureDestroyed in thread! can preview: %b", java.lang.Boolean.valueOf(f0Var.f442523n.get()));
        try {
            if (f0Var.f442523n.get()) {
                f0Var.f442523n.getAndSet(false);
                ms0.c cVar = f0Var.f442521i;
                if (cVar != null) {
                    cVar.n(true);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameRecordableSurfaceView.RecordableImp", "hy: no renderer!");
                }
                rs0.h hVar = f0Var.f442520h;
                if (hVar != null) {
                    android.opengl.EGL14.eglDestroyContext(hVar.f480825a, hVar.f480827c);
                    rs0.h hVar2 = f0Var.f442520h;
                    android.opengl.EGL14.eglDestroySurface(hVar2.f480825a, hVar2.f480826b);
                    qa1.p pVar = f0Var.f442516d;
                    pVar.f(pVar.f442545h);
                }
            }
        } catch (java.lang.Throwable th6) {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GameRecordableSurfaceView.RecordableImp", th6, "hy: error in surface destroy!!", new java.lang.Object[0]);
            } finally {
                f0Var.f442516d.b(oVar);
            }
        }
    }
}
