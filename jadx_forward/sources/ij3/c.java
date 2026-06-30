package ij3;

/* loaded from: classes14.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ij3.f f373234d;

    public c(ij3.f fVar) {
        this.f373234d = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rs0.h hVar;
        android.opengl.EGLContext eGLContext;
        ij3.f fVar = this.f373234d;
        if (fVar.f373238f == null) {
            fj3.f fVar2 = fVar.f373237e;
            if (fVar2 == null || (hVar = fVar2.f344736e) == null || (eGLContext = hVar.f480827c) == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MTR.GLDispatcher", "main gl context is null");
            } else {
                fVar.f373238f = fVar.K(new fj3.a(fVar.f373240h, eGLContext, new ij3.b(fVar.f373241i), -1L));
            }
        }
    }
}
