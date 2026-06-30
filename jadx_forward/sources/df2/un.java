package df2;

/* loaded from: classes10.dex */
public final class un extends if2.b implements mf2.n, if2.e {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f313072m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f313073n;

    /* renamed from: o, reason: collision with root package name */
    public rf2.o1 f313074o;

    /* renamed from: p, reason: collision with root package name */
    public rf2.v0 f313075p;

    /* renamed from: q, reason: collision with root package name */
    public rf2.c2 f313076q;

    /* renamed from: r, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.y0 f313077r;

    /* renamed from: s, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.y0 f313078s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public un(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f313072m = "Finder.LiveMilestoneLotteryMainController";
    }

    @Override // mf2.n
    public void S0(mm2.r4 data, boolean z17, boolean z18, boolean z19) {
        yz5.q qVar;
        yz5.q qVar2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        rf2.v0 v0Var = this.f313075p;
        if (v0Var != null && (qVar2 = v0Var.f476450d) != null) {
            qVar2.mo147xb9724478(data, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        }
        rf2.c2 c2Var = this.f313076q;
        if (c2Var == null || (qVar = c2Var.f476220i) == null) {
            return;
        }
        qVar.mo147xb9724478(data, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
    }

    public final void Z6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f313072m, "hideMainPage");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) S6(com.p314xaae8f345.mm.R.id.fb8);
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        android.view.View view = this.f313073n;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveMilestoneLotteryMainController", "hideMainPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/LiveMilestoneLotteryMainController", "hideMainPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f313073n = null;
        rf2.v0 v0Var = this.f313075p;
        if (v0Var != null) {
            v0Var.f476450d = null;
        }
        rf2.c2 c2Var = this.f313076q;
        if (c2Var != null) {
            c2Var.f476220i = null;
        }
        this.f313074o = null;
        this.f313075p = null;
        this.f313076q = null;
        p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f313078s;
        if (y0Var != null) {
            p3325xe03a0797.p3326xc267989b.z0.c(y0Var, null);
        }
        this.f313078s = null;
        p3325xe03a0797.p3326xc267989b.y0 y0Var2 = this.f313077r;
        if (y0Var2 != null) {
            p3325xe03a0797.p3326xc267989b.z0.c(y0Var2, null);
        }
        this.f313077r = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a7(java.lang.String r9, boolean r10, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof df2.nn
            if (r0 == 0) goto L13
            r0 = r11
            df2.nn r0 = (df2.nn) r0
            int r1 = r0.f312400f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f312400f = r1
            goto L18
        L13:
            df2.nn r0 = new df2.nn
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f312398d
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f312400f
            jz5.f0 r3 = jz5.f0.f384359a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L36
            if (r2 == r5) goto L31
            if (r2 != r4) goto L29
            goto L31
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L31:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            goto Lb3
        L36:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r2 = "jumpLottery lottery id:"
            r11.<init>(r2)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            java.lang.String r2 = r8.f313072m
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r11)
            r11 = 0
            if (r9 == 0) goto L58
            int r6 = r9.length()
            if (r6 != 0) goto L56
            goto L58
        L56:
            r6 = r11
            goto L59
        L58:
            r6 = r5
        L59:
            if (r6 == 0) goto L61
            java.lang.String r9 = "jumpLottery lottery_id empty"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r9)
            return r3
        L61:
            kotlinx.coroutines.y0 r2 = r8.f313077r
            r6 = 0
            if (r2 == 0) goto L69
            p3325xe03a0797.p3326xc267989b.z0.c(r2, r6)
        L69:
            kotlinx.coroutines.c0 r2 = p3325xe03a0797.p3326xc267989b.t3.a(r6, r5, r6)
            kotlinx.coroutines.p0 r6 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            kotlinx.coroutines.g3 r6 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a
            kotlinx.coroutines.c3 r2 = (p3325xe03a0797.p3326xc267989b.c3) r2
            oz5.l r2 = r2.mo7096x348d9a(r6)
            kotlinx.coroutines.x0 r6 = new kotlinx.coroutines.x0
            java.lang.String r7 = "lotteryPageScope"
            r6.<init>(r7)
            oz5.l r2 = r2.mo7096x348d9a(r6)
            kotlinx.coroutines.y0 r2 = p3325xe03a0797.p3326xc267989b.z0.a(r2)
            r8.f313077r = r2
            android.view.View r2 = r8.f313073n
            if (r2 == 0) goto Lb3
            rf2.v0 r6 = r8.f313075p
            if (r6 != 0) goto L97
            rf2.v0 r6 = new rf2.v0
            r6.<init>(r2, r8)
            r8.f313075p = r6
        L97:
            if (r10 == 0) goto La6
            rf2.v0 r10 = r8.f313075p
            if (r10 == 0) goto Lb3
            r0.f312400f = r5
            java.lang.Object r9 = r10.i(r9, r5, r11, r0)
            if (r9 != r1) goto Lb3
            return r1
        La6:
            rf2.v0 r10 = r8.f313075p
            if (r10 == 0) goto Lb3
            r0.f312400f = r4
            java.lang.Object r9 = r10.i(r9, r11, r11, r0)
            if (r9 != r1) goto Lb3
            return r1
        Lb3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.un.a7(java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void b7(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f313072m, "jumpVote " + str);
        android.view.View view = this.f313073n;
        if (view != null) {
            if (this.f313076q == null) {
                this.f313076q = new rf2.c2(view, this);
            }
            p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f313077r;
            if (y0Var != null) {
                p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new df2.on(this, str, null), 3, null);
            }
        }
    }

    public final void c7(android.view.View beforePage, android.view.View afterPage, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(beforePage, "beforePage");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(afterPage, "afterPage");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f313072m, "pageAnimate");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(beforePage, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveMilestoneLotteryMainController", "pageAnimate", "(Landroid/view/View;Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        beforePage.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(beforePage, "com/tencent/mm/plugin/finder/live/controller/LiveMilestoneLotteryMainController", "pageAnimate", "(Landroid/view/View;Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(afterPage, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveMilestoneLotteryMainController", "pageAnimate", "(Landroid/view/View;Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        afterPage.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(afterPage, "com/tencent/mm/plugin/finder/live/controller/LiveMilestoneLotteryMainController", "pageAnimate", "(Landroid/view/View;Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        float b17 = i65.a.b(afterPage.getContext(), 334);
        beforePage.animate().cancel();
        afterPage.animate().cancel();
        if (z17) {
            beforePage.setTranslationX(0.0f);
            beforePage.animate().translationX(0.0f - b17).setDuration(300L).start();
            afterPage.setTranslationX(b17);
            afterPage.animate().translationX(0.0f).setDuration(300L).start();
            return;
        }
        beforePage.setTranslationX(0.0f);
        beforePage.animate().translationX(b17).setDuration(300L).start();
        afterPage.setTranslationX(0.0f - b17);
        afterPage.animate().translationX(0.0f).setDuration(300L).start();
    }

    public final void d7(java.lang.String str) {
        jz5.f0 f0Var;
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator animate2;
        android.view.ViewPropertyAnimator animate3;
        java.lang.String str2 = this.f313072m;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "showMainPage");
        r45.g02 g02Var = (r45.g02) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.v4) m56788xbba4bfc0(mm2.v4.class)).f411010g).mo144003x754a37bb();
        if (g02Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "showMainPage but metaInfo null");
            return;
        }
        p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f313078s;
        if (y0Var != null) {
            p3325xe03a0797.p3326xc267989b.z0.c(y0Var, null);
        }
        boolean z17 = true;
        oz5.i a17 = p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null);
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        this.f313078s = p3325xe03a0797.p3326xc267989b.z0.a(((p3325xe03a0797.p3326xc267989b.c3) a17).mo7096x348d9a(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a).mo7096x348d9a(new p3325xe03a0797.p3326xc267989b.x0("lotteryPageScope")));
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) S6(com.p314xaae8f345.mm.R.id.fb8);
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            viewGroup.setVisibility(0);
            android.view.View inflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.brb, viewGroup, false);
            this.f313073n = inflate;
            viewGroup.addView(inflate, new android.widget.FrameLayout.LayoutParams(-1, -1));
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "cannot find finder_live_milestone_main_container");
            this.f313073n = null;
        }
        android.view.View view = this.f313073n;
        if (view != null) {
            view.setOnClickListener(new df2.pn(this));
            view.findViewById(com.p314xaae8f345.mm.R.id.by_).setOnClickListener(df2.qn.f312707d);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveMilestoneLotteryMainController", "showMainPage", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/LiveMilestoneLotteryMainController", "showMainPage", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f313074o = new rf2.o1(view, this);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "resetPage");
            android.view.View view2 = this.f313073n;
            android.view.View findViewById = view2 != null ? view2.findViewById(com.p314xaae8f345.mm.R.id.j8w) : null;
            android.view.View view3 = this.f313073n;
            android.view.View findViewById2 = view3 != null ? view3.findViewById(com.p314xaae8f345.mm.R.id.r3i) : null;
            android.view.View view4 = this.f313073n;
            android.view.View findViewById3 = view4 != null ? view4.findViewById(com.p314xaae8f345.mm.R.id.p_0) : null;
            if (findViewById != null) {
                findViewById.setTranslationX(0.0f);
            }
            if (findViewById != null && (animate3 = findViewById.animate()) != null) {
                animate3.cancel();
            }
            if (findViewById2 != null) {
                findViewById2.setTranslationX(0.0f);
            }
            if (findViewById2 != null && (animate2 = findViewById2.animate()) != null) {
                animate2.cancel();
            }
            if (findViewById3 != null) {
                findViewById3.setTranslationX(0.0f);
            }
            if (findViewById3 != null && (animate = findViewById3.animate()) != null) {
                animate.cancel();
            }
            rf2.o1 o1Var = this.f313074o;
            if (o1Var != null) {
                o1Var.b(g02Var, true, false);
            }
            p3325xe03a0797.p3326xc267989b.y0 y0Var2 = this.f313078s;
            if (y0Var2 != null) {
                p3325xe03a0797.p3326xc267989b.l.d(y0Var2, null, null, new df2.sn(this, null), 3, null);
            }
            if (str != null && str.length() != 0) {
                z17 = false;
            }
            if (z17) {
                return;
            }
            android.view.View view5 = this.f313073n;
            android.view.View findViewById4 = view5 != null ? view5.findViewById(com.p314xaae8f345.mm.R.id.j8w) : null;
            if (findViewById4 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById4, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveMilestoneLotteryMainController", "showMainPage", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/live/controller/LiveMilestoneLotteryMainController", "showMainPage", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            p3325xe03a0797.p3326xc267989b.y0 y0Var3 = this.f313078s;
            if (y0Var3 != null) {
                p3325xe03a0797.p3326xc267989b.l.d(y0Var3, null, null, new df2.tn(this, str, null), 3, null);
            }
        }
    }

    @Override // if2.e
    /* renamed from: onBackPress */
    public boolean mo124227x4ceae47d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f313072m, "onBackPress");
        android.view.View view = this.f313073n;
        if (!(view != null && view.getVisibility() == 0)) {
            return false;
        }
        Z6();
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f313072m, "onViewUnmount");
        this.f372636i = null;
        Z6();
    }
}
