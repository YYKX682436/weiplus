package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView */
/* loaded from: classes7.dex */
public class C12042x78b65610 extends android.widget.RelativeLayout implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.x, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.w, tb1.a0 {

    /* renamed from: x0, reason: collision with root package name */
    public static final /* synthetic */ int f161699x0 = 0;
    public android.util.Size A;
    public boolean B;
    public tb1.v C;
    public tb1.z D;
    public android.widget.ImageView E;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.api.C16529x1336da53 F;
    public java.lang.String G;
    public java.lang.String H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public int f161700J;
    public boolean K;
    public long L;
    public long M;
    public final android.view.WindowManager N;
    public tb1.x P;
    public boolean Q;
    public float R;
    public long S;
    public boolean T;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f4 U;
    public final java.util.concurrent.atomic.AtomicBoolean V;
    public java.util.List W;

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f161701d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f161702e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f161703f;

    /* renamed from: g, reason: collision with root package name */
    public int f161704g;

    /* renamed from: h, reason: collision with root package name */
    public tb1.m f161705h;

    /* renamed from: i, reason: collision with root package name */
    public int f161706i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f161707m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f161708n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f161709o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f161710p;

    /* renamed from: p0, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.h4 f161711p0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f161712q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f161713r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f161714s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f161715t;

    /* renamed from: u, reason: collision with root package name */
    public int f161716u;

    /* renamed from: v, reason: collision with root package name */
    public int f161717v;

    /* renamed from: w, reason: collision with root package name */
    public int f161718w;

    /* renamed from: x, reason: collision with root package name */
    public int f161719x;

    /* renamed from: y, reason: collision with root package name */
    public android.graphics.Rect f161720y;

    /* renamed from: z, reason: collision with root package name */
    public int f161721z;

    public C12042x78b65610(android.content.Context context) {
        super(context);
        this.f161703f = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.p.f34754x24728b;
        this.f161707m = "back";
        this.f161708n = "auto";
        this.f161709o = "high";
        this.f161712q = false;
        this.f161713r = false;
        this.f161715t = false;
        this.f161716u = 1080;
        this.f161717v = 1920;
        this.f161718w = 1080;
        this.f161719x = 1920;
        this.f161700J = -1;
        this.K = false;
        this.L = -1L;
        this.M = -1L;
        this.N = (android.view.WindowManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("window");
        this.U = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f4.LANDSCAPE;
        this.V = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f161711p0 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.h4(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, new tb1.e(this));
        f(context);
    }

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12042x78b65610 c12042x78b65610, int i17, java.lang.String str, java.util.Map map, java.lang.String str2) {
        c12042x78b65610.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCameraView", "onTakePhoto.ret:%d, path:%s, errMsg:%s", java.lang.Integer.valueOf(i17), str, str2);
        tb1.v vVar = c12042x78b65610.C;
        if (vVar != null) {
            int i18 = c12042x78b65610.f161718w;
            int i19 = c12042x78b65610.f161719x;
            tb1.q0 q0Var = ((tb1.r0) vVar).f498466a;
            if (i17 == 0) {
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("tempImagePath", str);
                hashMap.put("width", java.lang.Integer.valueOf(i18));
                hashMap.put("height", java.lang.Integer.valueOf(i19));
                if (map != null && !map.isEmpty()) {
                    hashMap.put("metadata", map);
                }
                q0Var.f498460e.a(q0Var.f498461f, q0Var.f498462g.p("ok", hashMap));
            } else {
                q0Var.f498460e.a(q0Var.f498461f, q0Var.f498462g.o("fail:" + str2));
            }
        }
        c12042x78b65610.K = false;
        c12042x78b65610.m();
        c12042x78b65610.f161700J = 1;
    }

