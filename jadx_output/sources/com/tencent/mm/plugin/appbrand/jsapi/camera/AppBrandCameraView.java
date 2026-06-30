package com.tencent.mm.plugin.appbrand.jsapi.camera;

/* loaded from: classes7.dex */
public class AppBrandCameraView extends android.widget.RelativeLayout implements com.tencent.mm.plugin.appbrand.jsapi.x, com.tencent.mm.plugin.appbrand.jsapi.v, com.tencent.mm.plugin.appbrand.jsapi.w, tb1.a0 {

    /* renamed from: x0, reason: collision with root package name */
    public static final /* synthetic */ int f80166x0 = 0;
    public android.util.Size A;
    public boolean B;
    public tb1.v C;
    public tb1.z D;
    public android.widget.ImageView E;
    public com.tencent.mm.plugin.mmsight.api.MMSightRecordView F;
    public java.lang.String G;
    public java.lang.String H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public int f80167J;
    public boolean K;
    public long L;
    public long M;
    public final android.view.WindowManager N;
    public tb1.x P;
    public boolean Q;
    public float R;
    public long S;
    public boolean T;
    public com.tencent.mm.plugin.appbrand.utils.f4 U;
    public final java.util.concurrent.atomic.AtomicBoolean V;
    public java.util.List W;

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f80168d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.l f80169e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f80170f;

    /* renamed from: g, reason: collision with root package name */
    public int f80171g;

    /* renamed from: h, reason: collision with root package name */
    public tb1.m f80172h;

    /* renamed from: i, reason: collision with root package name */
    public int f80173i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f80174m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f80175n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f80176o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f80177p;

    /* renamed from: p0, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.utils.h4 f80178p0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f80179q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f80180r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f80181s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f80182t;

    /* renamed from: u, reason: collision with root package name */
    public int f80183u;

    /* renamed from: v, reason: collision with root package name */
    public int f80184v;

    /* renamed from: w, reason: collision with root package name */
    public int f80185w;

    /* renamed from: x, reason: collision with root package name */
    public int f80186x;

    /* renamed from: y, reason: collision with root package name */
    public android.graphics.Rect f80187y;

    /* renamed from: z, reason: collision with root package name */
    public int f80188z;

    public AppBrandCameraView(android.content.Context context) {
        super(context);
        this.f80170f = com.tencent.mm.plugin.appbrand.jsapi.scanner.p.NAME;
        this.f80174m = "back";
        this.f80175n = "auto";
        this.f80176o = "high";
        this.f80179q = false;
        this.f80180r = false;
        this.f80182t = false;
        this.f80183u = 1080;
        this.f80184v = 1920;
        this.f80185w = 1080;
        this.f80186x = 1920;
        this.f80167J = -1;
        this.K = false;
        this.L = -1L;
        this.M = -1L;
        this.N = (android.view.WindowManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("window");
        this.U = com.tencent.mm.plugin.appbrand.utils.f4.LANDSCAPE;
        this.V = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f80178p0 = new com.tencent.mm.plugin.appbrand.utils.h4(com.tencent.mm.sdk.platformtools.x2.f193071a, new tb1.e(this));
        f(context);
    }

    public static void a(com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView appBrandCameraView, int i17, java.lang.String str, java.util.Map map, java.lang.String str2) {
        appBrandCameraView.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCameraView", "onTakePhoto.ret:%d, path:%s, errMsg:%s", java.lang.Integer.valueOf(i17), str, str2);
        tb1.v vVar = appBrandCameraView.C;
        if (vVar != null) {
            int i18 = appBrandCameraView.f80185w;
            int i19 = appBrandCameraView.f80186x;
            tb1.q0 q0Var = ((tb1.r0) vVar).f416933a;
            if (i17 == 0) {
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("tempImagePath", str);
                hashMap.put("width", java.lang.Integer.valueOf(i18));
                hashMap.put("height", java.lang.Integer.valueOf(i19));
                if (map != null && !map.isEmpty()) {
                    hashMap.put("metadata", map);
                }
                q0Var.f416927e.a(q0Var.f416928f, q0Var.f416929g.p("ok", hashMap));
            } else {
                q0Var.f416927e.a(q0Var.f416928f, q0Var.f416929g.o("fail:" + str2));
            }
        }
        appBrandCameraView.K = false;
        appBrandCameraView.m();
        appBrandCameraView.f80167J = 1;
    }

    public static void d(com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView appBrandCameraView) {
        if (appBrandCameraView.T) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCameraView", "camera already in pre rotate mode");
            return;
        }
        appBrandCameraView.T = true;
        com.tencent.mm.plugin.appbrand.utils.f4 f4Var = appBrandCameraView.U;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCameraView", "wait for another release called");
        com.tencent.mm.sdk.platformtools.u3.i(new tb1.l(appBrandCameraView, f4Var), 750L);
    }

