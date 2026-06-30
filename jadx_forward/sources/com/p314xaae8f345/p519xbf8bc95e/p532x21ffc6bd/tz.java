package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public abstract class tz extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bo<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne, com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9> implements com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pb {

    /* renamed from: j, reason: collision with root package name */
    private static final int f133795j = 10;

    /* renamed from: k, reason: collision with root package name */
    private static final int f133796k = 16;
    protected com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMarkerCollisionStatusListener aA;
    protected com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMarkerDragListener aB;
    protected com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMarkerClickListener aC;
    protected com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnInfoWindowClickListener aD;
    protected com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMapFrameFinishCallback aE;

    /* renamed from: aj, reason: collision with root package name */
    public java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMapLoadedCallback> f133797aj;

    /* renamed from: ak, reason: collision with root package name */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26086x3c4a5e4 f133798ak;

    /* renamed from: al, reason: collision with root package name */
    public boolean f133799al;

    /* renamed from: am, reason: collision with root package name */
    protected volatile boolean f133800am;

    /* renamed from: an, reason: collision with root package name */
    protected volatile boolean f133801an;

    /* renamed from: ao, reason: collision with root package name */
    protected volatile boolean f133802ao;

    /* renamed from: ap, reason: collision with root package name */
    public volatile boolean f133803ap;

    /* renamed from: aq, reason: collision with root package name */
    public volatile boolean f133804aq;

    /* renamed from: ar, reason: collision with root package name */
    public int f133805ar;

    /* renamed from: as, reason: collision with root package name */
    public com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne f133806as;

    /* renamed from: at, reason: collision with root package name */
    public float f133807at;

    /* renamed from: au, reason: collision with root package name */
    public int f133808au;

    /* renamed from: av, reason: collision with root package name */
    protected java.lang.ref.WeakReference<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu> f133809av;

    /* renamed from: aw, reason: collision with root package name */
    public volatile boolean f133810aw;

    /* renamed from: ax, reason: collision with root package name */
    protected com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnPolylineClickListener f133811ax;

    /* renamed from: ay, reason: collision with root package name */
    protected com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnPolygonClickListener f133812ay;

    /* renamed from: az, reason: collision with root package name */
    public java.lang.ref.WeakReference<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.InfoWindowAdapter> f133813az;

    /* renamed from: g, reason: collision with root package name */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qk f133814g;

    /* renamed from: h, reason: collision with root package name */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nf f133815h;

    /* renamed from: i, reason: collision with root package name */
    private volatile boolean f133816i;

    /* renamed from: com.tencent.mapsdk.internal.tz$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass1 implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f133817a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f133818b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f133819c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f133820d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f133821e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f133822f;

        public AnonymousClass1(float f17, float f18, float f19, float f27, boolean z17, float f28) {
            this.f133817a = f17;
            this.f133818b = f18;
            this.f133819c = f19;
            this.f133820d = f27;
            this.f133821e = z17;
            this.f133822f = f28;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tz.this.f133807at += this.f133817a;
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tz tzVar = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tz.this;
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tz.a(tzVar, this.f133818b, tzVar.f133807at);
            if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tz.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tz.this) < 10) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ko.a(this, 16L);
                return;
            }
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tz.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tz.this, this.f133818b, this.f133819c);
            int max = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tz.this.d().m99260x55bce096() != -1 ? java.lang.Math.max(3, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tz.this.d().m99260x55bce096()) : 3;
            int min = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tz.this.d().m99259xe91eb128() == -1 ? 20 : java.lang.Math.min(22, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tz.this.d().m99259xe91eb128());
            float f17 = this.f133820d;
            if (f17 < max || f17 > min) {
                return;
            }
            if (this.f133821e) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tz.this.f133806as.f132041h.a((int) this.f133820d, new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.tz.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tz.this.f133806as.f132041h.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tz.AnonymousClass1.this.f133822f);
                    }
                });
            } else {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tz.this.f133806as.f132041h.a(this.f133822f);
            }
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tz$3, reason: invalid class name */
    /* loaded from: classes13.dex */
    public static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f133826a;

        static {
            int[] iArr = new int[com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26058x81aff8db.m99639xcee59d22().length];
            f133826a = iArr;
            try {
                iArr[com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26058x81aff8db.TextureView.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f133826a[com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26058x81aff8db.RenderLayer.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f133826a[com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26058x81aff8db.SurfaceView.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes13.dex */
    public static class a implements com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oo {

        /* renamed from: a, reason: collision with root package name */
        private final java.lang.ref.WeakReference<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne> f133827a;

        public a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar) {
            this.f133827a = new java.lang.ref.WeakReference<>(neVar);
        }

        @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oo
        public final boolean a(int i17) {
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25953x1e5df487 interfaceC25953x1e5df487;
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f133827a.get();
            if (neVar == null || i17 != com.tencent.mapsdk.internal.ne.b.AboveToplayer.f132068g || (interfaceC25953x1e5df487 = neVar.F) == null) {
                return false;
            }
            interfaceC25953x1e5df487.m99130x588736a();
            return true;
        }
    }

    public tz(android.content.Context context, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7 c25966x7e4576a7, android.view.ViewGroup viewGroup) {
        super(context, c25966x7e4576a7, viewGroup);
        this.f133797aj = new java.util.concurrent.CopyOnWriteArrayList();
        this.f133798ak = null;
        this.f133799al = true;
        this.f133800am = false;
        this.f133801an = false;
        this.f133802ao = false;
        this.f133803ap = false;
        this.f133804aq = false;
        this.f133805ar = 0;
        this.f133807at = 0.5f;
        this.f133808au = 0;
        this.f133809av = null;
    }

    private void ad() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu buVar;
        java.lang.ref.WeakReference<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu> weakReference = this.f133809av;
        if (weakReference == null || (buVar = weakReference.get()) == null) {
            return;
        }
        buVar.d();
    }

    private void af() {
        if (this.f133815h != null) {
            while (!this.f133815h.f132094b) {
                try {
                    this.f133815h.c();
                    this.f133815h.b();
                } catch (java.lang.InterruptedException e17) {
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(android.util.Log.getStackTraceString(e17));
                }
                if (!this.f133815h.isAlive()) {
                    break;
                } else {
                    this.f133815h.join();
                }
            }
        }
        this.f133815h = null;
        this.f133816i = false;
    }

    private void ag() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hg hgVar = ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne) this.d_).f130533c;
        if (hgVar != null) {
            hgVar.a().a(true, currentTimeMillis);
        }
        this.f133810aw = false;
    }

    private void ah() {
        this.f133810aw = true;
    }

    private void ai() {
        this.f133803ap = true;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26086x3c4a5e4 c26086x3c4a5e4 = this.f133798ak;
        if (c26086x3c4a5e4 == null || !this.f133799al) {
            return;
        }
        c26086x3c4a5e4.mo99979x348be498();
    }

    public static /* synthetic */ int b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tz tzVar) {
        int i17 = tzVar.f133808au;
        tzVar.f133808au = i17 + 1;
        return i17;
    }

    private void n(boolean z17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu buVar;
        java.lang.ref.WeakReference<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu> weakReference = this.f133809av;
        if (weakReference == null || (buVar = weakReference.get()) == null) {
            return;
        }
        buVar.mo36665xe5e6c0e2(z17);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az
    public final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ol E() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f133806as;
        if (neVar == null) {
            return null;
        }
        return neVar.f132054u;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az
    public final void F() {
        if (this.f133815h == null && this.f133806as != null) {
            this.f133815h = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nf(this.f133806as);
        }
        if (this.f133816i) {
            return;
        }
        try {
            this.f133815h.start();
            this.f133816i = true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b("startTextureCreatorIfNeed failed", e17);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az
    public final void G() {
        af();
        if (this.f133806as != null) {
            mo36527xd76ee1e9();
            this.f133806as.L();
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az
    public final void H() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu buVar;
        java.lang.ref.WeakReference<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu> weakReference = this.f133809av;
        if (weakReference != null && (buVar = weakReference.get()) != null) {
            buVar.d();
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f133806as;
        if (neVar != null) {
            neVar.f132055v = true;
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az
    public final android.content.Context I() {
        return this.f130549d;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az
    public final void J() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f133806as;
        if (neVar != null) {
            neVar.f132055v = true;
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az
    public final boolean K() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f133806as;
        return neVar != null && neVar.P();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az
    public final boolean L() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f133806as;
        if (neVar == null) {
            return false;
        }
        return neVar.R();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7 M() {
        return this.f130550e;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az
    public final boolean O() {
        return this.f133800am;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnPolylineClickListener P() {
        return this.f133811ax;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnPolygonClickListener Q() {
        return this.f133812ay;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.InfoWindowAdapter R() {
        java.lang.ref.WeakReference<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.InfoWindowAdapter> weakReference = this.f133813az;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMarkerCollisionStatusListener S() {
        return this.aA;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMarkerDragListener T() {
        return this.aB;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMarkerClickListener U() {
        return this.aC;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnInfoWindowClickListener V() {
        return this.aD;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMapFrameFinishCallback X() {
        return this.aE;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bo
    public void Z() {
        super.Z();
        a(this.f130550e);
    }

    public void ae() {
    }

    public final int aj() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu buVar;
        java.lang.ref.WeakReference<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu> weakReference = this.f133809av;
        if (weakReference == null || (buVar = weakReference.get()) == null) {
            return Integer.MAX_VALUE;
        }
        return buVar.mo36662x8610cf40();
    }

    public final int ak() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu buVar;
        java.lang.ref.WeakReference<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu> weakReference = this.f133809av;
        if (weakReference == null || (buVar = weakReference.get()) == null) {
            return Integer.MAX_VALUE;
        }
        return buVar.mo36661x223a1eed();
    }

    public final boolean al() {
        android.content.Context context = this.f130549d;
        if (context == null) {
            return false;
        }
        android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) context.getSystemService("accessibility");
        return accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
    }

    public final void am() {
        if (!this.f133800am) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ko.a(new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.tz.2
                @Override // java.lang.Runnable
                public final void run() {
                    for (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMapLoadedCallback onMapLoadedCallback : com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tz.this.f133797aj) {
                        if (onMapLoadedCallback != null) {
                            onMapLoadedCallback.mo99142x28538962();
                        }
                    }
                }
            });
        }
        this.f133800am = true;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7.MapUserSetting d() {
        return this.f130550e.m99205x9f2f0dff();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oy
    /* renamed from: getEGLContextHash */
    public int mo36527xd76ee1e9() {
        javax.microedition.khronos.egl.EGLContext eglGetCurrentContext;
        javax.microedition.khronos.egl.EGL10 egl10 = (javax.microedition.khronos.egl.EGL10) javax.microedition.khronos.egl.EGLContext.getEGL();
        if (egl10 == null || (eglGetCurrentContext = egl10.eglGetCurrentContext()) == null) {
            return 0;
        }
        return eglGetCurrentContext.hashCode();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az
    public final void l(boolean z17) {
        this.f133806as.f132039f.i(z17);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bo, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0.MapViewProxy
    /* renamed from: onCreated */
    public void mo36642x8cf48009() {
        super.mo36642x8cf48009();
        this.f133809av = mo36070x17867021();
        this.f133814g = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qk(this);
        this.f133810aw = true;
        ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.e_).a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pb) this);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bo, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0.MapViewProxy
    /* renamed from: onDestroy */
    public void mo36643xac79a11b() {
        super.mo36643xac79a11b();
        this.f133797aj.clear();
        this.f133798ak = null;
        this.f133811ax = null;
        this.f133812ay = null;
        this.aA = null;
        this.aB = null;
        this.aC = null;
        this.aD = null;
        this.aE = null;
        ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.e_).a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pb) null);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bo, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0.MapViewProxy
    /* renamed from: onPause */
    public void mo36644xb01dfb57() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rw rwVar;
        super.mo36644xb01dfb57();
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nf nfVar = this.f133815h;
        if (nfVar != null) {
            nfVar.c();
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f133806as;
        if (neVar.f132039f != null) {
            neVar.f132055v = false;
            neVar.B = false;
            neVar.h(false);
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sa saVar = neVar.A;
            if (saVar != null) {
                saVar.f132853g = true;
            }
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.aa aaVar = neVar.f132041h.f130351o;
            if (aaVar != null) {
                aaVar.a();
            }
            neVar.f132039f.m();
            if (!neVar.f132050q || (rwVar = neVar.f132042i) == null) {
                return;
            }
            rwVar.a();
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bo, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0.MapViewProxy
    /* renamed from: onResume */
    public void mo36646x57429eec() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rw rwVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu buVar;
        super.mo36646x57429eec();
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nf nfVar = this.f133815h;
        if (nfVar != null) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(nfVar.a()).c(com.tencent.mapsdk.internal.la.a.f131799g, "tms-texture thread resume");
            nfVar.f132093a = false;
            synchronized (nfVar) {
                nfVar.notifyAll();
            }
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f133806as;
        if (neVar.f132039f != null) {
            neVar.f132055v = true;
            neVar.B = true;
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = neVar.f132039f;
            if (tkVar != null && tkVar.f133194e != 0) {
                tkVar.b(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass38());
            }
            neVar.h(neVar.B);
            if (neVar.f132056w) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.aa aaVar = neVar.f132041h.f130351o;
                com.tencent.mapsdk.internal.aa.a aVar = aaVar.f130289d;
                if (aVar != null) {
                    aVar.destroy();
                }
                com.tencent.mapsdk.internal.aa.a aVar2 = new com.tencent.mapsdk.internal.aa.a(aaVar);
                aaVar.f130289d = aVar2;
                aVar2.start();
                neVar.f132056w = false;
            } else {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.aa aaVar2 = neVar.f132041h.f130351o;
                if (aaVar2 != null) {
                    aaVar2.b();
                }
            }
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az azVar = neVar.f132045l;
            if (azVar != null && azVar.mo36070x17867021() != null && (buVar = neVar.f132045l.mo36070x17867021().get()) != null) {
                buVar.d();
            }
            if (neVar.f132049p) {
                neVar.f132039f.l();
            }
            if (neVar.f132050q && (rwVar = neVar.f132042i) != null) {
                rwVar.b();
            }
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sa saVar = neVar.A;
            if (saVar != null) {
                saVar.f132853g = false;
                saVar.f132855i.sendEmptyMessage(130818);
            }
        }
    }

    /* renamed from: onTouchEvent */
    public boolean mo37007x667eb1da(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qk qkVar = this.f133814g;
        if (qkVar != null) {
            return qkVar.onTouch(null, motionEvent);
        }
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pb
    public final void p_() {
        if (this.f133810aw) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hg hgVar = ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne) this.d_).f130533c;
            if (hgVar != null) {
                hgVar.a().a(true, currentTimeMillis);
            }
            this.f133810aw = false;
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az
    public final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nd c() {
        return this.f133806as.f132044k;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bo
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9 mo36066x23aa1ac0(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar) {
        return new com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9(neVar);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bo
    /* renamed from: b */
    public final /* synthetic */ com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu mo36067xb7c76985(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu ucVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar2 = neVar;
        int i17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tz.AnonymousClass3.f133826a[ab().ordinal()];
        if (i17 == 1) {
            ucVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.uc(neVar2);
        } else if (i17 != 2) {
            ucVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ud(neVar2);
        } else {
            ucVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ub(neVar2);
        }
        if (viewGroup != null) {
            viewGroup.addView(ucVar.mo36663xfb86a31b());
        }
        return ucVar;
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu ucVar;
        int i17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tz.AnonymousClass3.f133826a[ab().ordinal()];
        if (i17 == 1) {
            ucVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.uc(neVar);
        } else if (i17 != 2) {
            ucVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ud(neVar);
        } else {
            ucVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ub(neVar);
        }
        if (viewGroup != null) {
            viewGroup.addView(ucVar.mo36663xfb86a31b());
        }
        return ucVar;
    }

    public static float c(float f17) {
        int i17 = (int) f17;
        return (1 << (i17 - 3)) * 3.0517578E-5f * ((float) java.lang.Math.pow(2.0d, f17 - i17));
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne b(android.content.Context context, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7 c25966x7e4576a7) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne(context, c25966x7e4576a7, this);
        this.f133806as = neVar;
        return neVar;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az
    public final void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb fbVar) {
        this.f133814g.a(fbVar);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az
    public final void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oq oqVar) {
        this.f133806as.a(oqVar);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az
    public final void b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fb fbVar) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qk qkVar = this.f133814g;
        synchronized (qkVar.f132529a) {
            qkVar.f132529a.b(fbVar);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az
    public final void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ol olVar, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lu luVar) {
        if (this.f133806as.a(this.f130549d.getApplicationContext(), olVar, luVar, new com.tencent.mapsdk.internal.tz.a(this.f133806as))) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ad adVar = this.f133806as.f132041h;
            com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ad.f130346n, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ad.f130345m);
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.v vVar = adVar.A;
            android.graphics.Rect j17 = adVar.f130362z.j();
            int m35331xbc3301f3 = c4247x704e24df.m35331xbc3301f3();
            int m35332x962aa94a = c4247x704e24df.m35332x962aa94a();
            vVar.f133954n = j17;
            vVar.f133943c = com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26022x384048dd.f49450x9b60171d;
            vVar.c(13);
            vVar.a(0);
            vVar.a(m35331xbc3301f3, m35332x962aa94a, false);
            adVar.f130362z.i().b(adVar.G);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az
    public final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne b() {
        return this.f133806as;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az
    public final void a(float f17, float f18, float f19) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f133806as;
        if (neVar != null) {
            float f27 = neVar.f132041h.A.f133942b.f133976l;
            float c17 = c(f19);
            boolean z17 = ((double) java.lang.Math.abs(f27 - c17)) > 1.0E-4d;
            this.f133808au = 0;
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ko.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tz.AnonymousClass1((f18 - this.f133807at) / 10.0f, f17, f18, f19, z17, c17));
        }
    }

    public void a(javax.microedition.khronos.opengles.GL10 gl10, javax.microedition.khronos.egl.EGLConfig eGLConfig) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mp mpVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f133806as;
        if (neVar.f132039f == null || (mpVar = neVar.f132040g) == null) {
            return;
        }
        mpVar.a();
    }

    public void a(javax.microedition.khronos.opengles.GL10 gl10, int i17, int i18) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f133806as;
        if (neVar.f132039f != null) {
            neVar.f132055v = true;
            neVar.f132048o.set(0, 0, i17, i18);
            neVar.a(0, 0, i17, i18, false);
            neVar.f132041h.n();
        }
    }

    public boolean a(javax.microedition.khronos.opengles.GL10 gl10) {
        return this.f133806as.a(gl10);
    }

    private void a(float f17, float f18, boolean z17) {
        this.f133806as.f132041h.b(f17, f18, z17);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az
    public final void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnPolylineClickListener onPolylineClickListener) {
        this.f133811ax = onPolylineClickListener;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az
    public final void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnPolygonClickListener onPolygonClickListener) {
        this.f133812ay = onPolygonClickListener;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az
    public final void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.InfoWindowAdapter infoWindowAdapter) {
        this.f133813az = new java.lang.ref.WeakReference<>(infoWindowAdapter);
    }

    private void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnVectorOverlayClickListener onVectorOverlayClickListener) {
        this.f133806as.L = onVectorOverlayClickListener;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az
    public final void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMarkerCollisionStatusListener onMarkerCollisionStatusListener) {
        this.aA = onMarkerCollisionStatusListener;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az
    public final void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMarkerDragListener onMarkerDragListener) {
        this.aB = onMarkerDragListener;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az
    public final void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMarkerClickListener onMarkerClickListener) {
        this.aC = onMarkerClickListener;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az
    public final void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnInfoWindowClickListener onInfoWindowClickListener) {
        this.aD = onInfoWindowClickListener;
    }

    public final void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMapFrameFinishCallback onMapFrameFinishCallback) {
        this.aE = onMapFrameFinishCallback;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bo
    public final /* synthetic */ com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne a(android.content.Context context, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7 c25966x7e4576a7) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne(context, c25966x7e4576a7, this);
        this.f133806as = neVar;
        return neVar;
    }

    public static /* synthetic */ void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tz tzVar, float f17, float f18) {
        tzVar.f133806as.f132041h.b(f17, f18, true);
    }
}
