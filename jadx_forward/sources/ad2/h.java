package ad2;

/* loaded from: classes2.dex */
public abstract class h implements ad2.k {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f84676d;

    /* renamed from: f, reason: collision with root package name */
    public long f84678f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f84679g;

    /* renamed from: h, reason: collision with root package name */
    public xc2.p0 f84680h;

    /* renamed from: i, reason: collision with root package name */
    public in5.s0 f84681i;

    /* renamed from: m, reason: collision with root package name */
    public r45.wf6 f84682m;

    /* renamed from: n, reason: collision with root package name */
    public int f84683n;

    /* renamed from: o, reason: collision with root package name */
    public xc2.z2 f84684o;

    /* renamed from: p, reason: collision with root package name */
    public xc2.d1 f84685p;

    /* renamed from: q, reason: collision with root package name */
    public ad2.h f84686q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f84687r;

    /* renamed from: s, reason: collision with root package name */
    public yz5.a f84688s;

    /* renamed from: v, reason: collision with root package name */
    public boolean f84691v;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f84677e = "";

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1457xbb85ad5b.p1458x14c752d6.C13833xa77a8584 f84689t = new td2.c() { // from class: com.tencent.mm.plugin.finder.feed.jumper.observer.FeedJumperObserver$uiLifecycleObserver$1
        @Override // td2.c
        /* renamed from: onCreate */
        public void mo55613x3e5a77bb(p012xc85e97e9.p093xedfae76a.y var1) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(var1, "var1");
        }

