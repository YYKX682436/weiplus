package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class bk implements com.tencent.mapsdk.internal.ak, com.tencent.mapsdk.internal.bc, com.tencent.mapsdk.internal.fh, com.tencent.mapsdk.internal.fn, com.tencent.mapsdk.internal.fr {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f48976a = "key_change_style";

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mapsdk.internal.tr f48977b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mapsdk.internal.sl f48978c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mapsdk.internal.sj f48979d;

    /* renamed from: e, reason: collision with root package name */
    com.tencent.mapsdk.internal.pz f48980e;

    /* renamed from: f, reason: collision with root package name */
    com.tencent.mapsdk.internal.qa.a f48981f;

    /* renamed from: g, reason: collision with root package name */
    android.os.Bundle f48982g;

    /* renamed from: m, reason: collision with root package name */
    private com.tencent.mapsdk.internal.qs f48985m;

    /* renamed from: n, reason: collision with root package name */
    private int f48986n;

    /* renamed from: h, reason: collision with root package name */
    java.util.List<com.tencent.mapsdk.internal.eu> f48983h = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: o, reason: collision with root package name */
    private boolean f48987o = false;

    /* renamed from: i, reason: collision with root package name */
    public android.os.Handler f48984i = new android.os.Handler(com.tencent.mapsdk.internal.ko.a("gesture")) { // from class: com.tencent.mapsdk.internal.bk.1
        @Override // android.os.Handler
        public final void handleMessage(android.os.Message message) {
            java.lang.Object obj;
            android.view.ViewGroup ac6;
            java.lang.String str;
            if (message == null || (obj = message.obj) == null) {
                return;
            }
            com.tencent.mapsdk.internal.ga gaVar = (com.tencent.mapsdk.internal.ga) obj;
            int i17 = gaVar.f49553f;
            if (i17 == 0) {
                com.tencent.mapsdk.internal.sl slVar = com.tencent.mapsdk.internal.bk.this.f48978c;
                if (slVar != null) {
                    boolean z17 = gaVar.f49554g;
                    boolean z18 = gaVar.f49555h;
                    if (slVar.f51453b != null) {
                        com.tencent.mapsdk.internal.ko.a(new com.tencent.mapsdk.internal.sl.AnonymousClass4(z17, z18));
                        return;
                    }
                    return;
                }
                return;
            }
            if (i17 != 1) {
                if (i17 == 3 && com.tencent.mapsdk.internal.hn.f49810i == 1) {
                    if (android.text.TextUtils.equals(com.tencent.mapsdk.internal.tf.f51581c, "wechat") || (ac6 = com.tencent.mapsdk.internal.bk.this.f48977b.ac()) == null) {
                        return;
                    }
                    com.tencent.mapsdk.internal.bk bkVar = com.tencent.mapsdk.internal.bk.this;
                    if (bkVar.f48980e == null) {
                        bkVar.f48980e = new com.tencent.mapsdk.internal.pz(ac6.getContext().getApplicationContext(), com.tencent.mapsdk.internal.bk.this.f48977b.d_);
                        com.tencent.mapsdk.internal.bk bkVar2 = com.tencent.mapsdk.internal.bk.this;
                        bkVar2.f48980e.f50846b = bkVar2.f48981f;
                    }
                    com.tencent.mapsdk.internal.bk.this.f48980e.a(ac6, null);
                    return;
                }
                if (i17 == 2 && com.tencent.mapsdk.internal.bk.this.f48977b.O) {
                    boolean b17 = com.tencent.mapsdk.internal.v.b(gaVar.f49559l);
                    com.tencent.mapsdk.vector.VectorMap vectorMap = (com.tencent.mapsdk.vector.VectorMap) com.tencent.mapsdk.internal.bk.this.f48977b.e_;
                    java.lang.String str2 = b17 ? com.tencent.mapsdk.internal.om.f50594b : com.tencent.mapsdk.internal.om.f50593a;
                    com.tencent.mapsdk.internal.tk tkVar = vectorMap.f52512o.f50506f;
                    if (tkVar == null || 0 == tkVar.f51661e) {
                        return;
                    }
                    tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass156(str2));
                    return;
                }
                return;
            }
            com.tencent.mapsdk.internal.sj sjVar = com.tencent.mapsdk.internal.bk.this.f48979d;
            if (sjVar != null) {
                int i18 = gaVar.f49556i;
                double d17 = gaVar.f49557j;
                sjVar.f51410k = i18;
                sjVar.f51411l = d17;
                int width = sjVar.f51393a.getWidth();
                if (width <= 0) {
                    width = 1000;
                }
                int ceil = (int) java.lang.Math.ceil(width / 4.0f);
                int ceil2 = (int) (java.lang.Math.ceil((sjVar.f51404d * 3.0f) / 8.0f) - (sjVar.f51409j * 6.0f));
                float[] fArr = com.tencent.mapsdk.internal.sj.f51391f;
                int length = fArr.length;
                int i19 = sjVar.f51410k - sjVar.f51415p;
                if (i19 < 0) {
                    i19 = 0;
                }
                if (i19 >= length) {
                    i19 = length - 1;
                }
                float f17 = fArr[i19];
                if (sjVar.f51406g != f17) {
                    sjVar.f51406g = f17;
                    com.tencent.mapsdk.internal.ko.a(new com.tencent.mapsdk.internal.sj.AnonymousClass5());
                }
                float f18 = ceil;
                double d18 = sjVar.f51411l;
                if (d18 != 0.0d) {
                    f18 = (float) (f17 / d18);
                }
                int round = java.lang.Math.round(f18);
                sjVar.f51408i = round;
                if (round > ceil2) {
                    sjVar.f51408i = ceil2;
                } else if (round < ceil) {
                    sjVar.f51408i = ceil;
                }
                if (f17 >= 1000.0f) {
                    f17 /= 1000.0f;
                    str = "公里";
                } else {
                    str = "米";
                }
                sjVar.f51407h = ((int) f17) + str;
                sjVar.f();
            }
        }
    };

    /* renamed from: com.tencent.mapsdk.internal.bk$3, reason: invalid class name */
    /* loaded from: classes13.dex */
    public static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f48990a;

        static {
            int[] iArr = new int[com.tencent.mapsdk.internal.eu.b.values().length];
            f48990a = iArr;
            try {
                iArr[com.tencent.mapsdk.internal.eu.b.LEFT_TOP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f48990a[com.tencent.mapsdk.internal.eu.b.LEFT_BOTTOM.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f48990a[com.tencent.mapsdk.internal.eu.b.RIGHT_BOTTOM.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f48990a[com.tencent.mapsdk.internal.eu.b.RIGHT_TOP.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes13.dex */
    public interface a {
        void a();
    }

    public bk(com.tencent.mapsdk.internal.bd bdVar, android.view.ViewGroup viewGroup, java.lang.ref.WeakReference<com.tencent.mapsdk.internal.bu> weakReference) {
        if (weakReference == null || viewGroup == null) {
            return;
        }
        com.tencent.mapsdk.internal.tr trVar = (com.tencent.mapsdk.internal.tr) bdVar.d();
        this.f48977b = trVar;
        ((com.tencent.mapsdk.vector.VectorMap) trVar.e_).a(this);
        java.lang.Object obj = (com.tencent.mapsdk.internal.bu) weakReference.get();
        if (obj instanceof android.view.View) {
            android.view.View view = (android.view.View) obj;
            if (viewGroup.indexOfChild(view) < 0) {
                viewGroup.addView(view, 0, new android.widget.FrameLayout.LayoutParams(-1, -1));
                viewGroup.requestLayout();
            }
        }
        com.tencent.mapsdk.internal.sj sjVar = new com.tencent.mapsdk.internal.sj(bdVar.getContext(), this.f48977b, ((com.tencent.mapsdk.vector.VectorMap) this.f48977b.e_).p());
        this.f48979d = sjVar;
        this.f48977b.f52197l = sjVar;
        com.tencent.mapsdk.internal.qs qsVar = new com.tencent.mapsdk.internal.qs(bdVar);
        this.f48985m = qsVar;
        this.f48979d.f51420u = qsVar;
        this.f48977b.f52198m = qsVar;
        this.f48978c = new com.tencent.mapsdk.internal.sl(bdVar.getContext(), this.f48977b);
        this.f48983h.add(this.f48979d);
        this.f48983h.add(this.f48978c);
        this.f48983h.add(this.f48985m);
        this.f48977b.a((com.tencent.mapsdk.internal.fh) this);
        com.tencent.mapsdk.internal.tr trVar2 = this.f48977b;
        trVar2.f52188ai.remove(this);
        trVar2.f52188ai.add(this);
        this.f48977b.a((com.tencent.mapsdk.internal.fn) this);
    }

    private void k() {
        com.tencent.mapsdk.internal.tr trVar = this.f48977b;
        if (trVar == null) {
            return;
        }
        android.os.Handler handler = this.f48984i;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        ((com.tencent.mapsdk.vector.VectorMap) trVar.e_).f52512o.f50508h.b(this);
        trVar.f52188ai.remove(this);
        trVar.b((com.tencent.mapsdk.internal.fh) this);
        android.view.ViewGroup ac6 = trVar.ac();
        if (ac6 != null) {
            ac6.removeAllViews();
        }
        java.util.Iterator<com.tencent.mapsdk.internal.eu> it = this.f48983h.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
        this.f48983h.clear();
    }

    @Override // com.tencent.mapsdk.internal.ak
    public final void g(boolean z17) {
        this.f48977b.e(z17);
    }

    @Override // com.tencent.mapsdk.internal.ak
    public final void h(boolean z17) {
        this.f48977b.f(z17);
    }

    @Override // com.tencent.mapsdk.internal.ak
    public final void i(boolean z17) {
        this.f48977b.f52266al = z17;
        d(z17);
        f(z17);
        g(z17);
        h(z17);
    }

    public final void j() {
        com.tencent.mapsdk.internal.ko.a(new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.bk.2
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mapsdk.internal.bk bkVar = com.tencent.mapsdk.internal.bk.this;
                android.os.Bundle bundle = bkVar.f48982g;
                android.view.ViewGroup ac6 = bkVar.f48977b.ac();
                java.util.Iterator<com.tencent.mapsdk.internal.eu> it = bkVar.f48983h.iterator();
                while (it.hasNext()) {
                    it.next().a(ac6, bundle);
                }
            }
        });
    }

    @Override // com.tencent.mapsdk.internal.ak
    public final void l(boolean z17) {
        M m17;
        com.tencent.mapsdk.internal.ne neVar;
        com.tencent.mapsdk.internal.ad adVar;
        com.tencent.mapsdk.internal.tr trVar = this.f48977b;
        if (trVar == null || (m17 = trVar.e_) == 0 || (neVar = ((com.tencent.mapsdk.vector.VectorMap) m17).f52512o) == null || (adVar = neVar.f50508h) == null) {
            return;
        }
        adVar.L = z17;
    }

    @Override // com.tencent.mapsdk.internal.ak
    public final void m(boolean z17) {
        M m17;
        com.tencent.mapsdk.internal.ne neVar;
        com.tencent.mapsdk.internal.ad adVar;
        com.tencent.mapsdk.internal.tr trVar = this.f48977b;
        if (trVar == null || (m17 = trVar.e_) == 0 || (neVar = ((com.tencent.mapsdk.vector.VectorMap) m17).f52512o) == null || (adVar = neVar.f50508h) == null) {
            return;
        }
        adVar.M = z17;
    }

    @Override // com.tencent.mapsdk.internal.ak
    public final void n(boolean z17) {
        com.tencent.mapsdk.internal.ac acVar;
        com.tencent.mapsdk.internal.qs qsVar = this.f48985m;
        com.tencent.mapsdk.internal.tr trVar = qsVar.f51051e;
        if (trVar != null) {
            if (z17) {
                qsVar.f51048b = true;
            } else {
                qsVar.f51048b = false;
            }
            boolean z18 = qsVar.f51048b;
            if (trVar != null) {
                if (qsVar.f51047a == null) {
                    if (!z18) {
                        return;
                    } else {
                        qsVar.e();
                    }
                }
                com.tencent.mapsdk.vector.VectorMap vectorMap = (com.tencent.mapsdk.vector.VectorMap) qsVar.f51051e.e_;
                if (qsVar.f51048b && z18 && (acVar = qsVar.f51050d) != null && acVar.f48778f) {
                    qsVar.a(vectorMap.f52514q.u());
                    return;
                }
                qsVar.a((com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding) null);
                if (qsVar.f51047a.getVisibility() != 8) {
                    qsVar.f51047a.setVisibility(8);
                }
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.ak
    public final void o(boolean z17) {
        com.tencent.mapsdk.internal.sj sjVar = this.f48979d;
        if (sjVar != null) {
            sjVar.f51413n = !z17;
            sjVar.e();
        }
    }

    @Override // com.tencent.mapsdk.internal.ak
    public final void b(boolean z17) {
        com.tencent.mapsdk.internal.tr trVar = this.f48977b;
        if (trVar.O != z17) {
            com.tencent.mapsdk.internal.ga gaVar = new com.tencent.mapsdk.internal.ga();
            gaVar.f49553f = 2;
            java.util.Iterator<com.tencent.mapsdk.internal.fh> it = trVar.f52201p.iterator();
            while (it.hasNext()) {
                it.next().a(gaVar);
            }
        }
        trVar.O = z17;
        com.tencent.mapsdk.internal.ad adVar = ((com.tencent.mapsdk.vector.VectorMap) trVar.e_).f52512o.f50508h;
        adVar.G = z17;
        adVar.f48829z.i().b(adVar.G);
        ((com.tencent.mapsdk.vector.VectorMap) trVar.e_).f52512o.f50522v = true;
    }

    @Override // com.tencent.mapsdk.internal.ak
    public final void c(boolean z17) {
        this.f48987o = z17;
        com.tencent.mapsdk.internal.sl slVar = this.f48978c;
        slVar.f51457f = z17;
        if (z17 && slVar.f51454c == null) {
            slVar.b(slVar.f51452a);
        }
        com.tencent.mapsdk.internal.sk skVar = slVar.f51454c;
        if (skVar != null) {
            skVar.setVisibility(z17 ? 0 : 8);
        }
    }

    @Override // com.tencent.mapsdk.internal.ak
    public final void d(boolean z17) {
        this.f48977b.b(z17);
    }

    @Override // com.tencent.mapsdk.internal.ak
    public final void e(boolean z17) {
        this.f48977b.c(z17);
    }

    @Override // com.tencent.mapsdk.internal.ak
    public final void f(boolean z17) {
        this.f48977b.d(z17);
    }

    @Override // com.tencent.mapsdk.internal.ak
    public final boolean g() {
        return this.f48977b.k();
    }

    @Override // com.tencent.mapsdk.internal.ak
    public final boolean h() {
        com.tencent.mapsdk.internal.qs qsVar = this.f48985m;
        if (qsVar != null) {
            return qsVar.f51048b;
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.ak
    public final void j(boolean z17) {
        com.tencent.mapsdk.internal.sj sjVar = this.f48979d;
        if (sjVar != null) {
            if (sjVar.f51412m != z17) {
                sjVar.f51412m = z17;
                java.util.List<com.tencent.mapsdk.internal.sj.c> list = sjVar.f51417r;
                if (list != null) {
                    java.util.Iterator<com.tencent.mapsdk.internal.sj.c> it = list.iterator();
                    while (it.hasNext()) {
                        it.next().b(sjVar.f51414o, new android.graphics.Rect(sjVar.f51418s, sjVar.f51419t, 0, 0), sjVar.f51412m);
                    }
                }
            }
            sjVar.e();
        }
    }

    private void a(com.tencent.mapsdk.internal.bk.a aVar) {
        com.tencent.mapsdk.internal.sl slVar = this.f48978c;
        if (slVar != null) {
            slVar.f51455d = aVar;
        }
    }

    @Override // com.tencent.mapsdk.internal.ak
    public final boolean d() {
        return this.f48977b.h();
    }

    @Override // com.tencent.mapsdk.internal.ak
    public final boolean e() {
        return this.f48977b.i();
    }

    @Override // com.tencent.mapsdk.internal.ak
    public final boolean f() {
        return this.f48977b.j();
    }

    @Override // com.tencent.mapsdk.internal.ak
    public final void g(int i17) {
        com.tencent.mapsdk.internal.sj sjVar = this.f48979d;
        if (sjVar != null) {
            sjVar.f51405e = i17;
            sjVar.f51416q = Float.MIN_VALUE;
            sjVar.h();
        }
    }

    @Override // com.tencent.mapsdk.internal.ak
    public final void d(int i17) {
        com.tencent.mapsdk.internal.sj sjVar = this.f48979d;
        if (sjVar != null) {
            sjVar.a(com.tencent.mapsdk.internal.eu.a.BOTTOM, i17);
            this.f48979d.h();
            j();
        }
    }

    @Override // com.tencent.mapsdk.internal.ak
    public final void e(int i17) {
        com.tencent.mapsdk.internal.sj sjVar = this.f48979d;
        if (sjVar != null) {
            sjVar.b(com.tencent.mapsdk.internal.eu.b.a(i17));
            j();
        }
    }

    @Override // com.tencent.mapsdk.internal.ak
    public final void f(int i17) {
        com.tencent.mapsdk.internal.tr trVar = this.f48977b;
        if (trVar != null) {
            trVar.a(i17);
        }
    }

    @Override // com.tencent.mapsdk.internal.ak
    public final void h(int i17) {
        com.tencent.mapsdk.internal.sl slVar = this.f48978c;
        if (slVar != null) {
            slVar.a(com.tencent.mapsdk.internal.eu.b.a(i17));
        }
    }

    @Override // com.tencent.mapsdk.internal.ak
    public final void a(boolean z17) {
        com.tencent.mapsdk.internal.sl slVar = this.f48978c;
        slVar.f51458g = z17;
        if (z17 && slVar.f51453b == null) {
            slVar.a(slVar.f51452a);
        }
        android.widget.ZoomControls zoomControls = slVar.f51453b;
        if (zoomControls != null) {
            zoomControls.setVisibility(z17 ? 0 : 8);
        }
    }

    @Override // com.tencent.mapsdk.internal.fr
    public final void i(int i17) {
        if (this.f48982g == null) {
            this.f48982g = new android.os.Bundle();
        }
        this.f48982g.putInt(f48976a, i17);
        j();
        com.tencent.mapsdk.internal.ga gaVar = new com.tencent.mapsdk.internal.ga();
        gaVar.f49553f = 2;
        gaVar.f49559l = i17;
        a(gaVar);
    }

    @Override // com.tencent.mapsdk.internal.ak
    public final boolean c() {
        return this.f48987o;
    }

    @Override // com.tencent.mapsdk.internal.ak
    public final void c(int i17) {
        com.tencent.mapsdk.internal.sj sjVar = this.f48979d;
        if (sjVar != null) {
            sjVar.a(com.tencent.mapsdk.internal.eu.a.LEFT, i17);
            this.f48979d.h();
            j();
        }
    }

    @Override // com.tencent.mapsdk.internal.ak
    public final boolean a() {
        android.widget.ZoomControls zoomControls = this.f48978c.f51453b;
        return zoomControls != null && zoomControls.getVisibility() == 0;
    }

    private void a(android.os.Bundle bundle) {
        android.view.ViewGroup ac6 = this.f48977b.ac();
        java.util.Iterator<com.tencent.mapsdk.internal.eu> it = this.f48983h.iterator();
        while (it.hasNext()) {
            it.next().a(ac6, bundle);
        }
    }

    @Override // com.tencent.mapsdk.internal.ak
    public final boolean i() {
        com.tencent.mapsdk.internal.sj sjVar = this.f48979d;
        if (sjVar != null) {
            return sjVar.f51412m;
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.ak
    public final void k(boolean z17) {
        com.tencent.mapsdk.internal.sj sjVar = this.f48979d;
        if (sjVar != null) {
            sjVar.f51402b = z17;
            android.widget.ImageView imageView = sjVar.f51393a;
            if (imageView != null) {
                imageView.setVisibility(z17 ? 0 : 4);
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.ak
    public final void a(int i17, float f17) {
        com.tencent.mapsdk.internal.sj sjVar = this.f48979d;
        if (sjVar != null) {
            com.tencent.mapsdk.internal.eu.a a17 = com.tencent.mapsdk.internal.eu.a.a(i17);
            if (f17 < 0.0f) {
                f17 = 0.0f;
            }
            if (f17 > 1.0f) {
                f17 = 1.0f;
            }
            sjVar.f51403c[a17.f49413e] = f17;
            sjVar.h();
            j();
        }
    }

    @Override // com.tencent.mapsdk.internal.ak
    public final boolean b() {
        return this.f48977b.O;
    }

    @Override // com.tencent.mapsdk.internal.fn
    public final void b(int i17, int i18) {
        this.f48986n = i18;
        java.util.Iterator<com.tencent.mapsdk.internal.eu> it = this.f48983h.iterator();
        while (it.hasNext()) {
            it.next().b(i17, i18);
        }
        j();
    }

    @Override // com.tencent.mapsdk.internal.ak
    public final float a(int i17) {
        com.tencent.mapsdk.internal.sj sjVar = this.f48979d;
        if (sjVar == null) {
            return 0.0f;
        }
        return sjVar.f51403c[com.tencent.mapsdk.internal.eu.a.a(i17).f49413e];
    }

    @Override // com.tencent.mapsdk.internal.ak
    public final void a(int i17, int i18, int i19, int i27, int i28) {
        com.tencent.mapsdk.internal.sj sjVar = this.f48979d;
        if (sjVar != null) {
            sjVar.a(com.tencent.mapsdk.internal.eu.b.a(i17));
            this.f48979d.a(com.tencent.mapsdk.internal.eu.a.TOP, i18);
            this.f48979d.a(com.tencent.mapsdk.internal.eu.a.BOTTOM, i19);
            this.f48979d.a(com.tencent.mapsdk.internal.eu.a.LEFT, i27);
            this.f48979d.a(com.tencent.mapsdk.internal.eu.a.RIGHT, i28);
            this.f48979d.h();
            j();
        }
    }

    @Override // com.tencent.mapsdk.internal.ak
    public final void b(int i17) {
        com.tencent.mapsdk.internal.sj sjVar = this.f48979d;
        if (sjVar != null) {
            sjVar.a(com.tencent.mapsdk.internal.eu.b.a(i17));
            j();
        }
    }

    @Override // com.tencent.mapsdk.internal.ak
    public final void b(int i17, int i18, int i19, int i27, int i28) {
        com.tencent.mapsdk.internal.sj sjVar = this.f48979d;
        if (sjVar != null) {
            sjVar.b(com.tencent.mapsdk.internal.eu.b.a(i17));
            this.f48979d.b(com.tencent.mapsdk.internal.eu.a.TOP, i18);
            this.f48979d.b(com.tencent.mapsdk.internal.eu.a.BOTTOM, i19);
            this.f48979d.b(com.tencent.mapsdk.internal.eu.a.LEFT, i27);
            this.f48979d.b(com.tencent.mapsdk.internal.eu.a.RIGHT, i28);
            this.f48979d.i();
            j();
        }
    }

    @Override // com.tencent.mapsdk.internal.ak
    public final void a(int i17, int[] iArr) {
        if (this.f48979d != null) {
            com.tencent.mapsdk.internal.eu.b a17 = com.tencent.mapsdk.internal.eu.b.a(i17);
            this.f48979d.a(a17);
            int i18 = com.tencent.mapsdk.internal.bk.AnonymousClass3.f48990a[a17.ordinal()];
            if (i18 == 1) {
                this.f48979d.a(com.tencent.mapsdk.internal.eu.a.TOP, iArr[0]);
                this.f48979d.a(com.tencent.mapsdk.internal.eu.a.LEFT, iArr[1]);
            } else if (i18 == 2) {
                this.f48979d.a(com.tencent.mapsdk.internal.eu.a.BOTTOM, iArr[0]);
                this.f48979d.a(com.tencent.mapsdk.internal.eu.a.LEFT, iArr[1]);
            } else if (i18 == 3) {
                this.f48979d.a(com.tencent.mapsdk.internal.eu.a.BOTTOM, iArr[0]);
                this.f48979d.a(com.tencent.mapsdk.internal.eu.a.RIGHT, iArr[1]);
            } else if (i18 == 4) {
                this.f48979d.a(com.tencent.mapsdk.internal.eu.a.TOP, iArr[0]);
                this.f48979d.a(com.tencent.mapsdk.internal.eu.a.RIGHT, iArr[1]);
            }
            this.f48979d.h();
            j();
        }
    }

    private void b(boolean z17, java.util.List<com.tencent.mapsdk.internal.ss> list) {
        com.tencent.mapsdk.internal.tr trVar;
        com.tencent.mapsdk.internal.sj sjVar = this.f48979d;
        if (sjVar == null || (trVar = this.f48977b) == null || trVar.e_ == 0) {
            return;
        }
        sjVar.a(list);
        if (z17) {
            this.f48979d.g();
        }
        this.f48979d.a(this.f48977b.af(), ((com.tencent.mapsdk.internal.ne) this.f48977b.d_).o());
    }

    @Override // com.tencent.mapsdk.internal.fh
    public final void a(com.tencent.mapsdk.internal.ga gaVar) {
        int i17 = gaVar.f49553f;
        if (i17 != -1) {
            this.f48984i.sendMessage(this.f48984i.obtainMessage(i17, gaVar));
        }
    }

    @Override // com.tencent.mapsdk.internal.ak
    public final void a(int i17, int i18) {
        com.tencent.mapsdk.internal.tr trVar = this.f48977b;
        if (trVar != null) {
            trVar.a(i17, i18);
        }
    }

    @Override // com.tencent.mapsdk.internal.ak
    public final void a(float f17) {
        com.tencent.mapsdk.internal.sj sjVar = this.f48979d;
        if (sjVar != null) {
            if (f17 > 1.3f) {
                f17 = 1.3f;
            }
            if (f17 < 0.7f) {
                f17 = 0.7f;
            }
            sjVar.f51405e = 0;
            sjVar.f51416q = f17;
            sjVar.h();
        }
    }

    private void a(com.tencent.mapsdk.internal.sj.c cVar, com.tencent.tencentmap.mapsdk.maps.TencentMapOptions tencentMapOptions) {
        com.tencent.mapsdk.internal.sj sjVar;
        if (tencentMapOptions == null || tencentMapOptions.getExtSurface() == null || (sjVar = this.f48979d) == null) {
            return;
        }
        java.util.List<com.tencent.mapsdk.internal.sj.c> list = sjVar.f51417r;
        if (list != null && cVar != null) {
            list.add(cVar);
        }
        int extSurfaceWidth = tencentMapOptions.getExtSurfaceWidth();
        int extSurfaceHeight = tencentMapOptions.getExtSurfaceHeight();
        android.view.ViewGroup ac6 = this.f48977b.ac();
        if (ac6 != null) {
            ac6.measure(android.view.View.MeasureSpec.makeMeasureSpec(extSurfaceWidth, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(extSurfaceHeight, 1073741824));
        }
        b(extSurfaceWidth, extSurfaceHeight);
    }

    public final void a(com.tencent.mapsdk.internal.qa.a aVar, com.tencent.tencentmap.mapsdk.maps.TencentMapOptions tencentMapOptions) {
        if (tencentMapOptions == null || tencentMapOptions.getExtSurface() == null) {
            return;
        }
        this.f48981f = aVar;
        int extSurfaceWidth = tencentMapOptions.getExtSurfaceWidth();
        int extSurfaceHeight = tencentMapOptions.getExtSurfaceHeight();
        android.view.ViewGroup ac6 = this.f48977b.ac();
        if (ac6 != null) {
            ac6.measure(android.view.View.MeasureSpec.makeMeasureSpec(extSurfaceWidth, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(extSurfaceHeight, 1073741824));
        }
        b(extSurfaceWidth, extSurfaceHeight);
    }

    @Override // com.tencent.mapsdk.internal.bc
    public final void a(boolean z17, java.util.List<com.tencent.mapsdk.internal.ss> list) {
        com.tencent.mapsdk.internal.tr trVar;
        com.tencent.mapsdk.internal.sj sjVar = this.f48979d;
        if (sjVar == null || (trVar = this.f48977b) == null || trVar.e_ == 0) {
            return;
        }
        sjVar.a(list);
        if (z17) {
            this.f48979d.g();
        }
        this.f48979d.a(this.f48977b.af(), ((com.tencent.mapsdk.internal.ne) this.f48977b.d_).o());
    }

    private static /* synthetic */ void a(com.tencent.mapsdk.internal.bk bkVar, android.os.Bundle bundle) {
        android.view.ViewGroup ac6 = bkVar.f48977b.ac();
        java.util.Iterator<com.tencent.mapsdk.internal.eu> it = bkVar.f48983h.iterator();
        while (it.hasNext()) {
            it.next().a(ac6, bundle);
        }
    }
}
