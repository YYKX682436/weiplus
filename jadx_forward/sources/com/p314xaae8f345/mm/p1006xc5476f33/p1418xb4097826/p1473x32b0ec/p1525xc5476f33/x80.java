package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class x80 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l implements nn0.a0 {
    public boolean A;
    public int B;
    public int C;
    public final on0.b D;
    public p3325xe03a0797.p3326xc267989b.r2 E;
    public final android.os.Handler F;
    public final java.lang.Runnable G;

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f196582p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14328x87868185 f196583q;

    /* renamed from: r, reason: collision with root package name */
    public long f196584r;

    /* renamed from: s, reason: collision with root package name */
    public long f196585s;

    /* renamed from: t, reason: collision with root package name */
    public java.util.LinkedList f196586t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f196587u;

    /* renamed from: v, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f196588v;

    /* renamed from: w, reason: collision with root package name */
    public final android.view.View f196589w;

    /* renamed from: x, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1521x271b95f9.C14259xb044a81d f196590x;

    /* renamed from: y, reason: collision with root package name */
    public int f196591y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f196592z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.tencent.mm.plugin.finder.live.view.FinderLiveInterceptTouchRelativeLayout] */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.tencent.mm.plugin.finder.live.view.FinderLiveInterceptTouchRelativeLayout] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, qo0.c] */
    public x80(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14350x1bfa938b c14350x1bfa938b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f196582p = statusMonitor;
        if (root instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14328x87868185) {
            c14350x1bfa938b = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14328x87868185) root;
        } else {
            android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.fkn);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
            c14350x1bfa938b = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14328x87868185) findViewById;
        }
        this.f196583q = c14350x1bfa938b;
        this.f196584r = android.os.SystemClock.elapsedRealtime();
        this.f196585s = -1L;
        this.f196587u = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.w80(root));
        android.view.ViewGroup viewGroup = statusMonitor instanceof android.view.ViewGroup ? (android.view.ViewGroup) statusMonitor : null;
        this.f196589w = viewGroup != null ? viewGroup.findViewById(com.p314xaae8f345.mm.R.id.ey8) : null;
        android.view.ViewGroup viewGroup2 = statusMonitor instanceof android.view.ViewGroup ? (android.view.ViewGroup) statusMonitor : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1521x271b95f9.C14259xb044a81d c14259xb044a81d = viewGroup2 != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1521x271b95f9.C14259xb044a81d) viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.ig6) : null;
        this.f196590x = c14259xb044a81d;
        this.f196591y = 1;
        this.f196592z = true;
        android.content.Context context = root.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        this.D = new on0.b(context);
        this.F = new android.os.Handler(android.os.Looper.getMainLooper());
        this.G = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.p80(this);
        c14350x1bfa938b.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.m80(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14350x1bfa938b c14350x1bfa938b2 = c14350x1bfa938b instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14350x1bfa938b ? c14350x1bfa938b : null;
        if (c14350x1bfa938b2 != null) {
            c14350x1bfa938b2.f197636f = this;
        }
        if (c14259xb044a81d != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.n80 n80Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.n80(this);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o80 o80Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o80(this);
            c14259xb044a81d.A2 = n80Var;
            c14259xb044a81d.B2 = o80Var;
        }
        root.setImportantForAccessibility(4);
        root.setContentDescription(root.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ec8));
    }

    public static /* synthetic */ boolean A1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x80 x80Var, java.lang.Boolean bool, android.view.MotionEvent motionEvent, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            bool = null;
        }
        if ((i17 & 2) != 0) {
            motionEvent = null;
        }
        return x80Var.z1(bool, motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x047f, code lost:
    
        if (r2 != 6) goto L236;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void t1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x80 r16, android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 1848
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x80.t1(com.tencent.mm.plugin.finder.live.plugin.x80, android.view.MotionEvent):void");
    }

    @Override // qo0.a
    public void C0(java.util.LinkedHashMap micUserMap) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micUserMap, "micUserMap");
        this.f196591y = micUserMap.size();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return false;
    }

    @Override // nn0.a0
    public void I(boolean z17, float f17, float f18, float f19, java.lang.String str) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void K0(int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("visibility:");
        sb6.append(i17 == 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveScreenClearPlugin", sb6.toString());
        super.K0(i17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        super.M0(status, bundle);
        int ordinal = status.ordinal();
        if (ordinal != 130) {
            if (ordinal != 191) {
                return;
            }
            this.A = bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", false) : false;
            return;
        }
        boolean z17 = bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR", false) : false;
        android.view.ViewGroup viewGroup = this.f446856d;
        if (z17) {
            viewGroup.setImportantForAccessibility(1);
            viewGroup.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v80(this));
        } else {
            viewGroup.setImportantForAccessibility(4);
            viewGroup.setOnClickListener(null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        this.f196586t = null;
        on0.b bVar = this.D;
        if (bVar != null) {
            bVar.f428297d = null;
        }
        h0(false);
        this.F.removeCallbacksAndMessages(null);
    }

    @Override // nn0.a0
    public void P() {
        y1(2);
    }

    @Override // nn0.a0
    public void g0(android.view.MotionEvent event, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.u80(this, event));
    }

    @Override // nn0.a0
    public void h0(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveScreenClearPlugin", "notifyClipChildren clip: " + z17);
        qo0.c cVar = this.f196582p;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = cVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) cVar : null;
        if (k0Var != null) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) k0Var.findViewById(com.p314xaae8f345.mm.R.id.fqe);
            if (viewGroup != null) {
                viewGroup.setClipChildren(z17);
            }
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) k0Var.findViewById(com.p314xaae8f345.mm.R.id.fh8);
            if (viewGroup2 != null) {
                viewGroup2.setClipChildren(z17);
            }
            android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) k0Var.findViewById(com.p314xaae8f345.mm.R.id.ig6);
            if (viewGroup3 != null) {
                viewGroup3.setClipChildren(z17);
            }
            android.view.ViewGroup viewGroup4 = (android.view.ViewGroup) k0Var.findViewById(com.p314xaae8f345.mm.R.id.ig7);
            if (viewGroup4 != null) {
                viewGroup4.setClipChildren(z17);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return false;
    }

    public final void u1(boolean z17) {
        ((mm2.c1) P0(mm2.c1.class)).N1 = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveScreenClearPlugin", "screenAction business(LiveCommonSlice::class.java).screenClear:" + ((mm2.c1) P0(mm2.c1.class)).N1);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR", ((mm2.c1) P0(mm2.c1.class)).N1);
        qo0.b bVar = qo0.b.Z2;
        qo0.c cVar = this.f196582p;
        cVar.mo46557x60d69242(bVar, bundle);
        if (cVar.mo11219xd0598cf8() == 0) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).zj(((mm2.c1) P0(mm2.c1.class)).N1 ? ml2.o1.f409300e : ml2.o1.f409301f);
        }
        if (((mm2.c1) P0(mm2.c1.class)).N1 && x0()) {
            android.content.Context context = this.f446856d.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            ((android.app.Activity) context).getWindow().getDecorView().setSystemUiVisibility(3846);
        }
        this.F.removeCallbacks(this.G);
    }

    public final void v1() {
        android.view.View view = this.f196589w;
        if (view != null && view.getVisibility() == 0) {
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveScreenClearPlugin", "hideFrameScaleTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveScreenClearPlugin", "hideFrameScaleTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            zl2.r4.f555483a.I0().putBoolean("FRAME_SCALE_TIPS_SHOW_KEY", false);
            p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f196588v;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
        }
    }

    public final void w1() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveScreenClearPlugin", "onScaleTouchEnd");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wi wiVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wi) X0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wi.class);
        if (wiVar == null || wiVar.r()) {
            return;
        }
        wiVar.f446856d.setAlpha(1.0f);
    }

    public final void x1(android.view.View.OnTouchListener onTouchListener) {
        java.util.LinkedList linkedList;
        if (onTouchListener == null) {
            return;
        }
        if (this.f196586t == null) {
            this.f196586t = new java.util.LinkedList();
        }
        java.util.LinkedList linkedList2 = this.f196586t;
        boolean z17 = false;
        if (linkedList2 != null && linkedList2.contains(onTouchListener)) {
            z17 = true;
        }
        if (z17 || (linkedList = this.f196586t) == null) {
            return;
        }
        linkedList.add(onTouchListener);
    }

    public final void y1(int i17) {
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        ml2.b4 b4Var = ml2.b4.M1;
        cl0.g gVar = new cl0.g();
        gVar.o("type", i17);
        gVar.o("screen_status", this.f196592z ? 1 : 0);
        ml2.r0.hj(r0Var, b4Var, gVar.toString(), 0L, null, null, null, null, null, 252, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void z0() {
        super.z0();
        if (x0()) {
            android.os.Handler handler = this.F;
            java.lang.Runnable runnable = this.G;
            handler.removeCallbacks(runnable);
            handler.postDelayed(runnable, 5000L);
        }
    }

    public final boolean z1(java.lang.Boolean bool, android.view.MotionEvent motionEvent) {
        android.view.View view;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("screenClickLogic， pointerCount = ");
        sb6.append(motionEvent != null ? motionEvent.getPointerCount() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveScreenClearPlugin", sb6.toString());
        if (android.os.SystemClock.elapsedRealtime() - this.f196584r >= android.view.ViewConfiguration.getDoubleTapTimeout()) {
            if ((motionEvent != null ? motionEvent.getPointerCount() : 0) != 3) {
                this.f196584r = android.os.SystemClock.elapsedRealtime();
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c.N != 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveScreenClearPlugin", "[screenAction] inNewGuideStatus:" + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c.N + " return");
                } else {
                    android.content.Context context = this.f196583q.getContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                    pf5.z zVar = pf5.z.f435481a;
                    if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(pl2.x.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
                    pl2.x xVar = (pl2.x) a17;
                    if (xVar.f438216f) {
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("inSideBarStatus, is NUll? ");
                        sb7.append(xVar.f438217g == null);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveScreenClearPlugin", sb7.toString());
                        xVar.f438220m.f438211h = 3;
                        pl2.s sVar = xVar.f438217g;
                        if (sVar != null) {
                            pl2.s.e(sVar, 0L, null, 3, null);
                        }
                    } else {
                        u1(bool != null ? bool.booleanValue() : !((mm2.c1) P0(mm2.c1.class)).N1);
                    }
                }
                boolean z17 = ((mm2.c1) P0(mm2.c1.class)).N1;
                android.view.ViewGroup viewGroup = this.f446856d;
                if (z17) {
                    if (zl2.r4.f555483a.I0().getBoolean("FRAME_SCALE_TIPS_SHOW_KEY", true) && this.f196591y == 1 && !this.A) {
                        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                        this.f196588v = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(this, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.q80(this, null), 2, null);
                    }
                    this.f196592z = true;
                } else {
                    viewGroup.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r80(this));
                    w1();
                    on0.b bVar = this.D;
                    if (bVar != null) {
                        bVar.f428295b = false;
                        bVar.f428315v = false;
                        bVar.f428314u = false;
                        bVar.f428308o = 0.0f;
                        bVar.f428309p = 0.0f;
                        bVar.f428310q = 0.0f;
                        bVar.f428311r = 0.0f;
                        bVar.f428313t = 1.0f;
                        bVar.f428307n = 0.0f;
                        bVar.f428306m = new android.graphics.PointF();
                        bVar.f428303j = new android.graphics.PointF();
                        bVar.f428304k = 0;
                        bVar.f428305l = new android.graphics.PointF();
                        bVar.a();
                    }
                    v1();
                }
                if (((mm2.c1) P0(mm2.c1.class)).g8()) {
                    if (((mm2.c1) P0(mm2.c1.class)).N1) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gl0 gl0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gl0) X0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gl0.class);
                        if (gl0Var != null) {
                            if (gl0Var.f194245p == null) {
                                android.view.ViewGroup viewGroup2 = gl0Var.f446856d;
                                gl0Var.f194245p = viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.fko);
                                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("init vrTipGroup:");
                                android.view.View view2 = gl0Var.f194245p;
                                sb8.append(view2 != null ? view2.hashCode() : 0);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVisitorVRActionTipsLazyPlugin", sb8.toString());
                                android.view.View view3 = gl0Var.f194245p;
                                if (view3 != null) {
                                    com.p314xaae8f345.mm.ui.bk.r0(((android.widget.TextView) view3.findViewById(com.p314xaae8f345.mm.R.id.fqn)).getPaint(), 0.8f);
                                    com.p314xaae8f345.mm.ui.bk.r0(((android.widget.TextView) view3.findViewById(com.p314xaae8f345.mm.R.id.fqm)).getPaint(), 0.8f);
                                    view3.setPadding(view3.getPaddingLeft(), view3.getPaddingTop(), view3.getPaddingRight(), com.p314xaae8f345.mm.ui.zk.a(viewGroup2.getContext(), 32) + com.p314xaae8f345.mm.ui.bl.c(viewGroup2.getContext()));
                                }
                            }
                            android.view.View view4 = gl0Var.f194245p;
                            if (view4 != null) {
                                ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
                                ml2.x4[] x4VarArr = ml2.x4.f409767d;
                                r0Var.Mk(java.lang.String.valueOf(5));
                                view4.animate().alpha(1.0f).translationY(0.0f).withStartAction(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.el0(view4, gl0Var)).withEndAction(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.fl0(gl0Var)).start();
                            }
                        }
                        viewGroup.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.s80(this));
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gl0 gl0Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gl0) X0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gl0.class);
                        if (gl0Var2 != null && (view = gl0Var2.f194245p) != null) {
                            view.removeCallbacks((java.lang.Runnable) ((jz5.n) gl0Var2.f194246q).mo141623x754a37bb());
                            view.animate().alpha(0.0f).translationY(com.p314xaae8f345.mm.ui.bl.b(gl0Var2.f446856d.getContext()).y / 2.0f).withEndAction(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dl0(view, gl0Var2)).start();
                        }
                        viewGroup.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.t80(this));
                    }
                }
                return true;
            }
        }
        return false;
    }
}
