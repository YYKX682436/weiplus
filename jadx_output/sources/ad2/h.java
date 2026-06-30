package ad2;

/* loaded from: classes2.dex */
public abstract class h implements ad2.k {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f3143d;

    /* renamed from: f, reason: collision with root package name */
    public long f3145f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f3146g;

    /* renamed from: h, reason: collision with root package name */
    public xc2.p0 f3147h;

    /* renamed from: i, reason: collision with root package name */
    public in5.s0 f3148i;

    /* renamed from: m, reason: collision with root package name */
    public r45.wf6 f3149m;

    /* renamed from: n, reason: collision with root package name */
    public int f3150n;

    /* renamed from: o, reason: collision with root package name */
    public xc2.z2 f3151o;

    /* renamed from: p, reason: collision with root package name */
    public xc2.d1 f3152p;

    /* renamed from: q, reason: collision with root package name */
    public ad2.h f3153q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3154r;

    /* renamed from: s, reason: collision with root package name */
    public yz5.a f3155s;

    /* renamed from: v, reason: collision with root package name */
    public boolean f3158v;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f3144e = "";

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.jumper.observer.FeedJumperObserver$uiLifecycleObserver$1 f3156t = new td2.c() { // from class: com.tencent.mm.plugin.finder.feed.jumper.observer.FeedJumperObserver$uiLifecycleObserver$1
        @Override // td2.c
        public void onCreate(androidx.lifecycle.y var1) {
            kotlin.jvm.internal.o.g(var1, "var1");
        }

        @Override // td2.c
        public void onDestroy(androidx.lifecycle.y var1) {
            kotlin.jvm.internal.o.g(var1, "var1");
            ad2.h hVar = ad2.h.this;
            com.tencent.mars.xlog.Log.i(hVar.k(), "onDestroy feedId:".concat(pm0.v.u(hVar.f3145f)));
            ((com.tencent.mm.plugin.finder.feed.jumper.observer.FeedJumperObserver$descTopLeftStateEventListener$2$1) ((jz5.n) hVar.f3157u).getValue()).dead();
        }

        @Override // td2.c
        public void onPause(androidx.lifecycle.y var1) {
            kotlin.jvm.internal.o.g(var1, "var1");
        }

        @Override // td2.c
        public void onResume(androidx.lifecycle.y var1) {
            kotlin.jvm.internal.o.g(var1, "var1");
        }

        @Override // td2.c
        public void onStart(androidx.lifecycle.y var1) {
            kotlin.jvm.internal.o.g(var1, "var1");
        }

        @Override // td2.c
        public void onStop(androidx.lifecycle.y var1) {
            kotlin.jvm.internal.o.g(var1, "var1");
        }
    };

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f3157u = jz5.h.b(new ad2.c(this));

