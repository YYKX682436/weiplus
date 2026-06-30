package nq;

/* loaded from: classes8.dex */
public class t {
    public t(nq.i iVar) {
    }

    public synchronized void a(nq.s sVar) {
        mq.h.b("MicroMsg.GLThread", "exiting tid=" + sVar.getId(), new java.lang.Object[0]);
        com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.SurfaceHolderCallback2C10435xb52e77fb surfaceHolderCallback2C10435xb52e77fb = (com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.SurfaceHolderCallback2C10435xb52e77fb) sVar.C.get();
        if (surfaceHolderCallback2C10435xb52e77fb != null) {
            nq.f fVar = (nq.f) surfaceHolderCallback2C10435xb52e77fb.f146416g;
            fVar.getClass();
            mq.h.b("MicroMsg.DynamicBgSurfaceView", "alvinluo DynamicBackgroundSurfaceView.Renderer onDestroy", new java.lang.Object[0]);
            try {
                com.p314xaae8f345.mm.p676x4c4db2ad.p677x633fb29.C10432x58e9524 c10432x58e9524 = fVar.f420400a;
                if (c10432x58e9524 != null) {
                    c10432x58e9524.a();
                }
            } catch (java.lang.Throwable th6) {
                mq.h.c("MicroMsg.DynamicBgSurfaceView", th6, "alvinluo nativeRelease exception", new java.lang.Object[0]);
            }
        } else {
            mq.h.b("MicroMsg.GLThread", "onFinalize:view = null", new java.lang.Object[0]);
        }
        nq.q qVar = sVar.B;
        qVar.getClass();
        mq.h.d("MicroMsg.GLThread", "destroySurface()  tid=" + java.lang.Thread.currentThread().getId(), new java.lang.Object[0]);
        qVar.b();
        if (sVar.f420444r) {
            sVar.f420444r = false;
            sVar.f420445s = false;
        }
        sVar.d();
        try {
            sVar.B.c();
        } catch (java.lang.Throwable th7) {
            mq.h.a("GLThreadManager", "alvinluo GLThread#threadExiting finish stack = [%s]", android.util.Log.getStackTraceString(th7));
            if (surfaceHolderCallback2C10435xb52e77fb != null) {
                ((nq.f) surfaceHolderCallback2C10435xb52e77fb.f146416g).e(th7);
            }
        }
        sVar.f420435f.quit();
        notifyAll();
    }
}
