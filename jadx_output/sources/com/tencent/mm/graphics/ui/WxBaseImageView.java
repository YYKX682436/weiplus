package com.tencent.mm.graphics.ui;

/* loaded from: classes15.dex */
public class WxBaseImageView extends android.widget.FrameLayout {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f68214z = 0;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f68215d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.ViewStub f68216e;

    /* renamed from: f, reason: collision with root package name */
    public com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView f68217f;

    /* renamed from: g, reason: collision with root package name */
    public rj0.d f68218g;

    /* renamed from: h, reason: collision with root package name */
    public int f68219h;

    /* renamed from: i, reason: collision with root package name */
    public int f68220i;

    /* renamed from: m, reason: collision with root package name */
    public long f68221m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f68222n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.Rect f68223o;

    /* renamed from: p, reason: collision with root package name */
    public tj0.a f68224p;

    /* renamed from: q, reason: collision with root package name */
    public tj0.a f68225q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f68226r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f68227s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f68228t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f68229u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f68230v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f68231w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f68232x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f68233y;

    public WxBaseImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    private java.lang.String getActivityName() {
        android.content.Context context = this.f68215d;
        return (context == null || !(context instanceof android.app.Activity)) ? "Default" : ((android.app.Activity) context).getClass().getSimpleName();
    }

    public android.graphics.Bitmap getFullImageBitmap() {
        com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView subsamplingScaleImageView = this.f68217f;
        if (subsamplingScaleImageView != null) {
            return subsamplingScaleImageView.getFullImageBitmap();
        }
        return null;
    }

    public android.graphics.PointF getImageViewMatrixScale() {
        com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView subsamplingScaleImageView = this.f68217f;
        if (subsamplingScaleImageView != null) {
            return subsamplingScaleImageView.getImageViewMatrixScale();
        }
        return null;
    }

    public android.graphics.PointF getImageViewMatrixTranslation() {
        com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView subsamplingScaleImageView = this.f68217f;
        if (subsamplingScaleImageView != null) {
            return subsamplingScaleImageView.getImageViewMatrixTranslation();
        }
        return null;
    }

    public boolean getInternalTouchEventConsumed() {
        return this.f68217f.getInternalTouchEventConsumed();
    }

    public float getMinScale() {
        com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView subsamplingScaleImageView = this.f68217f;
        if (subsamplingScaleImageView != null) {
            return subsamplingScaleImageView.getMinScale();
        }
        return 1.0f;
    }

