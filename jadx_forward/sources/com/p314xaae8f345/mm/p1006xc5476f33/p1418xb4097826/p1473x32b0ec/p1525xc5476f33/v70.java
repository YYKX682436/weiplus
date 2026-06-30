package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class v70 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {
    public static final float W = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561256df);
    public final android.widget.TextView A;
    public final android.view.View B;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 C;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a70 D;
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de E;
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 F;
    public final java.util.List G;
    public final java.util.List H;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.p70 I;

    /* renamed from: J, reason: collision with root package name */
    public final android.animation.AnimatorSet f196214J;
    public final android.animation.ObjectAnimator K;
    public final android.animation.ObjectAnimator L;
    public final android.animation.ObjectAnimator M;
    public java.util.List N;
    public final java.util.function.Consumer P;
    public int Q;
    public final android.os.Handler R;
    public java.lang.Runnable S;
    public java.lang.Runnable T;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 U;
    public p3325xe03a0797.p3326xc267989b.r2 V;

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f196215p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gp0 f196216q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14314xae44553 f196217r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View f196218s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.ViewGroup f196219t;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.View f196220u;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.ViewGroup f196221v;

    /* renamed from: w, reason: collision with root package name */
    public final android.view.View f196222w;

    /* renamed from: x, reason: collision with root package name */
    public final android.widget.TextView f196223x;

    /* renamed from: y, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14327xf6cdefc6 f196224y;

    /* renamed from: z, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f196225z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v70(final android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f196215p = statusMonitor;
        this.f196216q = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gp0.f194257d;
        this.f196217r = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14314xae44553) root.findViewById(com.p314xaae8f345.mm.R.id.tik);
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.tnx);
        this.f196218s = findViewById;
        this.f196219t = (android.view.ViewGroup) root.findViewById(com.p314xaae8f345.mm.R.id.f566325to2);
        android.view.View findViewById2 = root.findViewById(com.p314xaae8f345.mm.R.id.f566324to1);
        this.f196220u = findViewById2;
        this.f196221v = (android.view.ViewGroup) root.findViewById(com.p314xaae8f345.mm.R.id.tny);
        android.view.View findViewById3 = root.findViewById(com.p314xaae8f345.mm.R.id.f566328to5);
        this.f196222w = findViewById3;
        this.f196223x = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.f566323to0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14327xf6cdefc6 c14327xf6cdefc6 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14327xf6cdefc6) root.findViewById(com.p314xaae8f345.mm.R.id.to6);
        this.f196224y = c14327xf6cdefc6;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) root.findViewById(com.p314xaae8f345.mm.R.id.fjo);
        this.f196225z = c1163xf1deaba4;
        android.widget.TextView textView = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.fjp);
        this.A = textView;
        android.view.View findViewById4 = root.findViewById(com.p314xaae8f345.mm.R.id.fjr);
        this.B = findViewById4;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a70 a70Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a70();
        this.D = a70Var;
        final android.content.Context context = root.getContext();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context) { // from class: com.tencent.mm.plugin.finder.live.plugin.FinderLiveRandomMatchLinkMicStatePlugin$layoutManager$1
            @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
            /* renamed from: smoothScrollToPosition */
            public void mo7942xd1b4653f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var, int i17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.n70 n70Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.n70(root.getContext());
                n70Var.f93582a = i17;
                m8099x6305639d(n70Var);
            }
        };
        this.E = c1162x665295de;
        this.G = new java.util.ArrayList();
        this.H = new java.util.ArrayList();
        this.I = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.p70(this);
        this.f196214J = new android.animation.AnimatorSet();
        android.animation.ObjectAnimator duration = android.animation.ObjectAnimator.ofFloat(textView, (android.util.Property<android.widget.TextView, java.lang.Float>) android.view.View.ALPHA, 1.0f, 0.0f).setDuration(300L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(duration, "setDuration(...)");
        this.K = duration;
        android.animation.ObjectAnimator duration2 = android.animation.ObjectAnimator.ofFloat(findViewById4, (android.util.Property<android.view.View, java.lang.Float>) android.view.View.SCALE_X, 0.11f, 1.0f).setDuration(400L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(duration2, "setDuration(...)");
        this.L = duration2;
        android.animation.ObjectAnimator duration3 = android.animation.ObjectAnimator.ofFloat(findViewById4, (android.util.Property<android.view.View, java.lang.Float>) android.view.View.SCALE_Y, 0.11f, 1.0f).setDuration(400L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(duration3, "setDuration(...)");
        this.M = duration3;
        this.P = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.d70(this);
        this.R = new android.os.Handler(android.os.Looper.getMainLooper());
        findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x60(this));
        findViewById2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.y60(this));
        findViewById3.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.z60(this));
        c1163xf1deaba4.mo7960x6cab2c8d(a70Var);
        c1163xf1deaba4.mo7967x900dcbe1(c1162x665295de);
        c1163xf1deaba4.requestDisallowInterceptTouchEvent(false);
        c14327xf6cdefc6.m57357x5755edc5(true);
        java.util.Iterator it = kz5.c0.i(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.cim), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.civ), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.ciw), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.cix), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.ciy), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.ciz), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.f563305cj0), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.f563306cj1), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.cin), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.cio), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.cip), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.ciq), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.cir), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.cis), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.cit), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.ciu)).iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.b70 b70Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.b70(null, null, 3, null);
            android.content.res.Resources resources = this.f446856d.getContext().getResources();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(intValue));
            arrayList.add(resources);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRandomMatchLinkMicStatePlugin", "getDefaultAvatarBitmap", "(I)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.e(obj, decodeResource, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRandomMatchLinkMicStatePlugin", "getDefaultAvatarBitmap", "(I)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            float f17 = W;
            int i17 = (int) f17;
            android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(decodeResource, i17, i17, true);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createScaledBitmap, "createScaledBitmap(...)");
            android.graphics.Bitmap s07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(createScaledBitmap, false, f17 * 0.5f);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(s07, "getRoundedCornerBitmap(...)");
            b70Var.f193515a = s07;
            this.G.add(b70Var);
        }
        u1();
        android.view.animation.OvershootInterpolator overshootInterpolator = new android.view.animation.OvershootInterpolator();
        android.animation.ObjectAnimator objectAnimator = this.L;
        objectAnimator.setInterpolator(overshootInterpolator);
        android.view.animation.OvershootInterpolator overshootInterpolator2 = new android.view.animation.OvershootInterpolator();
        android.animation.ObjectAnimator objectAnimator2 = this.M;
        objectAnimator2.setInterpolator(overshootInterpolator2);
        android.animation.AnimatorSet animatorSet = this.f196214J;
        animatorSet.play(objectAnimator).with(objectAnimator2).after(this.K);
        animatorSet.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l70(this));
        objectAnimator.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.m70(this));
        mm2.o4 o4Var = (mm2.o4) P0(mm2.o4.class);
        java.util.function.Consumer consumer = this.P;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.b0 b0Var = o4Var.f410856r;
        if (consumer != null) {
            ((java.util.ArrayList) b0Var.f196977d).add(consumer);
        } else {
            b0Var.getClass();
        }
        android.view.ViewGroup viewGroup = this.f446856d;
        int i18 = (com.p314xaae8f345.mm.ui.bl.b(viewGroup.getContext()).x / 3) * 2;
        int a17 = com.p314xaae8f345.mm.ui.zk.a(viewGroup.getContext(), 152);
        a17 = zl2.r4.f555483a.t1(S0()) ? a17 + com.p314xaae8f345.mm.ui.zk.a(viewGroup.getContext(), 32) : a17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveRandomMatchLinkMicStatePlugin", "getDefaultY: " + a17);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.tim);
        android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.til);
        android.view.ViewGroup viewGroup4 = (android.view.ViewGroup) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.tij);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewGroup2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewGroup3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewGroup4);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14314xae44553 c14314xae44553 = this.f196217r;
        c14314xae44553.getClass();
        c14314xae44553.f197408f = i18;
        c14314xae44553.f197409g = a17;
        c14314xae44553.f197410h = false;
        c14314xae44553.f197423x = viewGroup2;
        c14314xae44553.f197424y = viewGroup3;
        c14314xae44553.f197425z = viewGroup4;
        java.lang.Object parent = c14314xae44553.getParent();
        android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (view != null && c14314xae44553.C == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.a5 a5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.a5(c14314xae44553);
            c14314xae44553.C = a5Var;
            view.addOnLayoutChangeListener(a5Var);
        }
        c14314xae44553.h(false, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        android.view.View.OnLayoutChangeListener onLayoutChangeListener;
        super.O0();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.F;
        if (b4Var != null) {
            b4Var.d();
        }
        this.F = null;
        this.f196225z.V0(this.I);
        this.f196214J.cancel();
        java.lang.Runnable runnable = this.S;
        if (runnable != null) {
            this.R.removeCallbacks(runnable);
            this.S = null;
        }
        ((java.util.ArrayList) ((mm2.o4) P0(mm2.o4.class)).f410856r.f196977d).remove(this.P);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14314xae44553 c14314xae44553 = this.f196217r;
        c14314xae44553.b();
        android.animation.ValueAnimator valueAnimator = c14314xae44553.f197420u;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        c14314xae44553.f197420u = null;
        java.lang.Object parent = c14314xae44553.getParent();
        android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (view != null) {
            view.setTouchDelegate(null);
        }
        c14314xae44553.A = null;
        c14314xae44553.B = null;
        java.lang.Object parent2 = c14314xae44553.getParent();
        android.view.View view2 = parent2 instanceof android.view.View ? (android.view.View) parent2 : null;
        if (view2 != null && (onLayoutChangeListener = c14314xae44553.C) != null) {
            view2.removeOnLayoutChangeListener(onLayoutChangeListener);
        }
        c14314xae44553.C = null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f410334f2 != 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return true;
    }

    public final void t1() {
        java.lang.Runnable runnable = this.T;
        if (runnable != null) {
            this.R.removeCallbacks(runnable);
            this.T = null;
        }
    }

    public final void u1() {
        java.util.List<java.lang.String> list;
        java.util.List list2 = this.H;
        list2.clear();
        java.util.List list3 = this.N;
        int i17 = 0;
        if (list3 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list3, 10));
            java.util.Iterator it = list3.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) ((r45.xn1) it.next()).m75936x14adae67(0);
                arrayList.add(c19782x23db1cfa != null ? c19782x23db1cfa.m76175x6d346f39() : null);
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : arrayList) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) obj)) {
                    arrayList2.add(obj);
                }
            }
            list = kz5.n0.K0(arrayList2, 10);
        } else {
            list = null;
        }
        if (list != null) {
            for (java.lang.String str : list) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.b70 b70Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.b70(null, null, 3, null);
                b70Var.f193516b = str;
                list2.add(b70Var);
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("genCurrentDataList: realAvatarList size:");
        sb6.append(list != null ? java.lang.Integer.valueOf(list.size()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveRandomMatchLinkMicStatePlugin", sb6.toString());
        if (list2.size() >= 10) {
            return;
        }
        c06.d dVar = c06.e.f119249d;
        java.util.List list4 = this.G;
        int e17 = dVar.e(0, list4.size());
        int size = 10 - list2.size();
        while (i17 < size) {
            list2.add(list4.get(e17 % list4.size()));
            i17++;
            e17++;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a70 a70Var = this.D;
        a70Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list2, "list");
        java.util.ArrayList arrayList3 = (java.util.ArrayList) a70Var.f193352d;
        arrayList3.clear();
        arrayList3.addAll(list2);
    }

    public final void v1() {
        int size = ((mm2.o4) P0(mm2.o4.class)).f410857s.size();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveRandomMatchLinkMicStatePlugin", "onAnimationEnd anchorMicNum:" + size);
        if (size > 0) {
            x1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gp0.f194260g, null);
        } else {
            x1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gp0.f194259f, null);
        }
    }

    public final void w1() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveRandomMatchLinkMicStatePlugin", "quitChatMode");
        ((mm2.o4) P0(mm2.o4.class)).f410863x0 = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveRandomMatchLinkMicStatePlugin", "hideStatePanel");
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.k70(this));
    }

    public final void x1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gp0 targetState, java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetState, "targetState");
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.q70(this, targetState, list));
    }

    public final void y1(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveRandomMatchLinkMicStatePlugin", "stopMatch: headUrl:" + str);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.F;
        if (b4Var != null) {
            b4Var.d();
        }
        int size = this.H.size();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = this.E;
        int w17 = c1162x665295de.w();
        int w18 = c1162x665295de.w() % size;
        int i17 = w18 == 0 ? size - 1 : w18 - 1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.b70 b70Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.b70(null, null, 3, null);
        b70Var.f193516b = str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a70 a70Var = this.D;
        a70Var.getClass();
        if (i17 >= 0) {
            java.util.ArrayList arrayList = (java.util.ArrayList) a70Var.f193352d;
            if (i17 < arrayList.size()) {
                arrayList.set(i17, b70Var);
            }
        }
        int i18 = (w17 + size) - 1;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f196225z;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(c1163xf1deaba4, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRandomMatchLinkMicStatePlugin", "stopMatch", "(Ljava/lang/String;)V", "Undefined", "smoothScrollToPosition", "(I)V");
        c1163xf1deaba4.c1(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(c1163xf1deaba4, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRandomMatchLinkMicStatePlugin", "stopMatch", "(Ljava/lang/String;)V", "Undefined", "smoothScrollToPosition", "(I)V");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveRandomMatchLinkMicStatePlugin", "firstPosition:" + w17 + ", targetPosition:" + i18 + " listSize:" + size);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveRandomMatchLinkMicStatePlugin", "realFirstPosition:" + w18 + ", realInsertPosition:" + i17 + ", realTargetPosition:" + (i18 % size));
        this.f196225z.i(this.I);
    }
}
