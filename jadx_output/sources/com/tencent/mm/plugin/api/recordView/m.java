package com.tencent.mm.plugin.api.recordView;

/* loaded from: classes10.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public final android.os.HandlerThread f74755a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f74756b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.api.recordView.o f74757c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.api.recordView.n f74758d;

    /* renamed from: e, reason: collision with root package name */
    public int f74759e;

    /* renamed from: f, reason: collision with root package name */
    public int f74760f;

    /* renamed from: g, reason: collision with root package name */
    public int f74761g;

    /* renamed from: h, reason: collision with root package name */
    public int f74762h;

    /* renamed from: i, reason: collision with root package name */
    public int f74763i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f74764j;

    /* renamed from: k, reason: collision with root package name */
    public final int[] f74765k;

    /* renamed from: l, reason: collision with root package name */
    public android.opengl.EGLDisplay f74766l;

    /* renamed from: m, reason: collision with root package name */
    public android.opengl.EGLSurface f74767m;

    /* renamed from: n, reason: collision with root package name */
    public android.opengl.EGLContext f74768n;

    public m() {
        int i17 = pu5.i.f358473b;
        this.f74755a = pu5.f.a("YUVDateRenderToRBGBufferThread", 5);
        this.f74758d = null;
        this.f74764j = false;
        this.f74765k = new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, org.webrtc.EglBase.EGL_RECORDABLE_ANDROID, 1, 12344};
        this.f74766l = null;
        this.f74767m = null;
        this.f74768n = null;
    }

    public final boolean a(java.lang.String str) {
        int eglGetError = android.opengl.EGL14.eglGetError();
        if (eglGetError == 12288) {
            return false;
        }
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.YUVDateRenderToRBGBufferThread", str + ": EGL error: 0x" + java.lang.Integer.toHexString(eglGetError), new java.lang.Object[0]);
        return true;
    }

    public void b(android.opengl.EGLContext eGLContext) {
        java.util.Objects.toString(eGLContext);
        if (this.f74764j || eGLContext == null) {
            return;
        }
        this.f74764j = true;
        android.os.HandlerThread handlerThread = this.f74755a;
        handlerThread.start();
        this.f74756b = new com.tencent.mm.sdk.platformtools.n3(handlerThread.getLooper());
        com.tencent.mm.plugin.api.recordView.j jVar = new com.tencent.mm.plugin.api.recordView.j(this, eGLContext);
        if (handlerThread.isAlive()) {
            this.f74756b.post(jVar);
        }
    }
}
