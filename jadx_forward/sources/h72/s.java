package h72;

/* loaded from: classes14.dex */
public class s {

    /* renamed from: r, reason: collision with root package name */
    public static volatile h72.s f360997r;

    /* renamed from: s, reason: collision with root package name */
    public static final java.lang.String f360998s = com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.s0.h().concat("/fdv_");

    /* renamed from: t, reason: collision with root package name */
    public static final java.lang.String f360999t;

    /* renamed from: a, reason: collision with root package name */
    public ei3.m f361000a;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f361002c;

    /* renamed from: o, reason: collision with root package name */
    public final bi3.l f361014o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.u f361015p;

    /* renamed from: q, reason: collision with root package name */
    public final ei3.k f361016q;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f361001b = new java.lang.Object();

    /* renamed from: d, reason: collision with root package name */
    public h72.q f361003d = h72.q.UNINITIALIZED;

    /* renamed from: e, reason: collision with root package name */
    public int f361004e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f361005f = false;

    /* renamed from: g, reason: collision with root package name */
    public int f361006g = 0;

    /* renamed from: h, reason: collision with root package name */
    public boolean f361007h = false;

    /* renamed from: i, reason: collision with root package name */
    public h72.r f361008i = null;

    /* renamed from: j, reason: collision with root package name */
    public int f361009j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f361010k = -1;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f361011l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f361012m = "";

    /* renamed from: n, reason: collision with root package name */
    public final k55.k f361013n = new k55.k(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);

    static {
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.s0.h();
        f360999t = com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.s0.h().concat("/fdv_t_");
    }

    public s() {
        this.f361002c = null;
        ((h81.d) bi3.l.f102538a).getClass();
        this.f361014o = new h81.e();
        this.f361015p = new h72.o(this);
        this.f361016q = new h72.d(this);
        this.f361002c = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("face_video_handler");
    }

    public static void a(h72.s sVar) {
        sVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(f360998s);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(android.os.SystemClock.elapsedRealtime());
        sb6.append(".mp4");
        sVar.f361011l = sb6.toString();
    }

    public static void b(h72.s sVar) {
        sVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(f360999t);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(android.os.SystemClock.elapsedRealtime());
        sb6.append(".thumb");
        sVar.f361012m = sb6.toString();
    }

    public static void c(h72.s sVar) {
        com.p314xaae8f345.mm.vfs.w6.h(sVar.f361011l);
        com.p314xaae8f345.mm.vfs.w6.h(sVar.f361012m);
    }

    public static h72.s e() {
        h72.s sVar;
        if (f360997r != null) {
            return f360997r;
        }
        synchronized (h72.s.class) {
            if (f360997r == null) {
                f360997r = new h72.s();
            }
            sVar = f360997r;
        }
        return sVar;
    }

    public void d() {
        i("MicroMsg.FaceVideoRecorder", "carson: cancel Record Video", new java.lang.Object[0]);
        this.f361002c.m77784x795fa299(new h72.l(this));
    }

    public tl.c f() {
        ei3.m mVar = this.f361000a;
        if (mVar != null) {
            return mVar.p();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FaceVideoRecorder", "hy: no media recorder");
        return null;
    }

    public boolean g(int i17, int i18, int i19, boolean z17, int i27, int i28, int i29, boolean z18, boolean z19) {
        j("MicroMsg.FaceVideoRecorder", "hy: init record", new java.lang.Object[0]);
        j("MicroMsg.FaceVideoRecorder", "hy: cameraOrientation: %d, previewWidth: %d, previewHeight: %d,isLandscape: %b,  degree: %d, acceptVoiceFromOutside: %s , compatNotLogin: %b", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i27), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z19));
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d = new com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d();
        c11120x15dce88d.f152736s = true;
        c11120x15dce88d.f152724d = this.f361009j;
        c11120x15dce88d.f152725e = this.f361010k;
        c11120x15dce88d.f152726f = 30;
        c11120x15dce88d.f152727g = 1200000;
        c11120x15dce88d.f152730m = 10;
        c11120x15dce88d.f152731n = 64000;
        c11120x15dce88d.f152734q = 2;
        c11120x15dce88d.f152735r = 1;
        c11120x15dce88d.f152732o = 16000;
        c11120x15dce88d.f152728h = 15;
        j("MicroMsg.FaceVideoRecorder", "hy: init serverProxy start", new java.lang.Object[0]);
        bi3.l lVar = this.f361014o;
        k55.k kVar = this.f361013n;
        if (!z19 || gm0.j1.b().n()) {
            h81.e eVar = (h81.e) lVar;
            eVar.getClass();
            if (kVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1874x633fb29.BinderC16530x6b2d3ec8.m66801xe1c076d2(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1874x633fb29.BinderC16530x6b2d3ec8(kVar));
            }
            di3.w.e(c11120x15dce88d, di3.v.MMSightCameraConfig);
            eVar.f361059c = c11120x15dce88d;
        } else {
            h81.e eVar2 = (h81.e) lVar;
            eVar2.getClass();
            if (kVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1874x633fb29.BinderC16530x6b2d3ec8 binderC16530x6b2d3ec8 = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1874x633fb29.BinderC16530x6b2d3ec8(kVar);
                binderC16530x6b2d3ec8.m66825x46f4afa(true);
                com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1874x633fb29.BinderC16530x6b2d3ec8.m66801xe1c076d2(binderC16530x6b2d3ec8);
            }
            di3.w.e(c11120x15dce88d, di3.v.MMSightCameraNotLoginConfig);
            eVar2.f361059c = c11120x15dce88d;
        }
        j("MicroMsg.FaceVideoRecorder", "hy: init serverProxy end", new java.lang.Object[0]);
        this.f361002c.m77784x795fa299(new h72.e(this, i17, i19, i18, z17, i27, z18, i28, i29));
        return true;
    }

    public boolean h() {
        boolean z17;
        synchronized (this.f361001b) {
            z17 = this.f361003d == h72.q.STARTED;
        }
        return z17;
    }

    public final void i(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "[" + this + "]" + str2, objArr);
    }

    public final void j(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[" + this + "]" + str2, objArr);
    }

    public boolean k() {
        i("MicroMsg.FaceVideoRecorder", "carson: start Record Video", new java.lang.Object[0]);
        this.f361002c.m77784x795fa299(new h72.k(this));
        return true;
    }

    public void l(h72.r rVar) {
        java.lang.String mo127744x5000ed37;
        java.lang.String b17;
        i("MicroMsg.FaceVideoRecorder", "carson: stop Record Video", new java.lang.Object[0]);
        synchronized (this.f361001b) {
            mo127744x5000ed37 = this.f361000a.mo127744x5000ed37();
            b17 = this.f361000a.b();
        }
        i("MicroMsg.FaceVideoRecorder", "stop video path: " + mo127744x5000ed37 + " thumbFile: " + b17, new java.lang.Object[0]);
        this.f361002c.m77784x795fa299(new h72.n(this, rVar, mo127744x5000ed37, b17));
    }
}
