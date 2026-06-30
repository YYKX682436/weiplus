package ow2;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: j */
    public static final ow2.b f430910j = new ow2.b(null);

    /* renamed from: k */
    public static android.graphics.Rect f430911k;

    /* renamed from: l */
    public static android.graphics.Rect f430912l;

    /* renamed from: a */
    public final android.content.Context f430913a;

    /* renamed from: b */
    public final android.view.View f430914b;

    /* renamed from: c */
    public final yz5.l f430915c;

    /* renamed from: d */
    public final jz5.g f430916d;

    /* renamed from: e */
    public boolean f430917e;

    /* renamed from: f */
    public in5.s0 f430918f;

    /* renamed from: g */
    public java.lang.Runnable f430919g;

    /* renamed from: h */
    public boolean f430920h;

    /* renamed from: i */
    public boolean f430921i;

    public h(android.content.Context context, android.view.View speedPlayLayout, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(speedPlayLayout, "speedPlayLayout");
        this.f430913a = context;
        this.f430914b = speedPlayLayout;
        this.f430915c = lVar;
        this.f430916d = jz5.h.b(new ow2.g(this));
    }

    public static /* synthetic */ void k(ow2.h hVar, in5.s0 s0Var, float f17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.al alVar, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            f17 = 2.0f;
        }
        if ((i17 & 4) != 0) {
            alVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.al.f213186e;
        }
        if ((i17 & 8) != 0) {
            z17 = false;
        }
        hVar.j(s0Var, f17, alVar, z17);
    }

    /* JADX WARN: Type inference failed for: r9v14, types: [ow2.c] */
    /* JADX WARN: Type inference failed for: r9v7, types: [ow2.d] */
    public final void a(boolean z17, in5.s0 s0Var, boolean z18) {
        android.graphics.Rect rect;
        android.widget.HorizontalScrollView d76;
        java.lang.String h17 = hc2.b0.h((so2.j5) s0Var.f374658i, false, 1, null);
        if (!z17) {
            android.view.View view = this.f430914b;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/video/speed/FinderSpeedIndicatorController", "checkAddOrRemoveSpeedLayout", "(ZLcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/video/speed/FinderSpeedIndicatorController", "checkAddOrRemoveSpeedLayout", "(ZLcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSpeedIndicatorController", h17 + " remove ...");
            return;
        }
        android.view.View view2 = this.f430914b;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(view2.getParent(), s0Var.f3639x46306858) && !z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSpeedIndicatorController", "checkAddOrRemoveSpeedLayout return for has added.");
            return;
        }
        android.view.ViewParent parent = view2.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(view2);
        }
        android.content.Context context = this.f430913a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        android.app.Activity activity = (android.app.Activity) context;
        pf5.z zVar = pf5.z.f435481a;
        if (!(activity instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl blVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl.class);
        ow2.b bVar = f430910j;
        if (blVar == null || (d76 = blVar.d7()) == null) {
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) activity.findViewById(com.p314xaae8f345.mm.R.id.tz_);
            if (viewGroup2 != null) {
                java.lang.Object obj = new p3321xbce91901.jvm.p3324x21ffc6bd.s(bVar) { // from class: ow2.d
                    @Override // p3321xbce91901.jvm.p3324x21ffc6bd.s, f06.s
                    public java.lang.Object get() {
                        return ow2.h.f430911k;
                    }
                }.get();
                if (!(((android.graphics.Rect) obj) != null)) {
                    obj = null;
                }
                rect = (android.graphics.Rect) obj;
                if (rect == null) {
                    android.graphics.Rect rect2 = new android.graphics.Rect();
                    viewGroup2.getGlobalVisibleRect(rect2);
                    f430911k = rect2;
                    rect = rect2;
                }
            } else {
                rect = null;
            }
        } else {
            java.lang.Object obj2 = new p3321xbce91901.jvm.p3324x21ffc6bd.s(bVar) { // from class: ow2.c
                @Override // p3321xbce91901.jvm.p3324x21ffc6bd.s, f06.s
                public java.lang.Object get() {
                    return ow2.h.f430912l;
                }
            }.get();
            if (!(((android.graphics.Rect) obj2) != null)) {
                obj2 = null;
            }
            rect = (android.graphics.Rect) obj2;
            if (rect == null) {
                rect = new android.graphics.Rect();
                d76.getGlobalVisibleRect(rect);
                f430912l = rect;
            }
        }
        if (rect == null) {
            return;
        }
        android.view.View view3 = s0Var.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view3, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) view3;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, rect.height());
        java.lang.Object tag = s0Var.f3639x46306858.getTag(com.p314xaae8f345.mm.R.id.tuy);
        java.lang.Integer num = tag instanceof java.lang.Integer ? (java.lang.Integer) tag : null;
        layoutParams.topMargin = num != null ? num.intValue() : rect.top;
        viewGroup3.addView(view2, layoutParams);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSpeedIndicatorController", h17 + " add top:" + rect.top + " height:" + rect.height());
    }

    public final void b(float f17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSpeedIndicatorController", "enterPendingLock speed=" + f17);
        this.f430921i = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15348xd72dc333 e17 = e();
        if (e17 != null) {
            e17.m62386xee1e63d0(f17);
            e17.e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.al.f213189h);
        }
    }

    public final void c(float f17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSpeedIndicatorController", "exitPendingLock speed=" + f17);
        this.f430921i = false;
        if (f17 == 1.0f) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15348xd72dc333 e17 = e();
            if (e17 != null) {
                e17.m62386xee1e63d0(f17);
                e17.e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.al.f213186e);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15348xd72dc333 e18 = e();
        if (e18 != null) {
            e18.m62386xee1e63d0(f17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15348xd72dc333 e19 = e();
        if (e19 != null) {
            e19.e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.al.f213185d);
        }
    }

    public final android.view.View d() {
        android.widget.HorizontalScrollView d76;
        android.content.Context context = this.f430913a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        android.app.Activity activity = (android.app.Activity) context;
        pf5.z zVar = pf5.z.f435481a;
        if (!(activity instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl blVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl.class);
        if (blVar != null && (d76 = blVar.d7()) != null) {
            return d76;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((android.app.Activity) context).findViewById(com.p314xaae8f345.mm.R.id.tz_);
        if (viewGroup != null) {
            return viewGroup.findViewById(com.p314xaae8f345.mm.R.id.ggm);
        }
        return null;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15348xd72dc333 e() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15348xd72dc333) ((jz5.n) this.f430916d).mo141623x754a37bb();
    }

    public final void f(in5.s0 holder, boolean z17) {
        android.view.View d17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        this.f430917e = false;
        this.f430920h = z17;
        this.f430921i = false;
        this.f430914b.removeCallbacks(this.f430919g);
        this.f430919g = null;
        if (!z17) {
            a(false, holder, false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15348xd72dc333 e17 = e();
        if (e17 != null) {
            e17.d();
        }
        android.view.View view = this.f430914b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/video/speed/FinderSpeedIndicatorController", "hideSpeedIndicator", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/video/speed/FinderSpeedIndicatorController", "hideSpeedIndicator", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f430918f = null;
        if (z17 || (d17 = d()) == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(d17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/video/speed/FinderSpeedIndicatorController", "hideSpeedIndicator", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        d17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(d17, "com/tencent/mm/plugin/finder/video/speed/FinderSpeedIndicatorController", "hideSpeedIndicator", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0048, code lost:
    
        if (r1 == null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(float r3, long r4, yz5.a r6, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.yk r7, in5.s0 r8, boolean r9) {
        /*
            r2 = this;
            java.lang.String r0 = "onTextDismiss"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r0)
            java.lang.String r0 = "lockSource"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r7, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "lockSpeed speed: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = ", isLandscape: "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FinderSpeedIndicatorController"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            r0 = 0
            r2.f430921i = r0
            if (r8 == 0) goto L4a
            boolean r0 = r2.f430917e
            jz5.f0 r1 = jz5.f0.f384359a
            if (r0 != 0) goto L36
            com.tencent.mm.plugin.finder.view.al r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.al.f213187f
            r2.j(r8, r3, r0, r9)
            goto L48
        L36:
            com.tencent.mm.plugin.finder.view.FinderSpeedIndicatorView r8 = r2.e()
            if (r8 == 0) goto L47
            r8.f213016v = r7
            r8.m62386xee1e63d0(r3)
            com.tencent.mm.plugin.finder.view.al r9 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.al.f213187f
            r8.e(r9)
            goto L48
        L47:
            r1 = 0
        L48:
            if (r1 != 0) goto L5a
        L4a:
            com.tencent.mm.plugin.finder.view.FinderSpeedIndicatorView r8 = r2.e()
            if (r8 == 0) goto L5a
            r8.f213016v = r7
            r8.m62386xee1e63d0(r3)
            com.tencent.mm.plugin.finder.view.al r3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.al.f213187f
            r8.e(r3)
        L5a:
            java.lang.Runnable r3 = r2.f430919g
            android.view.View r7 = r2.f430914b
            r7.removeCallbacks(r3)
            ow2.e r3 = new ow2.e
            r3.<init>(r6)
            r2.f430919g = r3
            r7.postDelayed(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ow2.h.g(float, long, yz5.a, com.tencent.mm.plugin.finder.view.yk, in5.s0, boolean):void");
    }

    public final void h(float f17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSpeedIndicatorController", "showPlaying speed: " + f17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15348xd72dc333 e17 = e();
        if (e17 != null) {
            e17.m62386xee1e63d0(f17);
            e17.e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.al.f213186e);
        }
    }

    public final void i(float f17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSpeedIndicatorController", "showSelector speed: " + f17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15348xd72dc333 e17 = e();
        if (e17 != null) {
            e17.m62386xee1e63d0(f17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15348xd72dc333 e18 = e();
        if (e18 != null) {
            e18.e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.al.f213185d);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15348xd72dc333 e19 = e();
        if (e19 != null) {
            e19.b();
        }
    }

    public final void j(in5.s0 holder, float f17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.al state, boolean z17) {
        android.view.View d17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        this.f430917e = true;
        this.f430920h = z17;
        this.f430921i = false;
        if (!z17) {
            a(true, holder, false);
        }
        this.f430914b.removeCallbacks(this.f430919g);
        this.f430918f = holder;
        android.view.View view = this.f430914b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/video/speed/FinderSpeedIndicatorController", "showSpeedIndicator", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;FLcom/tencent/mm/plugin/finder/view/FinderSpeedIndicatorView$State;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/video/speed/FinderSpeedIndicatorController", "showSpeedIndicator", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;FLcom/tencent/mm/plugin/finder/view/FinderSpeedIndicatorView$State;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15348xd72dc333 e17 = e();
        if (e17 != null) {
            e17.m62386xee1e63d0(f17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15348xd72dc333 e18 = e();
        if (e18 != null) {
            e18.e(state);
        }
        if (z17 || (d17 = d()) == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(d17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/video/speed/FinderSpeedIndicatorController", "showSpeedIndicator", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;FLcom/tencent/mm/plugin/finder/view/FinderSpeedIndicatorView$State;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        d17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(d17, "com/tencent/mm/plugin/finder/video/speed/FinderSpeedIndicatorController", "showSpeedIndicator", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;FLcom/tencent/mm/plugin/finder/view/FinderSpeedIndicatorView$State;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