    private void f(android.content.Context context) {
        this.f80168d = context;
        this.V.set(false);
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f488013ef, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c1, code lost:
    
        if (r1.equals("high") == false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void g() {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView.g():void");
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.x
    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCameraView", "onUIResume");
        synchronized (com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView.class) {
            if (this.B) {
                com.tencent.mm.plugin.appbrand.utils.h4 h4Var = this.f80178p0;
                h4Var.getClass();
                h4Var.f90460b = 60;
                this.f80178p0.enable();
            }
            if (!this.V.get()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandCameraView", "no execute initView");
                return;
            }
            g();
            r();
            tb1.x xVar = this.P;
            if (xVar != null) {
                xVar.a(this.F);
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.v
    public void c() {
        android.graphics.Bitmap currentFramePicture;
        if (tb1.b.f416889a.f416892c) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCameraView", "onBackground, but is requesting microphone permission");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCameraView", "onUIPause");
        if (this.B) {
            this.f80178p0.disable();
        }
        if (this.f80167J == 2) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("cameraId", java.lang.Integer.valueOf(this.f80173i));
            hashMap.put("errMsg", "stop on record");
            java.lang.String jSONObject = new org.json.JSONObject(hashMap).toString();
            tb1.o0 o0Var = new tb1.o0();
            o0Var.f82374f = jSONObject;
            this.f80169e.i(o0Var, null);
        }
        com.tencent.mm.plugin.mmsight.api.MMSightRecordView mMSightRecordView = this.F;
        if (mMSightRecordView != null && (currentFramePicture = mMSightRecordView.getCurrentFramePicture()) != null) {
            this.E.setImageBitmap(currentFramePicture);
        }
        tb1.x xVar = this.P;
        if (xVar != null) {
            com.tencent.mm.plugin.mmsight.api.MMSightRecordView mMSightRecordView2 = this.F;
            com.tencent.mars.xlog.Log.i("MicroMsg.FrameDataCallbackHelper", "onUIPause mNeedCallback:%b", java.lang.Boolean.valueOf(xVar.f416950c));
            if (mMSightRecordView2 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.FrameDataCallbackHelper", "onUIPause recordView null");
            } else {
                mMSightRecordView2.c(null, null);
            }
        }
        i();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("cameraId", java.lang.Integer.valueOf(getCameraId()));
        java.lang.String jSONObject2 = new org.json.JSONObject(hashMap2).toString();
        tb1.f0 f0Var = new tb1.f0();
        f0Var.f82374f = jSONObject2;
        this.f80169e.i(f0Var, null);
    }

    public com.tencent.mm.plugin.mmsight.api.MMSightRecordView e(android.content.Context context, int i17, int i18) {
        return null;
    }

    @Override // tb1.a0
    public int getCameraId() {
        return this.f80173i;
    }

    public com.tencent.mm.plugin.mmsight.api.MMSightRecordView getRecordView() {
        return this.F;
    }

    @Override // tb1.a0
    public android.view.View getView() {
        return this;
    }

    public void h() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCameraView", "initView");
        tb1.c cVar = tb1.b.f416889a;
        if (!cVar.f416890a) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCameraMrg", "no camera permission");
        }
        if (cVar.f416890a) {
            o();
            m();
            g();
            r();
            this.V.compareAndSet(false, true);
            if (this.B) {
                com.tencent.mm.plugin.appbrand.utils.h4 h4Var = this.f80178p0;
                h4Var.getClass();
                h4Var.f90460b = 60;
                h4Var.enable();
            }
        }
    }

    public void i() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCameraView", "release");
        synchronized (com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView.class) {
            try {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                this.S = android.os.SystemClock.elapsedRealtime();
                if (this.B) {
                    this.f80178p0.disable();
                }
                com.tencent.mm.plugin.mmsight.api.MMSightRecordView mMSightRecordView = this.F;
                if (mMSightRecordView != null) {
                    kt3.n nVar = (kt3.n) mMSightRecordView.f148832d;
                    kt3.l lVar = nVar.f312007d;
                    if (lVar != null) {
                        lVar.release();
                    }
                    nVar.f312016p = null;
                    removeView(this.F);
                    this.f80167J = -1;
                    this.F.setFrameDataCallback(null);
                    this.F.setInitErrorCallback(null);
                    this.F.setInitDoneCallback(null);
                    this.F = null;
                }
                android.widget.ImageView imageView = this.E;
                if (imageView != null) {
                    imageView.setImageBitmap(null);
                }
                java.util.List list = this.W;
                if (list != null) {
                    ((java.util.ArrayList) list).clear();
                }
                this.R = 0.0f;
            } catch (java.lang.Throwable th6) {
                throw th6;
            }
        }
        tb1.m mVar = this.f80172h;
        if (mVar != null) {
            mVar.release();
            this.f80172h = null;
        }
        tb1.z zVar = this.D;
        if (zVar != null) {
            zVar.b();
        }
    }

