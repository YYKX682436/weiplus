package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public class h7 implements p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public boolean f282518d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f282519e = false;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b f282520f;

    public h7(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b) {
        this.f282520f = viewOnClickListenerC21748xb3d38e6b;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrollStateChanged */
    public void mo8331xcb2941fe(int i17) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b = this.f282520f;
        if (i17 == 2) {
            viewOnClickListenerC21748xb3d38e6b.P3 = true;
            viewOnClickListenerC21748xb3d38e6b.R3 = true;
        }
        if (i17 == 0) {
            this.f282519e = false;
            boolean z17 = viewOnClickListenerC21748xb3d38e6b.P3;
            viewOnClickListenerC21748xb3d38e6b.P3 = false;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.q3 q3Var = viewOnClickListenerC21748xb3d38e6b.f282138e3;
            if (q3Var != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryOPLayer", "clearAlpha: ");
                q3Var.f282827c = -1;
                q3Var.f282828d = 0.0f;
                android.util.SparseArray sparseArray = q3Var.f282825a;
                int size = sparseArray.size();
                for (int i18 = 0; i18 < size; i18++) {
                    sparseArray.keyAt(i18);
                    ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.g4) sparseArray.valueAt(i18)).f282479a.f346937a.setAlpha(1.0f);
                }
            }
        }
        if (i17 == 1) {
            viewOnClickListenerC21748xb3d38e6b.R3 = true;
        }
        if (viewOnClickListenerC21748xb3d38e6b.X1 != null && (k1Var = viewOnClickListenerC21748xb3d38e6b.f282144g) != null && k1Var.w() != null && viewOnClickListenerC21748xb3d38e6b.f282144g.w().m78014x7b98c171() && i17 == 1) {
            viewOnClickListenerC21748xb3d38e6b.X1.m81477xae17c85(true);
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var2 = viewOnClickListenerC21748xb3d38e6b.f282144g;
        if (k1Var2 != null) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.t2 t2Var = k1Var2.f282630o;
            if (t2Var != null) {
                t2Var.f282925q = i17;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k3 k3Var = t2Var.f282919h;
                if (k3Var != null) {
                    k3Var.mo8331xcb2941fe(i17);
                }
            }
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.j1 j1Var = k1Var2.f282631p;
            if (j1Var != null) {
                j1Var.f282578h = i17;
            }
            k1Var2.f282639x.f518775d.mo8331xcb2941fe(i17);
        }
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrolled */
    public void mo8332xf210c75a(int i17, float f17, int i18) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.q3 q3Var;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b = this.f282520f;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ScaleGestureDetectorOnScaleGestureListenerC22653x4730490d scaleGestureDetectorOnScaleGestureListenerC22653x4730490d = viewOnClickListenerC21748xb3d38e6b.X1;
        if (scaleGestureDetectorOnScaleGestureListenerC22653x4730490d != null && scaleGestureDetectorOnScaleGestureListenerC22653x4730490d.m81464xb7cf71c7() > 1.0f && (k1Var = viewOnClickListenerC21748xb3d38e6b.f282144g) != null && k1Var.w() != null && viewOnClickListenerC21748xb3d38e6b.f282144g.w().m78014x7b98c171()) {
            if (i18 > 20) {
                viewOnClickListenerC21748xb3d38e6b.X1.m81477xae17c85(false);
            } else {
                viewOnClickListenerC21748xb3d38e6b.X1.m81477xae17c85(true);
            }
        }
        if (!this.f282519e && i18 > 0) {
            this.f282519e = true;
        }
        try {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var2 = viewOnClickListenerC21748xb3d38e6b.f282144g;
            if (k1Var2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImageGalleryUI", "adapter is null return");
                return;
            }
            if (k1Var2.f282630o == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImageGalleryUI", "adapter.mImageHandler is null return");
                return;
            }
            k1Var2.f282639x.f518775d.mo8332xf210c75a(i17, f17, i18);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var3 = viewOnClickListenerC21748xb3d38e6b.f282144g;
            if (k1Var3 != null && viewOnClickListenerC21748xb3d38e6b.R3) {
                float f18 = viewOnClickListenerC21748xb3d38e6b.S3;
                if (f18 > 0.0f) {
                    if (f17 > f18) {
                        i17++;
                        this.f282518d = true;
                    } else {
                        this.f282518d = false;
                    }
                    if (k1Var3.f282630o.G(k1Var3.y(i17)) == 0) {
                        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var4 = viewOnClickListenerC21748xb3d38e6b.f282144g;
                        if (!k1Var4.U(i17)) {
                            k1Var4.f282630o.m(i17);
                        }
                    }
                    viewOnClickListenerC21748xb3d38e6b.R3 = false;
                }
            }
            if (!viewOnClickListenerC21748xb3d38e6b.R3 && (q3Var = viewOnClickListenerC21748xb3d38e6b.f282138e3) != null) {
                q3Var.e(f17, this.f282518d);
            }
            viewOnClickListenerC21748xb3d38e6b.S3 = f17;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImageGalleryUI", "load neighbor image failed, t = " + th6.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v13, types: [g90.s] */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v7 */
    /* JADX WARN: Type inference failed for: r20v8, types: [int] */
    /* JADX WARN: Type inference failed for: r20v9 */
    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageSelected */
    public void mo8333x510f45c9(int i17) {
        long j17;
        int i18;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 w17;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b = this.f282520f;
        if (viewOnClickListenerC21748xb3d38e6b.f282144g == null) {
            return;
        }
        viewOnClickListenerC21748xb3d38e6b.M8();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b2 = this.f282520f;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.q3 q3Var = viewOnClickListenerC21748xb3d38e6b2.f282138e3;
        if (q3Var != null) {
            q3Var.f282826b = i17;
            viewOnClickListenerC21748xb3d38e6b2.b7(i17);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.j1 j1Var = this.f282520f.f282144g.f282631p;
            if (j1Var != null && (j1Var instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ja)) {
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ja) j1Var).P(null);
            }
        }
        this.f282520f.S1 = false;
        if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ja.H()) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b3 = this.f282520f;
            viewOnClickListenerC21748xb3d38e6b3.f282169m4.mo50300x3fa464aa(viewOnClickListenerC21748xb3d38e6b3.f282150h3);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var2 = this.f282520f.f282144g;
            if (k1Var2 != null && k1Var2.w() != null && this.f282520f.f282144g.w().m78014x7b98c171()) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b4 = this.f282520f;
                viewOnClickListenerC21748xb3d38e6b4.f282169m4.mo50297x7c4d7ca2(viewOnClickListenerC21748xb3d38e6b4.f282150h3, 2000L);
                if (this.f282520f.f282144g.v() != null && this.f282520f.f282144g.v().f282971p != null) {
                    ((pk4.d) this.f282520f.f282144g.v().f282971p).mo69432x8983b21d(1.0f);
                }
            }
        }
        if (this.f282520f.E7()) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b5 = this.f282520f;
            if (viewOnClickListenerC21748xb3d38e6b5.X1 != null && (k1Var = viewOnClickListenerC21748xb3d38e6b5.f282144g) != null && k1Var.w() != null) {
                if (this.f282520f.f282144g.w().m78014x7b98c171()) {
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.l lVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.l.f282696a;
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.l.f282699d = java.lang.Long.valueOf(this.f282520f.f282144g.w().m124847x74d37ac6());
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.p pVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.p.f282787a;
                    this.f282520f.f282144g.w().getClass();
                    this.f282520f.X1.m81477xae17c85(true);
                    if (this.f282520f.X1.getLongPressListener() == null) {
                        this.f282520f.X1.m81479xe15240b9(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.i7(this));
                    }
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b6 = this.f282520f;
                    viewOnClickListenerC21748xb3d38e6b6.f282178p = false;
                    viewOnClickListenerC21748xb3d38e6b6.f282170n.m79169xf8a6a4f2(null);
                } else if (this.f282520f.f282144g.w().J2()) {
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.l.f282699d = null;
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.p pVar2 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.p.f282787a;
                    this.f282520f.X1.m81477xae17c85(false);
                    this.f282520f.X1.m81479xe15240b9(null);
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b7 = this.f282520f;
                    if (!viewOnClickListenerC21748xb3d38e6b7.f282178p) {
                        viewOnClickListenerC21748xb3d38e6b7.f282178p = true;
                        viewOnClickListenerC21748xb3d38e6b7.f282170n.m79169xf8a6a4f2(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.j7(this));
                    }
                }
            }
        }
        this.f282520f.Q.setVisibility(8);
        android.view.View view = this.f282520f.S;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$63", "onPageSelected", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$63", "onPageSelected", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.j1 j1Var2 = this.f282520f.f282144g.f282631p;
        if (j1Var2 != null && (w17 = j1Var2.f282419d.w()) != null) {
            fk4.k a17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.l.f282696a.a(w17.m124847x74d37ac6());
            if (a17 != null && !a17.f345151f) {
                a17.f345157l = j1Var2;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b8 = j1Var2.f282419d.f282625g;
                int l17 = t21.d3.l(w17.z0());
                viewOnClickListenerC21748xb3d38e6b8.getClass();
                t23.p0.n().c(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.b8(viewOnClickListenerC21748xb3d38e6b8, l17));
            }
        }
        this.f282520f.R8(i17);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b9 = this.f282520f;
        if (!viewOnClickListenerC21748xb3d38e6b9.Q3) {
            yd5.q.f542678a.b(viewOnClickListenerC21748xb3d38e6b9.f282140f ? 2 : 1);
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b10 = this.f282520f;
        if (!viewOnClickListenerC21748xb3d38e6b10.Q3) {
            ((ic5.b) viewOnClickListenerC21748xb3d38e6b10.m80391xac8f1cfd(ic5.b.class)).f371964g = 2;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var3 = viewOnClickListenerC21748xb3d38e6b10.f282144g;
        if (k1Var3 != null) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 w18 = k1Var3.w();
            ic5.b bVar = (ic5.b) viewOnClickListenerC21748xb3d38e6b10.m80391xac8f1cfd(ic5.b.class);
            bVar.getClass();
            if (w18 != null) {
                java.lang.String b17 = ic5.f.f371970c.b(w18);
                java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) bVar.f371966i;
                java.lang.Object obj = linkedHashMap.get(b17);
                if (obj == null) {
                    obj = new java.util.LinkedHashMap();
                    linkedHashMap.put(b17, obj);
                }
                java.util.LinkedHashMap linkedHashMap2 = (java.util.LinkedHashMap) obj;
                if (!linkedHashMap2.containsKey(java.lang.Long.valueOf(w18.m124847x74d37ac6()))) {
                    linkedHashMap2.put(java.lang.Long.valueOf(w18.m124847x74d37ac6()), w18);
                }
            }
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b11 = this.f282520f;
        if (viewOnClickListenerC21748xb3d38e6b11.O3 != i17) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = viewOnClickListenerC21748xb3d38e6b11.f282184q2;
            if (k0Var != null && k0Var.i()) {
                this.f282520f.f282184q2.u();
            }
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b12 = this.f282520f;
            viewOnClickListenerC21748xb3d38e6b12.getClass();
            ((c35.m) i95.n0.c(c35.m.class)).getClass();
            viewOnClickListenerC21748xb3d38e6b12.X.setVisibility(8);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b13 = this.f282520f;
            if (!viewOnClickListenerC21748xb3d38e6b13.Q3) {
                viewOnClickListenerC21748xb3d38e6b13.O8();
                this.f282520f.B8();
                this.f282520f.f282124a3.c(2, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.t2.v(this.f282520f.f282144g.w()));
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b14 = this.f282520f;
                int i19 = viewOnClickListenerC21748xb3d38e6b14.H;
                if (i19 != 0 && (!viewOnClickListenerC21748xb3d38e6b14.f282207x2.f(i19) || !viewOnClickListenerC21748xb3d38e6b14.f282207x2.a(viewOnClickListenerC21748xb3d38e6b14.H))) {
                    int i27 = viewOnClickListenerC21748xb3d38e6b14.f282212y2 + 1;
                    viewOnClickListenerC21748xb3d38e6b14.f282212y2 = i27;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryUI", "checkQuickButtonWhenPageChanged not valid %d, currentButtonType: %d", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(viewOnClickListenerC21748xb3d38e6b14.H));
                    if (viewOnClickListenerC21748xb3d38e6b14.f282212y2 >= 2) {
                        viewOnClickListenerC21748xb3d38e6b14.m8(0, false);
                        viewOnClickListenerC21748xb3d38e6b14.f282212y2 = 0;
                    }
                }
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b15 = this.f282520f;
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 y17 = viewOnClickListenerC21748xb3d38e6b15.f282144g.y(viewOnClickListenerC21748xb3d38e6b15.O3);
                if (y17 != null && (y17.m78014x7b98c171() || y17.J2())) {
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b16 = this.f282520f;
                    ?? r202 = viewOnClickListenerC21748xb3d38e6b16.A2 ? 3 : (viewOnClickListenerC21748xb3d38e6b16.f282144g.w() == null || y17.m124847x74d37ac6() == this.f282520f.f282144g.w().m124847x74d37ac6()) ? viewOnClickListenerC21748xb3d38e6b16.B2 : 2;
                    h90.v vVar = (h90.v) i95.n0.c(h90.v.class);
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b17 = this.f282520f;
                    ((g90.s) vVar).ij(viewOnClickListenerC21748xb3d38e6b17, y17, 1, 4, r202, viewOnClickListenerC21748xb3d38e6b17.d7(y17));
                }
            }
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b18 = this.f282520f;
            oc5.m mVar = viewOnClickListenerC21748xb3d38e6b18.f282207x2;
            mVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageScanButtonStatusManager", "resetSet");
            mVar.f426000c.remove(1);
            mVar.f426000c.remove(2);
            mVar.f426000c.remove(6);
            java.util.Iterator it = mVar.f425998a.iterator();
            while (it.hasNext()) {
                int intValue = ((java.lang.Number) it.next()).intValue();
                mVar.b(intValue);
                oc5.e eVar = (oc5.e) mVar.f425999b.get(java.lang.Integer.valueOf(intValue));
                if (eVar != null) {
                    ((oc5.f) eVar).f425942b = true;
                }
            }
            oc5.l0 l0Var = viewOnClickListenerC21748xb3d38e6b18.f282196u2;
            l0Var.f425984a.clear();
            l0Var.f425985b = null;
            l0Var.f425986c = null;
            oc5.g0 g0Var = viewOnClickListenerC21748xb3d38e6b18.f282202w2;
            if (g0Var != null) {
                g0Var.f425958i = null;
                g0Var.f425959j = 0L;
                g0Var.f425960k = false;
                g0Var.f425961l = false;
                g0Var.f425962m = 0L;
                g0Var.f425963n = null;
                g0Var.f425964o = false;
            }
            viewOnClickListenerC21748xb3d38e6b18.K2 = false;
            viewOnClickListenerC21748xb3d38e6b18.L2 = 0;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.n8 n8Var = viewOnClickListenerC21748xb3d38e6b18.E3;
            n8Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryUI", "reset#ScanState");
            n8Var.f282753a = 0;
            viewOnClickListenerC21748xb3d38e6b18.F = null;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b19 = this.f282520f;
            if (viewOnClickListenerC21748xb3d38e6b19.M2 == 1) {
                viewOnClickListenerC21748xb3d38e6b19.y7(false);
            }
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b20 = this.f282520f;
            viewOnClickListenerC21748xb3d38e6b20.M2 = 0;
            viewOnClickListenerC21748xb3d38e6b20.J2 = 0;
        }
        if (this.f282520f.f282144g.e(i17) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImageGalleryUI", "onPageSelected the view is null, position = %s ", java.lang.Integer.valueOf(i17));
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b21 = this.f282520f;
        viewOnClickListenerC21748xb3d38e6b21.f282144g.w();
        viewOnClickListenerC21748xb3d38e6b21.f282170n.m79168x9bfee16e(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.x5(viewOnClickListenerC21748xb3d38e6b21, viewOnClickListenerC21748xb3d38e6b21.c8()));
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b22 = this.f282520f;
        viewOnClickListenerC21748xb3d38e6b22.C9(viewOnClickListenerC21748xb3d38e6b22.O3);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b23 = this.f282520f;
        viewOnClickListenerC21748xb3d38e6b23.f282209y.d(viewOnClickListenerC21748xb3d38e6b23, viewOnClickListenerC21748xb3d38e6b23.O3, i17);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b24 = this.f282520f;
        viewOnClickListenerC21748xb3d38e6b24.O3 = i17;
        viewOnClickListenerC21748xb3d38e6b24.S3 = 0.0f;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var4 = viewOnClickListenerC21748xb3d38e6b24.f282144g;
        if (k1Var4 != null) {
            k1Var4.f282631p.z();
            k1Var4.f282632q.s();
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg = this.f282520f.f282144g.y(i17);
            if (msg != null) {
                this.f282520f.D = msg.m124847x74d37ac6();
                this.f282520f.E = msg.Q0();
                this.f282520f.Q1 = msg.I0();
                ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Di(msg.Q0(), 1);
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b25 = this.f282520f;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var5 = viewOnClickListenerC21748xb3d38e6b25.f282144g;
                viewOnClickListenerC21748xb3d38e6b25.f282166m = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1.B(msg);
                com.p314xaae8f345.mm.ui.p2731xc84c5534.C22471x941a9a3f.c(this.f282520f).f291149h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.r0(this.f282520f.Q1);
            }
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b26 = this.f282520f;
            if (viewOnClickListenerC21748xb3d38e6b26.A2) {
                vh5.a.f518731d = 3;
            } else if (viewOnClickListenerC21748xb3d38e6b26.B2) {
                vh5.a.f518731d = 1;
            }
            if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1.L(msg) || com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1.G(msg) || com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1.K(msg)) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b27 = this.f282520f;
                android.view.View K7 = viewOnClickListenerC21748xb3d38e6b27.K7(viewOnClickListenerC21748xb3d38e6b27.f282144g, viewOnClickListenerC21748xb3d38e6b27.f282170n);
                if (K7 != null && (K7 instanceof db5.f0)) {
                    if (K7 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a) {
                        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a) K7).i();
                    } else if (K7 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) {
                        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) K7).i();
                    }
                }
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b28 = this.f282520f;
                android.view.View a76 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b.a7(viewOnClickListenerC21748xb3d38e6b28, viewOnClickListenerC21748xb3d38e6b28.f282144g, viewOnClickListenerC21748xb3d38e6b28.f282170n);
                if (a76 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) {
                    ((com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) a76).m45737x3a5986f(false);
                }
                bx1.t tVar = (bx1.t) i95.n0.c(bx1.t.class);
                boolean z17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.d2.f282382o != i17;
                ((fq3.w) tVar).getClass();
                if (!gm0.j1.a() || msg == null) {
                    j17 = 0;
                } else {
                    j17 = 0;
                    if (msg.m124847x74d37ac6() > 0 && msg.A0() == 0) {
                        ((fq3.n) i95.n0.c(fq3.n.class)).aj();
                        ((ku5.t0) ku5.t0.f394148d).g(new oq3.a(msg, z17));
                    }
                }
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b29 = this.f282520f;
                java.lang.String H7 = viewOnClickListenerC21748xb3d38e6b29.H7();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryUI", "checkImageItemSourceUrl url: %s", H7);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(H7) || m11.p0.a(H7)) {
                    i18 = 6;
                    viewOnClickListenerC21748xb3d38e6b29.f282207x2.g(6, 2);
                } else {
                    i18 = 6;
                    viewOnClickListenerC21748xb3d38e6b29.f282207x2.g(6, 1);
                }
                viewOnClickListenerC21748xb3d38e6b29.l7(i18, false);
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b30 = this.f282520f;
                if (!viewOnClickListenerC21748xb3d38e6b30.f282208x3) {
                    h90.v vVar2 = (h90.v) i95.n0.c(h90.v.class);
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b31 = this.f282520f;
                    ((g90.s) vVar2).cj(viewOnClickListenerC21748xb3d38e6b31, msg, 1, 2, viewOnClickListenerC21748xb3d38e6b31.c7(msg));
                } else if (viewOnClickListenerC21748xb3d38e6b30.A2) {
                    h90.v vVar3 = (h90.v) i95.n0.c(h90.v.class);
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b32 = this.f282520f;
                    ((g90.s) vVar3).cj(viewOnClickListenerC21748xb3d38e6b32, msg, 1, 3, viewOnClickListenerC21748xb3d38e6b32.c7(msg));
                } else if (viewOnClickListenerC21748xb3d38e6b30.B2) {
                    h90.v vVar4 = (h90.v) i95.n0.c(h90.v.class);
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b33 = this.f282520f;
                    ((g90.s) vVar4).cj(viewOnClickListenerC21748xb3d38e6b33, msg, 1, 1, viewOnClickListenerC21748xb3d38e6b33.c7(msg));
                }
                com.p314xaae8f345.mm.ui.p2731xc84c5534.C22471x941a9a3f.c(this.f282520f).f291150i = com.p314xaae8f345.mm.ui.p2731xc84c5534.h0.Image;
            } else {
                if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1.N(msg)) {
                    this.f282520f.P1 = java.lang.System.currentTimeMillis();
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b34 = this.f282520f;
                    if (!viewOnClickListenerC21748xb3d38e6b34.f282208x3) {
                        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(this.f282520f.T1, "report_scene", 2);
                        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(this.f282520f.R1, "report_scene", 2);
                        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19737x80a67750 c19737x80a67750 = this.f282520f.L1;
                        if (c19737x80a67750 instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19739x911a23ee) {
                            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19739x911a23ee) c19737x80a67750, "report_scene", 2);
                        }
                        yd5.p.f542661r = 2;
                        h90.v vVar5 = (h90.v) i95.n0.c(h90.v.class);
                        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b35 = this.f282520f;
                        ((g90.s) vVar5).cj(viewOnClickListenerC21748xb3d38e6b35, msg, 1, 2, viewOnClickListenerC21748xb3d38e6b35.c7(msg));
                    } else if (viewOnClickListenerC21748xb3d38e6b34.A2) {
                        h90.v vVar6 = (h90.v) i95.n0.c(h90.v.class);
                        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b36 = this.f282520f;
                        ((g90.s) vVar6).cj(viewOnClickListenerC21748xb3d38e6b36, msg, 1, 3, viewOnClickListenerC21748xb3d38e6b36.c7(msg));
                    } else if (viewOnClickListenerC21748xb3d38e6b34.B2) {
                        h90.v vVar7 = (h90.v) i95.n0.c(h90.v.class);
                        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b37 = this.f282520f;
                        ((g90.s) vVar7).cj(viewOnClickListenerC21748xb3d38e6b37, msg, 1, 1, viewOnClickListenerC21748xb3d38e6b37.c7(msg));
                    }
                    ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).getClass();
                    if (msg != null && msg.m124847x74d37ac6() > 0 && msg.A0() == 0) {
                        ((fq3.n) i95.n0.c(fq3.n.class)).aj();
                        ((fq3.n) i95.n0.c(fq3.n.class)).aj();
                        java.lang.String str = msg.I0() + "_3";
                        fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
                        nVar.m134976x2690a4ac();
                        nVar.A.Z6(str);
                        fq3.n nVar2 = (fq3.n) i95.n0.c(fq3.n.class);
                        nVar2.m134976x2690a4ac();
                        nVar2.B.d(msg.m124847x74d37ac6(), 3, msg.I0());
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CPreDownloadPLC", "c2c pre download: video msg open, msgId:" + msg.m124847x74d37ac6());
                    }
                    boolean z18 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.d2.f282382o != i17;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
                    if (msg.A0() != 1) {
                        ((ku5.t0) ku5.t0.f394148d).g(new f65.t(msg, z18));
                    }
                    com.p314xaae8f345.mm.ui.p2731xc84c5534.C22471x941a9a3f.c(this.f282520f).f291150i = com.p314xaae8f345.mm.ui.p2731xc84c5534.h0.Video;
                }
                j17 = 0;
            }
            if (msg != null) {
                this.f282520f.Q8(msg.m124847x74d37ac6());
            }
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var6 = this.f282520f.f282144g;
            if (k1Var6 != null) {
                m11.b0 x17 = k1Var6.x(msg, false);
                if (this.f282520f.f282144g.H(msg, x17)) {
                    ((j70.e) ((k70.z) i95.n0.c(k70.z.class))).getClass();
                    int i28 = m11.c0.d(x17).f404169d;
                    long j18 = i28 != 0 ? ((r2.f404168c * 100) / i28) - 1 : j17;
                    java.lang.System.currentTimeMillis();
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b38 = this.f282520f;
                    viewOnClickListenerC21748xb3d38e6b38.n8();
                    viewOnClickListenerC21748xb3d38e6b38.o9(false);
                    viewOnClickListenerC21748xb3d38e6b38.d9((int) j18);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImageGalleryUI", "[arthurdan.ImageGallery] Notice!!! adapter is null");
            }
            if (msg == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImageGalleryUI", "update footer fail, msg is null, position = " + i17);
            } else {
                com.p314xaae8f345.mm.ui.p2731xc84c5534.C22471x941a9a3f.c(this.f282520f).b(com.p314xaae8f345.mm.ui.p2731xc84c5534.i0.Preview);
                this.f282520f.y9(i17, msg, !r4.Q3);
                this.f282520f.Q3 = false;
            }
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var7 = this.f282520f.f282144g;
        if (k1Var7 != null) {
            k1Var7.m79606x510f45c9(i17);
            if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1.K(this.f282520f.f282144g.w())) {
                this.f282520f.f282170n.m79167xa8f8963d(false);
            } else {
                this.f282520f.f282170n.m79167xa8f8963d(true);
            }
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b39 = this.f282520f;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var8 = viewOnClickListenerC21748xb3d38e6b39.f282144g;
        if (k1Var8 != null) {
            java.lang.Boolean A = k1Var8.A(k1Var8.y(viewOnClickListenerC21748xb3d38e6b39.O3));
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b40 = this.f282520f;
            viewOnClickListenerC21748xb3d38e6b40.h7(viewOnClickListenerC21748xb3d38e6b40.f282144g.y(viewOnClickListenerC21748xb3d38e6b40.O3), A != null ? A.booleanValue() : false);
            this.f282520f.r7();
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var9 = this.f282520f.f282144g;
        if (k1Var9 == null || k1Var9.w() == null) {
            return;
        }
        if (this.f282520f.f282144g.w().Y2() || this.f282520f.f282144g.w().m78014x7b98c171() || this.f282520f.f282144g.w().M2()) {
            final java.lang.String J7 = this.f282520f.J7();
            ((ku5.t0) ku5.t0.f394148d).g(new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.gallery.h7$$a
                @Override // java.lang.Runnable
                public final void run() {
                    java.lang.String str2 = J7;
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.h7 h7Var = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.h7.this;
                    h7Var.getClass();
                    try {
                        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d a18 = com.p314xaae8f345.mm.p962x4177e4be.j.a(str2);
                        ((java.util.concurrent.ConcurrentHashMap) h7Var.f282520f.U3).put(str2, java.lang.Float.valueOf(a18.f152724d / a18.f152725e));
                    } catch (java.lang.RuntimeException unused) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ImageGalleryUI", "try decode videoRealRatio failed, skip");
                    }
                }
            });
        }
    }
}
