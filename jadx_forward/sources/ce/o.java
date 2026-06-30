package ce;

/* loaded from: classes7.dex */
public class o extends re.a implements ce.g, ce.d {

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.p425x1ea3c036.p428x304bf2.p431x34628f.C3895x4edfdd1b f122218f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 f122219g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ia f122220h;

    /* renamed from: i, reason: collision with root package name */
    public ce.e f122221i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f122222m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f122223n;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.Bitmap f122224o;

    /* renamed from: p, reason: collision with root package name */
    public android.graphics.Bitmap f122225p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ImageView f122226q;

    /* renamed from: r, reason: collision with root package name */
    public final ce.a f122227r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f122228s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.ArrayList f122229t;

    /* renamed from: u, reason: collision with root package name */
    public volatile ce.y f122230u;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View.OnAttachStateChangeListener f122231v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.FrameLayout f122232w;

    public o(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b bVar) {
        super(bVar);
        this.f122222m = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f122223n = new java.util.concurrent.atomic.AtomicBoolean(true);
        this.f122228s = new java.util.concurrent.atomic.AtomicBoolean(false);
        java.util.ArrayList arrayList = new java.util.ArrayList(3);
        this.f122229t = arrayList;
        this.f122230u = null;
        this.f122231v = new ce.q(this);
        this.f122227r = new ce.a();
        W();
        arrayList.add(0, new de.d());
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0 y17 = bVar.v3().y1();
        synchronized (this.f128864e) {
            ((java.util.HashMap) this.f128864e).putAll(y17.f128864e);
        }
    }