    public static void F(ad2.h hVar, android.view.View fromView, android.view.View toView, long j17, java.lang.Float f17, yz5.a aVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: transformView");
        }
        long j18 = (i17 & 4) != 0 ? 500L : j17;
        java.lang.Float f18 = (i17 & 8) != 0 ? null : f17;
        yz5.a aVar2 = (i17 & 16) == 0 ? aVar : null;
        hVar.getClass();
        kotlin.jvm.internal.o.g(fromView, "fromView");
        kotlin.jvm.internal.o.g(toView, "toView");
        android.graphics.Rect rect = new android.graphics.Rect();
        fromView.getGlobalVisibleRect(rect);
        android.graphics.Rect rect2 = new android.graphics.Rect();
        toView.getGlobalVisibleRect(rect2);
        int i18 = rect2.left - rect.left;
        int i19 = rect2.bottom - rect.bottom;
        int measuredWidth = fromView.getMeasuredWidth();
        int measuredHeight = fromView.getMeasuredHeight();
        android.view.ViewGroup.LayoutParams layoutParams = fromView.getLayoutParams();
        int i27 = layoutParams != null ? layoutParams.width : measuredWidth;
        android.view.ViewGroup.LayoutParams layoutParams2 = fromView.getLayoutParams();
        int i28 = layoutParams2 != null ? layoutParams2.height : measuredHeight;
        int measuredWidth2 = toView.getMeasuredWidth();
        int measuredHeight2 = toView.getMeasuredHeight();
        fromView.setPivotX(0.0f);
        fromView.setPivotY(fromView.getMeasuredHeight());
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        if (f18 != null) {
            f18.floatValue();
            h0Var.f310123d = java.lang.Float.valueOf(fromView.getAlpha() - f18.floatValue());
        }
        android.graphics.Rect rect3 = new android.graphics.Rect();
        android.animation.ValueAnimator duration = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(j18);
        duration.addListener(new ad2.f(hVar, fromView, aVar2, i27, i28));
        duration.addUpdateListener(new ad2.g(fromView, rect3, rect, i18, i19, measuredWidth, measuredWidth2, measuredHeight, measuredHeight2, h0Var));
        duration.start();
    }

    public void A(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
    }

    public void B(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, java.lang.String source) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        kotlin.jvm.internal.o.g(source, "source");
        xc2.z2 z2Var = this.f3151o;
        if (z2Var != null) {
            ((xc2.j) z2Var).f453166f = true;
        }
    }

    public void C(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mars.xlog.Log.i(k(), "onViewRecycled feedId:".concat(pm0.v.u(this.f3145f)));
        ((com.tencent.mm.plugin.finder.feed.jumper.observer.FeedJumperObserver$descTopLeftStateEventListener$2$1) ((jz5.n) this.f3157u).getValue()).dead();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0055, code lost:
    
        if (r1.f406177a == true) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void D(int r12) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ad2.h.D(int):void");
    }

    public void E(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, boolean z17, yz5.a aVar) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        if (!z17 || !xc2.y2.f453343a.w(holder.f293121e, infoEx)) {
            com.tencent.mars.xlog.Log.i(k(), "[show] no event, isWithAnimate:" + z17);
            f(250L, jumpView, z17, aVar);
            return;
        }
        com.tencent.mars.xlog.Log.i(k(), "[show] post event");
        this.f3155s = aVar;
        xc2.u0[] u0VarArr = xc2.u0.f453308d;
        com.tencent.mm.autogen.events.FinderJumperDescTopLeftStateEvent finderJumperDescTopLeftStateEvent = new com.tencent.mm.autogen.events.FinderJumperDescTopLeftStateEvent();
        long j17 = this.f3145f;
        am.lb lbVar = finderJumperDescTopLeftStateEvent.f54281g;
        lbVar.f7234a = j17;
        lbVar.f7235b = 0;
        finderJumperDescTopLeftStateEvent.e();
    }

    @Override // ad2.k
    public void c(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, boolean z17, yz5.a aVar) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        if (o(holder, infoEx.f453234a)) {
            java.lang.Object obj = holder.f293125i;
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = obj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj : null;
            if (baseFinderFeed != null && hc2.o0.D(baseFinderFeed.getFeedObject().getFeedObject(), false)) {
                com.tencent.mars.xlog.Log.i(k(), "onRealShow feedId=".concat(pm0.v.u(baseFinderFeed.getItemId())));
            }
            sc2.q8 q8Var = infoEx.f453233J;
            if (q8Var != null) {
                q8Var.f406177a = true;
            }
            xc2.z2 z2Var = this.f3151o;
            if (z2Var != null) {
                z2Var.e(holder, jumpView, infoEx);
            }
            E(holder, jumpView, infoEx, z17, aVar);
        }
    }

    @Override // ad2.k
    public void d(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, boolean z17, yz5.a aVar) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        sc2.q8 q8Var = infoEx.f453233J;
        if (q8Var != null) {
            q8Var.f406177a = false;
        }
        java.lang.Object obj = holder.f293125i;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = obj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj : null;
        if (baseFinderFeed != null && hc2.o0.D(baseFinderFeed.getFeedObject().getFeedObject(), false)) {
            com.tencent.mars.xlog.Log.i(k(), "onRealHide feedId=".concat(pm0.v.u(baseFinderFeed.getItemId())));
        }
        xc2.z2 z2Var = this.f3151o;
        n(jumpView, z17, aVar);
    }

    public final void e(boolean z17, boolean z18) {
        android.view.View view;
        java.lang.Object obj;
        boolean z19;
        r45.wf6 wf6Var;
        boolean z27;
        xc2.p0 p0Var;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo;
        java.util.LinkedList<r45.wf6> style;
        java.lang.Object obj2;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject;
        r45.dm2 object_extend;
        r45.cl2 cl2Var;
        if (this.f3158v) {
            return;
        }
        in5.s0 s0Var = this.f3148i;
        android.view.View view2 = null;
        android.view.View p17 = s0Var != null ? s0Var.p(com.tencent.mm.R.id.chy) : null;
        if (p17 == null) {
            return;
        }
        boolean booleanValue = ((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.L0().r()).booleanValue();
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        if (booleanValue) {
            in5.s0 s0Var2 = this.f3148i;
            if (s0Var2 != null) {
                bw2.o oVar = bw2.o.f24869a;
                view = ((bw2.t) ((yz5.l) ((jz5.n) bw2.o.f24880l).getValue()).invoke(s0Var2)).b();
            } else {
                view = null;
            }
        } else {
            in5.s0 s0Var3 = this.f3148i;
            view = s0Var3 != null ? s0Var3.p(com.tencent.mm.R.id.e_2) : null;
            if (view == null) {
                return;
            }
        }
        h0Var.f310123d = view;
        xc2.p0 p0Var2 = this.f3147h;
        if (p0Var2 == null) {
            return;
        }
        java.util.LinkedList<r45.wf6> style2 = p0Var2.f453234a.getStyle();
        kotlin.jvm.internal.o.f(style2, "getStyle(...)");
        java.util.Iterator<T> it = style2.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (p0Var2.f453256r == ((r45.wf6) obj).getInteger(1)) {
                    break;
                }
            }
        }
        r45.wf6 wf6Var2 = (r45.wf6) obj;
        boolean z28 = p17.getVisibility() == 0;
        in5.s0 s0Var4 = this.f3148i;
        so2.u1 u1Var = s0Var4 != null ? (so2.u1) s0Var4.f293125i : null;
        if (!(u1Var instanceof so2.u1)) {
            u1Var = null;
        }
        if (u1Var != null) {
            com.tencent.mm.plugin.finder.storage.FinderItem feedObject2 = u1Var.getFeedObject();
            z19 = (feedObject2 == null || (feedObject = feedObject2.getFeedObject()) == null || (object_extend = feedObject.getObject_extend()) == null || (cl2Var = (r45.cl2) object_extend.getCustom(4)) == null) ? false : cl2Var.getBoolean(9);
        } else {
            z19 = false;
        }
        xc2.p0 p0Var3 = this.f3147h;
        ad2.h hVar = p0Var3 != null ? p0Var3.f453240d : null;
        if (hVar == null || (p0Var = hVar.f3147h) == null || (finderJumpInfo = p0Var.f453234a) == null || (style = finderJumpInfo.getStyle()) == null) {
            wf6Var = null;
        } else {
            java.util.Iterator<T> it6 = style.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it6.next();
                r45.wf6 wf6Var3 = (r45.wf6) obj2;
                xc2.p0 p0Var4 = hVar.f3147h;
                if (p0Var4 != null && p0Var4.f453256r == wf6Var3.getInteger(1)) {
                    break;
                }
            }
            wf6Var = (r45.wf6) obj2;
        }
        boolean z29 = (wf6Var != null ? wf6Var.getInteger(16) : 0) == 0;
        if (z17 || z28 != z29) {
            if (h0Var.f310123d == null && booleanValue) {
                in5.s0 s0Var5 = this.f3148i;
                if (s0Var5 != null) {
                    bw2.o oVar2 = bw2.o.f24869a;
                    view2 = ((bw2.t) ((yz5.l) ((jz5.n) bw2.o.f24880l).getValue()).invoke(s0Var5)).a();
                }
                h0Var.f310123d = view2;
            }
            if (h0Var.f310123d == null) {
                return;
            }
            if (z17) {
                z27 = (wf6Var2 != null ? wf6Var2.getInteger(16) : 0) == 0;
            } else {
                z27 = z29;
            }
            if (z18) {
                if (z28 != z27) {
                    this.f3158v = true;
                    if (!z27) {
                        p17.animate().alpha(0.0f).setDuration(200L).setListener(new ad2.b(this, p17, z19, h0Var)).start();
                        return;
                    }
                    android.view.View view3 = (android.view.View) h0Var.f310123d;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver", "checkShowDescription", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver", "checkShowDescription", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    android.view.View view4 = p17;
                    yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver", "checkShowDescription", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view4, "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver", "checkShowDescription", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p17.animate().alpha(1.0f).setDuration(200L).setListener(new ad2.a(this, p17)).start();
                    return;
                }
                return;
            }
            int i17 = z27 ? 0 : 8;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(p17, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver", "checkShowDescription", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver", "checkShowDescription", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(p17, arrayList4.toArray(), "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver", "checkShowDescription", "(ZZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            p17.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver", "checkShowDescription", "(ZZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            android.view.View view5 = (android.view.View) h0Var.f310123d;
            int i18 = (z27 || z19) ? 8 : 0;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver", "checkShowDescription", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver", "checkShowDescription", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view6 = (android.view.View) h0Var.f310123d;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver", "checkShowDescription", "(ZZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view6.setAlpha(((java.lang.Float) arrayList6.get(0)).floatValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver", "checkShowDescription", "(ZZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }

    public final void f(long j17, android.view.View jumpView, boolean z17, yz5.a aVar) {
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        if (z17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(jumpView, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver", "fadeInAnimate", "(JLandroid/view/View;ZLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            jumpView.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(jumpView, "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver", "fadeInAnimate", "(JLandroid/view/View;ZLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(jumpView, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver", "fadeInAnimate", "(JLandroid/view/View;ZLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            jumpView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(jumpView, "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver", "fadeInAnimate", "(JLandroid/view/View;ZLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f3154r = true;
            android.animation.ObjectAnimator duration = android.animation.ObjectAnimator.ofFloat(jumpView, "alpha", 0.0f, 1.0f).setDuration(j17);
            kotlin.jvm.internal.o.f(duration, "setDuration(...)");
            duration.addListener(new ad2.d(this, aVar));
            duration.start();
            return;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList3.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(jumpView, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver", "fadeInAnimate", "(JLandroid/view/View;ZLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        jumpView.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
        yj0.a.f(jumpView, "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver", "fadeInAnimate", "(JLandroid/view/View;ZLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(jumpView, arrayList4.toArray(), "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver", "fadeInAnimate", "(JLandroid/view/View;ZLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        jumpView.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(jumpView, "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver", "fadeInAnimate", "(JLandroid/view/View;ZLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        xc2.p0 p0Var = this.f3147h;
        sc2.q8 q8Var = p0Var != null ? p0Var.f453233J : null;
        if (q8Var == null) {
            return;
        }
        q8Var.f406178b = true;
    }

    public final void g(long j17, android.view.View jumpView, boolean z17, yz5.a aVar) {
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        if (z17) {
            this.f3154r = true;
            android.animation.ObjectAnimator duration = android.animation.ObjectAnimator.ofFloat(jumpView, "alpha", 1.0f, 0.0f).setDuration(j17);
            kotlin.jvm.internal.o.f(duration, "setDuration(...)");
            duration.addListener(new ad2.e(this, jumpView, aVar));
            duration.start();
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(jumpView, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver", "fadeOutAnimate", "(JLandroid/view/View;ZLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        jumpView.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(jumpView, "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver", "fadeOutAnimate", "(JLandroid/view/View;ZLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(jumpView, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver", "fadeOutAnimate", "(JLandroid/view/View;ZLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        jumpView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(jumpView, "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver", "fadeOutAnimate", "(JLandroid/view/View;ZLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public java.lang.String h() {
        return this.f3146g;
    }

    public long i() {
        return this.f3145f;
    }

    public gs2.a j(com.tencent.mm.protocal.protobuf.FinderJumpInfo info) {
        kotlin.jvm.internal.o.g(info, "info");
        int business_type = info.getBusiness_type();
        return business_type != 1 ? business_type != 2 ? business_type != 3 ? business_type != 8 ? business_type != 18 ? business_type != 25 ? business_type != 35 ? business_type != 39 ? business_type != 110 ? gs2.a.C : gs2.a.F : gs2.a.f275057p : gs2.a.f275066y : gs2.a.f275061t : gs2.a.B : gs2.a.f275056o : gs2.a.f275067z : gs2.a.f275052h : gs2.a.f275055n;
    }

    public java.lang.String k() {
        return "FeedJumperObserver";
    }

    public final java.lang.String l(java.lang.String str, java.lang.String str2) {
        return !com.tencent.mm.sdk.platformtools.t8.K0(str) ? str : str2;
    }

    public boolean m(xc2.p0 infoEx) {
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        java.lang.String wording = infoEx.f453234a.getWording();
        return wording != null && wording.length() > 0;
    }

    public void n(android.view.View jumpView, boolean z17, yz5.a aVar) {
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        g(250L, jumpView, z17, aVar);
    }

    public boolean o(in5.s0 holder, com.tencent.mm.protocal.protobuf.FinderJumpInfo info) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(info, "info");
        return gs2.c.f275072a.c(holder.hashCode(), j(info));
    }

    public void p(in5.s0 holder, xc2.t0 action) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(action, "action");
    }

    public void q(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, java.lang.String source) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        kotlin.jvm.internal.o.g(source, "source");
        xc2.z2 z2Var = this.f3151o;
        if (z2Var != null) {
            z2Var.d(holder, jumpView, infoEx);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r0.getIsPreview() == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void r(in5.s0 r3, android.view.View r4, xc2.p0 r5) {
        /*
            r2 = this;
            java.lang.String r0 = "holder"
            kotlin.jvm.internal.o.g(r3, r0)
            java.lang.String r0 = "jumpView"
            kotlin.jvm.internal.o.g(r4, r0)
            java.lang.String r0 = "infoEx"
            kotlin.jvm.internal.o.g(r5, r0)
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = r5.f453244f
            if (r0 == 0) goto L1b
            boolean r0 = r0.getIsPreview()
            r1 = 1
            if (r0 != r1) goto L1b
            goto L1c
        L1b:
            r1 = 0
        L1c:
            if (r1 == 0) goto L1f
            return
        L1f:
            xc2.z2 r0 = r2.f3151o
            if (r0 == 0) goto L2b
            xc2.j r0 = (xc2.j) r0
            r0.r(r3, r4, r5)
            r0.q(r3, r4, r5)
        L2b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ad2.h.r(in5.s0, android.view.View, xc2.p0):void");
    }

    public void s(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
    }

    public void t() {
    }

    public void u(boolean z17, in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        xc2.z2 z2Var = this.f3151o;
        if (z2Var != null) {
            z2Var.h(z17, holder, jumpView, infoEx);
        }
    }

    public void v(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        java.lang.String simpleName;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject2;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = infoEx.f453244f;
        boolean z17 = false;
        if (baseFinderFeed != null && (feedObject = baseFinderFeed.getFeedObject()) != null && (feedObject2 = feedObject.getFeedObject()) != null && hc2.o0.D(feedObject2, false)) {
            z17 = true;
        }
        if (z17) {
            xc2.z2 z2Var = this.f3151o;
            if (z2Var == null) {
                simpleName = "null";
            } else {
                kotlin.jvm.internal.o.d(z2Var);
                simpleName = z2Var.getClass().getSimpleName();
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("viewEventHandler", simpleName);
            xc2.o0 o0Var = infoEx.f453246h;
            xc2.n0 n0Var = o0Var instanceof xc2.n0 ? (xc2.n0) o0Var : null;
            long j17 = n0Var != null ? n0Var.f453230i : 0L;
            android.content.Context context = jumpView.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.tencent.mm.plugin.finder.viewmodel.component.p1 p1Var = (com.tencent.mm.plugin.finder.viewmodel.component.p1) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.viewmodel.component.p1.class);
            if (p1Var != null) {
                p1Var.O6(this.f3145f, "observer.onJumpViewFocus", jSONObject, j17);
            }
        }
        xc2.z2 z2Var2 = this.f3151o;
        if (z2Var2 != null) {
            z2Var2.f(holder, jumpView, infoEx);
        }
    }

    public void w(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        java.lang.String simpleName;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject2;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = infoEx.f453244f;
        boolean z17 = false;
        if (baseFinderFeed != null && (feedObject = baseFinderFeed.getFeedObject()) != null && (feedObject2 = feedObject.getFeedObject()) != null && hc2.o0.D(feedObject2, false)) {
            z17 = true;
        }
        if (z17) {
            xc2.z2 z2Var = this.f3151o;
            if (z2Var == null) {
                simpleName = "null";
            } else {
                kotlin.jvm.internal.o.d(z2Var);
                simpleName = z2Var.getClass().getSimpleName();
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("viewEventHandler", simpleName);
            xc2.o0 o0Var = infoEx.f453246h;
            xc2.n0 n0Var = o0Var instanceof xc2.n0 ? (xc2.n0) o0Var : null;
            long j17 = n0Var != null ? n0Var.f453230i : 0L;
            android.content.Context context = jumpView.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.tencent.mm.plugin.finder.viewmodel.component.p1 p1Var = (com.tencent.mm.plugin.finder.viewmodel.component.p1) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.viewmodel.component.p1.class);
            if (p1Var != null) {
                p1Var.O6(this.f3145f, "observer.onJumpViewUnFocus", jSONObject, j17);
            }
        }
        xc2.z2 z2Var2 = this.f3151o;
        if (z2Var2 != null) {
            z2Var2.i(holder, jumpView, infoEx);
        }
    }

    public void x(android.view.View jumpView, xc2.p0 infoEx) {
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        xc2.z2 z2Var = this.f3151o;
        if (z2Var != null) {
            z2Var.g(jumpView, infoEx);
        }
    }

    public void y(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, ec2.f event) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        kotlin.jvm.internal.o.g(event, "event");
        xc2.z2 z2Var = this.f3151o;
        if (z2Var != null) {
            z2Var.j(holder, jumpView, infoEx, event);
        }
    }

    public void z(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, int i17) {
        int delay_preload_time;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        xc2.z2 z2Var = this.f3151o;
        if (z2Var != null) {
            xc2.j jVar = (xc2.j) z2Var;
            if (!jVar.t() || infoEx.f453262x || i17 < (delay_preload_time = infoEx.f453234a.getDelay_preload_time())) {
                return;
            }
            com.tencent.mars.xlog.Log.i("BaseJumperEventHandler", "onPlayProgress: curProgress=" + i17 + " delayPreloadTime=" + delay_preload_time);
            infoEx.f453262x = true;
            jVar.s();
        }
    }
}
