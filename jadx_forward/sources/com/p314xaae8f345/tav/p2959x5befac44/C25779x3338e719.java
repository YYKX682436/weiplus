package com.p314xaae8f345.tav.p2959x5befac44;

/* renamed from: com.tencent.tav.decoder.RenderContext */
/* loaded from: classes14.dex */
public class C25779x3338e719 implements com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50.SurfaceCreator {

    /* renamed from: EGL_OPENGL_ES2_BIT */
    private static final int f48186x7af810d7 = 4;

    /* renamed from: EGL_RECORDABLE_ANDROID */
    private static final int f48187x5a4fb9b0 = 12610;
    private static final java.lang.String TAG = "RenderContext";

    /* renamed from: _eglContext */
    private android.opengl.EGLContext f48188xb84f5be4;

    /* renamed from: activeSurfaceCache */
    private java.util.HashMap<android.view.Surface, java.lang.String> f48189xdca430fb;

    /* renamed from: eglConfig */
    private android.opengl.EGLConfig f48190x145e47ec;

    /* renamed from: eglDisplay */
    private android.opengl.EGLDisplay f48191xa25ee958;

    /* renamed from: eglSurface */
    private android.opengl.EGLSurface f48192xd043bd43;

    /* renamed from: freeSurfaceCache */
    private java.util.HashMap<java.lang.String, android.view.Surface> f48193x2aedf61;

    /* renamed from: glViewportRect */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468 f48194x9f30352f;

    /* renamed from: height */
    private int f48195xb7389127;

    /* renamed from: isSharedContext */
    private boolean f48196xa887ac80;

    /* renamed from: pBufferEnable */
    private boolean f48197xd083a273;

    /* renamed from: params */
    private com.p314xaae8f345.tav.p2959x5befac44.C25780x613b55ff f48198xc4aaf986;

    /* renamed from: released */
    private volatile boolean f48199xdf23d93d;

    /* renamed from: releasingSurfaceCache */
    private java.util.List<android.view.Surface> f48200xfcf603f9;

    /* renamed from: surface */
    private android.view.Surface f48201x9189ecad;

    /* renamed from: textureProcessThread */
    private android.os.HandlerThread f48202x824007fe;

    /* renamed from: threadId */
    private long f48203x57d5bcc5;

    /* renamed from: videoTextureMap */
    private java.util.HashMap<android.view.Surface, com.p314xaae8f345.tav.p2959x5befac44.C25785xac83bc40> f48204xf19e511c;

    /* renamed from: width */
    private int f48205x6be2dc6;

    public C25779x3338e719(int i17, int i18) {
        this(i17, i18, null);
    }

    /* renamed from: checkEglActionSuccess */
    public static boolean m97619x28c5b22b(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        boolean z17 = false;
        while (true) {
            int eglGetError = android.opengl.EGL14.eglGetError();
            if (eglGetError == 12288) {
                break;
            }
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(TAG, str + ": EGL error: 0x" + java.lang.Integer.toHexString(eglGetError));
            sb6.append(str + ": EGL error: 0x" + java.lang.Integer.toHexString(eglGetError));
            z17 = true;
        }
        if (z17) {
            new java.lang.RuntimeException("EGL error encountered (see log): " + sb6.toString());
        }
        return !z17;
    }

    /* renamed from: checkEglError */
    public static void m97620x90b29146(java.lang.String str) {
        m97619x28c5b22b(str);
    }

