package lw1;

/* loaded from: classes14.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lw1.f f403082d;

    public c(lw1.f fVar) {
        this.f403082d = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rs0.h hVar;
        android.opengl.EGLContext eGLContext;
        lw1.f fVar = this.f403082d;
        if (fVar.f403086f == null) {
            iw1.f fVar2 = fVar.f403085e;
            if (fVar2 == null || (hVar = fVar2.f376741e) == null || (eGLContext = hVar.f480827c) == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MTR.GLDispatcher", "main gl context is null");
            } else {
                fVar.f403086f = fVar.K(new iw1.a(fVar.f403088h, eGLContext, new lw1.b(fVar.f403089i), -1L));
            }
        }
    }
}
