package rs0;

/* loaded from: classes14.dex */
public final class g {
    public g(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static /* synthetic */ rs0.h n(rs0.g gVar, android.view.Surface surface, android.graphics.SurfaceTexture surfaceTexture, int i17, int i18, android.opengl.EGLContext eGLContext, int i19, java.lang.Object obj) {
        if ((i19 & 2) != 0) {
            surfaceTexture = null;
        }
        android.graphics.SurfaceTexture surfaceTexture2 = surfaceTexture;
        int i27 = (i19 & 4) != 0 ? 0 : i17;
        int i28 = (i19 & 8) != 0 ? 0 : i18;
        if ((i19 & 16) != 0) {
            eGLContext = android.opengl.EGL14.EGL_NO_CONTEXT;
        }
        return gVar.m(surface, surfaceTexture2, i27, i28, eGLContext);
    }

    public static rs0.h o(rs0.g gVar, android.opengl.EGLContext eGLContext, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            eGLContext = android.opengl.EGL14.EGL_NO_CONTEXT;
        }
        gVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GLEnvironmentUtil", "eglSetupWithoutSurface");
        android.opengl.EGLDisplay eglGetDisplay = android.opengl.EGL14.eglGetDisplay(0);
        if (eglGetDisplay == android.opengl.EGL14.EGL_NO_DISPLAY) {
            throw new java.lang.RuntimeException("unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!android.opengl.EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            throw new java.lang.RuntimeException("unable to initialize EGL14");
        }
        android.opengl.EGLConfig[] eGLConfigArr = new android.opengl.EGLConfig[1];
        android.opengl.EGL14.eglChooseConfig(eglGetDisplay, rs0.i.f480835g, 0, eGLConfigArr, 0, 1, new int[1], 0);
        gVar.d("eglCreateContext RGB888+recordable ES2", "MicroMsg.GLEnvironmentUtil");
        android.opengl.EGLContext eglCreateContext = android.opengl.EGL14.eglCreateContext(eglGetDisplay, eGLConfigArr[0], eGLContext, new int[]{12440, com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv_gl_key").o("support_egl_context_client_version", 3), 12344}, 0);
        gVar.d("eglCreateContext", "MicroMsg.GLEnvironmentUtil");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GLEnvironmentUtil", "create eglContext: " + eglCreateContext.getNativeHandle() + ", stack:" + new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        android.opengl.EGLSurface eGLSurface = android.opengl.EGL14.EGL_NO_SURFACE;
        android.opengl.EGL14.eglMakeCurrent(eglGetDisplay, eGLSurface, eGLSurface, eglCreateContext);
        gVar.d("eglMakeCurrent", "MicroMsg.GLEnvironmentUtil");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eglGetDisplay);
        return new rs0.h(eglGetDisplay, android.opengl.EGL14.EGL_NO_SURFACE, eglCreateContext);
    }

    public final rs0.h a(android.opengl.EGLContext eglContext, java.lang.Object obj, int i17, int i18) {
        android.opengl.EGLSurface eGLSurface;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eglContext, "eglContext");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GLEnvironmentUtil", "bindContextAndSurface");
        if (obj != null && !(obj instanceof android.view.SurfaceView) && !(obj instanceof android.view.Surface) && !(obj instanceof android.view.SurfaceHolder) && !(obj instanceof android.graphics.SurfaceTexture)) {
            throw new java.lang.IllegalArgumentException("unsupported surface");
        }
        android.opengl.EGLDisplay eglGetDisplay = android.opengl.EGL14.eglGetDisplay(0);
        if (eglGetDisplay == android.opengl.EGL14.EGL_NO_DISPLAY) {
            throw new java.lang.RuntimeException("unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!android.opengl.EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            throw new java.lang.RuntimeException("eglInitialize failed");
        }
        android.opengl.EGLConfig[] eGLConfigArr = new android.opengl.EGLConfig[1];
        android.opengl.EGL14.eglChooseConfig(eglGetDisplay, rs0.i.f480834f, 0, eGLConfigArr, 0, 1, new int[1], 0);
        if (eGLConfigArr[0] == null) {
            throw new java.lang.RuntimeException("chooseConfig failed");
        }
        android.opengl.EGLContext eglCreateContext = android.opengl.EGL14.eglCreateContext(eglGetDisplay, eGLConfigArr[0], eglContext, new int[]{12440, com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv_gl_key").o("support_egl_context_client_version", 3), 12344}, 0);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(eglCreateContext, android.opengl.EGL14.EGL_NO_CONTEXT)) {
            throw new java.lang.RuntimeException("EGL error " + android.opengl.EGL14.eglGetError());
        }
        d("eglCreateContext", "MicroMsg.GLEnvironmentUtil");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GLEnvironmentUtil", "create eglContext: " + eglCreateContext.getNativeHandle() + ", stack:" + new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        int[] iArr2 = (i17 <= 0 || i18 <= 0) ? new int[]{12344} : new int[]{12375, i17, 12374, i18, 12344};
        try {
            eGLSurface = obj != null ? android.opengl.EGL14.eglCreateWindowSurface(eglGetDisplay, eGLConfigArr[0], obj, iArr2, 0) : android.opengl.EGL14.eglCreatePbufferSurface(eglGetDisplay, eGLConfigArr[0], iArr2, 0);
        } catch (java.lang.IllegalArgumentException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GLEnvironmentUtil", "eglCreateWindowSurface", e17);
            eGLSurface = null;
        }
        if (obj != null) {
            d("eglCreateWindowSurface", "MicroMsg.GLEnvironmentUtil");
        } else {
            d("eglCreatePbufferSurface", "MicroMsg.GLEnvironmentUtil");
        }
        if ((eGLSurface == null || eGLSurface == android.opengl.EGL14.EGL_NO_SURFACE) && android.opengl.EGL14.eglGetError() == 12299) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GLEnvironmentUtil", "makeMyEGLCurrentSurface:returned EGL_BAD_NATIVE_WINDOW.");
        }
        if (eGLSurface != null) {
            android.opengl.EGL14.eglMakeCurrent(eglGetDisplay, eGLSurface, eGLSurface, eglCreateContext);
            d("eglMakeCurrent", "MicroMsg.GLEnvironmentUtil");
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eglGetDisplay);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eGLSurface);
        return new rs0.h(eglGetDisplay, eGLSurface, eglCreateContext);
    }

    public final void b(int i17, int i18) {
        android.opengl.GLES20.glBindFramebuffer(36160, i17);
        android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, i18, 0);
    }

