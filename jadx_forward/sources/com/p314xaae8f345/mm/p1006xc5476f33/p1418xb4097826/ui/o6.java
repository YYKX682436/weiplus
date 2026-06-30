package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes10.dex */
public final class o6 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.y1 {

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashSet f211104f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashSet f211105g;

    /* renamed from: h, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de f211106h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f211107i;

    /* renamed from: j, reason: collision with root package name */
    public final jz5.g f211108j;

    /* renamed from: k, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f211109k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f211110l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f211111m;

    /* renamed from: n, reason: collision with root package name */
    public int f211112n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.Runnable f211113o;

    /* renamed from: p, reason: collision with root package name */
    public int f211114p;

    /* renamed from: q, reason: collision with root package name */
    public int f211115q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f211116r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f211117s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f211118t;

    /* renamed from: u, reason: collision with root package name */
    public final android.graphics.Rect f211119u;

    static {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
    }

    public o6() {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.gvs));
        this.f211104f = hashSet;
        java.util.HashSet hashSet2 = new java.util.HashSet();
        hashSet2.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.mfh));
        this.f211105g = hashSet2;
        this.f211107i = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.n6(this));
        this.f211108j = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.m6(this));
        this.f211111m = true;
        this.f211114p = -1;
        this.f211115q = -1;
        this.f211118t = new int[2];
        this.f211119u = new android.graphics.Rect();
    }

    public static final void n(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.o6 o6Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de, int i17, int i18, int i19) {
        o6Var.getClass();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19();
        if ((mo7946xf939df19 != null ? mo7946xf939df19.mo1894x7e414b06() : 0) <= 1) {
            return;
        }
        if (i17 != i18 && i17 == 1) {
            int w17 = i19 > 0 ? c1162x665295de.w() : c1162x665295de.y();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07 = c1163xf1deaba4.p0(w17);
            if (i19 > 0 || w17 != 0) {
                o6Var.p(p07, com.p314xaae8f345.mm.R.id.f566019ee3);
                o6Var.p(p07, com.p314xaae8f345.mm.R.id.edq);
                o6Var.p(p07, com.p314xaae8f345.mm.R.id.efr);
                o6Var.p(p07, com.p314xaae8f345.mm.R.id.kp7);
                in5.s0 s0Var = p07 instanceof in5.s0 ? (in5.s0) p07 : null;
                if ((s0Var != null ? s0Var.f374658i : null) instanceof so2.h1) {
                    o6Var.p(p07, com.p314xaae8f345.mm.R.id.f565793dk3);
                    return;
                }
                return;
            }
            return;
        }
        if ((i18 == 1 || i18 == 2) && i17 != i18) {
            int w18 = c1162x665295de.w();
            int y17 = c1162x665295de.y();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p08 = c1163xf1deaba4.p0(w18);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p09 = c1163xf1deaba4.p0(y17);
            o6Var.t(p08, com.p314xaae8f345.mm.R.id.f566019ee3);
            o6Var.t(p09, com.p314xaae8f345.mm.R.id.f566019ee3);
            o6Var.t(p08, com.p314xaae8f345.mm.R.id.efr);
            o6Var.t(p09, com.p314xaae8f345.mm.R.id.efr);
            o6Var.t(p08, com.p314xaae8f345.mm.R.id.edq);
            o6Var.t(p09, com.p314xaae8f345.mm.R.id.edq);
            o6Var.t(p08, com.p314xaae8f345.mm.R.id.kp7);
            o6Var.t(p09, com.p314xaae8f345.mm.R.id.kp7);
            in5.s0 s0Var2 = p08 instanceof in5.s0 ? (in5.s0) p08 : null;
            if ((s0Var2 != null ? s0Var2.f374658i : null) instanceof so2.h1) {
                o6Var.t(p08, com.p314xaae8f345.mm.R.id.f565793dk3);
            }
            in5.s0 s0Var3 = p09 instanceof in5.s0 ? (in5.s0) p09 : null;
            if ((s0Var3 != null ? s0Var3.f374658i : null) instanceof so2.h1) {
                o6Var.t(p09, com.p314xaae8f345.mm.R.id.f565793dk3);
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.r3
    public void b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        if (c1163xf1deaba4 != null) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c1163xf1deaba4.getLayoutManager();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager;
            this.f211109k = c1163xf1deaba4;
            this.f211106h = c1162x665295de;
            p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
            p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19();
            if (mo7946xf939df19 != null) {
                mo7946xf939df19.mo8163xed962dec(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.i6(this, c1163xf1deaba4, c1162x665295de));
            }
            c1163xf1deaba4.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.k6(this, c1162x665295de, f0Var2, f0Var));
        }
        super.b(c1163xf1deaba4);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.y1, p012xc85e97e9.p103xe821e364.p104xd1075a44.r3
    public int[] c(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager, android.view.View targetView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutManager, "layoutManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetView, "targetView");
        int[] iArr = new int[2];
        boolean r17 = r(targetView);
        jz5.g gVar = this.f211107i;
        if (r17) {
            java.lang.Object tag = targetView.getTag(com.p314xaae8f345.mm.R.id.egq);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 w1Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.w1) ((jz5.n) gVar).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(w1Var, "<get-verticalHelper>(...)");
            int e17 = w1Var.e(targetView) - w1Var.k();
            targetView.getHeight();
            targetView.toString();
            iArr[1] = e17;
            if (tag == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tag, java.lang.Boolean.TRUE)) {
                iArr[1] = 0;
            }
            targetView.setTag(com.p314xaae8f345.mm.R.id.egq, java.lang.Boolean.FALSE);
        } else {
            if (layoutManager.mo2416xc6ea780e()) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 w1Var2 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.w1) ((jz5.n) this.f211108j).mo141623x754a37bb();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(w1Var2, "<get-horizontalHelper>(...)");
                int e18 = w1Var2.e(targetView) - w1Var2.k();
                targetView.getHeight();
                targetView.toString();
                iArr[0] = e18;
            } else {
                iArr[0] = 0;
            }
            if (layoutManager.getF204840r()) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 w1Var3 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.w1) ((jz5.n) gVar).mo141623x754a37bb();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(w1Var3, "<get-verticalHelper>(...)");
                int e19 = w1Var3.e(targetView) - w1Var3.k();
                targetView.getHeight();
                targetView.toString();
                iArr[1] = e19;
            } else {
                iArr[1] = 0;
            }
        }
        return iArr;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.y1, p012xc85e97e9.p103xe821e364.p104xd1075a44.r3
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.o1 e(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutManager, "layoutManager");
        if (!(layoutManager instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8)) {
            return super.e(layoutManager);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f211109k;
        if (c1163xf1deaba4 != null) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.l6(this, layoutManager, c1163xf1deaba4.getContext());
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
        throw null;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.y1, p012xc85e97e9.p103xe821e364.p104xd1075a44.r3
    public android.view.View f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager) {
        int i17;
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutManager, "layoutManager");
        boolean f204840r = layoutManager.getF204840r();
        int m8008x3d79f549 = layoutManager.m8008x3d79f549();
        android.view.View view = null;
        if (m8008x3d79f549 != 0) {
            float f17 = 0.0f;
            android.view.View view2 = null;
            int i19 = 0;
            while (true) {
                if (i19 >= m8008x3d79f549) {
                    view = view2;
                    break;
                }
                android.view.View m8007x6a486239 = layoutManager.m8007x6a486239(i19);
                if (m8007x6a486239 != null && ((!f204840r || m8007x6a486239.getHeight() > 0) && (f204840r || m8007x6a486239.getWidth() > 0))) {
                    boolean r17 = r(m8007x6a486239);
                    android.graphics.Rect rect = this.f211119u;
                    if (r17 && m8007x6a486239.getGlobalVisibleRect(rect) && rect.height() > 0) {
                        java.lang.Object tag = m8007x6a486239.getTag(com.p314xaae8f345.mm.R.id.egq);
                        m8007x6a486239.toString();
                        java.util.Objects.toString(rect);
                        java.util.Objects.toString(tag);
                        if (tag == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tag, java.lang.Boolean.TRUE)) {
                            view = m8007x6a486239;
                        } else {
                            m8007x6a486239.setTag(com.p314xaae8f345.mm.R.id.egq, java.lang.Boolean.FALSE);
                        }
                    } else {
                        int height = m8007x6a486239.getGlobalVisibleRect(rect) ? f204840r ? rect.height() : rect.width() : 0;
                        int height2 = f204840r ? m8007x6a486239.getHeight() : m8007x6a486239.getWidth();
                        if (q(m8007x6a486239) && m8007x6a486239.getGlobalVisibleRect(rect) && rect.height() > 0) {
                            boolean z17 = this.f211110l;
                            android.view.View m8007x6a4862392 = (!z17 || (i18 = i19 + 1) >= m8008x3d79f549) ? (z17 || (i17 = i19 + (-1)) < 0) ? null : layoutManager.m8007x6a486239(i17) : layoutManager.m8007x6a486239(i18);
                            if (m8007x6a4862392 != null) {
                                height += m8007x6a4862392.getGlobalVisibleRect(rect) ? f204840r ? rect.height() : rect.width() : 0;
                                height2 += f204840r ? m8007x6a4862392.getHeight() : m8007x6a4862392.getWidth();
                                m8007x6a486239.toString();
                                m8007x6a4862392.toString();
                                m8007x6a486239 = m8007x6a4862392;
                            }
                        }
                        float f18 = (height * 1.0f) / height2;
                        if (f17 < f18) {
                            view2 = m8007x6a486239;
                            f17 = f18;
                        }
                    }
                }
                i19++;
            }
        }
        java.util.Objects.toString(view);
        return view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0057, code lost:
    
        if (r9 <= 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0059, code lost:
    
        r5 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005b, code lost:
    
        if (r5 >= r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005d, code lost:
    
        if (r5 >= r1) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x005f, code lost:
    
        r9 = r6.f211106h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0061, code lost:
    
        if (r9 == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0063, code lost:
    
        r9 = r9.m8007x6a486239(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0067, code lost:
    
        if (r9 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x006e, code lost:
    
        if (r9.getHeight() <= 0) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0071, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0074, code lost:
    
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("layoutManager");
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0077, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0078, code lost:
    
        if (r9 >= 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x007a, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x007b, code lost:
    
        if (r3 < 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x007d, code lost:
    
        if ((-1) >= r3) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x007f, code lost:
    
        r9 = r6.f211106h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0081, code lost:
    
        if (r9 == null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0083, code lost:
    
        r9 = r9.m8007x6a486239(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0087, code lost:
    
        if (r9 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x008e, code lost:
    
        if (r9.getHeight() <= 0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0091, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0094, code lost:
    
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("layoutManager");
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0097, code lost:
    
        throw null;
     */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.y1, p012xc85e97e9.p103xe821e364.p104xd1075a44.r3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int g(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager r7, int r8, int r9) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.o6.g(androidx.recyclerview.widget.RecyclerView$LayoutManager, int, int):int");
    }

    public final void o(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de layoutManager, int i17, boolean z17) {
        android.view.View view;
        android.view.View view2;
        int i18;
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator animate2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutManager, "layoutManager");
        if (recyclerView.getHeight() > 0 && this.f211111m && i17 != 0) {
            int w17 = layoutManager.w();
            int y17 = layoutManager.y();
            if (this.f211114p != w17 || y17 != this.f211115q) {
                this.f211114p = w17;
                this.f211115q = y17;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07 = recyclerView.p0(w17);
                this.f211116r = (p07 == null || (view2 = p07.f3639x46306858) == null) ? null : view2.findViewById(com.p314xaae8f345.mm.R.id.hih);
                p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p08 = recyclerView.p0(y17);
                this.f211117s = (p08 == null || (view = p08.f3639x46306858) == null) ? null : view.findViewById(com.p314xaae8f345.mm.R.id.hih);
            }
            android.view.View view3 = this.f211116r;
            android.view.View view4 = this.f211117s;
            int[] iArr = this.f211118t;
            if (view3 != null) {
                view3.getLocationInWindow(iArr);
            }
            if (view3 == null) {
                i18 = 0;
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Float.valueOf((java.lang.Math.abs(iArr[1]) * 1.0f) / recyclerView.getHeight()));
                java.util.Collections.reverse(arrayList);
                i18 = 0;
                yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderFullPagerSnapHelper", "checkMaskAlpha", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/LinearLayoutManager;IZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view3.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/ui/FinderFullPagerSnapHelper", "checkMaskAlpha", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/LinearLayoutManager;IZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            if (view4 != null) {
                view4.getLocationInWindow(iArr);
            }
            if (view4 != null) {
                float abs = (java.lang.Math.abs(iArr[1]) * 1.0f) / recyclerView.getHeight();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(java.lang.Float.valueOf(abs));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/finder/ui/FinderFullPagerSnapHelper", "checkMaskAlpha", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/LinearLayoutManager;IZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view4.setAlpha(((java.lang.Float) arrayList2.get(i18)).floatValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/finder/ui/FinderFullPagerSnapHelper", "checkMaskAlpha", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/LinearLayoutManager;IZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            if (z17) {
                int childCount = recyclerView.getChildCount();
                for (int i19 = i18; i19 < childCount; i19++) {
                    android.view.View findViewById = recyclerView.getChildAt(i19).findViewById(com.p314xaae8f345.mm.R.id.hih);
                    if (findViewById != null && (animate2 = findViewById.animate()) != null) {
                        animate2.cancel();
                    }
                    if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.a(findViewById != null ? java.lang.Float.valueOf(findViewById.getAlpha()) : null, 0.0f) && findViewById != null && (animate = findViewById.animate()) != null && (alpha = animate.alpha(0.0f)) != null && (duration = alpha.setDuration(90L)) != null) {
                        duration.start();
                    }
                }
            }
        }
    }

    public final void p(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        android.view.View view;
        android.view.View findViewById = (k3Var == null || (view = k3Var.f3639x46306858) == null) ? null : view.findViewById(i17);
        if (findViewById != null) {
            android.view.ViewPropertyAnimator animate = findViewById.animate();
            if (animate != null) {
                animate.cancel();
            }
            findViewById.animate().alpha(0.2f).setDuration(110L).start();
        }
    }

    public final boolean q(android.view.View view) {
        if (view == null) {
            return false;
        }
        java.util.Iterator it = this.f211105g.iterator();
        while (it.hasNext()) {
            android.view.View findViewById = view.findViewById(((java.lang.Number) it.next()).intValue());
            if (findViewById != null && findViewById.getVisibility() == 0) {
                return true;
            }
        }
        try {
            android.view.ViewParent parent = view.getParent();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = parent instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) parent : null;
            if (c1163xf1deaba4 == null) {
                s("ignoreViewForViewData but view:" + view + " 's parent:" + view.getParent() + '!');
                return false;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 w07 = c1163xf1deaba4.w0(view);
            in5.s0 s0Var = w07 instanceof in5.s0 ? (in5.s0) w07 : null;
            if (s0Var == null) {
                s("ignoreViewForViewData but view:" + view + " 's viewHolder is null!");
                return false;
            }
            java.lang.Object obj = s0Var.f374658i;
            if ((obj instanceof in5.o0 ? (in5.o0) obj : null) == null) {
                s("ignoreViewForViewData but " + s0Var.f374658i + " is not instance ScrollConfig!");
                return false;
            }
            s("ignoreViewForViewData " + s0Var.f374658i + " scrollToNext=true");
            return true;
        } catch (java.lang.Exception e17) {
            hc2.c.a(e17, "checkScrollConfig");
            pm0.z.b(xy2.b.f539688b, "checkScrollConfigErr", false, null, null, false, false, null, 124, null);
            return false;
        }
    }

    public final boolean r(android.view.View view) {
        if (view == null) {
            return false;
        }
        java.util.Iterator it = this.f211104f.iterator();
        while (it.hasNext()) {
            android.view.View findViewById = view.findViewById(((java.lang.Number) it.next()).intValue());
            if (findViewById != null && findViewById.getVisibility() == 0) {
                return true;
            }
        }
        return false;
    }

    public final void s(java.lang.String str) {
        boolean z17;
        boolean z18 = false;
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            z17 = false;
        }
        if (z17 || z65.c.a()) {
            z18 = true;
        } else {
            kb2.b bVar = kb2.b.f387758a;
        }
        if (z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FullPagerSnapHelper", str);
        }
    }

    public final void t(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        android.view.View view;
        android.view.View findViewById = (k3Var == null || (view = k3Var.f3639x46306858) == null) ? null : view.findViewById(i17);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.a(findViewById != null ? java.lang.Float.valueOf(findViewById.getAlpha()) : null, 1.0f) || findViewById == null) {
            return;
        }
        android.view.ViewPropertyAnimator animate = findViewById.animate();
        if (animate != null) {
            animate.cancel();
        }
        findViewById.animate().alpha(1.0f).setDuration(110L).start();
    }
}