    public float getScale() {
        com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView subsamplingScaleImageView = this.f68217f;
        if (subsamplingScaleImageView != null) {
            return subsamplingScaleImageView.getScale();
        }
        return 1.0f;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    public void k(android.view.View.OnTouchListener onTouchListener) {
        com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView subsamplingScaleImageView = this.f68217f;
        if (subsamplingScaleImageView != null) {
            subsamplingScaleImageView.addOnTouchListener(onTouchListener);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        this.f68223o.left = getLeft();
        this.f68223o.right = getRight();
        this.f68223o.top = getTop();
        this.f68223o.bottom = getBottom();
        if (getGlobalVisibleRect(this.f68223o)) {
            this.f68222n = true;
            if (!this.f68232x) {
                this.f68232x = true;
                sj0.g gVar = sj0.g.INSTANCE;
                synchronized (gVar.f408361h) {
                    if (gVar.f408359f) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.PerformanceMonitor", "hy: already running. stop last and run new");
                        gVar.f408359f = false;
                    }
                    wu5.b bVar = gVar.f408360g;
                    if (bVar != null) {
                        bVar.b();
                    }
                    java.lang.System.gc();
                    gVar.f408358e.clear();
                    java.lang.ref.WeakReference weakReference = gVar.f408357d;
                    if (weakReference != null && weakReference.get() != null) {
                        gVar.f408358e.put(2, new sj0.c((android.content.Context) gVar.f408357d.get()));
                    }
                    ku5.u0 u0Var = ku5.t0.f312615d;
                    sj0.f fVar = new sj0.f(gVar);
                    gVar.f408360g = fVar;
                    ((ku5.t0) u0Var).e(fVar, 0L, 5L);
                    gVar.f408359f = true;
                }
            }
        } else {
            this.f68222n = false;
        }
        u();
    }

    public final void q(int i17) {
        tj0.a aVar;
        try {
            if (this.f68217f == null || (aVar = this.f68225q) == null) {
                return;
            }
            aVar.f419684i = (int) (java.lang.System.currentTimeMillis() - this.f68221m);
            com.davemorrissey.labs.subscaleview.performance.ImageDecodeRecord imageDecodeRecord = this.f68217f.getImageDecodeRecord();
            if (imageDecodeRecord != null) {
                this.f68225q.f419686k = imageDecodeRecord.getMainImageDecodeTime();
            } else {
                this.f68224p.f419686k = 0;
            }
            tj0.a aVar2 = this.f68225q;
            aVar2.f419683h = i17;
            aVar2.f419682g = this.f68217f.getRequiredRotation();
            this.f68225q.f419679d = this.f68217f.getSWidth();
            this.f68225q.f419680e = this.f68217f.getSHeight();
            this.f68225q.f419685j = this.f68217f.getFullImageSampleSize();
            tj0.a aVar3 = this.f68225q;
            aVar3.f419681f = (int) com.tencent.mm.vfs.w6.k(aVar3.f419676a);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WxBaseImageView", e17, "fillMainInfo exception", new java.lang.Object[0]);
        }
    }

    public void r(int i17, int i18) {
        this.f68219h = i17;
        this.f68220i = i18;
    }

    public final void s(int i17) {
        tj0.a aVar;
        try {
            if (this.f68217f == null || (aVar = this.f68224p) == null) {
                return;
            }
            aVar.f419684i = (int) (java.lang.System.currentTimeMillis() - this.f68221m);
            com.davemorrissey.labs.subscaleview.performance.ImageDecodeRecord imageDecodeRecord = this.f68217f.getImageDecodeRecord();
            if (imageDecodeRecord != null) {
                this.f68224p.f419686k = imageDecodeRecord.getPreviewLoadedTime();
            } else {
                this.f68224p.f419686k = 0;
            }
            tj0.a aVar2 = this.f68224p;
            aVar2.f419683h = i17;
            aVar2.f419682g = this.f68217f.getPreviewOrientation();
            this.f68224p.f419679d = this.f68217f.getPreviewWidth();
            this.f68224p.f419680e = this.f68217f.getPreviewHeight();
            tj0.a aVar3 = this.f68224p;
            aVar3.f419685j = 1;
            aVar3.f419681f = (int) com.tencent.mm.vfs.w6.k(aVar3.f419676a);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WxBaseImageView", e17, "fillPreviewInfo exception", new java.lang.Object[0]);
        }
    }

    public void setAllowInterceptTouchEvent(boolean z17) {
        com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView subsamplingScaleImageView = this.f68217f;
        if (subsamplingScaleImageView != null) {
            subsamplingScaleImageView.setAllowInterceptTouchEvent(z17);
        }
    }

    public void setAnimateMode(rj0.a aVar) {
    }

    public void setCanRefresh(boolean z17) {
        com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView subsamplingScaleImageView = this.f68217f;
        if (subsamplingScaleImageView != null) {
            subsamplingScaleImageView.setCanRefresh(z17);
        }
    }

    public void setCustomScaleRate(java.lang.Float f17) {
        com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView subsamplingScaleImageView = this.f68217f;
        if (subsamplingScaleImageView == null || f17 == null) {
            return;
        }
        subsamplingScaleImageView.setScaleRate(f17.floatValue());
    }

    public void setDrawFullSampleSizeBitmap(boolean z17) {
        com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView subsamplingScaleImageView = this.f68217f;
        if (subsamplingScaleImageView != null) {
            subsamplingScaleImageView.setDrawFullSampleSizeBitmap(z17);
        }
    }

    public void setEdgeSwipeListener(com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.EdgeSwipeListener edgeSwipeListener) {
        this.f68217f.setEdgeSwipeListener(edgeSwipeListener);
    }

    public void setFitType(android.widget.ImageView.ScaleType scaleType) {
    }

    public void setForceTileFlag(rj0.d dVar) {
        this.f68218g = dVar;
    }

    public void setGestureDetectorListener(android.view.GestureDetector.SimpleOnGestureListener simpleOnGestureListener) {
        com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView subsamplingScaleImageView = this.f68217f;
        if (subsamplingScaleImageView != null) {
            subsamplingScaleImageView.setGestureDetectorListener(simpleOnGestureListener);
        }
    }

    public void setImageViewMatrix(android.graphics.Matrix matrix) {
        com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView subsamplingScaleImageView = this.f68217f;
        if (subsamplingScaleImageView != null) {
            subsamplingScaleImageView.setImageViewMatrix(matrix);
        }
    }

    public void setInternalTouchEventConsumed(boolean z17) {
        this.f68217f.setInternalTouchEventConsumed(z17);
    }

    public void setMinScale(float f17) {
        com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView subsamplingScaleImageView = this.f68217f;
        if (subsamplingScaleImageView != null) {
            subsamplingScaleImageView.setMinScale(f17);
        }
    }

    public void setMinimumScaleType(int i17) {
        com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView subsamplingScaleImageView = this.f68217f;
        if (subsamplingScaleImageView != null) {
            subsamplingScaleImageView.setMinimumScaleType(i17);
        }
    }

    public void setOnDoubleTapListener(android.view.GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView subsamplingScaleImageView = this.f68217f;
        if (subsamplingScaleImageView != null) {
            subsamplingScaleImageView.setOnDoubleTapListener(onDoubleTapListener);
        }
    }

    public void setOnImageLoadEventListener(rj0.b bVar) {
        com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView subsamplingScaleImageView = this.f68217f;
        if (subsamplingScaleImageView != null) {
            subsamplingScaleImageView.setOnImageEventListener(new uj0.c(this, bVar));
        }
    }

    @Override // android.view.View
    public void setOnLongClickListener(android.view.View.OnLongClickListener onLongClickListener) {
        com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView subsamplingScaleImageView = this.f68217f;
        if (subsamplingScaleImageView != null) {
            subsamplingScaleImageView.setOnLongClickListener(onLongClickListener);
        }
    }

    public void setOnZoomScaleChangedListener(com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnStateChangedListener onStateChangedListener) {
        com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView subsamplingScaleImageView = this.f68217f;
        if (subsamplingScaleImageView != null) {
            subsamplingScaleImageView.setOnStateChangedListener(onStateChangedListener);
        }
    }

    public void setOpenHardware(boolean z17) {
        com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView subsamplingScaleImageView = this.f68217f;
        if (subsamplingScaleImageView != null) {
            subsamplingScaleImageView.setOpenHardware(z17);
        }
    }

    public void setScaleChangeReportListener(com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.ScaleChangeReportListener scaleChangeReportListener) {
        com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView subsamplingScaleImageView = this.f68217f;
        if (subsamplingScaleImageView != null) {
            subsamplingScaleImageView.setScaleChangeReportListener(scaleChangeReportListener);
        }
    }

    public void setScaleRate(float f17) {
        com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView subsamplingScaleImageView = this.f68217f;
        if (subsamplingScaleImageView != null) {
            subsamplingScaleImageView.setScaleRate(f17);
        }
    }

    public void setTileBackgroundColor(int i17) {
        com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView subsamplingScaleImageView = this.f68217f;
        if (subsamplingScaleImageView != null) {
            subsamplingScaleImageView.setTileBackgroundColor(i17);
        }
    }

    public void t(java.lang.String str, com.davemorrissey.labs.subscaleview.view.ImageSource imageSource) {
        hashCode();
        if (this.f68218g == rj0.d.Tile) {
            if (this.f68217f == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WxBaseImageView", "WxBaseImageView laodFile mTileIv is null");
                return;
            }
            if (str == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WxBaseImageView", "WxBaseImageView loadFile path is null");
                return;
            }
            this.f68216e.setVisibility(0);
            com.davemorrissey.labs.subscaleview.view.ImageSource uri = com.davemorrissey.labs.subscaleview.view.ImageSource.uri(str);
            uri.dimensions(this.f68219h, this.f68220i);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            this.f68221m = currentTimeMillis;
            com.tencent.mars.xlog.Log.i("MicroMsg.WxBaseImageView", "onStartLoad imagePath: %s, mStartLoadTime: %d", str, java.lang.Long.valueOf(currentTimeMillis));
            tj0.a aVar = new tj0.a();
            this.f68225q = aVar;
            aVar.f419678c = 22;
            aVar.f419676a = str;
            aVar.f419677b = getActivityName();
            this.f68227s = true;
            if (imageSource != null) {
                this.f68224p = new tj0.a();
                if (imageSource.getUri() != null) {
                    this.f68224p.f419676a = imageSource.getUri().toString();
                } else {
                    this.f68224p.f419676a = "";
                }
                tj0.a aVar2 = this.f68224p;
                java.lang.String str2 = aVar2.f419676a;
                aVar2.f419678c = 21;
                aVar2.f419677b = getActivityName();
                this.f68226r = true;
            } else {
                this.f68226r = false;
            }
            if (imageSource != null) {
                this.f68217f.setImage(uri, imageSource);
            } else {
                this.f68217f.setImage(uri);
            }
        }
    }

    public final void u() {
        if (this.f68222n && !this.f68230v) {
            if (!this.f68226r || this.f68228t) {
                if (!this.f68227s || this.f68229u) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WxBaseImageView", "reportImageInfo info ready and report");
                    tj0.b bVar = tj0.b.INSTANCE;
                    tj0.a aVar = this.f68225q;
                    tj0.a aVar2 = this.f68224p;
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    if (aVar != null) {
                        bVar.a(currentTimeMillis, aVar);
                    }
                    if (aVar2 != null) {
                        bVar.a(currentTimeMillis, aVar2);
                    }
                    this.f68230v = true;
                }
            }
        }
    }

