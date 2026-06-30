package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class bg implements com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.aj, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.al, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fn {
    private long A;
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.CancelableCallback B;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu> f130437a;

    /* renamed from: b, reason: collision with root package name */
    public volatile com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr f130438b;

    /* renamed from: c, reason: collision with root package name */
    public android.content.Context f130439c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bk f130440d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rr f130441e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qh f130442f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qu f130443g;

    /* renamed from: h, reason: collision with root package name */
    com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e f130444h;

    /* renamed from: l, reason: collision with root package name */
    private java.lang.String f130448l;

    /* renamed from: n, reason: collision with root package name */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.re f130450n;

    /* renamed from: w, reason: collision with root package name */
    private float f130459w;

    /* renamed from: x, reason: collision with root package name */
    private final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ey f130460x;

    /* renamed from: y, reason: collision with root package name */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25950xd5528c6e f130461y;

    /* renamed from: z, reason: collision with root package name */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25950xd5528c6e f130462z;

    /* renamed from: m, reason: collision with root package name */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qa f130449m = null;

    /* renamed from: o, reason: collision with root package name */
    private final com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df f130451o = null;

    /* renamed from: p, reason: collision with root package name */
    private final com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df f130452p = null;

    /* renamed from: q, reason: collision with root package name */
    private int f130453q = 0;

    /* renamed from: r, reason: collision with root package name */
    private int f130454r = 0;

    /* renamed from: s, reason: collision with root package name */
    private int f130455s = 0;

    /* renamed from: t, reason: collision with root package name */
    private int f130456t = 0;

    /* renamed from: i, reason: collision with root package name */
    final byte[] f130445i = new byte[0];

    /* renamed from: u, reason: collision with root package name */
    private int f130457u = 0;

    /* renamed from: v, reason: collision with root package name */
    private int f130458v = 1000;
    private com.tencent.mapsdk.internal.ad.a C = new com.tencent.mapsdk.internal.ad.a() { // from class: com.tencent.mapsdk.internal.bg.1
        @Override // com.tencent.mapsdk.internal.ad.a
        public final void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jm jmVar) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar;
            com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9 c4430xc2040f9;
            if (jmVar.f131573z == 10000 && (jmVar instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.th) && (trVar = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg.this.f130438b) != null && (c4430xc2040f9 = (com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) trVar.e_) != null) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.th thVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.th) jmVar;
                if (thVar.Q) {
                    c4430xc2040f9.b((trVar.Z / 2) - thVar.R, (trVar.f133713aa / 2) - thVar.S);
                }
                if (thVar.f133167h) {
                    c4430xc2040f9.b(thVar.K, thVar.L);
                }
                if (thVar.N || thVar.M || thVar.O) {
                    c4430xc2040f9.f134045o.f132041h.a((float) thVar.P);
                }
                if (thVar.T) {
                    int i17 = thVar.f133137aa;
                    int i18 = thVar.f133138ab;
                    c4430xc2040f9.a(i17, i18);
                    if (thVar.f133166g) {
                        trVar.b(i17, i18);
                    }
                }
                if (thVar.f133139ac) {
                    c4430xc2040f9.b(thVar.f133143ag);
                }
                if (thVar.f133144ah) {
                    c4430xc2040f9.a(thVar.f133148al);
                }
                if (thVar.Q) {
                    c4430xc2040f9.b(thVar.R - (trVar.Z / 2), thVar.S - (trVar.f133713aa / 2));
                }
            }
        }
    };

    /* renamed from: j, reason: collision with root package name */
    public final com.tencent.mapsdk.internal.th.a f130446j = new com.tencent.mapsdk.internal.th.a() { // from class: com.tencent.mapsdk.internal.bg.2
        @Override // com.tencent.mapsdk.internal.th.a
        public final float a() {
            if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg.this.f130438b == null) {
                return 0.0f;
            }
            return ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg.this.f130438b.e_).t();
        }

        @Override // com.tencent.mapsdk.internal.th.a
        public final int b() {
            if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg.this.f130438b == null) {
                return 0;
            }
            return ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg.this.f130438b.e_).q();
        }

        @Override // com.tencent.mapsdk.internal.th.a
        public final com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c() {
            if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg.this.f130438b == null) {
                return null;
            }
            return ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg.this.f130438b.e_).r();
        }

        @Override // com.tencent.mapsdk.internal.th.a
        public final float d() {
            if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg.this.f130438b == null) {
                return 0.0f;
            }
            return ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg.this.f130438b.e_).v();
        }

        @Override // com.tencent.mapsdk.internal.th.a
        public final float e() {
            if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg.this.f130438b == null) {
                return 0.0f;
            }
            return ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg.this.f130438b.e_).w();
        }

        @Override // com.tencent.mapsdk.internal.th.a
        public final float f() {
            if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg.this.f130438b == null) {
                return 0.0f;
            }
            return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg.this.D();
        }

        @Override // com.tencent.mapsdk.internal.th.a
        public final com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df g() {
            if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg.this.f130438b == null) {
                return null;
            }
            return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg.this.f130438b.t();
        }

        @Override // com.tencent.mapsdk.internal.th.a
        public final boolean h() {
            if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg.this.f130438b == null) {
                return false;
            }
            return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg.this.f130438b.f133732n.f130311f;
        }

        @Override // com.tencent.mapsdk.internal.th.a
        public final void a(java.lang.Runnable runnable) {
            if (runnable == null || com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg.this.f130438b == null) {
                return;
            }
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ko.a(runnable, 100L);
        }
    };

    /* renamed from: k, reason: collision with root package name */
    public com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fq f130447k = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fq() { // from class: com.tencent.mapsdk.internal.bg.6
        @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fq
        public final void u() {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ko.a(new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.bg.6.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg.this.f130438b == null) {
                        return;
                    }
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg.this.f130438b.a(((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg.this.f130438b.e_).f134045o.f132053t.a());
                }
            });
        }
    };

    public bg(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bd bdVar, java.lang.ref.WeakReference<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu> weakReference, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7 c25966x7e4576a7) {
        this.f130438b = null;
        this.f130439c = null;
        this.f130448l = null;
        this.f130440d = null;
        this.f130450n = null;
        this.f130441e = null;
        this.f130459w = 1.0f;
        android.content.Context applicationContext = bdVar.mo36630x76847179().getApplicationContext();
        this.f130439c = applicationContext;
        this.f130459w = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hs.a(applicationContext);
        this.f130437a = weakReference;
        this.f130438b = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr) bdVar.d();
        if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.f131304b == null || com.tencent.mapsdk.internal.hl.a.b() == 0) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.f131304b = new com.tencent.mapsdk.internal.hl.a(this.f130439c, this.f130438b.f130551f, java.lang.Math.max(10, c25966x7e4576a7.m99207xbd35f7db()) * 1048576);
        } else {
            com.tencent.mapsdk.internal.hl.a.a();
        }
        this.f130438b.a(this);
        this.f130460x = ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).mo37464x78d58245();
        ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).f134045o.f132041h.D = this.C;
        ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).a(this.f130447k);
        if (c25966x7e4576a7 != null && !com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.a(c25966x7e4576a7.m99217x2ff2e2f5())) {
            this.f130448l = c25966x7e4576a7.m99217x2ff2e2f5();
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.re reVar = this.f130438b.f133806as.H;
        this.f130450n = reVar;
        this.f130442f = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qh(this.f130439c, reVar, this.f130438b.ad());
        this.f130441e = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rr(this.f130439c, this.f130448l);
        this.f130443g = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qu(this.f130439c, bdVar, this.f130448l);
        if (this.f130440d == null) {
            this.f130440d = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bk(bdVar, this.f130438b.ac(), weakReference);
        }
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bk E() {
        return this.f130440d;
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rr F() {
        return this.f130441e;
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qu G() {
        return this.f130443g;
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qh H() {
        return this.f130442f;
    }

    private void I() {
        if (this.f130438b != null) {
            ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).b(this.f130447k);
            this.f130438b.l();
            this.f130438b = null;
        }
        if (this.f130439c != null) {
            this.f130439c = null;
        }
        com.tencent.mapsdk.internal.hl.a aVar = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.f131304b;
        if (aVar != null) {
            aVar.c();
        }
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr J() {
        return this.f130438b;
    }

    private android.content.Context K() {
        return this.f130439c;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final int A() {
        return this.f130458v;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.aj
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26100x627095e6 B() {
        android.graphics.Point point = new android.graphics.Point(0, this.f130438b.f133713aa);
        android.graphics.Point point2 = new android.graphics.Point(this.f130438b.Z, this.f130438b.f133713aa);
        android.graphics.Point point3 = new android.graphics.Point(0, 0);
        android.graphics.Point point4 = new android.graphics.Point(this.f130438b.Z, 0);
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 a17 = a(point);
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 a18 = a(point2);
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 a19 = a(point3);
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 a27 = a(point4);
        return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26100x627095e6(a17, a18, a19, a27, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b.m99525xdc3ef9b().m99564x73c954a8(a17).m99564x73c954a8(a18).m99564x73c954a8(a19).m99564x73c954a8(a27).m99563x59bc66e());
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.al
    public final java.lang.ref.WeakReference<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu> C() {
        return this.f130437a;
    }

    public final float D() {
        return ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).f134045o.f132053t.a();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final void e() {
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final int f() {
        int m17 = ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne) this.f130438b.d_).f132041h.m();
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rr rrVar = this.f130441e;
        if (rrVar != null) {
            return rrVar.b(m17);
        }
        return 0;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final int g() {
        return -1;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final boolean h() {
        return ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).f134045o.f132050q;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final void i() {
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final void j() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu buVar = this.f130437a.get();
        if (buVar != null) {
            buVar.a();
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bk bkVar = this.f130440d;
        if (bkVar != null) {
            bkVar.j();
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final void k() {
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final void l() {
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final void m() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu buVar = this.f130437a.get();
        if (buVar != null) {
            buVar.c();
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qa qaVar = this.f130449m;
        if (qaVar != null) {
            qaVar.a();
            this.f130449m = null;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bk bkVar = this.f130440d;
        if (bkVar != null) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = bkVar.f130510b;
            if (trVar != null) {
                android.os.Handler handler = bkVar.f130517i;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
                ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) trVar.e_).f134045o.f132041h.b(bkVar);
                trVar.f133721ai.remove(bkVar);
                trVar.b((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fh) bkVar);
                android.view.ViewGroup ac6 = trVar.ac();
                if (ac6 != null) {
                    ac6.removeAllViews();
                }
                java.util.Iterator<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.eu> it = bkVar.f130516h.iterator();
                while (it.hasNext()) {
                    it.next().c();
                }
                bkVar.f130516h.clear();
            }
            this.f130440d = null;
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final void n() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu buVar = this.f130437a.get();
        if (buVar != null) {
            buVar.b();
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final java.lang.String o() {
        return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.i();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26040xa3acf778 p() {
        com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9 c4430xc2040f9;
        if (this.f130438b != null && (c4430xc2040f9 = (com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_) != null) {
            return c4430xc2040f9.mo37454x1bacd0ce();
        }
        return com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26040xa3acf778.zh;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final void q() {
        com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9 c4430xc2040f9;
        if (this.f130438b == null || (c4430xc2040f9 = (com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_) == null) {
            return;
        }
        c4430xc2040f9.mo36990xdf959967();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final int r() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26034x15ff5647 c26034x15ff5647;
        if (this.f130438b == null || this.f130438b.f133732n == null || (c26034x15ff5647 = this.f130438b.f133732n.f130312g) == null) {
            return -1;
        }
        return c26034x15ff5647.m99465xd84262ca();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final java.lang.String[] s() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ac acVar;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26034x15ff5647 c26034x15ff5647;
        java.lang.String[] strArr = null;
        if (this.f130438b != null && this.f130438b.f133732n != null && (c26034x15ff5647 = (acVar = this.f130438b.f133732n).f130312g) != null && c26034x15ff5647.m99469x2328f865() != null && !acVar.f130312g.m99469x2328f865().isEmpty()) {
            java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26036x18de38d1> m99469x2328f865 = acVar.f130312g.m99469x2328f865();
            strArr = new java.lang.String[m99469x2328f865.size()];
            for (int i17 = 0; i17 < m99469x2328f865.size(); i17++) {
                strArr[i17] = m99469x2328f865.get(i17).m99474xfb82e301();
            }
        }
        return strArr;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final java.lang.String t() {
        if (this.f130438b == null || this.f130438b.f133732n == null) {
            return null;
        }
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26034x15ff5647 c26034x15ff5647 = this.f130438b.f133732n.f130312g;
        return c26034x15ff5647 == null ? "" : c26034x15ff5647.m99468x266119d5();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26034x15ff5647 u() {
        if (this.f130438b == null || this.f130438b.f133732n == null) {
            return null;
        }
        return this.f130438b.f133732n.f130312g;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final java.lang.String v() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26034x15ff5647 c26034x15ff5647;
        if (this.f130438b == null || this.f130438b.f133732n == null || (c26034x15ff5647 = this.f130438b.f133732n.f130312g) == null) {
            return null;
        }
        return c26034x15ff5647.m99466x3935e1d5();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final boolean w() {
        if (this.f130438b == null) {
            return false;
        }
        return this.f130438b.C();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final boolean x() {
        if (this.f130438b == null) {
            return false;
        }
        return this.f130438b.f133717ae;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final java.util.ArrayList<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26055x88f0336e> y() {
        if (this.f130438b == null) {
            return null;
        }
        return this.f130438b.f133806as.Q();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final java.lang.String z() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar;
        java.lang.String str;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar2;
        java.lang.String a17;
        if (this.f130439c != null && this.f130438b != null) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mv a18 = !com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.a(this.f130448l) ? com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mx.a(this.f130439c, this.f130448l) : com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.my.a(this.f130439c);
                jSONObject.put("cfgVer", java.lang.String.format("%s-%s-%s,%s-%s-%s,%s-%s-%s", com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ep.f130897i, java.lang.Integer.valueOf(a18.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130915a)), a18.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130934t), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ep.f130900l, java.lang.Integer.valueOf(a18.b("indoormap_style_version")), a18.a("indoormap_style_md5"), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ep.f130901m, java.lang.Integer.valueOf(a18.b("indoormap_style_night_version")), a18.a("indoormap_style_night_md5")));
                jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54473x7fe978e1, "{" + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hs.b(this.f130439c) + "," + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hs.c(this.f130439c) + "}");
                jSONObject.put("density", (double) this.f130459w);
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar2 = ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).f134045o;
                if (neVar2 != null && (tkVar = neVar2.f132039f) != null) {
                    str = (java.lang.String) tkVar.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass51(), (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass51) null);
                    jSONObject.put("renderStatus", str);
                    neVar = ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).f134045o;
                    if (neVar != null && (tkVar2 = neVar.f132039f) != null) {
                        a17 = tkVar2.a();
                        jSONObject.put("renderError", a17);
                        jSONObject.put("sdkver", "5.10.0.2023");
                        return jSONObject.toString();
                    }
                    a17 = null;
                    jSONObject.put("renderError", a17);
                    jSONObject.put("sdkver", "5.10.0.2023");
                    return jSONObject.toString();
                }
                str = null;
                jSONObject.put("renderStatus", str);
                neVar = ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).f134045o;
                if (neVar != null) {
                    a17 = tkVar2.a();
                    jSONObject.put("renderError", a17);
                    jSONObject.put("sdkver", "5.10.0.2023");
                    return jSONObject.toString();
                }
                a17 = null;
                jSONObject.put("renderError", a17);
                jSONObject.put("sdkver", "5.10.0.2023");
                return jSONObject.toString();
            } catch (org.json.JSONException unused) {
            }
        }
        return null;
    }

    private float c(float f17) {
        if (this.f130438b == null || this.f130438b.f133806as == null || this.f130438b.e_ == 0 || this.f130438b.f133806as.f132053t == null) {
            return f17;
        }
        float a17 = this.f130438b.f133806as.f132053t.a();
        int p17 = ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).p();
        int q17 = ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).q();
        float f18 = p17;
        return (a17 < f18 || a17 > ((float) q17)) ? java.lang.Math.min(q17, java.lang.Math.max(f18, f17)) : f17;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.aj
    public final android.graphics.Point b(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar;
        M m17;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu a17;
        if (c26041x873d1d26 == null || (trVar = this.f130438b) == null || (m17 = trVar.e_) == 0 || ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) m17).mo37464x78d58245() == null || (a17 = ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) trVar.e_).mo37464x78d58245().a(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df.m35328x3017aa(c26041x873d1d26))) == null) {
            return null;
        }
        android.graphics.Point point = new android.graphics.Point();
        point.x = (int) java.lang.Math.round(a17.f131000a);
        point.y = (int) java.lang.Math.round(a17.f131001b);
        return point;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final void d() {
        ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).y();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final void e(int i17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar;
        if (this.f130438b == null || (neVar = this.f130438b.f133806as) == null) {
            return;
        }
        neVar.e(i17);
        neVar.f132055v = true;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final void g(boolean z17) {
        if (this.f130438b != null) {
            this.f130438b.f133727i = z17;
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final void i(boolean z17) {
        if (this.f130438b == null || this.f130438b.e_ == 0) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9 c4430xc2040f9 = (com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_;
        c4430xc2040f9.f134046p = z17;
        c4430xc2040f9.f134045o.j(z17);
    }

    private void a(com.tencent.mapsdk.internal.bk.a aVar) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sl slVar = this.f130440d.f130511c;
        if (slVar != null) {
            slVar.f132988d = aVar;
        }
    }

    private void j(boolean z17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu buVar = this.f130437a.get();
        if (buVar != null) {
            buVar.mo36665xe5e6c0e2(z17);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final void d(boolean z17) {
        com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9 c4430xc2040f9;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar;
        if (this.f130438b == null || this.f130438b.f133732n == null || (c4430xc2040f9 = this.f130438b.f133732n.f130309d) == null || (tkVar = c4430xc2040f9.f134045o.f132039f) == null || tkVar.f133194e == 0) {
            return;
        }
        tkVar.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass173(z17));
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final void h(boolean z17) {
        if (this.f130438b == null) {
            return;
        }
        this.f130438b.f133717ae = z17;
    }

    private void a(com.tencent.mapsdk.internal.sj.c cVar, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7 c25966x7e4576a7) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj sjVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bk bkVar = this.f130440d;
        if (c25966x7e4576a7 == null || c25966x7e4576a7.m99197xd6193b42() == null || (sjVar = bkVar.f130512d) == null) {
            return;
        }
        java.util.List<com.tencent.mapsdk.internal.sj.c> list = sjVar.f132950r;
        if (list != null && cVar != null) {
            list.add(cVar);
        }
        int m99199x350ebba4 = c25966x7e4576a7.m99199x350ebba4();
        int m99198x52f9bf09 = c25966x7e4576a7.m99198x52f9bf09();
        android.view.ViewGroup ac6 = bkVar.f130510b.ac();
        if (ac6 != null) {
            ac6.measure(android.view.View.MeasureSpec.makeMeasureSpec(m99199x350ebba4, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(m99198x52f9bf09, 1073741824));
        }
        bkVar.b(m99199x350ebba4, m99198x52f9bf09);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final void e(boolean z17) {
        if (this.f130438b == null) {
            return;
        }
        if (z17) {
            this.f130438b.A();
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rn rnVar = this.f130438b.f133729k;
        if (rnVar != null) {
            rnVar.d();
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final void f(boolean z17) {
        if (this.f130438b != null) {
            this.f130438b.f133715ac = z17;
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final void f(int i17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rq a17;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hg hgVar;
        if (i17 == 1000 || i17 == 1011 || i17 == 1008) {
            if (i17 == 1008 && (hgVar = this.f130438b.f133806as.f130533c) != null) {
                hgVar.e().f131222a++;
            }
            this.f130458v = i17;
            if (i17 == 1000) {
                i17 = this.f130457u;
            }
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rr rrVar = this.f130441e;
            if (rrVar != null && (a17 = rrVar.a(i17)) != null) {
                i17 = a17.f132782a;
            }
            this.f130438b.f133806as.f(i17);
        }
    }

    private void b(boolean z17, long j17, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.CancelableCallback cancelableCallback) {
        if (!z17) {
            ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).c(a(((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).t() / 2.0f));
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.th thVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.th();
        thVar.b(b(-1.0f));
        thVar.f133136a = this.f130446j;
        thVar.f133165f = cancelableCallback;
        thVar.a(j17);
        ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).a(thVar);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final void d(int i17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar;
        if (this.f130438b == null || (neVar = this.f130438b.f133806as) == null) {
            return;
        }
        neVar.d(i17);
        neVar.f132055v = true;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.aj
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 a(android.graphics.Point point) {
        M m17;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.f130438b;
        if (trVar == null || (m17 = trVar.e_) == 0 || ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) m17).mo37464x78d58245() == null) {
            return null;
        }
        return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kr.a(((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) trVar.e_).mo37464x78d58245().a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu(point.x, point.y)));
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final float c() {
        return ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).p();
    }

    private void c(float f17, float f18) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).f134045o;
        if (neVar != null) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ad adVar = neVar.f132041h;
            adVar.E = f17;
            adVar.F = f18;
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.aj
    public final double a(double d17) {
        return ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).mo37464x78d58245().mo36717xffa0db93(d17);
    }

    private float b(float f17) {
        if (this.f130438b == null || this.f130438b.f133806as == null || this.f130438b.e_ == 0 || this.f130438b.f133806as.f132053t == null) {
            return f17;
        }
        float a17 = this.f130438b.f133806as.f132053t.a();
        return c(f17 + a17) - a17;
    }

    private void a(boolean z17, long j17, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.CancelableCallback cancelableCallback) {
        if (!z17) {
            ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).c(a(((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).t() * 2.0f));
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.th thVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.th();
        thVar.b(b(1.0f));
        thVar.f133136a = this.f130446j;
        thVar.f133165f = cancelableCallback;
        thVar.a(j17);
        ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).a(thVar);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final void c(boolean z17) {
        if (this.f130438b == null || this.f130438b.f133732n == null) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ac acVar = this.f130438b.f133732n;
        int i17 = z17 ? com.tencent.mapsdk.internal.ac.a.f130330b : com.tencent.mapsdk.internal.ac.a.f130331c;
        acVar.f130308c = i17;
        acVar.a(i17);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final void c(int i17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ac acVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar;
        if (this.f130438b == null || this.f130438b.f133732n == null || (neVar = (acVar = this.f130438b.f133732n).f130310e) == null) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hg hgVar = neVar.f130533c;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26034x15ff5647 c26034x15ff5647 = acVar.f130312g;
        if (c26034x15ff5647 != null) {
            java.lang.String m99466x3935e1d5 = c26034x15ff5647.m99466x3935e1d5();
            if (hgVar != null && !android.text.TextUtils.isEmpty(m99466x3935e1d5)) {
                hgVar.d().a(m99466x3935e1d5).b();
            }
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = acVar.f130310e.f132039f;
        if (tkVar != null) {
            tkVar.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass164(i17));
        }
        acVar.e();
    }

    private void b(float f17, boolean z17, long j17, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.CancelableCallback cancelableCallback) {
        double pow;
        if (this.f130438b == null) {
            return;
        }
        float b17 = b(f17);
        if (b17 == 0.0f) {
            return;
        }
        if (!z17) {
            if (b17 < 0.0f) {
                pow = java.lang.Math.pow(2.0d, java.lang.Math.abs(b17));
            } else {
                pow = java.lang.Math.pow(0.5d, java.lang.Math.abs(b17));
            }
            ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).a(((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).t() * ((float) (1.0d / pow)));
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.th thVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.th();
        thVar.b(b17);
        thVar.f133136a = this.f130446j;
        thVar.f133165f = cancelableCallback;
        thVar.a(j17);
        ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).a(thVar);
    }

    private void a(float f17, float f18, boolean z17, long j17, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.CancelableCallback cancelableCallback) {
        if (this.f130438b == null) {
            return;
        }
        if (f17 == 0.0f && f18 == 0.0f) {
            return;
        }
        if (!z17) {
            ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).b((int) f17, (int) f18);
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.th thVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.th();
        int i17 = (int) f17;
        int i18 = (int) f18;
        if (i17 == 0 && i18 == 0) {
            thVar.f133167h = false;
        }
        thVar.I = i17;
        thVar.f133135J = i18;
        thVar.f133167h = true;
        thVar.f133136a = this.f130446j;
        thVar.f133165f = cancelableCallback;
        thVar.a(j17);
        ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).a(thVar);
    }

    private void a(float f17, boolean z17, long j17, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.CancelableCallback cancelableCallback) {
        if (this.f130438b == null) {
            return;
        }
        float c17 = c(f17);
        if (!z17) {
            ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).a((float) (1.0d / java.lang.Math.pow(2.0d, 20.0f - java.lang.Math.min(c17, java.lang.Math.min(((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).q(), 22)))));
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.th thVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.th();
        thVar.a(c17);
        thVar.f133136a = this.f130446j;
        thVar.f133165f = cancelableCallback;
        thVar.a(j17);
        ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).a(thVar);
    }

    private void b(float f17, float f18, boolean z17, long j17, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.CancelableCallback cancelableCallback) {
        if (z17) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.th thVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.th();
            thVar.c(f17);
            if (f18 >= 0.0f) {
                thVar.d(f18);
            }
            thVar.f133136a = this.f130446j;
            thVar.f133165f = cancelableCallback;
            thVar.a(j17);
            ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).a(thVar);
            return;
        }
        ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).b(f17);
        if (f18 >= 0.0f) {
            ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).a(f18);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final float b() {
        return ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).q();
    }

    public final float a(float f17) {
        if (this.f130438b == null || this.f130438b.f133806as == null || this.f130438b.e_ == 0 || this.f130438b.f133806as.f132053t == null) {
            return f17;
        }
        float f18 = this.f130438b.f133806as.f132053t.f133942b.f133976l;
        float a17 = com.tencent.mapsdk.internal.v.b.a(((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).p());
        float a18 = com.tencent.mapsdk.internal.v.b.a(((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).q());
        return (f18 < a17 || f18 > a18) ? java.lang.Math.min(a18, java.lang.Math.max(a17, f17)) : f17;
    }

    private static java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ez> b(java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26030xc162a7c7> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26030xc162a7c7 interfaceC26030xc162a7c7 : list) {
            if (interfaceC26030xc162a7c7 instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ez) {
                arrayList.add((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ez) interfaceC26030xc162a7c7);
            }
        }
        return arrayList;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final void b(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnCameraChangeListener onCameraChangeListener) {
        if (this.f130438b == null) {
            return;
        }
        this.f130438b.C = onCameraChangeListener;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fn
    public final void b(int i17, int i18) {
        if (i17 == 0 || i18 == 0) {
            return;
        }
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25950xd5528c6e c25950xd5528c6e = this.f130461y;
        if (c25950xd5528c6e != null) {
            a(c25950xd5528c6e);
        }
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25950xd5528c6e c25950xd5528c6e2 = this.f130462z;
        if (c25950xd5528c6e2 != null) {
            a(c25950xd5528c6e2, this.A, this.B);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final void b(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26085x16ab0426 interfaceC26085x16ab0426) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26086x3c4a5e4 c26086x3c4a5e4;
        if (this.f130438b == null || (c26086x3c4a5e4 = this.f130438b.f133798ak) == null) {
            return;
        }
        c26086x3c4a5e4.m99988xf1335d58(interfaceC26085x16ab0426);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final void b(boolean z17) {
        if (this.f130438b == null) {
            return;
        }
        this.f130438b.P = z17;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final void b(int i17) {
        if (this.f130438b == null) {
            return;
        }
        this.f130438b.a(i17);
    }

    private void a(float f17, float f18, float f19, boolean z17, long j17, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.CancelableCallback cancelableCallback) {
        double pow;
        if (this.f130438b == null || f17 == 0.0f) {
            return;
        }
        float b17 = b(f17);
        if (!z17) {
            if (b17 < 0.0f) {
                pow = java.lang.Math.pow(2.0d, java.lang.Math.abs(b17));
            } else {
                pow = java.lang.Math.pow(0.5d, java.lang.Math.abs(b17));
            }
            double d17 = f18;
            double d18 = f19;
            ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).f134045o.f132041h.a((float) (1.0d / pow), d17, d18, d17, d18, false, null);
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.th thVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.th();
        thVar.a((int) f18, (int) f19);
        thVar.b(b17);
        thVar.f133136a = this.f130446j;
        thVar.f133165f = cancelableCallback;
        thVar.a(j17);
        ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).a(thVar);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final void b(float f17, float f18) {
        if (this.f130438b == null) {
            return;
        }
        if (f17 < 0.0f) {
            f17 = 0.0f;
        } else if (f17 > 1.0f) {
            f17 = 1.0f;
        }
        if (f18 < 0.0f) {
            f18 = 0.0f;
        } else if (f18 > 1.0f) {
            f18 = 1.0f;
        }
        this.f130438b.d((int) (this.f130438b.Z * f17), (int) (this.f130438b.f133713aa * f18));
        this.f130438b.M = f17;
        this.f130438b.N = f18;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final void b(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMapLoadedCallback onMapLoadedCallback) {
        this.f130438b.f133797aj.remove(onMapLoadedCallback);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final void b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fi fiVar) {
        com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9 c4430xc2040f9;
        if (this.f130438b == null || (c4430xc2040f9 = (com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_) == null) {
            return;
        }
        c4430xc2040f9.f134045o.b(fiVar);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final void b(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26040xa3acf778 enumC26040xa3acf778) {
        if (this.f130438b == null || this.f130438b.f133728j == null) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sp spVar = this.f130438b.f133728j;
        if (enumC26040xa3acf778 != null) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.so soVar = spVar.f133047b;
            if (soVar.f133036j != enumC26040xa3acf778) {
                soVar.f133036j = enumC26040xa3acf778;
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.AbstractC26074xe626c11a abstractC26074xe626c11a = spVar.f133048c;
                if (abstractC26074xe626c11a != null) {
                    abstractC26074xe626c11a.mo36976x48658e7(enumC26040xa3acf778);
                }
                spVar.a();
            }
        }
    }

    private void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e c26015xa89e978e, boolean z17, long j17, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.CancelableCallback cancelableCallback) {
        if (this.f130438b == null || c26015xa89e978e == null) {
            return;
        }
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df m35328x3017aa = com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df.m35328x3017aa(c26015xa89e978e.f49413xcb7e7191);
        float f17 = c26015xa89e978e.f49415x3923d3;
        float p17 = ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).p();
        if (f17 < p17) {
            f17 = p17;
        }
        if (f17 > 20.0f) {
            f17 = 20.0f;
        }
        if (!z17) {
            double pow = 1.0d / java.lang.Math.pow(2.0d, 20.0f - f17);
            if (m35328x3017aa != null) {
                ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).a(m35328x3017aa.m35331xbc3301f3(), m35328x3017aa.m35332x962aa94a());
            }
            ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).a((float) pow);
            ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).b(c26015xa89e978e.f49412xf20877ae);
            if (c26015xa89e978e.f49414x3652bd >= 0.0f) {
                ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).a(c26015xa89e978e.f49414x3652bd);
                return;
            }
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.th thVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.th();
        if (m35328x3017aa != null) {
            thVar.b(m35328x3017aa.m35331xbc3301f3(), m35328x3017aa.m35332x962aa94a());
        }
        thVar.a(f17);
        thVar.c(c26015xa89e978e.f49412xf20877ae);
        float f18 = c26015xa89e978e.f49414x3652bd;
        if (f18 >= 0.0f) {
            thVar.d(f18);
        }
        thVar.f133136a = this.f130446j;
        thVar.a(j17);
        thVar.f133165f = cancelableCallback;
        ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).a(thVar);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final int b(java.lang.String str) {
        com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9 c4430xc2040f9;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar;
        if (this.f130438b == null || this.f130438b.f133732n == null || (c4430xc2040f9 = this.f130438b.f133732n.f130309d) == null || (neVar = c4430xc2040f9.f134045o) == null || (tkVar = neVar.f132039f) == null) {
            return -1;
        }
        return ((java.lang.Integer) tkVar.a((com.p314xaae8f345.map.p511x696c9db.InterfaceC4309x11c86a2<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass50>) new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass50(str), (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass50) (-1))).intValue();
    }

    private void a(double d17, double d18, float f17, boolean z17, long j17, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.CancelableCallback cancelableCallback) {
        if (this.f130438b == null) {
            return;
        }
        int i17 = (int) (d17 * 1000000.0d);
        int i18 = (int) (d18 * 1000000.0d);
        float p17 = ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).p();
        if (f17 < p17) {
            f17 = p17;
        }
        if (f17 > 20.0f) {
            f17 = 20.0f;
        }
        float c17 = c(f17);
        double pow = 1.0d / java.lang.Math.pow(2.0d, 20.0f - c17);
        if (!z17) {
            ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).a(i17, i18);
            ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).a((float) pow);
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.th thVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.th();
        thVar.b(i17, i18);
        thVar.a(c17);
        thVar.f133136a = this.f130446j;
        thVar.f133165f = cancelableCallback;
        thVar.a(j17);
        ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).a(thVar);
    }

    private void a(double d17, double d18, boolean z17, long j17, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.CancelableCallback cancelableCallback) {
        if (this.f130438b == null) {
            return;
        }
        int i17 = (int) (d17 * 1000000.0d);
        int i18 = (int) (d18 * 1000000.0d);
        if (!z17) {
            ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).a(i17, i18);
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.th thVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.th();
        thVar.b(i17, i18);
        thVar.f133136a = this.f130446j;
        thVar.f133165f = cancelableCallback;
        thVar.a(j17);
        ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).a(thVar);
    }

    private int a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b c26042xcb530b7b, int i17, boolean z17, long j17, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.CancelableCallback cancelableCallback) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26;
        float f17;
        if (c26042xcb530b7b != null && c26042xcb530b7b.f49513x1a6ba282 != null && c26042xcb530b7b.f49514x9e7cbcfc != null) {
            int mo37461x8610cf40 = ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).mo37461x8610cf40();
            int mo37456x223a1eed = ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).mo37456x223a1eed();
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b("newLatLngBounds : " + mo37461x8610cf40 + "x" + mo37456x223a1eed);
            int i18 = i17 * 2;
            if (this.f130453q + i18 + this.f130455s < mo37461x8610cf40 && i18 + this.f130454r + this.f130456t < mo37456x223a1eed) {
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e mo37451xd2ef9864 = ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).mo37451xd2ef9864();
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e mo37449xac0983c9 = ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).mo37449xac0983c9(c26042xcb530b7b, new android.graphics.RectF(0.0f, 0.0f, mo37461x8610cf40, mo37456x223a1eed), mo37451xd2ef9864.f49414x3652bd, mo37451xd2ef9864.f49412xf20877ae, i17, i17, i17, i17);
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d262 = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(0.0d, 0.0d);
                if (mo37449xac0983c9 != null) {
                    f17 = mo37449xac0983c9.f49415x3923d3;
                    c26041x873d1d26 = mo37449xac0983c9.f49413xcb7e7191;
                } else {
                    c26041x873d1d26 = c26041x873d1d262;
                    f17 = 0.0f;
                }
                if (f17 < 0.0f) {
                    return (int) f17;
                }
                float c17 = c(f17);
                if (!z17) {
                    ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).a((int) (c26041x873d1d26.f49501xaa2bac6c * 1000000.0d), (int) (c26041x873d1d26.f49502x83009af * 1000000.0d));
                    a(c17, false, j17, (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.CancelableCallback) null);
                    return 0;
                }
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.th thVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.th();
                thVar.b((int) (c26041x873d1d26.f49501xaa2bac6c * 1000000.0d), (int) (c26041x873d1d26.f49502x83009af * 1000000.0d));
                thVar.a(c17);
                thVar.f133136a = this.f130446j;
                thVar.f133165f = cancelableCallback;
                thVar.a(j17);
                ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).a(thVar);
                return 0;
            }
        }
        return -1;
    }

    private int a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b c26042xcb530b7b, int i17, int i18, int i19, int i27, boolean z17, long j17, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.CancelableCallback cancelableCallback) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26;
        float f17;
        if (c26042xcb530b7b == null || c26042xcb530b7b.f49513x1a6ba282 == null || c26042xcb530b7b.f49514x9e7cbcfc == null) {
            return -1;
        }
        int aj6 = this.f130438b.aj();
        int ak6 = this.f130438b.ak();
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b("newLatLngBoundsRects : " + aj6 + "x" + ak6);
        if (i17 + i18 + this.f130453q + this.f130455s >= aj6 || i19 + i27 + this.f130454r + this.f130456t >= ak6) {
            return -1;
        }
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e mo37451xd2ef9864 = ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).mo37451xd2ef9864();
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e mo37449xac0983c9 = ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).mo37449xac0983c9(c26042xcb530b7b, new android.graphics.RectF(0.0f, 0.0f, aj6, ak6), mo37451xd2ef9864.f49414x3652bd, mo37451xd2ef9864.f49412xf20877ae, i17, i19, i18, i27);
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d262 = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(0.0d, 0.0d);
        if (mo37449xac0983c9 != null) {
            f17 = mo37449xac0983c9.f49415x3923d3;
            c26041x873d1d26 = mo37449xac0983c9.f49413xcb7e7191;
        } else {
            c26041x873d1d26 = c26041x873d1d262;
            f17 = 0.0f;
        }
        if (f17 < 0.0f) {
            return (int) f17;
        }
        float c17 = c(f17);
        if (!z17) {
            ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).a((int) (c26041x873d1d26.f49501xaa2bac6c * 1000000.0d), (int) (c26041x873d1d26.f49502x83009af * 1000000.0d));
            a(c17, false, j17, (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.CancelableCallback) null);
        } else {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.th thVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.th();
            thVar.b((int) (c26041x873d1d26.f49501xaa2bac6c * 1000000.0d), (int) (c26041x873d1d26.f49502x83009af * 1000000.0d));
            thVar.a(c17);
            thVar.f133136a = this.f130446j;
            thVar.f133165f = cancelableCallback;
            thVar.a(j17);
            ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).a(thVar);
        }
        return 0;
    }

    private int a(java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ez> list, int i17, int i18, int i19, int i27, final boolean z17, final long j17, final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.CancelableCallback cancelableCallback) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ey mo37464x78d58245 = ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).mo37464x78d58245();
        if (mo37464x78d58245 == null) {
            return Integer.MIN_VALUE;
        }
        if (list != null && !list.isEmpty()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ez ezVar : list) {
                if (ezVar != null && ezVar.mo36417xe9d104de() != null) {
                    arrayList.addAll(ezVar.mo36417xe9d104de());
                }
            }
            if (i17 + i18 <= this.f130438b.Z && i19 + i27 <= this.f130438b.f133713aa) {
                mo37464x78d58245.a(arrayList, null, new android.graphics.Rect(i17, i19, i18, i27), new com.tencent.mapsdk.internal.ey.a() { // from class: com.tencent.mapsdk.internal.bg.3
                    @Override // com.tencent.mapsdk.internal.ey.a
                    public final void a(final float f17, final com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df) {
                        if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg.this.f130438b == null) {
                            return;
                        }
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ko.a(new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.bg.3.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg.this.f130438b == null) {
                                    return;
                                }
                                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg.AnonymousClass3 anonymousClass3 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg.AnonymousClass3.this;
                                if (!z17) {
                                    com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9 c4430xc2040f9 = (com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg.this.f130438b.e_;
                                    com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df2 = c4247x704e24df;
                                    c4430xc2040f9.f134045o.f132041h.a(c4247x704e24df2.m35331xbc3301f3(), c4247x704e24df2.m35332x962aa94a(), 1);
                                    ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg.this.f130438b.e_).a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg.this.a(f17));
                                    return;
                                }
                                double b17 = (((int) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg.this.b()) - (java.lang.Math.log(1.0f / com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg.this.a(f17)) / java.lang.Math.log(2.0d))) - 2.0d;
                                if (b17 < 0.0d) {
                                    b17 = 0.0d;
                                }
                                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.th thVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.th();
                                thVar.b(c4247x704e24df.m35331xbc3301f3(), c4247x704e24df.m35332x962aa94a());
                                thVar.a((float) b17);
                                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg.AnonymousClass3 anonymousClass32 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg.AnonymousClass3.this;
                                thVar.f133136a = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg.this.f130446j;
                                thVar.f133165f = cancelableCallback;
                                thVar.a(j17);
                                ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg.this.f130438b.e_).a(thVar);
                            }
                        });
                    }
                });
                return 0;
            }
        }
        return -1;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e a() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kr.a(((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).r());
        float v17 = ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).v();
        if (v17 < 0.0f) {
            v17 = (v17 % 360.0f) + 360.0f;
        }
        return com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e.m99376xdc3ef9b().m99385x3923d3(D()).m99383xcb7e7191(a17).m99381xf20877ae(v17).m99384x3652bd(((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).w()).m99382x59bc66e();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final int a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25950xd5528c6e c25950xd5528c6e) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26014x36345e6d m99096x29c21c7c;
        if (c25950xd5528c6e == null || (m99096x29c21c7c = c25950xd5528c6e.m99096x29c21c7c()) == null) {
            return -1;
        }
        this.f130461y = c25950xd5528c6e;
        int i17 = 0;
        switch (m99096x29c21c7c.f49389x95299fad) {
            case 0:
                a(false, 0L, (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.CancelableCallback) null);
                break;
            case 1:
                b(false, 0L, null);
                break;
            case 2:
                a(m99096x29c21c7c.f49406xe80dad89, m99096x29c21c7c.f49407xe9c28628, false, 0L, (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.CancelableCallback) null);
                break;
            case 3:
                a(m99096x29c21c7c.f49411x83cab3c4, false, 0L, (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.CancelableCallback) null);
                break;
            case 4:
                b(m99096x29c21c7c.f49410x33239aad, false, 0L, null);
                break;
            case 5:
                float f17 = m99096x29c21c7c.f49408xefa2609c;
                android.graphics.Point point = m99096x29c21c7c.f49409x10442c14;
                a(f17, point.x, point.y, false, 0L, (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.CancelableCallback) null);
                break;
            case 6:
                a(m99096x29c21c7c.f49390xc2040e9f, false, 0L, (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.CancelableCallback) null);
                break;
            case 7:
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26 = m99096x29c21c7c.f49403xf544149f;
                if (c26041x873d1d26 != null) {
                    a(c26041x873d1d26.f49501xaa2bac6c, c26041x873d1d26.f49502x83009af, false, 0L, (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.CancelableCallback) null);
                    break;
                }
                break;
            case 8:
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d262 = m99096x29c21c7c.f49401xf863684c;
                if (c26041x873d1d262 != null) {
                    a(c26041x873d1d262.f49501xaa2bac6c, c26041x873d1d262.f49502x83009af, m99096x29c21c7c.f49402xe0957499, false, 0L, (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.CancelableCallback) null);
                    break;
                }
                break;
            case 9:
                i17 = a(m99096x29c21c7c.f49395xb872ca59, m99096x29c21c7c.f49400x21a5dced, false, 0L, (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.CancelableCallback) null);
                break;
            case 10:
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b c26042xcb530b7b = m99096x29c21c7c.f49396x7b715e52;
                int i18 = m99096x29c21c7c.f49398xbe79c814;
                i17 = a(c26042xcb530b7b, i18, i18, i18, i18, false, 0L, (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.CancelableCallback) null);
                break;
            case 11:
                i17 = a(m99096x29c21c7c.f49396x7b715e52, m99096x29c21c7c.f49392x1f929caf, m99096x29c21c7c.f49393xd3175a74, m99096x29c21c7c.f49394x5bdb8fad, m99096x29c21c7c.f49391x5bdb4c18, false, 0L, (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.CancelableCallback) null);
                break;
            case 12:
                b(m99096x29c21c7c.f49404x6d1894a4, m99096x29c21c7c.f49405x79dada93, false, 0L, null);
                break;
            case 13:
                return a(b(m99096x29c21c7c.f49388xff80c0f7), m99096x29c21c7c.f49392x1f929caf, m99096x29c21c7c.f49393xd3175a74, m99096x29c21c7c.f49394x5bdb8fad, m99096x29c21c7c.f49391x5bdb4c18, false, 0L, (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.CancelableCallback) null);
        }
        if (i17 == 0) {
            this.f130461y = null;
        }
        return i17;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0023. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00fa  */
    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25950xd5528c6e r16, long r17, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.CancelableCallback r19) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg.a(com.tencent.tencentmap.mapsdk.maps.CameraUpdate, long, com.tencent.tencentmap.mapsdk.maps.TencentMap$CancelableCallback):int");
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final void a(int i17) {
        int f17 = f();
        this.f130457u = i17;
        if (i17 == f17 || f17 == 1011 || f17 == 1008) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rr rrVar = this.f130441e;
        if (rrVar != null) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rq a17 = rrVar.a(i17);
            if (a17 != null) {
                i17 = a17.f132782a;
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hg hgVar = this.f130438b.f133806as.f130533c;
                if (hgVar != null) {
                    hgVar.q().a(a17.f132783b);
                }
            } else if (i17 >= 1000) {
                i17 -= 1000;
            } else if (i17 > 8 && i17 < 989) {
                i17 += 11;
            }
        }
        this.f130438b.f133806as.f(i17);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.q();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final void a(boolean z17) {
        com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9 c4430xc2040f9 = (com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_;
        if (z17) {
            c4430xc2040f9.b(true);
        } else {
            c4430xc2040f9.b(false);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMapClickListener onMapClickListener) {
        this.f130438b.f133735q = onMapClickListener;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMapLongClickListener onMapLongClickListener) {
        this.f130438b.f133738t = onMapLongClickListener;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnCameraChangeListener onCameraChangeListener) {
        if (this.f130438b == null) {
            return;
        }
        this.f130438b.B = onCameraChangeListener;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnScaleViewChangedListener onScaleViewChangedListener) {
        if (this.f130438b == null) {
            return;
        }
        this.f130438b.A = onScaleViewChangedListener;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnDismissCallback onDismissCallback) {
        this.f130438b.f133739u = onDismissCallback;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26, float f17, float f18) {
        a(c26041x873d1d26, f17, f18, 0.0f, true);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26, float f17, float f18, float f19, boolean z17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.th thVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.th();
        thVar.b((int) (c26041x873d1d26.f49501xaa2bac6c * 1000000.0d), (int) (c26041x873d1d26.f49502x83009af * 1000000.0d));
        thVar.a(f19);
        thVar.c(f17);
        thVar.d(f18);
        thVar.f133136a = this.f130446j;
        thVar.f133166g = true;
        thVar.a(1000L);
        if (z17) {
            thVar.a(this.f130438b.G, this.f130438b.H);
        } else {
            thVar.a(this.f130438b.I, this.f130438b.f133712J);
        }
        ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).y();
        ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).a(thVar);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final float a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d262) {
        return a(0, 0, 0, 0, c26041x873d1d26, c26041x873d1d262, (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26) null);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final void a(android.os.Handler handler, android.graphics.Bitmap.Config config, int i17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.f130438b;
        trVar.D = handler;
        trVar.F = config;
        if (i17 >= 0) {
            trVar.E = android.os.SystemClock.elapsedRealtime() + i17;
        } else {
            trVar.E = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
        }
        trVar.J();
        trVar.H();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final java.lang.String a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26) {
        if (c26041x873d1d26 == null) {
            return null;
        }
        return ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).f134045o.a(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df.m35328x3017aa(c26041x873d1d26));
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26085x16ab0426 interfaceC26085x16ab0426) {
        if (this.f130438b == null) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.f130438b;
        if (trVar.f133798ak == null) {
            trVar.f133798ak = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26086x3c4a5e4();
        }
        trVar.f133798ak.m99987x162a7075(interfaceC26085x16ab0426);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final void a(float f17, float f18) {
        if (this.f130438b == null) {
            return;
        }
        if (f17 < 0.0f) {
            f17 = 0.0f;
        } else if (f17 > 1.0f) {
            f17 = 1.0f;
        }
        if (f18 < 0.0f) {
            f18 = 0.0f;
        } else if (f18 > 1.0f) {
            f18 = 1.0f;
        }
        this.f130438b.c((int) (this.f130438b.Z * f17), (int) (this.f130438b.f133713aa * f18));
        this.f130438b.K = f17;
        this.f130438b.L = f18;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final void a(int i17, int i18) {
        if (this.f130438b == null) {
            return;
        }
        this.f130438b.a(i17, i18);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnCompassClickedListener onCompassClickedListener) {
        if (this.f130438b != null) {
            this.f130438b.f133744z = onCompassClickedListener;
        }
    }

    public final float a(float f17, int i17, int i18, int i19, int i27, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d262) {
        int i28 = this.f130438b.Z;
        int i29 = this.f130438b.f133713aa;
        if (i28 == 0 || i29 == 0 || c26041x873d1d26 == null || c26041x873d1d262 == null) {
            return 0.0f;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu a17 = this.f130460x.a(this.f130439c, c26041x873d1d26);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu a18 = this.f130460x.a(this.f130439c, c26041x873d1d262);
        double d17 = a18.f131000a - a17.f131000a;
        if (d17 < 0.0d) {
            d17 = java.lang.Math.abs(d17);
        }
        double d18 = a18.f131001b - a17.f131001b;
        if (d18 < 0.0d) {
            d18 = java.lang.Math.abs(d18);
        }
        double d19 = d17 * 1.0d;
        double d27 = d18 * 1.0d;
        int i37 = (i28 - i17) - i18;
        int i38 = (i29 - i19) - i27;
        if (f17 == 90.0f) {
            f17 = 89.0f;
        }
        int cos = (int) (i38 / java.lang.Math.cos((f17 * 3.141592653589793d) / 180.0d));
        if (i37 <= 0) {
            i37 = 1;
        }
        if (cos <= 0) {
            cos = 1;
        }
        double log = java.lang.Math.log(d19 / i37) / java.lang.Math.log(2.0d);
        double log2 = java.lang.Math.log(d27 / cos) / java.lang.Math.log(2.0d);
        if (log < 0.0d) {
            log = 0.0d;
        }
        return (float) (20.0d - java.lang.Math.max(log, log2 >= 0.0d ? log2 : 0.0d));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
    
        if ((r7 + r9) <= com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hs.c(r10)) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(int r6, int r7, int r8, int r9, boolean r10) {
        /*
            r5 = this;
            com.tencent.mapsdk.internal.tr r0 = r5.f130438b
            M extends com.tencent.mapsdk.internal.bl r0 = r0.e_
            com.tencent.mapsdk.vector.VectorMap r0 = (com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) r0
            com.tencent.mapsdk.internal.ne r0 = r0.f134045o
            com.tencent.mapsdk.internal.ad r0 = r0.f132041h
            r0.H = r6
            r0.I = r7
            r0.f130347J = r8
            r0.K = r9
            android.graphics.Rect r1 = r0.C
            r2 = 0
            r3 = -1
            if (r1 == 0) goto L47
            int r1 = r1.width()
            if (r1 <= 0) goto L47
            android.graphics.Rect r1 = r0.C
            int r1 = r1.height()
            if (r1 <= 0) goto L47
            int r1 = r6 + r8
            android.graphics.Rect r4 = r0.C
            int r4 = r4.width()
            if (r1 > r4) goto L6b
            int r1 = r7 + r9
            android.graphics.Rect r4 = r0.C
            int r4 = r4.height()
            if (r1 <= r4) goto L3b
            goto L6b
        L3b:
            android.graphics.PointF r1 = r0.a()
            float r3 = r1.x
            float r1 = r1.y
            r0.a(r3, r1, r10)
            goto L6e
        L47:
            com.tencent.mapsdk.internal.ad$1 r1 = new com.tencent.mapsdk.internal.ad$1
            r1.<init>(r10)
            r0.a(r1)
            com.tencent.mapsdk.internal.bd r10 = r0.f130362z
            boolean r0 = r10 instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne
            if (r0 == 0) goto L6d
            com.tencent.mapsdk.internal.ne r10 = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne) r10
            android.content.Context r10 = r10.mo36630x76847179()
            int r0 = r6 + r8
            int r1 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hs.b(r10)
            if (r0 > r1) goto L6b
            int r0 = r7 + r9
            int r10 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hs.c(r10)
            if (r0 <= r10) goto L6e
        L6b:
            r2 = r3
            goto L6e
        L6d:
            r2 = -2
        L6e:
            if (r2 != 0) goto L78
            r5.f130453q = r6
            r5.f130454r = r7
            r5.f130455s = r8
            r5.f130456t = r9
        L78:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg.a(int, int, int, int, boolean):int");
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final float a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b c26042xcb530b7b, float f17, int i17, boolean z17) {
        int i18;
        if (c26042xcb530b7b == null) {
            return 0.0f;
        }
        if (z17) {
            i18 = this.f130438b.H;
        } else {
            i18 = this.f130438b.f133712J;
        }
        float f18 = !z17 ? 0.0f : f17;
        if (i18 < 0) {
            i18 = this.f130438b.Z / 2;
        }
        return a(f18, 0, 0, i17, this.f130438b.f133713aa - i18, c26042xcb530b7b.f49514x9e7cbcfc, c26042xcb530b7b.f49513x1a6ba282);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final float a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d262, float f17, int i17, boolean z17) {
        if (c26041x873d1d26 == null || c26041x873d1d262 == null) {
            return 0.0f;
        }
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b.Builder builder = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b.Builder();
        builder.m99564x73c954a8(c26041x873d1d26);
        builder.m99564x73c954a8(c26041x873d1d262);
        return a(!z17 ? 0.0f : f17, 0, 0, i17, 0, builder.m99563x59bc66e().f49514x9e7cbcfc, builder.m99563x59bc66e().f49513x1a6ba282);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final float a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d262, float f17, int i17, int i18, int i19, int i27, boolean z17) {
        if (c26041x873d1d26 == null || c26041x873d1d262 == null) {
            return 0.0f;
        }
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b.Builder builder = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b.Builder();
        builder.m99564x73c954a8(c26041x873d1d26);
        builder.m99564x73c954a8(c26041x873d1d262);
        return a(!z17 ? 0.0f : f17, i17, i18, i19, i27, builder.m99563x59bc66e().f49514x9e7cbcfc, builder.m99563x59bc66e().f49513x1a6ba282);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final float a(int i17, int i18, int i19, int i27, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d262, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d263) {
        return this.f130460x.a(c26041x873d1d26, c26041x873d1d262, i17, i18, i19, i27, c26041x873d1d263);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e a(java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ez> list, java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26> list2, int i17, int i18, int i19, int i27) {
        if (this.f130438b.Z != 0 && this.f130438b.f133713aa != 0) {
            if (i17 + i18 > this.f130438b.Z || i19 + i27 > this.f130438b.f133713aa) {
                return null;
            }
        } else {
            int b17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hs.b(this.f130439c);
            int c17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hs.c(this.f130439c);
            if (i17 + i18 > b17 || i19 + i27 > c17) {
                return null;
            }
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ey mo37464x78d58245 = ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).mo37464x78d58245();
        if (mo37464x78d58245 == null) {
            return null;
        }
        if (list != null && !list.isEmpty()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ez ezVar : list) {
                if (ezVar != null && ezVar.mo36417xe9d104de() != null) {
                    arrayList.addAll(ezVar.mo36417xe9d104de());
                }
            }
            android.graphics.Rect rect = new android.graphics.Rect(i17, i19, i18, i27);
            this.f130444h = null;
            mo37464x78d58245.a(arrayList, com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df.m35329x3017aa(list2), rect, new com.tencent.mapsdk.internal.ey.a() { // from class: com.tencent.mapsdk.internal.bg.4
                @Override // com.tencent.mapsdk.internal.ey.a
                public final void a(float f17, com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df) {
                    com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kr.a(c4247x704e24df);
                    double log = 20.0d - (java.lang.Math.log(1.0f / f17) / java.lang.Math.log(2.0d));
                    if (log < 0.0d) {
                        log = 0.0d;
                    }
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg bgVar = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg.this;
                    bgVar.f130444h = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e(a17, (float) log, ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) bgVar.f130438b.e_).w(), ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg.this.f130438b.e_).v());
                    synchronized (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg.this.f130445i) {
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg.this.f130445i.notifyAll();
                    }
                }
            });
            synchronized (this.f130445i) {
                try {
                    this.f130445i.wait(1000L);
                } catch (java.lang.InterruptedException e17) {
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d(android.util.Log.getStackTraceString(e17));
                    java.lang.Thread.currentThread().interrupt();
                }
            }
            return this.f130444h;
        }
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        if (list2.size() == 1) {
            return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e(list2.get(0), ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).f134045o.f132053t.a(), ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).w(), ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).v());
        }
        double d17 = 0.0d;
        double d18 = 0.0d;
        double d19 = 0.0d;
        double d27 = 0.0d;
        double d28 = 0.0d;
        for (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26 : list2) {
            if (c26041x873d1d26 != null) {
                if (d18 == d17) {
                    d18 = c26041x873d1d26.f49501xaa2bac6c;
                }
                if (d19 == d17) {
                    d19 = c26041x873d1d26.f49502x83009af;
                }
                double d29 = d18;
                double d37 = d27;
                if (d37 == d17) {
                    d37 = c26041x873d1d26.f49501xaa2bac6c;
                }
                double d38 = d28;
                if (d38 == d17) {
                    d38 = c26041x873d1d26.f49502x83009af;
                }
                d28 = d38;
                double d39 = c26041x873d1d26.f49501xaa2bac6c;
                double d47 = d29;
                if (d39 < d47) {
                    d47 = d39;
                }
                if (d39 > d37) {
                    d37 = d39;
                }
                double d48 = c26041x873d1d26.f49502x83009af;
                if (d48 < d19) {
                    d19 = d48;
                }
                if (d48 > d28) {
                    d28 = d48;
                }
                d27 = d37;
                d18 = d47;
            } else {
                d18 = d18;
                d17 = 0.0d;
            }
        }
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d262 = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(d18, d19);
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d263 = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(d27, d28);
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d264 = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(0.0d, 0.0d);
        float a17 = a(i17, i18, i19, i27, c26041x873d1d262, c26041x873d1d263, c26041x873d1d264);
        if (a17 < 0.0f) {
            return null;
        }
        return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e(c26041x873d1d264, a17, ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).w(), ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).v());
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e a(java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ez> list, java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26> list2, int i17, int i18, int i19, int i27, final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.AsyncOperateCallback<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e> asyncOperateCallback) {
        if (this.f130438b.Z != 0 && this.f130438b.f133713aa != 0) {
            if (i17 + i18 > this.f130438b.Z || i19 + i27 > this.f130438b.f133713aa) {
                if (asyncOperateCallback != null) {
                    asyncOperateCallback.m99148x6f81ba37(null);
                }
                return null;
            }
        } else {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hs.b(this.f130439c);
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hs.c(this.f130439c);
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ey mo37464x78d58245 = ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).mo37464x78d58245();
        if (mo37464x78d58245 == null) {
            return null;
        }
        if (list.isEmpty()) {
            if (list2 == null || list2.isEmpty()) {
                if (asyncOperateCallback != null) {
                    asyncOperateCallback.m99148x6f81ba37(null);
                }
                return null;
            }
            if (list2.size() == 1) {
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e c26015xa89e978e = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e(list2.get(0), ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).t(), ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).w(), ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).v());
                if (asyncOperateCallback != null) {
                    asyncOperateCallback.m99148x6f81ba37(c26015xa89e978e);
                }
                return c26015xa89e978e;
            }
            java.util.Iterator<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26> it = list2.iterator();
            double d17 = 0.0d;
            double d18 = 0.0d;
            double d19 = 0.0d;
            double d27 = 0.0d;
            double d28 = 0.0d;
            while (it.hasNext()) {
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 next = it.next();
                if (next != null) {
                    if (d18 == d17) {
                        d18 = next.f49501xaa2bac6c;
                    }
                    if (d19 == d17) {
                        d19 = next.f49502x83009af;
                    }
                    double d29 = d18;
                    double d37 = d27;
                    if (d37 == d17) {
                        d37 = next.f49501xaa2bac6c;
                    }
                    java.util.Iterator<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26> it6 = it;
                    double d38 = d28;
                    if (d38 == d17) {
                        d38 = next.f49502x83009af;
                    }
                    d28 = d38;
                    double d39 = next.f49501xaa2bac6c;
                    double d47 = d29;
                    if (d39 < d47) {
                        d47 = d39;
                    }
                    if (d39 > d37) {
                        d37 = d39;
                    }
                    double d48 = next.f49502x83009af;
                    if (d48 < d19) {
                        d19 = d48;
                    }
                    if (d48 > d28) {
                        d28 = d48;
                    }
                    d27 = d37;
                    it = it6;
                    d18 = d47;
                } else {
                    it = it;
                    d18 = d18;
                    d17 = 0.0d;
                }
            }
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26 = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(d18, d19);
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d262 = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(d27, d28);
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d263 = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(0.0d, 0.0d);
            float a17 = a(i17, i18, i19, i27, c26041x873d1d26, c26041x873d1d262, c26041x873d1d263);
            if (a17 < 0.0f) {
                if (asyncOperateCallback != null) {
                    asyncOperateCallback.m99148x6f81ba37(null);
                }
                return null;
            }
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e c26015xa89e978e2 = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e(c26041x873d1d263, a17, ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).w(), ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).v());
            if (asyncOperateCallback != null) {
                asyncOperateCallback.m99148x6f81ba37(c26015xa89e978e2);
            }
            return c26015xa89e978e2;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ez ezVar : list) {
            if (ezVar != null && ezVar.mo36417xe9d104de() != null) {
                arrayList.addAll(ezVar.mo36417xe9d104de());
            }
        }
        android.graphics.Rect rect = new android.graphics.Rect(i17, i19, i18, i27);
        this.f130444h = null;
        mo37464x78d58245.a(arrayList, com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df.m35329x3017aa(list2), rect, new com.tencent.mapsdk.internal.ey.a() { // from class: com.tencent.mapsdk.internal.bg.5
            @Override // com.tencent.mapsdk.internal.ey.a
            public final void a(float f17, com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df) {
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 a18 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kr.a(c4247x704e24df);
                double log = 20.0d - (java.lang.Math.log(1.0f / f17) / java.lang.Math.log(2.0d));
                if (log < 0.0d) {
                    log = 0.0d;
                }
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg bgVar = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg.this;
                bgVar.f130444h = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e(a18, (float) log, ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) bgVar.f130438b.e_).w(), ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg.this.f130438b.e_).v());
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.AsyncOperateCallback asyncOperateCallback2 = asyncOperateCallback;
                if (asyncOperateCallback2 != null) {
                    asyncOperateCallback2.m99148x6f81ba37(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bg.this.f130444h);
                }
            }
        });
        return null;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final void a(float f17, float f18, boolean z17) {
        if (this.f130438b == null) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ad adVar = ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).f134045o.f132041h;
        adVar.N = true;
        adVar.a(f17, f18, z17);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26, float f17, float f18, float f19) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.th thVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.th();
        thVar.b((int) (c26041x873d1d26.f49501xaa2bac6c * 1000000.0d), (int) (c26041x873d1d26.f49502x83009af * 1000000.0d));
        thVar.a(f19);
        thVar.c(f17);
        thVar.d(f18);
        thVar.f133136a = this.f130446j;
        thVar.f133166g = true;
        thVar.a(1000L);
        ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).y();
        ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).a(thVar);
    }

    private void a(int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).f134045o;
        if (neVar == null || (tkVar = neVar.f132039f) == null) {
            return;
        }
        tkVar.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass27(i18, i17, i19, i27));
    }

    private void a(float f17, float f18, float f19) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.f130438b;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = trVar.f133806as;
        if (neVar != null) {
            float f27 = neVar.f132041h.A.f133942b.f133976l;
            float c17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tz.c(f19);
            boolean z17 = ((double) java.lang.Math.abs(f27 - c17)) > 1.0E-4d;
            trVar.f133808au = 0;
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ko.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tz.AnonymousClass1((f18 - trVar.f133807at) / 10.0f, f17, f18, f19, z17, c17));
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMapLoadedCallback onMapLoadedCallback) {
        this.f130438b.f133797aj.add(onMapLoadedCallback);
    }

    private float a(double d17, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ey eyVar;
        if (c26041x873d1d26 == null) {
            return 0.0f;
        }
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df((int) (c26041x873d1d26.f49501xaa2bac6c * 1000000.0d), (int) (c26041x873d1d26.f49502x83009af * 1000000.0d));
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).f134045o;
        if (neVar.f132053t != null && (eyVar = neVar.f132046m) != null) {
            double mo36717xffa0db93 = eyVar.mo36717xffa0db93(c4247x704e24df.m35331xbc3301f3() / 1000000.0d);
            if (mo36717xffa0db93 != 0.0d) {
                return (float) (d17 / mo36717xffa0db93);
            }
        }
        return 0.0f;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final java.util.List<android.graphics.Rect> a(java.util.List<java.lang.String> list) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qv qvVar;
        java.util.ArrayList arrayList = null;
        if (list != null && !list.isEmpty()) {
            if (this.f130438b == null) {
                return null;
            }
            arrayList = new java.util.ArrayList(list.size());
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ey mo37464x78d58245 = ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_).mo37464x78d58245();
            java.util.Iterator<java.lang.String> it = list.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po c17 = this.f130438b.c(it.next());
                if (c17 != null) {
                    if (c17 instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pp) {
                        arrayList.add(((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pp) c17).mo36419xd5aa333c(mo37464x78d58245));
                    } else if ((c17 instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pr) && (qvVar = ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pr) c17).f132269b) != null) {
                        arrayList.add(qvVar.mo36419xd5aa333c(mo37464x78d58245));
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26040xa3acf778 enumC26040xa3acf778) {
        com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9 c4430xc2040f9;
        if (this.f130438b == null || (c4430xc2040f9 = (com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_) == null) {
            return;
        }
        c4430xc2040f9.mo36576x166531da(enumC26040xa3acf778);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fi fiVar) {
        com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9 c4430xc2040f9;
        if (this.f130438b == null || (c4430xc2040f9 = (com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_) == null) {
            return;
        }
        c4430xc2040f9.f134045o.a(fiVar);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final void a(java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26056xa47d77b8> list, java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26> list2) {
        com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9 c4430xc2040f9;
        if (this.f130438b == null || (c4430xc2040f9 = (com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130438b.e_) == null) {
            return;
        }
        java.util.List<com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df> m35329x3017aa = com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df.m35329x3017aa(list2);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = c4430xc2040f9.f134045o;
        if (neVar.f132059z == null) {
            neVar.f132059z = new com.tencent.mapsdk.internal.ne.d();
        }
        com.tencent.mapsdk.internal.ne.d dVar = neVar.f132059z;
        dVar.f132071a = list;
        dVar.f132072b = m35329x3017aa;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne.this.f132039f.a(list, m35329x3017aa);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnIndoorStateChangeListener onIndoorStateChangeListener) {
        this.f130438b.a(onIndoorStateChangeListener);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final void a(java.lang.String str) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar;
        if (this.f130438b == null || (neVar = this.f130438b.f133806as) == null) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = neVar.f132039f;
        if (tkVar != null) {
            tkVar.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass36(str));
        }
        neVar.f132055v = true;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26088xb80c71a2 a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26089x9c7ff29c c26089x9c7ff29c) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.re reVar = this.f130450n;
        if (reVar == null) {
            return null;
        }
        return reVar.b(c26089x9c7ff29c);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26018xf8628040 a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26019xdcd7d63e c26019xdcd7d63e) {
        int i17;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qh qhVar = this.f130442f;
        if (qhVar != null && this.f130450n != null && qhVar.f132466a != null) {
            c26019xdcd7d63e.m99413x3b4d0a16();
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131733a, qhVar.f132468c);
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.re reVar = qhVar.f132466a;
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26089x9c7ff29c c26089x9c7ff29c = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26089x9c7ff29c();
            java.lang.String str = "custom_layer_" + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.li.a(c26019xdcd7d63e.m99413x3b4d0a16());
            c26089x9c7ff29c.m99994xb2cd9a68(str);
            c26089x9c7ff29c.m100011xf97d9342(true);
            c26089x9c7ff29c.m100009x62943937(0);
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qi a17 = qhVar.a(c26019xdcd7d63e.m99413x3b4d0a16());
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131733a, "cache_dir", (java.lang.Object) str, qhVar.f132468c);
            if (a17 != null) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131733a, "version", (java.lang.Object) a17.f132480b, qhVar.f132468c);
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131733a, "minZoom", java.lang.Integer.valueOf(a17.f132482d), qhVar.f132468c);
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131733a, "maxZoom", java.lang.Integer.valueOf(a17.f132481c), qhVar.f132468c);
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131733a, "layerId", (java.lang.Object) a17.f132479a, qhVar.f132468c);
                c26089x9c7ff29c.m100012xe5462ebf(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qh.AnonymousClass1(a17));
                c26089x9c7ff29c.m100014x290dc9a6(a17.f132480b);
            }
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qz a18 = reVar.a(c26089x9c7ff29c);
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qi a19 = qhVar.a(c26019xdcd7d63e.m99413x3b4d0a16());
            if (a18 != null && a19 != null) {
                if (a19.f132483e) {
                    a18.a(true);
                    a19.f132483e = false;
                }
                int i18 = a19.f132482d;
                int i19 = a19.f132481c;
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.re reVar2 = a18.f132666q;
                if (reVar2 != null && (i17 = a18.f132665p) >= 0) {
                    reVar2.a(i17, i18, i19);
                }
                a18.a(a19.f132482d, a19.f132481c);
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hg hgVar = qhVar.f132466a.f132688h.f130533c;
                if (hgVar != null) {
                    hgVar.c().f131301a++;
                }
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.d(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131733a, qhVar.f132468c);
                return new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.at(a18);
            }
        }
        return null;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final void a(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar;
        if (this.f130438b == null || this.f130438b.e_ == 0 || (neVar = this.f130438b.f133806as) == null) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hg hgVar = neVar.f130533c;
        if (hgVar != null && !android.text.TextUtils.isEmpty(str)) {
            hgVar.d().a(str).b();
        }
        neVar.a(str, str2);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b c26042xcb530b7b, int i17) {
        if (this.f130438b == null || this.f130438b.e_ == 0) {
            return;
        }
        this.f130438b.f133806as.a(c26042xcb530b7b, i17);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ai
    public final void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnTrafficEventClickListener onTrafficEventClickListener) {
        if (this.f130438b == null || this.f130438b.e_ == 0) {
            return;
        }
        this.f130438b.f133719ag = onTrafficEventClickListener;
    }
}