    public final void c(is0.a aVar, is0.c cVar, int i17, int i18) {
        if (aVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GLEnvironmentUtil", "fbo is null !");
            return;
        }
        if (cVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GLEnvironmentUtil", "texture is null");
            return;
        }
        android.opengl.GLES20.glBindFramebuffer(36160, aVar.f375920e);
        if (i17 > 0 && i18 > 0) {
            is0.c.b(cVar, i17, i18, 0, null, 0, 0, 60, null);
        }
        android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, cVar.f375928e, 0);
        android.opengl.GLES20.glBindTexture(3553, 0);
    }

    public final boolean d(java.lang.String msg, java.lang.String tag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        int eglGetError = android.opengl.EGL14.eglGetError();
        if (eglGetError == 12288) {
            return false;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c(tag, msg + ": EGL error: 0x" + java.lang.Integer.toHexString(eglGetError), new java.lang.Object[0]);
        return true;
    }

    public final boolean e(java.lang.String extension) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extension, "extension");
        java.lang.String string = rs0.n.f480839d.d().getString("gl_extension_support_list", "");
        return r26.n0.B(string != null ? string : "", extension, false);
    }

    public final void f(java.lang.String str) {
        int glGetError = android.opengl.GLES20.glGetError();
        if (glGetError != 0) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.GLEnvironmentUtil", str + ": GL error: 0x" + java.lang.Integer.toHexString(glGetError), new java.lang.Object[0]);
        }
    }

    public final void g() {
        android.opengl.GLES20.glClear(16640);
        android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        android.opengl.GLES20.glBindFramebuffer(36160, 0);
    }

    public final int h(int i17, int i18) {
        int[] iArr = new int[1];
        android.opengl.GLES20.glGenTextures(1, iArr, 0);
        android.opengl.GLES20.glBindTexture(3553, iArr[0]);
        android.opengl.GLES20.glTexImage2D(3553, 0, 32856, i17, i18, 0, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLType.f5295x7a6b238, null);
        android.opengl.GLES20.glTexParameterf(3553, 10241, 9728.0f);
        android.opengl.GLES20.glTexParameterf(3553, com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb, 9729.0f);
        android.opengl.GLES20.glTexParameterf(3553, 10242, 33071.0f);
        android.opengl.GLES20.glTexParameterf(3553, 10243, 33071.0f);
        android.opengl.GLES20.glBindTexture(3553, 0);
        return iArr[0];
    }

    public final void i(int[] frame, int[] texture) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frame, "frame");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(texture, "texture");
        android.opengl.GLES20.glBindFramebuffer(36160, 0);
        android.opengl.GLES20.glDeleteFramebuffers(1, frame, 0);
        android.opengl.GLES20.glBindTexture(3553, 0);
        android.opengl.GLES20.glDeleteTextures(1, texture, 0);
    }

    public final rs0.h j(android.opengl.EGLContext mEGLContext, android.opengl.EGLDisplay mEGLDisplay, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mEGLContext, "mEGLContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mEGLDisplay, "mEGLDisplay");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GLEnvironmentUtil", "eglBind Surface");
        android.opengl.EGLConfig[] eGLConfigArr = new android.opengl.EGLConfig[1];
        android.opengl.EGL14.eglChooseConfig(mEGLDisplay, rs0.i.f480834f, 0, eGLConfigArr, 0, 1, new int[1], 0);
        android.opengl.EGLSurface eglCreateWindowSurface = android.opengl.EGL14.eglCreateWindowSurface(mEGLDisplay, eGLConfigArr[0], obj, new int[]{12344}, 0);
        d("eglCreateWindowSurface", "MicroMsg.GLEnvironmentUtil");
        android.opengl.EGL14.eglMakeCurrent(mEGLDisplay, eglCreateWindowSurface, eglCreateWindowSurface, mEGLContext);
        d("eglMakeCurrent", "MicroMsg.GLEnvironmentUtil");
        return new rs0.h(mEGLDisplay, eglCreateWindowSurface, mEGLContext);
    }

    public final android.opengl.EGLSurface k(android.opengl.EGLDisplay mEGLDisplay, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mEGLDisplay, "mEGLDisplay");
        android.opengl.EGLConfig[] eGLConfigArr = new android.opengl.EGLConfig[1];
        android.opengl.EGL14.eglChooseConfig(mEGLDisplay, rs0.i.f480834f, 0, eGLConfigArr, 0, 1, new int[1], 0);
        android.opengl.EGLSurface eglCreateWindowSurface = android.opengl.EGL14.eglCreateWindowSurface(mEGLDisplay, eGLConfigArr[0], obj, new int[]{12344}, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(eglCreateWindowSurface, "eglCreateWindowSurface(...)");
        return eglCreateWindowSurface;
    }

    public final rs0.h l(int i17, int i18, android.opengl.EGLContext eGLContext) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GLEnvironmentUtil", "eglSetupByPbufferSurface, width:" + i17 + ", height:" + i18);
        android.opengl.EGLDisplay eglGetDisplay = android.opengl.EGL14.eglGetDisplay(0);
        if (eglGetDisplay == android.opengl.EGL14.EGL_NO_DISPLAY) {
            throw new java.lang.RuntimeException("unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!android.opengl.EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            throw new java.lang.RuntimeException("unable to initialize EGL14");
        }
        android.opengl.EGLConfig[] eGLConfigArr = new android.opengl.EGLConfig[1];
        android.opengl.EGL14.eglChooseConfig(eglGetDisplay, rs0.i.f480834f, 0, eGLConfigArr, 0, 1, new int[1], 0);
        d("eglCreateContext RGB888+recordable ES2", "MicroMsg.GLEnvironmentUtil");
        android.opengl.EGLContext eglCreateContext = android.opengl.EGL14.eglCreateContext(eglGetDisplay, eGLConfigArr[0], eGLContext, new int[]{12440, com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv_gl_key").o("support_egl_context_client_version", 3), 12344}, 0);
        d("eglCreateContext", "MicroMsg.GLEnvironmentUtil");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GLEnvironmentUtil", "create eglContext: " + eglCreateContext.getNativeHandle() + ", stack:" + new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        android.opengl.EGLSurface eglCreatePbufferSurface = android.opengl.EGL14.eglCreatePbufferSurface(eglGetDisplay, eGLConfigArr[0], (i17 <= 0 || i18 <= 0) ? new int[]{12344} : new int[]{12375, i17, 12374, i18, 12344}, 0);
        d("eglCreatePbufferSurface", "MicroMsg.GLEnvironmentUtil");
        if (eglCreatePbufferSurface != null) {
            android.opengl.EGL14.eglMakeCurrent(eglGetDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext);
            d("eglMakeCurrent", "MicroMsg.GLEnvironmentUtil");
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eglGetDisplay);
        return new rs0.h(eglGetDisplay, eglCreatePbufferSurface, eglCreateContext);
    }

    public final rs0.h m(android.view.Surface surface, android.graphics.SurfaceTexture surfaceTexture, int i17, int i18, android.opengl.EGLContext eGLContext) {
        android.opengl.EGLConfig[] eGLConfigArr;
        char c17;
        int i19;
        android.opengl.EGLDisplay eGLDisplay;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GLEnvironmentUtil", "eglSetupBySurface, surface:" + surface + ", surfaceTexture:" + surfaceTexture + ", width:" + i17 + ", height:" + i18);
        android.opengl.EGLDisplay eglGetDisplay = android.opengl.EGL14.eglGetDisplay(0);
        if (eglGetDisplay == android.opengl.EGL14.EGL_NO_DISPLAY) {
            throw new java.lang.RuntimeException("unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!android.opengl.EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            throw new java.lang.RuntimeException("unable to initialize EGL14");
        }
        android.opengl.EGLConfig[] eGLConfigArr2 = new android.opengl.EGLConfig[1];
        int[] iArr2 = new int[1];
        if (surface == null && surfaceTexture == null) {
            eGLConfigArr = eGLConfigArr2;
            c17 = 1;
            i19 = 2;
            eGLDisplay = eglGetDisplay;
            android.opengl.EGL14.eglChooseConfig(eglGetDisplay, rs0.i.f480834f, 0, eGLConfigArr2, 0, 1, iArr2, 0);
        } else {
            eGLConfigArr = eGLConfigArr2;
            c17 = 1;
            i19 = 2;
            eGLDisplay = eglGetDisplay;
            android.opengl.EGL14.eglChooseConfig(eGLDisplay, rs0.i.f480834f, 0, eGLConfigArr, 0, 1, iArr2, 0);
        }
        d("eglCreateContext RGB888+recordable ES2", "MicroMsg.GLEnvironmentUtil");
        int o17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv_gl_key").o("support_egl_context_client_version", 3);
        int[] iArr3 = {12440, o17, 12344};
        android.opengl.EGLDisplay eGLDisplay2 = eGLDisplay;
        android.opengl.EGLContext eglCreateContext = android.opengl.EGL14.eglCreateContext(eGLDisplay2, eGLConfigArr[0], eGLContext, iArr3, 0);
        d("eglCreateContext", "MicroMsg.GLEnvironmentUtil");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GLEnvironmentUtil", "create eglContext: " + eglCreateContext.getNativeHandle() + ", stack:" + new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(eglCreateContext, android.opengl.EGL14.EGL_NO_CONTEXT)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GLEnvironmentUtil", "create " + o17 + " EGL context failed");
            if (o17 == 3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GLEnvironmentUtil", "retry create EGL 2.0 context");
                iArr3[c17] = i19;
                eglCreateContext = android.opengl.EGL14.eglCreateContext(eGLDisplay2, eGLConfigArr[0], eGLContext, iArr3, 0);
                d("eglCreateContext fallback", "MicroMsg.GLEnvironmentUtil");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GLEnvironmentUtil", "create eglContext: " + eglCreateContext.getNativeHandle() + ", stack:" + new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            }
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(eglCreateContext, android.opengl.EGL14.EGL_NO_CONTEXT)) {
            jx3.f.INSTANCE.w(985L, 189L, 1L);
        }
        int[] iArr4 = (i17 <= 0 || i18 <= 0) ? new int[]{12344} : new int[]{12375, i17, 12374, i18, 12344};
        android.opengl.EGLSurface eglCreateWindowSurface = surface != null ? android.opengl.EGL14.eglCreateWindowSurface(eGLDisplay2, eGLConfigArr[0], surface, iArr4, 0) : surfaceTexture != null ? android.opengl.EGL14.eglCreateWindowSurface(eGLDisplay2, eGLConfigArr[0], surfaceTexture, iArr4, 0) : android.opengl.EGL14.eglCreatePbufferSurface(eGLDisplay2, eGLConfigArr[0], iArr4, 0);
        if (surface != null) {
            d("eglCreateWindowSurface", "MicroMsg.GLEnvironmentUtil");
        } else {
            d("eglCreatePbufferSurface", "MicroMsg.GLEnvironmentUtil");
        }
        if (eglCreateWindowSurface != null) {
            android.opengl.EGL14.eglMakeCurrent(eGLDisplay2, eglCreateWindowSurface, eglCreateWindowSurface, eglCreateContext);
            d("eglMakeCurrent", "MicroMsg.GLEnvironmentUtil");
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eGLDisplay2);
        rs0.h hVar = new rs0.h(eGLDisplay2, eglCreateWindowSurface, eglCreateContext);
        hVar.f480828d = eGLContext;
        return hVar;
    }

    public final void p(rs0.h hVar, android.opengl.EGLSurface backupSurface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(backupSurface, "backupSurface");
        if (hVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GLEnvironmentUtil", "eglUnbindSurface");
            android.opengl.EGL14.eglDestroySurface(hVar.f480825a, hVar.f480826b);
            android.opengl.EGL14.eglMakeCurrent(hVar.f480825a, backupSurface, backupSurface, hVar.f480827c);
        }
    }

    public final int q() {
        int[] iArr = new int[1];
        android.opengl.GLES20.glGenFramebuffers(1, iArr, 0);
        int i17 = iArr[0];
        if (i17 != 0) {
            return i17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GLEnvironmentUtil", "gen frame buffer error");
        return 0;
    }

    public final int r() {
        int[] iArr = new int[1];
        android.opengl.GLES20.glGenTextures(1, iArr, 0);
        android.opengl.GLES20.glBindTexture(3553, iArr[0]);
        android.opengl.GLES20.glTexParameteri(3553, 10241, 9729);
        android.opengl.GLES20.glTexParameteri(3553, com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb, 9728);
        android.opengl.GLES20.glTexParameteri(3553, 10242, 33071);
        android.opengl.GLES20.glTexParameteri(3553, 10243, 33071);
        android.opengl.GLES20.glBindTexture(3553, 0);
        f("genTexture");
        return iArr[0];
    }

    public final int s(java.lang.String shaderSource, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shaderSource, "shaderSource");
        int[] iArr = new int[1];
        int glCreateShader = android.opengl.GLES20.glCreateShader(i17);
        android.opengl.GLES20.glShaderSource(glCreateShader, shaderSource);
        android.opengl.GLES20.glCompileShader(glCreateShader);
        android.opengl.GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GLEnvironmentUtil", "loadShader error, infoLog: " + android.opengl.GLES20.glGetShaderInfoLog(glCreateShader));
        return 0;
    }

    public final int t(java.lang.String vertexShaderSource, java.lang.String fragmentShaderSource) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(vertexShaderSource, "vertexShaderSource");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragmentShaderSource, "fragmentShaderSource");
        int[] iArr = new int[1];
        int s17 = s(vertexShaderSource, 35633);
        if (s17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GLEnvironmentUtil", "load vertex shader failed");
            return 0;
        }
        int s18 = s(fragmentShaderSource, 35632);
        if (s18 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GLEnvironmentUtil", "load fragment shader failed");
            return 0;
        }
        int glCreateProgram = android.opengl.GLES20.glCreateProgram();
        android.opengl.GLES20.glAttachShader(glCreateProgram, s17);
        android.opengl.GLES20.glAttachShader(glCreateProgram, s18);
        android.opengl.GLES20.glLinkProgram(glCreateProgram);
        android.opengl.GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GLEnvironmentUtil", "link program failed");
            return 0;
        }
        android.opengl.GLES20.glDeleteShader(s17);
        android.opengl.GLES20.glDeleteShader(s18);
        return glCreateProgram;
    }

    public final void u(rs0.h hVar) {
        if (hVar == null) {
            return;
        }
        if (hVar.f480826b != android.opengl.EGL14.EGL_NO_DISPLAY) {
            android.opengl.EGLDisplay eGLDisplay = hVar.f480825a;
            android.opengl.EGLSurface eGLSurface = android.opengl.EGL14.EGL_NO_SURFACE;
            android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, android.opengl.EGL14.EGL_NO_CONTEXT);
            android.opengl.EGL14.eglDestroySurface(hVar.f480825a, hVar.f480826b);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("destroy eglContext: ");
            sb6.append(hVar.f480827c.getNativeHandle());
            sb6.append(", stack:");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GLEnvironmentUtil", sb6.toString());
            android.opengl.EGL14.eglDestroyContext(hVar.f480825a, hVar.f480827c);
            android.opengl.EGL14.eglReleaseThread();
            android.opengl.EGL14.eglTerminate(hVar.f480825a);
        }
        android.opengl.EGLDisplay EGL_NO_DISPLAY = android.opengl.EGL14.EGL_NO_DISPLAY;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(EGL_NO_DISPLAY, "EGL_NO_DISPLAY");
        hVar.f480825a = EGL_NO_DISPLAY;
        android.opengl.EGLContext EGL_NO_CONTEXT = android.opengl.EGL14.EGL_NO_CONTEXT;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(EGL_NO_CONTEXT, "EGL_NO_CONTEXT");
        hVar.f480827c = EGL_NO_CONTEXT;
        hVar.f480826b = android.opengl.EGL14.EGL_NO_SURFACE;
    }

    public final android.graphics.Bitmap v(int i17, int i18, int i19) {
        int[] iArr = new int[1];
        android.opengl.GLES20.glGenFramebuffers(1, iArr, 0);
        android.opengl.GLES20.glBindFramebuffer(36160, iArr[0]);
        android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, i17, 0);
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(i18 * i19 * 4);
        android.opengl.GLES20.glReadPixels(0, 0, i18, i19, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLType.f5295x7a6b238, allocate);
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i19));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/media/util/GLEnvironmentUtil$Companion", "saveTexture", "(III)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/media/util/GLEnvironmentUtil$Companion", "saveTexture", "(III)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
        createBitmap.copyPixelsFromBuffer(allocate);
        android.opengl.GLES20.glBindFramebuffer(36160, 0);
        android.opengl.GLES20.glDeleteFramebuffers(1, iArr, 0);
        return createBitmap;
    }

    public final void w(float[] textureCoords, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textureCoords, "textureCoords");
        float f17 = textureCoords[i17];
        textureCoords[i17] = textureCoords[i18];
        textureCoords[i18] = f17;
    }

    public final boolean x(android.opengl.EGLDisplay eGLDisplay, android.opengl.EGLSurface eGLSurface) {
        if (eGLDisplay == null || eGLSurface == null) {
            return false;
        }
        boolean eglSwapBuffers = android.opengl.EGL14.eglSwapBuffers(eGLDisplay, eGLSurface);
        d("eglSwapBuffers", "MicroMsg.GLEnvironmentUtil");
        return eglSwapBuffers;
    }
}