    public WxBaseImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f68216e = null;
        this.f68217f = null;
        this.f68218g = rj0.d.Tile;
        this.f68222n = false;
        this.f68223o = new android.graphics.Rect();
        this.f68231w = false;
        this.f68232x = false;
        this.f68233y = null;
        this.f68215d = context;
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.d3u, (android.view.ViewGroup) this, true);
        android.view.ViewStub viewStub = (android.view.ViewStub) findViewById(com.tencent.mm.R.id.nq7);
        this.f68216e = viewStub;
        android.view.View inflate = viewStub.inflate();
        if (inflate != null) {
            com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView subsamplingScaleImageView = (com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView) inflate;
            this.f68217f = subsamplingScaleImageView;
            subsamplingScaleImageView.setVisibility(0);
        }
        sj0.e eVar = sj0.e.INSTANCE;
        if (!eVar.f408353g) {
            eVar.f408353g = true;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.i("MicroMsg.Metronome", "[start] stack:%s", new com.tencent.mm.sdk.platformtools.z3());
            eVar.h().postFrameCallback(eVar);
        }
        sj0.g gVar = sj0.g.INSTANCE;
        gVar.getClass();
        gVar.f408357d = new java.lang.ref.WeakReference(context);
        this.f68217f.setOnAttachStateChangeListener(new uj0.a(this));
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.tencent.mm.graphics.j.f68213a);
        try {
            setTileBackgroundColor(obtainStyledAttributes.getColor(0, -1));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
