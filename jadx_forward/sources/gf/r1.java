package gf;

/* loaded from: classes7.dex */
public final class r1 implements io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28712x591f54db {
    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28712x591f54db
    /* renamed from: onCreateTexture */
    public android.graphics.SurfaceTexture mo131415x6473dce0(int i17, java.lang.String str, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SkylineViewRenderEngine", "onCreateTexture engineId:" + i17 + " type:" + str + " id:" + i18);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = gf.h1.f352619a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyCreateTexture type:");
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SkylineTextureManager", sb6.toString());
        gf.a0 a0Var = (gf.a0) gf.h1.f352619a.get(str);
        if (a0Var != null) {
            return a0Var.d(i17, i18);
        }
        return null;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28712x591f54db
    /* renamed from: onDestroyTexture */
    public boolean mo131416xaa156780(int i17, java.lang.String str, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SkylineViewRenderEngine", "onDestroyTexture engineId:" + i17 + " type:" + str + " id:" + i18);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = gf.h1.f352619a;
        gf.a0 a0Var = (gf.a0) gf.h1.f352619a.get(str);
        if (a0Var != null) {
            return a0Var.b(i17, i18);
        }
        return false;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28712x591f54db
    /* renamed from: onTextureDestroy */
    public void mo131417x1bd2261e(int i17, java.lang.String str, int i18) {
        gf.a2.f352545q.remove(str + '_' + i18);
        gg.c cVar = gf.a2.f352544p;
        if (cVar != null) {
            ((gg.a) cVar).f(str, i18);
        }
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28712x591f54db
    /* renamed from: onTextureReady */
    public void mo131418x1ae798c7(int i17, java.lang.String str, int i18, android.graphics.SurfaceTexture surfaceTexture, int i19, int i27) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SkylineViewRenderEngine", "onTextureReady engineId:" + i17 + " type:" + str + " id:" + i18 + " surfaceTexture:" + surfaceTexture);
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i19, i27);
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        gf.a2.f352545q.put(str + '_' + i18, valueOf);
        if (surfaceTexture != null) {
            try {
                new gf.g1(surfaceTexture).a();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SkylineViewRenderEngine", "SkylineTextureCleanLogic clean fail! ex:" + e17.getMessage());
            }
        }
        gg.c cVar = gf.a2.f352544p;
        if (cVar != null) {
            ((gg.a) cVar).g(str, i18, surfaceTexture);
        }
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28712x591f54db
    /* renamed from: onTextureTouch */
    public void mo131419x1b089e63(int i17, java.lang.String str, int i18, android.view.MotionEvent motionEvent) {
        gg.c cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(motionEvent, "motionEvent");
        motionEvent.toString();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = gf.h1.f352619a;
        gf.a0 a0Var = (gf.a0) gf.h1.f352619a.get(str);
        if ((a0Var != null ? a0Var.c(i17, i18, motionEvent) : false) || (cVar = gf.a2.f352544p) == null) {
            return;
        }
        ((gg.a) cVar).h(str, i18, motionEvent);
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28712x591f54db
    /* renamed from: onTextureUpdate */
    public void mo131420x47c65e25(int i17, java.lang.String str, int i18, int i19, int i27) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = gf.h1.f352619a;
        gf.a0 a0Var = (gf.a0) gf.h1.f352619a.get(str);
        if (a0Var != null) {
            a0Var.a(i17, i18, i19, i27);
        }
    }
}