    @Override // ce.d
    public void C(android.view.View view) {
        if (view.getVisibility() == 0 && this.f122228s.compareAndSet(false, true)) {
            ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F()).D2("onNativeWidgetViewAdded");
        }
    }

    @Override // ni1.d
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb D(android.content.Context context) {
        return this.f122227r;
    }

    public final void K(final java.util.ArrayList arrayList, final yz5.l lVar) {
        ze.n J2 = J();
        if (J2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.Game.WAGamePageViewRenderer", "hy: runtime released. no screen canvas captured");
            lVar.mo146xb9724478(null);
        } else if (!arrayList.isEmpty()) {
            ((de.a) arrayList.remove(0)).a(J2, new yz5.l() { // from class: ce.o$$f
                @Override // yz5.l
                /* renamed from: invoke */
                public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
                    android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
                    ce.o oVar = ce.o.this;
                    yz5.l lVar2 = lVar;
                    if (bitmap == null) {
                        oVar.K(arrayList, lVar2);
                        return null;
                    }
                    oVar.getClass();
                    lVar2.mo146xb9724478(bitmap);
                    return null;
                }
            });
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.Game.WAGamePageViewRenderer", "hy: ran through all the delegates and not found anyone can provide with capturing");
            lVar.mo146xb9724478(null);
        }
    }

    public final void M() {
        if (this.f122225p != null) {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.Game.WAGamePageViewRenderer", "hy: cleanupCanvasSecurityGuard");
                this.f122225p.recycle();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Luggage.Game.WAGamePageViewRenderer", e17, "hy: cleanupCanvasSecurityGuard error!", new java.lang.Object[0]);
            }
            this.f122225p = null;
        }
    }

    public final void N() {
        if (this.f122226q != null) {
            ce.u uVar = new ce.u(this);
            if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
                uVar.run();
            } else {
                try {
                    ((ku5.t0) ku5.t0.f394148d).B(uVar).get();
                } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.Game.WAGamePageViewRenderer", "cleanupCoverScreenshot await ui get exception %s", e17);
                }
            }
        }
        android.graphics.Bitmap bitmap = this.f122224o;
        if (bitmap != null) {
            try {
                bitmap.recycle();
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Luggage.Game.WAGamePageViewRenderer", e18, "hy: cleanupCoverScreenshot error!", new java.lang.Object[0]);
            }
            this.f122224o = null;
        }
    }

    public final void O(boolean z17, boolean z18) {
        if (!this.f122222m.get()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.Game.WAGamePageViewRenderer", "hy: should not show cover");
            return;
        }
        if (!u46.a.b(new xi1.o[]{xi1.o.LANDSCAPE_SENSOR, xi1.o.LANDSCAPE_LOCKED, xi1.o.LANDSCAPE_LEFT, xi1.o.LANDSCAPE_RIGHT}, ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F()).mo50261xee5260a9().mo51612x60543150().a())) {
            if (z17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new ce.x(this));
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.Game.WAGamePageViewRenderer", "hy:deal with landscape games");
            if (this.f122226q == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.Game.WAGamePageViewRenderer", "markBeforeStartToTransparent coverImage is NULL, return");
            } else {
                this.f122218f.m32058x4f5c2e33(new ce.w(this, z18));
            }
        }
    }

    public com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 P(android.content.Context context) {
        return new com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2(context, gh.y.SurfaceView);
    }

    public android.graphics.Bitmap Q(int i17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.Game.WAGamePageViewRenderer", "got message doGetCanvasBitmap");
        android.graphics.Bitmap bitmap = null;
        if (i17 == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.Game.WAGamePageViewRenderer", "got message doGetCanvasBitmap canvasId is illegal");
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.Game.WAGamePageViewRenderer", "got message doGetCanvasBitmap canvasId:%d,sync:%b", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 c4216x654bedf2 = this.f122219g;
        if (c4216x654bedf2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.Game.WAGamePageViewRenderer", "captureCanvas with [%d], view == null", java.lang.Integer.valueOf(i17));
        } else {
            bitmap = c4216x654bedf2.m34856x4a42b983().f130124o.a(this.f122219g.getVirtualElementId(), i17, false);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.Game.WAGamePageViewRenderer", "got message doGetCanvasBitmap end");
        return bitmap;
    }

    public android.graphics.Bitmap R() {
        if (this.f122225p == null) {
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.Game.WAGamePageViewRenderer", "hy: getCanvasSecurityGuardBitmap");
        return this.f122225p;
    }

    public final yd.u S() {
        ae.q qVar = (ae.q) ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F()).v3().z1(ae.q.class);
        if (qVar == null) {
            return null;
        }
        return ((ae.a) qVar).F0();
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0 T() {
        if (J() == null || J().C0().mo50357xcd94f799() == null) {
            return null;
        }
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0) J().C0().mo50357xcd94f799().h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0.class);
    }

    public com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 U() {
        return this.f122219g;
    }

    public void V(final boolean z17, final boolean z18, final de.a aVar) {
        N();
        this.f122223n.set(z18);
        this.f122222m.set(true);
        if (T() == null || T().g()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.Game.WAGamePageViewRenderer", "hy:markBeforeStartToTransparent");
            final yz5.l lVar = new yz5.l() { // from class: ce.o$$a
                @Override // yz5.l
                /* renamed from: invoke */
                public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
                    de.a aVar2;
                    android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
                    final ce.o oVar = ce.o.this;
                    oVar.f122224o = bitmap;
                    final boolean z19 = z17;
                    final boolean z27 = z18;
                    if (bitmap != null || (aVar2 = aVar) == null) {
                        oVar.O(z19, z27);
                        return null;
                    }
                    aVar2.a(oVar.J(), new yz5.l() { // from class: ce.o$$d
                        @Override // yz5.l
                        /* renamed from: invoke */
                        public final java.lang.Object mo146xb9724478(java.lang.Object obj2) {
                            final android.graphics.Bitmap bitmap2 = (android.graphics.Bitmap) obj2;
                            final ce.o oVar2 = ce.o.this;
                            oVar2.getClass();
                            final boolean z28 = z19;
                            final boolean z29 = z27;
                            ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) oVar2.F()).T0(new java.lang.Runnable() { // from class: ce.o$$g
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ce.o oVar3 = ce.o.this;
                                    oVar3.f122224o = bitmap2;
                                    oVar3.f122226q.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
                                    oVar3.O(z28, z29);
                                }
                            });
                            return null;
                        }
                    });
                    return null;
                }
            };
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0 T = T();
            if (T != null) {
                T.mo51545x3498a0(new java.lang.Runnable() { // from class: ce.o$$c
                    @Override // java.lang.Runnable
                    public final void run() {
                        ce.o oVar = ce.o.this;
                        oVar.getClass();
                        oVar.K(new java.util.ArrayList(oVar.f122229t), lVar);
                    }
                });
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.Game.WAGamePageViewRenderer", "hy: js thread handler is empty");
                lVar.mo146xb9724478(null);
            }
        }
    }

    public void W() {
        G(ce.g.class, this);
    }

    public void X(com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 abstractC4208x204d5c83, java.util.List list) {
        yg.a aVar;
        if (abstractC4208x204d5c83 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.Game.WAGamePageViewRenderer", "hy: can not retrieve runtime!");
            return;
        }
        yg.h hVar = abstractC4208x204d5c83.f130118i;
        synchronized (hVar.f543597a) {
            aVar = hVar.f543599c;
        }
        list.add(new yd.v("RT-FPS", "" + java.lang.Math.round(aVar.f543551a)));
        list.add(new yd.v("EX-FPS", "" + java.lang.Math.round(aVar.f543552b)));
        list.add(new yd.v("Jank", "" + aVar.f543553c));
        list.add(new yd.v("BigJank", "" + aVar.f543554d));
        list.add(new yd.v("Stutter", java.lang.String.format(java.util.Locale.ENGLISH, "%.2f%%", java.lang.Float.valueOf(aVar.f543555e * 100.0f))));
    }

    public void Y() {
        if (this.f122228s.compareAndSet(false, true)) {
            ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F()).D2("onFirstFrame");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.w.e(H(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.f35238x8d52c309);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.w.e(H(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.f35236xdb4180a6);
        }
    }

    public void Z(boolean z17) {
        yd.n nVar;
        com.p314xaae8f345.p425x1ea3c036.p428x304bf2.p431x34628f.C3895x4edfdd1b c3895x4edfdd1b = this.f122218f;
        if (c3895x4edfdd1b == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.Game.WAGamePageViewRenderer", "WVA.switchToWVAContainer: mRootView is null");
            return;
        }
        if (z17) {
            if (this.f122219g.getParent() == null) {
                this.f122218f.addView(this.f122219g, 0, new android.view.ViewGroup.LayoutParams(-1, -1));
            }
            if (this.f122232w.getParent() == null) {
                this.f122218f.addView(this.f122232w, 0, new android.view.ViewGroup.LayoutParams(-1, -1));
                return;
            }
            return;
        }
        c3895x4edfdd1b.removeView(this.f122219g);
        if (this.f122232w.getParent() == null) {
            this.f122218f.addView(this.f122232w, 0, new android.view.ViewGroup.LayoutParams(-1, -1));
        }
        yd.u S = S();
        if (S == null || (nVar = S.f542499b) == null) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = nVar.f542491m;
        nVar.setVisibility(8);
        b4Var.d();
    }

    @Override // ni1.d
    public boolean a(int i17, java.lang.String str) {
        if (F() != null) {
            ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F()).v3().a(i17, str);
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.Game.WAGamePageViewRenderer", "callback: component is null, callbackId: %d", java.lang.Integer.valueOf(i17));
        return true;
    }

    @Override // ni1.d
    public boolean d(java.lang.String str, java.lang.String str2, int[] iArr) {
        if (F() != null) {
            ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F()).v3().g(str, str2);
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.Game.WAGamePageViewRenderer", "publish: component is null, event: %s", str);
        return true;
    }

    @Override // ni1.d
    public boolean e(java.lang.String str, java.lang.String str2, int i17) {
        if (F() != null) {
            ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F()).v3().e(str, str2, i17);
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.Game.WAGamePageViewRenderer", "dispatch: component is null, event: %s src:%d", str, java.lang.Integer.valueOf(i17));
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d7
    public android.view.View f(android.view.LayoutInflater layoutInflater) {
        com.p314xaae8f345.p425x1ea3c036.p428x304bf2.p431x34628f.C3895x4edfdd1b c3895x4edfdd1b = new com.p314xaae8f345.p425x1ea3c036.p428x304bf2.p431x34628f.C3895x4edfdd1b(layoutInflater.getContext(), null);
        this.f122218f = c3895x4edfdd1b;
        return c3895x4edfdd1b;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d7
    public boolean g() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d7
    /* renamed from: getCustomViewContainer */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ia mo14692x3eebbc35() {
        return this.f122220h;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d7
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ib i() {
        return this.f122221i;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d7
    public boolean j(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd wdVar) {
        return true;
    }

    @Override // re.a, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d7
    public void k() {
        super.k();
        com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 c4216x654bedf2 = this.f122219g;
        if (c4216x654bedf2 != null) {
            c4216x654bedf2.m34856x4a42b983().e();
        }
    }

    @Override // re.a, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d7
    public void m() {
        super.m();
        N();
        M();
        ku5.u0 u0Var = ku5.t0.f394148d;
        final java.util.ArrayList arrayList = this.f122229t;
        java.util.Objects.requireNonNull(arrayList);
        ((ku5.t0) u0Var).B(new java.lang.Runnable() { // from class: ce.o$$b
            @Override // java.lang.Runnable
            public final void run() {
                arrayList.clear();
            }
        });
        com.p314xaae8f345.p425x1ea3c036.p428x304bf2.p431x34628f.C3895x4edfdd1b c3895x4edfdd1b = this.f122218f;
        if (c3895x4edfdd1b == null || c3895x4edfdd1b.f128793e == null) {
            return;
        }
        c3895x4edfdd1b.f128793e = null;
    }

    @Override // re.a, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d7
    public void n() {
        super.n();
        this.f122222m.set(false);
        if (this.f122223n.get()) {
            N();
        }
        M();
        com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 c4216x654bedf2 = this.f122219g;
        if (c4216x654bedf2 != null) {
            c4216x654bedf2.m34856x4a42b983().f();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d7
    public void o(al1.b bVar) {
        bVar.m2222xad580900(true);
        boolean S = F() != null ? ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F()).S() : false;
        mi1.f3.c(bVar.m2209x716f693c(), bVar.getContext(), S);
        mi1.f3.b(bVar, S);
    }

    @Override // ni1.d
    public java.util.Map p() {
        return java.util.Collections.emptyMap();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d7
    public android.widget.RelativeLayout.LayoutParams q(android.view.View view, android.view.View view2) {
        return new android.widget.RelativeLayout.LayoutParams(-1, -1);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d7
    public boolean t() {
        return false;
    }

    @Override // re.a, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d7
    public void v() {
        G(ni1.j.class, new ee.d((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) F()));
        G(ni1.e.class, new ce.n((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) F(), J().m0().f387281r.f387083a));
        if (((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F()).mo50261xee5260a9() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.r0) {
            this.f122218f.f128793e = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.r0) ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F()).mo50261xee5260a9()).w();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d7
    public void x() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d7
    public void z(android.view.View view) {
        ae.q qVar = (ae.q) r(ae.q.class);
        int i17 = 0;
        if (qVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Luggage.Game.WAGamePageViewRenderer", new ae.s(), "hy: not on game service!", new java.lang.Object[0]);
            return;
        }
        this.f122232w = new android.widget.FrameLayout(view.getContext());
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 P = P(context);
        this.f122219g = P;
        P.setId(com.p314xaae8f345.mm.R.id.f564660xb);
        com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad w17 = ((ae.a) qVar).w();
        this.f122219g.m34867x7867078f(w17);
        w17.f130122m.a(new yg.y() { // from class: ce.o$$e
            @Override // yg.y
            public final void b(int i18) {
                ce.o.this.Y();
            }
        });
        this.f122218f.addView(this.f122219g, 0, new android.widget.FrameLayout.LayoutParams(-1, -1));
        ce.e eVar = new ce.e(context);
        this.f122221i = eVar;
        eVar.m14680xf57ab9a8(this);
        this.f122218f.addView(this.f122221i, -1, new android.view.ViewGroup.LayoutParams(-1, -1));
        ce.f fVar = new ce.f(this.f122221i);
        this.f122220h = fVar;
        xi1.m C1 = ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F()).C1();
        fVar.f168297h = C1;
        C1.d(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.z9(fVar));
        this.f122220h.v(new ce.r(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ia iaVar = this.f122220h;
        ce.s sVar = new ce.s(this);
        iaVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWebViewCustomViewContainer", "setUnderViewAttacher notnull:%b", java.lang.Boolean.TRUE);
        iaVar.f168302m = sVar;
        android.widget.FrameLayout frameLayout = iaVar.f168301l;
        if (frameLayout != null && frameLayout.getParent() == null) {
            this.f122218f.addView(frameLayout, 0, new android.view.ViewGroup.LayoutParams(-1, -1));
        }
        boolean z17 = ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F()).t3().E0().f128829w;
        boolean z18 = ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F()).t3().E0().f128829w;
        if (z17 || z18) {
            ae.q qVar2 = (ae.q) ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) F()).v3().z1(ae.q.class);
            if (qVar2 != null) {
                ae.a aVar = (ae.a) qVar2;
                yd.u F0 = aVar.F0();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0) F();
                com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad w18 = aVar.w();
                com.p314xaae8f345.p425x1ea3c036.p428x304bf2.p431x34628f.C3895x4edfdd1b c3895x4edfdd1b = this.f122218f;
                ce.t tVar = new ce.t(this, qVar2);
                F0.getClass();
                F0.f542503f = w18;
                if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
                    throw new java.lang.IllegalStateException("You can only init GameInspector in main thread.");
                }
                if (F0.f542501d == 0) {
                    F0.f542498a = c3895x4edfdd1b.getContext();
                    if (z17) {
                        yd.n nVar = new yd.n(F0.f542498a);
                        F0.f542499b = nVar;
                        nVar.f542490i = tVar;
                    }
                    if (z18) {
                        F0.f542500c = new yd.e(F0.f542503f, F0.f542498a, d0Var);
                    }
                    c3895x4edfdd1b.setClipChildren(false);
                    float f17 = F0.f542498a.getResources().getDisplayMetrics().density;
                    if (F0.f542500c != null) {
                        c3895x4edfdd1b.addView(F0.f542500c.f542472a, new android.widget.FrameLayout.LayoutParams(-1, -1));
                        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
                        layoutParams.gravity = 8388693;
                        layoutParams.bottomMargin = (int) (55.0f * f17);
                        int i18 = (int) (15.0f * f17);
                        layoutParams.rightMargin = i18;
                        layoutParams.leftMargin = i18;
                        c3895x4edfdd1b.addView(F0.f542500c.f542478g, layoutParams);
                    }
                    if (F0.f542499b != null) {
                        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-2, -2);
                        android.content.Context context2 = F0.f542498a;
                        if (context2 != null) {
                            nf.y yVar = nf.x.f418149b;
                            i17 = yVar != null ? yVar.c(context2) : com.p314xaae8f345.mm.ui.v9.b(context2);
                        }
                        layoutParams2.topMargin = i17;
                        layoutParams2.leftMargin = (int) (f17 * 16.0f);
                        c3895x4edfdd1b.addView(F0.f542499b, layoutParams2);
                    }
                    synchronized (F0.f542502e) {
                        if (F0.f542501d == 0) {
                            F0.f542501d = 1;
                            if (z18 && F0.f542500c != null) {
                                F0.f542500c.f542472a.post(new yd.o(F0));
                            }
                        }
                    }
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Luggage.Game.WAGamePageViewRenderer", new ae.s(), "hy: you're not on game service!", new java.lang.Object[0]);
            }
        }
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        this.f122226q = imageView;
        imageView.setVisibility(8);
        this.f122218f.addView(this.f122226q, new android.widget.FrameLayout.LayoutParams(-1, -1));
        this.f122218f.addOnAttachStateChangeListener(this.f122231v);
    }
}
