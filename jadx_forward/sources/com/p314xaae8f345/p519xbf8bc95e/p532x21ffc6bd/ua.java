package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public class ua extends android.view.SurfaceView implements android.view.SurfaceHolder.Callback {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f133842a = "tms-gl";

    /* renamed from: b, reason: collision with root package name */
    public static final int f133843b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f133844c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f133845d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f133846e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f133847f = 60;

    /* renamed from: j, reason: collision with root package name */
    private static final java.lang.String f133848j = "GLSurfaceView";

    /* renamed from: k, reason: collision with root package name */
    private static final boolean f133849k = false;

    /* renamed from: l, reason: collision with root package name */
    private static final boolean f133850l = false;

    /* renamed from: m, reason: collision with root package name */
    private static final boolean f133851m = false;

    /* renamed from: n, reason: collision with root package name */
    private static final boolean f133852n = false;

    /* renamed from: o, reason: collision with root package name */
    private static final boolean f133853o = false;

    /* renamed from: p, reason: collision with root package name */
    private static final boolean f133854p = true;

    /* renamed from: q, reason: collision with root package name */
    private static final boolean f133855q = false;

    /* renamed from: r, reason: collision with root package name */
    private static final com.tencent.mapsdk.internal.ua.j f133856r = new com.tencent.mapsdk.internal.ua.j(0);
    private int A;
    private boolean B;

    /* renamed from: g, reason: collision with root package name */
    protected boolean f133857g;

    /* renamed from: h, reason: collision with root package name */
    protected int f133858h;

    /* renamed from: i, reason: collision with root package name */
    com.tencent.mapsdk.internal.ua.i f133859i;

    /* renamed from: s, reason: collision with root package name */
    private final java.lang.ref.WeakReference<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua> f133860s;

    /* renamed from: t, reason: collision with root package name */
    private com.tencent.mapsdk.internal.ua.m f133861t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f133862u;

    /* renamed from: v, reason: collision with root package name */
    private com.tencent.mapsdk.internal.ua.e f133863v;

    /* renamed from: w, reason: collision with root package name */
    private com.tencent.mapsdk.internal.ua.f f133864w;

    /* renamed from: x, reason: collision with root package name */
    private com.tencent.mapsdk.internal.ua.g f133865x;

    /* renamed from: y, reason: collision with root package name */
    private com.tencent.mapsdk.internal.ua.k f133866y;

    /* renamed from: z, reason: collision with root package name */
    private int f133867z;

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
        boolean f133886a;

        /* renamed from: b, reason: collision with root package name */
        boolean f133887b;

        /* renamed from: c, reason: collision with root package name */
        boolean f133888c;

        /* renamed from: d, reason: collision with root package name */
        boolean f133889d;

        /* renamed from: e, reason: collision with root package name */
        boolean f133890e;

        /* renamed from: f, reason: collision with root package name */
        boolean f133891f;

        /* renamed from: g, reason: collision with root package name */
        boolean f133892g;

        /* renamed from: h, reason: collision with root package name */
        boolean f133893h;

        /* renamed from: m, reason: collision with root package name */
        boolean f133898m;

        /* renamed from: p, reason: collision with root package name */
        private long f133901p;

        /* renamed from: q, reason: collision with root package name */
        private boolean f133902q;

        /* renamed from: r, reason: collision with root package name */
        private boolean f133903r;

        /* renamed from: s, reason: collision with root package name */
        private boolean f133904s;

        /* renamed from: u, reason: collision with root package name */
        private com.tencent.mapsdk.internal.ua.h f133906u;

        /* renamed from: v, reason: collision with root package name */
        private java.lang.ref.WeakReference<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua> f133907v;

        /* renamed from: n, reason: collision with root package name */
        java.util.ArrayList<java.lang.Runnable> f133899n = new java.util.ArrayList<>();

        /* renamed from: o, reason: collision with root package name */
        boolean f133900o = true;

        /* renamed from: t, reason: collision with root package name */
        private float f133905t = 60.0f;

        /* renamed from: i, reason: collision with root package name */
        int f133894i = 0;

        /* renamed from: j, reason: collision with root package name */
        int f133895j = 0;

        /* renamed from: l, reason: collision with root package name */
        boolean f133897l = true;

        /* renamed from: k, reason: collision with root package name */
        int f133896k = 1;

        public i(java.lang.ref.WeakReference<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua> weakReference) {
            this.f133907v = weakReference;
            setName(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.a("SV"));
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(g()).c(com.tencent.mapsdk.internal.la.a.f131799g, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.a("SV") + " create");
        }

        public static /* synthetic */ boolean a(com.tencent.mapsdk.internal.ua.i iVar) {
            iVar.f133886a = true;
            return true;
        }

        private void h() {
            if (this.f133891f) {
                this.f133891f = false;
                this.f133906u.a();
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(g()).c(com.tencent.mapsdk.internal.la.a.f131799g, "stopEglSurfaceLocked");
            }
        }

        private void i() {
            if (this.f133890e) {
                this.f133906u.b();
                this.f133890e = false;
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.f133856r.c(this);
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(g()).c(com.tencent.mapsdk.internal.la.a.f131799g, "stopEglContextLocked");
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
            return this.f133890e && this.f133891f && a();
        }

        private void l() {
            synchronized (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.f133856r) {
                this.f133888c = true;
                this.f133892g = false;
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.f133856r.notifyAll();
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(g()).c(com.tencent.mapsdk.internal.la.a.f131799g, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.a("SV") + " surfaceCreated begin, wait: " + this.f133889d + ", finish: " + this.f133892g + ", exit: " + this.f133886a);
                while (this.f133889d && !this.f133892g && !this.f133886a) {
                    try {
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.f133856r.wait();
                    } catch (java.lang.InterruptedException e17) {
                        java.lang.Thread.currentThread().interrupt();
                        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(g()).e(com.tencent.mapsdk.internal.la.a.f131799g, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.a("SV") + " surfaceCreated exception", e17);
                    }
                }
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(g()).c(com.tencent.mapsdk.internal.la.a.f131799g, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.a("SV") + " surfaceCreated end");
            }
        }

        private void m() {
            synchronized (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.f133856r) {
                this.f133888c = false;
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.f133856r.notifyAll();
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(g()).c(com.tencent.mapsdk.internal.la.a.f131799g, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.a("SV") + " surfaceDestroyed begin, wait: " + this.f133889d + ", exit: " + this.f133886a);
                while (!this.f133889d && !this.f133886a) {
                    try {
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.f133856r.wait();
                    } catch (java.lang.InterruptedException e17) {
                        java.lang.Thread.currentThread().interrupt();
                        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(g()).e(com.tencent.mapsdk.internal.la.a.f131799g, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.a("SV") + " surfaceDestroyed exception", e17);
                    }
                }
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(g()).c(com.tencent.mapsdk.internal.la.a.f131799g, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.a("SV") + " surfaceDestroyed end");
            }
        }

        private void n() {
            synchronized (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.f133856r) {
                this.f133893h = true;
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.f133856r.notifyAll();
            }
        }

        public final int b() {
            int i17;
            synchronized (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.f133856r) {
                i17 = this.f133896k;
            }
            return i17;
        }

        public final void c() {
            synchronized (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.f133856r) {
                this.f133897l = true;
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.f133856r.notifyAll();
            }
        }

        public final void d() {
            synchronized (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.f133856r) {
                this.f133903r = true;
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.f133856r.notifyAll();
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(g()).c(com.tencent.mapsdk.internal.la.a.f131799g, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.a("SV") + " pause begin, exit: " + this.f133886a + ", pause: " + this.f133887b);
                while (!this.f133886a && !this.f133887b) {
                    try {
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.f133856r.wait();
                    } catch (java.lang.InterruptedException e17) {
                        java.lang.Thread.currentThread().interrupt();
                        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(g()).e(com.tencent.mapsdk.internal.la.a.f131799g, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.a("SV") + " pause exception", e17);
                    }
                }
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(g()).c(com.tencent.mapsdk.internal.la.a.f131799g, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.a("SV") + " pause end");
            }
        }

        public final void e() {
            synchronized (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.f133856r) {
                this.f133903r = false;
                this.f133897l = true;
                this.f133898m = false;
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.f133856r.notifyAll();
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(g()).c(com.tencent.mapsdk.internal.la.a.f131799g, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.a("SV") + " resume begin, exit: " + this.f133886a + ", pause: " + this.f133887b + ", render: " + this.f133898m);
                while (!this.f133886a && this.f133887b && !this.f133898m) {
                    try {
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.f133856r.wait();
                    } catch (java.lang.InterruptedException e17) {
                        java.lang.Thread.currentThread().interrupt();
                        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(g()).e(com.tencent.mapsdk.internal.la.a.f131799g, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.a("SV") + " resume exception", e17);
                    }
                }
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(g()).c(com.tencent.mapsdk.internal.la.a.f131799g, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.a("SV") + " resume end");
            }
        }

        public final void f() {
            synchronized (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.f133856r) {
                this.f133902q = true;
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.f133856r.notifyAll();
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(g()).c(com.tencent.mapsdk.internal.la.a.f131799g, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.a("SV") + " requestExitAndWait begin, exit: " + this.f133886a);
                while (!this.f133886a) {
                    try {
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.f133856r.wait();
                    } catch (java.lang.InterruptedException unused) {
                        java.lang.Thread.currentThread().interrupt();
                    }
                }
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(g()).c(com.tencent.mapsdk.internal.la.a.f131799g, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.a("SV") + " requestExitAndWait end");
            }
        }

        public final int g() {
            java.lang.ref.WeakReference<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua> weakReference = this.f133907v;
            if (weakReference == null || weakReference.get() == null) {
                return -1;
            }
            return this.f133907v.get().m37044x74cb6de1();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(g()).c(com.tencent.mapsdk.internal.la.a.f131799g, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.a("SV") + " start");
            try {
                try {
                    j();
                } catch (java.lang.InterruptedException unused) {
                    java.lang.Thread.currentThread().interrupt();
                }
            } finally {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.f133856r.a(this);
            }
        }

        public final boolean a() {
            if (this.f133887b || !this.f133888c || this.f133904s || this.f133894i <= 0 || this.f133895j <= 0) {
                return false;
            }
            return this.f133897l || this.f133896k == 1;
        }

        private void a(int i17) {
            if (i17 >= 0 && i17 <= 1) {
                synchronized (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.f133856r) {
                    this.f133896k = i17;
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.f133856r.notifyAll();
                }
                return;
            }
            throw new java.lang.IllegalArgumentException("renderMode");
        }

        private void a(int i17, int i18) {
            synchronized (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.f133856r) {
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(g()).c(com.tencent.mapsdk.internal.la.a.f131799g, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.a("SV") + " onWindowResize try begin, width: " + this.f133894i + ", height: " + this.f133895j);
                if (this.f133894i == i17 && this.f133895j == i18) {
                    this.f133900o = false;
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.f133856r.notifyAll();
                    return;
                }
                this.f133894i = i17;
                this.f133895j = i18;
                this.f133900o = true;
                this.f133897l = true;
                this.f133898m = false;
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.f133856r.notifyAll();
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(g()).c(com.tencent.mapsdk.internal.la.a.f131799g, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.a("SV") + " onWindowResize begin, exit: " + this.f133886a + ", pause: " + this.f133887b + ", render: " + this.f133898m);
                while (!this.f133886a && !this.f133887b && !this.f133898m) {
                    if (!(this.f133890e && this.f133891f && a())) {
                        break;
                    }
                    try {
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.f133856r.wait();
                    } catch (java.lang.InterruptedException e17) {
                        java.lang.Thread.currentThread().interrupt();
                        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(g()).e(com.tencent.mapsdk.internal.la.a.f131799g, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.a("SV") + " onWindowResize exception", e17);
                    }
                }
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(g()).c(com.tencent.mapsdk.internal.la.a.f131799g, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.a("SV") + " onWindowResize end");
            }
        }

        private void a(java.lang.Runnable runnable) {
            if (runnable != null) {
                synchronized (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.f133856r) {
                    this.f133899n.add(runnable);
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.f133856r.notifyAll();
                }
                return;
            }
            throw new java.lang.IllegalArgumentException("r must not be null");
        }

        public final void a(float f17) {
            if (f17 <= 1.0f) {
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.e(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131745m, "帧率设置不在有效值范围内");
            } else {
                this.f133905t = f17;
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
        private java.lang.StringBuilder f133917a = new java.lang.StringBuilder();

        private void a() {
            if (this.f133917a.length() > 0) {
                this.f133917a.toString();
                java.lang.StringBuilder sb6 = this.f133917a;
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
                    this.f133917a.append(c17);
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
        this.f133858h = -1;
        this.f133860s = new java.lang.ref.WeakReference<>(this);
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getMapId */
    public int m37044x74cb6de1() {
        return this.f133858h;
    }

    public void b() {
        this.f133859i.d();
    }

    /* renamed from: finalize */
    public void m37045xd764dc1e() {
        try {
            com.tencent.mapsdk.internal.ua.i iVar = this.f133859i;
            if (iVar != null) {
                iVar.f();
            }
        } finally {
            super.finalize();
        }
    }

    /* renamed from: getDebugFlags */
    public int m37046x7f2d1bea() {
        return this.f133867z;
    }

    /* renamed from: getPreserveEGLContextOnPause */
    public boolean m37047x5a1df1b0() {
        return this.B;
    }

    /* renamed from: getRenderMode */
    public int m37048x3569ec4f() {
        return this.f133859i.b();
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f133862u) {
            this.f133859i.e();
        }
        this.f133862u = false;
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        com.tencent.mapsdk.internal.ua.i iVar = this.f133859i;
        if (iVar != null) {
            iVar.d();
        }
        this.f133862u = true;
        super.onDetachedFromWindow();
    }

    /* renamed from: setDebugFlags */
    public void m37049xad5169f6(int i17) {
        this.f133867z = i17;
    }

    /* renamed from: setEGLConfigChooser */
    public void m37050x81a19c31(com.tencent.mapsdk.internal.ua.e eVar) {
        i();
        this.f133863v = eVar;
    }

    /* renamed from: setEGLContextClientVersion */
    public void m37052xdbab8186(int i17) {
        i();
        this.A = i17;
    }

    /* renamed from: setEGLContextFactory */
    public void m37053xa172aac3(com.tencent.mapsdk.internal.ua.f fVar) {
        i();
        this.f133864w = fVar;
    }

    /* renamed from: setEGLWindowSurfaceFactory */
    public void m37054xd8b55015(com.tencent.mapsdk.internal.ua.g gVar) {
        i();
        this.f133865x = gVar;
    }

    /* renamed from: setGLWrapper */
    public void m37055x9c7549cc(com.tencent.mapsdk.internal.ua.k kVar) {
        this.f133866y = kVar;
    }

    /* renamed from: setPreserveEGLContextOnPause */
    public void m37056xa3ea4a24(boolean z17) {
        this.B = z17;
    }

    /* renamed from: setRenderMode */
    public void m37057x638e3a5b(int i17) {
        com.tencent.mapsdk.internal.ua.i iVar = this.f133859i;
        if (i17 < 0 || i17 > 1) {
            throw new java.lang.IllegalArgumentException("renderMode");
        }
        com.tencent.mapsdk.internal.ua.j jVar = f133856r;
        synchronized (jVar) {
            iVar.f133896k = i17;
            jVar.notifyAll();
        }
    }

    /* renamed from: setRenderer */
    public void m37058x5913df45(com.tencent.mapsdk.internal.ua.m mVar) {
        a(mVar, 60.0f);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i17, int i18, int i19) {
        com.tencent.mapsdk.internal.ua.i iVar = this.f133859i;
        com.tencent.mapsdk.internal.ua.j jVar = f133856r;
        synchronized (jVar) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(iVar.g()).c(com.tencent.mapsdk.internal.la.a.f131799g, a("SV") + " onWindowResize try begin, width: " + iVar.f133894i + ", height: " + iVar.f133895j);
            if (iVar.f133894i == i18 && iVar.f133895j == i19) {
                iVar.f133900o = false;
                jVar.notifyAll();
                return;
            }
            iVar.f133894i = i18;
            iVar.f133895j = i19;
            iVar.f133900o = true;
            iVar.f133897l = true;
            iVar.f133898m = false;
            jVar.notifyAll();
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(iVar.g()).c(com.tencent.mapsdk.internal.la.a.f131799g, a("SV") + " onWindowResize begin, exit: " + iVar.f133886a + ", pause: " + iVar.f133887b + ", render: " + iVar.f133898m);
            while (!iVar.f133886a && !iVar.f133887b && !iVar.f133898m) {
                if (!(iVar.f133890e && iVar.f133891f && iVar.a())) {
                    break;
                }
                try {
                    f133856r.wait();
                } catch (java.lang.InterruptedException e17) {
                    java.lang.Thread.currentThread().interrupt();
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(iVar.g()).e(com.tencent.mapsdk.internal.la.a.f131799g, a("SV") + " onWindowResize exception", e17);
                }
            }
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(iVar.g()).c(com.tencent.mapsdk.internal.la.a.f131799g, a("SV") + " onWindowResize end");
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
        com.tencent.mapsdk.internal.ua.i iVar = this.f133859i;
        com.tencent.mapsdk.internal.ua.j jVar = f133856r;
        synchronized (jVar) {
            iVar.f133888c = true;
            iVar.f133892g = false;
            jVar.notifyAll();
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(iVar.g()).c(com.tencent.mapsdk.internal.la.a.f131799g, a("SV") + " surfaceCreated begin, wait: " + iVar.f133889d + ", finish: " + iVar.f133892g + ", exit: " + iVar.f133886a);
            while (iVar.f133889d && !iVar.f133892g && !iVar.f133886a) {
                try {
                    f133856r.wait();
                } catch (java.lang.InterruptedException e17) {
                    java.lang.Thread.currentThread().interrupt();
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(iVar.g()).e(com.tencent.mapsdk.internal.la.a.f131799g, a("SV") + " surfaceCreated exception", e17);
                }
            }
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(iVar.g()).c(com.tencent.mapsdk.internal.la.a.f131799g, a("SV") + " surfaceCreated end");
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
        com.tencent.mapsdk.internal.ua.i iVar = this.f133859i;
        com.tencent.mapsdk.internal.ua.j jVar = f133856r;
        synchronized (jVar) {
            iVar.f133888c = false;
            jVar.notifyAll();
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(iVar.g()).c(com.tencent.mapsdk.internal.la.a.f131799g, a("SV") + " surfaceDestroyed begin, wait: " + iVar.f133889d + ", exit: " + iVar.f133886a);
            while (!iVar.f133889d && !iVar.f133886a) {
                try {
                    f133856r.wait();
                } catch (java.lang.InterruptedException e17) {
                    java.lang.Thread.currentThread().interrupt();
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(iVar.g()).e(com.tencent.mapsdk.internal.la.a.f131799g, a("SV") + " surfaceDestroyed exception", e17);
                }
            }
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(iVar.g()).c(com.tencent.mapsdk.internal.la.a.f131799g, a("SV") + " surfaceDestroyed end");
        }
    }

    /* loaded from: classes13.dex */
    public class c implements com.tencent.mapsdk.internal.ua.f {

        /* renamed from: b, reason: collision with root package name */
        private int f133879b;

        private c() {
            this.f133879b = 12440;
        }

        @Override // com.tencent.mapsdk.internal.ua.f
        public final javax.microedition.khronos.egl.EGLContext a(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay, javax.microedition.khronos.egl.EGLConfig eGLConfig) {
            int[] iArr = {this.f133879b, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.this.A, 12344};
            javax.microedition.khronos.egl.EGLContext eGLContext = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT;
            if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.this.A == 0) {
                iArr = null;
            }
            return egl10.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
        }

        public /* synthetic */ c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua uaVar, byte b17) {
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
        return this.f133857g;
    }

    private void f() {
        m37050x81a19c31(new com.tencent.mapsdk.internal.ua.b(8, 16, 8));
    }

    private void h() {
        this.f133859i.c();
    }

    private void i() {
        if (this.f133859i != null) {
            throw new java.lang.IllegalStateException("setRenderer has already been called for this instance.");
        }
    }

    public void c() {
        com.tencent.mapsdk.internal.ua.i iVar = this.f133859i;
        if (iVar != null) {
            iVar.f();
        }
    }

    public final void a(float f17) {
        com.tencent.mapsdk.internal.ua.i iVar = this.f133859i;
        if (iVar != null) {
            iVar.a(f17);
            this.f133859i.c();
        }
    }

    /* renamed from: setEGLConfigChooser */
    public void m37051x81a19c31(boolean z17) {
        m37050x81a19c31(new com.tencent.mapsdk.internal.ua.n(z17));
    }

    /* loaded from: classes13.dex */
    public static class j {

        /* renamed from: a, reason: collision with root package name */
        private static java.lang.String f133908a = "GLThreadManager";

        /* renamed from: g, reason: collision with root package name */
        private static final int f133909g = 131072;

        /* renamed from: h, reason: collision with root package name */
        private static final java.lang.String f133910h = "Q3Dimension MSM7500 ";

        /* renamed from: b, reason: collision with root package name */
        private boolean f133911b;

        /* renamed from: c, reason: collision with root package name */
        private int f133912c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f133913d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f133914e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f133915f;

        /* renamed from: i, reason: collision with root package name */
        private com.tencent.mapsdk.internal.ua.i f133916i;

        private j() {
        }

        public /* synthetic */ j(byte b17) {
            this();
        }

        public final synchronized void a(com.tencent.mapsdk.internal.ua.i iVar) {
            com.tencent.mapsdk.internal.ua.i.a(iVar);
            if (this.f133916i == iVar) {
                this.f133916i = null;
            }
            notifyAll();
        }

        public final synchronized boolean b(com.tencent.mapsdk.internal.ua.i iVar) {
            com.tencent.mapsdk.internal.ua.i iVar2 = this.f133916i;
            if (iVar2 != iVar && iVar2 != null) {
                c();
                if (this.f133914e) {
                    return true;
                }
                com.tencent.mapsdk.internal.ua.i iVar3 = this.f133916i;
                if (iVar3 != null) {
                    synchronized (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.f133856r) {
                        iVar3.f133893h = true;
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.f133856r.notifyAll();
                    }
                }
                return false;
            }
            this.f133916i = iVar;
            notifyAll();
            return true;
        }

        public final synchronized void c(com.tencent.mapsdk.internal.ua.i iVar) {
            if (this.f133916i == iVar) {
                this.f133916i = null;
            }
            notifyAll();
        }

        private void c() {
            if (this.f133911b) {
                return;
            }
            this.f133912c = 131072;
            this.f133914e = true;
            this.f133911b = true;
        }

        public final synchronized boolean a() {
            return this.f133915f;
        }

        public final synchronized void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (!this.f133913d) {
                c();
                java.lang.String glGetString = gl10.glGetString(7937);
                if (this.f133912c < 131072) {
                    this.f133914e = !glGetString.startsWith(f133910h);
                    notifyAll();
                }
                this.f133915f = this.f133914e ? false : true;
                this.f133913d = true;
            }
        }

        public final synchronized boolean b() {
            c();
            return !this.f133914e;
        }
    }

    /* loaded from: classes13.dex */
    public static class h {

        /* renamed from: a, reason: collision with root package name */
        java.lang.ref.WeakReference<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua> f133880a;

        /* renamed from: b, reason: collision with root package name */
        javax.microedition.khronos.egl.EGL10 f133881b;

        /* renamed from: c, reason: collision with root package name */
        javax.microedition.khronos.egl.EGLDisplay f133882c;

        /* renamed from: d, reason: collision with root package name */
        javax.microedition.khronos.egl.EGLSurface f133883d;

        /* renamed from: e, reason: collision with root package name */
        javax.microedition.khronos.egl.EGLConfig f133884e;

        /* renamed from: f, reason: collision with root package name */
        javax.microedition.khronos.egl.EGLContext f133885f;

        public h(java.lang.ref.WeakReference<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua> weakReference) {
            this.f133880a = weakReference;
        }

        private void c() {
            javax.microedition.khronos.egl.EGL10 egl10 = (javax.microedition.khronos.egl.EGL10) javax.microedition.khronos.egl.EGLContext.getEGL();
            this.f133881b = egl10;
            javax.microedition.khronos.egl.EGLDisplay eglGetDisplay = egl10.eglGetDisplay(javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY);
            this.f133882c = eglGetDisplay;
            if (eglGetDisplay != javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY) {
                if (this.f133881b.eglInitialize(eglGetDisplay, new int[2])) {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua uaVar = this.f133880a.get();
                    if (uaVar != null) {
                        this.f133884e = uaVar.f133863v.a(this.f133881b, this.f133882c);
                        this.f133885f = uaVar.f133864w.a(this.f133881b, this.f133882c, this.f133884e);
                    } else {
                        this.f133884e = null;
                        this.f133885f = null;
                    }
                    javax.microedition.khronos.egl.EGLContext eGLContext = this.f133885f;
                    if (eGLContext == null || eGLContext == javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT) {
                        this.f133885f = null;
                        this.f133881b.eglGetError();
                        a("createContext");
                    }
                    this.f133883d = null;
                    return;
                }
                throw new java.lang.RuntimeException("eglInitialize failed");
            }
            throw new java.lang.RuntimeException("eglGetDisplay failed");
        }

        private boolean d() {
            if (this.f133881b == null) {
                throw new java.lang.RuntimeException("egl not initialized");
            }
            if (this.f133882c == null) {
                throw new java.lang.RuntimeException("eglDisplay not initialized");
            }
            if (this.f133884e == null) {
                throw new java.lang.RuntimeException("mEglConfig not initialized");
            }
            a();
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua uaVar = this.f133880a.get();
            if (uaVar != null) {
                this.f133883d = uaVar.f133865x.a(this.f133881b, this.f133882c, this.f133884e, uaVar.getHolder());
            } else {
                this.f133883d = null;
            }
            javax.microedition.khronos.egl.EGLSurface eGLSurface = this.f133883d;
            if (eGLSurface == null || eGLSurface == javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE) {
                this.f133881b.eglGetError();
                return false;
            }
            if (this.f133881b.eglMakeCurrent(this.f133882c, eGLSurface, eGLSurface, this.f133885f)) {
                return true;
            }
            this.f133881b.eglGetError();
            a("EGLHelper", "eglMakeCurrent");
            return false;
        }

        private javax.microedition.khronos.opengles.GL e() {
            javax.microedition.khronos.opengles.GL gl6 = this.f133885f.getGL();
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua uaVar = this.f133880a.get();
            if (uaVar == null) {
                return gl6;
            }
            if (uaVar.f133866y != null) {
                gl6 = uaVar.f133866y.a();
            }
            if ((uaVar.f133867z & 3) != 0) {
                return android.opengl.GLDebugHelper.wrap(gl6, (uaVar.f133867z & 1) == 0 ? 0 : 1, (uaVar.f133867z & 2) != 0 ? new com.tencent.mapsdk.internal.ua.l() : null);
            }
            return gl6;
        }

        private int f() {
            if (this.f133881b.eglSwapBuffers(this.f133882c, this.f133883d)) {
                return 12288;
            }
            return this.f133881b.eglGetError();
        }

        private void g() {
            a();
        }

        public final void a() {
            javax.microedition.khronos.egl.EGLSurface eGLSurface;
            javax.microedition.khronos.egl.EGLSurface eGLSurface2 = this.f133883d;
            if (eGLSurface2 == null || eGLSurface2 == (eGLSurface = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE)) {
                return;
            }
            this.f133881b.eglMakeCurrent(this.f133882c, eGLSurface, eGLSurface, javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT);
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua uaVar = this.f133880a.get();
            if (uaVar != null) {
                uaVar.f133865x.a(this.f133881b, this.f133882c, this.f133883d);
            }
            this.f133883d = null;
        }

        public final void b() {
            if (this.f133885f != null) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua uaVar = this.f133880a.get();
                if (uaVar != null) {
                    try {
                        javax.microedition.khronos.egl.EGL10 egl10 = this.f133881b;
                        javax.microedition.khronos.egl.EGLDisplay eGLDisplay = this.f133882c;
                        javax.microedition.khronos.egl.EGLSurface eGLSurface = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
                        if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f133885f)) {
                            android.opengl.GLUtils.getEGLErrorString(this.f133881b.eglGetError());
                        }
                    } catch (java.lang.Exception e17) {
                        android.util.Log.getStackTraceString(e17);
                    }
                    uaVar.f133864w.a(this.f133881b, this.f133882c, this.f133885f);
                }
                this.f133885f = null;
            }
            javax.microedition.khronos.egl.EGLDisplay eGLDisplay2 = this.f133882c;
            if (eGLDisplay2 != null) {
                this.f133881b.eglTerminate(eGLDisplay2);
                this.f133882c = null;
            }
        }

        public static void a(java.lang.String str) {
            throw new java.lang.RuntimeException(c(str));
        }

        public static void a(java.lang.String str, java.lang.String str2) {
            c(str2);
        }

        private void b(java.lang.String str) {
            this.f133881b.eglGetError();
            a(str);
        }

        private static java.lang.String c(java.lang.String str) {
            return str + " failed: ";
        }
    }

    private ua(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f133858h = -1;
        this.f133860s = new java.lang.ref.WeakReference<>(this);
        d();
    }

    public final void a(com.tencent.mapsdk.internal.ua.m mVar, float f17) {
        i();
        if (this.f133863v == null) {
            this.f133863v = new com.tencent.mapsdk.internal.ua.n(true);
        }
        byte b17 = 0;
        if (this.f133864w == null) {
            this.f133864w = new com.tencent.mapsdk.internal.ua.c(this, b17);
        }
        if (this.f133865x == null) {
            this.f133865x = new com.tencent.mapsdk.internal.ua.d(b17);
        }
        this.f133861t = mVar;
        com.tencent.mapsdk.internal.ua.i iVar = new com.tencent.mapsdk.internal.ua.i(this.f133860s);
        this.f133859i = iVar;
        iVar.a(f17);
        this.f133859i.start();
    }

    /* loaded from: classes13.dex */
    public abstract class a implements com.tencent.mapsdk.internal.ua.e {

        /* renamed from: a, reason: collision with root package name */
        protected int[] f133868a;

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
            if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.this.A == 2) {
                int length = iArr.length;
                int[] iArr3 = new int[length + 2];
                int i17 = length - 1;
                java.lang.System.arraycopy(iArr, 0, iArr3, 0, i17);
                iArr3[i17] = 12352;
                iArr3[length] = 4;
                iArr3[length + 1] = 12344;
                iArr = iArr3;
            }
            this.f133868a = iArr;
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
            if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.this.A != 2) {
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
            if (!egl10.eglChooseConfig(eGLDisplay, this.f133868a, null, 0, iArr)) {
                throw new java.lang.IllegalArgumentException("eglChooseConfig failed");
            }
            int i17 = iArr[0];
            if (i17 > 0) {
                javax.microedition.khronos.egl.EGLConfig[] eGLConfigArr = new javax.microedition.khronos.egl.EGLConfig[i17];
                if (egl10.eglChooseConfig(eGLDisplay, this.f133868a, eGLConfigArr, i17, iArr)) {
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
        protected int f133870c;

        /* renamed from: d, reason: collision with root package name */
        protected int f133871d;

        /* renamed from: e, reason: collision with root package name */
        protected int f133872e;

        /* renamed from: f, reason: collision with root package name */
        protected int f133873f;

        /* renamed from: g, reason: collision with root package name */
        protected int f133874g;

        /* renamed from: h, reason: collision with root package name */
        protected int f133875h;

        /* renamed from: j, reason: collision with root package name */
        private int[] f133877j;

        public b(int i17, int i18, int i19) {
            super(new int[]{12324, 8, 12323, 8, 12322, 8, 12321, i17, 12325, i18, 12326, i19, 12344}, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.this.f133857g);
            this.f133877j = new int[1];
            this.f133870c = 8;
            this.f133871d = 8;
            this.f133872e = 8;
            this.f133873f = i17;
            this.f133874g = i18;
            this.f133875h = i19;
        }

        @Override // com.tencent.mapsdk.internal.ua.a
        public final javax.microedition.khronos.egl.EGLConfig a(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay, javax.microedition.khronos.egl.EGLConfig[] eGLConfigArr) {
            for (javax.microedition.khronos.egl.EGLConfig eGLConfig : eGLConfigArr) {
                int a17 = a(egl10, eGLDisplay, eGLConfig, 12325);
                int a18 = a(egl10, eGLDisplay, eGLConfig, 12326);
                if (a17 >= this.f133874g && a18 >= this.f133875h) {
                    int a19 = a(egl10, eGLDisplay, eGLConfig, 12324);
                    int a27 = a(egl10, eGLDisplay, eGLConfig, 12323);
                    int a28 = a(egl10, eGLDisplay, eGLConfig, 12322);
                    int a29 = a(egl10, eGLDisplay, eGLConfig, 12321);
                    if (a19 == this.f133870c && a27 == this.f133871d && a28 == this.f133872e && a29 == this.f133873f) {
                        return eGLConfig;
                    }
                }
            }
            return null;
        }

        private int a(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay, javax.microedition.khronos.egl.EGLConfig eGLConfig, int i17) {
            if (egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i17, this.f133877j)) {
                return this.f133877j[0];
            }
            return 0;
        }
    }

    public void a() {
        this.f133859i.e();
    }

    private void a(java.lang.Runnable runnable) {
        com.tencent.mapsdk.internal.ua.i iVar = this.f133859i;
        if (runnable != null) {
            com.tencent.mapsdk.internal.ua.j jVar = f133856r;
            synchronized (jVar) {
                iVar.f133899n.add(runnable);
                jVar.notifyAll();
            }
            return;
        }
        throw new java.lang.IllegalArgumentException("r must not be null");
    }
}