    /* renamed from: checkThread */
    private void m97621x2edbf932() {
        if (this.f48203x57d5bcc5 != java.lang.Thread.currentThread().getId()) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(TAG, "线程不对，注意EGL相关的泄露问题！threadId = " + this.f48203x57d5bcc5 + ", Thread.currentThread() name = " + java.lang.Thread.currentThread().getName(), new java.lang.RuntimeException());
        }
    }

    /* renamed from: createEGLSurface */
    private void m97622xb85fb35f() {
        if (this.f48202x824007fe == null) {
            android.os.HandlerThread handlerThread = new android.os.HandlerThread("RenderContext_TextureRenderThread");
            this.f48202x824007fe = handlerThread;
            handlerThread.start();
        }
        android.opengl.EGLSurface eGLSurface = this.f48192xd043bd43;
        if (eGLSurface != android.opengl.EGL14.EGL_NO_SURFACE) {
            android.opengl.EGL14.eglDestroySurface(this.f48191xa25ee958, eGLSurface);
            this.f48192xd043bd43 = android.opengl.EGL14.EGL_NO_SURFACE;
        }
        android.view.Surface surface = this.f48201x9189ecad;
        if (surface == null) {
            this.f48192xd043bd43 = android.opengl.EGL14.eglCreatePbufferSurface(this.f48191xa25ee958, this.f48190x145e47ec, new int[]{12375, this.f48205x6be2dc6, 12374, this.f48195xb7389127, 12344}, 0);
        } else {
            this.f48192xd043bd43 = android.opengl.EGL14.eglCreateWindowSurface(this.f48191xa25ee958, this.f48190x145e47ec, surface, new int[]{12344}, 0);
        }
    }

    /* renamed from: createTexture */
    public static int m97623x3164f87f(int i17) {
        int[] iArr = new int[1];
        android.opengl.GLES20.glGenTextures(1, iArr, 0);
        int i18 = iArr[0];
        android.opengl.GLES20.glBindTexture(i17, i18);
        m97620x90b29146("glBindTexture mTextureID");
        android.opengl.GLES20.glTexParameterf(i17, 10241, 9729.0f);
        android.opengl.GLES20.glTexParameterf(i17, com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb, 9729.0f);
        android.opengl.GLES20.glTexParameteri(i17, 10242, 33071);
        android.opengl.GLES20.glTexParameteri(i17, 10243, 33071);
        m97620x90b29146("glTexParameter");
        return i18;
    }

    /* renamed from: eglSetup */
    private synchronized void m97624x1853893(android.opengl.EGLContext eGLContext) {
        android.opengl.EGLDisplay eglGetDisplay;
        this.f48203x57d5bcc5 = java.lang.Thread.currentThread().getId();
        if (this.f48199xdf23d93d) {
            return;
        }
        try {
            eglGetDisplay = android.opengl.EGL14.eglGetDisplay(0);
            this.f48191xa25ee958 = eglGetDisplay;
        } catch (java.lang.Error | java.lang.Exception unused) {
        }
        if (eglGetDisplay == android.opengl.EGL14.EGL_NO_DISPLAY) {
            new java.lang.RuntimeException("unable to get EGL14 display");
            return;
        }
        int[] iArr = new int[2];
        if (!android.opengl.EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            this.f48191xa25ee958 = null;
            new java.lang.RuntimeException("unable to initialize EGL14");
            return;
        }
        android.opengl.EGLConfig[] eGLConfigArr = new android.opengl.EGLConfig[1];
        if (!android.opengl.EGL14.eglChooseConfig(this.f48191xa25ee958, new int[]{12324, 8, 12323, 8, 12322, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            new java.lang.RuntimeException("unable to find RGB888+recordable ES2 EGL config");
            return;
        }
        int[] iArr2 = {12440, 2, 12344};
        if (eGLContext != null) {
            this.f48196xa887ac80 = true;
            this.f48188xb84f5be4 = android.opengl.EGL14.eglCreateContext(this.f48191xa25ee958, eGLConfigArr[0], eGLContext, iArr2, 0);
            m97620x90b29146("eglCreateContext");
            if (this.f48188xb84f5be4 == null) {
                new java.lang.RuntimeException("null context");
                return;
            }
        } else {
            this.f48188xb84f5be4 = android.opengl.EGL14.eglCreateContext(this.f48191xa25ee958, eGLConfigArr[0], android.opengl.EGL14.EGL_NO_CONTEXT, iArr2, 0);
            m97620x90b29146("eglCreateContext");
            if (this.f48188xb84f5be4 == null) {
                new java.lang.RuntimeException("null context");
                return;
            }
        }
        this.f48190x145e47ec = eGLConfigArr[0];
        m97622xb85fb35f();
        if (m97619x28c5b22b("eglCreateWindowSurface")) {
            this.f48197xd083a273 = true;
        }
        if (this.f48192xd043bd43 == null) {
            new java.lang.RuntimeException("surface was null");
        }
    }

    /* renamed from: loadShader */
    private synchronized int m97625xf272646b(int i17, java.lang.String str) {
        int i18 = 0;
        if (this.f48199xdf23d93d) {
            return 0;
        }
        int glCreateShader = android.opengl.GLES20.glCreateShader(i17);
        m97620x90b29146("glCreateShader type=" + i17);
        android.opengl.GLES20.glShaderSource(glCreateShader, str);
        android.opengl.GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        android.opengl.GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(TAG, "Could not compile shader " + i17 + ":");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" ");
            sb6.append(android.opengl.GLES20.glGetShaderInfoLog(glCreateShader));
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(TAG, sb6.toString());
            android.opengl.GLES20.glDeleteShader(glCreateShader);
        } else {
            i18 = glCreateShader;
        }
        return i18;
    }

    /* renamed from: release */
    private synchronized void m97626x41012807(android.view.Surface surface) {
        m97621x2edbf932();
        if (surface == null) {
            return;
        }
        if (this.f48204xf19e511c.containsKey(surface)) {
            this.f48204xf19e511c.remove(surface).m97759x41012807();
        }
        surface.release();
    }

    /* renamed from: releaseReleadingSurface */
    private void m97627xb16afde1() {
        m97621x2edbf932();
        for (int i17 = 0; i17 < this.f48200xfcf603f9.size(); i17++) {
            m97626x41012807(this.f48200xfcf603f9.remove(i17));
        }
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50.SurfaceCreator
    /* renamed from: createOutputSurface */
    public synchronized android.view.Surface mo97549x718480d0(int i17, int i18, int i19) {
        android.view.Surface remove;
        if (this.f48199xdf23d93d) {
            return null;
        }
        m97621x2edbf932();
        m97627xb16afde1();
        java.lang.String str = i17 + "*" + i18 + "-" + i19;
        if (this.f48193x2aedf61.containsKey(str) && (remove = this.f48193x2aedf61.remove(str)) != null) {
            this.f48189xdca430fb.put(remove, str);
            return remove;
        }
        m97634x900967ab();
        com.p314xaae8f345.tav.p2959x5befac44.C25785xac83bc40 c25785xac83bc40 = new com.p314xaae8f345.tav.p2959x5befac44.C25785xac83bc40(i17, i18, 36197, i19, this.f48202x824007fe);
        c25785xac83bc40.m97762x53cfd9f7(this);
        android.view.Surface surface = new android.view.Surface(c25785xac83bc40.m97764x299653ae());
        this.f48204xf19e511c.put(surface, c25785xac83bc40);
        this.f48189xdca430fb.put(surface, str);
        return surface;
    }

    /* renamed from: eglContext */
    public android.opengl.EGLContext m97628x77710645() {
        return this.f48188xb84f5be4;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50.SurfaceCreator
    /* renamed from: free */
    public synchronized void mo97550x30166c(android.view.Surface surface) {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(TAG, "free " + java.lang.Thread.currentThread().getId());
        if (surface == null) {
            return;
        }
        java.lang.String remove = this.f48189xdca430fb.remove(surface);
        if (!android.text.TextUtils.isEmpty(remove)) {
            this.f48193x2aedf61.containsKey(remove);
        }
        this.f48200xfcf603f9.add(surface);
    }

    /* renamed from: getEglSurfaceHandle */
    public long m97629x4c4340c1() {
        android.opengl.EGLSurface eGLSurface = this.f48192xd043bd43;
        if (eGLSurface != null) {
            return eGLSurface.getNativeHandle();
        }
        return 0L;
    }

    /* renamed from: getGlViewportRect */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468 m97630x8dc80225() {
        return this.f48194x9f30352f;
    }

    /* renamed from: getParams */
    public com.p314xaae8f345.tav.p2959x5befac44.C25780x613b55ff m97631x29c21c7c() {
        return this.f48198xc4aaf986;
    }

    /* renamed from: height */
    public int m97632xb7389127() {
        return this.f48195xb7389127;
    }

    /* renamed from: isPBufferEnable */
    public boolean m97633x51c2f969() {
        return this.f48197xd083a273;
    }

    /* renamed from: makeCurrent */
    public synchronized void m97634x900967ab() {
        m97635x900967ab(false);
    }

    /* renamed from: setHeight */
    public void m97636xf84e829(int i17) {
        this.f48195xb7389127 = i17;
    }

    /* renamed from: setParams */
    public void m97637x1cf75088(com.p314xaae8f345.tav.p2959x5befac44.C25780x613b55ff c25780x613b55ff) {
        this.f48198xc4aaf986 = c25780x613b55ff;
    }

    /* renamed from: setPresentationTime */
    public synchronized void m97638xab5ea589(long j17) {
        if (this.f48199xdf23d93d) {
            return;
        }
        if (this.f48201x9189ecad != null) {
            android.opengl.EGLExt.eglPresentationTimeANDROID(this.f48191xa25ee958, this.f48192xd043bd43, j17 * 1000);
        }
    }

    /* renamed from: setSurface */
    public void m97639x42c875eb(android.view.Surface surface) {
        this.f48201x9189ecad = surface;
        m97622xb85fb35f();
        m97634x900967ab();
    }

    /* renamed from: setWidth */
    public void m97640x53e9ee84(int i17) {
        this.f48205x6be2dc6 = i17;
    }

    /* renamed from: swapBuffers */
    public synchronized boolean m97641x82211f20() {
        m97621x2edbf932();
        if (this.f48199xdf23d93d) {
            return false;
        }
        return android.opengl.EGL14.eglSwapBuffers(this.f48191xa25ee958, this.f48192xd043bd43);
    }

    /* renamed from: toString */
    public java.lang.String m97642x9616526c() {
        return "RenderContext{_eglContext=" + this.f48188xb84f5be4 + ", isSharedContext=" + this.f48196xa887ac80 + ", released=" + this.f48199xdf23d93d + '}';
    }

    /* renamed from: updateViewport */
    public void m97644x7b31bc8f(com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468 c25731x76640468) {
        android.graphics.PointF pointF;
        com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a85;
        if (c25731x76640468 == null || (pointF = c25731x76640468.f47829xc3e1af26) == null || (c25732x76648a85 = c25731x76640468.f47830x35e001) == null) {
            return;
        }
        this.f48194x9f30352f = c25731x76640468;
        m97643x7b31bc8f((int) pointF.x, (int) pointF.y, (int) c25732x76648a85.f47833x6be2dc6, (int) c25732x76648a85.f47832xb7389127);
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50.SurfaceCreator
    /* renamed from: videoTextureForSurface */
    public synchronized com.p314xaae8f345.tav.p2959x5befac44.C25785xac83bc40 mo97552x6eb64fe4(android.view.Surface surface) {
        return this.f48204xf19e511c.get(surface);
    }

    /* renamed from: width */
    public int m97645x6be2dc6() {
        return this.f48205x6be2dc6;
    }

    public C25779x3338e719(int i17, int i18, android.view.Surface surface) {
        this(i17, i18, surface, null);
    }

    public C25779x3338e719(int i17, int i18, android.view.Surface surface, android.opengl.EGLContext eGLContext) {
        this.f48192xd043bd43 = android.opengl.EGL14.EGL_NO_SURFACE;
        this.f48196xa887ac80 = false;
        this.f48199xdf23d93d = false;
        this.f48203x57d5bcc5 = -1L;
        this.f48197xd083a273 = false;
        this.f48204xf19e511c = new java.util.HashMap<>();
        this.f48189xdca430fb = new java.util.HashMap<>();
        this.f48193x2aedf61 = new java.util.HashMap<>();
        this.f48200xfcf603f9 = new java.util.ArrayList();
        this.f48201x9189ecad = surface;
        this.f48205x6be2dc6 = i17;
        this.f48195xb7389127 = i18;
        m97624x1853893(eGLContext);
        m97634x900967ab();
    }

    /* renamed from: makeCurrent */
    public synchronized void m97635x900967ab(boolean z17) {
        m97621x2edbf932();
        if (this.f48199xdf23d93d) {
            return;
        }
        android.opengl.EGLDisplay eGLDisplay = this.f48191xa25ee958;
        android.opengl.EGLSurface eGLSurface = this.f48192xd043bd43;
        if (!android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f48188xb84f5be4)) {
            m97620x90b29146("eglMakeCurrent failed");
            if (z17) {
                throw new java.lang.RuntimeException("eglMakeCurrent failed");
            }
        }
    }

    /* renamed from: updateViewport */
    public void m97643x7b31bc8f(int i17, int i18, int i19, int i27) {
        m97634x900967ab();
        android.opengl.GLES20.glViewport(i17, i18, i19, i27);
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25767xc9028e50.SurfaceCreator
    /* renamed from: release */
    public synchronized void mo97551x41012807() {
        m97621x2edbf932();
        if (this.f48199xdf23d93d) {
            return;
        }
        m97634x900967ab();
        this.f48199xdf23d93d = true;
        m97627xb16afde1();
        java.util.Iterator<android.view.Surface> it = this.f48204xf19e511c.keySet().iterator();
        while (it.hasNext()) {
            it.next().release();
        }
        java.util.Iterator<com.p314xaae8f345.tav.p2959x5befac44.C25785xac83bc40> it6 = this.f48204xf19e511c.values().iterator();
        while (it6.hasNext()) {
            it6.next().m97759x41012807();
        }
        this.f48204xf19e511c.clear();
        try {
            if (android.opengl.EGL14.eglGetCurrentContext().equals(this.f48188xb84f5be4)) {
                android.opengl.EGLDisplay eGLDisplay = this.f48191xa25ee958;
                android.opengl.EGLSurface eGLSurface = android.opengl.EGL14.EGL_NO_SURFACE;
                android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, android.opengl.EGL14.EGL_NO_CONTEXT);
            }
            android.opengl.EGL14.eglDestroySurface(this.f48191xa25ee958, this.f48192xd043bd43);
            if (!this.f48196xa887ac80) {
                android.opengl.EGL14.eglDestroyContext(this.f48191xa25ee958, this.f48188xb84f5be4);
            }
        } catch (java.lang.Error e17) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(TAG, "release", e17);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(TAG, "release", e18);
        }
        android.os.HandlerThread handlerThread = this.f48202x824007fe;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        this.f48191xa25ee958 = null;
        this.f48188xb84f5be4 = null;
        this.f48192xd043bd43 = null;
        this.f48201x9189ecad = null;
    }
}
