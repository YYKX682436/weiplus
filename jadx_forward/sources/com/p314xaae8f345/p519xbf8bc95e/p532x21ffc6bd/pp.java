package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class pp extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.an> implements com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.an {
    protected com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df A;
    protected float B;
    protected float C;
    protected float D;
    public boolean E;
    public final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr F;
    public com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ew G;
    private boolean H;
    private int I;

    /* renamed from: J, reason: collision with root package name */
    private int f132222J;
    private boolean K;
    private com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df L;
    private final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qx M;
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26004x5184c038 N;
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26068xb94dc6b4 O;
    private java.lang.String P;
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26067xc981814a Q;
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.im R;
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMarkerClickListener S;
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 T;
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25982xe7f56712[] U;
    private int V;
    private final com.tencent.mapsdk.internal.im.b W;
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26061x5ec49214 X;

    /* renamed from: b, reason: collision with root package name */
    protected android.graphics.Bitmap f132223b;

    /* renamed from: d, reason: collision with root package name */
    boolean f132224d;

    /* renamed from: p, reason: collision with root package name */
    protected final java.lang.Object f132225p;

    /* renamed from: q, reason: collision with root package name */
    float f132226q;

    /* renamed from: r, reason: collision with root package name */
    float f132227r;

    /* renamed from: s, reason: collision with root package name */
    protected boolean f132228s;

    /* renamed from: t, reason: collision with root package name */
    protected float f132229t;

    /* renamed from: u, reason: collision with root package name */
    protected float f132230u;

    /* renamed from: v, reason: collision with root package name */
    protected float f132231v;

    /* renamed from: w, reason: collision with root package name */
    protected final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26064xea4764e4 f132232w;

    /* renamed from: x, reason: collision with root package name */
    protected java.lang.String f132233x;

    /* renamed from: y, reason: collision with root package name */
    protected com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df f132234y;

    /* renamed from: z, reason: collision with root package name */
    protected com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df f132235z;

    /* renamed from: com.tencent.mapsdk.internal.pp$5, reason: invalid class name */
    /* loaded from: classes13.dex */
    public static /* synthetic */ class AnonymousClass5 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f132242a;

        static {
            int[] iArr = new int[com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26061x5ec49214.m99645xcee59d22().length];
            f132242a = iArr;
            try {
                iArr[com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26061x5ec49214.ALONE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f132242a[com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26061x5ec49214.TOGETHER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    public pp(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26064xea4764e4 c26064xea4764e4) {
        super(trVar);
        android.graphics.Bitmap bitmap = null;
        this.f132223b = null;
        this.f132224d = false;
        this.f132225p = new java.lang.Object();
        this.f132226q = 0.5f;
        this.f132227r = 0.5f;
        this.f132228s = false;
        this.f132229t = 0.0f;
        this.f132230u = 0.0f;
        this.f132231v = -1.0f;
        this.f132233x = null;
        this.f132234y = null;
        this.f132235z = null;
        this.A = null;
        this.B = 1.0f;
        this.C = 1.0f;
        this.D = 1.0f;
        this.E = false;
        this.H = false;
        this.I = 0;
        this.f132222J = 0;
        this.K = false;
        this.L = null;
        this.O = com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26068xb94dc6b4.ICON_MARKER;
        this.W = new com.tencent.mapsdk.internal.im.b() { // from class: com.tencent.mapsdk.internal.pp.1
            @Override // com.tencent.mapsdk.internal.im.b
            public final void a(float f17, float f18, float f19, float f27) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pp.this.mo36474x742bae00(f17);
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pp ppVar = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pp.this;
                ppVar.f132229t = f18;
                ppVar.f132230u = f19;
                ppVar.f132231v = f27;
                ppVar.f132228s = true;
                if (ppVar.M != null) {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pp.this.M.a((int) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pp.this.m36893x79734cf4());
                }
            }

            @Override // com.tencent.mapsdk.internal.im.b
            public final void b(float f17) {
            }

            @Override // com.tencent.mapsdk.internal.im.b
            public final void a(float f17) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pp ppVar = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pp.this;
                ppVar.B = f17;
                if (ppVar.M != null) {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pp.this.M.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pp.this.B);
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pp ppVar2 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pp.this;
                    ppVar2.f132232w.m99664x589b15e(ppVar2.B);
                }
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pp ppVar3 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pp.this;
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ew ewVar = ppVar3.G;
                if (ewVar != null) {
                    ewVar.a(ppVar3.f132232w);
                }
            }

            @Override // com.tencent.mapsdk.internal.im.b
            public final void a(int i17, int i18) {
                if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pp.this.F == null || com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pp.this.f132234y == null) {
                    return;
                }
                com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df();
                if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pp.this.K && com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pp.this.L != null && com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pp.this.F.e_ != 0) {
                    com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df a17 = ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pp.this.F.e_).mo37464x78d58245().a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pp.this.I, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pp.this.f132222J));
                    int m35331xbc3301f3 = a17.m35331xbc3301f3() - com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pp.this.L.m35331xbc3301f3();
                    int m35332x962aa94a = a17.m35332x962aa94a() - com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pp.this.L.m35332x962aa94a();
                    c4247x704e24df.m35334xea574fff(i17 + m35331xbc3301f3);
                    c4247x704e24df.m35335x2c901cbe(i18 + m35332x962aa94a);
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu a18 = ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pp.this.F.e_).mo37464x78d58245().a(c4247x704e24df);
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pp.this.f132234y.m35334xea574fff((int) a18.f131001b);
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pp.this.f132234y.m35335x2c901cbe((int) a18.f131000a);
                } else {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pp.this.f132234y.m35334xea574fff(i17 + 0);
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pp.this.f132234y.m35335x2c901cbe(i18 + 0);
                }
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pp ppVar = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pp.this;
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26064xea4764e4 c26064xea4764e42 = ppVar.f132232w;
                if (c26064xea4764e42 != null) {
                    c26064xea4764e42.m99714x2c929929(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kr.a(ppVar.f132234y));
                }
                if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pp.this.M != null) {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pp.this.M.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pp.this.f132234y);
                }
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pp ppVar2 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pp.this;
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ew ewVar = ppVar2.G;
                if (ewVar != null) {
                    ewVar.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kr.a(ppVar2.f132234y));
                }
            }

            @Override // com.tencent.mapsdk.internal.im.b
            public final void a(float f17, float f18) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pp.this.a(f17, f18);
            }
        };
        this.X = com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26061x5ec49214.ALONE;
        this.F = trVar;
        this.f132232w = c26064xea4764e4;
        m36899xe6a688a0(true);
        this.f132214o = true;
        mo36479x53bfe316(c26064xea4764e4.m99694x7531c8a2());
        mo36462x499b2f4b(c26064xea4764e4.m99705x34173f83());
        mo36473xa32537ab(c26064xea4764e4.m99688xa86cd69f());
        mo36476x365c7a5b(c26064xea4764e4.m99690xc2eb2ce7());
        mo36458x40f19b7(c26064xea4764e4.m99673xa62d00a(), c26064xea4764e4.m99674xa62d00b());
        mo36427xcd1079b0(c26064xea4764e4.m99711xf94337e8());
        mo36474x742bae00(c26064xea4764e4.m99689x79734cf4());
        mo36467x764b6bfb(c26064xea4764e4.m99678xfb80a4ef());
        mo36457x52b5721c(c26064xea4764e4.m99672x742757a8());
        mo36428x2cb3cb7a(c26064xea4764e4.m99695x397e976e());
        mo35536x534d5c42(c26064xea4764e4.m99686x74bf41ce());
        a(c26064xea4764e4.m99680x1d644597());
        mo36890xca0297d8(c26064xea4764e4.m99691xb5887064());
        mo36460xbc4aa583(c26064xea4764e4.m99676x8e265777());
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26061x5ec49214 m99675x63acda98 = c26064xea4764e4.m99675x63acda98();
        this.X = m99675x63acda98;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qx qxVar = this.M;
        if (qxVar != null) {
            qxVar.f132628u = m99675x63acda98;
        }
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26064xea4764e4 mo36439xf353c268 = mo36439xf353c268();
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qy qyVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qy();
        qyVar.f132642i = com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df.m35328x3017aa(mo36439xf353c268.m99688xa86cd69f());
        qyVar.f132646m = mo36439xf353c268.m99672x742757a8();
        qyVar.a(mo36439xf353c268.m99673xa62d00a(), mo36439xf353c268.m99674xa62d00b());
        byte[] bArr = new byte[20];
        new java.security.SecureRandom().nextBytes(bArr);
        java.lang.String str = new java.lang.String(bArr);
        try {
            bitmap = mo36439xf353c268.m99678xfb80a4ef().m99320x12501425(trVar.I());
            str = mo36439xf353c268.m99678xfb80a4ef().m99321x981c205a().mo36721xbe9ba820();
        } catch (java.lang.NullPointerException unused) {
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qy a17 = qyVar.a(str, bitmap);
        a17.f132648o = (int) mo36439xf353c268.m99689x79734cf4();
        a17.f132647n = mo36439xf353c268.m99707xb9a2dbc3();
        a17.f132652s = (int) mo36439xf353c268.m99695x397e976e();
        a17.f132654u = this.H;
        a17.f132658y = mo36450x8c2e79f(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26060x2581df2b.MARKER);
        a17.f132657x = mo36450x8c2e79f(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26060x2581df2b.POI);
        a17.f132659z = mo36439xf353c268.m99704xe9217a8();
        a17.f132655v = mo36439xf353c268.m99706xa702aac();
        a17.A = mo36439xf353c268.m99691xb5887064();
        a17.f132653t = mo36439xf353c268.m99686x74bf41ce();
        if (mo36439xf353c268.m99687x30bca28a() != null) {
            this.O = mo36439xf353c268.m99687x30bca28a();
        }
        this.P = mo36439xf353c268.m99692xfb85ada3();
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26067xc981814a m99693xc0ec8dce = mo36439xf353c268.m99693xc0ec8dce() != null ? mo36439xf353c268.m99693xc0ec8dce() : new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26067xc981814a.Builder().m99746x59bc66e();
        this.Q = m99693xc0ec8dce;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26068xb94dc6b4 enumC26068xb94dc6b4 = this.O;
        if (enumC26068xb94dc6b4 != null) {
            qyVar.B = enumC26068xb94dc6b4;
        }
        qyVar.C = this.P;
        qyVar.D = m99693xc0ec8dce;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qx qxVar2 = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qx(this, this.F, qyVar);
        this.M = qxVar2;
        qxVar2.f132628u = mo36439xf353c268.m99675x63acda98();
        mo36468xf28bea2c(mo36439xf353c268.m99678xfb80a4ef(), mo36439xf353c268.m99708x2146b97(), mo36439xf353c268.m99679x36b82dd4());
        x();
    }

    private void A() {
        java.util.Iterator<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26062x676db5b8> it = l().iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po c17 = this.F.c(it.next().m99646x5db1b11());
            if (c17 instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pp) {
                c17.mo36427xcd1079b0(false);
            } else if ((c17 instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pn) && ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pn) c17).c()) {
                c17.mo36427xcd1079b0(false);
            }
        }
    }

    private void B() {
        java.util.Iterator<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26062x676db5b8> it = l().iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po c17 = this.F.c(it.next().m99646x5db1b11());
            if (c17 instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pp) {
                c17.mo36427xcd1079b0(true);
            } else if ((c17 instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pn) && ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pn) c17).c()) {
                c17.mo36427xcd1079b0(true);
            }
        }
    }

    private void C() {
        synchronized (this.f132225p) {
            android.graphics.Bitmap bitmap = this.f132223b;
            if (bitmap != null && !bitmap.isRecycled()) {
                this.f132224d = true;
            }
        }
    }

    private java.lang.String D() {
        return "GLMarkerOverlay-" + y();
    }

    private android.graphics.Rect E() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar;
        M m17;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qx qxVar = this.M;
        return (qxVar == null || (trVar = this.F) == null || (m17 = trVar.e_) == 0) ? new android.graphics.Rect() : qxVar.mo36416x7436dfc8(((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) m17).mo37464x78d58245());
    }

    private boolean F() {
        M m17;
        boolean z17 = false;
        if (this.F == null) {
            return false;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.im imVar = this.R;
        if (imVar != null) {
            imVar.b();
            boolean z18 = this.R.f131437b;
            this.K = z18;
            z17 = true;
            if (z18 && (m17 = this.F.e_) != 0) {
                ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) m17).f134045o.f132055v = true;
            }
        }
        return z17;
    }

    private boolean G() {
        return this.H;
    }

    private int H() {
        android.graphics.Bitmap bitmap = this.f132223b;
        if (bitmap == null || this.M == null) {
            return 0;
        }
        float width = bitmap.getWidth();
        return (int) ((this.M.d() * width) - (width * 0.5f));
    }

    private boolean I() {
        return this.K;
    }

    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25979x32e3ffb8<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ey> J() {
        return this.M;
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.an K() {
        return this;
    }

    private boolean L() {
        if (this.F == null) {
            return false;
        }
        android.graphics.Rect j17 = j();
        return j17.left >= 0 && j17.top >= 0 && j17.right <= this.F.aj() && j17.bottom <= this.F.ak();
    }

    private void z() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.F;
        if (trVar == null || !this.E) {
            return;
        }
        a(trVar.t());
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a
    /* renamed from: addCollisionUnit */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26062x676db5b8 mo36430x5ead30b5(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26064xea4764e4 c26064xea4764e4) {
        if (this.f132232w.m99675x63acda98() == com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26061x5ec49214.TOGETHER) {
            c26064xea4764e4.m99667x5cce4b29(this.f132232w.m99676x8e265777());
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.an anVar = ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.av) ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.F.e_).mo36540xf4c43c3b(c26064xea4764e4)).f130397b;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qx qxVar = anVar instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pp ? ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pp) anVar).M : null;
        if (qxVar != null) {
            a(qxVar);
        }
        return qxVar;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au
    public final /* bridge */ /* synthetic */ com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ao f_() {
        return this;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25976x76534b5d
    /* renamed from: getAlpha */
    public final float mo36432x742757a8() {
        return this.B;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25977x2987d1af
    /* renamed from: getAnchorU */
    public final float mo36433xa62d00a() {
        return this.f132232w.m99673xa62d00a();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25977x2987d1af
    /* renamed from: getAnchorV */
    public final float mo36434xa62d00b() {
        return this.f132232w.m99674xa62d00b();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25979x32e3ffb8
    /* renamed from: getBound */
    public final /* synthetic */ android.graphics.Rect mo36416x7436dfc8(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ey eyVar) {
        return E();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25975x32c977d6
    /* renamed from: getContentDescription */
    public final java.lang.String mo36435xc77303b9() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26064xea4764e4 c26064xea4764e4 = this.f132232w;
        if (c26064xea4764e4 == null) {
            return null;
        }
        return c26064xea4764e4.m99677xc77303b9();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25993xceb00a75
    /* renamed from: getEqualScale */
    public final float mo36436x3a0ca6c() {
        return this.C;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a
    /* renamed from: getHeight */
    public final int mo36437x1c4fb41d(android.content.Context context) {
        android.graphics.Bitmap mo36720x12501425;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e m99678xfb80a4ef = this.f132232w.m99678xfb80a4ef();
        if (m99678xfb80a4ef == null || (mo36720x12501425 = m99678xfb80a4ef.m99321x981c205a().mo36720x12501425(context)) == null) {
            return 0;
        }
        return mo36720x12501425.getHeight();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26030xc162a7c7
    /* renamed from: getId */
    public final java.lang.String mo36409x5db1b11() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qx qxVar = this.M;
        return qxVar != null ? qxVar.mo36409x5db1b11() : super.mo36409x5db1b11();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a
    /* renamed from: getMarkerType */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26068xb94dc6b4 mo36438x30bca28a() {
        return this.O;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a
    /* renamed from: getOptions */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26064xea4764e4 mo36439xf353c268() {
        return this.f132232w;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a
    /* renamed from: getPosition */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 mo36440xa86cd69f() {
        return this.T;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25993xceb00a75
    /* renamed from: getScale */
    public final float[] mo36442x7520af94() {
        return new float[]{this.C, this.D};
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a
    /* renamed from: getSnippet */
    public final java.lang.String mo36443xc2eb2ce7() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26064xea4764e4 c26064xea4764e4 = this.f132232w;
        if (c26064xea4764e4 != null) {
            return c26064xea4764e4.m99690xc2eb2ce7();
        }
        return null;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a
    /* renamed from: getText */
    public final java.lang.String mo36444xfb85ada3() {
        return this.P;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a
    /* renamed from: getTextStyle */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26067xc981814a mo36445xc0ec8dce() {
        return this.Q;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a
    /* renamed from: getTitle */
    public final java.lang.String mo36446x7531c8a2() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26064xea4764e4 c26064xea4764e4 = this.f132232w;
        if (c26064xea4764e4 != null) {
            return c26064xea4764e4.m99694x7531c8a2();
        }
        return null;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a
    /* renamed from: getWidth */
    public final int mo36447x755bd410(android.content.Context context) {
        android.graphics.Bitmap mo36720x12501425;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e m99678xfb80a4ef = this.f132232w.m99678xfb80a4ef();
        if (m99678xfb80a4ef == null || (mo36720x12501425 = m99678xfb80a4ef.m99321x981c205a().mo36720x12501425(context)) == null) {
            return 0;
        }
        return mo36720x12501425.getWidth();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.an
    public final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ew h() {
        return this.G;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po
    public final void h_() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.F;
        if (trVar != null) {
            if (mo36409x5db1b11().equals(trVar.f133726h)) {
                trVar.b("");
            }
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qx qxVar = this.M;
        if (qxVar != null) {
            qxVar.h_();
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ew ewVar = this.G;
        if (ewVar != null) {
            ewVar.mo36414xc84af884();
            mo36456x63b3d9b2(this.G);
            this.G = null;
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25998xe695d027
    /* renamed from: handleOnTap */
    public final boolean mo36421x5820b3fc() {
        return true;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a
    /* renamed from: hideInfoWindow */
    public final void mo36449xa1cc0120() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.F;
        if (trVar == null) {
            return;
        }
        trVar.b("");
        ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) trVar.e_).f134045o.f132055v = true;
        synchronized (trVar.f133725g) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ew ewVar = this.G;
            if (ewVar == null) {
                return;
            }
            ewVar.c(false);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.an
    public final boolean i() {
        if (this.f132232w.m99709xe34b1aab()) {
            return (android.text.TextUtils.isEmpty(this.f132232w.m99694x7531c8a2()) && android.text.TextUtils.isEmpty(this.f132232w.m99690xc2eb2ce7()) && g() == null) ? false : true;
        }
        return false;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25983x9215236c
    /* renamed from: isCollisionBy */
    public final boolean mo36450x8c2e79f(final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25982xe7f56712 interfaceC25982xe7f56712) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25982xe7f56712[] interfaceC25982xe7f56712Arr = this.U;
        if (interfaceC25982xe7f56712Arr != null) {
            return com.p314xaae8f345.map.p511x696c9db.C4314x286422.m35856x6bdbce7(interfaceC25982xe7f56712Arr, new com.p314xaae8f345.map.p511x696c9db.InterfaceC4313x73735db5<java.lang.Boolean, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25982xe7f56712>() { // from class: com.tencent.mapsdk.internal.pp.4
                private java.lang.Boolean a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25982xe7f56712 interfaceC25982xe7f567122) {
                    return java.lang.Boolean.valueOf(interfaceC25982xe7f567122 == interfaceC25982xe7f56712);
                }

                @Override // com.p314xaae8f345.map.p511x696c9db.InterfaceC4313x73735db5
                /* renamed from: callback */
                public final /* synthetic */ java.lang.Boolean mo35807xf5bc2045(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25982xe7f56712 interfaceC25982xe7f567122) {
                    return java.lang.Boolean.valueOf(interfaceC25982xe7f567122 == interfaceC25982xe7f56712);
                }
            });
        }
        return false;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a
    /* renamed from: isFastLoad */
    public final boolean mo36452xa702aac() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qx qxVar = this.M;
        if (qxVar == null) {
            return false;
        }
        return qxVar.h();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a
    /* renamed from: isInfoWindowEnable */
    public final boolean mo36453xe34b1aab() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26064xea4764e4 c26064xea4764e4 = this.f132232w;
        if (c26064xea4764e4 != null) {
            return c26064xea4764e4.m99709xe34b1aab();
        }
        return false;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a
    /* renamed from: isInfoWindowShown */
    public final boolean mo36454x4a284ae9() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ew ewVar;
        if (this.F == null || this.f132232w == null || (ewVar = this.G) == null) {
            return false;
        }
        return ewVar.c();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.an
    public final android.graphics.Rect j() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar;
        M m17;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qx qxVar = this.M;
        return (qxVar == null || (trVar = this.F) == null || (m17 = trVar.e_) == 0) ? new android.graphics.Rect() : qxVar.mo36419xd5aa333c(((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) m17).mo37464x78d58245());
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po
    public final void j_() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qx qxVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.im imVar;
        M m17;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.F;
        if (trVar == null) {
            return;
        }
        if (trVar != null && this.E) {
            a(trVar.t());
        }
        if (this.F != null && (imVar = this.R) != null) {
            imVar.b();
            boolean z17 = this.R.f131437b;
            this.K = z17;
            if (z17 && (m17 = this.F.e_) != 0) {
                ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) m17).f134045o.f132055v = true;
            }
        }
        M m18 = this.F.e_;
        if (m18 == 0 || ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) m18).f134045o.f132044k == null || (qxVar = this.M) == null) {
            return;
        }
        qxVar.j_();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.an
    public final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qx k() {
        return this.M;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.an
    public final java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26062x676db5b8> l() {
        return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hq.a((java.lang.Iterable) this.M.f132627t, (com.tencent.mapsdk.internal.hq.h) new com.tencent.mapsdk.internal.hq.h<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qx, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26062x676db5b8>() { // from class: com.tencent.mapsdk.internal.pp.2
            /* renamed from: a, reason: avoid collision after fix types in other method */
            private static com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26062x676db5b8 a2(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qx qxVar) {
                return qxVar;
            }

            @Override // com.tencent.mapsdk.internal.hq.h
            public final /* bridge */ /* synthetic */ com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26062x676db5b8 a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qx qxVar) {
                return qxVar;
            }
        });
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.an
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26061x5ec49214 m() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qx qxVar = this.M;
        return qxVar != null ? qxVar.f132628u : this.X;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.an
    public final boolean n() {
        return this.M.f132626s != null;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25998xe695d027
    /* renamed from: onTap */
    public final boolean mo36424x64f7944(float f17, float f18) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qx qxVar;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMarkerClickListener onMarkerClickListener;
        if (this.F == null || !m36897xd12298d8() || (qxVar = this.M) == null) {
            return false;
        }
        boolean mo36424x64f7944 = qxVar.mo36424x64f7944(f17, f18);
        if (mo36424x64f7944 && (onMarkerClickListener = this.S) != null) {
            onMarkerClickListener.mo36533x289a5e0f(this);
        }
        return mo36424x64f7944;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ev
    public final void p() {
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ev
    public final boolean q() {
        return m36896xb5887064() != null && com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qa.f132387c.equals(m36896xb5887064().toString());
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a
    /* renamed from: refreshInfoWindow */
    public final void mo36455xa41e4b79() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ew ewVar;
        if (mo36453xe34b1aab() && (ewVar = this.G) != null && ewVar.c()) {
            this.G.f();
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25991xc3dfd4bb
    /* renamed from: releaseData */
    public final void mo36412xcb03051() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qx qxVar = this.M;
        if (qxVar != null) {
            qxVar.g();
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a
    /* renamed from: removeCollisionUnit */
    public final void mo36456x63b3d9b2(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26062x676db5b8 interfaceC26062x676db5b8) {
        if (interfaceC26062x676db5b8 == null) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po c17 = this.F.c(interfaceC26062x676db5b8.m99646x5db1b11());
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qx qxVar = c17 instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pp ? ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pp) c17).M : c17 instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pn ? ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pn) c17).f132189d : null;
        if (qxVar == null || !this.M.b(qxVar)) {
            return;
        }
        c17.mo36414xc84af884();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25976x76534b5d
    /* renamed from: setAlpha */
    public final void mo36457x52b5721c(float f17) {
        this.B = f17;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26064xea4764e4 c26064xea4764e4 = this.f132232w;
        if (c26064xea4764e4 != null) {
            c26064xea4764e4.m99664x589b15e(f17);
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qx qxVar = this.M;
        if (qxVar != null) {
            qxVar.a(f17);
        }
        w();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25977x2987d1af
    /* renamed from: setAnchor */
    public final void mo36458x40f19b7(float f17, float f18) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26064xea4764e4 c26064xea4764e4 = this.f132232w;
        if (c26064xea4764e4 != null) {
            c26064xea4764e4.m99665xabc2c2b5(f17, f18);
        }
        this.f132226q = f17;
        this.f132227r = f18;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qx qxVar = this.M;
        if (qxVar != null) {
            qxVar.a(f17, f18);
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ew ewVar = this.G;
        if (ewVar != null) {
            ewVar.i_();
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25978xa8b67ebe
    /* renamed from: setAnimation */
    public final void mo36459x9e6c4d42(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26003xba1d3b64 interfaceC26003xba1d3b64) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hv a17;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.F;
        if (trVar == null || (a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iu.a(trVar.d_, interfaceC26003xba1d3b64)) == null) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.im imVar = a17.f131394a;
        this.R = imVar;
        if (imVar != null) {
            imVar.a(this.W);
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25983x9215236c
    /* renamed from: setCollisions */
    public final void mo36460xbc4aa583(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25982xe7f56712... interfaceC25982xe7f56712Arr) {
        this.U = interfaceC25982xe7f56712Arr;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qx qxVar = this.M;
        if (qxVar == null) {
            return;
        }
        if (mo36450x8c2e79f(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26060x2581df2b.NONE) || interfaceC25982xe7f56712Arr.length == 0) {
            qxVar.b(false);
            qxVar.c(false);
        } else {
            qxVar.b(mo36450x8c2e79f(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26060x2581df2b.POI));
            qxVar.c(mo36450x8c2e79f(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26060x2581df2b.MARKER));
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25975x32c977d6
    /* renamed from: setContentDescription */
    public final void mo36461x5e9e85c5(java.lang.String str) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26064xea4764e4 c26064xea4764e4 = this.f132232w;
        if (c26064xea4764e4 != null) {
            c26064xea4764e4.m99668xb416a1c3(str);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25986x654c1d6d
    /* renamed from: setDraggable */
    public final void mo36462x499b2f4b(boolean z17) {
        super.mo36462x499b2f4b(z17);
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26064xea4764e4 c26064xea4764e4 = this.f132232w;
        if (c26064xea4764e4 != null) {
            c26064xea4764e4.m99669xedd9fd8d(z17);
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25993xceb00a75
    /* renamed from: setEqualScale */
    public final void mo36463x31c51878(float f17) {
        a(f17, f17);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a
    /* renamed from: setFastLoad */
    public final void mo36464xb04b21e4(boolean z17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qx qxVar = this.M;
        if (qxVar == null) {
            return;
        }
        qxVar.d(z17);
        w();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a
    /* renamed from: setFixingPoint */
    public final void mo36465x8035cc21(int i17, int i18) {
        this.I = i17;
        this.f132222J = i18;
        if (this.M != null) {
            mo36466x89548104(true);
            this.M.a(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(this.f132222J, this.I));
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ew ewVar = this.G;
        if (ewVar != null) {
            ewVar.a(i17, i18);
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a
    /* renamed from: setFixingPointEnable */
    public final void mo36466x89548104(boolean z17) {
        this.H = z17;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qx qxVar = this.M;
        if (qxVar != null) {
            qxVar.a(z17);
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ew ewVar = this.G;
        if (ewVar != null) {
            if (z17) {
                ewVar.a(this.I, this.f132222J);
            } else {
                ewVar.b(false);
            }
        }
        w();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a
    /* renamed from: setIcon */
    public final void mo36467x764b6bfb(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e c26010x4177761e) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.F;
        if (trVar == null) {
            return;
        }
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e m99330x2ec1e1db = com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26011x93ded50c.m99330x2ec1e1db(trVar.d_);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar2 = this.F;
        if (trVar2 != null) {
            if (c26010x4177761e == null && m99330x2ec1e1db != null) {
                c26010x4177761e = m99330x2ec1e1db;
            }
            if (c26010x4177761e != null) {
                if (this.M != null) {
                    com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e.BitmapFormator m99321x981c205a = c26010x4177761e.m99321x981c205a();
                    a(trVar2.I(), m99321x981c205a, m99321x981c205a.mo36722x310cfa72() == 10 && this.f132232w.m99708x2146b97());
                }
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26064xea4764e4 c26064xea4764e4 = this.f132232w;
                if (c26064xea4764e4 != null) {
                    c26064xea4764e4.m99696x313c79(c26010x4177761e);
                }
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ew ewVar = this.G;
                if (ewVar != null) {
                    ewVar.f();
                }
            }
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a
    /* renamed from: setIconLooper */
    public final void mo36468xf28bea2c(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e c26010x4177761e, boolean z17, int i17) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26064xea4764e4 c26064xea4764e4 = this.f132232w;
        if (c26064xea4764e4 != null) {
            c26064xea4764e4.m99696x313c79(c26010x4177761e);
            this.f132232w.m99698xd626e42a(z17, i17);
        }
        final boolean m99708x2146b97 = this.f132232w.m99708x2146b97();
        int mo36719x79d3e027 = this.f132232w.m99678xfb80a4ef().m99321x981c205a().mo36719x79d3e027();
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131736d, "iconLooper totalSize:".concat(java.lang.String.valueOf(mo36719x79d3e027)));
        if (mo36719x79d3e027 > 1) {
            this.V = -1;
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ib ibVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ib();
            ibVar.a(this.f132232w.m99679x36b82dd4());
            ibVar.a(new com.tencent.mapsdk.internal.ib.a() { // from class: com.tencent.mapsdk.internal.pp.3
                @Override // com.tencent.mapsdk.internal.ib.a
                public final void a(float f17) {
                    com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26064xea4764e4 c26064xea4764e42;
                    super.a(f17);
                    if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pp.this.M == null || com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pp.this.F == null || (c26064xea4764e42 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pp.this.f132232w) == null) {
                        return;
                    }
                    com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e m99678xfb80a4ef = c26064xea4764e42.m99678xfb80a4ef();
                    int mo36719x79d3e0272 = m99678xfb80a4ef.m99321x981c205a().mo36719x79d3e027();
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131736d, "current Marker iconLooper getValue:".concat(java.lang.String.valueOf(f17)));
                    int round = java.lang.Math.round(mo36719x79d3e0272 * f17);
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131736d, "current Marker iconLooper activeIndex:".concat(java.lang.String.valueOf(round)));
                    if (round != com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pp.this.V) {
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pp ppVar = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pp.this;
                        ppVar.a(ppVar.F.I(), m99678xfb80a4ef.m99321x981c205a(), m99708x2146b97);
                        m99678xfb80a4ef.m99321x981c205a().mo36725x26390479();
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pp.this.V = round;
                    }
                }
            });
            this.M.f132625r = ibVar;
            ibVar.a(m99708x2146b97);
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a
    /* renamed from: setInfoWindowAnchor */
    public final void mo36469x7e64f715(float f17, float f18) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26064xea4764e4 c26064xea4764e4 = this.f132232w;
        if (c26064xea4764e4 != null) {
            c26064xea4764e4.m99700x328ffa93(f17, f18);
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ew ewVar = this.G;
        if (ewVar != null) {
            ewVar.f();
        }
        w();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a
    /* renamed from: setInfoWindowEnable */
    public final void mo36470x853759e3(boolean z17) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26064xea4764e4 c26064xea4764e4 = this.f132232w;
        if (c26064xea4764e4 != null) {
            c26064xea4764e4.m99702x39625d61(z17);
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ew ewVar = this.G;
        if (ewVar != null) {
            ewVar.a(z17);
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a
    /* renamed from: setInfoWindowOffset */
    public final void mo36471x95d998f3(int i17, int i18) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26064xea4764e4 c26064xea4764e4 = this.f132232w;
        if (c26064xea4764e4 != null) {
            c26064xea4764e4.m99703x4a049c71(i17, i18);
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ew ewVar = this.G;
        if (ewVar != null) {
            ewVar.f();
        }
        w();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25989x14bfeebe, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d
    /* renamed from: setLevel */
    public final void mo35536x534d5c42(int i17) {
        super.mo35536x534d5c42(i17);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qx qxVar = this.M;
        if (qxVar != null) {
            qxVar.mo35536x534d5c42(i17);
        }
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26064xea4764e4 c26064xea4764e4 = this.f132232w;
        if (c26064xea4764e4 != null) {
            c26064xea4764e4.m99712x6219b84(i17);
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a
    /* renamed from: setOnTop */
    public final void mo36472x537b3bb4() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.F;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26064xea4764e4 c26064xea4764e4 = this.f132232w;
        if (trVar == null || c26064xea4764e4 == null) {
            return;
        }
        synchronized (trVar.f133725g) {
            java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a> b17 = trVar.f133806as.f132030J.b();
            if (b17.size() > 0) {
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a interfaceC26059x88f1805a = b17.get(b17.size() - 1);
                mo35536x534d5c42(interfaceC26059x88f1805a.mo36418x74bf41ce());
                mo36429x2cb3cb7a(interfaceC26059x88f1805a.mo36420x397e976e() + 1);
                mo36455xa41e4b79();
            }
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a
    /* renamed from: setPosition */
    public final void mo36473xa32537ab(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26) {
        this.T = c26041x873d1d26;
        if (c26041x873d1d26 != null) {
            a(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df.m35328x3017aa(c26041x873d1d26));
        }
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26064xea4764e4 c26064xea4764e4 = this.f132232w;
        if (c26064xea4764e4 != null) {
            c26064xea4764e4.m99714x2c929929(c26041x873d1d26);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25992x2cf72c84
    /* renamed from: setRotation */
    public final void mo36474x742bae00(float f17) {
        super.mo36474x742bae00(f17);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qx qxVar = this.M;
        if (qxVar != null) {
            qxVar.a((int) m36893x79734cf4());
        }
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26064xea4764e4 c26064xea4764e4 = this.f132232w;
        if (c26064xea4764e4 != null) {
            c26064xea4764e4.m99715xfd990f7e(f17);
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25993xceb00a75
    /* renamed from: setScale */
    public final void mo36475x53aeca08(float f17, float f18) {
        a(f17, f18);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a
    /* renamed from: setSnippet */
    public final void mo36476x365c7a5b(java.lang.String str) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26064xea4764e4 c26064xea4764e4 = this.f132232w;
        if (c26064xea4764e4 != null) {
            c26064xea4764e4.m99717x851df11d(str);
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ew ewVar = this.G;
        if (ewVar != null) {
            ewVar.f();
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po
    /* renamed from: setTag */
    public final void mo36890xca0297d8(java.lang.Object obj) {
        super.mo36890xca0297d8(obj);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qx qxVar = this.M;
        if (qxVar != null) {
            qxVar.mo36890xca0297d8(obj);
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a
    /* renamed from: setText */
    public final void mo36477x765074af(java.lang.String str) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qx qxVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pi f17;
        this.P = str;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26064xea4764e4 c26064xea4764e4 = this.f132232w;
        if (c26064xea4764e4 != null) {
            c26064xea4764e4.m99718x36452d(str);
        }
        if (this.O != com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26068xb94dc6b4.TEXT_MARKER || (qxVar = this.M) == null || (f17 = qxVar.f()) == null) {
            return;
        }
        f17.a(str);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a
    /* renamed from: setTextStyle */
    public final void mo36478x1d404e42(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26067xc981814a c26067xc981814a) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qx qxVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pi f17;
        this.Q = c26067xc981814a;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26064xea4764e4 c26064xea4764e4 = this.f132232w;
        if (c26064xea4764e4 != null) {
            c26064xea4764e4.m99719xc17f1c84(c26067xc981814a);
        }
        if (this.O != com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26068xb94dc6b4.TEXT_MARKER || (qxVar = this.M) == null || (f17 = qxVar.f()) == null) {
            return;
        }
        f17.a(c26067xc981814a);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a
    /* renamed from: setTitle */
    public final void mo36479x53bfe316(java.lang.String str) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26064xea4764e4 c26064xea4764e4 = this.f132232w;
        if (c26064xea4764e4 != null) {
            c26064xea4764e4.m99720x6942258(str);
        }
        if (this.G == null || !mo36453xe34b1aab()) {
            return;
        }
        this.G.f();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25999x7f0a8852
    /* renamed from: setVisible */
    public final void mo36427xcd1079b0(boolean z17) {
        M m17;
        super.mo36427xcd1079b0(z17);
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26064xea4764e4 c26064xea4764e4 = this.f132232w;
        if (c26064xea4764e4 != null) {
            c26064xea4764e4.m99723x1bd1f072(z17);
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qx qxVar = this.M;
        if (qxVar != null) {
            qxVar.mo36427xcd1079b0(z17);
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ew ewVar = this.G;
        if (ewVar != null) {
            ewVar.mo36427xcd1079b0(z17 && ewVar.c());
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.F;
        if (trVar == null || (m17 = trVar.e_) == 0) {
            return;
        }
        ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) m17).f134045o.f132055v = true;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25989x14bfeebe
    /* renamed from: setZIndex */
    public final void mo36428x2cb3cb7a(float f17) {
        this.f132207h = f17;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26064xea4764e4 c26064xea4764e4 = this.f132232w;
        if (c26064xea4764e4 != null) {
            c26064xea4764e4.m99725xd4677478(f17);
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qx qxVar = this.M;
        if (qxVar != null) {
            qxVar.mo36429x2cb3cb7a((int) f17);
        }
        w();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a
    /* renamed from: showInfoWindow */
    public final void mo36480x3487511b() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ew pnVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.F;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26064xea4764e4 c26064xea4764e4 = this.f132232w;
        if (trVar == null || c26064xea4764e4 == null) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = trVar.f133806as;
        synchronized (trVar.f133725g) {
            if (!trVar.f133715ac) {
                for (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a interfaceC26059x88f1805a : trVar.f133806as.f132030J.b()) {
                    if (interfaceC26059x88f1805a != null && interfaceC26059x88f1805a.mo36454x4a284ae9()) {
                        interfaceC26059x88f1805a.mo36449xa1cc0120();
                    }
                }
            }
            if (mo36453xe34b1aab()) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ew ewVar = this.G;
                if (ewVar == null) {
                    if (c26064xea4764e4.m99710x58f9da6d()) {
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bh bhVar = neVar.f132030J;
                        pnVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ps((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr) bhVar.f130487i, this);
                        bhVar.f130481c.add(pnVar);
                        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b("Marker", "this[" + mo36409x5db1b11() + " :" + a() + "] addViewInfoWindow => child:" + pnVar.mo36409x5db1b11());
                    } else {
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bh bhVar2 = neVar.f132030J;
                        pnVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pn((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr) bhVar2.f130487i, this);
                        bhVar2.f130479a.put(pnVar.mo36409x5db1b11(), pnVar);
                        bhVar2.f130481c.add(pnVar);
                        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b("Marker", "this[" + mo36409x5db1b11() + " :" + a() + "] addInfoWindow => child:" + pnVar.mo36409x5db1b11());
                        a((com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26062x676db5b8) pnVar);
                    }
                    a(pnVar);
                    this.G = pnVar;
                } else {
                    ewVar.f();
                    a(ewVar);
                }
            }
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25978xa8b67ebe
    /* renamed from: startAnimation */
    public final boolean mo36482x2d8c4542() {
        M m17;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.F;
        if (trVar == null || this.R == null) {
            return false;
        }
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df = this.f132234y;
        if (this.H && (m17 = trVar.e_) != 0) {
            c4247x704e24df = ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) m17).mo37464x78d58245().a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu(this.I, this.f132222J));
            this.L = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(c4247x704e24df);
        }
        return this.R.a(c4247x704e24df, this.A);
    }

    /* renamed from: toString */
    public final java.lang.String m36903x9616526c() {
        return "GLMarkerOverlay{id='" + mo36409x5db1b11() + "'nativeId='" + a() + "'tag='" + m36896xb5887064() + "'}";
    }

    private void b(int[] iArr, int[] iArr2) {
        if (a(iArr)) {
            return;
        }
        b(iArr2);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.an
    public final android.graphics.Point c() {
        return new android.graphics.Point(this.I, this.f132222J);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.an
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMarkerClickListener d() {
        return this.S;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.an
    public final java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26> e() {
        com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9 c4430xc2040f9;
        android.graphics.Rect mo36416x7436dfc8;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.F;
        if (trVar == null || (c4430xc2040f9 = (com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) trVar.e_) == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (E() != null) {
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26 = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(r2.top / 1000000.0d, r2.left / 1000000.0d);
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d262 = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(r2.bottom / 1000000.0d, r2.left / 1000000.0d);
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d263 = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(r2.top / 1000000.0d, r2.right / 1000000.0d);
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d264 = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(r2.bottom / 1000000.0d, r2.right / 1000000.0d);
            arrayList.add(c26041x873d1d26);
            arrayList.add(c26041x873d1d262);
            arrayList.add(c26041x873d1d263);
            arrayList.add(c26041x873d1d264);
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ew ewVar = this.G;
        if (ewVar != null && ewVar.c() && (mo36416x7436dfc8 = ewVar.mo36416x7436dfc8(c4430xc2040f9.mo37464x78d58245())) != null) {
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d265 = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(mo36416x7436dfc8.top / 1000000.0d, mo36416x7436dfc8.left / 1000000.0d);
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d266 = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(mo36416x7436dfc8.bottom / 1000000.0d, mo36416x7436dfc8.left / 1000000.0d);
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d267 = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(mo36416x7436dfc8.top / 1000000.0d, mo36416x7436dfc8.right / 1000000.0d);
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d268 = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(mo36416x7436dfc8.bottom / 1000000.0d, mo36416x7436dfc8.right / 1000000.0d);
            arrayList.add(c26041x873d1d265);
            arrayList.add(c26041x873d1d266);
            arrayList.add(c26041x873d1d267);
            arrayList.add(c26041x873d1d268);
        }
        return arrayList;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.an
    public final java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25979x32e3ffb8<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ey>> f() {
        java.util.ArrayList arrayList = new java.util.ArrayList(2);
        arrayList.add(this.M);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ew ewVar = this.G;
        if (ewVar != null && ewVar.c()) {
            arrayList.add(this.G);
        }
        return arrayList;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.an
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.InfoWindowAdapter g() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.F;
        if (trVar != null) {
            return trVar.R();
        }
        return null;
    }

    private void b(int[] iArr) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMarkerCollisionStatusListener S = this.F.S();
        if (S == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26062x676db5b8 interfaceC26062x676db5b8 : l()) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po c17 = this.F.c(interfaceC26062x676db5b8.m99646x5db1b11());
            if (c17 != null) {
                int a17 = c17.a();
                if (iArr != null && iArr.length > 0) {
                    if (java.util.Arrays.binarySearch(iArr, a17) >= 0) {
                        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b("Marker", "dispatchCollisionOnRelationUnits shown Marker[" + mo36409x5db1b11() + ":" + a() + "] RelationUnit = [" + interfaceC26062x676db5b8.m99646x5db1b11() + " :" + a17 + "]");
                        arrayList2.add(interfaceC26062x676db5b8);
                    } else {
                        arrayList.add(c17);
                    }
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        int i17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pp.AnonymousClass5.f132242a[m().ordinal()];
        if (i17 != 1) {
            if (i17 != 2) {
                return;
            }
            S.mo99164x1a53a4be(this, l());
        } else {
            S.mo99164x1a53a4be(this, arrayList2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(float f17, float f18) {
        int mo36433xa62d00a;
        if (f17 >= 0.0f) {
            this.C = f17;
        }
        if (f18 >= 0.0f) {
            this.D = f18;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qx qxVar = this.M;
        if (qxVar != null) {
            qxVar.b(this.C, this.D);
            int mo36437x1c4fb41d = mo36437x1c4fb41d(this.F.I());
            float mo36447x755bd410 = mo36447x755bd410(this.F.I());
            float f19 = this.C * mo36447x755bd410;
            if (f19 >= mo36447x755bd410) {
                float f27 = f19 - mo36447x755bd410;
                mo36433xa62d00a = (int) ((0.5f * f27) - (mo36433xa62d00a() * f27));
            } else {
                float f28 = mo36447x755bd410 - f19;
                mo36433xa62d00a = (int) ((mo36433xa62d00a() * f28) - (f28 * 0.5f));
            }
            float f29 = mo36437x1c4fb41d;
            this.f132232w.m99703x4a049c71(mo36433xa62d00a, (int) (mo36434xa62d00b() * (f29 - (this.D * f29))));
        }
        if (this.G != null) {
            mo36455xa41e4b79();
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25978xa8b67ebe
    /* renamed from: startAnimation */
    public final void mo36481x2d8c4542(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26003xba1d3b64 interfaceC26003xba1d3b64) {
        mo36459x9e6c4d42(interfaceC26003xba1d3b64);
        mo36482x2d8c4542();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ev, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.am
    public final int a() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qx qxVar = this.M;
        if (qxVar != null) {
            return qxVar.a();
        }
        return super.a();
    }

    private void b(android.graphics.Bitmap bitmap, boolean z17) {
        synchronized (this.f132225p) {
            this.f132223b = bitmap;
            if (this.f132233x == null) {
                this.f132233x = bitmap.toString();
            }
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qx qxVar = this.M;
            if (qxVar != null) {
                qxVar.a(this.f132233x, z17, this.f132223b);
            }
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.an
    public final void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e c26010x4177761e, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e c26010x4177761e2) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.F;
        if (trVar == null) {
            return;
        }
        if (c26010x4177761e == null && c26010x4177761e2 != null) {
            c26010x4177761e = c26010x4177761e2;
        }
        if (c26010x4177761e == null) {
            return;
        }
        if (this.M != null) {
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e.BitmapFormator m99321x981c205a = c26010x4177761e.m99321x981c205a();
            a(trVar.I(), m99321x981c205a, m99321x981c205a.mo36722x310cfa72() == 10 && this.f132232w.m99708x2146b97());
        }
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26064xea4764e4 c26064xea4764e4 = this.f132232w;
        if (c26064xea4764e4 != null) {
            c26064xea4764e4.m99696x313c79(c26010x4177761e);
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ew ewVar = this.G;
        if (ewVar != null) {
            ewVar.f();
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au
    /* renamed from: b */
    public final android.graphics.Rect mo36416x7436dfc8(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ey eyVar) {
        return E();
    }

    private int b(boolean z17) {
        float e17;
        android.graphics.Bitmap bitmap = this.f132223b;
        if (bitmap == null || this.M == null) {
            return 0;
        }
        int height = bitmap.getHeight();
        if (!z17) {
            e17 = height * this.M.e();
        } else {
            e17 = height * (1.0f - this.M.e());
        }
        return (int) e17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(android.content.Context context, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e.BitmapFormator bitmapFormator, boolean z17) {
        if (bitmapFormator != null) {
            android.graphics.Bitmap mo36720x12501425 = bitmapFormator.mo36720x12501425(context);
            java.lang.String str = this.f132233x;
            if (str == null || !str.equals(bitmapFormator.mo36721xbe9ba820())) {
                a(bitmapFormator.mo36721xbe9ba820());
                a(mo36720x12501425, z17);
            }
        }
    }

    private boolean b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ew ewVar) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26064xea4764e4 c26064xea4764e4 = this.f132232w;
        if (c26064xea4764e4 == null || !c26064xea4764e4.m99709xe34b1aab()) {
            return false;
        }
        return ((ewVar == null || ewVar.g() == null) && com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.a(c26064xea4764e4.m99694x7531c8a2()) && com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.a(c26064xea4764e4.m99690xc2eb2ce7())) ? false : true;
    }

    private void a(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df) {
        if (c4247x704e24df == null) {
            return;
        }
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df2 = this.f132234y;
        if (c4247x704e24df2 == null) {
            this.f132234y = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(c4247x704e24df.m35331xbc3301f3(), c4247x704e24df.m35332x962aa94a());
        } else {
            c4247x704e24df2.m35334xea574fff(c4247x704e24df.m35331xbc3301f3());
            this.f132234y.m35335x2c901cbe(c4247x704e24df.m35332x962aa94a());
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qx qxVar = this.M;
        if (qxVar != null) {
            qxVar.a(this.f132234y);
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ew ewVar = this.G;
        if (ewVar != null) {
            ewVar.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kr.a(this.f132234y));
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.an
    public final boolean b() {
        return this.H;
    }

    private void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26062x676db5b8 interfaceC26062x676db5b8) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qx qxVar;
        if (interfaceC26062x676db5b8 == null) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po c17 = this.F.c(interfaceC26062x676db5b8.m99646x5db1b11());
        if (c17 instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pp) {
            qxVar = ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pp) c17).M;
        } else {
            qxVar = c17 instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pn ? ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pn) c17).f132189d : null;
        }
        if (qxVar != null) {
            qxVar.f132628u = m();
            this.M.a(qxVar);
        }
    }

    private void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26061x5ec49214 enumC26061x5ec49214) {
        this.X = enumC26061x5ec49214;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qx qxVar = this.M;
        if (qxVar != null) {
            qxVar.f132628u = enumC26061x5ec49214;
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.an
    public final void a(int[] iArr, int[] iArr2) {
        boolean z17;
        boolean z18 = true;
        if (iArr == null || iArr.length <= 0 || java.util.Arrays.binarySearch(iArr, a()) < 0) {
            z17 = false;
        } else {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b("Marker", "dispatchCollisionOnMarker hidden = [" + m36896xb5887064() + " :" + a() + "]");
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMarkerCollisionStatusListener S = this.F.S();
            int i17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pp.AnonymousClass5.f132242a[m().ordinal()];
            if (i17 == 1) {
                A();
                if (S != null) {
                    S.mo99163x1d64739d(this, new java.util.ArrayList());
                }
            } else if (i17 == 2 && S != null) {
                S.mo99163x1d64739d(this, l());
            }
            z17 = true;
        }
        if (z17 || iArr2 == null || iArr2.length <= 0 || java.util.Arrays.binarySearch(iArr2, a()) < 0) {
            z18 = z17;
        } else {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b("Marker", "dispatchCollisionOnMarker show = [" + m36896xb5887064() + " :" + a() + "]");
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26061x5ec49214 m17 = m();
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMarkerCollisionStatusListener S2 = this.F.S();
            int i18 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pp.AnonymousClass5.f132242a[m17.ordinal()];
            if (i18 == 1) {
                B();
                if (S2 != null) {
                    S2.mo99164x1a53a4be(this, new java.util.ArrayList());
                }
            } else if (i18 == 2 && S2 != null) {
                S2.mo99164x1a53a4be(this, l());
            }
        }
        if (z18 || a(iArr)) {
            return;
        }
        b(iArr2);
    }

    private boolean a(int[] iArr) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMarkerCollisionStatusListener S = this.F.S();
        boolean z17 = false;
        if (S == null) {
            return false;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26062x676db5b8 interfaceC26062x676db5b8 : l()) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po c17 = this.F.c(interfaceC26062x676db5b8.m99646x5db1b11());
            if (c17 != null) {
                int a17 = c17.a();
                if (iArr != null && iArr.length > 0) {
                    if (java.util.Arrays.binarySearch(iArr, a17) >= 0) {
                        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b("Marker", "dispatchCollisionOnRelationUnits hidden Marker[" + mo36409x5db1b11() + ":" + a() + "] RelationUnit = [" + interfaceC26062x676db5b8.m99646x5db1b11() + " :" + a17 + "]");
                        arrayList2.add(interfaceC26062x676db5b8);
                    } else {
                        arrayList.add(c17);
                    }
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            int i17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pp.AnonymousClass5.f132242a[m().ordinal()];
            z17 = true;
            if (i17 == 1) {
                S.mo99163x1d64739d(this, arrayList2);
            } else if (i17 == 2) {
                S.mo99163x1d64739d(this, l());
            }
        }
        return z17;
    }

    private void a(java.lang.String str) {
        synchronized (this.f132225p) {
            this.f132233x = str;
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.an
    public final void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ew ewVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.F;
        mo36473xa32537ab(c26041x873d1d26);
        if (!mo36409x5db1b11().equals(trVar != null ? trVar.f133726h : "") || (ewVar = this.G) == null) {
            return;
        }
        ewVar.a(c26041x873d1d26);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.an
    public final void a(android.graphics.Bitmap bitmap, boolean z17) {
        if (bitmap == null) {
            return;
        }
        b(bitmap, z17);
        C();
    }

    private void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.im imVar) {
        this.R = imVar;
        if (imVar != null) {
            imVar.a(this.W);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.an
    public final void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26004x5184c038 interfaceC26004x5184c038) {
        this.N = interfaceC26004x5184c038;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.an
    public final void a(boolean z17) {
        this.E = z17;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.an
    public final void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMarkerClickListener onMarkerClickListener) {
        this.S = onMarkerClickListener;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25979x32e3ffb8
    /* renamed from: a */
    public final android.graphics.Rect mo36419xd5aa333c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ey eyVar) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qx qxVar = this.M;
        if (qxVar == null) {
            return null;
        }
        android.graphics.Rect mo36419xd5aa333c = qxVar.mo36419xd5aa333c(eyVar);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ew ewVar = this.G;
        android.graphics.Rect mo36419xd5aa333c2 = ewVar != null ? ewVar.mo36419xd5aa333c(eyVar) : null;
        if (mo36419xd5aa333c == null) {
            return mo36419xd5aa333c2;
        }
        if (mo36419xd5aa333c2 == null) {
            return mo36419xd5aa333c;
        }
        return new android.graphics.Rect(java.lang.Math.min(mo36419xd5aa333c.left, mo36419xd5aa333c2.left), java.lang.Math.min(mo36419xd5aa333c.top, mo36419xd5aa333c2.top), java.lang.Math.max(mo36419xd5aa333c.right, mo36419xd5aa333c2.right), java.lang.Math.max(mo36419xd5aa333c.bottom, mo36419xd5aa333c2.bottom));
    }

    private void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ew ewVar) {
        if (ewVar == null) {
            return;
        }
        if (this.H) {
            ewVar.a(this.I, this.f132222J);
        }
        if (b(ewVar)) {
            ewVar.c(true);
        }
    }
}
