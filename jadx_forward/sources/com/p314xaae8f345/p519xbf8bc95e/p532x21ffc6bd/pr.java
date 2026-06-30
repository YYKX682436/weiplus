package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class pr extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.aq> implements com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.aq {
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e A;
    private final int B;
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.im C;
    private float D;
    private com.tencent.mapsdk.internal.pr.a E;
    private float F;
    private int G;
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26079x1291dc9e.Text H;
    private boolean I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f132267J;
    private float K;
    private boolean L;
    private boolean M;
    private int N;
    private com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df O;
    private java.lang.String P;
    private int Q;
    private java.util.List<java.lang.Integer> R;
    private final float S;
    private boolean T;
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26003xba1d3b64 U;
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26079x1291dc9e V;
    private java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26> W;
    private final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az X;
    private java.lang.String Y;
    private boolean Z;

    /* renamed from: aa, reason: collision with root package name */
    private com.tencent.mapsdk.internal.im.b f132268aa;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qv f132269b;

    /* renamed from: d, reason: collision with root package name */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qw f132270d;

    /* renamed from: p, reason: collision with root package name */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26078x2558e5e0 f132271p;

    /* renamed from: q, reason: collision with root package name */
    private final java.util.List<com.tencent.mapsdk.internal.pr.a> f132272q;

    /* renamed from: r, reason: collision with root package name */
    private final java.util.List<com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df> f132273r;

    /* renamed from: s, reason: collision with root package name */
    private float f132274s;

    /* renamed from: t, reason: collision with root package name */
    private final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne f132275t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f132276u;

    /* renamed from: v, reason: collision with root package name */
    private int[] f132277v;

    /* renamed from: w, reason: collision with root package name */
    private int[] f132278w;

    /* renamed from: x, reason: collision with root package name */
    private int[] f132279x;

    /* renamed from: y, reason: collision with root package name */
    private int f132280y;

    /* renamed from: z, reason: collision with root package name */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26079x1291dc9e.ColorType f132281z;

    /* loaded from: classes13.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        int[] f132287a;

        /* renamed from: b, reason: collision with root package name */
        int[] f132288b;

        /* renamed from: c, reason: collision with root package name */
        int f132289c;

        /* renamed from: d, reason: collision with root package name */
        int f132290d;

        public b(int i17) {
            this.f132290d = i17;
            this.f132287a = new int[i17];
            this.f132288b = new int[i17];
        }

        public final void a(int i17, int i18) {
            int i19 = this.f132289c;
            if (i19 >= this.f132290d) {
                return;
            }
            this.f132287a[i19] = i17;
            this.f132288b[i19] = i18;
            this.f132289c = i19 + 1;
        }
    }

    public pr(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az azVar) {
        super(azVar);
        this.f132269b = null;
        this.f132270d = null;
        this.f132271p = null;
        this.f132276u = false;
        this.f132277v = null;
        this.f132278w = null;
        this.f132279x = null;
        this.f132280y = -7829368;
        this.A = null;
        this.B = 12;
        this.E = null;
        this.F = 1.0f;
        this.G = 0;
        this.I = false;
        this.f132267J = true;
        this.K = 0.0f;
        this.L = false;
        this.M = false;
        this.N = -1;
        this.O = null;
        this.Q = (int) (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hs.a(this.f132213n.I()) * 100.0f);
        this.Y = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua.f133842a;
        this.f132268aa = new com.tencent.mapsdk.internal.im.b() { // from class: com.tencent.mapsdk.internal.pr.3
            @Override // com.tencent.mapsdk.internal.im.b
            public final void a(float f17, float f18) {
            }

            @Override // com.tencent.mapsdk.internal.im.b
            public final void b(float f17) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pr.this.F = f17;
            }

            @Override // com.tencent.mapsdk.internal.im.b
            public final void a(float f17, float f18, float f19, float f27) {
            }

            @Override // com.tencent.mapsdk.internal.im.b
            public final void a(int i17, int i18) {
            }

            @Override // com.tencent.mapsdk.internal.im.b
            public final void a(float f17) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pr.this.D = f17;
            }
        };
        this.X = azVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne b17 = azVar.b();
        this.f132275t = b17;
        this.f132272q = new java.util.concurrent.CopyOnWriteArrayList();
        this.f132273r = new java.util.concurrent.CopyOnWriteArrayList();
        this.S = b17.mo36630x76847179().getResources().getDisplayMetrics().density;
    }

    private static int b(int i17) {
        if (i17 == 0) {
            return 0;
        }
        if (i17 == 1) {
            return 1;
        }
        if (i17 == 2) {
            return 2;
        }
        if (i17 == 3) {
            return 3;
        }
        if (i17 != 4) {
            return (i17 == 6 || i17 != 33) ? 6 : 33;
        }
        return 4;
    }

    private static int c(int i17) {
        if (i17 >= 12) {
            i17 = 11;
        }
        if (i17 < 0) {
            return 0;
        }
        return i17;
    }

    private void d() {
        if (java.lang.Thread.currentThread().getName().contains(this.Y)) {
            e();
        } else {
            this.f132275t.a(new com.tencent.mapsdk.internal.ne.a() { // from class: com.tencent.mapsdk.internal.pr.1
                @Override // com.tencent.mapsdk.internal.ne.a
                public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pr.this.e();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.f132275t == null || this.f132273r.size() < 2 || !mo36423xf94337e8()) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qv qvVar = this.f132269b;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fy g17 = g();
        if (g17.a()) {
            if (qvVar == null) {
                qvVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qv(this, this.X, g17);
                qvVar.b_ = this.b_;
                this.f132275t.f132043j.a(qvVar);
                this.f132269b = qvVar;
            } else {
                qvVar.a(g17);
            }
            qvVar.a(this.N, this.O);
            this.f132275t.f132055v = true;
        }
    }

    private void f() {
        int i17;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qw qwVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f132275t;
        if (neVar == null || !this.T) {
            return;
        }
        this.T = false;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26079x1291dc9e.Text text = this.H;
        if (text == null && (qwVar = this.f132270d) != null) {
            qwVar.a();
            this.f132270d = null;
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = neVar.f132039f;
        if (text != null) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qw qwVar2 = this.f132270d;
            if (qwVar2 != null) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar2 = qwVar2.f132620b;
                if (tkVar2 == null || (i17 = qwVar2.f132619a) <= 0) {
                    return;
                }
                tkVar2.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass58(i17, text));
                return;
            }
            java.util.List<com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df> list = this.f132273r;
            if (list == null || list.size() < 2) {
                return;
            }
            java.util.List<com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df> list2 = this.f132273r;
            this.f132270d = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qw(tkVar, (com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df[]) list2.toArray(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df[list2.size()]), this.H);
        }
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fy g() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fy fyVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fy();
        if (this.f132275t == null) {
            return fyVar;
        }
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e c26010x4177761e = this.A;
        if (c26010x4177761e != null && c26010x4177761e.m99321x981c205a() != null) {
            fyVar.f131058y = this.A.m99321x981c205a().mo36721xbe9ba820();
        }
        com.tencent.mapsdk.internal.pr.b c17 = c(this.f132273r);
        fyVar.f131056w = this.f132276u;
        fyVar.I = this.Q;
        fyVar.a(this.f132273r);
        fyVar.N = this.f132280y;
        if (this.G == 0) {
            int a17 = a(this.f132275t.mo36630x76847179(), this.A);
            if (a17 > 0) {
                float f17 = this.f132204e;
                float f18 = a17;
                if (f17 > f18) {
                    f17 = f18;
                }
                fyVar.f131057x = f17;
            } else {
                fyVar.f131057x = this.f132204e;
            }
        } else {
            fyVar.f131057x = this.f132204e;
        }
        if (this.f132281z == com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26079x1291dc9e.ColorType.LINE_COLOR_ARGB) {
            fyVar.f131055v = true;
            float f19 = this.f132274s * 2.0f;
            float f27 = this.f132204e;
            if (f19 >= f27) {
                this.f132274s = f27 / 3.0f;
            }
            fyVar.f131054u = this.f132274s;
        }
        int[] iArr = this.f132279x;
        if (this.f132267J) {
            fyVar.a(c17.f132287a);
            if (this.f132274s <= 0.0f || iArr == null || iArr.length <= 0) {
                fyVar.b(c17.f132288b);
            } else {
                fyVar.a(c17.f132288b, iArr);
            }
        } else {
            fyVar.a(new int[]{0});
            if (this.f132274s <= 0.0f || iArr == null || iArr.length <= 0) {
                fyVar.b(new int[]{this.f132206g});
            } else {
                fyVar.a(new int[]{this.f132206g}, new int[]{iArr[0]});
            }
        }
        fyVar.A = this.D;
        fyVar.C = this.G;
        fyVar.G = (int) this.f132207h;
        fyVar.D = this.I;
        fyVar.E = this.L;
        fyVar.f131059z = this.M;
        fyVar.B = this.f132267J;
        fyVar.H = this.P;
        fyVar.b(this.R);
        fyVar.M = this.f132211l;
        fyVar.O = this.Z;
        return fyVar;
    }

    private boolean h() {
        boolean z17 = false;
        int i17 = 0;
        z17 = false;
        if (this.f132275t == null) {
            return false;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.im imVar = this.C;
        if (imVar != null && imVar.f131439d) {
            imVar.b();
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.im imVar2 = this.C;
            if (imVar2 instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.io) {
                this.f132273r.clear();
                java.util.List<com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df> list = this.f132273r;
                java.util.List<com.tencent.mapsdk.internal.pr.a> list2 = this.f132272q;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                if (list2 != null && list2.size() >= 2) {
                    float f17 = this.E.f132285a;
                    float f18 = this.K - f17;
                    float f19 = this.F;
                    float f27 = f18 * f19;
                    float f28 = f17 - (f17 * f19);
                    float f29 = f17 + f27;
                    com.tencent.mapsdk.internal.pr.a aVar = null;
                    while (true) {
                        if (i17 >= list2.size()) {
                            break;
                        }
                        com.tencent.mapsdk.internal.pr.a aVar2 = list2.get(i17);
                        float f37 = aVar2.f132285a;
                        if (f37 > f28 && f37 < f29) {
                            if (aVar != null) {
                                float f38 = aVar.f132285a;
                                if (f38 < f28) {
                                    com.tencent.mapsdk.internal.pr.a a17 = a(aVar, aVar2, (f28 - f38) / (f37 - f38));
                                    a17.f132286b = aVar.f132286b;
                                    arrayList.add(a17);
                                }
                            }
                            arrayList.add(aVar2);
                        } else if (f37 > f29) {
                            if (aVar != null) {
                                float f39 = aVar.f132285a;
                                if (f39 < f29) {
                                    com.tencent.mapsdk.internal.pr.a a18 = a(aVar, aVar2, (f29 - f39) / (f37 - f39));
                                    a18.f132286b = aVar2.f132286b;
                                    arrayList.add(a18);
                                }
                            }
                        } else if (java.lang.Float.compare(f37, f28) == 0 || java.lang.Float.compare(aVar2.f132285a, f29) == 0) {
                            arrayList.add(aVar2);
                        }
                        i17++;
                        aVar = aVar2;
                    }
                }
                list.addAll(arrayList);
                if (this.f132273r.size() >= 2) {
                    d();
                }
            } else if (imVar2 instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.il) {
                d();
            }
            z17 = true;
            z17 = true;
            this.f132275t.f132055v = true;
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.im imVar3 = this.C;
            if (imVar3.f131440e) {
                imVar3.a((com.tencent.mapsdk.internal.im.b) null);
                this.C = null;
            }
        }
        return z17;
    }

    private int[] i() {
        return this.f132279x;
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.aq j() {
        return this;
    }

    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26078x2558e5e0 k() {
        return this.f132271p;
    }

    private float l() {
        return this.D;
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qv m() {
        return this.f132269b;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26078x2558e5e0
    /* renamed from: addTurnArrow */
    public final void mo36489xeeb895eb(int i17, int i18) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qv qvVar = this.f132269b;
        if (qvVar == null) {
            return;
        }
        qvVar.d();
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qv qvVar2 = this.f132269b;
        com.tencent.mapsdk.internal.qv.a aVar = new com.tencent.mapsdk.internal.qv.a();
        qvVar2.f132610t = aVar;
        aVar.f132617a = i17;
        aVar.f132618b = i18;
        qvVar2.w();
        d();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26078x2558e5e0
    /* renamed from: appendPoint */
    public final void mo36490x8ebdf696(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26... c26041x873d1d26Arr) {
        if (this.W == null) {
            this.W = new java.util.ArrayList();
        }
        this.W.addAll(java.util.Arrays.asList(c26041x873d1d26Arr));
        a(this.W);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26078x2558e5e0
    /* renamed from: appendPoints */
    public final void mo36491x4900dc9d(java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26> list) {
        if (this.W == null) {
            this.W = new java.util.ArrayList();
        }
        this.W.addAll(list);
        a(this.W);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26078x2558e5e0
    /* renamed from: arrowSpacing */
    public final void mo36492x7f7d1bfa(int i17) {
        if (this.Q != i17) {
            this.Q = i17;
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26079x1291dc9e c26079x1291dc9e = this.V;
            if (c26079x1291dc9e != null) {
                c26079x1291dc9e.m99865x7f7d1bfa(i17);
            }
            w();
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26078x2558e5e0
    /* renamed from: cleanTurnArrow */
    public final void mo36493xd1bb3543() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qv qvVar = this.f132269b;
        if (qvVar == null) {
            return;
        }
        qvVar.d();
        d();
    }

    /* renamed from: equals */
    public final boolean m36906xb2c87fbf(java.lang.Object obj) {
        if (obj != null && (obj instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pr)) {
            return android.text.TextUtils.equals(y(), ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pr) obj).y());
        }
        return false;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26078x2558e5e0
    /* renamed from: eraseColor */
    public final void mo36494x376f645d(int i17) {
        if (this.f132280y != i17) {
            this.f132280y = i17;
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26079x1291dc9e c26079x1291dc9e = this.V;
            if (c26079x1291dc9e != null) {
                c26079x1291dc9e.m99875x376f645d(i17);
            }
            w();
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26078x2558e5e0
    /* renamed from: eraseTo */
    public final void mo36495xa6ea8bc1(int i17, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26) {
        a(i17, c26041x873d1d26);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au
    public final /* bridge */ /* synthetic */ com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ao f_() {
        return this;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26078x2558e5e0
    /* renamed from: getColor */
    public final int mo36496x7444d5ad() {
        return m36894x4b6e32d5();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26078x2558e5e0
    /* renamed from: getColors */
    public final int[][] mo36497x1455e066() {
        int[] iArr;
        int[] iArr2 = this.f132277v;
        if (iArr2 == null || (iArr = this.f132278w) == null) {
            return null;
        }
        int[][] iArr3 = (int[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Integer.TYPE, 2, java.lang.Math.max(iArr2.length, iArr.length));
        iArr3[0] = this.f132277v;
        iArr3[1] = this.f132278w;
        return iArr3;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25979x32e3ffb8
    /* renamed from: getGroupBounds */
    public final java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25979x32e3ffb8<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ey>> mo36417xe9d104de() {
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        arrayList.add(this.f132269b);
        return arrayList;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26078x2558e5e0
    /* renamed from: getPattern */
    public final java.util.List<java.lang.Integer> mo36498xea6275a() {
        return this.R;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26078x2558e5e0
    /* renamed from: getPoints */
    public final java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26> mo36499x2a837fd9() {
        return this.W;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26078x2558e5e0
    /* renamed from: getPolylineOptions */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26079x1291dc9e mo36500x3260f688() {
        return this.V;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26078x2558e5e0
    /* renamed from: getText */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26079x1291dc9e.Text mo36501xfb85ada3() {
        return this.H;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26078x2558e5e0
    /* renamed from: getVisibleRect */
    public final android.graphics.Rect mo36502xe19d7c40() {
        int i17;
        android.graphics.Rect rect;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qv qvVar = this.f132269b;
        java.util.ArrayList<com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df> arrayList = qvVar.f132604b.f131045l;
        if (arrayList != null && !arrayList.isEmpty() && (i17 = qvVar.f132607q) >= 0 && i17 < arrayList.size()) {
            java.util.List<com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df> subList = arrayList.subList(qvVar.f132607q, arrayList.size());
            if (subList == null || subList.isEmpty()) {
                rect = null;
            } else {
                com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df = subList.get(0);
                int m35332x962aa94a = c4247x704e24df.m35332x962aa94a();
                int m35332x962aa94a2 = c4247x704e24df.m35332x962aa94a();
                int m35331xbc3301f3 = c4247x704e24df.m35331xbc3301f3();
                int m35331xbc3301f32 = c4247x704e24df.m35331xbc3301f3();
                int size = subList.size();
                for (int i18 = 0; i18 < size; i18++) {
                    com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df2 = subList.get(i18);
                    if (c4247x704e24df2 != null) {
                        int m35331xbc3301f33 = c4247x704e24df2.m35331xbc3301f3();
                        int m35332x962aa94a3 = c4247x704e24df2.m35332x962aa94a();
                        if (m35332x962aa94a3 < m35332x962aa94a) {
                            m35332x962aa94a = m35332x962aa94a3;
                        } else if (m35332x962aa94a3 > m35332x962aa94a2) {
                            m35332x962aa94a2 = m35332x962aa94a3;
                        }
                        if (m35331xbc3301f33 < m35331xbc3301f32) {
                            m35331xbc3301f32 = m35331xbc3301f33;
                        } else if (m35331xbc3301f33 > m35331xbc3301f3) {
                            m35331xbc3301f3 = m35331xbc3301f33;
                        }
                    }
                }
                rect = new android.graphics.Rect(m35332x962aa94a, m35331xbc3301f3, m35332x962aa94a2, m35331xbc3301f32);
            }
            if (rect != null) {
                qvVar.f132604b.F = rect;
            }
        }
        return qvVar.f132604b.F;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26078x2558e5e0
    /* renamed from: getWidth */
    public final float mo36503x755bd410() {
        return this.f132204e;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po
    public final void h_() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qv qvVar = this.f132269b;
        if (qvVar != null) {
            qvVar.mo36414xc84af884();
            this.f132269b = null;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qw qwVar = this.f132270d;
        if (qwVar != null) {
            qwVar.a();
            this.f132270d = null;
        }
        java.util.List<com.tencent.mapsdk.internal.pr.a> list = this.f132272q;
        if (list != null) {
            list.clear();
        }
        java.util.List<com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df> list2 = this.f132273r;
        if (list2 != null) {
            list2.clear();
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25998xe695d027
    /* renamed from: handleOnTap */
    public final boolean mo36421x5820b3fc() {
        return true;
    }

    /* renamed from: hashCode */
    public final int m36907x8cdac1b() {
        return y().hashCode();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26078x2558e5e0
    /* renamed from: isAboveMaskLayer */
    public final boolean mo36504x558f9672() {
        return this.I;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26078x2558e5e0
    /* renamed from: isGradientEnable */
    public final boolean mo36505x99136c9d() {
        return this.Z;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po
    public final void j_() {
        int i17;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qw qwVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.im imVar;
        this.Y = java.lang.Thread.currentThread().getName();
        if (this.f132275t != null && mo36423xf94337e8()) {
            if (v()) {
                if (this.f132272q.size() >= 2) {
                    this.f132273r.clear();
                    this.f132273r.addAll(this.f132272q);
                }
                d();
            }
            if (this.f132275t != null && (imVar = this.C) != null && imVar.f131439d) {
                imVar.b();
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.im imVar2 = this.C;
                if (imVar2 instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.io) {
                    this.f132273r.clear();
                    java.util.List<com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df> list = this.f132273r;
                    java.util.List<com.tencent.mapsdk.internal.pr.a> list2 = this.f132272q;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    if (list2 != null && list2.size() >= 2) {
                        float f17 = this.E.f132285a;
                        float f18 = this.K - f17;
                        float f19 = this.F;
                        float f27 = f18 * f19;
                        float f28 = f17 - (f17 * f19);
                        float f29 = f17 + f27;
                        int i18 = 0;
                        com.tencent.mapsdk.internal.pr.a aVar = null;
                        while (true) {
                            if (i18 >= list2.size()) {
                                break;
                            }
                            com.tencent.mapsdk.internal.pr.a aVar2 = list2.get(i18);
                            float f37 = aVar2.f132285a;
                            if (f37 > f28 && f37 < f29) {
                                if (aVar != null) {
                                    float f38 = aVar.f132285a;
                                    if (f38 < f28) {
                                        com.tencent.mapsdk.internal.pr.a a17 = a(aVar, aVar2, (f28 - f38) / (f37 - f38));
                                        a17.f132286b = aVar.f132286b;
                                        arrayList.add(a17);
                                    }
                                }
                                arrayList.add(aVar2);
                            } else if (f37 > f29) {
                                if (aVar != null) {
                                    float f39 = aVar.f132285a;
                                    if (f39 < f29) {
                                        com.tencent.mapsdk.internal.pr.a a18 = a(aVar, aVar2, (f29 - f39) / (f37 - f39));
                                        a18.f132286b = aVar2.f132286b;
                                        arrayList.add(a18);
                                    }
                                }
                            } else if (java.lang.Float.compare(f37, f28) == 0 || java.lang.Float.compare(aVar2.f132285a, f29) == 0) {
                                arrayList.add(aVar2);
                            }
                            i18++;
                            aVar = aVar2;
                        }
                    }
                    list.addAll(arrayList);
                    if (this.f132273r.size() >= 2) {
                        d();
                    }
                } else if (imVar2 instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.il) {
                    d();
                }
                this.f132275t.f132055v = true;
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.im imVar3 = this.C;
                if (imVar3.f131440e) {
                    imVar3.a((com.tencent.mapsdk.internal.im.b) null);
                    this.C = null;
                }
            }
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f132275t;
            if (neVar == null || !this.T) {
                return;
            }
            this.T = false;
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26079x1291dc9e.Text text = this.H;
            if (text == null && (qwVar = this.f132270d) != null) {
                qwVar.a();
                this.f132270d = null;
                return;
            }
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = neVar.f132039f;
            if (text != null) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qw qwVar2 = this.f132270d;
                if (qwVar2 != null) {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar2 = qwVar2.f132620b;
                    if (tkVar2 == null || (i17 = qwVar2.f132619a) <= 0) {
                        return;
                    }
                    tkVar2.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass58(i17, text));
                    return;
                }
                java.util.List<com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df> list3 = this.f132273r;
                if (list3 == null || list3.size() < 2) {
                    return;
                }
                java.util.List<com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df> list4 = this.f132273r;
                this.f132270d = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qw(tkVar, (com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df[]) list4.toArray(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df[list4.size()]), this.H);
            }
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.aq
    public final android.graphics.Rect l_() {
        int i17;
        android.graphics.Rect rect;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qv qvVar = this.f132269b;
        java.util.ArrayList<com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df> arrayList = qvVar.f132604b.f131045l;
        if (arrayList != null && !arrayList.isEmpty() && (i17 = qvVar.f132607q) >= 0 && i17 < arrayList.size()) {
            java.util.List<com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df> subList = arrayList.subList(qvVar.f132607q, arrayList.size());
            if (subList == null || subList.isEmpty()) {
                rect = null;
            } else {
                com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df = subList.get(0);
                int m35332x962aa94a = c4247x704e24df.m35332x962aa94a();
                int m35332x962aa94a2 = c4247x704e24df.m35332x962aa94a();
                int m35331xbc3301f3 = c4247x704e24df.m35331xbc3301f3();
                int m35331xbc3301f32 = c4247x704e24df.m35331xbc3301f3();
                int size = subList.size();
                for (int i18 = 0; i18 < size; i18++) {
                    com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df2 = subList.get(i18);
                    if (c4247x704e24df2 != null) {
                        int m35331xbc3301f33 = c4247x704e24df2.m35331xbc3301f3();
                        int m35332x962aa94a3 = c4247x704e24df2.m35332x962aa94a();
                        if (m35332x962aa94a3 < m35332x962aa94a) {
                            m35332x962aa94a = m35332x962aa94a3;
                        } else if (m35332x962aa94a3 > m35332x962aa94a2) {
                            m35332x962aa94a2 = m35332x962aa94a3;
                        }
                        if (m35331xbc3301f33 < m35331xbc3301f32) {
                            m35331xbc3301f32 = m35331xbc3301f33;
                        } else if (m35331xbc3301f33 > m35331xbc3301f3) {
                            m35331xbc3301f3 = m35331xbc3301f33;
                        }
                    }
                }
                rect = new android.graphics.Rect(m35332x962aa94a, m35331xbc3301f3, m35332x962aa94a2, m35331xbc3301f32);
            }
            if (rect != null) {
                qvVar.f132604b.F = rect;
            }
        }
        return qvVar.f132604b.F;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25998xe695d027
    /* renamed from: onTap */
    public final boolean mo36424x64f7944(float f17, float f18) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qv qvVar;
        if (this.f132275t == null || !mo36423xf94337e8() || (qvVar = this.f132269b) == null) {
            return false;
        }
        return qvVar.mo36424x64f7944(f17, f18);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ev
    public final void p() {
        d();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26078x2558e5e0
    /* renamed from: pattern */
    public final void mo36506xd0d8eb90(java.util.List<java.lang.Integer> list) {
        d(list);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26078x2558e5e0
    /* renamed from: setAboveMaskLayer */
    public final void mo36507x657243aa(boolean z17) {
        if (this.I != z17) {
            this.I = z17;
            w();
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25978xa8b67ebe
    /* renamed from: setAnimation */
    public final void mo36459x9e6c4d42(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26003xba1d3b64 interfaceC26003xba1d3b64) {
        if ((interfaceC26003xba1d3b64 instanceof com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26002x1d28ffe6) || (interfaceC26003xba1d3b64 instanceof com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26020xed7a79b1) || (interfaceC26003xba1d3b64 instanceof com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26025xbcba4c6f) || (interfaceC26003xba1d3b64 instanceof com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26028x4012be48)) {
            this.U = interfaceC26003xba1d3b64;
        } else {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c("Unsupported animation, only AlphaAnimation and EmergeAnimation allowed.");
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26078x2558e5e0
    /* renamed from: setArrow */
    public final void mo36508x52b834c7(boolean z17) {
        if (this.f132276u != z17) {
            this.f132276u = z17;
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26079x1291dc9e c26079x1291dc9e = this.V;
            if (c26079x1291dc9e != null) {
                c26079x1291dc9e.m99864x58c7409(z17);
            }
            w();
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26078x2558e5e0
    /* renamed from: setBorderColors */
    public final void mo36509xced6da3e(int[] iArr) {
        if (this.f132279x != iArr) {
            this.f132279x = iArr;
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26079x1291dc9e c26079x1291dc9e = this.V;
            if (c26079x1291dc9e != null) {
                c26079x1291dc9e.m99868x379b4cbc(iArr);
            }
            w();
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26078x2558e5e0
    /* renamed from: setColor */
    public final void mo36510x52d2f021(int i17) {
        m36901xe1d3a649(i17);
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26079x1291dc9e c26079x1291dc9e = this.V;
        if (c26079x1291dc9e != null) {
            c26079x1291dc9e.m99871x5a72f63(i17);
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26078x2558e5e0
    /* renamed from: setColorTexture */
    public final void mo36512xc9bc45ba(java.lang.String str) {
        mo36511xc9bc45ba(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26011x93ded50c.m99334x3281d66(str));
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26078x2558e5e0
    /* renamed from: setColors */
    public final void mo36513x78b1472(int[] iArr, int[] iArr2) {
        this.f132277v = iArr;
        this.f132278w = iArr2;
        this.f132281z = a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26079x1291dc9e.ColorType.LINE_COLOR_NONE);
        this.f132267J = true;
        w();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26078x2558e5e0
    /* renamed from: setEraseable */
    public final void mo36514xf23d96be(boolean z17) {
        this.L = z17;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qv qvVar = this.f132269b;
        if (qvVar != null) {
            qvVar.f132604b.E = z17;
        }
        w();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26078x2558e5e0
    /* renamed from: setGradientEnable */
    public final void mo36515xa8f619d5(boolean z17) {
        if (this.G == 0 && this.f132267J) {
            this.Z = z17;
            w();
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26078x2558e5e0
    /* renamed from: setPoints */
    public final void mo36516x1db8b3e5(java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26> list) {
        a(list);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26078x2558e5e0
    /* renamed from: setPolylineOptions */
    public final void mo36517x69378ffc(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26079x1291dc9e c26079x1291dc9e) {
        if (this.f132275t == null || c26079x1291dc9e == null) {
            return;
        }
        this.f132214o = true;
        this.V = c26079x1291dc9e;
        if (c26079x1291dc9e.m99895x755bd410() == -1.0f) {
            m36902xe2eaa4ac(this.S * 9.0f);
        } else {
            m36902xe2eaa4ac(c26079x1291dc9e.m99895x755bd410());
        }
        m36901xe1d3a649(c26079x1291dc9e.m99882x7444d5ad());
        mo36429x2cb3cb7a(c26079x1291dc9e.m99896x397e976e());
        mo36427xcd1079b0(c26079x1291dc9e.m99905xf94337e8());
        this.D = c26079x1291dc9e.m99876x742757a8();
        w();
        mo36508x52b834c7(c26079x1291dc9e.m99901x7a7520ff());
        mo36511xc9bc45ba(c26079x1291dc9e.m99883x93734aae());
        c(c26079x1291dc9e.m99889x48581f08());
        d(c26079x1291dc9e.m99891xea6275a());
        this.f132274s = c26079x1291dc9e.m99881x602cbc4();
        m36899xe6a688a0(c26079x1291dc9e.m99902xd12298d8());
        this.f132279x = c26079x1291dc9e.m99880x988ddf32();
        this.b_ = c26079x1291dc9e.m99887x1d644597();
        this.G = c26079x1291dc9e.m99890xc2b3d6c4();
        this.f132211l = c26079x1291dc9e.m99888x74bf41ce();
        this.f132280y = c26079x1291dc9e.m99886x25b01c53();
        if (c26079x1291dc9e.m99900x3383e59d() && this.f132211l == 0) {
            this.f132211l = 2;
        }
        a(c26079x1291dc9e.m99892x2a837fd9());
        if (c26079x1291dc9e.m99879x3dc9f48() != null) {
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e m99879x3dc9f48 = c26079x1291dc9e.m99879x3dc9f48();
            if (m99879x3dc9f48.m99320x12501425(this.X.I()) != null) {
                this.P = m99879x3dc9f48.m99321x981c205a().mo36721xbe9ba820();
            }
        }
        this.Q = c26079x1291dc9e.m99878xe06fae70();
        this.f132267J = c26079x1291dc9e.m99904xb9a85b6a();
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26003xba1d3b64 m99877x42188cce = c26079x1291dc9e.m99877x42188cce();
        if (m99877x42188cce != null) {
            a(((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hv) m99877x42188cce).f131394a);
        }
        int[][] m99885x1455e066 = c26079x1291dc9e.m99885x1455e066();
        if (m99885x1455e066 != null && m99885x1455e066.length == 2) {
            int[] iArr = m99885x1455e066[0];
            int[] iArr2 = m99885x1455e066[1];
            if (iArr != null && iArr2 != null) {
                mo36513x78b1472(iArr, iArr2);
            }
        }
        this.f132281z = a(c26079x1291dc9e.m99884x75803a87());
        mo36518x765074af(c26079x1291dc9e.m99893xfb85ada3());
        mo36515xa8f619d5(c26079x1291dc9e.m99903x99136c9d());
        x();
        d();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26078x2558e5e0
    /* renamed from: setText */
    public final void mo36518x765074af(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26079x1291dc9e.Text text) {
        if (this.H != text) {
            this.H = text;
            this.T = true;
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25999x7f0a8852
    /* renamed from: setVisible */
    public final void mo36427xcd1079b0(boolean z17) {
        super.mo36427xcd1079b0(z17);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qv qvVar = this.f132269b;
        if (qvVar != null) {
            qvVar.mo36427xcd1079b0(z17);
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26078x2558e5e0
    /* renamed from: setWidth */
    public final void mo36519x53e9ee84(float f17) {
        if (f17 < 0.0f) {
            f17 = 1.0f;
        }
        if (f17 > 128.0f) {
            f17 = 128.0f;
        }
        m36902xe2eaa4ac(f17);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25978xa8b67ebe
    /* renamed from: startAnimation */
    public final boolean mo36482x2d8c4542() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hv a17;
        if (this.U == null || (a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.iu.a(this.f132275t.O(), this.U)) == null) {
            return false;
        }
        a(a17.f131394a);
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ex
    public final void u() {
        super.u();
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qv qvVar = this.f132269b;
        if (qvVar != null) {
            qvVar.u();
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po
    public final void w() {
        super.w();
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qv qvVar = this.f132269b;
        if (qvVar != null) {
            qvVar.w();
        }
    }

    private com.tencent.mapsdk.internal.pr.b c(java.util.List<com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df> list) {
        int[] iArr;
        int[] iArr2 = this.f132277v;
        if (iArr2 != null && (iArr = this.f132278w) != null && list != null && iArr2.length != 0 && iArr.length != 0 && !list.isEmpty()) {
            java.util.TreeSet treeSet = new java.util.TreeSet(new java.util.Comparator<java.lang.Integer>() { // from class: com.tencent.mapsdk.internal.pr.2
                private static int a(java.lang.Integer num, java.lang.Integer num2) {
                    return num.compareTo(num2);
                }

                @Override // java.util.Comparator
                public final /* synthetic */ int compare(java.lang.Integer num, java.lang.Integer num2) {
                    return num.compareTo(num2);
                }
            });
            for (int i17 : this.f132278w) {
                if (i17 >= 0 && i17 < list.size()) {
                    treeSet.add(java.lang.Integer.valueOf(i17));
                }
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i18 : this.f132277v) {
                arrayList.add(java.lang.Integer.valueOf(i18));
            }
            if (treeSet.isEmpty()) {
                com.tencent.mapsdk.internal.pr.b bVar = new com.tencent.mapsdk.internal.pr.b(1);
                bVar.a(0, ((java.lang.Integer) arrayList.get(0)).intValue());
                return bVar;
            }
            java.lang.Integer[] numArr = (java.lang.Integer[]) treeSet.toArray(new java.lang.Integer[0]);
            if (numArr[0].intValue() != 0) {
                treeSet.add(0);
                arrayList.add(0, java.lang.Integer.valueOf(this.f132277v[0]));
            }
            if (numArr[numArr.length - 1].intValue() != list.size() - 1) {
                treeSet.add(java.lang.Integer.valueOf(list.size() - 1));
                if (numArr.length > this.f132277v.length) {
                    int size = arrayList.size() - 1;
                    int[] iArr3 = this.f132277v;
                    arrayList.add(size, java.lang.Integer.valueOf(iArr3[iArr3.length - 1]));
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(treeSet);
            int size2 = arrayList2.size();
            com.tencent.mapsdk.internal.pr.b bVar2 = new com.tencent.mapsdk.internal.pr.b(size2);
            for (int i19 = 0; i19 < size2; i19++) {
                if (i19 > arrayList.size() - 1) {
                    bVar2.a(((java.lang.Integer) arrayList2.get(i19)).intValue(), ((java.lang.Integer) arrayList.get(arrayList.size() - 1)).intValue());
                } else {
                    bVar2.a(((java.lang.Integer) arrayList2.get(i19)).intValue(), ((java.lang.Integer) arrayList.get(i19)).intValue());
                }
            }
            return bVar2;
        }
        int i27 = this.f132206g;
        if (this.f132281z == com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26079x1291dc9e.ColorType.LINE_COLOR_TEXTURE) {
            i27 = c(i27);
        }
        com.tencent.mapsdk.internal.pr.b bVar3 = new com.tencent.mapsdk.internal.pr.b(1);
        bVar3.a(0, i27);
        return bVar3;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26078x2558e5e0
    /* renamed from: setColorTexture */
    public final void mo36511xc9bc45ba(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e c26010x4177761e) {
        if (this.f132275t == null || c26010x4177761e == null || c26010x4177761e.m99321x981c205a() == null) {
            return;
        }
        this.A = c26010x4177761e;
        c26010x4177761e.m99320x12501425(this.f132275t.mo36630x76847179());
        this.f132281z = com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26079x1291dc9e.ColorType.LINE_COLOR_TEXTURE;
        w();
    }

    /* loaded from: classes13.dex */
    public static class a extends com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df {

        /* renamed from: a, reason: collision with root package name */
        float f132285a;

        /* renamed from: b, reason: collision with root package name */
        int f132286b;

        public a() {
            this.f132285a = 0.0f;
            this.f132286b = 0;
        }

        @Override // com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df
        /* renamed from: toString */
        public final java.lang.String mo35338x9616526c() {
            return super.mo35338x9616526c() + "," + this.f132285a;
        }

        public a(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df) {
            super(c4247x704e24df);
            this.f132285a = 0.0f;
            this.f132286b = 0;
        }
    }

    private void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e c26010x4177761e) {
        if (c26010x4177761e.m99320x12501425(this.X.I()) != null) {
            this.P = c26010x4177761e.m99321x981c205a().mo36721xbe9ba820();
        }
    }

    private java.util.ArrayList<com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df> b(java.util.List<com.tencent.mapsdk.internal.pr.a> list) {
        java.util.ArrayList<com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df> arrayList = new java.util.ArrayList<>();
        if (list != null && list.size() >= 2) {
            float f17 = this.E.f132285a;
            float f18 = this.K - f17;
            float f19 = this.F;
            float f27 = f18 * f19;
            float f28 = f17 - (f17 * f19);
            float f29 = f17 + f27;
            com.tencent.mapsdk.internal.pr.a aVar = null;
            int i17 = 0;
            while (true) {
                if (i17 >= list.size()) {
                    break;
                }
                com.tencent.mapsdk.internal.pr.a aVar2 = list.get(i17);
                float f37 = aVar2.f132285a;
                if (f37 > f28 && f37 < f29) {
                    if (aVar != null) {
                        float f38 = aVar.f132285a;
                        if (f38 < f28) {
                            com.tencent.mapsdk.internal.pr.a a17 = a(aVar, aVar2, (f28 - f38) / (f37 - f38));
                            a17.f132286b = aVar.f132286b;
                            arrayList.add(a17);
                        }
                    }
                    arrayList.add(aVar2);
                } else if (f37 > f29) {
                    if (aVar != null) {
                        float f39 = aVar.f132285a;
                        if (f39 < f29) {
                            com.tencent.mapsdk.internal.pr.a a18 = a(aVar, aVar2, (f29 - f39) / (f37 - f39));
                            a18.f132286b = aVar2.f132286b;
                            arrayList.add(a18);
                        }
                    }
                } else if (java.lang.Float.compare(f37, f28) == 0 || java.lang.Float.compare(aVar2.f132285a, f29) == 0) {
                    arrayList.add(aVar2);
                }
                i17++;
                aVar = aVar2;
            }
        }
        return arrayList;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26078x2558e5e0, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25978xa8b67ebe
    /* renamed from: startAnimation */
    public final void mo36481x2d8c4542(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26003xba1d3b64 interfaceC26003xba1d3b64) {
        mo36459x9e6c4d42(interfaceC26003xba1d3b64);
        mo36482x2d8c4542();
    }

    private void a(int i17) {
        this.Q = i17;
    }

    private void d(java.util.List<java.lang.Integer> list) {
        this.R = list;
        w();
    }

    private void a(java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26> list) {
        int size;
        this.W = list;
        if (list != null && (size = list.size()) > 0) {
            this.K = 0.0f;
            this.f132272q.clear();
            com.tencent.mapsdk.internal.pr.a aVar = null;
            for (int i17 = 0; i17 < size; i17++) {
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26 = list.get(i17);
                if (c26041x873d1d26 != null) {
                    com.tencent.mapsdk.internal.pr.a aVar2 = new com.tencent.mapsdk.internal.pr.a(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df.m35328x3017aa(c26041x873d1d26));
                    if (aVar != null) {
                        float hypot = this.K + ((float) (java.lang.Math.hypot(aVar2.m35331xbc3301f3() - aVar.m35331xbc3301f3(), aVar2.m35332x962aa94a() - aVar.m35332x962aa94a()) + 0.0d));
                        this.K = hypot;
                        aVar2.f132285a = hypot;
                        aVar2.f132286b = aVar.f132286b + 1;
                    }
                    this.f132272q.add(aVar2);
                    aVar = aVar2;
                }
            }
            w();
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.aq
    public final void b(boolean z17) {
        this.L = z17;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qv qvVar = this.f132269b;
        if (qvVar != null) {
            qvVar.f132604b.E = z17;
        }
        w();
    }

    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26079x1291dc9e.ColorType a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26079x1291dc9e.ColorType colorType) {
        if (colorType != com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26079x1291dc9e.ColorType.LINE_COLOR_NONE) {
            return colorType;
        }
        int[] iArr = this.f132277v;
        if (iArr != null && iArr.length > 0) {
            int length = iArr.length;
            for (int i17 = 0; i17 < length; i17++) {
                int i18 = this.f132277v[i17];
                if (i18 < 0 || i18 >= 12) {
                    return com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26079x1291dc9e.ColorType.LINE_COLOR_ARGB;
                }
            }
            return com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26079x1291dc9e.ColorType.LINE_COLOR_TEXTURE;
        }
        int i19 = this.f132206g;
        return (i19 < 0 || i19 >= 12) ? com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26079x1291dc9e.ColorType.LINE_COLOR_ARGB : com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26079x1291dc9e.ColorType.LINE_COLOR_TEXTURE;
    }

    private void b(float f17) {
        this.f132274s = f17;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ex
    public final void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26034x15ff5647 c26034x15ff5647) {
        super.a(c26034x15ff5647);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qv qvVar = this.f132269b;
        if (qvVar != null) {
            qvVar.a(c26034x15ff5647);
        }
    }

    private void c(boolean z17) {
        this.M = z17;
        w();
    }

    private static float a(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df, com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df2) {
        if (c4247x704e24df2 == null) {
            return 0.0f;
        }
        return (float) (java.lang.Math.hypot(c4247x704e24df.m35331xbc3301f3() - c4247x704e24df2.m35331xbc3301f3(), c4247x704e24df.m35332x962aa94a() - c4247x704e24df2.m35332x962aa94a()) + 0.0d);
    }

    private static com.tencent.mapsdk.internal.pr.a a(com.tencent.mapsdk.internal.pr.a aVar, com.tencent.mapsdk.internal.pr.a aVar2, float f17) {
        com.tencent.mapsdk.internal.pr.a aVar3 = new com.tencent.mapsdk.internal.pr.a();
        int m35332x962aa94a = aVar2.m35332x962aa94a() - aVar.m35332x962aa94a();
        aVar3.m35334xea574fff(aVar.m35331xbc3301f3() + java.lang.Math.round((aVar2.m35331xbc3301f3() - aVar.m35331xbc3301f3()) * f17));
        aVar3.m35335x2c901cbe(aVar.m35332x962aa94a() + java.lang.Math.round(m35332x962aa94a * f17));
        float f18 = aVar.f132285a;
        aVar3.f132285a = f18 + ((aVar2.f132285a - f18) * f17);
        return aVar3;
    }

    private static float a(com.tencent.mapsdk.internal.pr.a aVar, com.tencent.mapsdk.internal.pr.a aVar2, com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df, com.tencent.mapsdk.internal.pr.a aVar3) {
        double hypot;
        int m35332x962aa94a = aVar.m35332x962aa94a();
        int m35331xbc3301f3 = aVar.m35331xbc3301f3();
        int m35332x962aa94a2 = aVar2.m35332x962aa94a();
        int m35331xbc3301f32 = aVar2.m35331xbc3301f3();
        int m35332x962aa94a3 = c4247x704e24df.m35332x962aa94a();
        int i17 = m35332x962aa94a2 - m35332x962aa94a;
        int i18 = m35332x962aa94a3 - m35332x962aa94a;
        int i19 = m35331xbc3301f32 - m35331xbc3301f3;
        int m35331xbc3301f33 = c4247x704e24df.m35331xbc3301f3() - m35331xbc3301f3;
        float f17 = (i17 * i18) + (i19 * m35331xbc3301f33);
        if (f17 <= 0.0f) {
            aVar3.m35334xea574fff(aVar.m35331xbc3301f3());
            aVar3.m35335x2c901cbe(aVar.m35332x962aa94a());
            aVar3.f132285a = aVar.f132285a;
            hypot = java.lang.Math.hypot(i18, m35331xbc3301f33);
        } else {
            double d17 = (i17 * i17) + (i19 * i19);
            double d18 = f17;
            if (d18 >= d17) {
                aVar3.m35334xea574fff(aVar2.m35331xbc3301f3());
                aVar3.m35335x2c901cbe(aVar2.m35332x962aa94a());
                aVar3.f132285a = aVar2.f132285a;
                hypot = java.lang.Math.hypot(m35332x962aa94a3 - m35332x962aa94a2, r14 - m35331xbc3301f32);
            } else {
                float f18 = (float) (d18 / d17);
                aVar3.m35335x2c901cbe(java.lang.Math.round(m35332x962aa94a + (i17 * f18)));
                aVar3.m35334xea574fff(java.lang.Math.round(m35331xbc3301f3 + (i19 * f18)));
                float f19 = aVar.f132285a;
                aVar3.f132285a = f19 + ((aVar2.f132285a - f19) * f18);
                hypot = java.lang.Math.hypot(m35332x962aa94a3 - r0, r14 - r1);
            }
        }
        return (float) hypot;
    }

    private void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26078x2558e5e0 interfaceC26078x2558e5e0) {
        this.f132271p = interfaceC26078x2558e5e0;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.aq
    public final void a(float f17) {
        this.D = f17;
        w();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.aq
    public final void a(int i17, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26) {
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df m35328x3017aa = com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df.m35328x3017aa(c26041x873d1d26);
        if (i17 == -1 || m35328x3017aa == null) {
            return;
        }
        this.N = i17;
        this.O = m35328x3017aa;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qv qvVar = this.f132269b;
        if (qvVar != null) {
            qvVar.a(i17, m35328x3017aa);
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f132275t;
        if (neVar != null) {
            neVar.f132055v = true;
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.aq
    public final void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.im imVar) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.im imVar2 = this.C;
        if (imVar2 != null) {
            imVar2.f131437b = false;
            imVar2.a((com.tencent.mapsdk.internal.im.b) null);
        }
        if (imVar instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.io) {
            a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.io) imVar);
        } else if (imVar instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.il) {
            a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.il) imVar);
        } else {
            this.C = null;
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.aq
    public final void a(boolean z17) {
        c(z17);
    }

    private void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.io ioVar) {
        if (this.f132275t == null) {
            return;
        }
        this.C = ioVar;
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df m35328x3017aa = com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df.m35328x3017aa(ioVar.f131446i);
        com.tencent.mapsdk.internal.pr.a a17 = a(m35328x3017aa);
        this.E = a17;
        if (a17 == null) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d("Error, start point not found. [p=" + m35328x3017aa + "] [offsetGeoPoints=" + this.f132272q + "]");
            return;
        }
        ioVar.a(this.f132268aa);
        ioVar.a((com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df) null, (com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df) null);
        this.f132275t.f132055v = true;
    }

    private void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.il ilVar) {
        this.C = ilVar;
        ilVar.a(this.f132268aa);
        this.C.a((com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df) null, (com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df) null);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f132275t;
        if (neVar != null) {
            neVar.f132055v = true;
        }
    }

    private com.tencent.mapsdk.internal.pr.a a(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df) {
        com.tencent.mapsdk.internal.pr.a aVar = new com.tencent.mapsdk.internal.pr.a();
        java.util.List<com.tencent.mapsdk.internal.pr.a> list = this.f132272q;
        com.tencent.mapsdk.internal.pr.a aVar2 = null;
        if (list != null && list.size() >= 2 && c4247x704e24df != null) {
            com.tencent.mapsdk.internal.pr.a aVar3 = this.f132272q.get(0);
            int i17 = 1;
            float f17 = Float.MAX_VALUE;
            while (i17 < this.f132272q.size()) {
                com.tencent.mapsdk.internal.pr.a aVar4 = this.f132272q.get(i17);
                float a17 = a(aVar3, aVar4, c4247x704e24df, aVar);
                if (a17 < f17) {
                    f17 = a17;
                    aVar2 = aVar;
                    aVar = new com.tencent.mapsdk.internal.pr.a();
                }
                i17++;
                aVar3 = aVar4;
            }
        }
        return aVar2;
    }

    private static int a(android.content.Context context, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e c26010x4177761e) {
        android.graphics.Bitmap m99320x12501425;
        int height;
        if (context == null || c26010x4177761e == null || (m99320x12501425 = c26010x4177761e.m99320x12501425(context)) == null || (height = m99320x12501425.getHeight()) <= 0) {
            return 0;
        }
        return (int) ((java.lang.Math.pow(2.0d, 25.0d) / java.lang.Math.pow(height, 2.0d)) / com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hs.a(context));
    }
}
