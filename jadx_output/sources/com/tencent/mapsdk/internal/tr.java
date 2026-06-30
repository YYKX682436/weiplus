package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public class tr extends com.tencent.mapsdk.internal.tz implements com.tencent.tencentmap.mapsdk.maps.TencentMap.OnCameraChangeListener {
    private static final java.lang.String aW = "copy_config";
    private static final java.lang.String aX = "async";
    private static final java.lang.String aY = "half_sync";
    public com.tencent.tencentmap.mapsdk.maps.TencentMap.OnScaleViewChangedListener A;
    public com.tencent.tencentmap.mapsdk.maps.TencentMap.OnCameraChangeListener B;
    public com.tencent.tencentmap.mapsdk.maps.TencentMap.OnCameraChangeListener C;
    public android.os.Handler D;
    public long E;
    public android.graphics.Bitmap.Config F;
    public int G;
    public int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public int f52179J;
    public float K;
    public float L;
    public float M;
    public float N;
    public boolean O;
    public boolean P;
    protected boolean Q;
    protected boolean R;
    protected boolean S;
    protected boolean T;
    protected boolean U;
    public int V;
    public int W;
    public boolean X;
    public boolean Y;
    public int Z;
    private java.util.List<com.tencent.mapsdk.internal.fn> aF;
    private final com.tencent.mapsdk.internal.ba aG;
    private com.tencent.mapsdk.internal.qm aH;
    private final com.tencent.mapsdk.internal.fm aI;
    private final com.tencent.mapsdk.internal.fq aJ;
    private com.tencent.map.lib.models.GeoPoint aK;
    private boolean aL;
    private volatile boolean aM;
    private boolean aN;
    private int aO;
    private int aP;
    private float aQ;
    private com.tencent.mapsdk.internal.gb aR;
    private int aS;
    private com.tencent.mapsdk.internal.qj aT;
    private int aU;
    private boolean aV;
    private boolean aZ;

    /* renamed from: aa, reason: collision with root package name */
    public int f52180aa;

    /* renamed from: ab, reason: collision with root package name */
    final com.tencent.mapsdk.internal.fb f52181ab;

    /* renamed from: ac, reason: collision with root package name */
    public boolean f52182ac;

    /* renamed from: ad, reason: collision with root package name */
    public com.tencent.mapsdk.internal.an f52183ad;

    /* renamed from: ae, reason: collision with root package name */
    public boolean f52184ae;

    /* renamed from: af, reason: collision with root package name */
    public com.tencent.mapsdk.internal.pt f52185af;

    /* renamed from: ag, reason: collision with root package name */
    public com.tencent.tencentmap.mapsdk.maps.TencentMap.OnTrafficEventClickListener f52186ag;

    /* renamed from: ah, reason: collision with root package name */
    public java.util.List<com.tencent.tencentmap.mapsdk.maps.model.MapPoi> f52187ah;

    /* renamed from: ai, reason: collision with root package name */
    public java.util.List<com.tencent.mapsdk.internal.bc> f52188ai;

    /* renamed from: ba, reason: collision with root package name */
    private boolean f52189ba;

    /* renamed from: bb, reason: collision with root package name */
    private final java.util.Map<com.tencent.mapsdk.internal.qa.b, java.lang.Boolean> f52190bb;

    /* renamed from: bc, reason: collision with root package name */
    private java.util.List<com.tencent.mapsdk.internal.an> f52191bc;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f52192g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f52193h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f52194i;

    /* renamed from: j, reason: collision with root package name */
    public com.tencent.mapsdk.internal.sp f52195j;

    /* renamed from: k, reason: collision with root package name */
    public com.tencent.mapsdk.internal.rn f52196k;

    /* renamed from: l, reason: collision with root package name */
    public com.tencent.mapsdk.internal.sj f52197l;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mapsdk.internal.qs f52198m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mapsdk.internal.ac f52199n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.tencentmap.mapsdk.maps.model.AnimationListener f52200o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List<com.tencent.mapsdk.internal.fh> f52201p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapClickListener f52202q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mapsdk.internal.bb f52203r;

    /* renamed from: s, reason: collision with root package name */
    public java.util.List<com.tencent.tencentmap.mapsdk.maps.TencentMap.OnCameraChangeListener> f52204s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapLongClickListener f52205t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.tencentmap.mapsdk.maps.TencentMap.OnDismissCallback f52206u;

    /* renamed from: v, reason: collision with root package name */
    protected com.tencent.tencentmap.mapsdk.maps.TencentMap.OnIndoorStateChangeListener f52207v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapPoiClickListener f52208w;

    /* renamed from: x, reason: collision with root package name */
    android.os.Handler f52209x;

    /* renamed from: y, reason: collision with root package name */
    com.tencent.tencentmap.mapsdk.maps.model.CameraPosition f52210y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.tencentmap.mapsdk.maps.TencentMap.OnCompassClickedListener f52211z;

    /* renamed from: com.tencent.mapsdk.internal.tr$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass1 implements com.tencent.map.tools.Callback<com.tencent.mapsdk.internal.ez> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.tencent.mapsdk.internal.ez[] f52212a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ javax.microedition.khronos.opengles.GL10 f52213b;

        public AnonymousClass1(com.tencent.mapsdk.internal.ez[] ezVarArr, javax.microedition.khronos.opengles.GL10 gl10) {
            this.f52212a = ezVarArr;
            this.f52213b = gl10;
        }

        private void a(com.tencent.mapsdk.internal.ez ezVar) {
            if (ezVar instanceof com.tencent.mapsdk.internal.au) {
                if (!android.text.TextUtils.equals(ezVar.getId(), com.tencent.mapsdk.internal.tr.this.f52193h)) {
                    ezVar.a(this.f52213b);
                } else if (ezVar.isVisible() || com.tencent.mapsdk.internal.tr.this.P) {
                    this.f52212a[0] = ezVar;
                } else {
                    ezVar.releaseData();
                }
            }
        }

        @Override // com.tencent.map.tools.Callback
        public final /* synthetic */ void callback(com.tencent.mapsdk.internal.ez ezVar) {
            com.tencent.mapsdk.internal.ez ezVar2 = ezVar;
            if (ezVar2 instanceof com.tencent.mapsdk.internal.au) {
                if (!android.text.TextUtils.equals(ezVar2.getId(), com.tencent.mapsdk.internal.tr.this.f52193h)) {
                    ezVar2.a(this.f52213b);
                } else if (ezVar2.isVisible() || com.tencent.mapsdk.internal.tr.this.P) {
                    this.f52212a[0] = ezVar2;
                } else {
                    ezVar2.releaseData();
                }
            }
        }
    }

    public tr(android.content.Context context, com.tencent.tencentmap.mapsdk.maps.TencentMapOptions tencentMapOptions, android.view.ViewGroup viewGroup) {
        super(context, tencentMapOptions, viewGroup);
        this.f52192g = new byte[0];
        this.f52193h = "";
        this.f52194i = false;
        this.f52195j = null;
        this.f52196k = null;
        this.f52199n = null;
        this.f52200o = null;
        this.f52201p = new java.util.concurrent.CopyOnWriteArrayList();
        this.aF = null;
        this.f52202q = null;
        this.f52203r = null;
        this.f52204s = new java.util.concurrent.CopyOnWriteArrayList();
        this.f52205t = null;
        this.f52206u = null;
        this.f52208w = null;
        this.aH = new com.tencent.mapsdk.internal.tl(this);
        this.f52211z = null;
        this.A = null;
        this.B = null;
        this.C = null;
        this.F = android.graphics.Bitmap.Config.RGB_565;
        this.G = Integer.MIN_VALUE;
        this.H = Integer.MIN_VALUE;
        this.I = Integer.MIN_VALUE;
        this.f52179J = Integer.MIN_VALUE;
        this.K = 0.5f;
        this.L = 0.5f;
        this.M = 0.5f;
        this.N = 0.5f;
        this.aK = null;
        this.aL = false;
        this.O = true;
        this.aM = false;
        this.aN = false;
        this.aO = 0;
        this.aP = 0;
        this.P = false;
        this.Q = true;
        this.R = true;
        this.S = true;
        this.T = true;
        this.U = true;
        this.V = 19;
        this.W = 3;
        this.aQ = 0.0f;
        this.X = true;
        this.Y = true;
        this.Z = 0;
        this.f52180aa = 0;
        this.aS = 0;
        this.f52182ac = false;
        this.f52183ad = null;
        this.f52184ae = false;
        this.aU = 0;
        this.aV = false;
        this.aZ = false;
        this.f52189ba = false;
        this.f52190bb = new java.util.concurrent.ConcurrentHashMap();
        this.f52191bc = new java.util.ArrayList();
        this.f52187ah = new java.util.ArrayList();
        this.f52188ai = new java.util.ArrayList();
        this.aI = new com.tencent.mapsdk.internal.tw(this);
        this.f52181ab = new com.tencent.mapsdk.internal.tp(this);
        this.aH = new com.tencent.mapsdk.internal.tl(this);
        this.aJ = new com.tencent.mapsdk.internal.tn(this);
        this.aG = new com.tencent.mapsdk.internal.tm(this);
        int[] d17 = com.tencent.mapsdk.internal.hs.d(I());
        this.Z = d17[0];
        this.f52180aa = d17[1];
    }

    private com.tencent.mapsdk.internal.sp an() {
        return this.f52195j;
    }

    private boolean ao() {
        return this.f52195j.f51514b.f51498e;
    }

    private com.tencent.mapsdk.internal.sj ap() {
        return this.f52197l;
    }

    private void aq() {
        com.tencent.mapsdk.core.utils.log.LogUtil.a(this.f49018f).b(com.tencent.mapsdk.internal.la.a.f50264e, "asyncCopyConfig: " + this.aZ + ", halfSyncCopyConfig: " + this.f52189ba);
        if (this.aZ) {
            com.tencent.mapsdk.internal.qe.a(I(), ad().f49011c);
            return;
        }
        if (this.f52189ba) {
            android.content.Context I = I();
            java.lang.String str = ad().f49011c;
            if (I != null) {
                java.lang.String a17 = com.tencent.mapsdk.internal.mz.a(I, (com.tencent.tencentmap.mapsdk.maps.TencentMapOptions) null).a(str);
                com.tencent.mapsdk.internal.mv a18 = com.tencent.mapsdk.internal.mx.a(I, str);
                com.tencent.mapsdk.internal.mw.c(a18, a17);
                com.tencent.mapsdk.internal.mw.d(a18, a17);
                com.tencent.mapsdk.internal.mw.a(I, a18, a17, com.tencent.mapsdk.internal.ep.f49359d);
                com.tencent.mapsdk.internal.mw.a(I, a18, a17, com.tencent.mapsdk.internal.ep.f49357b);
                com.tencent.mapsdk.internal.mw.a(I, a18, a17, com.tencent.mapsdk.internal.ep.f49358c);
                com.tencent.mapsdk.internal.mw.a(I, a18, a17, com.tencent.mapsdk.internal.ep.f49360e);
                com.tencent.mapsdk.internal.mw.a(I, a18, a17, com.tencent.mapsdk.internal.ep.f49361f);
                com.tencent.mapsdk.internal.mw.a(I, a18, a17, com.tencent.mapsdk.internal.ep.f49362g);
                com.tencent.mapsdk.internal.mw.a(I, a18, a17, com.tencent.mapsdk.internal.ep.f49363h);
            }
            com.tencent.mapsdk.vector.VectorMap vectorMap = (com.tencent.mapsdk.vector.VectorMap) this.e_;
            if (vectorMap != null) {
                vectorMap.u();
            }
        }
    }

    private boolean ar() {
        return !this.f52267am && at();
    }

    private boolean as() {
        return !this.f52269ao && K();
    }

    private boolean at() {
        com.tencent.mapsdk.vector.VectorMap vectorMap = (com.tencent.mapsdk.vector.VectorMap) this.e_;
        com.tencent.mapsdk.internal.sp spVar = this.f52195j;
        return vectorMap != null && vectorMap.f52511n && spVar != null && spVar.f51516d && K();
    }

    private com.tencent.mapsdk.internal.gc[] au() {
        com.tencent.map.lib.models.GeoPoint[] i17 = this.f52273as.f50506f.i();
        com.tencent.mapsdk.internal.gc[] gcVarArr = new com.tencent.mapsdk.internal.gc[4];
        for (int i18 = 0; i18 < 4; i18++) {
            gcVarArr[i18] = com.tencent.mapsdk.internal.y.b(i17[i18]);
        }
        return gcVarArr;
    }

    private java.util.List<com.tencent.tencentmap.mapsdk.maps.model.MapPoi> av() {
        this.f52187ah.clear();
        com.tencent.mapsdk.internal.ne neVar = ((com.tencent.mapsdk.vector.VectorMap) this.e_).f52512o;
        java.util.ArrayList<com.tencent.tencentmap.mapsdk.maps.model.MapPoi> Q = neVar == null ? null : neVar.Q();
        this.f52187ah = Q;
        return Q;
    }

    private com.tencent.mapsdk.internal.gc[] aw() {
        return new com.tencent.mapsdk.internal.gc[]{com.tencent.mapsdk.internal.y.b(((com.tencent.mapsdk.vector.VectorMap) this.e_).getProjection().a(new com.tencent.mapsdk.internal.fu(0.0d, 0.0d))), com.tencent.mapsdk.internal.y.b(((com.tencent.mapsdk.vector.VectorMap) this.e_).getProjection().a(new com.tencent.mapsdk.internal.fu(aj(), ak())))};
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void ax() {
        com.tencent.mapsdk.internal.bu buVar;
        java.lang.ref.WeakReference<com.tencent.mapsdk.internal.bu> weakReference = this.f52276av;
        if (weakReference == null || (buVar = weakReference.get()) == 0) {
            return;
        }
        if (al()) {
            if (buVar instanceof android.view.View) {
                if (this.f52185af == null) {
                    this.f52185af = new com.tencent.mapsdk.internal.pt((android.view.View) buVar, this);
                }
                this.f52185af.onTalkBackActivate(buVar.getView());
                return;
            }
            return;
        }
        com.tencent.mapsdk.internal.pt ptVar = this.f52185af;
        if (ptVar != null) {
            ptVar.onTalkBackDeActivate(buVar.getView());
            this.f52185af = null;
        }
    }

    private boolean ay() {
        android.os.Handler handler = this.f52209x;
        if (handler == null || !handler.getLooper().getThread().isAlive()) {
            return false;
        }
        com.tencent.tencentmap.mapsdk.maps.model.CameraPosition a17 = a();
        com.tencent.tencentmap.mapsdk.maps.model.CameraPosition cameraPosition = this.f52210y;
        if (cameraPosition != null && cameraPosition.equals(a17)) {
            return true;
        }
        this.f52209x.sendEmptyMessage(0);
        this.f52210y = a17;
        return true;
    }

    @Override // com.tencent.mapsdk.internal.az
    public final void A() {
        if (this.f52196k == null) {
            this.f52196k = new com.tencent.mapsdk.internal.rn(this);
        }
        this.f52196k.c();
    }

    @Override // com.tencent.mapsdk.internal.az
    public final void B() {
        com.tencent.mapsdk.internal.rn rnVar = this.f52196k;
        if (rnVar == null) {
            return;
        }
        rnVar.d();
    }

    @Override // com.tencent.mapsdk.internal.az
    public final boolean C() {
        com.tencent.mapsdk.internal.rn rnVar = this.f52196k;
        if (rnVar == null) {
            return false;
        }
        return rnVar.e();
    }

    @Override // com.tencent.mapsdk.internal.az
    public final boolean D() {
        return this.f52184ae;
    }

    @Override // com.tencent.mapsdk.internal.az
    public final com.tencent.mapsdk.internal.qj N() {
        return this.aT;
    }

    @Override // com.tencent.mapsdk.internal.az
    public final com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapClickListener W() {
        return this.f52202q;
    }

    @Override // com.tencent.mapsdk.internal.bo
    public final void Y() {
        super.Y();
        com.tencent.tencentmap.mapsdk.maps.TencentMapOptions tencentMapOptions = this.f49017e;
        if (tencentMapOptions != null) {
            this.aL = tencentMapOptions.isHandDrawMapEnable();
            this.f52182ac = this.f49017e.isMultipleInfoWindowEnable();
        }
        if ("qq".equals(com.tencent.mapsdk.internal.tf.f51581c) && android.text.TextUtils.isEmpty(com.tencent.tencentmap.mapsdk.maps.TencentMapInitializer.getExtra(aW))) {
            com.tencent.tencentmap.mapsdk.maps.TencentMapInitializer.addExtra(aW, aX);
            com.tencent.mapsdk.core.utils.log.LogUtil.a(this.f49018f).b(com.tencent.mapsdk.internal.la.a.f50264e, "qq channel async default.");
        }
        java.lang.String extra = com.tencent.tencentmap.mapsdk.maps.TencentMapInitializer.getExtra(aW);
        if (aX.equals(extra)) {
            this.aZ = true;
        } else if (aY.equals(extra)) {
            this.f52189ba = true;
        }
        com.tencent.mapsdk.core.utils.log.LogUtil.a(this.f49018f).c(com.tencent.mapsdk.internal.la.a.f50264e, "valueOfCopyConfig: ".concat(java.lang.String.valueOf(extra)));
    }

    @Override // com.tencent.mapsdk.internal.tz, com.tencent.mapsdk.internal.bo
    public final void Z() {
        super.Z();
        com.tencent.mapsdk.internal.sp spVar = new com.tencent.mapsdk.internal.sp(this);
        this.f52195j = spVar;
        android.content.Context context = this.f49016d;
        com.tencent.tencentmap.mapsdk.maps.model.OverSeaSource overSeaSource = com.tencent.tencentmap.mapsdk.maps.model.OverSeaSource.DEFAULT;
        com.tencent.mapsdk.internal.so soVar = new com.tencent.mapsdk.internal.so();
        spVar.f51514b = soVar;
        if (context != null) {
            soVar.f51502i = overSeaSource;
            com.tencent.mapsdk.internal.ko.a((com.tencent.mapsdk.internal.ko.g) new com.tencent.mapsdk.internal.so.AnonymousClass1(context, overSeaSource)).a((com.tencent.mapsdk.internal.ko.b.a) java.lang.Boolean.FALSE, (com.tencent.mapsdk.internal.ko.a<com.tencent.mapsdk.internal.ko.b.a>) null);
        }
        this.V = ((com.tencent.mapsdk.vector.VectorMap) this.e_).q();
        this.W = ((com.tencent.mapsdk.vector.VectorMap) this.e_).p();
        java.util.Iterator<com.tencent.mapsdk.internal.qa.b> it = this.f52190bb.keySet().iterator();
        while (it.hasNext()) {
            ((com.tencent.mapsdk.vector.VectorMap) this.e_).a(it.next());
        }
        this.f52190bb.clear();
    }

    @Override // com.tencent.mapsdk.internal.bo
    public final void aa() {
        super.aa();
        if (this.aL) {
            A();
        }
    }

    public final com.tencent.mapsdk.internal.bn.b ad() {
        return ((com.tencent.mapsdk.internal.ne) this.d_).F();
    }

    @Override // com.tencent.mapsdk.internal.tz, com.tencent.mapsdk.internal.ua.m
    public final void ae() {
        super.ae();
        com.tencent.mapsdk.internal.lb.c(com.tencent.mapsdk.internal.la.f50259ab, this.f49018f);
    }

    public final com.tencent.mapsdk.internal.gb af() {
        com.tencent.mapsdk.internal.gc[] ah6 = ah();
        com.tencent.mapsdk.internal.gc b17 = com.tencent.mapsdk.internal.y.b(((com.tencent.mapsdk.vector.VectorMap) this.e_).r());
        float s17 = ((com.tencent.mapsdk.vector.VectorMap) this.e_).s();
        com.tencent.mapsdk.internal.gb gbVar = this.aR;
        if (gbVar == null) {
            this.aR = new com.tencent.mapsdk.internal.gb(b17, ah6, s17);
        } else {
            gbVar.a(b17, ah6, s17);
        }
        return this.aR;
    }

    public final void ag() {
        C c17 = this.d_;
        if (c17 != 0) {
            com.tencent.mapsdk.internal.sm.a();
            c17.f49001d = !a(com.tencent.mapsdk.internal.sm.c(com.tencent.mapsdk.internal.sm.f51473a));
            com.tencent.mapsdk.internal.sp spVar = this.f52195j;
            if (spVar != null) {
                spVar.b();
            }
            boolean o17 = c17.o();
            if (this.f52197l != null) {
                com.tencent.mapsdk.internal.gb af6 = af();
                if (c17.f49001d && !c17.f49002e) {
                    com.tencent.mapsdk.internal.sm.a();
                    af6 = new com.tencent.mapsdk.internal.gb(com.tencent.mapsdk.internal.y.b(new com.tencent.map.lib.models.GeoPoint(new com.tencent.tencentmap.mapsdk.maps.model.LatLng(39.908823d, 116.39747d))), com.tencent.mapsdk.internal.sm.c(com.tencent.mapsdk.internal.sm.f51473a), 18.0f);
                }
                this.f52197l.a(af6, o17);
                this.f52197l.a(o17);
            }
        }
    }

    public final com.tencent.mapsdk.internal.gc[] ah() {
        com.tencent.map.lib.models.GeoPoint[] i17 = this.f52273as.f50506f.i();
        com.tencent.mapsdk.internal.gc[] gcVarArr = new com.tencent.mapsdk.internal.gc[4];
        for (int i18 = 0; i18 < 4; i18++) {
            gcVarArr[i18] = com.tencent.mapsdk.internal.y.b(i17[i18]);
        }
        return gcVarArr;
    }

    public final java.util.List<com.tencent.mapsdk.internal.an> ai() {
        this.f52191bc.clear();
        android.graphics.Rect q17 = this.f52273as.f50508h.q();
        for (com.tencent.mapsdk.internal.ez ezVar : this.f52273as.f50497J.a(com.tencent.mapsdk.internal.bh.a.DESC)) {
            if (ezVar instanceof com.tencent.mapsdk.internal.av) {
                com.tencent.mapsdk.internal.an anVar = ((com.tencent.mapsdk.internal.av) ezVar).f48864b;
                if (a(anVar.getPosition(), q17)) {
                    this.f52191bc.add(anVar);
                }
            }
        }
        return this.f52191bc;
    }

    @Override // com.tencent.mapsdk.internal.az
    public final java.lang.String f() {
        return this.f52193h;
    }

    @Override // com.tencent.mapsdk.internal.az
    public final void g(boolean z17) {
        this.f52266al = z17;
    }

    @Override // com.tencent.mapsdk.internal.az
    public final void h(boolean z17) {
        if (this.O != z17) {
            com.tencent.mapsdk.internal.ga gaVar = new com.tencent.mapsdk.internal.ga();
            gaVar.f49553f = 2;
            java.util.Iterator<com.tencent.mapsdk.internal.fh> it = this.f52201p.iterator();
            while (it.hasNext()) {
                it.next().a(gaVar);
            }
        }
        this.O = z17;
        com.tencent.mapsdk.internal.ad adVar = ((com.tencent.mapsdk.vector.VectorMap) this.e_).f52512o.f50508h;
        adVar.G = z17;
        adVar.f48829z.i().b(adVar.G);
        ((com.tencent.mapsdk.vector.VectorMap) this.e_).o();
    }

    @Override // com.tencent.mapsdk.internal.az
    public final boolean i() {
        return this.S;
    }

    @Override // com.tencent.mapsdk.internal.az
    public final boolean j() {
        return this.T;
    }

    @Override // com.tencent.mapsdk.internal.az
    public final boolean k() {
        return this.U;
    }

    @Override // com.tencent.mapsdk.internal.az
    public final void l() {
        android.os.Handler handler = this.f52209x;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        android.os.Handler handler2 = this.D;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
        java.util.List<com.tencent.mapsdk.internal.fn> list = this.aF;
        if (list != null) {
            list.clear();
            this.aF = null;
        }
        m();
        this.f52202q = null;
        this.aD = null;
        this.aC = null;
        this.f52205t = null;
        this.f52211z = null;
        this.f52200o = null;
    }

    @Override // com.tencent.mapsdk.internal.az
    public final void m() {
        synchronized (this.f52192g) {
            this.f52273as.f50497J.a();
        }
    }

    public final boolean n(boolean z17) {
        android.os.Handler handler = this.f52209x;
        if (handler == null || !handler.getLooper().getThread().isAlive()) {
            return false;
        }
        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50206g, "send onStable Event");
        this.f52209x.sendEmptyMessage(z17 ? 2 : 1);
        return true;
    }

    @Override // com.tencent.mapsdk.internal.az
    public final void o() {
        if (this.f52201p.isEmpty()) {
            return;
        }
        com.tencent.mapsdk.internal.ga gaVar = new com.tencent.mapsdk.internal.ga();
        gaVar.f49553f = 0;
        gaVar.f49554g = this.X;
        gaVar.f49555h = this.Y;
        java.util.Iterator<com.tencent.mapsdk.internal.fh> it = this.f52201p.iterator();
        while (it.hasNext()) {
            it.next().a(gaVar);
        }
    }

    @Override // com.tencent.mapsdk.internal.fa
    public final void o_() {
        com.tencent.mapsdk.internal.ad adVar = ((com.tencent.mapsdk.vector.VectorMap) this.e_).f52512o.f50508h;
        adVar.o();
        adVar.j();
        com.tencent.tencentmap.mapsdk.maps.TencentMap.OnCompassClickedListener onCompassClickedListener = this.f52211z;
        if (onCompassClickedListener != null) {
            onCompassClickedListener.onCompassClicked();
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.OnCameraChangeListener
    public void onCameraChange(final com.tencent.tencentmap.mapsdk.maps.model.CameraPosition cameraPosition) {
        this.f52270ap = false;
        this.f52271aq = true;
        com.tencent.mapsdk.internal.ko.a(new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.tr.7
            @Override // java.lang.Runnable
            public final void run() {
                java.util.List<com.tencent.tencentmap.mapsdk.maps.TencentMap.OnCameraChangeListener> list = com.tencent.mapsdk.internal.tr.this.f52204s;
                if (list != null) {
                    for (com.tencent.tencentmap.mapsdk.maps.TencentMap.OnCameraChangeListener onCameraChangeListener : list) {
                        if (onCameraChangeListener != null) {
                            onCameraChangeListener.onCameraChange(cameraPosition);
                        }
                    }
                }
                if (com.tencent.mapsdk.internal.tr.this.B != null) {
                    com.tencent.mapsdk.internal.tr.this.B.onCameraChange(cameraPosition);
                }
                if (com.tencent.mapsdk.internal.tr.this.C != null) {
                    com.tencent.mapsdk.internal.tr.this.C.onCameraChange(cameraPosition);
                }
            }
        });
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.OnCameraChangeListener
    public void onCameraChangeFinished(final com.tencent.tencentmap.mapsdk.maps.model.CameraPosition cameraPosition) {
        if (this.f52272ar == 0 && this.f52270ap) {
            this.f52271aq = false;
            com.tencent.mapsdk.internal.ko.a(new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.tr.8
                @Override // java.lang.Runnable
                public final void run() {
                    java.util.List<com.tencent.tencentmap.mapsdk.maps.TencentMap.OnCameraChangeListener> list = com.tencent.mapsdk.internal.tr.this.f52204s;
                    if (list != null) {
                        for (com.tencent.tencentmap.mapsdk.maps.TencentMap.OnCameraChangeListener onCameraChangeListener : list) {
                            if (onCameraChangeListener != null) {
                                onCameraChangeListener.onCameraChangeFinished(cameraPosition);
                            }
                        }
                    }
                    if (com.tencent.mapsdk.internal.tr.this.B != null) {
                        com.tencent.mapsdk.internal.tr.this.B.onCameraChangeFinished(cameraPosition);
                    }
                    if (com.tencent.mapsdk.internal.tr.this.C != null) {
                        com.tencent.mapsdk.internal.tr.this.C.onCameraChangeFinished(cameraPosition);
                    }
                }
            });
        }
    }

    @Override // com.tencent.mapsdk.internal.tz, com.tencent.mapsdk.internal.bo, com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onCreated() {
        super.onCreated();
        this.f52209x = new com.tencent.mapsdk.internal.tj(this, com.tencent.mapsdk.internal.ko.a("gesture"));
        this.aT = new com.tencent.mapsdk.internal.qj((com.tencent.mapsdk.internal.bd) this.d_);
        ((com.tencent.mapsdk.vector.VectorMap) this.e_).a(this.aH);
        a(this.f52181ab);
        ((com.tencent.mapsdk.vector.VectorMap) this.e_).a(this.aG);
        ((com.tencent.mapsdk.vector.VectorMap) this.e_).a(this.aJ);
        ((com.tencent.mapsdk.vector.VectorMap) this.e_).a(this.aH);
        ((com.tencent.mapsdk.vector.VectorMap) this.e_).a(this.aI);
        ((com.tencent.mapsdk.vector.VectorMap) this.e_).a((com.tencent.mapsdk.internal.fa) this);
        this.f52199n = new com.tencent.mapsdk.internal.ac(this, ad().f49011c);
    }

    @Override // com.tencent.mapsdk.internal.tz, com.tencent.mapsdk.internal.bo, com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onDestroy() {
        com.tencent.mapsdk.internal.v vVar;
        ((com.tencent.mapsdk.vector.VectorMap) this.e_).a((com.tencent.mapsdk.internal.fa) null);
        com.tencent.mapsdk.internal.ne neVar = this.f52273as;
        if (neVar != null && (vVar = neVar.f50520t) != null) {
            vVar.f52427t.clear();
        }
        java.util.List<com.tencent.tencentmap.mapsdk.maps.TencentMap.OnCameraChangeListener> list = this.f52204s;
        if (list != null) {
            list.clear();
        }
        com.tencent.mapsdk.internal.pt ptVar = this.f52185af;
        if (ptVar != null) {
            ((com.tencent.mapsdk.vector.VectorMap) ptVar.f50782c.e_).b(ptVar);
            ptVar.accessibleTouchItems.clear();
            ptVar.f50780a.clear();
            ptVar.f50781b.clear();
        }
        this.f52208w = null;
        this.f52207v = null;
        this.f52186ag = null;
        this.A = null;
        this.B = null;
        this.C = null;
        this.f52206u = null;
        this.f52190bb.clear();
        super.onDestroy();
        this.aN = true;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.OnIndoorStateChangeListener
    public boolean onIndoorBuildingDeactivated() {
        return ((com.tencent.mapsdk.internal.ne) this.d_).f50497J.a((com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding) null);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.OnIndoorStateChangeListener
    public boolean onIndoorBuildingFocused() {
        return false;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.OnIndoorStateChangeListener
    public boolean onIndoorLevelActivated(com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding indoorBuilding) {
        return ((com.tencent.mapsdk.internal.ne) this.d_).f50497J.a(indoorBuilding);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mapsdk.internal.tz, com.tencent.mapsdk.internal.bo, com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onResume() {
        com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding indoorBuilding;
        com.tencent.mapsdk.internal.bu buVar;
        super.onResume();
        this.f52272ar = 0;
        this.f52271aq = false;
        java.lang.ref.WeakReference<com.tencent.mapsdk.internal.bu> weakReference = this.f52276av;
        if (weakReference != null && (buVar = weakReference.get()) != 0) {
            if (!al()) {
                com.tencent.mapsdk.internal.pt ptVar = this.f52185af;
                if (ptVar != null) {
                    ptVar.onTalkBackDeActivate(buVar.getView());
                    this.f52185af = null;
                }
            } else if (buVar instanceof android.view.View) {
                if (this.f52185af == null) {
                    this.f52185af = new com.tencent.mapsdk.internal.pt((android.view.View) buVar, this);
                }
                this.f52185af.onTalkBackActivate(buVar.getView());
            }
        }
        com.tencent.mapsdk.internal.ac acVar = this.f52199n;
        if (acVar == null || (indoorBuilding = acVar.f48779g) == null) {
            return;
        }
        java.lang.String buidlingId = indoorBuilding.getBuidlingId();
        int activeLevelIndex = acVar.f48779g.getActiveLevelIndex();
        java.util.List<com.tencent.tencentmap.mapsdk.maps.model.IndoorLevel> levels = acVar.f48779g.getLevels();
        if (levels == null || activeLevelIndex >= levels.size()) {
            return;
        }
        java.lang.String name = levels.get(activeLevelIndex).getName();
        if (com.tencent.mapsdk.internal.hr.a(buidlingId) || com.tencent.mapsdk.internal.hr.a(name)) {
            return;
        }
        acVar.f48777e.a(buidlingId, name);
    }

    @Override // com.tencent.mapsdk.internal.tz, com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        com.tencent.mapsdk.internal.bb bbVar = this.f52203r;
        if (bbVar != null) {
            bbVar.a(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.tencent.mapsdk.internal.az
    public final boolean p() {
        return this.X;
    }

    @Override // com.tencent.mapsdk.internal.az
    public final boolean q() {
        return this.Y;
    }

    @Override // com.tencent.mapsdk.internal.az
    public final com.tencent.mapsdk.internal.qs r() {
        return this.f52198m;
    }

    @Override // com.tencent.mapsdk.internal.az
    public final com.tencent.mapsdk.internal.ac s() {
        return this.f52199n;
    }

    @Override // com.tencent.mapsdk.internal.az
    public final com.tencent.map.lib.models.GeoPoint t() {
        if (this.aK == null) {
            if (this.G == Integer.MIN_VALUE) {
                this.G = this.Z / 2;
            }
            if (this.H == Integer.MIN_VALUE) {
                this.H = this.f52180aa / 2;
            }
            this.aK = ((com.tencent.mapsdk.vector.VectorMap) this.e_).getProjection().a(new com.tencent.mapsdk.internal.fu(this.G, this.H));
        }
        return this.aK;
    }

    @Override // com.tencent.mapsdk.internal.az
    public final int u() {
        return this.I;
    }

    @Override // com.tencent.mapsdk.internal.az
    public final int v() {
        return this.f52179J;
    }

    @Override // com.tencent.mapsdk.internal.az
    public final int w() {
        return this.G;
    }

    @Override // com.tencent.mapsdk.internal.az
    public final int x() {
        return this.H;
    }

    @Override // com.tencent.mapsdk.internal.az
    public final com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapPoiClickListener y() {
        return this.f52208w;
    }

    @Override // com.tencent.mapsdk.internal.az
    public final boolean z() {
        return this.aM;
    }

    @Override // com.tencent.mapsdk.internal.az
    public final void a(android.os.Handler handler, android.graphics.Bitmap.Config config, int i17) {
        this.D = handler;
        this.F = config;
        if (i17 >= 0) {
            this.E = android.os.SystemClock.elapsedRealtime() + i17;
        } else {
            this.E = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
        }
        J();
        H();
    }

    @Override // com.tencent.mapsdk.internal.az
    public final void b(java.lang.String str) {
        synchronized (this.f52192g) {
            this.f52193h = str;
        }
    }

    @Override // com.tencent.mapsdk.internal.az
    public final void c(boolean z17) {
        this.Q = z17;
    }

    public final void e(int i17, int i18) {
        java.util.List<com.tencent.mapsdk.internal.fn> list = this.aF;
        if (list != null) {
            int size = list.size();
            for (int i19 = 0; i19 < size; i19++) {
                com.tencent.mapsdk.internal.fn fnVar = this.aF.get(i19);
                if (fnVar != null) {
                    fnVar.b(i17, i18);
                }
            }
        }
        C c17 = this.d_;
        if (c17 != 0) {
            java.util.Iterator<com.tencent.mapsdk.internal.ez> it = ((com.tencent.mapsdk.internal.ne) c17).f50497J.f48946a.values().iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.az
    public final void f(boolean z17) {
        this.U = z17;
    }

    @Override // com.tencent.mapsdk.internal.az
    public final boolean g() {
        return this.O;
    }

    @Override // com.tencent.mapsdk.internal.az
    public final void i(boolean z17) {
        if (z17 && !this.f52195j.f51514b.f51498e) {
            ((com.tencent.mapsdk.vector.VectorMap) this.e_).a((com.tencent.mapsdk.internal.ba) null);
        } else {
            ((com.tencent.mapsdk.vector.VectorMap) this.e_).a(this.aG);
        }
    }

    @Override // com.tencent.mapsdk.internal.az
    public final void j(boolean z17) {
        this.P = z17;
    }

    @Override // com.tencent.mapsdk.internal.az
    public final void k(boolean z17) {
        this.f52184ae = z17;
    }

    @Override // com.tencent.mapsdk.internal.az
    public final void c(int i17, int i18) {
        this.G = i17;
        this.H = i18;
    }

    @Override // com.tencent.mapsdk.internal.az
    public final void d(boolean z17) {
        this.S = z17;
    }

    @Override // com.tencent.mapsdk.internal.az
    public final boolean f(float f17, float f18) {
        com.tencent.tencentmap.mapsdk.maps.model.MapPoi mapPoi;
        com.tencent.mapsdk.internal.sa saVar;
        com.tencent.mapsdk.engine.jni.models.TappedElement a17 = ((com.tencent.mapsdk.vector.VectorMap) this.e_).a(f17, f18);
        if (a17 == null) {
            return false;
        }
        int i17 = a17.type;
        if (i17 != 1) {
            if (i17 == 4) {
                com.tencent.mapsdk.internal.ne neVar = this.f52273as;
                if (neVar == null || (saVar = neVar.A) == null) {
                    return false;
                }
                com.tencent.tencentmap.mapsdk.maps.model.TrafficEvent a18 = saVar.a((int) a17.itemId);
                com.tencent.tencentmap.mapsdk.maps.TencentMap.OnTrafficEventClickListener onTrafficEventClickListener = this.f52186ag;
                if (onTrafficEventClickListener == null || a18 == null) {
                    return false;
                }
                onTrafficEventClickListener.onTrafficEventClicked(a18);
                return true;
            }
            if (i17 != 8) {
                return false;
            }
        } else if (this.f52208w != null) {
            if (a17.itemType == 1) {
                com.tencent.tencentmap.mapsdk.maps.model.IndoorMapPoi indoorMapPoi = new com.tencent.tencentmap.mapsdk.maps.model.IndoorMapPoi();
                indoorMapPoi.buildingName = a17.buildingName;
                indoorMapPoi.buildingId = a17.buildingId;
                indoorMapPoi.floorName = a17.floorName;
                mapPoi = indoorMapPoi;
            } else {
                mapPoi = new com.tencent.tencentmap.mapsdk.maps.model.MapPoi();
            }
            mapPoi.name = a17.name;
            mapPoi.position = new com.tencent.map.lib.models.GeoPoint((int) (java.lang.Math.toDegrees((java.lang.Math.atan(java.lang.Math.exp(3.141592653589793d - (a17.pixelY / 4.272282972352698E7d))) - 0.7853981633974483d) * 2.0d) * 1000000.0d), (int) (java.lang.Math.toDegrees((a17.pixelX / 4.272282972352698E7d) - 3.141592653589793d) * 1000000.0d)).toLatLng();
            mapPoi.poiId = a17.poiId;
            this.f52208w.onClicked(mapPoi);
        }
        return true;
    }

    @Override // com.tencent.mapsdk.internal.az
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final com.tencent.mapsdk.internal.av d(final float f17, final float f18) {
        final com.tencent.mapsdk.internal.av[] avVarArr = {null};
        synchronized (this.f52192g) {
            com.tencent.map.tools.Util.where(((com.tencent.mapsdk.internal.ne) this.d_).f50497J.f48946a.values(), new com.tencent.map.tools.ReturnCallback<java.lang.Boolean, com.tencent.mapsdk.internal.ez>() { // from class: com.tencent.mapsdk.internal.tr.4
                private java.lang.Boolean a(com.tencent.mapsdk.internal.ez ezVar) {
                    if (ezVar == null || !ezVar.isVisible()) {
                        return java.lang.Boolean.FALSE;
                    }
                    if ((ezVar instanceof com.tencent.mapsdk.internal.av) && ezVar.onTap(f17, f18)) {
                        avVarArr[0] = (com.tencent.mapsdk.internal.av) ezVar;
                        return java.lang.Boolean.TRUE;
                    }
                    return java.lang.Boolean.FALSE;
                }

                @Override // com.tencent.map.tools.ReturnCallback
                public final /* synthetic */ java.lang.Boolean callback(com.tencent.mapsdk.internal.ez ezVar) {
                    com.tencent.mapsdk.internal.ez ezVar2 = ezVar;
                    if (ezVar2 == null || !ezVar2.isVisible()) {
                        return java.lang.Boolean.FALSE;
                    }
                    if ((ezVar2 instanceof com.tencent.mapsdk.internal.av) && ezVar2.onTap(f17, f18)) {
                        avVarArr[0] = (com.tencent.mapsdk.internal.av) ezVar2;
                        return java.lang.Boolean.TRUE;
                    }
                    return java.lang.Boolean.FALSE;
                }
            });
        }
        return avVarArr[0];
    }

    @Override // com.tencent.mapsdk.internal.az
    public final boolean d(java.lang.String str) {
        boolean z17;
        com.tencent.mapsdk.internal.ao f_;
        if (str == null) {
            return false;
        }
        synchronized (this.f52192g) {
            com.tencent.mapsdk.internal.bh bhVar = this.f52273as.f50497J;
            com.tencent.mapsdk.internal.ez remove = bhVar.f48946a.remove(str);
            if (remove != null) {
                if (remove instanceof com.tencent.mapsdk.internal.av) {
                    bhVar.f48947b.remove(remove);
                } else if (remove instanceof com.tencent.mapsdk.internal.ar) {
                    bhVar.f48949d.remove(remove);
                } else if (remove instanceof com.tencent.mapsdk.internal.ax) {
                    bhVar.f48950e.remove(remove);
                } else if (remove instanceof com.tencent.mapsdk.internal.as) {
                    bhVar.f48952g.remove(remove);
                } else if (remove instanceof com.tencent.mapsdk.internal.am) {
                    bhVar.f48948c.remove(remove);
                } else if (remove instanceof com.tencent.mapsdk.internal.aw) {
                    bhVar.f48951f.remove(remove);
                }
                if ((remove instanceof com.tencent.mapsdk.internal.au) && (f_ = ((com.tencent.mapsdk.internal.au) remove).f_()) != null) {
                    bhVar.f48953h.remove(f_);
                }
            }
            z17 = remove != null;
            if (z17) {
                ((com.tencent.mapsdk.vector.VectorMap) this.e_).o();
            }
        }
        return z17;
    }

    @Override // com.tencent.mapsdk.internal.az
    public final void n() {
        int s17 = ((com.tencent.mapsdk.vector.VectorMap) this.e_).s();
        this.X = true;
        this.Y = true;
        if (s17 <= this.W) {
            this.Y = false;
        } else if (s17 >= this.V) {
            this.X = false;
        }
        if (this.f52201p.isEmpty()) {
            return;
        }
        com.tencent.mapsdk.internal.ga gaVar = new com.tencent.mapsdk.internal.ga();
        gaVar.f49553f = 0;
        gaVar.f49554g = this.X;
        gaVar.f49555h = this.Y;
        java.util.Iterator<com.tencent.mapsdk.internal.fh> it = this.f52201p.iterator();
        while (it.hasNext()) {
            it.next().a(gaVar);
        }
    }

    private void c(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnCameraChangeListener onCameraChangeListener) {
        this.C = onCameraChangeListener;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ac, code lost:
    
        if (r1 != 8) goto L115;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:87:0x023d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x023e  */
    /* JADX WARN: Type inference failed for: r3v29, types: [com.tencent.tencentmap.mapsdk.maps.model.Marker] */
    @Override // com.tencent.mapsdk.internal.az
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(final float r13, final float r14) {
        /*
            Method dump skipped, instructions count: 617
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.tr.b(float, float):boolean");
    }

    @Override // com.tencent.mapsdk.internal.az
    public final boolean c(float f17, float f18) {
        com.tencent.mapsdk.internal.tk tkVar;
        com.tencent.mapsdk.internal.ne neVar = this.f52273as;
        com.tencent.mapsdk.internal.fb fbVar = this.f52181ab;
        if (neVar.M == null) {
            com.tencent.mapsdk.internal.nh<?> nhVar = neVar.f50510j.f48965e.get(com.tencent.mapsdk.internal.nr.class);
            if ((nhVar != null ? nhVar.f() : false) && (tkVar = neVar.f50506f) != null) {
                tkVar.f51660d.scheduleClickOnNextRender(tkVar.f51661e, f17, f18);
                neVar.M = fbVar;
                return true;
            }
        }
        neVar.M = null;
        return false;
    }

    @Override // com.tencent.mapsdk.internal.bo
    public final void m(boolean z17) {
        super.m(z17);
        ag();
    }

    @Override // com.tencent.mapsdk.internal.az
    public final void a(java.lang.String str) {
        b(str);
    }

    @Override // com.tencent.mapsdk.internal.az
    public final boolean a(float f17, float f18) {
        com.tencent.mapsdk.internal.av d17;
        if (this.f52203r != null && (d17 = d(f17, f18)) != null) {
            this.f52203r.a(d17.getId());
            a(d17, true);
            return true;
        }
        if (this.f52205t == null || !this.f52266al) {
            return false;
        }
        this.f52205t.onMapLongClick(com.tencent.mapsdk.internal.kr.a(((com.tencent.mapsdk.vector.VectorMap) this.e_).getProjection().a(new com.tencent.mapsdk.internal.fu(f17, f18))));
        return false;
    }

    @Override // com.tencent.mapsdk.internal.az
    public final com.tencent.mapsdk.internal.so e() {
        return this.f52195j.f51514b;
    }

    @Override // com.tencent.mapsdk.internal.az
    public final void e(boolean z17) {
        this.T = z17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e2, code lost:
    
        r5 = com.tencent.mapsdk.internal.pw.a(r0.getId(), r5);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f7 A[RETURN] */
    @Override // com.tencent.mapsdk.internal.az
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(float r12, float r13) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.tr.e(float, float):boolean");
    }

    @Override // com.tencent.mapsdk.internal.az
    public final com.tencent.mapsdk.internal.po c(java.lang.String str) {
        C c17 = this.d_;
        if (c17 == 0) {
            return null;
        }
        com.tencent.mapsdk.internal.ez a17 = ((com.tencent.mapsdk.internal.ne) c17).f50497J.a(str);
        if (!(a17 instanceof com.tencent.mapsdk.internal.au)) {
            return null;
        }
        com.tencent.tencentmap.mapsdk.maps.interfaces.Visible f_ = ((com.tencent.mapsdk.internal.au) a17).f_();
        if (f_ instanceof com.tencent.mapsdk.internal.po) {
            return (com.tencent.mapsdk.internal.po) f_;
        }
        return null;
    }

    @Override // com.tencent.mapsdk.internal.az
    public final boolean h() {
        return this.R;
    }

    private boolean h(float f17, float f18) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap.OnPolygonClickListener onPolygonClickListener;
        com.tencent.tencentmap.mapsdk.maps.TencentMap.OnPolylineClickListener onPolylineClickListener;
        com.tencent.mapsdk.internal.bh bhVar = this.f52273as.f50497J;
        java.util.List<com.tencent.mapsdk.internal.ez> a17 = bhVar.a(com.tencent.mapsdk.internal.bh.a.DESC);
        int size = a17.size();
        com.tencent.mapsdk.internal.ez ezVar = null;
        boolean z17 = false;
        for (int i17 = 0; i17 < size; i17++) {
            ezVar = a17.get(i17);
            z17 = a(ezVar, f17, f18);
            if (z17) {
                break;
            }
        }
        if (!z17) {
            com.tencent.mapsdk.internal.bh.a aVar = com.tencent.mapsdk.internal.bh.a.DESC;
            java.util.ArrayList arrayList = new java.util.ArrayList(bhVar.f48950e);
            arrayList.addAll(bhVar.f48949d);
            java.util.Collections.sort(arrayList, aVar.f48960c);
            int size2 = arrayList.size();
            for (int i18 = 0; i18 < size2; i18++) {
                ezVar = (com.tencent.mapsdk.internal.ez) arrayList.get(i18);
                z17 = a(ezVar, f17, f18);
                if (z17) {
                    break;
                }
            }
        }
        if (!z17) {
            java.util.List<com.tencent.tencentmap.mapsdk.maps.model.Polygon> c17 = bhVar.c();
            for (int size3 = c17.size() - 1; size3 >= 0; size3--) {
                ezVar = (com.tencent.mapsdk.internal.ez) c17.get(size3);
                z17 = a(ezVar, f17, f18);
                if (z17) {
                    break;
                }
            }
        }
        if (z17) {
            if (ezVar instanceof com.tencent.mapsdk.internal.av) {
                return a((com.tencent.mapsdk.internal.av) ezVar, false);
            }
            if (ezVar instanceof com.tencent.mapsdk.internal.ax) {
                com.tencent.mapsdk.internal.ax axVar = (com.tencent.mapsdk.internal.ax) ezVar;
                if (!axVar.isClickable() || (onPolylineClickListener = this.f52278ax) == null) {
                    return false;
                }
                onPolylineClickListener.onPolylineClick(axVar, ((com.tencent.mapsdk.internal.ne) this.d_).f50513m.fromScreenLocation(new android.graphics.Point((int) f17, (int) f18)));
            } else {
                if (!(ezVar instanceof com.tencent.mapsdk.internal.aw)) {
                    return false;
                }
                com.tencent.mapsdk.internal.aw awVar = (com.tencent.mapsdk.internal.aw) ezVar;
                if (!awVar.isClickable() || (onPolygonClickListener = this.f52279ay) == null) {
                    return false;
                }
                onPolygonClickListener.onPolygonClick(awVar, ((com.tencent.mapsdk.internal.ne) this.d_).f50513m.fromScreenLocation(new android.graphics.Point((int) f17, (int) f18)));
            }
            return true;
        }
        return bhVar.f48955j.a(f17, f18);
    }

    @Override // com.tencent.mapsdk.internal.az
    public final void a(com.tencent.mapsdk.internal.fn fnVar) {
        if (this.aF == null) {
            this.aF = new java.util.ArrayList();
        }
        if (this.aF.contains(fnVar)) {
            return;
        }
        this.aF.add(fnVar);
    }

    @Override // com.tencent.mapsdk.internal.az
    public final void a(boolean z17) {
        this.f52194i = z17;
    }

    @Override // com.tencent.mapsdk.internal.az
    public final void a(com.tencent.mapsdk.internal.bb bbVar) {
        this.f52203r = bbVar;
    }

    @Override // com.tencent.mapsdk.internal.az
    public final void a(com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener tencentMapGestureListener) {
        if (this.f52265ak == null) {
            this.f52265ak = new com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListenerList();
        }
        this.f52265ak.addListener(tencentMapGestureListener);
    }

    @Override // com.tencent.mapsdk.internal.az
    public final void d(int i17, int i18) {
        this.I = i17;
        this.f52179J = i18;
    }

    @Override // com.tencent.mapsdk.internal.az
    public final void a(int i17) {
        this.aP = i17;
        a(this.aO, i17);
        H();
    }

    @Override // com.tencent.mapsdk.internal.az
    public final void a(int i17, int i18) {
        this.aO = i17;
        this.aP = i18;
        ((com.tencent.mapsdk.vector.VectorMap) this.e_).c(i17, i18);
        H();
    }

    @Override // com.tencent.mapsdk.internal.az
    public final void a(float f17) {
        if (this.aQ == f17) {
            return;
        }
        this.aQ = f17;
        if (this.f52201p.isEmpty()) {
            return;
        }
        com.tencent.mapsdk.internal.ga gaVar = new com.tencent.mapsdk.internal.ga();
        gaVar.f49553f = 1;
        gaVar.f49556i = ((com.tencent.mapsdk.vector.VectorMap) this.e_).s();
        gaVar.f49557j = ((com.tencent.mapsdk.vector.VectorMap) this.e_).getProjection().a(new android.graphics.Point(0, this.f52180aa / 2), new android.graphics.Point(this.Z, this.f52180aa / 2));
        java.util.Iterator<com.tencent.mapsdk.internal.fh> it = this.f52201p.iterator();
        while (it.hasNext()) {
            it.next().a(gaVar);
        }
    }

    @Override // com.tencent.mapsdk.internal.az
    public final void a(com.tencent.mapsdk.internal.fh fhVar) {
        this.f52201p.remove(fhVar);
        this.f52201p.add(fhVar);
    }

    @Override // com.tencent.mapsdk.internal.az
    public final void a(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnDismissCallback onDismissCallback) {
        this.f52206u = onDismissCallback;
    }

    @Override // com.tencent.mapsdk.internal.az
    public final void a(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnIndoorStateChangeListener onIndoorStateChangeListener) {
        this.f52207v = onIndoorStateChangeListener;
    }

    @Override // com.tencent.mapsdk.internal.az
    public final void a(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapPoiClickListener onMapPoiClickListener) {
        this.f52208w = onMapPoiClickListener;
    }

    @Override // com.tencent.mapsdk.internal.az
    public final void a(com.tencent.mapsdk.internal.sj sjVar) {
        this.f52197l = sjVar;
    }

    @Override // com.tencent.mapsdk.internal.az
    public final void a(com.tencent.mapsdk.internal.qs qsVar) {
        this.f52198m = qsVar;
    }

    private void a(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnScaleViewChangedListener onScaleViewChangedListener) {
        this.A = onScaleViewChangedListener;
    }

    @Override // com.tencent.mapsdk.internal.az
    public final void a(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnCameraChangeListener onCameraChangeListener) {
        java.util.List<com.tencent.tencentmap.mapsdk.maps.TencentMap.OnCameraChangeListener> list = this.f52204s;
        if (list != null && onCameraChangeListener != null) {
            list.add(onCameraChangeListener);
        }
        if ((onCameraChangeListener == null) && !this.f52195j.f51514b.f51498e) {
            ((com.tencent.mapsdk.vector.VectorMap) this.e_).a((com.tencent.mapsdk.internal.ba) null);
        } else {
            ((com.tencent.mapsdk.vector.VectorMap) this.e_).a(this.aG);
        }
    }

    @Override // com.tencent.mapsdk.internal.az
    public final void a(com.tencent.tencentmap.mapsdk.maps.model.OverSeaTileProvider overSeaTileProvider) {
        com.tencent.mapsdk.internal.sp spVar = this.f52195j;
        if (spVar == null || spVar.f51515c == overSeaTileProvider) {
            return;
        }
        com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50208i, "设置自定义海外图源，old[" + spVar.f51515c + "] to new[" + overSeaTileProvider + "]");
        spVar.f51515c = overSeaTileProvider;
        spVar.f51517e = true;
        com.tencent.mapsdk.internal.so soVar = spVar.f51514b;
        soVar.f51504k = overSeaTileProvider;
        java.util.List<com.tencent.mapsdk.internal.ss> c17 = soVar.c();
        com.tencent.mapsdk.internal.tr trVar = spVar.f51513a;
        if (trVar != null) {
            trVar.a(false, c17);
        }
        spVar.a();
    }

    @Override // com.tencent.mapsdk.internal.tz, com.tencent.mapsdk.internal.ua.m
    public final void a(javax.microedition.khronos.opengles.GL10 gl10, int i17, int i18) {
        super.a(gl10, i17, i18);
        this.Z = i17;
        this.f52180aa = i18;
        c((int) (i17 * this.K), (int) (i18 * this.L));
        d((int) (this.Z * this.M), (int) (this.f52180aa * this.N));
    }

    @Override // com.tencent.mapsdk.internal.tz, com.tencent.mapsdk.internal.ua.m
    public final boolean a(javax.microedition.khronos.opengles.GL10 gl10) {
        int i17;
        com.tencent.mapsdk.internal.bh bhVar;
        final com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapFrameFinishCallback X = X();
        if (!this.f52268an) {
            if (X != null) {
                com.tencent.mapsdk.internal.ko.a(new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.tr.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        X.onMapFrameStart();
                    }
                });
            }
            this.f52268an = true;
        }
        C c17 = this.d_;
        boolean z17 = false;
        if (c17 != 0 && (bhVar = ((com.tencent.mapsdk.internal.ne) c17).f50497J) != null) {
            synchronized (this.f52192g) {
                com.tencent.mapsdk.internal.ez[] ezVarArr = {null};
                java.util.ArrayList arrayList = new java.util.ArrayList(bhVar.f48946a.values());
                java.util.Collections.sort(arrayList, com.tencent.mapsdk.internal.bh.a.ASC.f48960c);
                com.tencent.map.tools.Util.foreach(arrayList, new com.tencent.mapsdk.internal.tr.AnonymousClass1(ezVarArr, gl10));
                com.tencent.mapsdk.internal.ez ezVar = ezVarArr[0];
                if (ezVar != null) {
                    ezVar.a(gl10);
                }
            }
        }
        boolean a17 = super.a(gl10);
        if (!this.aV) {
            if (ab() != com.tencent.tencentmap.mapsdk.maps.model.MapViewType.SurfaceView || (i17 = this.aU) == 1) {
                com.tencent.mapsdk.core.utils.log.LogUtil.a(this.f49018f).b(com.tencent.mapsdk.internal.la.a.f50264e, "asyncCopyConfig: " + this.aZ + ", halfSyncCopyConfig: " + this.f52189ba);
                if (this.aZ) {
                    com.tencent.mapsdk.internal.qe.a(I(), ad().f49011c);
                } else if (this.f52189ba) {
                    android.content.Context I = I();
                    java.lang.String str = ad().f49011c;
                    if (I != null) {
                        java.lang.String a18 = com.tencent.mapsdk.internal.mz.a(I, (com.tencent.tencentmap.mapsdk.maps.TencentMapOptions) null).a(str);
                        com.tencent.mapsdk.internal.mv a19 = com.tencent.mapsdk.internal.mx.a(I, str);
                        com.tencent.mapsdk.internal.mw.c(a19, a18);
                        com.tencent.mapsdk.internal.mw.d(a19, a18);
                        com.tencent.mapsdk.internal.mw.a(I, a19, a18, com.tencent.mapsdk.internal.ep.f49359d);
                        com.tencent.mapsdk.internal.mw.a(I, a19, a18, com.tencent.mapsdk.internal.ep.f49357b);
                        com.tencent.mapsdk.internal.mw.a(I, a19, a18, com.tencent.mapsdk.internal.ep.f49358c);
                        com.tencent.mapsdk.internal.mw.a(I, a19, a18, com.tencent.mapsdk.internal.ep.f49360e);
                        com.tencent.mapsdk.internal.mw.a(I, a19, a18, com.tencent.mapsdk.internal.ep.f49361f);
                        com.tencent.mapsdk.internal.mw.a(I, a19, a18, com.tencent.mapsdk.internal.ep.f49362g);
                        com.tencent.mapsdk.internal.mw.a(I, a19, a18, com.tencent.mapsdk.internal.ep.f49363h);
                    }
                    com.tencent.mapsdk.vector.VectorMap vectorMap = (com.tencent.mapsdk.vector.VectorMap) this.e_;
                    if (vectorMap != null) {
                        vectorMap.u();
                    }
                }
                this.aV = true;
            } else if (a17) {
                this.aU = i17 + 1;
            }
        }
        if (!this.f52269ao && K()) {
            if (X != null) {
                com.tencent.mapsdk.internal.ko.a(new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.tr.6
                    @Override // java.lang.Runnable
                    public final void run() {
                        X.onMapFrameFinished();
                    }
                });
            }
            this.f52269ao = true;
        }
        if (!this.f52267am && at()) {
            z17 = true;
        }
        if (z17) {
            n(true);
            this.f52273as.f50508h.c();
        }
        if (this.D != null && (at() || android.os.SystemClock.elapsedRealtime() > this.E)) {
            android.os.Handler handler = this.D;
            com.tencent.mapsdk.internal.sj sjVar = this.f52197l;
            if (sjVar != null) {
                sjVar.l();
            }
            b(handler, gl10);
            com.tencent.mapsdk.internal.sj sjVar2 = this.f52197l;
            if (sjVar2 != null) {
                sjVar2.m();
            }
            this.D = null;
        }
        return a17;
    }

    @Override // com.tencent.mapsdk.internal.az
    public final void b(boolean z17) {
        this.R = z17;
    }

    @Override // com.tencent.mapsdk.internal.az
    public final void b(com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener tencentMapGestureListener) {
        com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListenerList tencentMapGestureListenerList = this.f52265ak;
        if (tencentMapGestureListenerList == null) {
            return;
        }
        tencentMapGestureListenerList.removeListener(tencentMapGestureListener);
    }

    @Override // com.tencent.mapsdk.internal.az
    public final void b(float f17) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap.OnScaleViewChangedListener onScaleViewChangedListener = this.A;
        if (onScaleViewChangedListener != null) {
            onScaleViewChangedListener.onScaleViewChanged(f17);
        }
        this.f52199n.f48782j.onScaleViewChanged(f17);
    }

    @Override // com.tencent.mapsdk.internal.az
    public final void b(int i17, int i18) {
        if (i17 == 0 || i18 == 0) {
            return;
        }
        if (this.aK == null) {
            com.tencent.map.lib.models.GeoPoint r17 = ((com.tencent.mapsdk.vector.VectorMap) this.e_).r();
            this.aK = new com.tencent.map.lib.models.GeoPoint(r17.getLatitudeE6(), r17.getLongitudeE6());
        }
        this.aK.setLatitudeE6(i17);
        this.aK.setLongitudeE6(i18);
    }

    @Override // com.tencent.mapsdk.internal.az
    public final void b(com.tencent.mapsdk.internal.fh fhVar) {
        this.f52201p.remove(fhVar);
    }

    private void b(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnCameraChangeListener onCameraChangeListener) {
        this.B = onCameraChangeListener;
    }

    private void b(com.tencent.tencentmap.mapsdk.maps.TencentMapOptions tencentMapOptions) {
        java.lang.String str;
        I().getApplicationContext();
        com.tencent.mapsdk.internal.tu tuVar = new com.tencent.mapsdk.internal.tu(this, ad().f49011c);
        tuVar.b();
        if (!this.aZ && !this.f52189ba) {
            com.tencent.mapsdk.internal.qe.a(I(), ad().f49011c);
            com.tencent.mapsdk.core.utils.log.LogUtil.a(this.f49018f).b(com.tencent.mapsdk.internal.la.a.f50264e, "syncCopyConfig");
        } else if (this.f52189ba) {
            android.content.Context I = I();
            java.lang.String str2 = ad().f49011c;
            if (I != null) {
                java.lang.String a17 = com.tencent.mapsdk.internal.mz.a(I, (com.tencent.tencentmap.mapsdk.maps.TencentMapOptions) null).a(str2);
                com.tencent.mapsdk.internal.my a18 = com.tencent.mapsdk.internal.my.a(I);
                com.tencent.mapsdk.internal.qe.a(a18);
                int b17 = com.tencent.mapsdk.internal.hn.b(com.tencent.mapsdk.internal.hn.n(), a18.a(com.tencent.mapsdk.internal.er.f49386e));
                com.tencent.mapsdk.internal.mv a19 = com.tencent.mapsdk.internal.mx.a(I, str2);
                com.tencent.mapsdk.internal.mw.b(a19, a17);
                com.tencent.mapsdk.internal.mw.a(I, a19, a17, com.tencent.mapsdk.internal.ep.f49356a);
                if (b17 > 0) {
                    a18.a(com.tencent.mapsdk.internal.er.f49386e, com.tencent.mapsdk.internal.hn.n());
                }
            }
            com.tencent.mapsdk.core.utils.log.LogUtil.a(this.f49018f).b(com.tencent.mapsdk.internal.la.a.f50264e, "halfSyncCopyConfig");
        }
        a(tuVar, com.tencent.mapsdk.internal.rs.c());
        com.tencent.mapsdk.internal.dp dpVar = (com.tencent.mapsdk.internal.dp) com.tencent.mapsdk.internal.cp.a(com.tencent.mapsdk.internal.dp.class);
        com.tencent.mapsdk.vector.VectorMap vectorMap = (com.tencent.mapsdk.vector.VectorMap) this.e_;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String j17 = dpVar.j();
        if (android.text.TextUtils.isEmpty(j17)) {
            str = null;
        } else {
            java.lang.String k17 = dpVar.k();
            if (!android.text.TextUtils.isEmpty(k17)) {
                sb6.append(k17);
                sb6.append("://");
            }
            sb6.append(j17);
            str = sb6.toString();
        }
        vectorMap.f52512o.a(str);
        com.tencent.mapsdk.internal.dv dvVar = (com.tencent.mapsdk.internal.dv) com.tencent.mapsdk.internal.cp.a(com.tencent.mapsdk.internal.dv.class);
        java.lang.String satelliteVersion = tencentMapOptions != null ? tencentMapOptions.getSatelliteVersion() : null;
        if (android.text.TextUtils.isEmpty(satelliteVersion)) {
            satelliteVersion = "0";
        }
        java.lang.String satelliteUrl = ((com.tencent.mapsdk.internal.dg) dvVar.i()).satelliteUrl("%d", "%d", "%d", satelliteVersion);
        if (!dvVar.f49203c || android.text.TextUtils.isEmpty(satelliteUrl)) {
            return;
        }
        com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50206g, "satelliteUrl = ".concat(java.lang.String.valueOf(satelliteUrl)));
        ((com.tencent.mapsdk.vector.VectorMap) this.e_).f52512o.b(satelliteUrl);
    }

    private void a(android.os.Handler handler, javax.microedition.khronos.opengles.GL10 gl10) {
        com.tencent.mapsdk.internal.sj sjVar = this.f52197l;
        if (sjVar != null) {
            sjVar.l();
        }
        b(handler, gl10);
        com.tencent.mapsdk.internal.sj sjVar2 = this.f52197l;
        if (sjVar2 != null) {
            sjVar2.m();
        }
    }

    private android.graphics.Bitmap a(android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2) {
        if (bitmap == null || bitmap.isRecycled() || bitmap2 == null || bitmap2.isRecycled()) {
            return null;
        }
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        canvas.drawBitmap(bitmap, new android.graphics.Matrix(), null);
        canvas.drawBitmap(bitmap2, this.f52197l.a().left, this.f52197l.a().top, (android.graphics.Paint) null);
        return createBitmap;
    }

    private boolean a(com.tencent.mapsdk.internal.gc[] gcVarArr) {
        com.tencent.mapsdk.internal.gc[] ah6;
        if (this.aS < 25) {
            ah6 = au();
            this.aS++;
        } else {
            ah6 = ah();
        }
        if (gcVarArr == null) {
            return true;
        }
        return com.tencent.mapsdk.internal.sm.a(ah6, gcVarArr);
    }

    private static boolean a(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, android.graphics.Rect rect) {
        if (latLng != null && rect != null) {
            com.tencent.map.lib.models.GeoPoint from = com.tencent.map.lib.models.GeoPoint.from(latLng);
            if (from.getLongitudeE6() >= rect.left && from.getLongitudeE6() <= rect.right && from.getLatitudeE6() >= rect.top && from.getLatitudeE6() <= rect.bottom) {
                return true;
            }
        }
        return false;
    }

    private void a(com.tencent.mapsdk.internal.pp ppVar) {
        com.tencent.mapsdk.internal.pt ptVar = this.f52185af;
        if (ptVar != null) {
            ptVar.a(ppVar);
        }
    }

    public final boolean a(android.view.MotionEvent motionEvent) {
        com.tencent.mapsdk.internal.pt ptVar = this.f52185af;
        if (ptVar != null) {
            return ptVar.dispatchHoverEvent(motionEvent);
        }
        return false;
    }

    private void a(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnTrafficEventClickListener onTrafficEventClickListener) {
        this.f52186ag = onTrafficEventClickListener;
    }

    private void a(com.tencent.mapsdk.internal.bc bcVar) {
        this.f52188ai.remove(bcVar);
        this.f52188ai.add(bcVar);
    }

    public final void a(final boolean z17, final java.util.List<com.tencent.mapsdk.internal.ss> list) {
        com.tencent.mapsdk.internal.ko.b(new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.tr.9
            @Override // java.lang.Runnable
            public final void run() {
                java.util.Iterator it = com.tencent.mapsdk.internal.tr.this.f52188ai.iterator();
                while (it.hasNext()) {
                    ((com.tencent.mapsdk.internal.bc) it.next()).a(z17, list);
                }
            }
        });
    }

    private boolean a(com.tencent.mapsdk.internal.ax axVar, float f17, float f18) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap.OnPolylineClickListener onPolylineClickListener;
        if (!axVar.isClickable() || (onPolylineClickListener = this.f52278ax) == null) {
            return false;
        }
        onPolylineClickListener.onPolylineClick(axVar, ((com.tencent.mapsdk.internal.ne) this.d_).f50513m.fromScreenLocation(new android.graphics.Point((int) f17, (int) f18)));
        return true;
    }

    private void b(android.os.Handler handler, javax.microedition.khronos.opengles.GL10 gl10) {
        android.graphics.Bitmap bitmap;
        if (gl10 == null || handler == null) {
            return;
        }
        int i17 = this.Z;
        int i18 = this.f52180aa;
        int i19 = i17 * i18;
        int[] iArr = new int[i19];
        int[] iArr2 = new int[i19];
        java.nio.IntBuffer wrap = java.nio.IntBuffer.wrap(iArr);
        wrap.position(0);
        gl10.glReadPixels(0, 0, i17, i18, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, wrap);
        for (int i27 = 0; i27 < i18; i27++) {
            for (int i28 = 0; i28 < i17; i28++) {
                int i29 = iArr[(i27 * i17) + i28];
                iArr2[(((i18 - i27) - 1) * i17) + i28] = (i29 & (-16711936)) | ((i29 << 16) & 16711680) | ((i29 >> 16) & 255);
            }
        }
        try {
            bitmap = android.graphics.Bitmap.createBitmap(iArr2, i17, i18, this.F);
        } catch (java.lang.OutOfMemoryError unused) {
            bitmap = null;
        }
        java.lang.ref.WeakReference<com.tencent.mapsdk.internal.bu> weakReference = this.f52276av;
        if (weakReference != null && !(weakReference.get() instanceof com.tencent.mapsdk.internal.ub) && this.f52197l.k()) {
            bitmap = a(bitmap, this.f52197l.j());
        }
        handler.sendMessage(handler.obtainMessage(0, bitmap));
    }

    private boolean a(com.tencent.mapsdk.internal.aw awVar, float f17, float f18) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap.OnPolygonClickListener onPolygonClickListener;
        if (!awVar.isClickable() || (onPolygonClickListener = this.f52279ay) == null) {
            return false;
        }
        onPolygonClickListener.onPolygonClick(awVar, ((com.tencent.mapsdk.internal.ne) this.d_).f50513m.fromScreenLocation(new android.graphics.Point((int) f17, (int) f18)));
        return true;
    }

    private static boolean a(com.tencent.mapsdk.internal.ez ezVar, float f17, float f18) {
        if (ezVar != null && ezVar.isVisible() && ezVar.handleOnTap()) {
            return ezVar.onTap(f17, f18);
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.az
    public final com.tencent.tencentmap.mapsdk.maps.model.CameraPosition a() {
        com.tencent.mapsdk.vector.VectorMap vectorMap = (com.tencent.mapsdk.vector.VectorMap) this.e_;
        com.tencent.map.lib.models.GeoPoint r17 = vectorMap.r();
        if (r17 == null) {
            return null;
        }
        java.util.List<com.tencent.tencentmap.mapsdk.maps.TencentMap.OnCameraChangeListener> list = this.f52204s;
        if ((list == null || list.size() <= 0) && this.f52181ab == null) {
            return null;
        }
        com.tencent.tencentmap.mapsdk.maps.model.LatLng a17 = com.tencent.mapsdk.internal.kr.a(r17);
        float v17 = vectorMap.v();
        if (v17 < 0.0f) {
            v17 = (v17 % 360.0f) + 360.0f;
        }
        return com.tencent.tencentmap.mapsdk.maps.model.CameraPosition.builder().zoom(vectorMap.f52512o.f50520t.a()).target(a17).bearing(v17).tilt(vectorMap.w()).build();
    }

    private void b(com.tencent.mapsdk.internal.bc bcVar) {
        this.f52188ai.remove(bcVar);
    }

    private void b(javax.microedition.khronos.opengles.GL10 gl10) {
        com.tencent.mapsdk.internal.bh bhVar;
        C c17 = this.d_;
        if (c17 == 0 || (bhVar = ((com.tencent.mapsdk.internal.ne) c17).f50497J) == null) {
            return;
        }
        synchronized (this.f52192g) {
            com.tencent.mapsdk.internal.ez[] ezVarArr = {null};
            java.util.ArrayList arrayList = new java.util.ArrayList(bhVar.f48946a.values());
            java.util.Collections.sort(arrayList, com.tencent.mapsdk.internal.bh.a.ASC.f48960c);
            com.tencent.map.tools.Util.foreach(arrayList, new com.tencent.mapsdk.internal.tr.AnonymousClass1(ezVarArr, gl10));
            com.tencent.mapsdk.internal.ez ezVar = ezVarArr[0];
            if (ezVar != null) {
                ezVar.a(gl10);
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.az
    public final void a(com.tencent.tencentmap.mapsdk.maps.TencentMapOptions tencentMapOptions) {
        java.lang.String str;
        I().getApplicationContext();
        com.tencent.mapsdk.internal.tu tuVar = new com.tencent.mapsdk.internal.tu(this, ad().f49011c);
        tuVar.b();
        if (!this.aZ && !this.f52189ba) {
            com.tencent.mapsdk.internal.qe.a(I(), ad().f49011c);
            com.tencent.mapsdk.core.utils.log.LogUtil.a(this.f49018f).b(com.tencent.mapsdk.internal.la.a.f50264e, "syncCopyConfig");
        } else if (this.f52189ba) {
            android.content.Context I = I();
            java.lang.String str2 = ad().f49011c;
            if (I != null) {
                java.lang.String a17 = com.tencent.mapsdk.internal.mz.a(I, (com.tencent.tencentmap.mapsdk.maps.TencentMapOptions) null).a(str2);
                com.tencent.mapsdk.internal.my a18 = com.tencent.mapsdk.internal.my.a(I);
                com.tencent.mapsdk.internal.qe.a(a18);
                int b17 = com.tencent.mapsdk.internal.hn.b(com.tencent.mapsdk.internal.hn.n(), a18.a(com.tencent.mapsdk.internal.er.f49386e));
                com.tencent.mapsdk.internal.mv a19 = com.tencent.mapsdk.internal.mx.a(I, str2);
                com.tencent.mapsdk.internal.mw.b(a19, a17);
                com.tencent.mapsdk.internal.mw.a(I, a19, a17, com.tencent.mapsdk.internal.ep.f49356a);
                if (b17 > 0) {
                    a18.a(com.tencent.mapsdk.internal.er.f49386e, com.tencent.mapsdk.internal.hn.n());
                }
            }
            com.tencent.mapsdk.core.utils.log.LogUtil.a(this.f49018f).b(com.tencent.mapsdk.internal.la.a.f50264e, "halfSyncCopyConfig");
        }
        a(tuVar, com.tencent.mapsdk.internal.rs.c());
        com.tencent.mapsdk.internal.dp dpVar = (com.tencent.mapsdk.internal.dp) com.tencent.mapsdk.internal.cp.a(com.tencent.mapsdk.internal.dp.class);
        com.tencent.mapsdk.vector.VectorMap vectorMap = (com.tencent.mapsdk.vector.VectorMap) this.e_;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String j17 = dpVar.j();
        if (android.text.TextUtils.isEmpty(j17)) {
            str = null;
        } else {
            java.lang.String k17 = dpVar.k();
            if (!android.text.TextUtils.isEmpty(k17)) {
                sb6.append(k17);
                sb6.append("://");
            }
            sb6.append(j17);
            str = sb6.toString();
        }
        vectorMap.f52512o.a(str);
        com.tencent.mapsdk.internal.dv dvVar = (com.tencent.mapsdk.internal.dv) com.tencent.mapsdk.internal.cp.a(com.tencent.mapsdk.internal.dv.class);
        java.lang.String satelliteVersion = tencentMapOptions != null ? tencentMapOptions.getSatelliteVersion() : null;
        if (android.text.TextUtils.isEmpty(satelliteVersion)) {
            satelliteVersion = "0";
        }
        java.lang.String satelliteUrl = ((com.tencent.mapsdk.internal.dg) dvVar.i()).satelliteUrl("%d", "%d", "%d", satelliteVersion);
        if (dvVar.f49203c && !android.text.TextUtils.isEmpty(satelliteUrl)) {
            com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50206g, "satelliteUrl = ".concat(java.lang.String.valueOf(satelliteUrl)));
            ((com.tencent.mapsdk.vector.VectorMap) this.e_).f52512o.b(satelliteUrl);
        }
        M m17 = this.e_;
        if (!((com.tencent.mapsdk.vector.VectorMap) m17).f52512o.f50517q) {
            ((com.tencent.mapsdk.vector.VectorMap) m17).setMapStyle(0);
        } else {
            ((com.tencent.mapsdk.vector.VectorMap) m17).setMapStyle(5);
        }
    }

    @Override // com.tencent.mapsdk.internal.az
    public final void b(com.tencent.mapsdk.internal.qa.b bVar) {
        M m17 = this.e_;
        if (m17 == 0) {
            this.f52190bb.remove(bVar);
            return;
        }
        com.tencent.mapsdk.vector.VectorMap vectorMap = (com.tencent.mapsdk.vector.VectorMap) m17;
        com.tencent.mapsdk.internal.qa qaVar = vectorMap.f52515r;
        if (qaVar != null) {
            qaVar.b(bVar);
        } else {
            vectorMap.f52518u.remove(bVar);
        }
    }

    private boolean a(com.tencent.mapsdk.engine.jni.models.TappedElement tappedElement) {
        com.tencent.mapsdk.internal.sa saVar;
        com.tencent.mapsdk.internal.ne neVar = this.f52273as;
        if (neVar == null || (saVar = neVar.A) == null) {
            return false;
        }
        com.tencent.tencentmap.mapsdk.maps.model.TrafficEvent a17 = saVar.a((int) tappedElement.itemId);
        com.tencent.tencentmap.mapsdk.maps.TencentMap.OnTrafficEventClickListener onTrafficEventClickListener = this.f52186ag;
        if (onTrafficEventClickListener == null || a17 == null) {
            return false;
        }
        onTrafficEventClickListener.onTrafficEventClicked(a17);
        return true;
    }

    @Override // com.tencent.mapsdk.internal.tz, com.tencent.mapsdk.internal.ua.m
    public final void a(javax.microedition.khronos.opengles.GL10 gl10, javax.microedition.khronos.egl.EGLConfig eGLConfig) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50259ab, this.f49018f);
        super.a(gl10, eGLConfig);
    }

    public final boolean a(com.tencent.mapsdk.internal.av avVar, boolean z17) {
        boolean z18 = false;
        if (((com.tencent.mapsdk.vector.VectorMap) this.e_) == null) {
            return false;
        }
        if (avVar == null) {
            b("");
            return true;
        }
        com.tencent.mapsdk.internal.an anVar = avVar.f48864b;
        java.lang.String id6 = anVar.getId();
        com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMarkerClickListener onMarkerClickListener = this.aC;
        if (onMarkerClickListener != null && !z17 && onMarkerClickListener.onMarkerClick(avVar)) {
            return true;
        }
        if (!avVar.isInfoWindowEnable()) {
            return false;
        }
        if (!this.f52182ac) {
            com.tencent.mapsdk.internal.an anVar2 = this.f52183ad;
            if (anVar2 == null) {
                anVar.showInfoWindow();
                this.f52183ad = anVar;
                return true;
            }
            if (anVar2 == anVar) {
                if (anVar.h() != null && anVar.h().c()) {
                    z18 = true;
                }
                if (z18) {
                    anVar.hideInfoWindow();
                    this.f52183ad = null;
                } else {
                    anVar.showInfoWindow();
                    this.f52183ad = anVar;
                }
                return true;
            }
            anVar2.hideInfoWindow();
            anVar.showInfoWindow();
            this.f52183ad = anVar;
            return true;
        }
        if (anVar.i()) {
            if (anVar.h() == null) {
                anVar.showInfoWindow();
            } else if (anVar.isInfoWindowShown()) {
                anVar.hideInfoWindow();
            } else {
                anVar.showInfoWindow();
                this.f52183ad = anVar;
            }
        }
        b(id6);
        return true;
    }

    @Override // com.tencent.mapsdk.internal.az
    public final void a(com.tencent.mapsdk.internal.qa.b bVar) {
        M m17 = this.e_;
        if (m17 == 0) {
            this.f52190bb.put(bVar, java.lang.Boolean.TRUE);
        } else {
            ((com.tencent.mapsdk.vector.VectorMap) m17).a(bVar);
        }
    }
}