    public tb1.m j(java.lang.String str) {
        return (com.tencent.mm.sdk.platformtools.t8.K0(str) || !str.equals(com.tencent.mm.plugin.appbrand.jsapi.scanner.p.NAME)) ? new tb1.s(this, null) : new tb1.u(this);
    }

    public void k(java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.mmsight.api.MMSightRecordView mMSightRecordView;
        if (com.tencent.mm.sdk.platformtools.t8.D0(this.f80174m, str) || com.tencent.mm.sdk.platformtools.t8.D0(this.f80170f, com.tencent.mm.plugin.appbrand.jsapi.scanner.p.NAME)) {
            return;
        }
        this.f80174m = str;
        if (z17 || (mMSightRecordView = this.F) == null) {
            return;
        }
        mMSightRecordView.i();
    }

    public final void l() {
        if (this.F == null || this.f80175n == null) {
            return;
        }
        tb1.k kVar = new tb1.k(this);
        if (this.Q) {
            kVar.run();
            return;
        }
        if (this.W == null) {
            this.W = new java.util.ArrayList();
        }
        ((java.util.ArrayList) this.W).add(kVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCameraView", "set flash mode before camera init done");
    }

    public final void m() {
        this.I = lp0.b.K() + java.lang.String.format("%s%d.%s", "capture", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), "jpg");
    }

