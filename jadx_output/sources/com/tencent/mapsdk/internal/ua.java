package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public class ua extends android.view.SurfaceView implements android.view.SurfaceHolder.Callback {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f52309a = "tms-gl";

    /* renamed from: b, reason: collision with root package name */
    public static final int f52310b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f52311c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f52312d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f52313e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f52314f = 60;

    /* renamed from: j, reason: collision with root package name */
    private static final java.lang.String f52315j = "GLSurfaceView";

    /* renamed from: k, reason: collision with root package name */
    private static final boolean f52316k = false;

    /* renamed from: l, reason: collision with root package name */
    private static final boolean f52317l = false;

    /* renamed from: m, reason: collision with root package name */
    private static final boolean f52318m = false;

    /* renamed from: n, reason: collision with root package name */
    private static final boolean f52319n = false;

    /* renamed from: o, reason: collision with root package name */
    private static final boolean f52320o = false;

    /* renamed from: p, reason: collision with root package name */
    private static final boolean f52321p = true;

    /* renamed from: q, reason: collision with root package name */
    private static final boolean f52322q = false;

    /* renamed from: r, reason: collision with root package name */
    private static final com.tencent.mapsdk.internal.ua.j f52323r = new com.tencent.mapsdk.internal.ua.j(0);
    private int A;
    private boolean B;

    /* renamed from: g, reason: collision with root package name */
    protected boolean f52324g;

    /* renamed from: h, reason: collision with root package name */
    protected int f52325h;

    /* renamed from: i, reason: collision with root package name */
    com.tencent.mapsdk.internal.ua.i f52326i;

    /* renamed from: s, reason: collision with root package name */
    private final java.lang.ref.WeakReference<com.tencent.mapsdk.internal.ua> f52327s;

    /* renamed from: t, reason: collision with root package name */
    private com.tencent.mapsdk.internal.ua.m f52328t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f52329u;

    /* renamed from: v, reason: collision with root package name */
    private com.tencent.mapsdk.internal.ua.e f52330v;

    /* renamed from: w, reason: collision with root package name */
    private com.tencent.mapsdk.internal.ua.f f52331w;

    /* renamed from: x, reason: collision with root package name */
    private com.tencent.mapsdk.internal.ua.g f52332x;

    /* renamed from: y, reason: collision with root package name */
    private com.tencent.mapsdk.internal.ua.k f52333y;

    /* renamed from: z, reason: collision with root package name */
    private int f52334z;

    /* loaded from: classes13.dex */
    public static class d implements com.tencent.mapsdk.internal.ua.g {
        private d() {
        }

        public /* synthetic */ d(byte b17) {
            this();
        }

        @Override // com.tencent.mapsdk.internal.ua.g
        public final javax.microedition.khronos.egl.EGLSurface a(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay, javax.microedition.khronos.egl.EGLConfig eGLConfig, java.lang.Object obj) {
            try {
                return egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, obj, null);
            } catch (java.lang.IllegalArgumentException | java.lang.OutOfMemoryError unused) {
                return null;
            }
        }

        @Override // com.tencent.mapsdk.internal.ua.g
        public final void a(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay, javax.microedition.khronos.egl.EGLSurface eGLSurface) {
            egl10.eglDestroySurface(eGLDisplay, eGLSurface);
        }
    }

    /* loaded from: classes13.dex */
    public interface e {
        javax.microedition.khronos.egl.EGLConfig a(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay);
    }

    /* loaded from: classes13.dex */
    public interface f {
        javax.microedition.khronos.egl.EGLContext a(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay, javax.microedition.khronos.egl.EGLConfig eGLConfig);

        void a(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay, javax.microedition.khronos.egl.EGLContext eGLContext);
    }

    /* loaded from: classes13.dex */
    public interface g {
        javax.microedition.khronos.egl.EGLSurface a(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay, javax.microedition.khronos.egl.EGLConfig eGLConfig, java.lang.Object obj);

        void a(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay, javax.microedition.khronos.egl.EGLSurface eGLSurface);
    }

    /* loaded from: classes13.dex */
    public static class i extends java.lang.Thread {

        /* renamed from: a, reason: collision with root package name */
        boolean f52353a;

        /* renamed from: b, reason: collision with root package name */
        boolean f52354b;

        /* renamed from: c, reason: collision with root package name */
        boolean f52355c;

        /* renamed from: d, reason: collision with root package name */
        boolean f52356d;

        /* renamed from: e, reason: collision with root package name */
        boolean f52357e;

        /* renamed from: f, reason: collision with root package name */
        boolean f52358f;

        /* renamed from: g, reason: collision with root package name */
        boolean f52359g;

        /* renamed from: h, reason: collision with root package name */
        boolean f52360h;

        /* renamed from: m, reason: collision with root package name */
        boolean f52365m;

        /* renamed from: p, reason: collision with root package name */
        private long f52368p;

        /* renamed from: q, reason: collision with root package name */
        private boolean f52369q;

        /* renamed from: r, reason: collision with root package name */
        private boolean f52370r;

        /* renamed from: s, reason: collision with root package name */
        private boolean f52371s;

        /* renamed from: u, reason: collision with root package name */
        private com.tencent.mapsdk.internal.ua.h f52373u;

        /* renamed from: v, reason: collision with root package name */
        private java.lang.ref.WeakReference<com.tencent.mapsdk.internal.ua> f52374v;

        /* renamed from: n, reason: collision with root package name */
        java.util.ArrayList<java.lang.Runnable> f52366n = new java.util.ArrayList<>();

        /* renamed from: o, reason: collision with root package name */
        boolean f52367o = true;

        /* renamed from: t, reason: collision with root package name */
        private float f52372t = 60.0f;

        /* renamed from: i, reason: collision with root package name */
        int f52361i = 0;

        /* renamed from: j, reason: collision with root package name */
        int f52362j = 0;

        /* renamed from: l, reason: collision with root package name */
        boolean f52364l = true;

        /* renamed from: k, reason: collision with root package name */
        int f52363k = 1;

        public i(java.lang.ref.WeakReference<com.tencent.mapsdk.internal.ua> weakReference) {
            this.f52374v = weakReference;
            setName(com.tencent.mapsdk.internal.ua.a("SV"));
            com.tencent.mapsdk.core.utils.log.LogUtil.a(g()).c(com.tencent.mapsdk.internal.la.a.f50266g, com.tencent.mapsdk.internal.ua.a("SV") + " create");
        }

        public static /* synthetic */ boolean a(com.tencent.mapsdk.internal.ua.i iVar) {
            iVar.f52353a = true;
            return true;
        }

        private void h() {
            if (this.f52358f) {
                this.f52358f = false;
                this.f52373u.a();
                com.tencent.mapsdk.core.utils.log.LogUtil.a(g()).c(com.tencent.mapsdk.internal.la.a.f50266g, "stopEglSurfaceLocked");
            }
        }

        private void i() {
            if (this.f52357e) {
                this.f52373u.b();
                this.f52357e = false;
                com.tencent.mapsdk.internal.ua.f52323r.c(this);
                com.tencent.mapsdk.core.utils.log.LogUtil.a(g()).c(com.tencent.mapsdk.internal.la.a.f50266g, "stopEglContextLocked");
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:153:0x03c5  */
        /* JADX WARN: Removed duplicated region for block: B:156:0x03d2 A[Catch: all -> 0x03f9, Exception -> 0x03fb, TRY_LEAVE, TryCatch #5 {Exception -> 0x03fb, blocks: (B:3:0x001c, B:4:0x0020, B:211:0x020d, B:76:0x0216, B:78:0x021c, B:80:0x0220, B:82:0x0224, B:84:0x0231, B:85:0x0256, B:87:0x025a, B:90:0x025f, B:92:0x026b, B:95:0x0285, B:96:0x0289, B:103:0x02d6, B:105:0x02e8, B:107:0x02ee, B:108:0x02f6, B:110:0x02fe, B:113:0x0309, B:115:0x0311, B:116:0x0318, B:119:0x031c, B:121:0x0329, B:123:0x0333, B:126:0x0341, B:128:0x034b, B:130:0x0353, B:132:0x035b, B:133:0x035e, B:135:0x0372, B:136:0x037c, B:138:0x0384, B:140:0x0394, B:144:0x03a2, B:145:0x03ad, B:154:0x03c8, B:156:0x03d2, B:166:0x03dd, B:177:0x03bc, B:185:0x0299, B:186:0x029a, B:187:0x029e, B:196:0x02b4, B:198:0x027a, B:199:0x024d, B:201:0x02b5, B:202:0x02bc, B:204:0x02bd, B:205:0x02c4, B:207:0x02c5, B:208:0x02cc, B:280:0x03f8), top: B:2:0x001c, outer: #10 }] */
        /* JADX WARN: Removed duplicated region for block: B:173:0x03c6  */
        /* JADX WARN: Removed duplicated region for block: B:186:0x029a A[Catch: all -> 0x03f9, Exception -> 0x03fb, TryCatch #5 {Exception -> 0x03fb, blocks: (B:3:0x001c, B:4:0x0020, B:211:0x020d, B:76:0x0216, B:78:0x021c, B:80:0x0220, B:82:0x0224, B:84:0x0231, B:85:0x0256, B:87:0x025a, B:90:0x025f, B:92:0x026b, B:95:0x0285, B:96:0x0289, B:103:0x02d6, B:105:0x02e8, B:107:0x02ee, B:108:0x02f6, B:110:0x02fe, B:113:0x0309, B:115:0x0311, B:116:0x0318, B:119:0x031c, B:121:0x0329, B:123:0x0333, B:126:0x0341, B:128:0x034b, B:130:0x0353, B:132:0x035b, B:133:0x035e, B:135:0x0372, B:136:0x037c, B:138:0x0384, B:140:0x0394, B:144:0x03a2, B:145:0x03ad, B:154:0x03c8, B:156:0x03d2, B:166:0x03dd, B:177:0x03bc, B:185:0x0299, B:186:0x029a, B:187:0x029e, B:196:0x02b4, B:198:0x027a, B:199:0x024d, B:201:0x02b5, B:202:0x02bc, B:204:0x02bd, B:205:0x02c4, B:207:0x02c5, B:208:0x02cc, B:280:0x03f8), top: B:2:0x001c, outer: #10 }] */
        /* JADX WARN: Removed duplicated region for block: B:214:0x03e8 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:62:0x01db A[Catch: all -> 0x03f6, TryCatch #6 {, blocks: (B:6:0x0021, B:264:0x0025, B:266:0x002f, B:267:0x0036, B:8:0x0047, B:262:0x004f, B:72:0x020a, B:10:0x005c, B:12:0x0062, B:13:0x006d, B:15:0x0071, B:17:0x007d, B:19:0x0088, B:21:0x008c, B:23:0x0091, B:25:0x0095, B:27:0x009f, B:31:0x00aa, B:33:0x00b4, B:36:0x00b9, B:38:0x00c3, B:39:0x00c8, B:41:0x00cc, B:43:0x00d0, B:45:0x00d4, B:46:0x00d7, B:47:0x00e4, B:49:0x00e8, B:51:0x00ec, B:53:0x00f8, B:54:0x0104, B:56:0x010a, B:60:0x01d7, B:62:0x01db, B:64:0x01df, B:65:0x01e5, B:68:0x01e9, B:70:0x01ed, B:71:0x01fc, B:215:0x03e8, B:216:0x0117, B:219:0x0121, B:223:0x013a, B:225:0x0144, B:227:0x014e, B:228:0x0176, B:235:0x017a, B:232:0x018f, B:233:0x01c7, B:230:0x0181, B:240:0x0156, B:242:0x015e, B:239:0x01b1, B:244:0x0192, B:245:0x019b, B:251:0x019e, B:252:0x01a9), top: B:5:0x0021 }] */
        /* JADX WARN: Removed duplicated region for block: B:67:0x01e9 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:95:0x0285 A[Catch: all -> 0x03f9, Exception -> 0x03fb, TryCatch #5 {Exception -> 0x03fb, blocks: (B:3:0x001c, B:4:0x0020, B:211:0x020d, B:76:0x0216, B:78:0x021c, B:80:0x0220, B:82:0x0224, B:84:0x0231, B:85:0x0256, B:87:0x025a, B:90:0x025f, B:92:0x026b, B:95:0x0285, B:96:0x0289, B:103:0x02d6, B:105:0x02e8, B:107:0x02ee, B:108:0x02f6, B:110:0x02fe, B:113:0x0309, B:115:0x0311, B:116:0x0318, B:119:0x031c, B:121:0x0329, B:123:0x0333, B:126:0x0341, B:128:0x034b, B:130:0x0353, B:132:0x035b, B:133:0x035e, B:135:0x0372, B:136:0x037c, B:138:0x0384, B:140:0x0394, B:144:0x03a2, B:145:0x03ad, B:154:0x03c8, B:156:0x03d2, B:166:0x03dd, B:177:0x03bc, B:185:0x0299, B:186:0x029a, B:187:0x029e, B:196:0x02b4, B:198:0x027a, B:199:0x024d, B:201:0x02b5, B:202:0x02bc, B:204:0x02bd, B:205:0x02c4, B:207:0x02c5, B:208:0x02cc, B:280:0x03f8), top: B:2:0x001c, outer: #10 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void j() {
            /*
                Method dump skipped, instructions count: 1067
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.ua.i.j():void");
        }

        private boolean k() {
            return this.f52357e && this.f52358f && a();
        }

        private void l() {
            synchronized (com.tencent.mapsdk.internal.ua.f52323r) {
                this.f52355c = true;
                this.f52359g = false;
                com.tencent.mapsdk.internal.ua.f52323r.notifyAll();
                com.tencent.mapsdk.core.utils.log.LogUtil.a(g()).c(com.tencent.mapsdk.internal.la.a.f50266g, com.tencent.mapsdk.internal.ua.a("SV") + " surfaceCreated begin, wait: " + this.f52356d + ", finish: " + this.f52359g + ", exit: " + this.f52353a);
                while (this.f52356d && !this.f52359g && !this.f52353a) {
                    try {
                        com.tencent.mapsdk.internal.ua.f52323r.wait();
                    } catch (java.lang.InterruptedException e17) {
                        java.lang.Thread.currentThread().interrupt();
                        com.tencent.mapsdk.core.utils.log.LogUtil.a(g()).e(com.tencent.mapsdk.internal.la.a.f50266g, com.tencent.mapsdk.internal.ua.a("SV") + " surfaceCreated exception", e17);
                    }
                }
                com.tencent.mapsdk.core.utils.log.LogUtil.a(g()).c(com.tencent.mapsdk.internal.la.a.f50266g, com.tencent.mapsdk.internal.ua.a("SV") + " surfaceCreated end");
            }
        }

        private void m() {
            synchronized (com.tencent.mapsdk.internal.ua.f52323r) {
                this.f52355c = false;
                com.tencent.mapsdk.internal.ua.f52323r.notifyAll();
                com.tencent.mapsdk.core.utils.log.LogUtil.a(g()).c(com.tencent.mapsdk.internal.la.a.f50266g, com.tencent.mapsdk.internal.ua.a("SV") + " surfaceDestroyed begin, wait: " + this.f52356d + ", exit: " + this.f52353a);
                while (!this.f52356d && !this.f52353a) {
                    try {
                        com.tencent.mapsdk.internal.ua.f52323r.wait();
                    } catch (java.lang.InterruptedException e17) {
                        java.lang.Thread.currentThread().interrupt();
                        com.tencent.mapsdk.core.utils.log.LogUtil.a(g()).e(com.tencent.mapsdk.internal.la.a.f50266g, com.tencent.mapsdk.internal.ua.a("SV") + " surfaceDestroyed exception", e17);
                    }
                }
                com.tencent.mapsdk.core.utils.log.LogUtil.a(g()).c(com.tencent.mapsdk.internal.la.a.f50266g, com.tencent.mapsdk.internal.ua.a("SV") + " surfaceDestroyed end");
            }
        }

        private void n() {
            synchronized (com.tencent.mapsdk.internal.ua.f52323r) {
                this.f52360h = true;
                com.tencent.mapsdk.internal.ua.f52323r.notifyAll();
            }
        }

        public final int b() {
            int i17;
            synchronized (com.tencent.mapsdk.internal.ua.f52323r) {
                i17 = this.f52363k;
            }
            return i17;
        }

        public final void c() {
            synchronized (com.tencent.mapsdk.internal.ua.f52323r) {
                this.f52364l = true;
                com.tencent.mapsdk.internal.ua.f52323r.notifyAll();
            }
        }

        public final void d() {
            synchronized (com.tencent.mapsdk.internal.ua.f52323r) {
                this.f52370r = true;
                com.tencent.mapsdk.internal.ua.f52323r.notifyAll();
                com.tencent.mapsdk.core.utils.log.LogUtil.a(g()).c(com.tencent.mapsdk.internal.la.a.f50266g, com.tencent.mapsdk.internal.ua.a("SV") + " pause begin, exit: " + this.f52353a + ", pause: " + this.f52354b);
                while (!this.f52353a && !this.f52354b) {
                    try {
                        com.tencent.mapsdk.internal.ua.f52323r.wait();
                    } catch (java.lang.InterruptedException e17) {
                        java.lang.Thread.currentThread().interrupt();
                        com.tencent.mapsdk.core.utils.log.LogUtil.a(g()).e(com.tencent.mapsdk.internal.la.a.f50266g, com.tencent.mapsdk.internal.ua.a("SV") + " pause exception", e17);
                    }
                }
                com.tencent.mapsdk.core.utils.log.LogUtil.a(g()).c(com.tencent.mapsdk.internal.la.a.f50266g, com.tencent.mapsdk.internal.ua.a("SV") + " pause end");
            }
        }

        public final void e() {
            synchronized (com.tencent.mapsdk.internal.ua.f52323r) {
                this.f52370r = false;
                this.f52364l = true;
                this.f52365m = false;
                com.tencent.mapsdk.internal.ua.f52323r.notifyAll();
                com.tencent.mapsdk.core.utils.log.LogUtil.a(g()).c(com.tencent.mapsdk.internal.la.a.f50266g, com.tencent.mapsdk.internal.ua.a("SV") + " resume begin, exit: " + this.f52353a + ", pause: " + this.f52354b + ", render: " + this.f52365m);
                while (!this.f52353a && this.f52354b && !this.f52365m) {
                    try {
                        com.tencent.mapsdk.internal.ua.f52323r.wait();
                    } catch (java.lang.InterruptedException e17) {
                        java.lang.Thread.currentThread().interrupt();
                        com.tencent.mapsdk.core.utils.log.LogUtil.a(g()).e(com.tencent.mapsdk.internal.la.a.f50266g, com.tencent.mapsdk.internal.ua.a("SV") + " resume exception", e17);
                    }
                }
                com.tencent.mapsdk.core.utils.log.LogUtil.a(g()).c(com.tencent.mapsdk.internal.la.a.f50266g, com.tencent.mapsdk.internal.ua.a("SV") + " resume end");
            }
        }

        public final void f() {
            synchronized (com.tencent.mapsdk.internal.ua.f52323r) {
                this.f52369q = true;
                com.tencent.mapsdk.internal.ua.f52323r.notifyAll();
                com.tencent.mapsdk.core.utils.log.LogUtil.a(g()).c(com.tencent.mapsdk.internal.la.a.f50266g, com.tencent.mapsdk.internal.ua.a("SV") + " requestExitAndWait begin, exit: " + this.f52353a);
                while (!this.f52353a) {
                    try {
                        com.tencent.mapsdk.internal.ua.f52323r.wait();
                    } catch (java.lang.InterruptedException unused) {
                        java.lang.Thread.currentThread().interrupt();
                    }
                }
                com.tencent.mapsdk.core.utils.log.LogUtil.a(g()).c(com.tencent.mapsdk.internal.la.a.f50266g, com.tencent.mapsdk.internal.ua.a("SV") + " requestExitAndWait end");
            }
        }

        public final int g() {
            java.lang.ref.WeakReference<com.tencent.mapsdk.internal.ua> weakReference = this.f52374v;
            if (weakReference == null || weakReference.get() == null) {
                return -1;
            }
            return this.f52374v.get().getMapId();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            com.tencent.mapsdk.core.utils.log.LogUtil.a(g()).c(com.tencent.mapsdk.internal.la.a.f50266g, com.tencent.mapsdk.internal.ua.a("SV") + " start");
            try {
                try {
                    j();
                } catch (java.lang.InterruptedException unused) {
                    java.lang.Thread.currentThread().interrupt();
                }
            } finally {
                com.tencent.mapsdk.internal.ua.f52323r.a(this);
            }
        }

        public final boolean a() {
            if (this.f52354b || !this.f52355c || this.f52371s || this.f52361i <= 0 || this.f52362j <= 0) {
                return false;
            }
            return this.f52364l || this.f52363k == 1;
        }

        private void a(int i17) {
            if (i17 >= 0 && i17 <= 1) {
                synchronized (com.tencent.mapsdk.internal.ua.f52323r) {
                    this.f52363k = i17;
                    com.tencent.mapsdk.internal.ua.f52323r.notifyAll();
                }
                return;
            }
            throw new java.lang.IllegalArgumentException("renderMode");
        }

        private void a(int i17, int i18) {
            synchronized (com.tencent.mapsdk.internal.ua.f52323r) {
                com.tencent.mapsdk.core.utils.log.LogUtil.a(g()).c(com.tencent.mapsdk.internal.la.a.f50266g, com.tencent.mapsdk.internal.ua.a("SV") + " onWindowResize try begin, width: " + this.f52361i + ", height: " + this.f52362j);
                if (this.f52361i == i17 && this.f52362j == i18) {
                    this.f52367o = false;
                    com.tencent.mapsdk.internal.ua.f52323r.notifyAll();
                    return;
                }
                this.f52361i = i17;
                this.f52362j = i18;
                this.f52367o = true;
                this.f52364l = true;
                this.f52365m = false;
                com.tencent.mapsdk.internal.ua.f52323r.notifyAll();
                com.tencent.mapsdk.core.utils.log.LogUtil.a(g()).c(com.tencent.mapsdk.internal.la.a.f50266g, com.tencent.mapsdk.internal.ua.a("SV") + " onWindowResize begin, exit: " + this.f52353a + ", pause: " + this.f52354b + ", render: " + this.f52365m);
                while (!this.f52353a && !this.f52354b && !this.f52365m) {
                    if (!(this.f52357e && this.f52358f && a())) {
                        break;
                    }
                    try {
                        com.tencent.mapsdk.internal.ua.f52323r.wait();
                    } catch (java.lang.InterruptedException e17) {
                        java.lang.Thread.currentThread().interrupt();
                        com.tencent.mapsdk.core.utils.log.LogUtil.a(g()).e(com.tencent.mapsdk.internal.la.a.f50266g, com.tencent.mapsdk.internal.ua.a("SV") + " onWindowResize exception", e17);
                    }
                }
                com.tencent.mapsdk.core.utils.log.LogUtil.a(g()).c(com.tencent.mapsdk.internal.la.a.f50266g, com.tencent.mapsdk.internal.ua.a("SV") + " onWindowResize end");
            }
        }

        private void a(java.lang.Runnable runnable) {
            if (runnable != null) {
                synchronized (com.tencent.mapsdk.internal.ua.f52323r) {
                    this.f52366n.add(runnable);
                    com.tencent.mapsdk.internal.ua.f52323r.notifyAll();
                }
                return;
            }
            throw new java.lang.IllegalArgumentException("r must not be null");
        }

        public final void a(float f17) {
            if (f17 <= 1.0f) {
                com.tencent.mapsdk.core.utils.log.LogUtil.e(com.tencent.mapsdk.internal.kx.f50212m, "帧率设置不在有效值范围内");
            } else {
                this.f52372t = f17;
            }
        }
    }

    /* loaded from: classes13.dex */
    public interface k {
        javax.microedition.khronos.opengles.GL a();
    }

    /* loaded from: classes13.dex */
    public static class l extends java.io.Writer {

        /* renamed from: a, reason: collision with root package name */
        private java.lang.StringBuilder f52384a = new java.lang.StringBuilder();

        private void a() {
            if (this.f52384a.length() > 0) {
                this.f52384a.toString();
                java.lang.StringBuilder sb6 = this.f52384a;
                sb6.delete(0, sb6.length());
            }
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            a();
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() {
            a();
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i17, int i18) {
            for (int i19 = 0; i19 < i18; i19++) {
                char c17 = cArr[i17 + i19];
                if (c17 == '\n') {
                    a();
                } else {
                    this.f52384a.append(c17);
                }
            }
        }
    }

    /* loaded from: classes13.dex */
    public interface m {
        void a(javax.microedition.khronos.opengles.GL10 gl10, int i17, int i18);

        void a(javax.microedition.khronos.opengles.GL10 gl10, javax.microedition.khronos.egl.EGLConfig eGLConfig);

        boolean a(javax.microedition.khronos.opengles.GL10 gl10);

        void ae();
    }

    /* loaded from: classes13.dex */
    public class n extends com.tencent.mapsdk.internal.ua.b {
        public n(boolean z17) {
            super(0, z17 ? 16 : 0, 0);
        }
    }

    public ua(android.content.Context context) {
        super(context);
        this.f52325h = -1;
        this.f52327s = new java.lang.ref.WeakReference<>(this);
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getMapId() {
        return this.f52325h;
    }

    public void b() {
        this.f52326i.d();
    }

    public void finalize() {
        try {
            com.tencent.mapsdk.internal.ua.i iVar = this.f52326i;
            if (iVar != null) {
                iVar.f();
            }
        } finally {
            super.finalize();
        }
    }

    public int getDebugFlags() {
        return this.f52334z;
    }

    public boolean getPreserveEGLContextOnPause() {
        return this.B;
    }

    public int getRenderMode() {
        return this.f52326i.b();
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f52329u) {
            this.f52326i.e();
        }
        this.f52329u = false;
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        com.tencent.mapsdk.internal.ua.i iVar = this.f52326i;
        if (iVar != null) {
            iVar.d();
        }
        this.f52329u = true;
        super.onDetachedFromWindow();
    }

    public void setDebugFlags(int i17) {
        this.f52334z = i17;
    }

    public void setEGLConfigChooser(com.tencent.mapsdk.internal.ua.e eVar) {
        i();
        this.f52330v = eVar;
    }

    public void setEGLContextClientVersion(int i17) {
        i();
        this.A = i17;
    }

    public void setEGLContextFactory(com.tencent.mapsdk.internal.ua.f fVar) {
        i();
        this.f52331w = fVar;
    }

    public void setEGLWindowSurfaceFactory(com.tencent.mapsdk.internal.ua.g gVar) {
        i();
        this.f52332x = gVar;
    }

    public void setGLWrapper(com.tencent.mapsdk.internal.ua.k kVar) {
        this.f52333y = kVar;
    }

    public void setPreserveEGLContextOnPause(boolean z17) {
        this.B = z17;
    }

    public void setRenderMode(int i17) {
        com.tencent.mapsdk.internal.ua.i iVar = this.f52326i;
        if (i17 < 0 || i17 > 1) {
            throw new java.lang.IllegalArgumentException("renderMode");
        }
        com.tencent.mapsdk.internal.ua.j jVar = f52323r;
        synchronized (jVar) {
            iVar.f52363k = i17;
            jVar.notifyAll();
        }
    }

    public void setRenderer(com.tencent.mapsdk.internal.ua.m mVar) {
        a(mVar, 60.0f);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i17, int i18, int i19) {
        com.tencent.mapsdk.internal.ua.i iVar = this.f52326i;
        com.tencent.mapsdk.internal.ua.j jVar = f52323r;
        synchronized (jVar) {
            com.tencent.mapsdk.core.utils.log.LogUtil.a(iVar.g()).c(com.tencent.mapsdk.internal.la.a.f50266g, a("SV") + " onWindowResize try begin, width: " + iVar.f52361i + ", height: " + iVar.f52362j);
            if (iVar.f52361i == i18 && iVar.f52362j == i19) {
                iVar.f52367o = false;
                jVar.notifyAll();
                return;
            }
            iVar.f52361i = i18;
            iVar.f52362j = i19;
            iVar.f52367o = true;
            iVar.f52364l = true;
            iVar.f52365m = false;
            jVar.notifyAll();
            com.tencent.mapsdk.core.utils.log.LogUtil.a(iVar.g()).c(com.tencent.mapsdk.internal.la.a.f50266g, a("SV") + " onWindowResize begin, exit: " + iVar.f52353a + ", pause: " + iVar.f52354b + ", render: " + iVar.f52365m);
            while (!iVar.f52353a && !iVar.f52354b && !iVar.f52365m) {
                if (!(iVar.f52357e && iVar.f52358f && iVar.a())) {
                    break;
                }
                try {
                    f52323r.wait();
                } catch (java.lang.InterruptedException e17) {
                    java.lang.Thread.currentThread().interrupt();
                    com.tencent.mapsdk.core.utils.log.LogUtil.a(iVar.g()).e(com.tencent.mapsdk.internal.la.a.f50266g, a("SV") + " onWindowResize exception", e17);
                }
            }
            com.tencent.mapsdk.core.utils.log.LogUtil.a(iVar.g()).c(com.tencent.mapsdk.internal.la.a.f50266g, a("SV") + " onWindowResize end");
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
        com.tencent.mapsdk.internal.ua.i iVar = this.f52326i;
        com.tencent.mapsdk.internal.ua.j jVar = f52323r;
        synchronized (jVar) {
            iVar.f52355c = true;
            iVar.f52359g = false;
            jVar.notifyAll();
            com.tencent.mapsdk.core.utils.log.LogUtil.a(iVar.g()).c(com.tencent.mapsdk.internal.la.a.f50266g, a("SV") + " surfaceCreated begin, wait: " + iVar.f52356d + ", finish: " + iVar.f52359g + ", exit: " + iVar.f52353a);
            while (iVar.f52356d && !iVar.f52359g && !iVar.f52353a) {
                try {
                    f52323r.wait();
                } catch (java.lang.InterruptedException e17) {
                    java.lang.Thread.currentThread().interrupt();
                    com.tencent.mapsdk.core.utils.log.LogUtil.a(iVar.g()).e(com.tencent.mapsdk.internal.la.a.f50266g, a("SV") + " surfaceCreated exception", e17);
                }
            }
            com.tencent.mapsdk.core.utils.log.LogUtil.a(iVar.g()).c(com.tencent.mapsdk.internal.la.a.f50266g, a("SV") + " surfaceCreated end");
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
        com.tencent.mapsdk.internal.ua.i iVar = this.f52326i;
        com.tencent.mapsdk.internal.ua.j jVar = f52323r;
        synchronized (jVar) {
            iVar.f52355c = false;
            jVar.notifyAll();
            com.tencent.mapsdk.core.utils.log.LogUtil.a(iVar.g()).c(com.tencent.mapsdk.internal.la.a.f50266g, a("SV") + " surfaceDestroyed begin, wait: " + iVar.f52356d + ", exit: " + iVar.f52353a);
            while (!iVar.f52356d && !iVar.f52353a) {
                try {
                    f52323r.wait();
                } catch (java.lang.InterruptedException e17) {
                    java.lang.Thread.currentThread().interrupt();
                    com.tencent.mapsdk.core.utils.log.LogUtil.a(iVar.g()).e(com.tencent.mapsdk.internal.la.a.f50266g, a("SV") + " surfaceDestroyed exception", e17);
                }
            }
            com.tencent.mapsdk.core.utils.log.LogUtil.a(iVar.g()).c(com.tencent.mapsdk.internal.la.a.f50266g, a("SV") + " surfaceDestroyed end");
        }
    }

    /* loaded from: classes13.dex */
    public class c implements com.tencent.mapsdk.internal.ua.f {

        /* renamed from: b, reason: collision with root package name */
        private int f52346b;

        private c() {
            this.f52346b = 12440;
        }

        @Override // com.tencent.mapsdk.internal.ua.f
        public final javax.microedition.khronos.egl.EGLContext a(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay, javax.microedition.khronos.egl.EGLConfig eGLConfig) {
            int[] iArr = {this.f52346b, com.tencent.mapsdk.internal.ua.this.A, 12344};
            javax.microedition.khronos.egl.EGLContext eGLContext = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT;
            if (com.tencent.mapsdk.internal.ua.this.A == 0) {
                iArr = null;
            }
            return egl10.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
        }

        public /* synthetic */ c(com.tencent.mapsdk.internal.ua uaVar, byte b17) {
            this();
        }

        @Override // com.tencent.mapsdk.internal.ua.f
        public final void a(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay, javax.microedition.khronos.egl.EGLContext eGLContext) {
            if (egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                return;
            }
            java.util.Objects.toString(eGLDisplay);
            java.util.Objects.toString(eGLContext);
            egl10.eglGetError();
            com.tencent.mapsdk.internal.ua.h.a("eglDestroyContex");
        }
    }

    public static java.lang.String a(java.lang.String str) {
        return "tms-gl." + str + ".bf1a26d9";
    }

    private void d() {
        getHolder().addCallback(this);
    }

    private boolean e() {
        return this.f52324g;
    }

    private void f() {
        setEGLConfigChooser(new com.tencent.mapsdk.internal.ua.b(8, 16, 8));
    }

    private void h() {
        this.f52326i.c();
    }

    private void i() {
        if (this.f52326i != null) {
            throw new java.lang.IllegalStateException("setRenderer has already been called for this instance.");
        }
    }

    public void c() {
        com.tencent.mapsdk.internal.ua.i iVar = this.f52326i;
        if (iVar != null) {
            iVar.f();
        }
    }

    public final void a(float f17) {
        com.tencent.mapsdk.internal.ua.i iVar = this.f52326i;
        if (iVar != null) {
            iVar.a(f17);
            this.f52326i.c();
        }
    }

    public void setEGLConfigChooser(boolean z17) {
        setEGLConfigChooser(new com.tencent.mapsdk.internal.ua.n(z17));
    }

    /* loaded from: classes13.dex */
    public static class j {

        /* renamed from: a, reason: collision with root package name */
        private static java.lang.String f52375a = "GLThreadManager";

        /* renamed from: g, reason: collision with root package name */
        private static final int f52376g = 131072;

        /* renamed from: h, reason: collision with root package name */
        private static final java.lang.String f52377h = "Q3Dimension MSM7500 ";

        /* renamed from: b, reason: collision with root package name */
        private boolean f52378b;

        /* renamed from: c, reason: collision with root package name */
        private int f52379c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f52380d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f52381e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f52382f;

        /* renamed from: i, reason: collision with root package name */
        private com.tencent.mapsdk.internal.ua.i f52383i;

        private j() {
        }

        public /* synthetic */ j(byte b17) {
            this();
        }

        public final synchronized void a(com.tencent.mapsdk.internal.ua.i iVar) {
            com.tencent.mapsdk.internal.ua.i.a(iVar);
            if (this.f52383i == iVar) {
                this.f52383i = null;
            }
            notifyAll();
        }

        public final synchronized boolean b(com.tencent.mapsdk.internal.ua.i iVar) {
            com.tencent.mapsdk.internal.ua.i iVar2 = this.f52383i;
            if (iVar2 != iVar && iVar2 != null) {
                c();
                if (this.f52381e) {
                    return true;
                }
                com.tencent.mapsdk.internal.ua.i iVar3 = this.f52383i;
                if (iVar3 != null) {
                    synchronized (com.tencent.mapsdk.internal.ua.f52323r) {
                        iVar3.f52360h = true;
                        com.tencent.mapsdk.internal.ua.f52323r.notifyAll();
                    }
                }
                return false;
            }
            this.f52383i = iVar;
            notifyAll();
            return true;
        }

        public final synchronized void c(com.tencent.mapsdk.internal.ua.i iVar) {
            if (this.f52383i == iVar) {
                this.f52383i = null;
            }
            notifyAll();
        }

        private void c() {
            if (this.f52378b) {
                return;
            }
            this.f52379c = 131072;
            this.f52381e = true;
            this.f52378b = true;
        }

        public final synchronized boolean a() {
            return this.f52382f;
        }

        public final synchronized void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (!this.f52380d) {
                c();
                java.lang.String glGetString = gl10.glGetString(7937);
                if (this.f52379c < 131072) {
                    this.f52381e = !glGetString.startsWith(f52377h);
                    notifyAll();
                }
                this.f52382f = this.f52381e ? false : true;
                this.f52380d = true;
            }
        }

        public final synchronized boolean b() {
            c();
            return !this.f52381e;
        }
    }

    /* loaded from: classes13.dex */
    public static class h {

        /* renamed from: a, reason: collision with root package name */
        java.lang.ref.WeakReference<com.tencent.mapsdk.internal.ua> f52347a;

        /* renamed from: b, reason: collision with root package name */
        javax.microedition.khronos.egl.EGL10 f52348b;

        /* renamed from: c, reason: collision with root package name */
        javax.microedition.khronos.egl.EGLDisplay f52349c;

        /* renamed from: d, reason: collision with root package name */
        javax.microedition.khronos.egl.EGLSurface f52350d;

        /* renamed from: e, reason: collision with root package name */
        javax.microedition.khronos.egl.EGLConfig f52351e;

        /* renamed from: f, reason: collision with root package name */
        javax.microedition.khronos.egl.EGLContext f52352f;

        public h(java.lang.ref.WeakReference<com.tencent.mapsdk.internal.ua> weakReference) {
            this.f52347a = weakReference;
        }

        private void c() {
            javax.microedition.khronos.egl.EGL10 egl10 = (javax.microedition.khronos.egl.EGL10) javax.microedition.khronos.egl.EGLContext.getEGL();
            this.f52348b = egl10;
            javax.microedition.khronos.egl.EGLDisplay eglGetDisplay = egl10.eglGetDisplay(javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY);
            this.f52349c = eglGetDisplay;
            if (eglGetDisplay != javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY) {
                if (this.f52348b.eglInitialize(eglGetDisplay, new int[2])) {
                    com.tencent.mapsdk.internal.ua uaVar = this.f52347a.get();
                    if (uaVar != null) {
                        this.f52351e = uaVar.f52330v.a(this.f52348b, this.f52349c);
                        this.f52352f = uaVar.f52331w.a(this.f52348b, this.f52349c, this.f52351e);
                    } else {
                        this.f52351e = null;
                        this.f52352f = null;
                    }
                    javax.microedition.khronos.egl.EGLContext eGLContext = this.f52352f;
                    if (eGLContext == null || eGLContext == javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT) {
                        this.f52352f = null;
                        this.f52348b.eglGetError();
                        a("createContext");
                    }
                    this.f52350d = null;
                    return;
                }
                throw new java.lang.RuntimeException("eglInitialize failed");
            }
            throw new java.lang.RuntimeException("eglGetDisplay failed");
        }

        private boolean d() {
            if (this.f52348b == null) {
                throw new java.lang.RuntimeException("egl not initialized");
            }
            if (this.f52349c == null) {
                throw new java.lang.RuntimeException("eglDisplay not initialized");
            }
            if (this.f52351e == null) {
                throw new java.lang.RuntimeException("mEglConfig not initialized");
            }
            a();
            com.tencent.mapsdk.internal.ua uaVar = this.f52347a.get();
            if (uaVar != null) {
                this.f52350d = uaVar.f52332x.a(this.f52348b, this.f52349c, this.f52351e, uaVar.getHolder());
            } else {
                this.f52350d = null;
            }
            javax.microedition.khronos.egl.EGLSurface eGLSurface = this.f52350d;
            if (eGLSurface == null || eGLSurface == javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE) {
                this.f52348b.eglGetError();
                return false;
            }
            if (this.f52348b.eglMakeCurrent(this.f52349c, eGLSurface, eGLSurface, this.f52352f)) {
                return true;
            }
            this.f52348b.eglGetError();
            a("EGLHelper", "eglMakeCurrent");
            return false;
        }

        private javax.microedition.khronos.opengles.GL e() {
            javax.microedition.khronos.opengles.GL gl6 = this.f52352f.getGL();
            com.tencent.mapsdk.internal.ua uaVar = this.f52347a.get();
            if (uaVar == null) {
                return gl6;
            }
            if (uaVar.f52333y != null) {
                gl6 = uaVar.f52333y.a();
            }
            if ((uaVar.f52334z & 3) != 0) {
                return android.opengl.GLDebugHelper.wrap(gl6, (uaVar.f52334z & 1) == 0 ? 0 : 1, (uaVar.f52334z & 2) != 0 ? new com.tencent.mapsdk.internal.ua.l() : null);
            }
            return gl6;
        }

        private int f() {
            if (this.f52348b.eglSwapBuffers(this.f52349c, this.f52350d)) {
                return 12288;
            }
            return this.f52348b.eglGetError();
        }

        private void g() {
            a();
        }

        public final void a() {
            javax.microedition.khronos.egl.EGLSurface eGLSurface;
            javax.microedition.khronos.egl.EGLSurface eGLSurface2 = this.f52350d;
            if (eGLSurface2 == null || eGLSurface2 == (eGLSurface = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE)) {
                return;
            }
            this.f52348b.eglMakeCurrent(this.f52349c, eGLSurface, eGLSurface, javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT);
            com.tencent.mapsdk.internal.ua uaVar = this.f52347a.get();
            if (uaVar != null) {
                uaVar.f52332x.a(this.f52348b, this.f52349c, this.f52350d);
            }
            this.f52350d = null;
        }

        public final void b() {
            if (this.f52352f != null) {
                com.tencent.mapsdk.internal.ua uaVar = this.f52347a.get();
                if (uaVar != null) {
                    try {
                        javax.microedition.khronos.egl.EGL10 egl10 = this.f52348b;
                        javax.microedition.khronos.egl.EGLDisplay eGLDisplay = this.f52349c;
                        javax.microedition.khronos.egl.EGLSurface eGLSurface = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
                        if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f52352f)) {
                            android.opengl.GLUtils.getEGLErrorString(this.f52348b.eglGetError());
                        }
                    } catch (java.lang.Exception e17) {
                        android.util.Log.getStackTraceString(e17);
                    }
                    uaVar.f52331w.a(this.f52348b, this.f52349c, this.f52352f);
                }
                this.f52352f = null;
            }
            javax.microedition.khronos.egl.EGLDisplay eGLDisplay2 = this.f52349c;
            if (eGLDisplay2 != null) {
                this.f52348b.eglTerminate(eGLDisplay2);
                this.f52349c = null;
            }
        }

        public static void a(java.lang.String str) {
            throw new java.lang.RuntimeException(c(str));
        }

        public static void a(java.lang.String str, java.lang.String str2) {
            c(str2);
        }

        private void b(java.lang.String str) {
            this.f52348b.eglGetError();
            a(str);
        }

        private static java.lang.String c(java.lang.String str) {
            return str + " failed: ";
        }
    }

    private ua(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52325h = -1;
        this.f52327s = new java.lang.ref.WeakReference<>(this);
        d();
    }

    public final void a(com.tencent.mapsdk.internal.ua.m mVar, float f17) {
        i();
        if (this.f52330v == null) {
            this.f52330v = new com.tencent.mapsdk.internal.ua.n(true);
        }
        byte b17 = 0;
        if (this.f52331w == null) {
            this.f52331w = new com.tencent.mapsdk.internal.ua.c(this, b17);
        }
        if (this.f52332x == null) {
            this.f52332x = new com.tencent.mapsdk.internal.ua.d(b17);
        }
        this.f52328t = mVar;
        com.tencent.mapsdk.internal.ua.i iVar = new com.tencent.mapsdk.internal.ua.i(this.f52327s);
        this.f52326i = iVar;
        iVar.a(f17);
        this.f52326i.start();
    }

    /* loaded from: classes13.dex */
    public abstract class a implements com.tencent.mapsdk.internal.ua.e {

        /* renamed from: a, reason: collision with root package name */
        protected int[] f52335a;

        public a(int[] iArr, boolean z17) {
            if (z17) {
                int[] iArr2 = new int[17];
                java.lang.System.arraycopy(iArr, 0, iArr2, 0, 12);
                iArr2[12] = 12338;
                iArr2[13] = 1;
                iArr2[14] = 12337;
                iArr2[15] = 4;
                iArr2[16] = 12344;
                iArr = iArr2;
            }
            if (com.tencent.mapsdk.internal.ua.this.A == 2) {
                int length = iArr.length;
                int[] iArr3 = new int[length + 2];
                int i17 = length - 1;
                java.lang.System.arraycopy(iArr, 0, iArr3, 0, i17);
                iArr3[i17] = 12352;
                iArr3[length] = 4;
                iArr3[length + 1] = 12344;
                iArr = iArr3;
            }
            this.f52335a = iArr;
        }

        private static int[] a(int[] iArr) {
            int length = iArr.length;
            int[] iArr2 = new int[length + 4];
            int i17 = length - 1;
            java.lang.System.arraycopy(iArr, 0, iArr2, 0, i17);
            iArr2[i17] = 12338;
            iArr2[length] = 1;
            iArr2[length + 1] = 12337;
            iArr2[length + 2] = 4;
            iArr2[length + 3] = 12344;
            return iArr2;
        }

        private int[] b(int[] iArr) {
            if (com.tencent.mapsdk.internal.ua.this.A != 2) {
                return iArr;
            }
            int length = iArr.length;
            int[] iArr2 = new int[length + 2];
            int i17 = length - 1;
            java.lang.System.arraycopy(iArr, 0, iArr2, 0, i17);
            iArr2[i17] = 12352;
            iArr2[length] = 4;
            iArr2[length + 1] = 12344;
            return iArr2;
        }

        public abstract javax.microedition.khronos.egl.EGLConfig a(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay, javax.microedition.khronos.egl.EGLConfig[] eGLConfigArr);

        @Override // com.tencent.mapsdk.internal.ua.e
        public final javax.microedition.khronos.egl.EGLConfig a(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay) {
            int[] iArr = new int[1];
            if (!egl10.eglChooseConfig(eGLDisplay, this.f52335a, null, 0, iArr)) {
                throw new java.lang.IllegalArgumentException("eglChooseConfig failed");
            }
            int i17 = iArr[0];
            if (i17 > 0) {
                javax.microedition.khronos.egl.EGLConfig[] eGLConfigArr = new javax.microedition.khronos.egl.EGLConfig[i17];
                if (egl10.eglChooseConfig(eGLDisplay, this.f52335a, eGLConfigArr, i17, iArr)) {
                    javax.microedition.khronos.egl.EGLConfig a17 = a(egl10, eGLDisplay, eGLConfigArr);
                    if (a17 != null) {
                        return a17;
                    }
                    throw new java.lang.IllegalArgumentException("No config chosen");
                }
                throw new java.lang.IllegalArgumentException("eglChooseConfig#2 failed");
            }
            throw new java.lang.IllegalArgumentException("No configs match configSpec");
        }
    }

    /* loaded from: classes13.dex */
    public class b extends com.tencent.mapsdk.internal.ua.a {

        /* renamed from: c, reason: collision with root package name */
        protected int f52337c;

        /* renamed from: d, reason: collision with root package name */
        protected int f52338d;

        /* renamed from: e, reason: collision with root package name */
        protected int f52339e;

        /* renamed from: f, reason: collision with root package name */
        protected int f52340f;

        /* renamed from: g, reason: collision with root package name */
        protected int f52341g;

        /* renamed from: h, reason: collision with root package name */
        protected int f52342h;

        /* renamed from: j, reason: collision with root package name */
        private int[] f52344j;

        public b(int i17, int i18, int i19) {
            super(new int[]{12324, 8, 12323, 8, 12322, 8, 12321, i17, 12325, i18, 12326, i19, 12344}, com.tencent.mapsdk.internal.ua.this.f52324g);
            this.f52344j = new int[1];
            this.f52337c = 8;
            this.f52338d = 8;
            this.f52339e = 8;
            this.f52340f = i17;
            this.f52341g = i18;
            this.f52342h = i19;
        }

        @Override // com.tencent.mapsdk.internal.ua.a
        public final javax.microedition.khronos.egl.EGLConfig a(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay, javax.microedition.khronos.egl.EGLConfig[] eGLConfigArr) {
            for (javax.microedition.khronos.egl.EGLConfig eGLConfig : eGLConfigArr) {
                int a17 = a(egl10, eGLDisplay, eGLConfig, 12325);
                int a18 = a(egl10, eGLDisplay, eGLConfig, 12326);
                if (a17 >= this.f52341g && a18 >= this.f52342h) {
                    int a19 = a(egl10, eGLDisplay, eGLConfig, 12324);
                    int a27 = a(egl10, eGLDisplay, eGLConfig, 12323);
                    int a28 = a(egl10, eGLDisplay, eGLConfig, 12322);
                    int a29 = a(egl10, eGLDisplay, eGLConfig, 12321);
                    if (a19 == this.f52337c && a27 == this.f52338d && a28 == this.f52339e && a29 == this.f52340f) {
                        return eGLConfig;
                    }
                }
            }
            return null;
        }

        private int a(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay, javax.microedition.khronos.egl.EGLConfig eGLConfig, int i17) {
            if (egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i17, this.f52344j)) {
                return this.f52344j[0];
            }
            return 0;
        }
    }

    public void a() {
        this.f52326i.e();
    }

    private void a(java.lang.Runnable runnable) {
        com.tencent.mapsdk.internal.ua.i iVar = this.f52326i;
        if (runnable != null) {
            com.tencent.mapsdk.internal.ua.j jVar = f52323r;
            synchronized (jVar) {
                iVar.f52366n.add(runnable);
                jVar.notifyAll();
            }
            return;
        }
        throw new java.lang.IllegalArgumentException("r must not be null");
    }
}