    public static void d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12042x78b65610 c12042x78b65610) {
        if (c12042x78b65610.T) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCameraView", "camera already in pre rotate mode");
            return;
        }
        c12042x78b65610.T = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f4 f4Var = c12042x78b65610.U;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCameraView", "wait for another release called");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new tb1.l(c12042x78b65610, f4Var), 750L);
    }

    private void f(android.content.Context context) {
        this.f161701d = context;
        this.V.set(false);
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569546ef, this);
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12042x78b65610.g():void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.x
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCameraView", "onUIResume");
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12042x78b65610.class) {
            if (this.B) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.h4 h4Var = this.f161711p0;
                h4Var.getClass();
                h4Var.f171993b = 60;
                this.f161711p0.enable();
            }
            if (!this.V.get()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandCameraView", "no execute initView");
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

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v
    public void c() {
        android.graphics.Bitmap m66778x97c7b4;
        if (tb1.b.f498422a.f498425c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCameraView", "onBackground, but is requesting microphone permission");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCameraView", "onUIPause");
        if (this.B) {
            this.f161711p0.disable();
        }
        if (this.f161700J == 2) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("cameraId", java.lang.Integer.valueOf(this.f161706i));
            hashMap.put("errMsg", "stop on record");
            java.lang.String jSONObject = new org.json.JSONObject(hashMap).toString();
            tb1.o0 o0Var = new tb1.o0();
            o0Var.f163907f = jSONObject;
            this.f161702e.i(o0Var, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.api.C16529x1336da53 c16529x1336da53 = this.F;
        if (c16529x1336da53 != null && (m66778x97c7b4 = c16529x1336da53.m66778x97c7b4()) != null) {
            this.E.setImageBitmap(m66778x97c7b4);
        }
        tb1.x xVar = this.P;
        if (xVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.api.C16529x1336da53 c16529x1336da532 = this.F;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FrameDataCallbackHelper", "onUIPause mNeedCallback:%b", java.lang.Boolean.valueOf(xVar.f498483c));
            if (c16529x1336da532 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FrameDataCallbackHelper", "onUIPause recordView null");
            } else {
                c16529x1336da532.c(null, null);
            }
        }
        i();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("cameraId", java.lang.Integer.valueOf(mo50746x72efd496()));
        java.lang.String jSONObject2 = new org.json.JSONObject(hashMap2).toString();
        tb1.f0 f0Var = new tb1.f0();
        f0Var.f163907f = jSONObject2;
        this.f161702e.i(f0Var, null);
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.api.C16529x1336da53 e(android.content.Context context, int i17, int i18) {
        return null;
    }

    @Override // tb1.a0
    /* renamed from: getCameraId */
    public int mo50746x72efd496() {
        return this.f161706i;
    }

    /* renamed from: getRecordView */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.api.C16529x1336da53 m50747x1a0f428c() {
        return this.F;
    }

    @Override // tb1.a0
    /* renamed from: getView */
    public android.view.View mo50748xfb86a31b() {
        return this;
    }

    public void h() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCameraView", "initView");
        tb1.c cVar = tb1.b.f498422a;
        if (!cVar.f498423a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCameraMrg", "no camera permission");
        }
        if (cVar.f498423a) {
            o();
            m();
            g();
            r();
            this.V.compareAndSet(false, true);
            if (this.B) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.h4 h4Var = this.f161711p0;
                h4Var.getClass();
                h4Var.f171993b = 60;
                h4Var.enable();
            }
        }
    }

    public void i() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCameraView", "release");
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12042x78b65610.class) {
            try {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                this.S = android.os.SystemClock.elapsedRealtime();
                if (this.B) {
                    this.f161711p0.disable();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.api.C16529x1336da53 c16529x1336da53 = this.F;
                if (c16529x1336da53 != null) {
                    kt3.n nVar = (kt3.n) c16529x1336da53.f230365d;
                    kt3.l lVar = nVar.f393540d;
                    if (lVar != null) {
                        lVar.mo9065x41012807();
                    }
                    nVar.f393549p = null;
                    removeView(this.F);
                    this.f161700J = -1;
                    this.F.m66793x6554ffda(null);
                    this.F.m66795x54cde6fb(null);
                    this.F.m66794x2ec5a399(null);
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
        tb1.m mVar = this.f161705h;
        if (mVar != null) {
            mVar.mo166110x41012807();
            this.f161705h = null;
        }
        tb1.z zVar = this.D;
        if (zVar != null) {
            zVar.b();
        }
    }

    public tb1.m j(java.lang.String str) {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !str.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.p.f34754x24728b)) ? new tb1.s(this, null) : new tb1.u(this);
    }

    public void k(java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.api.C16529x1336da53 c16529x1336da53;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(this.f161707m, str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(this.f161703f, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.p.f34754x24728b)) {
            return;
        }
        this.f161707m = str;
        if (z17 || (c16529x1336da53 = this.F) == null) {
            return;
        }
        c16529x1336da53.i();
    }

    public final void l() {
        if (this.F == null || this.f161708n == null) {
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCameraView", "set flash mode before camera init done");
    }

    public final void m() {
        this.I = lp0.b.K() + java.lang.String.format("%s%d.%s", "capture", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), "jpg");
    }

    public void n(int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCameraView", "x:%d, y:%d, w:%d, h:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
        if (i19 <= 0 || i27 <= 0) {
            return;
        }
        this.f161720y = new android.graphics.Rect(i17, i18, i19 + i17, i27 + i18);
    }

    public final void o() {
        java.lang.String str = "MicroMsg_" + java.lang.System.currentTimeMillis();
        if (!com.p314xaae8f345.mm.vfs.w6.j(lp0.b.K())) {
            com.p314xaae8f345.mm.vfs.w6.u(lp0.b.K());
        }
        this.G = lp0.b.K() + str + ".mp4";
        this.H = lp0.b.K() + str + ".jpeg";
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.api.C16529x1336da53 c16529x1336da53 = this.F;
        if (c16529x1336da53 != null) {
            c16529x1336da53.m66800x1474a01a(this.G);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.w
    /* renamed from: onDestroy */
    public void mo32094xac79a11b() {
        tb1.x xVar = this.P;
        if (xVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.api.C16529x1336da53 c16529x1336da53 = this.F;
            xVar.f498483c = false;
            if (c16529x1336da53 != null) {
                c16529x1336da53.c(null, null);
            }
            int i17 = xVar.f498484d;
            if (i17 != Integer.MIN_VALUE) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n) xVar.f498482b).a0(i17);
                xVar.f498484d = Integer.MIN_VALUE;
            }
        }
        i();
        this.V.compareAndSet(true, false);
    }

    public boolean p(int i17, int i18, boolean z17) {
        if (this.f161716u == i17 && this.f161717v == i18) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCameraView", "setViewSize");
        this.f161716u = i17;
        this.f161717v = i18;
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCameraView", "recordView is null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCameraView", "setCameraMode mode:%s", this.f161703f);
        tb1.m mVar = this.f161705h;
        if (mVar != null) {
            mVar.mo166110x41012807();
            this.f161705h = null;
        }
        tb1.m j17 = j(this.f161703f);
        this.f161705h = j17;
        j17.mo166109x316510();
        l();
    }

    @Override // tb1.a0
    /* renamed from: setAppId */
    public void mo50749x52b73fda(java.lang.String str) {
    }

    @Override // tb1.a0
    /* renamed from: setCameraId */
    public void mo50750x6da835a2(int i17) {
        this.f161706i = i17;
    }

    @Override // tb1.a0
    /* renamed from: setCameraLife */
    public void mo50751xa472d1c3(tb1.z zVar) {
        this.D = zVar;
    }

    @Override // tb1.a0
    /* renamed from: setCompressRecord */
    public void mo50752x2bc7e755(boolean z17) {
        this.f161713r = z17;
    }

    @Override // tb1.a0
    /* renamed from: setDisplayScreenSize */
    public void mo50753xac31fcad(android.util.Size size) {
        if (size == null || size.getHeight() <= 0 || size.getWidth() <= 0) {
            return;
        }
        this.A = size;
    }

    @Override // tb1.a0
    /* renamed from: setFlash */
    public void mo50754x52fbb0ae(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(this.f161708n, str)) {
            return;
        }
        this.f161708n = str;
    }

    @Override // tb1.a0
    /* renamed from: setFrameLimitSize */
    public void mo50755x7b594071(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCameraView", "setFrameLimitSize:%d", java.lang.Integer.valueOf(i17));
        this.f161704g = i17;
    }

    @Override // tb1.a0
    /* renamed from: setMode */
    public void mo50756x764d6925(java.lang.String str) {
        this.f161703f = str;
    }

    @Override // tb1.a0
    /* renamed from: setNeedOutput */
    public void mo50757xc62f4b39(boolean z17) {
        this.f161714s = z17;
    }

    @Override // tb1.a0
    /* renamed from: setOperateCallBack */
    public void mo50758xfda7a947(tb1.v vVar) {
        this.C = vVar;
    }

    @Override // tb1.a0
    /* renamed from: setOutPutCallBack */
    public void mo50759x79ac5d68(tb1.d dVar) {
    }

    @Override // tb1.a0
    /* renamed from: setPage */
    public void mo50760x764e9211(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar) {
        this.f161702e = tVar;
    }

    @Override // tb1.a0
    /* renamed from: setPageOrientation */
    public void mo50761xdaac6ff(boolean z17) {
        this.B = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCameraView", "setPageOrientation: %b", java.lang.Boolean.valueOf(z17));
    }

    @Override // tb1.a0
    /* renamed from: setPreviewCenterCrop */
    public void mo50762x4b0c022b(boolean z17) {
        this.f161712q = z17;
    }

    @Override // tb1.a0
    /* renamed from: setQuality */
    public void mo50763xd80f4a3d(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(this.f161709o, str)) {
            return;
        }
        this.f161709o = str;
    }

    @Override // tb1.a0
    /* renamed from: setResolution */
    public void mo50764xbd067eae(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(this.f161710p, str)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCameraView", "setPreviewResolution: %s", str);
        this.f161710p = str;
    }

    @Override // tb1.a0
    /* renamed from: setScanFreq */
    public void mo50765x41786917(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCameraView", "scanFreq:%d", java.lang.Integer.valueOf(i17));
        if (i17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandCameraView", "scanFreq is err");
        } else {
            this.f161721z = i17;
        }
    }

    public C12042x78b65610(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f161703f = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.p.f34754x24728b;
        this.f161707m = "back";
        this.f161708n = "auto";
        this.f161709o = "high";
        this.f161712q = false;
        this.f161713r = false;
        this.f161715t = false;
        this.f161716u = 1080;
        this.f161717v = 1920;
        this.f161718w = 1080;
        this.f161719x = 1920;
        this.f161700J = -1;
        this.K = false;
        this.L = -1L;
        this.M = -1L;
        this.N = (android.view.WindowManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("window");
        this.U = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f4.LANDSCAPE;
        this.V = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f161711p0 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.h4(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, new tb1.e(this));
        f(context);
    }

    public C12042x78b65610(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f161703f = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.p.f34754x24728b;
        this.f161707m = "back";
        this.f161708n = "auto";
        this.f161709o = "high";
        this.f161712q = false;
        this.f161713r = false;
        this.f161715t = false;
        this.f161716u = 1080;
        this.f161717v = 1920;
        this.f161718w = 1080;
        this.f161719x = 1920;
        this.f161700J = -1;
        this.K = false;
        this.L = -1L;
        this.M = -1L;
        this.N = (android.view.WindowManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("window");
        this.U = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f4.LANDSCAPE;
        this.V = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f161711p0 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.h4(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, new tb1.e(this));
        f(context);
    }
}
