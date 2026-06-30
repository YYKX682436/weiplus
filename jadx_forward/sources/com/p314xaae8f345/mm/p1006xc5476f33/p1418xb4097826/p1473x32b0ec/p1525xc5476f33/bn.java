package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class bn extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f193585p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f193586q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.ViewPropertyAnimator f193587r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f193588s;

    /* renamed from: t, reason: collision with root package name */
    public ce2.i f193589t;

    /* renamed from: u, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f193590u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f193591v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bn(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.f2t);
        ym5.l2 l2Var = ym5.l2.f544957a;
        ym5.j2[] j2VarArr = ym5.j2.f544925d;
        ((com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) findViewById).o(ae2.in.f85221a.a(ym5.f6.f544860x));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "apply(...)");
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) findViewById;
        this.f193585p = c22789xd23e9a9b;
        android.view.View findViewById2 = root.findViewById(com.p314xaae8f345.mm.R.id.f0n);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f193586q = findViewById2;
        this.f193591v = new java.util.concurrent.ConcurrentLinkedQueue();
        findViewById2.getLayoutParams().height = ((int) (com.p314xaae8f345.mm.ui.bl.b(root.getContext()).y * 0.16f)) + com.p314xaae8f345.mm.ui.bl.c(root.getContext());
        findViewById2.setPadding(0, 0, 0, com.p314xaae8f345.mm.ui.zk.a(root.getContext(), 48) + com.p314xaae8f345.mm.ui.bl.c(root.getContext()));
        if (zl2.r4.f555483a.w1()) {
            c22789xd23e9a9b.setOnClickListener(null);
            c22789xd23e9a9b.setClickable(false);
        } else {
            c22789xd23e9a9b.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.im(this));
        }
        c22789xd23e9a9b.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jm(this));
    }

    public static final void t1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.bn bnVar) {
        bnVar.getClass();
        if (zl2.r4.f555483a.w1()) {
            return;
        }
        boolean z17 = !gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_GIFT_HIDE_TIP_GUIDE_BOOLEAN_SYNC, false);
        if (z17) {
            pm0.v.V(1000L, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.an(bnVar));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftPlayPlugin", "tryShowHideTip showGiftTip:" + z17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void K0(int i17) {
        if (((mm2.e0) P0(mm2.e0.class)).P6()) {
            super.K0(8);
        } else {
            super.K0(i17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x005e  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void M0(qo0.b r27, android.os.Bundle r28) {
        /*
            Method dump skipped, instructions count: 1004
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.bn.M0(qo0.b, android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        p3325xe03a0797.p3326xc267989b.r2 r2Var;
        super.O0();
        p3325xe03a0797.p3326xc267989b.r2 r2Var2 = this.f193590u;
        if (r2Var2 != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, null, 1, null);
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f193585p;
        c22789xd23e9a9b.setAlpha(1.0f);
        if (!zl2.r4.f555483a.w1()) {
            c22789xd23e9a9b.setClickable(true);
        }
        android.view.View view = this.f193586q;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPlayPlugin", "unMount", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPlayPlugin", "unMount", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f193586q;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPlayPlugin", "unMount", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPlayPlugin", "unMount", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.ViewPropertyAnimator viewPropertyAnimator = this.f193587r;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        df2.a9 a9Var = (df2.a9) U0(df2.a9.class);
        if (a9Var == null || (r2Var = a9Var.f311233z) == null) {
            return;
        }
        p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f410334f2 != 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return true;
    }

    public final void u1() {
        df2.t6 t6Var;
        p3325xe03a0797.p3326xc267989b.r2 r2Var;
        df2.s8 s8Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftPlayPlugin", "hide full screen gift, id:" + this.f193588s);
        K0(8);
        p3325xe03a0797.p3326xc267989b.r2 r2Var2 = this.f193590u;
        if (r2Var2 != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, null, 1, null);
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f193585p;
        c22789xd23e9a9b.setVisibility(8);
        c22789xd23e9a9b.n();
        c22789xd23e9a9b.setAlpha(1.0f);
        if (!zl2.r4.f555483a.w1()) {
            c22789xd23e9a9b.setClickable(true);
        }
        android.view.View view = this.f193586q;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPlayPlugin", "hideGift", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPlayPlugin", "hideGift", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f193586q;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPlayPlugin", "hideGift", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPlayPlugin", "hideGift", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.ViewPropertyAnimator viewPropertyAnimator = this.f193587r;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        df2.a9 a9Var = (df2.a9) U0(df2.a9.class);
        if (a9Var != null && (r2Var = a9Var.f311233z) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftPlayPlugin", "showFundingSucAnimJob isActive = " + r2Var.a());
            if (r2Var.a() && (s8Var = (df2.s8) U0(df2.s8.class)) != null) {
                s8Var.b7();
            }
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        if (!(in0.q.f374302b2 != null) || (t6Var = (df2.t6) U0(df2.t6.class)) == null) {
            return;
        }
        t6Var.e7();
    }

    public final void v1(java.util.LinkedList linkedList, ce2.i iVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftPlayPlugin", "start random gift animation, randomGifts:".concat(kz5.n0.g0(linkedList, null, null, null, 0, null, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.um.f196121d, 31, null)));
        this.f193591v.addAll(linkedList);
        this.f193590u = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(this, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.xm(this, iVar, null), 2, null);
    }
}