    public void n(int i17, int i18, int i19, int i27) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCameraView", "x:%d, y:%d, w:%d, h:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
        if (i19 <= 0 || i27 <= 0) {
            return;
        }
        this.f80187y = new android.graphics.Rect(i17, i18, i19 + i17, i27 + i18);
    }

    public final void o() {
        java.lang.String str = "MicroMsg_" + java.lang.System.currentTimeMillis();
        if (!com.tencent.mm.vfs.w6.j(lp0.b.K())) {
            com.tencent.mm.vfs.w6.u(lp0.b.K());
        }
        this.G = lp0.b.K() + str + ".mp4";
        this.H = lp0.b.K() + str + ".jpeg";
        com.tencent.mm.plugin.mmsight.api.MMSightRecordView mMSightRecordView = this.F;
        if (mMSightRecordView != null) {
            mMSightRecordView.setVideoFilePath(this.G);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.w
    public void onDestroy() {
        tb1.x xVar = this.P;
        if (xVar != null) {
            com.tencent.mm.plugin.mmsight.api.MMSightRecordView mMSightRecordView = this.F;
            xVar.f416950c = false;
            if (mMSightRecordView != null) {
                mMSightRecordView.c(null, null);
            }
            int i17 = xVar.f416951d;
            if (i17 != Integer.MIN_VALUE) {
                ((com.tencent.mm.plugin.appbrand.jsruntime.n) xVar.f416949b).a0(i17);
                xVar.f416951d = Integer.MIN_VALUE;
            }
        }
        i();
        this.V.compareAndSet(true, false);
    }

    public boolean p(int i17, int i18, boolean z17) {
        if (this.f80183u == i17 && this.f80184v == i18) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCameraView", "setViewSize");
        this.f80183u = i17;
        this.f80184v = i18;
        return true;
    }

    public float q(float f17) {
        if (this.F == null) {
            return 0.0f;
        }
        if (f17 < 1.0f) {
            return f17;
        }
        float round = java.lang.Math.round(f17 * 10.0f) / 10.0f;
        float f18 = this.R;
        if (round > f18) {
            round = f18;
        }
        while (!this.F.e(round) && round > 0.0f) {
            round -= 0.1f;
        }
        return round;
    }

    public void r() {
        if (this.F == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCameraView", "recordView is null");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCameraView", "setCameraMode mode:%s", this.f80170f);
        tb1.m mVar = this.f80172h;
        if (mVar != null) {
            mVar.release();
            this.f80172h = null;
        }
        tb1.m j17 = j(this.f80170f);
        this.f80172h = j17;
        j17.init();
        l();
    }

    @Override // tb1.a0
    public void setAppId(java.lang.String str) {
    }

    @Override // tb1.a0
    public void setCameraId(int i17) {
        this.f80173i = i17;
    }

    @Override // tb1.a0
    public void setCameraLife(tb1.z zVar) {
        this.D = zVar;
    }

    @Override // tb1.a0
    public void setCompressRecord(boolean z17) {
        this.f80180r = z17;
    }

    @Override // tb1.a0
    public void setDisplayScreenSize(android.util.Size size) {
        if (size == null || size.getHeight() <= 0 || size.getWidth() <= 0) {
            return;
        }
        this.A = size;
    }

    @Override // tb1.a0
    public void setFlash(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.D0(this.f80175n, str)) {
            return;
        }
        this.f80175n = str;
    }

    @Override // tb1.a0
    public void setFrameLimitSize(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCameraView", "setFrameLimitSize:%d", java.lang.Integer.valueOf(i17));
        this.f80171g = i17;
    }

    @Override // tb1.a0
    public void setMode(java.lang.String str) {
        this.f80170f = str;
    }

    @Override // tb1.a0
    public void setNeedOutput(boolean z17) {
        this.f80181s = z17;
    }

    @Override // tb1.a0
    public void setOperateCallBack(tb1.v vVar) {
        this.C = vVar;
    }

    @Override // tb1.a0
    public void setOutPutCallBack(tb1.d dVar) {
    }

    @Override // tb1.a0
    public void setPage(com.tencent.mm.plugin.appbrand.jsapi.t tVar) {
        this.f80169e = tVar;
    }

    @Override // tb1.a0
    public void setPageOrientation(boolean z17) {
        this.B = z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCameraView", "setPageOrientation: %b", java.lang.Boolean.valueOf(z17));
    }

    @Override // tb1.a0
    public void setPreviewCenterCrop(boolean z17) {
        this.f80179q = z17;
    }

    @Override // tb1.a0
    public void setQuality(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.D0(this.f80176o, str)) {
            return;
        }
        this.f80176o = str;
    }

    @Override // tb1.a0
    public void setResolution(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.D0(this.f80177p, str)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCameraView", "setPreviewResolution: %s", str);
        this.f80177p = str;
    }

    @Override // tb1.a0
    public void setScanFreq(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCameraView", "scanFreq:%d", java.lang.Integer.valueOf(i17));
        if (i17 <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandCameraView", "scanFreq is err");
        } else {
            this.f80188z = i17;
        }
    }

    public AppBrandCameraView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f80170f = com.tencent.mm.plugin.appbrand.jsapi.scanner.p.NAME;
        this.f80174m = "back";
        this.f80175n = "auto";
        this.f80176o = "high";
        this.f80179q = false;
        this.f80180r = false;
        this.f80182t = false;
        this.f80183u = 1080;
        this.f80184v = 1920;
        this.f80185w = 1080;
        this.f80186x = 1920;
        this.f80167J = -1;
        this.K = false;
        this.L = -1L;
        this.M = -1L;
        this.N = (android.view.WindowManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("window");
        this.U = com.tencent.mm.plugin.appbrand.utils.f4.LANDSCAPE;
        this.V = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f80178p0 = new com.tencent.mm.plugin.appbrand.utils.h4(com.tencent.mm.sdk.platformtools.x2.f193071a, new tb1.e(this));
        f(context);
    }

    public AppBrandCameraView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f80170f = com.tencent.mm.plugin.appbrand.jsapi.scanner.p.NAME;
        this.f80174m = "back";
        this.f80175n = "auto";
        this.f80176o = "high";
        this.f80179q = false;
        this.f80180r = false;
        this.f80182t = false;
        this.f80183u = 1080;
        this.f80184v = 1920;
        this.f80185w = 1080;
        this.f80186x = 1920;
        this.f80167J = -1;
        this.K = false;
        this.L = -1L;
        this.M = -1L;
        this.N = (android.view.WindowManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("window");
        this.U = com.tencent.mm.plugin.appbrand.utils.f4.LANDSCAPE;
        this.V = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f80178p0 = new com.tencent.mm.plugin.appbrand.utils.h4(com.tencent.mm.sdk.platformtools.x2.f193071a, new tb1.e(this));
        f(context);
    }
}
