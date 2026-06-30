package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* renamed from: com.tencent.mm.plugin.sns.ui.AdListView */
/* loaded from: classes4.dex */
public class C17937x457159c6 extends android.widget.ListView {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.g1 f247722d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f247723e;

    /* renamed from: f, reason: collision with root package name */
    public int f247724f;

    /* renamed from: g, reason: collision with root package name */
    public int f247725g;

    /* renamed from: h, reason: collision with root package name */
    public int f247726h;

    public C17937x457159c6(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f247723e = new java.util.HashSet();
        this.f247724f = -1;
        this.f247725g = -1;
        this.f247726h = -1;
    }

    @Override // android.view.ViewGroup
    public void attachViewToParent(android.view.View view, int i17, android.view.ViewGroup.LayoutParams layoutParams) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("attachViewToParent", "com.tencent.mm.plugin.sns.ui.AdListView");
        super.attachViewToParent(view, i17, layoutParams);
        if (view.getTag() != null && (view.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder) view.getTag();
            int i18 = baseViewHolder.f250795c;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720 = baseViewHolder.f38402x94f64b00;
            boolean z17 = true;
            if (c19807x593d1720.f39035x65f3785d != 1 && c19807x593d1720.f39034xebc78809 != 1) {
                z17 = false;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0 s0Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0;
            s0Var.n(c19807x593d1720.Id, z17);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d17202 = baseViewHolder.f38402x94f64b00;
            java.lang.String str = c19807x593d17202.Id;
            r45.y8 y8Var = c19807x593d17202.f39012x33e0f24f;
            java.lang.String str2 = "";
            s0Var.o(str, y8Var == null ? "" : y8Var.f472379d);
            s0Var.p(baseViewHolder.f250799e);
            java.util.HashSet hashSet = this.f247723e;
            if (!hashSet.contains(baseViewHolder.f250797d) && ((baseViewHolder.f38400x3172ed && baseViewHolder.f38402x94f64b00.f39014x86965dde.f451370e == 15) || baseViewHolder.f38402x94f64b00.f39014x86965dde.f451370e == 18)) {
                i64.s1.c(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().b1(baseViewHolder.f250797d), false, false, 0);
                hashSet.add(baseViewHolder.f250797d);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.g1 g1Var = this.f247722d;
            if (g1Var != null) {
                int i19 = baseViewHolder.f250795c;
                java.lang.String str3 = baseViewHolder.f250801f;
                long j17 = baseViewHolder.f250799e;
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d17203 = baseViewHolder.f38402x94f64b00;
                boolean z18 = baseViewHolder.f38400x3172ed;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUxInfoFromHolder", "com.tencent.mm.plugin.sns.ui.AdListView");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = baseViewHolder.f250808i0;
                if (c17933xe8d1b226 != null) {
                    str2 = c17933xe8d1b226.m70375x338a8cc7();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUxInfoFromHolder", "com.tencent.mm.plugin.sns.ui.AdListView");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUxInfoFromHolder", "com.tencent.mm.plugin.sns.ui.AdListView");
                }
                g1Var.b(i19, str3, j17, c19807x593d17203, z18, str2);
            }
            b(baseViewHolder.f250799e);
        }
        if (x51.o1.G) {
            getChildCount();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("attachViewToParent", "com.tencent.mm.plugin.sns.ui.AdListView");
    }

    public final void b(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateUnreadTipFaultRange", "com.tencent.mm.plugin.sns.ui.AdListView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Mj().getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkExposeFeeds", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkExposeFeeds", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateUnreadTipFaultRange", "com.tencent.mm.plugin.sns.ui.AdListView");
    }

    @Override // android.view.ViewGroup
    public void detachViewFromParent(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("detachViewFromParent", "com.tencent.mm.plugin.sns.ui.AdListView");
        if (view.getTag() != null && (view.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder) view.getTag();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(baseViewHolder.f250795c);
            sb6.append(" ");
            sb6.append(baseViewHolder.f250801f);
        }
        if (x51.o1.G) {
            getChildCount();
        }
        super.detachViewFromParent(view);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("detachViewFromParent", "com.tencent.mm.plugin.sns.ui.AdListView");
    }

    @Override // android.view.ViewGroup
    public void detachViewsFromParent(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("detachViewsFromParent", "com.tencent.mm.plugin.sns.ui.AdListView");
        for (int i19 = i17; i19 < i17 + i18; i19++) {
            android.view.View childAt = getChildAt(i19);
            if (childAt.getTag() != null && (childAt.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder) childAt.getTag();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(baseViewHolder.f250795c);
                sb6.append(" ");
                sb6.append(baseViewHolder.f250801f);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.g1 g1Var = this.f247722d;
                if (g1Var != null) {
                    g1Var.a(baseViewHolder.f250795c, baseViewHolder.f250801f, baseViewHolder.f250799e, baseViewHolder.f38402x94f64b00, baseViewHolder.f38400x3172ed);
                }
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(baseViewHolder.f250795c);
                sb7.append(" ");
                sb7.append(baseViewHolder.f250801f);
            }
            if (x51.o1.G) {
                getChildCount();
            }
        }
        super.detachViewsFromParent(i17, i18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("detachViewsFromParent", "com.tencent.mm.plugin.sns.ui.AdListView");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dispatchTouchEvent", "com.tencent.mm.plugin.sns.ui.AdListView");
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dispatchTouchEvent", "com.tencent.mm.plugin.sns.ui.AdListView");
        return dispatchTouchEvent;
    }

    @Override // android.widget.ListView, android.widget.AbsListView
    public void layoutChildren() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("layoutChildren", "com.tencent.mm.plugin.sns.ui.AdListView");
        super.layoutChildren();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("layoutChildren", "com.tencent.mm.plugin.sns.ui.AdListView");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002f, code lost:
    
        if (r3 != 2) goto L16;
     */
    @Override // android.widget.AbsListView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            java.lang.String r0 = "onInterceptTouchEvent"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.AdListView"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            boolean r2 = super.onInterceptTouchEvent(r7)
            int r3 = r6.f247726h
            if (r3 >= 0) goto L1e
            android.content.Context r3 = r6.getContext()
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            int r3 = r3.getScaledTouchSlop()
            r6.f247726h = r3
        L1e:
            int r3 = r7.getActionMasked()
            float r4 = r7.getX()
            int r4 = (int) r4
            float r7 = r7.getY()
            int r7 = (int) r7
            r5 = 2
            if (r3 == 0) goto L32
            if (r3 == r5) goto L36
            goto L4e
        L32:
            r6.f247725g = r4
            r6.f247724f = r7
        L36:
            int r3 = r6.f247725g
            int r4 = r4 - r3
            int r3 = java.lang.Math.abs(r4)
            int r4 = r6.f247724f
            int r7 = r7 - r4
            int r7 = java.lang.Math.abs(r7)
            if (r2 == 0) goto L4e
            if (r3 <= r7) goto L4e
            int r3 = r6.f247726h
            int r3 = r3 * r5
            if (r7 >= r3) goto L4e
            r2 = 0
        L4e:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17937x457159c6.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onLayout", "com.tencent.mm.plugin.sns.ui.AdListView");
        super.onLayout(z17, i17, i18, i19, i27);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLayout", "com.tencent.mm.plugin.sns.ui.AdListView");
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onViewAdded", "com.tencent.mm.plugin.sns.ui.AdListView");
        if (view.getTag() != null && (view.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder) view.getTag();
            int i17 = baseViewHolder.f250795c;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720 = baseViewHolder.f38402x94f64b00;
            boolean z17 = true;
            if (c19807x593d1720.f39035x65f3785d != 1 && c19807x593d1720.f39034xebc78809 != 1) {
                z17 = false;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0 s0Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0;
            s0Var.n(c19807x593d1720.Id, z17);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d17202 = baseViewHolder.f38402x94f64b00;
            java.lang.String str = c19807x593d17202.Id;
            r45.y8 y8Var = c19807x593d17202.f39012x33e0f24f;
            java.lang.String str2 = "";
            s0Var.o(str, y8Var == null ? "" : y8Var.f472379d);
            s0Var.p(baseViewHolder.f250799e);
            java.util.HashSet hashSet = this.f247723e;
            if (!hashSet.contains(baseViewHolder.f250797d) && ((baseViewHolder.f38400x3172ed && baseViewHolder.f38402x94f64b00.f39014x86965dde.f451370e == 15) || baseViewHolder.f38402x94f64b00.f39014x86965dde.f451370e == 18)) {
                i64.s1.c(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().b1(baseViewHolder.f250797d), false, false, 0);
                hashSet.add(baseViewHolder.f250797d);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.g1 g1Var = this.f247722d;
            if (g1Var != null) {
                int i18 = baseViewHolder.f250795c;
                java.lang.String str3 = baseViewHolder.f250801f;
                long j17 = baseViewHolder.f250799e;
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d17203 = baseViewHolder.f38402x94f64b00;
                boolean z18 = baseViewHolder.f38400x3172ed;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUxInfoFromHolder", "com.tencent.mm.plugin.sns.ui.AdListView");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = baseViewHolder.f250808i0;
                if (c17933xe8d1b226 != null) {
                    str2 = c17933xe8d1b226.m70375x338a8cc7();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUxInfoFromHolder", "com.tencent.mm.plugin.sns.ui.AdListView");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUxInfoFromHolder", "com.tencent.mm.plugin.sns.ui.AdListView");
                }
                g1Var.b(i18, str3, j17, c19807x593d17203, z18, str2);
            }
            b(baseViewHolder.f250799e);
        }
        if (x51.o1.G) {
            getChildCount();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onViewAdded", "com.tencent.mm.plugin.sns.ui.AdListView");
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onViewRemoved", "com.tencent.mm.plugin.sns.ui.AdListView");
        if (view.getTag() != null && (view.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder) view.getTag();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(baseViewHolder.f250795c);
            sb6.append(" ");
            sb6.append(baseViewHolder.f250801f);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.g1 g1Var = this.f247722d;
            if (g1Var != null) {
                g1Var.a(baseViewHolder.f250795c, baseViewHolder.f250801f, baseViewHolder.f250799e, baseViewHolder.f38402x94f64b00, baseViewHolder.f38400x3172ed);
            }
            if (baseViewHolder.f38402x94f64b00.f39014x86965dde.f451370e == 3) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 b17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().b1(baseViewHolder.f250797d);
                com.p314xaae8f345.mm.p959x883644fd.k0.k(com.p314xaae8f345.mm.p959x883644fd.j0.Sns, baseViewHolder.f38402x94f64b00.f39040xbd345fc4, b17 == null ? 0 : b17.m70350x13c652ad(), ca4.z0.t0(baseViewHolder.f250799e), b17);
            }
        }
        if (x51.o1.G) {
            getChildCount();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onViewRemoved", "com.tencent.mm.plugin.sns.ui.AdListView");
    }

    @Override // android.widget.AdapterView, android.view.ViewGroup, android.view.ViewManager
    public void removeView(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeView", "com.tencent.mm.plugin.sns.ui.AdListView");
        super.removeView(view);
        if (view.getTag() != null && (view.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder) view.getTag();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(baseViewHolder.f250795c);
            sb6.append(" ");
            sb6.append(baseViewHolder.f250801f);
        }
        if (x51.o1.G) {
            getChildCount();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeView", "com.tencent.mm.plugin.sns.ui.AdListView");
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeViewInLayout", "com.tencent.mm.plugin.sns.ui.AdListView");
        if (view.getTag() != null && (view.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder) view.getTag();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(baseViewHolder.f250795c);
            sb6.append(" ");
            sb6.append(baseViewHolder.f250801f);
        }
        if (x51.o1.G) {
            getChildCount();
        }
        super.removeViewInLayout(view);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeViewInLayout", "com.tencent.mm.plugin.sns.ui.AdListView");
    }

    /* renamed from: setOnDispatchTouchListener */
    public void m70542x92c61b58(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.d dVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnDispatchTouchListener", "com.tencent.mm.plugin.sns.ui.AdListView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnDispatchTouchListener", "com.tencent.mm.plugin.sns.ui.AdListView");
    }

    /* renamed from: setTimelineEvent */
    public void m70543xe5505197(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.g1 g1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTimelineEvent", "com.tencent.mm.plugin.sns.ui.AdListView");
        this.f247722d = g1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTimelineEvent", "com.tencent.mm.plugin.sns.ui.AdListView");
    }

    /* renamed from: setTimelineStat */
    public void m70544xeea5d3b7(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h1 h1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTimelineStat", "com.tencent.mm.plugin.sns.ui.AdListView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTimelineStat", "com.tencent.mm.plugin.sns.ui.AdListView");
    }

    public C17937x457159c6(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f247723e = new java.util.HashSet();
        this.f247724f = -1;
        this.f247725g = -1;
        this.f247726h = -1;
    }

    @Override // android.view.ViewGroup
    public void detachViewFromParent(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("detachViewFromParent", "com.tencent.mm.plugin.sns.ui.AdListView");
        if (x51.o1.G) {
            getChildCount();
        }
        super.detachViewFromParent(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("detachViewFromParent", "com.tencent.mm.plugin.sns.ui.AdListView");
    }
}
