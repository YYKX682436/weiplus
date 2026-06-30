package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public abstract class tz extends com.tencent.mapsdk.internal.bo<com.tencent.mapsdk.internal.ne, com.tencent.mapsdk.vector.VectorMap> implements com.tencent.mapsdk.internal.az, com.tencent.mapsdk.internal.pb {

    /* renamed from: j, reason: collision with root package name */
    private static final int f52262j = 10;

    /* renamed from: k, reason: collision with root package name */
    private static final int f52263k = 16;
    protected com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMarkerCollisionStatusListener aA;
    protected com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMarkerDragListener aB;
    protected com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMarkerClickListener aC;
    protected com.tencent.tencentmap.mapsdk.maps.TencentMap.OnInfoWindowClickListener aD;
    protected com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapFrameFinishCallback aE;

    /* renamed from: aj, reason: collision with root package name */
    public java.util.List<com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapLoadedCallback> f52264aj;

    /* renamed from: ak, reason: collision with root package name */
    public com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListenerList f52265ak;

    /* renamed from: al, reason: collision with root package name */
    public boolean f52266al;

    /* renamed from: am, reason: collision with root package name */
    protected volatile boolean f52267am;

    /* renamed from: an, reason: collision with root package name */
    protected volatile boolean f52268an;

    /* renamed from: ao, reason: collision with root package name */
    protected volatile boolean f52269ao;

    /* renamed from: ap, reason: collision with root package name */
    public volatile boolean f52270ap;

    /* renamed from: aq, reason: collision with root package name */
    public volatile boolean f52271aq;

    /* renamed from: ar, reason: collision with root package name */
    public int f52272ar;

    /* renamed from: as, reason: collision with root package name */
    public com.tencent.mapsdk.internal.ne f52273as;

    /* renamed from: at, reason: collision with root package name */
    public float f52274at;

    /* renamed from: au, reason: collision with root package name */
    public int f52275au;

    /* renamed from: av, reason: collision with root package name */
    protected java.lang.ref.WeakReference<com.tencent.mapsdk.internal.bu> f52276av;

    /* renamed from: aw, reason: collision with root package name */
    public volatile boolean f52277aw;

    /* renamed from: ax, reason: collision with root package name */
    protected com.tencent.tencentmap.mapsdk.maps.TencentMap.OnPolylineClickListener f52278ax;

    /* renamed from: ay, reason: collision with root package name */
    protected com.tencent.tencentmap.mapsdk.maps.TencentMap.OnPolygonClickListener f52279ay;

    /* renamed from: az, reason: collision with root package name */
    public java.lang.ref.WeakReference<com.tencent.tencentmap.mapsdk.maps.TencentMap.InfoWindowAdapter> f52280az;

    /* renamed from: g, reason: collision with root package name */
    private com.tencent.mapsdk.internal.qk f52281g;

    /* renamed from: h, reason: collision with root package name */
    private com.tencent.mapsdk.internal.nf f52282h;

    /* renamed from: i, reason: collision with root package name */
    private volatile boolean f52283i;

    /* renamed from: com.tencent.mapsdk.internal.tz$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass1 implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f52284a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f52285b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f52286c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f52287d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f52288e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f52289f;

        public AnonymousClass1(float f17, float f18, float f19, float f27, boolean z17, float f28) {
            this.f52284a = f17;
            this.f52285b = f18;
            this.f52286c = f19;
            this.f52287d = f27;
            this.f52288e = z17;
            this.f52289f = f28;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.tencent.mapsdk.internal.tz.this.f52274at += this.f52284a;
            com.tencent.mapsdk.internal.tz tzVar = com.tencent.mapsdk.internal.tz.this;
            com.tencent.mapsdk.internal.tz.a(tzVar, this.f52285b, tzVar.f52274at);
            if (com.tencent.mapsdk.internal.tz.b(com.tencent.mapsdk.internal.tz.this) < 10) {
                com.tencent.mapsdk.internal.ko.a(this, 16L);
                return;
            }
            com.tencent.mapsdk.internal.tz.a(com.tencent.mapsdk.internal.tz.this, this.f52285b, this.f52286c);
            int max = com.tencent.mapsdk.internal.tz.this.d().getMinScaleLevel() != -1 ? java.lang.Math.max(3, com.tencent.mapsdk.internal.tz.this.d().getMinScaleLevel()) : 3;
            int min = com.tencent.mapsdk.internal.tz.this.d().getMaxScaleLevel() == -1 ? 20 : java.lang.Math.min(22, com.tencent.mapsdk.internal.tz.this.d().getMaxScaleLevel());
            float f17 = this.f52287d;
            if (f17 < max || f17 > min) {
                return;
            }
            if (this.f52288e) {
                com.tencent.mapsdk.internal.tz.this.f52273as.f50508h.a((int) this.f52287d, new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.tz.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.tencent.mapsdk.internal.tz.this.f52273as.f50508h.a(com.tencent.mapsdk.internal.tz.AnonymousClass1.this.f52289f);
                    }
                });
            } else {
                com.tencent.mapsdk.internal.tz.this.f52273as.f50508h.a(this.f52289f);
            }
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tz$3, reason: invalid class name */
    /* loaded from: classes13.dex */
    public static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f52293a;

        static {
            int[] iArr = new int[com.tencent.tencentmap.mapsdk.maps.model.MapViewType.values().length];
            f52293a = iArr;
            try {
                iArr[com.tencent.tencentmap.mapsdk.maps.model.MapViewType.TextureView.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f52293a[com.tencent.tencentmap.mapsdk.maps.model.MapViewType.RenderLayer.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f52293a[com.tencent.tencentmap.mapsdk.maps.model.MapViewType.SurfaceView.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes13.dex */
    public static class a implements com.tencent.mapsdk.internal.oo {

        /* renamed from: a, reason: collision with root package name */
        private final java.lang.ref.WeakReference<com.tencent.mapsdk.internal.ne> f52294a;

        public a(com.tencent.mapsdk.internal.ne neVar) {
            this.f52294a = new java.lang.ref.WeakReference<>(neVar);
        }

        @Override // com.tencent.mapsdk.internal.oo
        public final boolean a(int i17) {
            com.tencent.tencentmap.mapsdk.maps.CustomRender customRender;
            com.tencent.mapsdk.internal.ne neVar = this.f52294a.get();
            if (neVar == null || i17 != com.tencent.mapsdk.internal.ne.b.AboveToplayer.f50535g || (customRender = neVar.F) == null) {
                return false;
            }
            customRender.onDrawFrame();
            return true;
        }
    }

    public tz(android.content.Context context, com.tencent.tencentmap.mapsdk.maps.TencentMapOptions tencentMapOptions, android.view.ViewGroup viewGroup) {
        super(context, tencentMapOptions, viewGroup);
        this.f52264aj = new java.util.concurrent.CopyOnWriteArrayList();
        this.f52265ak = null;
        this.f52266al = true;
        this.f52267am = false;
        this.f52268an = false;
        this.f52269ao = false;
        this.f52270ap = false;
        this.f52271aq = false;
        this.f52272ar = 0;
        this.f52274at = 0.5f;
        this.f52275au = 0;
        this.f52276av = null;
    }

    private void ad() {
        com.tencent.mapsdk.internal.bu buVar;
        java.lang.ref.WeakReference<com.tencent.mapsdk.internal.bu> weakReference = this.f52276av;
        if (weakReference == null || (buVar = weakReference.get()) == null) {
            return;
        }
        buVar.d();
    }

    private void af() {
        if (this.f52282h != null) {
            while (!this.f52282h.f50561b) {
                try {
                    this.f52282h.c();
                    this.f52282h.b();
                } catch (java.lang.InterruptedException e17) {
                    com.tencent.mapsdk.core.utils.log.LogUtil.b(android.util.Log.getStackTraceString(e17));
                }
                if (!this.f52282h.isAlive()) {
                    break;
                } else {
                    this.f52282h.join();
                }
            }
        }
        this.f52282h = null;
        this.f52283i = false;
    }

    private void ag() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mapsdk.internal.hg hgVar = ((com.tencent.mapsdk.internal.ne) this.d_).f49000c;
        if (hgVar != null) {
            hgVar.a().a(true, currentTimeMillis);
        }
        this.f52277aw = false;
    }

    private void ah() {
        this.f52277aw = true;
    }

    private void ai() {
        this.f52270ap = true;
        com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListenerList tencentMapGestureListenerList = this.f52265ak;
        if (tencentMapGestureListenerList == null || !this.f52266al) {
            return;
        }
        tencentMapGestureListenerList.onMapStable();
    }

    public static /* synthetic */ int b(com.tencent.mapsdk.internal.tz tzVar) {
        int i17 = tzVar.f52275au;
        tzVar.f52275au = i17 + 1;
        return i17;
    }

    private void n(boolean z17) {
        com.tencent.mapsdk.internal.bu buVar;
        java.lang.ref.WeakReference<com.tencent.mapsdk.internal.bu> weakReference = this.f52276av;
        if (weakReference == null || (buVar = weakReference.get()) == null) {
            return;
        }
        buVar.setZOrderMediaOverlay(z17);
    }

    @Override // com.tencent.mapsdk.internal.az
    public final com.tencent.mapsdk.internal.ol E() {
        com.tencent.mapsdk.internal.ne neVar = this.f52273as;
        if (neVar == null) {
            return null;
        }
        return neVar.f50521u;
    }

    @Override // com.tencent.mapsdk.internal.az
    public final void F() {
        if (this.f52282h == null && this.f52273as != null) {
            this.f52282h = new com.tencent.mapsdk.internal.nf(this.f52273as);
        }
        if (this.f52283i) {
            return;
        }
        try {
            this.f52282h.start();
            this.f52283i = true;
        } catch (java.lang.Exception e17) {
            com.tencent.mapsdk.core.utils.log.LogUtil.b("startTextureCreatorIfNeed failed", e17);
        }
    }

    @Override // com.tencent.mapsdk.internal.az
    public final void G() {
        af();
        if (this.f52273as != null) {
            getEGLContextHash();
            this.f52273as.L();
        }
    }

    @Override // com.tencent.mapsdk.internal.az
    public final void H() {
        com.tencent.mapsdk.internal.bu buVar;
        java.lang.ref.WeakReference<com.tencent.mapsdk.internal.bu> weakReference = this.f52276av;
        if (weakReference != null && (buVar = weakReference.get()) != null) {
            buVar.d();
        }
        com.tencent.mapsdk.internal.ne neVar = this.f52273as;
        if (neVar != null) {
            neVar.f50522v = true;
        }
    }

    @Override // com.tencent.mapsdk.internal.az
    public final android.content.Context I() {
        return this.f49016d;
    }

    @Override // com.tencent.mapsdk.internal.az
    public final void J() {
        com.tencent.mapsdk.internal.ne neVar = this.f52273as;
        if (neVar != null) {
            neVar.f50522v = true;
        }
    }

    @Override // com.tencent.mapsdk.internal.az
    public final boolean K() {
        com.tencent.mapsdk.internal.ne neVar = this.f52273as;
        return neVar != null && neVar.P();
    }

    @Override // com.tencent.mapsdk.internal.az
    public final boolean L() {
        com.tencent.mapsdk.internal.ne neVar = this.f52273as;
        if (neVar == null) {
            return false;
        }
        return neVar.R();
    }

    @Override // com.tencent.mapsdk.internal.az
    public final com.tencent.tencentmap.mapsdk.maps.TencentMapOptions M() {
        return this.f49017e;
    }

    @Override // com.tencent.mapsdk.internal.az
    public final boolean O() {
        return this.f52267am;
    }

    @Override // com.tencent.mapsdk.internal.az
    public final com.tencent.tencentmap.mapsdk.maps.TencentMap.OnPolylineClickListener P() {
        return this.f52278ax;
    }

    @Override // com.tencent.mapsdk.internal.az
    public final com.tencent.tencentmap.mapsdk.maps.TencentMap.OnPolygonClickListener Q() {
        return this.f52279ay;
    }

    @Override // com.tencent.mapsdk.internal.az
    public final com.tencent.tencentmap.mapsdk.maps.TencentMap.InfoWindowAdapter R() {
        java.lang.ref.WeakReference<com.tencent.tencentmap.mapsdk.maps.TencentMap.InfoWindowAdapter> weakReference = this.f52280az;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.tencent.mapsdk.internal.az
    public final com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMarkerCollisionStatusListener S() {
        return this.aA;
    }

    @Override // com.tencent.mapsdk.internal.az
    public final com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMarkerDragListener T() {
        return this.aB;
    }

    @Override // com.tencent.mapsdk.internal.az
    public final com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMarkerClickListener U() {
        return this.aC;
    }

    @Override // com.tencent.mapsdk.internal.az
    public final com.tencent.tencentmap.mapsdk.maps.TencentMap.OnInfoWindowClickListener V() {
        return this.aD;
    }

    @Override // com.tencent.mapsdk.internal.az
    public final com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapFrameFinishCallback X() {
        return this.aE;
    }

    @Override // com.tencent.mapsdk.internal.bo
    public void Z() {
        super.Z();
        a(this.f49017e);
    }

    public void ae() {
    }

    public final int aj() {
        com.tencent.mapsdk.internal.bu buVar;
        java.lang.ref.WeakReference<com.tencent.mapsdk.internal.bu> weakReference = this.f52276av;
        if (weakReference == null || (buVar = weakReference.get()) == null) {
            return Integer.MAX_VALUE;
        }
        return buVar.getMapWidth();
    }

    public final int ak() {
        com.tencent.mapsdk.internal.bu buVar;
        java.lang.ref.WeakReference<com.tencent.mapsdk.internal.bu> weakReference = this.f52276av;
        if (weakReference == null || (buVar = weakReference.get()) == null) {
            return Integer.MAX_VALUE;
        }
        return buVar.getMapHeight();
    }

    public final boolean al() {
        android.content.Context context = this.f49016d;
        if (context == null) {
            return false;
        }
        android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) context.getSystemService("accessibility");
        return accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
    }

    public final void am() {
        if (!this.f52267am) {
            com.tencent.mapsdk.internal.ko.a(new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.tz.2
                @Override // java.lang.Runnable
                public final void run() {
                    for (com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapLoadedCallback onMapLoadedCallback : com.tencent.mapsdk.internal.tz.this.f52264aj) {
                        if (onMapLoadedCallback != null) {
                            onMapLoadedCallback.onMapLoaded();
                        }
                    }
                }
            });
        }
        this.f52267am = true;
    }

    @Override // com.tencent.mapsdk.internal.az
    public final com.tencent.tencentmap.mapsdk.maps.TencentMapOptions.MapUserSetting d() {
        return this.f49017e.getMapUserSetting();
    }

    @Override // com.tencent.mapsdk.internal.az, com.tencent.mapsdk.internal.oy
    public int getEGLContextHash() {
        javax.microedition.khronos.egl.EGLContext eglGetCurrentContext;
        javax.microedition.khronos.egl.EGL10 egl10 = (javax.microedition.khronos.egl.EGL10) javax.microedition.khronos.egl.EGLContext.getEGL();
        if (egl10 == null || (eglGetCurrentContext = egl10.eglGetCurrentContext()) == null) {
            return 0;
        }
        return eglGetCurrentContext.hashCode();
    }

    @Override // com.tencent.mapsdk.internal.az
    public final void l(boolean z17) {
        this.f52273as.f50506f.i(z17);
    }

    @Override // com.tencent.mapsdk.internal.bo, com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onCreated() {
        super.onCreated();
        this.f52276av = getMapRenderView();
        this.f52281g = new com.tencent.mapsdk.internal.qk(this);
        this.f52277aw = true;
        ((com.tencent.mapsdk.vector.VectorMap) this.e_).a((com.tencent.mapsdk.internal.pb) this);
    }

    @Override // com.tencent.mapsdk.internal.bo, com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onDestroy() {
        super.onDestroy();
        this.f52264aj.clear();
        this.f52265ak = null;
        this.f52278ax = null;
        this.f52279ay = null;
        this.aA = null;
        this.aB = null;
        this.aC = null;
        this.aD = null;
        this.aE = null;
        ((com.tencent.mapsdk.vector.VectorMap) this.e_).a((com.tencent.mapsdk.internal.pb) null);
    }

    @Override // com.tencent.mapsdk.internal.bo, com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onPause() {
        com.tencent.mapsdk.internal.rw rwVar;
        super.onPause();
        com.tencent.mapsdk.internal.nf nfVar = this.f52282h;
        if (nfVar != null) {
            nfVar.c();
        }
        com.tencent.mapsdk.internal.ne neVar = this.f52273as;
        if (neVar.f50506f != null) {
            neVar.f50522v = false;
            neVar.B = false;
            neVar.h(false);
            com.tencent.mapsdk.internal.sa saVar = neVar.A;
            if (saVar != null) {
                saVar.f51320g = true;
            }
            com.tencent.mapsdk.internal.aa aaVar = neVar.f50508h.f48818o;
            if (aaVar != null) {
                aaVar.a();
            }
            neVar.f50506f.m();
            if (!neVar.f50517q || (rwVar = neVar.f50509i) == null) {
                return;
            }
            rwVar.a();
        }
    }

    @Override // com.tencent.mapsdk.internal.bo, com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onResume() {
        com.tencent.mapsdk.internal.rw rwVar;
        com.tencent.mapsdk.internal.bu buVar;
        super.onResume();
        com.tencent.mapsdk.internal.nf nfVar = this.f52282h;
        if (nfVar != null) {
            com.tencent.mapsdk.core.utils.log.LogUtil.a(nfVar.a()).c(com.tencent.mapsdk.internal.la.a.f50266g, "tms-texture thread resume");
            nfVar.f50560a = false;
            synchronized (nfVar) {
                nfVar.notifyAll();
            }
        }
        com.tencent.mapsdk.internal.ne neVar = this.f52273as;
        if (neVar.f50506f != null) {
            neVar.f50522v = true;
            neVar.B = true;
            com.tencent.mapsdk.internal.tk tkVar = neVar.f50506f;
            if (tkVar != null && tkVar.f51661e != 0) {
                tkVar.b(new com.tencent.mapsdk.internal.tk.AnonymousClass38());
            }
            neVar.h(neVar.B);
            if (neVar.f50523w) {
                com.tencent.mapsdk.internal.aa aaVar = neVar.f50508h.f48818o;
                com.tencent.mapsdk.internal.aa.a aVar = aaVar.f48756d;
                if (aVar != null) {
                    aVar.destroy();
                }
                com.tencent.mapsdk.internal.aa.a aVar2 = new com.tencent.mapsdk.internal.aa.a(aaVar);
                aaVar.f48756d = aVar2;
                aVar2.start();
                neVar.f50523w = false;
            } else {
                com.tencent.mapsdk.internal.aa aaVar2 = neVar.f50508h.f48818o;
                if (aaVar2 != null) {
                    aaVar2.b();
                }
            }
            com.tencent.mapsdk.internal.az azVar = neVar.f50512l;
            if (azVar != null && azVar.getMapRenderView() != null && (buVar = neVar.f50512l.getMapRenderView().get()) != null) {
                buVar.d();
            }
            if (neVar.f50516p) {
                neVar.f50506f.l();
            }
            if (neVar.f50517q && (rwVar = neVar.f50509i) != null) {
                rwVar.b();
            }
            com.tencent.mapsdk.internal.sa saVar = neVar.A;
            if (saVar != null) {
                saVar.f51320g = false;
                saVar.f51322i.sendEmptyMessage(130818);
            }
        }
    }

    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        com.tencent.mapsdk.internal.qk qkVar = this.f52281g;
        if (qkVar != null) {
            return qkVar.onTouch(null, motionEvent);
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.pb
    public final void p_() {
        if (this.f52277aw) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mapsdk.internal.hg hgVar = ((com.tencent.mapsdk.internal.ne) this.d_).f49000c;
            if (hgVar != null) {
                hgVar.a().a(true, currentTimeMillis);
            }
            this.f52277aw = false;
        }
    }

    @Override // com.tencent.mapsdk.internal.az
    public final com.tencent.mapsdk.internal.nd c() {
        return this.f52273as.f50511k;
    }

    @Override // com.tencent.mapsdk.internal.bo
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.tencent.mapsdk.vector.VectorMap createMap(com.tencent.mapsdk.internal.ne neVar) {
        return new com.tencent.mapsdk.vector.VectorMap(neVar);
    }

    @Override // com.tencent.mapsdk.internal.bo
    /* renamed from: b */
    public final /* synthetic */ com.tencent.mapsdk.internal.bu createMapView(com.tencent.mapsdk.internal.ne neVar, android.view.ViewGroup viewGroup) {
        com.tencent.mapsdk.internal.bu ucVar;
        com.tencent.mapsdk.internal.ne neVar2 = neVar;
        int i17 = com.tencent.mapsdk.internal.tz.AnonymousClass3.f52293a[ab().ordinal()];
        if (i17 == 1) {
            ucVar = new com.tencent.mapsdk.internal.uc(neVar2);
        } else if (i17 != 2) {
            ucVar = new com.tencent.mapsdk.internal.ud(neVar2);
        } else {
            ucVar = new com.tencent.mapsdk.internal.ub(neVar2);
        }
        if (viewGroup != null) {
            viewGroup.addView(ucVar.getView());
        }
        return ucVar;
    }

    private com.tencent.mapsdk.internal.bu a(com.tencent.mapsdk.internal.ne neVar, android.view.ViewGroup viewGroup) {
        com.tencent.mapsdk.internal.bu ucVar;
        int i17 = com.tencent.mapsdk.internal.tz.AnonymousClass3.f52293a[ab().ordinal()];
        if (i17 == 1) {
            ucVar = new com.tencent.mapsdk.internal.uc(neVar);
        } else if (i17 != 2) {
            ucVar = new com.tencent.mapsdk.internal.ud(neVar);
        } else {
            ucVar = new com.tencent.mapsdk.internal.ub(neVar);
        }
        if (viewGroup != null) {
            viewGroup.addView(ucVar.getView());
        }
        return ucVar;
    }

    public static float c(float f17) {
        int i17 = (int) f17;
        return (1 << (i17 - 3)) * 3.0517578E-5f * ((float) java.lang.Math.pow(2.0d, f17 - i17));
    }

    private com.tencent.mapsdk.internal.ne b(android.content.Context context, com.tencent.tencentmap.mapsdk.maps.TencentMapOptions tencentMapOptions) {
        com.tencent.mapsdk.internal.ne neVar = new com.tencent.mapsdk.internal.ne(context, tencentMapOptions, this);
        this.f52273as = neVar;
        return neVar;
    }

    @Override // com.tencent.mapsdk.internal.az
    public final void a(com.tencent.mapsdk.internal.fb fbVar) {
        this.f52281g.a(fbVar);
    }

    @Override // com.tencent.mapsdk.internal.az
    public final void a(com.tencent.mapsdk.internal.oq oqVar) {
        this.f52273as.a(oqVar);
    }

    @Override // com.tencent.mapsdk.internal.az
    public final void b(com.tencent.mapsdk.internal.fb fbVar) {
        com.tencent.mapsdk.internal.qk qkVar = this.f52281g;
        synchronized (qkVar.f50996a) {
            qkVar.f50996a.b(fbVar);
        }
    }

    @Override // com.tencent.mapsdk.internal.az
    public final void a(com.tencent.mapsdk.internal.ol olVar, com.tencent.mapsdk.internal.lu luVar) {
        if (this.f52273as.a(this.f49016d.getApplicationContext(), olVar, luVar, new com.tencent.mapsdk.internal.tz.a(this.f52273as))) {
            com.tencent.mapsdk.internal.ad adVar = this.f52273as.f50508h;
            com.tencent.map.lib.models.GeoPoint geoPoint = new com.tencent.map.lib.models.GeoPoint(com.tencent.mapsdk.internal.ad.f48813n, com.tencent.mapsdk.internal.ad.f48812m);
            com.tencent.mapsdk.internal.v vVar = adVar.A;
            android.graphics.Rect j17 = adVar.f48829z.j();
            int latitudeE6 = geoPoint.getLatitudeE6();
            int longitudeE6 = geoPoint.getLongitudeE6();
            vVar.f52421n = j17;
            vVar.f52410c = com.tencent.tencentmap.mapsdk.maps.model.GeometryConstants.BOUNDARY_WORLD;
            vVar.c(13);
            vVar.a(0);
            vVar.a(latitudeE6, longitudeE6, false);
            adVar.f48829z.i().b(adVar.G);
        }
    }

    @Override // com.tencent.mapsdk.internal.az
    public final com.tencent.mapsdk.internal.ne b() {
        return this.f52273as;
    }

    @Override // com.tencent.mapsdk.internal.az
    public final void a(float f17, float f18, float f19) {
        com.tencent.mapsdk.internal.ne neVar = this.f52273as;
        if (neVar != null) {
            float f27 = neVar.f50508h.A.f52409b.f52443l;
            float c17 = c(f19);
            boolean z17 = ((double) java.lang.Math.abs(f27 - c17)) > 1.0E-4d;
            this.f52275au = 0;
            com.tencent.mapsdk.internal.ko.a(new com.tencent.mapsdk.internal.tz.AnonymousClass1((f18 - this.f52274at) / 10.0f, f17, f18, f19, z17, c17));
        }
    }

    public void a(javax.microedition.khronos.opengles.GL10 gl10, javax.microedition.khronos.egl.EGLConfig eGLConfig) {
        com.tencent.mapsdk.internal.mp mpVar;
        com.tencent.mapsdk.internal.ne neVar = this.f52273as;
        if (neVar.f50506f == null || (mpVar = neVar.f50507g) == null) {
            return;
        }
        mpVar.a();
    }

    public void a(javax.microedition.khronos.opengles.GL10 gl10, int i17, int i18) {
        com.tencent.mapsdk.internal.ne neVar = this.f52273as;
        if (neVar.f50506f != null) {
            neVar.f50522v = true;
            neVar.f50515o.set(0, 0, i17, i18);
            neVar.a(0, 0, i17, i18, false);
            neVar.f50508h.n();
        }
    }

    public boolean a(javax.microedition.khronos.opengles.GL10 gl10) {
        return this.f52273as.a(gl10);
    }

    private void a(float f17, float f18, boolean z17) {
        this.f52273as.f50508h.b(f17, f18, z17);
    }

    @Override // com.tencent.mapsdk.internal.az
    public final void a(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnPolylineClickListener onPolylineClickListener) {
        this.f52278ax = onPolylineClickListener;
    }

    @Override // com.tencent.mapsdk.internal.az
    public final void a(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnPolygonClickListener onPolygonClickListener) {
        this.f52279ay = onPolygonClickListener;
    }

    @Override // com.tencent.mapsdk.internal.az
    public final void a(com.tencent.tencentmap.mapsdk.maps.TencentMap.InfoWindowAdapter infoWindowAdapter) {
        this.f52280az = new java.lang.ref.WeakReference<>(infoWindowAdapter);
    }

    private void a(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnVectorOverlayClickListener onVectorOverlayClickListener) {
        this.f52273as.L = onVectorOverlayClickListener;
    }

    @Override // com.tencent.mapsdk.internal.az
    public final void a(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMarkerCollisionStatusListener onMarkerCollisionStatusListener) {
        this.aA = onMarkerCollisionStatusListener;
    }

    @Override // com.tencent.mapsdk.internal.az
    public final void a(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMarkerDragListener onMarkerDragListener) {
        this.aB = onMarkerDragListener;
    }

    @Override // com.tencent.mapsdk.internal.az
    public final void a(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMarkerClickListener onMarkerClickListener) {
        this.aC = onMarkerClickListener;
    }

    @Override // com.tencent.mapsdk.internal.az
    public final void a(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnInfoWindowClickListener onInfoWindowClickListener) {
        this.aD = onInfoWindowClickListener;
    }

    public final void a(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapFrameFinishCallback onMapFrameFinishCallback) {
        this.aE = onMapFrameFinishCallback;
    }

    @Override // com.tencent.mapsdk.internal.bo
    public final /* synthetic */ com.tencent.mapsdk.internal.ne a(android.content.Context context, com.tencent.tencentmap.mapsdk.maps.TencentMapOptions tencentMapOptions) {
        com.tencent.mapsdk.internal.ne neVar = new com.tencent.mapsdk.internal.ne(context, tencentMapOptions, this);
        this.f52273as = neVar;
        return neVar;
    }

    public static /* synthetic */ void a(com.tencent.mapsdk.internal.tz tzVar, float f17, float f18) {
        tzVar.f52273as.f50508h.b(f17, f18, true);
    }
}
