package com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96;

/* loaded from: classes10.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public final android.os.HandlerThread f156288a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f156289b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.o f156290c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.n f156291d;

    /* renamed from: e, reason: collision with root package name */
    public int f156292e;

    /* renamed from: f, reason: collision with root package name */
    public int f156293f;

    /* renamed from: g, reason: collision with root package name */
    public int f156294g;

    /* renamed from: h, reason: collision with root package name */
    public int f156295h;

    /* renamed from: i, reason: collision with root package name */
    public int f156296i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f156297j;

    /* renamed from: k, reason: collision with root package name */
    public final int[] f156298k;

    /* renamed from: l, reason: collision with root package name */
    public android.opengl.EGLDisplay f156299l;

    /* renamed from: m, reason: collision with root package name */
    public android.opengl.EGLSurface f156300m;

    /* renamed from: n, reason: collision with root package name */
    public android.opengl.EGLContext f156301n;

    public m() {
        int i17 = pu5.i.f440006b;
        this.f156288a = pu5.f.a("YUVDateRenderToRBGBufferThread", 5);
        this.f156291d = null;
        this.f156297j = false;
        this.f156298k = new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.f75309x5a4fb9b0, 1, 12344};
        this.f156299l = null;
        this.f156300m = null;
        this.f156301n = null;
    }

    public final boolean a(java.lang.String str) {
        int eglGetError = android.opengl.EGL14.eglGetError();
        if (eglGetError == 12288) {
            return false;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.YUVDateRenderToRBGBufferThread", str + ": EGL error: 0x" + java.lang.Integer.toHexString(eglGetError), new java.lang.Object[0]);
        return true;
    }

    public void b(android.opengl.EGLContext eGLContext) {
        java.util.Objects.toString(eGLContext);
        if (this.f156297j || eGLContext == null) {
            return;
        }
        this.f156297j = true;
        android.os.HandlerThread handlerThread = this.f156288a;
        handlerThread.start();
        this.f156289b = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(handlerThread.getLooper());
        com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.j jVar = new com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.j(this, eGLContext);
        if (handlerThread.isAlive()) {
            this.f156289b.mo50293x3498a0(jVar);
        }
    }
}
