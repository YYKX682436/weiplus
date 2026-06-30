package yo5;

/* loaded from: classes14.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yo5.e f545885d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.opengl.EGLContext f545886e;

    public a(yo5.e eVar, android.opengl.EGLContext eGLContext) {
        this.f545885d = eVar;
        this.f545886e = eGLContext;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object m143895xf1229813;
        dp5.b bVar;
        android.opengl.EGLDisplay eglGetDisplay;
        yo5.e eVar = this.f545885d;
        android.opengl.EGLContext eGLContext = this.f545886e;
        dp5.d dVar = null;
        int i17 = 0;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            dp5.c cVar = dp5.c.f323811a;
            bVar = (dp5.b) dp5.c.f323812b;
            bVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GLEnvOp", "eglSetupByPbufferSurface, width:1, height:1");
            eglGetDisplay = android.opengl.EGL14.eglGetDisplay(0);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        if (eglGetDisplay == android.opengl.EGL14.EGL_NO_DISPLAY) {
            throw new java.lang.RuntimeException("unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!android.opengl.EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            throw new java.lang.RuntimeException("unable to initialize EGL14");
        }
        android.opengl.EGLConfig[] eGLConfigArr = new android.opengl.EGLConfig[1];
        android.opengl.EGL14.eglChooseConfig(eglGetDisplay, bVar.f323810a, 0, eGLConfigArr, 0, 1, new int[1], 0);
        dp5.b.a(bVar, "eglCreateContext RGB888+recordable ES2", null, 2, null);
        android.opengl.EGLContext eglCreateContext = android.opengl.EGL14.eglCreateContext(eglGetDisplay, eGLConfigArr[0], eGLContext, new int[]{12440, 3, 12344}, 0);
        boolean a17 = dp5.b.a(bVar, "eglCreateContext", null, 2, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GLEnvOp", "create eglContext: " + eglCreateContext.getNativeHandle());
        if (eglCreateContext.getNativeHandle() == 0 && !a17) {
            ((jp5.o) i95.n0.c(jp5.o.class)).mo129946xf0018e90(2093L, 31L, 1L);
        }
        android.opengl.EGLSurface eglCreatePbufferSurface = android.opengl.EGL14.eglCreatePbufferSurface(eglGetDisplay, eGLConfigArr[0], new int[]{12375, 1, 12374, 1, 12344}, 0);
        dp5.b.a(bVar, "eglCreatePbufferSurface", null, 2, null);
        if (eglCreatePbufferSurface != null) {
            android.opengl.EGL14.eglMakeCurrent(eglGetDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext);
            dp5.b.a(bVar, "eglMakeCurrent", null, 2, null);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eglGetDisplay);
        m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new dp5.d(eglGetDisplay, eglCreatePbufferSurface, eglCreateContext));
        if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
            m143895xf1229813 = null;
        }
        dp5.d dVar2 = (dp5.d) m143895xf1229813;
        if (dVar2 != null) {
            yo5.e eVar2 = this.f545885d;
            android.opengl.EGLDisplay eGLDisplay = dVar2.f323813a;
            android.opengl.EGLSurface eGLSurface = dVar2.f323814b;
            android.opengl.EGLSurface eGLSurface2 = eGLSurface == null ? android.opengl.EGL14.EGL_NO_SURFACE : eGLSurface;
            if (eGLSurface == null) {
                eGLSurface = android.opengl.EGL14.EGL_NO_SURFACE;
            }
            android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface, dVar2.f323815c);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(eVar2.f545892e, "eglMakeCurrent");
            java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = eVar2.f545894g;
            java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i18 = 0; i18 < readHoldCount; i18++) {
                readLock.unlock();
            }
            java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                eVar2.f545893f = true;
                while (!eVar2.f545897m.isEmpty()) {
                    java.lang.Runnable runnable = (java.lang.Runnable) eVar2.f545897m.poll();
                    if (runnable != null) {
                        eVar2.K().post(runnable);
                    }
                }
                while (i17 < readHoldCount) {
                    readLock.lock();
                    i17++;
                }
                writeLock.unlock();
                dVar = dVar2;
            } catch (java.lang.Throwable th7) {
                while (i17 < readHoldCount) {
                    readLock.lock();
                    i17++;
                }
                writeLock.unlock();
                throw th7;
            }
        } else {
            yo5.e eVar3 = this.f545885d;
            eVar3.O();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(eVar3.f545892e, "create gl environment error");
        }
        eVar.f545898n = dVar;
    }
}
