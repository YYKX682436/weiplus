package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class bk implements com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ak, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bc, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fh, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fn, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fr {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f130509a = "key_change_style";

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr f130510b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sl f130511c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj f130512d;

    /* renamed from: e, reason: collision with root package name */
    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pz f130513e;

    /* renamed from: f, reason: collision with root package name */
    com.tencent.mapsdk.internal.qa.a f130514f;

    /* renamed from: g, reason: collision with root package name */
    android.os.Bundle f130515g;

    /* renamed from: m, reason: collision with root package name */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qs f130518m;

    /* renamed from: n, reason: collision with root package name */
    private int f130519n;

    /* renamed from: h, reason: collision with root package name */
    java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.eu> f130516h = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: o, reason: collision with root package name */
    private boolean f130520o = false;

    /* renamed from: i, reason: collision with root package name */
    public android.os.Handler f130517i = new android.os.Handler(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ko.a("gesture")) { // from class: com.tencent.mapsdk.internal.bk.1
        @Override // android.os.Handler
        public final void handleMessage(android.os.Message message) {
            java.lang.Object obj;
            android.view.ViewGroup ac6;
            java.lang.String str;
            if (message == null || (obj = message.obj) == null) {
                return;
            }
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ga gaVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ga) obj;
            int i17 = gaVar.f131086f;
            if (i17 == 0) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sl slVar = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bk.this.f130511c;
                if (slVar != null) {
                    boolean z17 = gaVar.f131087g;
                    boolean z18 = gaVar.f131088h;
                    if (slVar.f132986b != null) {
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ko.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sl.AnonymousClass4(z17, z18));
                        return;
                    }
                    return;
                }
                return;
            }
            if (i17 != 1) {
                if (i17 == 3 && com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.f131343i == 1) {
                    if (android.text.TextUtils.equals(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tf.f133114c, "wechat") || (ac6 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bk.this.f130510b.ac()) == null) {
                        return;
                    }
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bk bkVar = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bk.this;
                    if (bkVar.f130513e == null) {
                        bkVar.f130513e = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pz(ac6.getContext().getApplicationContext(), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bk.this.f130510b.d_);
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bk bkVar2 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bk.this;
                        bkVar2.f130513e.f132379b = bkVar2.f130514f;
                    }
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bk.this.f130513e.a(ac6, null);
                    return;
                }
                if (i17 == 2 && com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bk.this.f130510b.O) {
                    boolean b17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.v.b(gaVar.f131092l);
                    com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9 c4430xc2040f9 = (com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bk.this.f130510b.e_;
                    java.lang.String str2 = b17 ? com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.om.f132127b : com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.om.f132126a;
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = c4430xc2040f9.f134045o.f132039f;
                    if (tkVar == null || 0 == tkVar.f133194e) {
                        return;
                    }
                    tkVar.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass156(str2));
                    return;
                }
                return;
            }
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj sjVar = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bk.this.f130512d;
            if (sjVar != null) {
                int i18 = gaVar.f131089i;
                double d17 = gaVar.f131090j;
                sjVar.f132943k = i18;
                sjVar.f132944l = d17;
                int width = sjVar.f132926a.getWidth();
                if (width <= 0) {
                    width = 1000;
                }
                int ceil = (int) java.lang.Math.ceil(width / 4.0f);
                int ceil2 = (int) (java.lang.Math.ceil((sjVar.f132937d * 3.0f) / 8.0f) - (sjVar.f132942j * 6.0f));
                float[] fArr = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj.f132924f;
                int length = fArr.length;
                int i19 = sjVar.f132943k - sjVar.f132948p;
                if (i19 < 0) {
                    i19 = 0;
                }
                if (i19 >= length) {
                    i19 = length - 1;
                }
                float f17 = fArr[i19];
                if (sjVar.f132939g != f17) {
                    sjVar.f132939g = f17;
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ko.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj.AnonymousClass5());
                }
                float f18 = ceil;
                double d18 = sjVar.f132944l;
                if (d18 != 0.0d) {
                    f18 = (float) (f17 / d18);
                }
                int round = java.lang.Math.round(f18);
                sjVar.f132941i = round;
                if (round > ceil2) {
                    sjVar.f132941i = ceil2;
                } else if (round < ceil) {
                    sjVar.f132941i = ceil;
                }
                if (f17 >= 1000.0f) {
                    f17 /= 1000.0f;
                    str = "公里";
                } else {
                    str = "米";
                }
                sjVar.f132940h = ((int) f17) + str;
                sjVar.f();
            }
        }
    };

    /* renamed from: com.tencent.mapsdk.internal.bk$3, reason: invalid class name */
    /* loaded from: classes13.dex */
    public static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f130523a;

        static {
            int[] iArr = new int[com.tencent.mapsdk.internal.eu.b.m36716xcee59d22().length];
            f130523a = iArr;
            try {
                iArr[com.tencent.mapsdk.internal.eu.b.LEFT_TOP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f130523a[com.tencent.mapsdk.internal.eu.b.LEFT_BOTTOM.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f130523a[com.tencent.mapsdk.internal.eu.b.RIGHT_BOTTOM.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f130523a[com.tencent.mapsdk.internal.eu.b.RIGHT_TOP.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes13.dex */
    public interface a {
        void a();
    }

    public bk(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bd bdVar, android.view.ViewGroup viewGroup, java.lang.ref.WeakReference<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu> weakReference) {
        if (weakReference == null || viewGroup == null) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr) bdVar.d();
        this.f130510b = trVar;
        ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) trVar.e_).a(this);
        java.lang.Object obj = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu) weakReference.get();
        if (obj instanceof android.view.View) {
            android.view.View view = (android.view.View) obj;
            if (viewGroup.indexOfChild(view) < 0) {
                viewGroup.addView(view, 0, new android.widget.FrameLayout.LayoutParams(-1, -1));
                viewGroup.requestLayout();
            }
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj sjVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj(bdVar.mo36630x76847179(), this.f130510b, ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) this.f130510b.e_).p());
        this.f130512d = sjVar;
        this.f130510b.f133730l = sjVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qs qsVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qs(bdVar);
        this.f130518m = qsVar;
        this.f130512d.f132953u = qsVar;
        this.f130510b.f133731m = qsVar;
        this.f130511c = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sl(bdVar.mo36630x76847179(), this.f130510b);
        this.f130516h.add(this.f130512d);
        this.f130516h.add(this.f130511c);
        this.f130516h.add(this.f130518m);
        this.f130510b.a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fh) this);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar2 = this.f130510b;
        trVar2.f133721ai.remove(this);
        trVar2.f133721ai.add(this);
        this.f130510b.a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fn) this);
    }

    private void k() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.f130510b;
        if (trVar == null) {
            return;
        }
        android.os.Handler handler = this.f130517i;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) trVar.e_).f134045o.f132041h.b(this);
        trVar.f133721ai.remove(this);
        trVar.b((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fh) this);
        android.view.ViewGroup ac6 = trVar.ac();
        if (ac6 != null) {
            ac6.removeAllViews();
        }
        java.util.Iterator<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.eu> it = this.f130516h.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
        this.f130516h.clear();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ak
    public final void g(boolean z17) {
        this.f130510b.e(z17);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ak
    public final void h(boolean z17) {
        this.f130510b.f(z17);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ak
    public final void i(boolean z17) {
        this.f130510b.f133799al = z17;
        d(z17);
        f(z17);
        g(z17);
        h(z17);
    }

    public final void j() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ko.a(new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.bk.2
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bk bkVar = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bk.this;
                android.os.Bundle bundle = bkVar.f130515g;
                android.view.ViewGroup ac6 = bkVar.f130510b.ac();
                java.util.Iterator<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.eu> it = bkVar.f130516h.iterator();
                while (it.hasNext()) {
                    it.next().a(ac6, bundle);
                }
            }
        });
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ak
    public final void l(boolean z17) {
        M m17;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ad adVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.f130510b;
        if (trVar == null || (m17 = trVar.e_) == 0 || (neVar = ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) m17).f134045o) == null || (adVar = neVar.f132041h) == null) {
            return;
        }
        adVar.L = z17;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ak
    public final void m(boolean z17) {
        M m17;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ad adVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.f130510b;
        if (trVar == null || (m17 = trVar.e_) == 0 || (neVar = ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) m17).f134045o) == null || (adVar = neVar.f132041h) == null) {
            return;
        }
        adVar.M = z17;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ak
    public final void n(boolean z17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ac acVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qs qsVar = this.f130518m;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = qsVar.f132584e;
        if (trVar != null) {
            if (z17) {
                qsVar.f132581b = true;
            } else {
                qsVar.f132581b = false;
            }
            boolean z18 = qsVar.f132581b;
            if (trVar != null) {
                if (qsVar.f132580a == null) {
                    if (!z18) {
                        return;
                    } else {
                        qsVar.e();
                    }
                }
                com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9 c4430xc2040f9 = (com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) qsVar.f132584e.e_;
                if (qsVar.f132581b && z18 && (acVar = qsVar.f132583d) != null && acVar.f130311f) {
                    qsVar.a(c4430xc2040f9.f134047q.u());
                    return;
                }
                qsVar.a((com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26034x15ff5647) null);
                if (qsVar.f132580a.getVisibility() != 8) {
                    qsVar.f132580a.setVisibility(8);
                }
            }
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ak
    public final void o(boolean z17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj sjVar = this.f130512d;
        if (sjVar != null) {
            sjVar.f132946n = !z17;
            sjVar.e();
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ak
    public final void b(boolean z17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.f130510b;
        if (trVar.O != z17) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ga gaVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ga();
            gaVar.f131086f = 2;
            java.util.Iterator<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fh> it = trVar.f133734p.iterator();
            while (it.hasNext()) {
                it.next().a(gaVar);
            }
        }
        trVar.O = z17;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ad adVar = ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) trVar.e_).f134045o.f132041h;
        adVar.G = z17;
        adVar.f130362z.i().b(adVar.G);
        ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) trVar.e_).f134045o.f132055v = true;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ak
    public final void c(boolean z17) {
        this.f130520o = z17;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sl slVar = this.f130511c;
        slVar.f132990f = z17;
        if (z17 && slVar.f132987c == null) {
            slVar.b(slVar.f132985a);
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sk skVar = slVar.f132987c;
        if (skVar != null) {
            skVar.setVisibility(z17 ? 0 : 8);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ak
    public final void d(boolean z17) {
        this.f130510b.b(z17);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ak
    public final void e(boolean z17) {
        this.f130510b.c(z17);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ak
    public final void f(boolean z17) {
        this.f130510b.d(z17);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ak
    public final boolean g() {
        return this.f130510b.k();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ak
    public final boolean h() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qs qsVar = this.f130518m;
        if (qsVar != null) {
            return qsVar.f132581b;
        }
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ak
    public final void j(boolean z17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj sjVar = this.f130512d;
        if (sjVar != null) {
            if (sjVar.f132945m != z17) {
                sjVar.f132945m = z17;
                java.util.List<com.tencent.mapsdk.internal.sj.c> list = sjVar.f132950r;
                if (list != null) {
                    java.util.Iterator<com.tencent.mapsdk.internal.sj.c> it = list.iterator();
                    while (it.hasNext()) {
                        it.next().b(sjVar.f132947o, new android.graphics.Rect(sjVar.f132951s, sjVar.f132952t, 0, 0), sjVar.f132945m);
                    }
                }
            }
            sjVar.e();
        }
    }

    private void a(com.tencent.mapsdk.internal.bk.a aVar) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sl slVar = this.f130511c;
        if (slVar != null) {
            slVar.f132988d = aVar;
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ak
    public final boolean d() {
        return this.f130510b.h();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ak
    public final boolean e() {
        return this.f130510b.i();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ak
    public final boolean f() {
        return this.f130510b.j();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ak
    public final void g(int i17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj sjVar = this.f130512d;
        if (sjVar != null) {
            sjVar.f132938e = i17;
            sjVar.f132949q = Float.MIN_VALUE;
            sjVar.h();
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ak
    public final void d(int i17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj sjVar = this.f130512d;
        if (sjVar != null) {
            sjVar.a(com.tencent.mapsdk.internal.eu.a.BOTTOM, i17);
            this.f130512d.h();
            j();
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ak
    public final void e(int i17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj sjVar = this.f130512d;
        if (sjVar != null) {
            sjVar.b(com.tencent.mapsdk.internal.eu.b.a(i17));
            j();
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ak
    public final void f(int i17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.f130510b;
        if (trVar != null) {
            trVar.a(i17);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ak
    public final void h(int i17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sl slVar = this.f130511c;
        if (slVar != null) {
            slVar.a(com.tencent.mapsdk.internal.eu.b.a(i17));
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ak
    public final void a(boolean z17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sl slVar = this.f130511c;
        slVar.f132991g = z17;
        if (z17 && slVar.f132986b == null) {
            slVar.a(slVar.f132985a);
        }
        android.widget.ZoomControls zoomControls = slVar.f132986b;
        if (zoomControls != null) {
            zoomControls.setVisibility(z17 ? 0 : 8);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fr
    public final void i(int i17) {
        if (this.f130515g == null) {
            this.f130515g = new android.os.Bundle();
        }
        this.f130515g.putInt(f130509a, i17);
        j();
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ga gaVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ga();
        gaVar.f131086f = 2;
        gaVar.f131092l = i17;
        a(gaVar);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ak
    public final boolean c() {
        return this.f130520o;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ak
    public final void c(int i17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj sjVar = this.f130512d;
        if (sjVar != null) {
            sjVar.a(com.tencent.mapsdk.internal.eu.a.LEFT, i17);
            this.f130512d.h();
            j();
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ak
    public final boolean a() {
        android.widget.ZoomControls zoomControls = this.f130511c.f132986b;
        return zoomControls != null && zoomControls.getVisibility() == 0;
    }

    private void a(android.os.Bundle bundle) {
        android.view.ViewGroup ac6 = this.f130510b.ac();
        java.util.Iterator<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.eu> it = this.f130516h.iterator();
        while (it.hasNext()) {
            it.next().a(ac6, bundle);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ak
    public final boolean i() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj sjVar = this.f130512d;
        if (sjVar != null) {
            return sjVar.f132945m;
        }
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ak
    public final void k(boolean z17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj sjVar = this.f130512d;
        if (sjVar != null) {
            sjVar.f132935b = z17;
            android.widget.ImageView imageView = sjVar.f132926a;
            if (imageView != null) {
                imageView.setVisibility(z17 ? 0 : 4);
            }
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ak
    public final void a(int i17, float f17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj sjVar = this.f130512d;
        if (sjVar != null) {
            com.tencent.mapsdk.internal.eu.a a17 = com.tencent.mapsdk.internal.eu.a.a(i17);
            if (f17 < 0.0f) {
                f17 = 0.0f;
            }
            if (f17 > 1.0f) {
                f17 = 1.0f;
            }
            sjVar.f132936c[a17.f130946e] = f17;
            sjVar.h();
            j();
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ak
    public final boolean b() {
        return this.f130510b.O;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fn
    public final void b(int i17, int i18) {
        this.f130519n = i18;
        java.util.Iterator<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.eu> it = this.f130516h.iterator();
        while (it.hasNext()) {
            it.next().b(i17, i18);
        }
        j();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ak
    public final float a(int i17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj sjVar = this.f130512d;
        if (sjVar == null) {
            return 0.0f;
        }
        return sjVar.f132936c[com.tencent.mapsdk.internal.eu.a.a(i17).f130946e];
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ak
    public final void a(int i17, int i18, int i19, int i27, int i28) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj sjVar = this.f130512d;
        if (sjVar != null) {
            sjVar.a(com.tencent.mapsdk.internal.eu.b.a(i17));
            this.f130512d.a(com.tencent.mapsdk.internal.eu.a.TOP, i18);
            this.f130512d.a(com.tencent.mapsdk.internal.eu.a.BOTTOM, i19);
            this.f130512d.a(com.tencent.mapsdk.internal.eu.a.LEFT, i27);
            this.f130512d.a(com.tencent.mapsdk.internal.eu.a.RIGHT, i28);
            this.f130512d.h();
            j();
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ak
    public final void b(int i17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj sjVar = this.f130512d;
        if (sjVar != null) {
            sjVar.a(com.tencent.mapsdk.internal.eu.b.a(i17));
            j();
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ak
    public final void b(int i17, int i18, int i19, int i27, int i28) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj sjVar = this.f130512d;
        if (sjVar != null) {
            sjVar.b(com.tencent.mapsdk.internal.eu.b.a(i17));
            this.f130512d.b(com.tencent.mapsdk.internal.eu.a.TOP, i18);
            this.f130512d.b(com.tencent.mapsdk.internal.eu.a.BOTTOM, i19);
            this.f130512d.b(com.tencent.mapsdk.internal.eu.a.LEFT, i27);
            this.f130512d.b(com.tencent.mapsdk.internal.eu.a.RIGHT, i28);
            this.f130512d.i();
            j();
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ak
    public final void a(int i17, int[] iArr) {
        if (this.f130512d != null) {
            com.tencent.mapsdk.internal.eu.b a17 = com.tencent.mapsdk.internal.eu.b.a(i17);
            this.f130512d.a(a17);
            int i18 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bk.AnonymousClass3.f130523a[a17.ordinal()];
            if (i18 == 1) {
                this.f130512d.a(com.tencent.mapsdk.internal.eu.a.TOP, iArr[0]);
                this.f130512d.a(com.tencent.mapsdk.internal.eu.a.LEFT, iArr[1]);
            } else if (i18 == 2) {
                this.f130512d.a(com.tencent.mapsdk.internal.eu.a.BOTTOM, iArr[0]);
                this.f130512d.a(com.tencent.mapsdk.internal.eu.a.LEFT, iArr[1]);
            } else if (i18 == 3) {
                this.f130512d.a(com.tencent.mapsdk.internal.eu.a.BOTTOM, iArr[0]);
                this.f130512d.a(com.tencent.mapsdk.internal.eu.a.RIGHT, iArr[1]);
            } else if (i18 == 4) {
                this.f130512d.a(com.tencent.mapsdk.internal.eu.a.TOP, iArr[0]);
                this.f130512d.a(com.tencent.mapsdk.internal.eu.a.RIGHT, iArr[1]);
            }
            this.f130512d.h();
            j();
        }
    }

    private void b(boolean z17, java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ss> list) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj sjVar = this.f130512d;
        if (sjVar == null || (trVar = this.f130510b) == null || trVar.e_ == 0) {
            return;
        }
        sjVar.a(list);
        if (z17) {
            this.f130512d.g();
        }
        this.f130512d.a(this.f130510b.af(), ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne) this.f130510b.d_).o());
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fh
    public final void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ga gaVar) {
        int i17 = gaVar.f131086f;
        if (i17 != -1) {
            this.f130517i.sendMessage(this.f130517i.obtainMessage(i17, gaVar));
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ak
    public final void a(int i17, int i18) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.f130510b;
        if (trVar != null) {
            trVar.a(i17, i18);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ak
    public final void a(float f17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj sjVar = this.f130512d;
        if (sjVar != null) {
            if (f17 > 1.3f) {
                f17 = 1.3f;
            }
            if (f17 < 0.7f) {
                f17 = 0.7f;
            }
            sjVar.f132938e = 0;
            sjVar.f132949q = f17;
            sjVar.h();
        }
    }

    private void a(com.tencent.mapsdk.internal.sj.c cVar, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7 c25966x7e4576a7) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj sjVar;
        if (c25966x7e4576a7 == null || c25966x7e4576a7.m99197xd6193b42() == null || (sjVar = this.f130512d) == null) {
            return;
        }
        java.util.List<com.tencent.mapsdk.internal.sj.c> list = sjVar.f132950r;
        if (list != null && cVar != null) {
            list.add(cVar);
        }
        int m99199x350ebba4 = c25966x7e4576a7.m99199x350ebba4();
        int m99198x52f9bf09 = c25966x7e4576a7.m99198x52f9bf09();
        android.view.ViewGroup ac6 = this.f130510b.ac();
        if (ac6 != null) {
            ac6.measure(android.view.View.MeasureSpec.makeMeasureSpec(m99199x350ebba4, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(m99198x52f9bf09, 1073741824));
        }
        b(m99199x350ebba4, m99198x52f9bf09);
    }

    public final void a(com.tencent.mapsdk.internal.qa.a aVar, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7 c25966x7e4576a7) {
        if (c25966x7e4576a7 == null || c25966x7e4576a7.m99197xd6193b42() == null) {
            return;
        }
        this.f130514f = aVar;
        int m99199x350ebba4 = c25966x7e4576a7.m99199x350ebba4();
        int m99198x52f9bf09 = c25966x7e4576a7.m99198x52f9bf09();
        android.view.ViewGroup ac6 = this.f130510b.ac();
        if (ac6 != null) {
            ac6.measure(android.view.View.MeasureSpec.makeMeasureSpec(m99199x350ebba4, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(m99198x52f9bf09, 1073741824));
        }
        b(m99199x350ebba4, m99198x52f9bf09);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bc
    public final void a(boolean z17, java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ss> list) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sj sjVar = this.f130512d;
        if (sjVar == null || (trVar = this.f130510b) == null || trVar.e_ == 0) {
            return;
        }
        sjVar.a(list);
        if (z17) {
            this.f130512d.g();
        }
        this.f130512d.a(this.f130510b.af(), ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne) this.f130510b.d_).o());
    }

    private static /* synthetic */ void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bk bkVar, android.os.Bundle bundle) {
        android.view.ViewGroup ac6 = bkVar.f130510b.ac();
        java.util.Iterator<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.eu> it = bkVar.f130516h.iterator();
        while (it.hasNext()) {
            it.next().a(ac6, bundle);
        }
    }
}
