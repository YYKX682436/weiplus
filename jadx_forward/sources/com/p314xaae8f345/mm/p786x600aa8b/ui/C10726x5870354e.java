package com.p314xaae8f345.mm.p786x600aa8b.ui;

/* renamed from: com.tencent.mm.graphics.ui.WxBaseImageView */
/* loaded from: classes15.dex */
public class C10726x5870354e extends android.widget.FrameLayout {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f149747z = 0;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f149748d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.ViewStub f149749e;

    /* renamed from: f, reason: collision with root package name */
    public com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d f149750f;

    /* renamed from: g, reason: collision with root package name */
    public rj0.d f149751g;

    /* renamed from: h, reason: collision with root package name */
    public int f149752h;

    /* renamed from: i, reason: collision with root package name */
    public int f149753i;

    /* renamed from: m, reason: collision with root package name */
    public long f149754m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f149755n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.Rect f149756o;

    /* renamed from: p, reason: collision with root package name */
    public tj0.a f149757p;

    /* renamed from: q, reason: collision with root package name */
    public tj0.a f149758q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f149759r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f149760s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f149761t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f149762u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f149763v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f149764w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f149765x;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f149766y;

    public C10726x5870354e(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    /* renamed from: getActivityName */
    private java.lang.String m45726xc20554b0() {
        android.content.Context context = this.f149748d;
        return (context == null || !(context instanceof android.app.Activity)) ? "Default" : ((android.app.Activity) context).getClass().getSimpleName();
    }

    /* renamed from: getFullImageBitmap */
    public android.graphics.Bitmap m45727x91da4e25() {
        com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d c1451x2b77465d = this.f149750f;
        if (c1451x2b77465d != null) {
            return c1451x2b77465d.m15655x91da4e25();
        }
        return null;
    }

    /* renamed from: getImageViewMatrixScale */
    public android.graphics.PointF mo45728xfdb07fbf() {
        com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d c1451x2b77465d = this.f149750f;
        if (c1451x2b77465d != null) {
            return c1451x2b77465d.m15658xfdb07fbf();
        }
        return null;
    }

    /* renamed from: getImageViewMatrixTranslation */
    public android.graphics.PointF mo45729x3ffd66() {
        com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d c1451x2b77465d = this.f149750f;
        if (c1451x2b77465d != null) {
            return c1451x2b77465d.m15659x3ffd66();
        }
        return null;
    }

    /* renamed from: getInternalTouchEventConsumed */
    public boolean m45730xecf7a936() {
        return this.f149750f.m15660xecf7a936();
    }

    /* renamed from: getMinScale */
    public float m45731x299dd38e() {
        com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d c1451x2b77465d = this.f149750f;
        if (c1451x2b77465d != null) {
            return c1451x2b77465d.m15662x299dd38e();
        }
        return 1.0f;
    }

    /* renamed from: getScale */
    public float mo45732x7520af94() {
        com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d c1451x2b77465d = this.f149750f;
        if (c1451x2b77465d != null) {
            return c1451x2b77465d.m15672x7520af94();
        }
        return 1.0f;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    public void k(android.view.View.OnTouchListener onTouchListener) {
        com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d c1451x2b77465d = this.f149750f;
        if (c1451x2b77465d != null) {
            c1451x2b77465d.m15639x90740693(onTouchListener);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        this.f149756o.left = getLeft();
        this.f149756o.right = getRight();
        this.f149756o.top = getTop();
        this.f149756o.bottom = getBottom();
        if (getGlobalVisibleRect(this.f149756o)) {
            this.f149755n = true;
            if (!this.f149765x) {
                this.f149765x = true;
                sj0.g gVar = sj0.g.INSTANCE;
                synchronized (gVar.f489894h) {
                    if (gVar.f489892f) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.PerformanceMonitor", "hy: already running. stop last and run new");
                        gVar.f489892f = false;
                    }
                    wu5.b bVar = gVar.f489893g;
                    if (bVar != null) {
                        bVar.b();
                    }
                    java.lang.System.gc();
                    gVar.f489891e.clear();
                    java.lang.ref.WeakReference weakReference = gVar.f489890d;
                    if (weakReference != null && weakReference.get() != null) {
                        gVar.f489891e.put(2, new sj0.c((android.content.Context) gVar.f489890d.get()));
                    }
                    ku5.u0 u0Var = ku5.t0.f394148d;
                    sj0.f fVar = new sj0.f(gVar);
                    gVar.f489893g = fVar;
                    ((ku5.t0) u0Var).e(fVar, 0L, 5L);
                    gVar.f489892f = true;
                }
            }
        } else {
            this.f149755n = false;
        }
        u();
    }

    public final void q(int i17) {
        tj0.a aVar;
        try {
            if (this.f149750f == null || (aVar = this.f149758q) == null) {
                return;
            }
            aVar.f501217i = (int) (java.lang.System.currentTimeMillis() - this.f149754m);
            com.p151x9ab4726f.p152x329086.p153x9590d8af.p157xa7c31030.C1448xa1904cba m15657xa009424 = this.f149750f.m15657xa009424();
            if (m15657xa009424 != null) {
                this.f149758q.f501219k = m15657xa009424.m15516x977ac767();
            } else {
                this.f149757p.f501219k = 0;
            }
            tj0.a aVar2 = this.f149758q;
            aVar2.f501216h = i17;
            aVar2.f501215g = this.f149750f.m15669x602f7b3();
            this.f149758q.f501212d = this.f149750f.m15671x2e4fb009();
            this.f149758q.f501213e = this.f149750f.m15670x81d75744();
            this.f149758q.f501218j = this.f149750f.m15656xd2a5d6c1();
            tj0.a aVar3 = this.f149758q;
            aVar3.f501214f = (int) com.p314xaae8f345.mm.vfs.w6.k(aVar3.f501209a);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WxBaseImageView", e17, "fillMainInfo exception", new java.lang.Object[0]);
        }
    }

    public void r(int i17, int i18) {
        this.f149752h = i17;
        this.f149753i = i18;
    }

    public final void s(int i17) {
        tj0.a aVar;
        try {
            if (this.f149750f == null || (aVar = this.f149757p) == null) {
                return;
            }
            aVar.f501217i = (int) (java.lang.System.currentTimeMillis() - this.f149754m);
            com.p151x9ab4726f.p152x329086.p153x9590d8af.p157xa7c31030.C1448xa1904cba m15657xa009424 = this.f149750f.m15657xa009424();
            if (m15657xa009424 != null) {
                this.f149757p.f501219k = m15657xa009424.m15518x3b2699a4();
            } else {
                this.f149757p.f501219k = 0;
            }
            tj0.a aVar2 = this.f149757p;
            aVar2.f501216h = i17;
            aVar2.f501215g = this.f149750f.m15667xc75d6ede();
            this.f149757p.f501212d = this.f149750f.m15668xf440954();
            this.f149757p.f501213e = this.f149750f.m15666xbf6e2759();
            tj0.a aVar3 = this.f149757p;
            aVar3.f501218j = 1;
            aVar3.f501214f = (int) com.p314xaae8f345.mm.vfs.w6.k(aVar3.f501209a);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WxBaseImageView", e17, "fillPreviewInfo exception", new java.lang.Object[0]);
        }
    }

    /* renamed from: setAllowInterceptTouchEvent */
    public void mo45733x95d78576(boolean z17) {
        com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d c1451x2b77465d = this.f149750f;
        if (c1451x2b77465d != null) {
            c1451x2b77465d.m15698x95d78576(z17);
        }
    }

    /* renamed from: setAnimateMode */
    public void m45734xb4464262(rj0.a aVar) {
    }

    /* renamed from: setCanRefresh */
    public void mo45735x96646ed(boolean z17) {
        com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d c1451x2b77465d = this.f149750f;
        if (c1451x2b77465d != null) {
            c1451x2b77465d.m15703x96646ed(z17);
        }
    }

    /* renamed from: setCustomScaleRate */
    public void mo45736x50bb6417(java.lang.Float f17) {
        com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d c1451x2b77465d = this.f149750f;
        if (c1451x2b77465d == null || f17 == null) {
            return;
        }
        c1451x2b77465d.m15746xebd14708(f17.floatValue());
    }

    /* renamed from: setDrawFullSampleSizeBitmap */
    public void m45737x3a5986f(boolean z17) {
        com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d c1451x2b77465d = this.f149750f;
        if (c1451x2b77465d != null) {
            c1451x2b77465d.m15711x3a5986f(z17);
        }
    }

    /* renamed from: setEdgeSwipeListener */
    public void m45738xfa6df0f(com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.EdgeSwipeListener edgeSwipeListener) {
        this.f149750f.m15713xfa6df0f(edgeSwipeListener);
    }

    /* renamed from: setFitType */
    public void m45739x7eb1a829(android.widget.ImageView.ScaleType scaleType) {
    }

    /* renamed from: setForceTileFlag */
    public void m45740x79fcb603(rj0.d dVar) {
        this.f149751g = dVar;
    }

    /* renamed from: setGestureDetectorListener */
    public void m45741x540a5741(android.view.GestureDetector.SimpleOnGestureListener simpleOnGestureListener) {
        com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d c1451x2b77465d = this.f149750f;
        if (c1451x2b77465d != null) {
            c1451x2b77465d.m15716x540a5741(simpleOnGestureListener);
        }
    }

    /* renamed from: setImageViewMatrix */
    public void mo45742x548ba9bf(android.graphics.Matrix matrix) {
        com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d c1451x2b77465d = this.f149750f;
        if (c1451x2b77465d != null) {
            c1451x2b77465d.m15721x548ba9bf(matrix);
        }
    }

    /* renamed from: setInternalTouchEventConsumed */
    public void m45743xdcb65f42(boolean z17) {
        this.f149750f.m15722xdcb65f42(z17);
    }

    /* renamed from: setMinScale */
    public void m45744x2456349a(float f17) {
        com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d c1451x2b77465d = this.f149750f;
        if (c1451x2b77465d != null) {
            c1451x2b77465d.m15728x2456349a(f17);
        }
    }

    /* renamed from: setMinimumScaleType */
    public void m45745x70eb13b8(int i17) {
        com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d c1451x2b77465d = this.f149750f;
        if (c1451x2b77465d != null) {
            c1451x2b77465d.m15730x70eb13b8(i17);
        }
    }

    /* renamed from: setOnDoubleTapListener */
    public void m45746x52d44d05(android.view.GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d c1451x2b77465d = this.f149750f;
        if (c1451x2b77465d != null) {
            c1451x2b77465d.m15733x52d44d05(onDoubleTapListener);
        }
    }

    /* renamed from: setOnImageLoadEventListener */
    public void m45747xe60f5d4e(rj0.b bVar) {
        com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d c1451x2b77465d = this.f149750f;
        if (c1451x2b77465d != null) {
            c1451x2b77465d.m15734x2690cf94(new uj0.c(this, bVar));
        }
    }

    @Override // android.view.View
    public void setOnLongClickListener(android.view.View.OnLongClickListener onLongClickListener) {
        com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d c1451x2b77465d = this.f149750f;
        if (c1451x2b77465d != null) {
            c1451x2b77465d.setOnLongClickListener(onLongClickListener);
        }
    }

    /* renamed from: setOnZoomScaleChangedListener */
    public void m45748xfe3d8052(com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnStateChangedListener onStateChangedListener) {
        com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d c1451x2b77465d = this.f149750f;
        if (c1451x2b77465d != null) {
            c1451x2b77465d.m15735x27916638(onStateChangedListener);
        }
    }

    /* renamed from: setOpenHardware */
    public void m45749x328413d4(boolean z17) {
        com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d c1451x2b77465d = this.f149750f;
        if (c1451x2b77465d != null) {
            c1451x2b77465d.m15736x328413d4(z17);
        }
    }

    /* renamed from: setScaleChangeReportListener */
    public void m45750xf8b16000(com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.ScaleChangeReportListener scaleChangeReportListener) {
        com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d c1451x2b77465d = this.f149750f;
        if (c1451x2b77465d != null) {
            c1451x2b77465d.m15745xf8b16000(scaleChangeReportListener);
        }
    }

    /* renamed from: setScaleRate */
    public void m45751xebd14708(float f17) {
        com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d c1451x2b77465d = this.f149750f;
        if (c1451x2b77465d != null) {
            c1451x2b77465d.m15746xebd14708(f17);
        }
    }

    /* renamed from: setTileBackgroundColor */
    public void m45752x8eff8685(int i17) {
        com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d c1451x2b77465d = this.f149750f;
        if (c1451x2b77465d != null) {
            c1451x2b77465d.m15747x8eff8685(i17);
        }
    }

    public void t(java.lang.String str, com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1449xe4cdf536 c1449xe4cdf536) {
        hashCode();
        if (this.f149751g == rj0.d.Tile) {
            if (this.f149750f == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxBaseImageView", "WxBaseImageView laodFile mTileIv is null");
                return;
            }
            if (str == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxBaseImageView", "WxBaseImageView loadFile path is null");
                return;
            }
            this.f149749e.setVisibility(0);
            com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1449xe4cdf536 uri = com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1449xe4cdf536.uri(str);
            uri.m15529x18b23fcd(this.f149752h, this.f149753i);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            this.f149754m = currentTimeMillis;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxBaseImageView", "onStartLoad imagePath: %s, mStartLoadTime: %d", str, java.lang.Long.valueOf(currentTimeMillis));
            tj0.a aVar = new tj0.a();
            this.f149758q = aVar;
            aVar.f501211c = 22;
            aVar.f501209a = str;
            aVar.f501210b = m45726xc20554b0();
            this.f149760s = true;
            if (c1449xe4cdf536 != null) {
                this.f149757p = new tj0.a();
                if (c1449xe4cdf536.m15536xb5887636() != null) {
                    this.f149757p.f501209a = c1449xe4cdf536.m15536xb5887636().toString();
                } else {
                    this.f149757p.f501209a = "";
                }
                tj0.a aVar2 = this.f149757p;
                java.lang.String str2 = aVar2.f501209a;
                aVar2.f501211c = 21;
                aVar2.f501210b = m45726xc20554b0();
                this.f149759r = true;
            } else {
                this.f149759r = false;
            }
            if (c1449xe4cdf536 != null) {
                this.f149750f.m15718x53266a19(uri, c1449xe4cdf536);
            } else {
                this.f149750f.m15717x53266a19(uri);
            }
        }
    }

    public final void u() {
        if (this.f149755n && !this.f149763v) {
            if (!this.f149759r || this.f149761t) {
                if (!this.f149760s || this.f149762u) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxBaseImageView", "reportImageInfo info ready and report");
                    tj0.b bVar = tj0.b.INSTANCE;
                    tj0.a aVar = this.f149758q;
                    tj0.a aVar2 = this.f149757p;
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    if (aVar != null) {
                        bVar.a(currentTimeMillis, aVar);
                    }
                    if (aVar2 != null) {
                        bVar.a(currentTimeMillis, aVar2);
                    }
                    this.f149763v = true;
                }
            }
        }
    }

    public C10726x5870354e(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f149749e = null;
        this.f149750f = null;
        this.f149751g = rj0.d.Tile;
        this.f149755n = false;
        this.f149756o = new android.graphics.Rect();
        this.f149764w = false;
        this.f149765x = false;
        this.f149766y = null;
        this.f149748d = context;
        android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d3u, (android.view.ViewGroup) this, true);
        android.view.ViewStub viewStub = (android.view.ViewStub) findViewById(com.p314xaae8f345.mm.R.id.nq7);
        this.f149749e = viewStub;
        android.view.View inflate = viewStub.inflate();
        if (inflate != null) {
            com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d c1451x2b77465d = (com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d) inflate;
            this.f149750f = c1451x2b77465d;
            c1451x2b77465d.setVisibility(0);
        }
        sj0.e eVar = sj0.e.INSTANCE;
        if (!eVar.f489886g) {
            eVar.f489886g = true;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Metronome", "[start] stack:%s", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            eVar.h().postFrameCallback(eVar);
        }
        sj0.g gVar = sj0.g.INSTANCE;
        gVar.getClass();
        gVar.f489890d = new java.lang.ref.WeakReference(context);
        this.f149750f.m15732x8314060f(new uj0.a(this));
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.p314xaae8f345.mm.p786x600aa8b.j.f149746a);
        try {
            m45752x8eff8685(obtainStyledAttributes.getColor(0, -1));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
