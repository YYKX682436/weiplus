package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class kn extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.hl f194822p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.rk f194823q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.jl f194824r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f194825s;

    /* renamed from: t, reason: collision with root package name */
    public ce2.i f194826t;

    /* renamed from: u, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f194827u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f194828v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kn(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f194828v = new java.util.concurrent.ConcurrentLinkedQueue();
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.f2t);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.hl hlVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.hl((com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) findViewById, this);
        this.f194822p = hlVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.rk rkVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.rk(this);
        this.f194823q = rkVar;
        android.view.View findViewById2 = root.findViewById(com.p314xaae8f345.mm.R.id.f0n);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.jl jlVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.jl(findViewById2, this);
        this.f194824r = jlVar;
        android.view.View view = jlVar.f200295a;
        view.getLayoutParams().height = ((int) (com.p314xaae8f345.mm.ui.bl.b(view.getContext()).y * 0.16f)) + com.p314xaae8f345.mm.ui.bl.c(view.getContext());
        view.setPadding(0, 0, 0, com.p314xaae8f345.mm.ui.zk.a(view.getContext(), 48) + com.p314xaae8f345.mm.ui.bl.c(view.getContext()));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kn knVar = rkVar.f201186a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1623xc84f4f2f.p1624x373aa5.C14940x2aae97e1 O6 = je2.t.O6((je2.t) knVar.P0(je2.t.class), "FinderLiveGiftPlayMagicRewardWidget_init", knVar.f446856d, 0, null, 12, null);
        rkVar.f201187b = O6;
        if (O6 != null) {
            O6.setVisibility(8);
        }
        if (zl2.r4.f555483a.w1()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1623xc84f4f2f.p1624x373aa5.C14940x2aae97e1 c14940x2aae97e1 = rkVar.f201187b;
            if (c14940x2aae97e1 != null) {
                c14940x2aae97e1.setOnClickListener(null);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1623xc84f4f2f.p1624x373aa5.C14940x2aae97e1 c14940x2aae97e12 = rkVar.f201187b;
            if (c14940x2aae97e12 != null) {
                c14940x2aae97e12.setClickable(false);
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1623xc84f4f2f.p1624x373aa5.C14940x2aae97e1 c14940x2aae97e13 = rkVar.f201187b;
            if (c14940x2aae97e13 != null) {
                c14940x2aae97e13.m58939x582f7b22(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.mk(new java.lang.ref.WeakReference(rkVar)));
            }
        }
        ae2.in inVar = ae2.in.f85221a;
        inVar.k0();
        inVar.l0();
        inVar.m0();
        boolean w17 = zl2.r4.f555483a.w1();
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = hlVar.f200106a;
        if (w17) {
            c22789xd23e9a9b.setOnClickListener(null);
            c22789xd23e9a9b.setClickable(false);
        } else {
            c22789xd23e9a9b.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.tk(hlVar));
        }
        c22789xd23e9a9b.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.uk(hlVar));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void K0(int i17) {
        if (zl2.q4.f555466a.E()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftPlayPluginV1", "setVisible visible:" + i17);
        }
        if (((mm2.e0) P0(mm2.e0.class)).P6()) {
            super.K0(8);
        } else {
            super.K0(i17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0064  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void M0(qo0.b r29, android.os.Bundle r30) {
        /*
            Method dump skipped, instructions count: 1128
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kn.M0(qo0.b, android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        p3325xe03a0797.p3326xc267989b.r2 r2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1623xc84f4f2f.p1624x373aa5.C14940x2aae97e1 c14940x2aae97e1;
        super.O0();
        p3325xe03a0797.p3326xc267989b.r2 r2Var2 = this.f194827u;
        if (r2Var2 != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, null, 1, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.hl hlVar = this.f194822p;
        if (hlVar != null) {
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = hlVar.f200106a;
            c22789xd23e9a9b.setAlpha(1.0f);
            if (!zl2.r4.f555483a.w1()) {
                c22789xd23e9a9b.setClickable(true);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.rk rkVar = this.f194823q;
        if (rkVar != null) {
            if (!zl2.r4.f555483a.w1() && (c14940x2aae97e1 = rkVar.f201187b) != null) {
                c14940x2aae97e1.setClickable(true);
            }
            it2.z zVar = ((je2.t) rkVar.f201186a.P0(je2.t.class)).f380799i;
            if (zVar != null) {
                zVar.b("FinderLiveGiftPlayMagicRewardWidget_unMount", kt2.c.f393504d);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.jl jlVar = this.f194824r;
        if (jlVar != null) {
            android.view.View view = jlVar.f200295a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveGiftPlayTipsWidget", "unMount", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveGiftPlayTipsWidget", "unMount", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = jlVar.f200295a;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveGiftPlayTipsWidget", "unMount", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveGiftPlayTipsWidget", "unMount", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            android.view.ViewPropertyAnimator viewPropertyAnimator = jlVar.f200297c;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
            }
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

    public final void t1(java.lang.String source) {
        boolean z17;
        df2.t6 t6Var;
        p3325xe03a0797.p3326xc267989b.r2 r2Var;
        df2.s8 s8Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftPlayPluginV1", source + " hide full screen gift, id:" + this.f194825s);
        K0(8);
        p3325xe03a0797.p3326xc267989b.r2 r2Var2 = this.f194827u;
        if (r2Var2 != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, null, 1, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.hl hlVar = this.f194822p;
        if (hlVar != null) {
            hlVar.a();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.rk rkVar = this.f194823q;
        if (rkVar != null) {
            rkVar.a(source);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.jl jlVar = this.f194824r;
        if (jlVar != null) {
            android.view.View view = jlVar.f200295a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveGiftPlayTipsWidget", "hideGift", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveGiftPlayTipsWidget", "hideGift", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = jlVar.f200295a;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveGiftPlayTipsWidget", "hideGift", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveGiftPlayTipsWidget", "hideGift", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            android.view.ViewPropertyAnimator viewPropertyAnimator = jlVar.f200297c;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
            }
        }
        df2.a9 a9Var = (df2.a9) U0(df2.a9.class);
        if (a9Var == null || (r2Var = a9Var.f311233z) == null) {
            z17 = true;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftPlayPluginV1", "showFundingSucAnimJob isActive = " + r2Var.a());
            if (r2Var.a() && (s8Var = (df2.s8) U0(df2.s8.class)) != null) {
                s8Var.b7();
            }
            z17 = true;
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        if (!(in0.q.f374302b2 != null ? z17 : false) || (t6Var = (df2.t6) U0(df2.t6.class)) == null) {
            return;
        }
        t6Var.e7();
    }

    public final void u1() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.jl jlVar;
        if (zl2.r4.f555483a.w1() || (jlVar = this.f194824r) == null) {
            return;
        }
        boolean z17 = !gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_GIFT_HIDE_TIP_GUIDE_BOOLEAN_SYNC, false);
        if (z17) {
            pm0.v.V(1000L, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.il(jlVar));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveGiftPlayTipsWidget", "tryShowHideTip showGiftTip:" + z17);
    }

    public final void v1() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.jl jlVar = this.f194824r;
        if (jlVar != null) {
            android.view.View view = jlVar.f200295a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveGiftPlayTipsWidget", "hideSingleGift", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveGiftPlayTipsWidget", "hideSingleGift", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = jlVar.f200295a;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveGiftPlayTipsWidget", "hideSingleGift", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveGiftPlayTipsWidget", "hideSingleGift", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            android.view.ViewPropertyAnimator viewPropertyAnimator = jlVar.f200297c;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
            }
        }
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_GIFT_HIDE_TIP_GUIDE_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ap apVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ap) X0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ap.class);
        if (apVar != null) {
            apVar.R1(true);
        }
    }

    public final void w1(java.util.LinkedList linkedList, ce2.i iVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftPlayPluginV1", "start random gift animation, randomGifts:".concat(kz5.n0.g0(linkedList, null, null, null, 0, null, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gn.f194249d, 31, null)));
        this.f194828v.addAll(linkedList);
        this.f194827u = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(this, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hn(this, iVar, null), 2, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void z0() {
        super.z0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(this, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dn(this, null), 3, null);
    }
}
