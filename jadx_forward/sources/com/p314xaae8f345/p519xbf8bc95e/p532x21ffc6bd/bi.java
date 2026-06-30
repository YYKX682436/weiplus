package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class bi implements com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bb, com.tencent.mapsdk.internal.qa.a, com.tencent.mapsdk.internal.sj.c {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bd f130494a;

    /* renamed from: b, reason: collision with root package name */
    com.tencent.mapsdk.internal.kp.a f130495b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bh f130496c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fa f130497d;

    /* renamed from: f, reason: collision with root package name */
    int f130499f;

    /* renamed from: i, reason: collision with root package name */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a f130502i;

    /* renamed from: j, reason: collision with root package name */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a f130503j;

    /* renamed from: k, reason: collision with root package name */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a f130504k;

    /* renamed from: g, reason: collision with root package name */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a f130500g = null;

    /* renamed from: h, reason: collision with root package name */
    private boolean f130501h = false;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map<java.lang.Class<? extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ni>, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nh<?>> f130498e = new java.util.concurrent.ConcurrentHashMap();

    public bi(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bh bhVar, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bd bdVar) {
        this.f130499f = -1;
        this.f130494a = bdVar;
        this.f130496c = bhVar;
        this.f130499f = ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne) bdVar).K;
    }

    private void d(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ez ezVar) {
        a(ezVar);
    }

    private void e(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ez ezVar) {
        a(ezVar);
    }

    private void f(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ez ezVar) {
        a(ezVar);
    }

    private void c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ez ezVar) {
        a(ezVar);
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bh d() {
        return this.f130496c;
    }

    private void e() {
        java.util.Collection<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nh<?>> values = this.f130498e.values();
        if (values.isEmpty()) {
            return;
        }
        java.util.Iterator<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nh<?>> it = values.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
    }

    private boolean f() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nh<?> nhVar = this.f130498e.get(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr.class);
        if (nhVar != null) {
            return nhVar.f();
        }
        return false;
    }

    public final void b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ez ezVar) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.be beVar = this.f130496c.f130488j;
        if (ezVar != null) {
            synchronized (beVar.f130411a) {
                beVar.f130411a.remove(ezVar);
                beVar.f130412b.add(ezVar);
            }
        }
    }

    public final void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ez ezVar) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bh bhVar = this.f130496c;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.be beVar = bhVar.f130488j;
        synchronized (beVar.f130411a) {
            if (!beVar.f130411a.contains(ezVar)) {
                beVar.f130411a.add(ezVar);
            }
        }
        if (ezVar instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ev) {
            bhVar.a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ev) ezVar);
        }
    }

    @Override // com.tencent.mapsdk.internal.sj.c
    public final void c() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a interfaceC26059x88f1805a = this.f130503j;
        if (interfaceC26059x88f1805a != null) {
            interfaceC26059x88f1805a.mo36427xcd1079b0(true);
        }
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a interfaceC26059x88f1805a2 = this.f130502i;
        if (interfaceC26059x88f1805a2 != null) {
            interfaceC26059x88f1805a2.mo36427xcd1079b0(true);
        }
    }

    private boolean b(float f17, float f18) {
        com.p314xaae8f345.p519xbf8bc95e.p530xb297fa42.jni.p531xc04b6a6a.C4389x448e86b0 a17 = this.f130494a.i().a(f17, f18);
        return a17 != null && a17.f17376x368f3a == 6;
    }

    public final void b() {
        java.util.Collection<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nh<?>> values = this.f130498e.values();
        if (!values.isEmpty()) {
            java.util.Iterator<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nh<?>> it = values.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
        this.f130501h = false;
        this.f130500g = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <O extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ni, L extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ng<O>> L a(O o17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bd bdVar = this.f130494a;
        if (o17 == null || bdVar == null) {
            return null;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nh<?> nhVar = this.f130498e.get(o17.getClass());
        if (nhVar == null) {
            if (o17.getClass() == com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oe.class) {
                nhVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.od(bdVar.i());
            } else if (o17.getClass() == com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.np.class) {
                nhVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.no(bdVar.i());
            } else if (o17.getClass() == com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nl.class) {
                nhVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nm(bdVar.i());
            } else if (o17.getClass() == com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nv.class) {
                nhVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nu(bdVar.i());
            } else if (o17.getClass() == com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ny.class) {
                nhVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nx(bdVar.i());
            } else if (o17.getClass() == com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ob.class) {
                nhVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nz(bdVar.i());
            } else if (o17.getClass() == com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oh.class) {
                nhVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.og(bdVar.i());
            } else if (o17.getClass() == com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ok.class) {
                nhVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oj(bdVar.i());
            } else if (o17.getClass() == com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr.class) {
                nhVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nq(bdVar.i());
            }
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nh<?> nhVar2 = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nh) this.f130498e.put(o17.getClass(), nhVar);
            if (nhVar2 != null) {
                this.f130498e.put(o17.getClass(), nhVar2);
                nhVar = nhVar2;
            }
        }
        return (L) nhVar.b((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nh<?>) o17);
    }

    @Override // com.tencent.mapsdk.internal.sj.c
    public final void b(android.view.View view, android.graphics.Rect rect, boolean z17) {
        android.graphics.Bitmap a17;
        if (view == null || (a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.a(view)) == null) {
            return;
        }
        if (this.f130503j == null) {
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26064xea4764e4 m99723x1bd1f072 = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26064xea4764e4().m99665xabc2c2b5(0.0f, 0.0f).m99723x1bd1f072(false);
            m99723x1bd1f072.tag(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qa.f132387c);
            m99723x1bd1f072.m99670x39b88362(true);
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a a18 = this.f130496c.a(m99723x1bd1f072);
            this.f130503j = a18;
            a18.mo36402xe6a688a0(false);
        }
        this.f130503j.mo36465x8035cc21(rect.left, rect.top);
        this.f130503j.mo36467x764b6bfb(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26011x93ded50c.m99336x63040d79(this.f130494a, a17));
        this.f130503j.mo36427xcd1079b0(z17);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(a17);
    }

    private <O extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ni, L extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ng<O>> void a(int i17, O o17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ng<?> a17;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nh<?> nhVar = this.f130498e.get(o17.getClass());
        if (nhVar == null || (a17 = nhVar.a(i17)) == null) {
            return;
        }
        a17.a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ng<?>) o17);
        nhVar.a(a17);
    }

    public final <O extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ni, L extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ng<O>> L a(java.lang.Class<L> cls, int i17) {
        L l17;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nh<?> nhVar = this.f130498e.get(((java.lang.reflect.ParameterizedType) cls.getGenericSuperclass()).getActualTypeArguments()[0]);
        if (nhVar == null || (l17 = (L) nhVar.a(i17)) == null) {
            return null;
        }
        return l17;
    }

    private <O extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ni, L extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ng<O>> boolean a(int i17, java.lang.Class<L> cls) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ng a17 = a(cls, i17);
        if (a17 == null) {
            return false;
        }
        a17.m36849xc84af884();
        return true;
    }

    @java.lang.Deprecated
    private boolean a(javax.microedition.khronos.opengles.GL10 gl10) {
        this.f130496c.f130488j.a(gl10);
        return true;
    }

    private void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fa faVar) {
        this.f130497d = faVar;
    }

    private boolean a(float f17, float f18) {
        com.p314xaae8f345.p519xbf8bc95e.p530xb297fa42.jni.p531xc04b6a6a.C4389x448e86b0 a17 = this.f130494a.i().a(f17, f18);
        if (a17 == null || a17.f17376x368f3a != 3) {
            return false;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fa faVar = this.f130497d;
        if (faVar == null) {
            return true;
        }
        faVar.o_();
        return true;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bb
    public final void a(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bd bdVar = this.f130494a;
        if (bdVar == null || !this.f130501h || this.f130500g == null) {
            return;
        }
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMarkerDragListener t17 = bdVar.t();
        int action = motionEvent.getAction();
        if (action != 1) {
            if (action == 2) {
                this.f130500g.mo36473xa32537ab(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kr.a(this.f130494a.f().a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu((int) motionEvent.getX(), (int) motionEvent.getY()))));
                if (t17 != null) {
                    t17.mo99165x991e7cd(this.f130500g);
                    return;
                }
                return;
            }
            if (action != 3 && action != 4) {
                return;
            }
        }
        this.f130501h = false;
        if (t17 != null) {
            t17.mo99166xaa2ef9ce(this.f130500g);
        }
        this.f130500g = null;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bb
    public final void a(java.lang.String str) {
        if (str.trim().length() == 0) {
            this.f130500g = null;
            this.f130501h = false;
            return;
        }
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMarkerDragListener t17 = this.f130494a.t();
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a interfaceC26059x88f1805a = (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a) this.f130496c.a(str, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.av.class);
        this.f130500g = interfaceC26059x88f1805a;
        if (interfaceC26059x88f1805a != null) {
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25963x17625b8 interfaceC25963x17625b8 = this.f130494a;
            if (interfaceC25963x17625b8 instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bn) {
                if ((interfaceC26059x88f1805a == null || interfaceC26059x88f1805a != this.f130502i) ? false : com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.go.a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bn) interfaceC25963x17625b8)) {
                    return;
                }
            }
            if (!this.f130500g.mo36451x34173f83()) {
                this.f130500g = null;
                this.f130501h = false;
            } else {
                this.f130501h = true;
                if (t17 != null) {
                    t17.mo99167xdb1fc495(this.f130500g);
                }
            }
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bb
    public final void a() {
        this.f130501h = false;
        this.f130500g = null;
    }

    private boolean a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bn bnVar, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a interfaceC26059x88f1805a) {
        if (interfaceC26059x88f1805a == null || interfaceC26059x88f1805a != this.f130502i) {
            return false;
        }
        return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.go.a(bnVar);
    }

    @Override // com.tencent.mapsdk.internal.sj.c
    public final void a(android.view.View view, android.graphics.Rect rect, boolean z17) {
        android.graphics.Bitmap a17;
        if (view == null || rect == null || (a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.a(view)) == null) {
            return;
        }
        if (this.f130502i == null) {
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26064xea4764e4 m99723x1bd1f072 = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26064xea4764e4().m99665xabc2c2b5(0.0f, 0.0f).m99723x1bd1f072(false);
            m99723x1bd1f072.tag(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qa.f132387c);
            m99723x1bd1f072.m99670x39b88362(true);
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a a18 = this.f130496c.a(m99723x1bd1f072);
            this.f130502i = a18;
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.av avVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.av) this.f130496c.a(a18.mo36409x5db1b11(), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.av.class);
            if (avVar != null) {
                avVar.f130397b.a(new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMarkerClickListener() { // from class: com.tencent.mapsdk.internal.bi.1
                    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMarkerClickListener
                    /* renamed from: onMarkerClick */
                    public final boolean mo36533x289a5e0f(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a interfaceC26059x88f1805a) {
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bi biVar = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bi.this;
                        if (biVar.f130495b == null) {
                            biVar.f130495b = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kp.a(biVar.f130494a.mo36630x76847179(), null, " ", 0);
                        }
                        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bi.this.f130499f).a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bi.this.f130494a.mo36630x76847179(), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bi.this.f130495b);
                        return false;
                    }
                });
            }
        }
        this.f130502i.mo36465x8035cc21(rect.left, rect.top);
        this.f130502i.mo36467x764b6bfb(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26011x93ded50c.m99336x63040d79(this.f130494a, a17));
        this.f130502i.mo36427xcd1079b0(z17);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(a17);
    }

    @Override // com.tencent.mapsdk.internal.sj.c
    public final void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj sjVar) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a interfaceC26059x88f1805a = this.f130503j;
        if (interfaceC26059x88f1805a != null) {
            interfaceC26059x88f1805a.mo36427xcd1079b0(false);
        }
        if (this.f130502i == null || sjVar.k()) {
            return;
        }
        this.f130502i.mo36427xcd1079b0(false);
    }

    @Override // com.tencent.mapsdk.internal.qa.a
    public final void a(android.graphics.Bitmap bitmap, int i17, int i18) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a interfaceC26059x88f1805a = this.f130504k;
        if (interfaceC26059x88f1805a == null) {
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26064xea4764e4 c26064xea4764e4 = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26064xea4764e4();
            c26064xea4764e4.m99665xabc2c2b5(0.5f, 0.5f);
            c26064xea4764e4.tag(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qa.f132387c);
            c26064xea4764e4.m99696x313c79(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26011x93ded50c.m99336x63040d79(this.f130494a, bitmap));
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a a17 = this.f130496c.a(c26064xea4764e4);
            this.f130504k = a17;
            a17.mo36465x8035cc21(i17 / 2, i18 / 2);
            this.f130504k.mo36402xe6a688a0(false);
        } else {
            interfaceC26059x88f1805a.mo36467x764b6bfb(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26011x93ded50c.m99336x63040d79(this.f130494a, bitmap));
            this.f130504k.mo36465x8035cc21(i17 / 2, i18 / 2);
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(bitmap);
    }

    private android.util.Pair<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.IClickedObject> a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26, long j17, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nh<?> nhVar = this.f130498e.get(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nr.class);
        if (nhVar != null) {
            return nhVar.a(c26041x873d1d26, j17, str, str2);
        }
        return new android.util.Pair<>(null, null);
    }
}