        @Override // td2.c
        /* renamed from: onDestroy */
        public void mo55614xac79a11b(p012xc85e97e9.p093xedfae76a.y var1) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(var1, "var1");
            ad2.h hVar = ad2.h.this;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(hVar.k(), "onDestroy feedId:".concat(pm0.v.u(hVar.f84678f)));
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1457xbb85ad5b.p1458x14c752d6.C13832xb2eefbce) ((jz5.n) hVar.f84690u).mo141623x754a37bb()).mo48814x2efc64();
        }

        @Override // td2.c
        /* renamed from: onPause */
        public void mo55615xb01dfb57(p012xc85e97e9.p093xedfae76a.y var1) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(var1, "var1");
        }

        @Override // td2.c
        /* renamed from: onResume */
        public void mo55616x57429eec(p012xc85e97e9.p093xedfae76a.y var1) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(var1, "var1");
        }

        @Override // td2.c
        /* renamed from: onStart */
        public void mo55617xb05099c3(p012xc85e97e9.p093xedfae76a.y var1) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(var1, "var1");
        }

        @Override // td2.c
        /* renamed from: onStop */
        public void mo55618xc39f8281(p012xc85e97e9.p093xedfae76a.y var1) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(var1, "var1");
        }
    };

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f84690u = jz5.h.b(new ad2.c(this));

    public static void F(ad2.h hVar, android.view.View fromView, android.view.View toView, long j17, java.lang.Float f17, yz5.a aVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: transformView");
        }
        long j18 = (i17 & 4) != 0 ? 500L : j17;
        java.lang.Float f18 = (i17 & 8) != 0 ? null : f17;
        yz5.a aVar2 = (i17 & 16) == 0 ? aVar : null;
        hVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromView, "fromView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toView, "toView");
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
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        if (f18 != null) {
            f18.floatValue();
            h0Var.f391656d = java.lang.Float.valueOf(fromView.getAlpha() - f18.floatValue());
        }
        android.graphics.Rect rect3 = new android.graphics.Rect();
        android.animation.ValueAnimator duration = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(j18);
        duration.addListener(new ad2.f(hVar, fromView, aVar2, i27, i28));
        duration.addUpdateListener(new ad2.g(fromView, rect3, rect, i18, i19, measuredWidth, measuredWidth2, measuredHeight, measuredHeight2, h0Var));
        duration.start();
    }

    public void A(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
    }

    public void B(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        xc2.z2 z2Var = this.f84684o;
        if (z2Var != null) {
            ((xc2.j) z2Var).f534699f = true;
        }
    }

    public void C(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k(), "onViewRecycled feedId:".concat(pm0.v.u(this.f84678f)));
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1457xbb85ad5b.p1458x14c752d6.C13832xb2eefbce) ((jz5.n) this.f84690u).mo141623x754a37bb()).mo48814x2efc64();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0055, code lost:
    
        if (r1.f487710a == true) goto L15;
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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        if (!z17 || !xc2.y2.f534876a.w(holder.f374654e, infoEx)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k(), "[show] no event, isWithAnimate:" + z17);
            f(250L, jumpView, z17, aVar);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k(), "[show] post event");
        this.f84688s = aVar;
        xc2.u0[] u0VarArr = xc2.u0.f534841d;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5476xff2a9b53 c5476xff2a9b53 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5476xff2a9b53();
        long j17 = this.f84678f;
        am.lb lbVar = c5476xff2a9b53.f135814g;
        lbVar.f88767a = j17;
        lbVar.f88768b = 0;
        c5476xff2a9b53.e();
    }

    @Override // ad2.k
    public void c(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, boolean z17, yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        if (o(holder, infoEx.f534767a)) {
            java.lang.Object obj = holder.f374658i;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj : null;
            if (abstractC14490x69736cb5 != null && hc2.o0.D(abstractC14490x69736cb5.getFeedObject().getFeedObject(), false)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k(), "onRealShow feedId=".concat(pm0.v.u(abstractC14490x69736cb5.mo2128x1ed62e84())));
            }
            sc2.q8 q8Var = infoEx.f534766J;
            if (q8Var != null) {
                q8Var.f487710a = true;
            }
            xc2.z2 z2Var = this.f84684o;
            if (z2Var != null) {
                z2Var.e(holder, jumpView, infoEx);
            }
            E(holder, jumpView, infoEx, z17, aVar);
        }
    }

    @Override // ad2.k
    public void d(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, boolean z17, yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        sc2.q8 q8Var = infoEx.f534766J;
        if (q8Var != null) {
            q8Var.f487710a = false;
        }
        java.lang.Object obj = holder.f374658i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj : null;
        if (abstractC14490x69736cb5 != null && hc2.o0.D(abstractC14490x69736cb5.getFeedObject().getFeedObject(), false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k(), "onRealHide feedId=".concat(pm0.v.u(abstractC14490x69736cb5.mo2128x1ed62e84())));
        }
        xc2.z2 z2Var = this.f84684o;
        n(jumpView, z17, aVar);
    }

    public final void e(boolean z17, boolean z18) {
        android.view.View view;
        java.lang.Object obj;
        boolean z19;
        r45.wf6 wf6Var;
        boolean z27;
        xc2.p0 p0Var;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862;
        java.util.LinkedList<r45.wf6> m76521x7528c3fb;
        java.lang.Object obj2;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject;
        r45.dm2 m76806xdef68064;
        r45.cl2 cl2Var;
        if (this.f84691v) {
            return;
        }
        in5.s0 s0Var = this.f84681i;
        android.view.View view2 = null;
        android.view.View p17 = s0Var != null ? s0Var.p(com.p314xaae8f345.mm.R.id.chy) : null;
        if (p17 == null) {
            return;
        }
        boolean booleanValue = ((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.L0().r()).booleanValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        if (booleanValue) {
            in5.s0 s0Var2 = this.f84681i;
            if (s0Var2 != null) {
                bw2.o oVar = bw2.o.f106402a;
                view = ((bw2.t) ((yz5.l) ((jz5.n) bw2.o.f106413l).mo141623x754a37bb()).mo146xb9724478(s0Var2)).b();
            } else {
                view = null;
            }
        } else {
            in5.s0 s0Var3 = this.f84681i;
            view = s0Var3 != null ? s0Var3.p(com.p314xaae8f345.mm.R.id.e_2) : null;
            if (view == null) {
                return;
            }
        }
        h0Var.f391656d = view;
        xc2.p0 p0Var2 = this.f84680h;
        if (p0Var2 == null) {
            return;
        }
        java.util.LinkedList<r45.wf6> m76521x7528c3fb2 = p0Var2.f534767a.m76521x7528c3fb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m76521x7528c3fb2, "getStyle(...)");
        java.util.Iterator<T> it = m76521x7528c3fb2.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (p0Var2.f534789r == ((r45.wf6) obj).m75939xb282bd08(1)) {
                    break;
                }
            }
        }
        r45.wf6 wf6Var2 = (r45.wf6) obj;
        boolean z28 = p17.getVisibility() == 0;
        in5.s0 s0Var4 = this.f84681i;
        so2.u1 u1Var = s0Var4 != null ? (so2.u1) s0Var4.f374658i : null;
        if (!(u1Var instanceof so2.u1)) {
            u1Var = null;
        }
        if (u1Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject2 = u1Var.getFeedObject();
            z19 = (feedObject2 == null || (feedObject = feedObject2.getFeedObject()) == null || (m76806xdef68064 = feedObject.m76806xdef68064()) == null || (cl2Var = (r45.cl2) m76806xdef68064.m75936x14adae67(4)) == null) ? false : cl2Var.m75933x41a8a7f2(9);
        } else {
            z19 = false;
        }
        xc2.p0 p0Var3 = this.f84680h;
        ad2.h hVar = p0Var3 != null ? p0Var3.f534773d : null;
        if (hVar == null || (p0Var = hVar.f84680h) == null || (c19786x6a1e2862 = p0Var.f534767a) == null || (m76521x7528c3fb = c19786x6a1e2862.m76521x7528c3fb()) == null) {
            wf6Var = null;
        } else {
            java.util.Iterator<T> it6 = m76521x7528c3fb.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it6.next();
                r45.wf6 wf6Var3 = (r45.wf6) obj2;
                xc2.p0 p0Var4 = hVar.f84680h;
                if (p0Var4 != null && p0Var4.f534789r == wf6Var3.m75939xb282bd08(1)) {
                    break;
                }
            }
            wf6Var = (r45.wf6) obj2;
        }
        boolean z29 = (wf6Var != null ? wf6Var.m75939xb282bd08(16) : 0) == 0;
        if (z17 || z28 != z29) {
            if (h0Var.f391656d == null && booleanValue) {
                in5.s0 s0Var5 = this.f84681i;
                if (s0Var5 != null) {
                    bw2.o oVar2 = bw2.o.f106402a;
                    view2 = ((bw2.t) ((yz5.l) ((jz5.n) bw2.o.f106413l).mo141623x754a37bb()).mo146xb9724478(s0Var5)).a();
                }
                h0Var.f391656d = view2;
            }
            if (h0Var.f391656d == null) {
                return;
            }
            if (z17) {
                z27 = (wf6Var2 != null ? wf6Var2.m75939xb282bd08(16) : 0) == 0;
            } else {
                z27 = z29;
            }
            if (z18) {
                if (z28 != z27) {
                    this.f84691v = true;
                    if (!z27) {
                        p17.animate().alpha(0.0f).setDuration(200L).setListener(new ad2.b(this, p17, z19, h0Var)).start();
                        return;
                    }
                    android.view.View view3 = (android.view.View) h0Var.f391656d;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
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
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
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
            android.view.View view5 = (android.view.View) h0Var.f391656d;
            int i18 = (z27 || z19) ? 8 : 0;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver", "checkShowDescription", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver", "checkShowDescription", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view6 = (android.view.View) h0Var.f391656d;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver", "checkShowDescription", "(ZZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view6.setAlpha(((java.lang.Float) arrayList6.get(0)).floatValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver", "checkShowDescription", "(ZZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }

    public final void f(long j17, android.view.View jumpView, boolean z17, yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        if (z17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
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
            this.f84687r = true;
            android.animation.ObjectAnimator duration = android.animation.ObjectAnimator.ofFloat(jumpView, "alpha", 0.0f, 1.0f).setDuration(j17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(duration, "setDuration(...)");
            duration.addListener(new ad2.d(this, aVar));
            duration.start();
            return;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
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
        xc2.p0 p0Var = this.f84680h;
        sc2.q8 q8Var = p0Var != null ? p0Var.f534766J : null;
        if (q8Var == null) {
            return;
        }
        q8Var.f487711b = true;
    }

    public final void g(long j17, android.view.View jumpView, boolean z17, yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        if (z17) {
            this.f84687r = true;
            android.animation.ObjectAnimator duration = android.animation.ObjectAnimator.ofFloat(jumpView, "alpha", 1.0f, 0.0f).setDuration(j17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(duration, "setDuration(...)");
            duration.addListener(new ad2.e(this, jumpView, aVar));
            duration.start();
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
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
        return this.f84679g;
    }

    public long i() {
        return this.f84678f;
    }

    public gs2.a j(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        int m76480xe2ee1ca3 = info.m76480xe2ee1ca3();
        return m76480xe2ee1ca3 != 1 ? m76480xe2ee1ca3 != 2 ? m76480xe2ee1ca3 != 3 ? m76480xe2ee1ca3 != 8 ? m76480xe2ee1ca3 != 18 ? m76480xe2ee1ca3 != 25 ? m76480xe2ee1ca3 != 35 ? m76480xe2ee1ca3 != 39 ? m76480xe2ee1ca3 != 110 ? gs2.a.C : gs2.a.F : gs2.a.f356590p : gs2.a.f356599y : gs2.a.f356594t : gs2.a.B : gs2.a.f356589o : gs2.a.f356600z : gs2.a.f356585h : gs2.a.f356588n;
    }

    public java.lang.String k() {
        return "FeedJumperObserver";
    }

    public final java.lang.String l(java.lang.String str, java.lang.String str2) {
        return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? str : str2;
    }

    public boolean m(xc2.p0 infoEx) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        java.lang.String m76523x98b23862 = infoEx.f534767a.m76523x98b23862();
        return m76523x98b23862 != null && m76523x98b23862.length() > 0;
    }

    public void n(android.view.View jumpView, boolean z17, yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        g(250L, jumpView, z17, aVar);
    }

    public boolean o(in5.s0 holder, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        return gs2.c.f356605a.c(holder.hashCode(), j(info));
    }

    public void p(in5.s0 holder, xc2.t0 action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
    }

    public void q(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        xc2.z2 z2Var = this.f84684o;
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
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r3, r0)
            java.lang.String r0 = "jumpView"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r4, r0)
            java.lang.String r0 = "infoEx"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r5, r0)
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = r5.f534777f
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
            xc2.z2 r0 = r2.f84684o
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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
    }

    public void t() {
    }

    public void u(boolean z17, in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        xc2.z2 z2Var = this.f84684o;
        if (z2Var != null) {
            z2Var.h(z17, holder, jumpView, infoEx);
        }
    }

    public void v(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        java.lang.String simpleName;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = infoEx.f534777f;
        boolean z17 = false;
        if (abstractC14490x69736cb5 != null && (feedObject = abstractC14490x69736cb5.getFeedObject()) != null && (feedObject2 = feedObject.getFeedObject()) != null && hc2.o0.D(feedObject2, false)) {
            z17 = true;
        }
        if (z17) {
            xc2.z2 z2Var = this.f84684o;
            if (z2Var == null) {
                simpleName = "null";
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(z2Var);
                simpleName = z2Var.getClass().getSimpleName();
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("viewEventHandler", simpleName);
            xc2.o0 o0Var = infoEx.f534779h;
            xc2.n0 n0Var = o0Var instanceof xc2.n0 ? (xc2.n0) o0Var : null;
            long j17 = n0Var != null ? n0Var.f534763i : 0L;
            android.content.Context context = jumpView.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.p1 p1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.p1) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.p1.class);
            if (p1Var != null) {
                p1Var.O6(this.f84678f, "observer.onJumpViewFocus", jSONObject, j17);
            }
        }
        xc2.z2 z2Var2 = this.f84684o;
        if (z2Var2 != null) {
            z2Var2.f(holder, jumpView, infoEx);
        }
    }

    public void w(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        java.lang.String simpleName;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = infoEx.f534777f;
        boolean z17 = false;
        if (abstractC14490x69736cb5 != null && (feedObject = abstractC14490x69736cb5.getFeedObject()) != null && (feedObject2 = feedObject.getFeedObject()) != null && hc2.o0.D(feedObject2, false)) {
            z17 = true;
        }
        if (z17) {
            xc2.z2 z2Var = this.f84684o;
            if (z2Var == null) {
                simpleName = "null";
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(z2Var);
                simpleName = z2Var.getClass().getSimpleName();
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("viewEventHandler", simpleName);
            xc2.o0 o0Var = infoEx.f534779h;
            xc2.n0 n0Var = o0Var instanceof xc2.n0 ? (xc2.n0) o0Var : null;
            long j17 = n0Var != null ? n0Var.f534763i : 0L;
            android.content.Context context = jumpView.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.p1 p1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.p1) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.p1.class);
            if (p1Var != null) {
                p1Var.O6(this.f84678f, "observer.onJumpViewUnFocus", jSONObject, j17);
            }
        }
        xc2.z2 z2Var2 = this.f84684o;
        if (z2Var2 != null) {
            z2Var2.i(holder, jumpView, infoEx);
        }
    }

    public void x(android.view.View jumpView, xc2.p0 infoEx) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        xc2.z2 z2Var = this.f84684o;
        if (z2Var != null) {
            z2Var.g(jumpView, infoEx);
        }
    }

    public void y(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, ec2.f event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        xc2.z2 z2Var = this.f84684o;
        if (z2Var != null) {
            z2Var.j(holder, jumpView, infoEx, event);
        }
    }

    public void z(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, int i17) {
        int m76483x88dada75;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        xc2.z2 z2Var = this.f84684o;
        if (z2Var != null) {
            xc2.j jVar = (xc2.j) z2Var;
            if (!jVar.t() || infoEx.f534795x || i17 < (m76483x88dada75 = infoEx.f534767a.m76483x88dada75())) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BaseJumperEventHandler", "onPlayProgress: curProgress=" + i17 + " delayPreloadTime=" + m76483x88dada75);
            infoEx.f534795x = true;
            jVar.s();
        }
    }
}
