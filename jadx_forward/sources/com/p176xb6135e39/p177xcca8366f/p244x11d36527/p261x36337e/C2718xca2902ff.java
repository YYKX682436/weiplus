package com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e;

@p012xc85e97e9.p114xa324943e.p115xd1075a44.j
/* renamed from: com.google.android.material.tabs.TabLayout */
/* loaded from: classes15.dex */
public class C2718xca2902ff extends android.widget.HorizontalScrollView {
    public static final m3.e V = new m3.g(16);
    public final int A;
    public final int B;
    public int C;
    public final int D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public oa.c f126073J;
    public final java.util.ArrayList K;
    public oa.c L;
    public android.animation.ValueAnimator M;
    public p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe N;
    public p012xc85e97e9.p114xa324943e.p115xd1075a44.a P;
    public android.database.DataSetObserver Q;
    public oa.j R;
    public oa.b S;
    public boolean T;
    public final m3.e U;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f126074d;

    /* renamed from: e, reason: collision with root package name */
    public oa.i f126075e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.RectF f126076f;

    /* renamed from: g, reason: collision with root package name */
    public final oa.h f126077g;

    /* renamed from: h, reason: collision with root package name */
    public final int f126078h;

    /* renamed from: i, reason: collision with root package name */
    public final int f126079i;

    /* renamed from: m, reason: collision with root package name */
    public final int f126080m;

    /* renamed from: n, reason: collision with root package name */
    public final int f126081n;

    /* renamed from: o, reason: collision with root package name */
    public final int f126082o;

    /* renamed from: p, reason: collision with root package name */
    public android.content.res.ColorStateList f126083p;

    /* renamed from: q, reason: collision with root package name */
    public android.content.res.ColorStateList f126084q;

    /* renamed from: r, reason: collision with root package name */
    public android.content.res.ColorStateList f126085r;

    /* renamed from: s, reason: collision with root package name */
    public android.graphics.drawable.Drawable f126086s;

    /* renamed from: t, reason: collision with root package name */
    public final android.graphics.PorterDuff.Mode f126087t;

    /* renamed from: u, reason: collision with root package name */
    public final float f126088u;

    /* renamed from: v, reason: collision with root package name */
    public final float f126089v;

    /* renamed from: w, reason: collision with root package name */
    public final int f126090w;

    /* renamed from: x, reason: collision with root package name */
    public int f126091x;

    /* renamed from: y, reason: collision with root package name */
    public final int f126092y;

    /* renamed from: z, reason: collision with root package name */
    public final int f126093z;

    public C2718xca2902ff(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559967jr);
    }

    /* renamed from: getDefaultHeight */
    private int m20348xe3cd9b12() {
        java.util.ArrayList arrayList = this.f126074d;
        int size = arrayList.size();
        boolean z17 = false;
        int i17 = 0;
        while (true) {
            if (i17 < size) {
                oa.i iVar = (oa.i) arrayList.get(i17);
                if (iVar != null && iVar.f425312b != null && !android.text.TextUtils.isEmpty(iVar.f425313c)) {
                    z17 = true;
                    break;
                }
                i17++;
            } else {
                break;
            }
        }
        return (!z17 || this.G) ? 48 : 72;
    }

    /* renamed from: getTabMinWidth */
    private int m20349x5556c013() {
        int i17 = this.f126092y;
        if (i17 != -1) {
            return i17;
        }
        if (this.F == 0) {
            return this.A;
        }
        return 0;
    }

    /* renamed from: getTabScrollRange */
    private int m20350x76843091() {
        return java.lang.Math.max(0, ((this.f126077g.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    /* renamed from: setSelectedTabView */
    private void m20351x9cf397fd(int i17) {
        oa.h hVar = this.f126077g;
        int childCount = hVar.getChildCount();
        if (i17 < childCount) {
            int i18 = 0;
            while (i18 < childCount) {
                android.view.View childAt = hVar.getChildAt(i18);
                boolean z17 = true;
                childAt.setSelected(i18 == i17);
                if (i18 != i17) {
                    z17 = false;
                }
                childAt.setActivated(z17);
                i18++;
            }
        }
    }

    public void a(oa.c cVar) {
        java.util.ArrayList arrayList = this.K;
        if (arrayList.contains(cVar)) {
            return;
        }
        arrayList.add(cVar);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(android.view.View view) {
        e(view);
    }

    public void b(oa.i iVar) {
        d(iVar, this.f126074d.isEmpty());
    }

    public void c(oa.i iVar, int i17, boolean z17) {
        if (iVar.f425317g != this) {
            throw new java.lang.IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        iVar.f425315e = i17;
        java.util.ArrayList arrayList = this.f126074d;
        arrayList.add(i17, iVar);
        int size = arrayList.size();
        while (true) {
            i17++;
            if (i17 >= size) {
                break;
            } else {
                ((oa.i) arrayList.get(i17)).f425315e = i17;
            }
        }
        oa.k kVar = iVar.f425318h;
        int i18 = iVar.f425315e;
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -1);
        if (this.F == 1 && this.C == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
        this.f126077g.addView(kVar, i18, layoutParams);
        if (z17) {
            iVar.b();
        }
    }

    public void d(oa.i iVar, boolean z17) {
        c(iVar, this.f126074d.size(), z17);
    }

    public final void e(android.view.View view) {
        if (!(view instanceof com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2717x6997428)) {
            throw new java.lang.IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2717x6997428 c2717x6997428 = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2717x6997428) view;
        oa.i l17 = l();
        java.lang.CharSequence charSequence = c2717x6997428.f126070d;
        if (charSequence != null) {
            l17.e(charSequence);
        }
        android.graphics.drawable.Drawable drawable = c2717x6997428.f126071e;
        if (drawable != null) {
            l17.f425312b = drawable;
            l17.f();
        }
        int i17 = c2717x6997428.f126072f;
        if (i17 != 0) {
            l17.c(i17);
        }
        if (!android.text.TextUtils.isEmpty(c2717x6997428.getContentDescription())) {
            l17.f425314d = c2717x6997428.getContentDescription();
            l17.f();
        }
        b(l17);
    }

    public final void f(int i17) {
        if (i17 == -1) {
            return;
        }
        if (getWindowToken() != null) {
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            if (n3.x0.c(this)) {
                oa.h hVar = this.f126077g;
                int childCount = hVar.getChildCount();
                boolean z17 = false;
                int i18 = 0;
                while (true) {
                    if (i18 >= childCount) {
                        break;
                    }
                    if (hVar.getChildAt(i18).getWidth() <= 0) {
                        z17 = true;
                        break;
                    }
                    i18++;
                }
                if (!z17) {
                    int scrollX = getScrollX();
                    int h17 = h(i17, 0.0f);
                    if (scrollX != h17) {
                        j();
                        this.M.setIntValues(scrollX, h17);
                        this.M.start();
                    }
                    hVar.a(i17, this.D);
                    return;
                }
            }
        }
        s(i17, 0.0f, true, true);
    }

    public final void g() {
        int max = this.F == 0 ? java.lang.Math.max(0, this.B - this.f126078h) : 0;
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        oa.h hVar = this.f126077g;
        n3.v0.k(hVar, max, 0, 0, 0);
        int i17 = this.F;
        if (i17 == 0) {
            hVar.setGravity(8388611);
        } else if (i17 == 1) {
            hVar.setGravity(1);
        }
        v(true);
    }

    /* renamed from: getSelectedTabPosition */
    public int m20352xe06bcb0d() {
        oa.i iVar = this.f126075e;
        if (iVar != null) {
            return iVar.f425315e;
        }
        return -1;
    }

    /* renamed from: getTabCount */
    public int m20353x443e53f0() {
        return this.f126074d.size();
    }

    /* renamed from: getTabGravity */
    public int m20354x59a40ef() {
        return this.C;
    }

    /* renamed from: getTabIconTint */
    public android.content.res.ColorStateList m20355x7b5c2493() {
        return this.f126084q;
    }

    /* renamed from: getTabIndicatorGravity */
    public int m20356xf87743be() {
        return this.E;
    }

    /* renamed from: getTabMaxWidth */
    public int m20357xbf355c41() {
        return this.f126091x;
    }

    /* renamed from: getTabMode */
    public int m20358xe12fd6a2() {
        return this.F;
    }

    /* renamed from: getTabRippleColor */
    public android.content.res.ColorStateList m20359xcdf17d34() {
        return this.f126085r;
    }

    /* renamed from: getTabSelectedIndicator */
    public android.graphics.drawable.Drawable m20360x2c506315() {
        return this.f126086s;
    }

    /* renamed from: getTabTextColors */
    public android.content.res.ColorStateList m20361x84373abc() {
        return this.f126083p;
    }

    public final int h(int i17, float f17) {
        if (this.F != 0) {
            return 0;
        }
        oa.h hVar = this.f126077g;
        android.view.View childAt = hVar.getChildAt(i17);
        int i18 = i17 + 1;
        android.view.View childAt2 = i18 < hVar.getChildCount() ? hVar.getChildAt(i18) : null;
        int width = childAt != null ? childAt.getWidth() : 0;
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i19 = (int) ((width + width2) * 0.5f * f17);
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        return n3.v0.d(this) == 0 ? left + i19 : left - i19;
    }

    public int i(int i17) {
        return java.lang.Math.round(getResources().getDisplayMetrics().density * i17);
    }

    public final void j() {
        if (this.M == null) {
            android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
            this.M = valueAnimator;
            valueAnimator.setInterpolator(w9.a.f525568b);
            this.M.setDuration(this.D);
            this.M.addUpdateListener(new oa.a(this));
        }
    }

    public oa.i k(int i17) {
        if (i17 < 0 || i17 >= m20353x443e53f0()) {
            return null;
        }
        return (oa.i) this.f126074d.get(i17);
    }

    public oa.i l() {
        oa.i iVar = (oa.i) ((m3.g) V).a();
        if (iVar == null) {
            iVar = new oa.i();
        }
        iVar.f425317g = this;
        m3.e eVar = this.U;
        oa.k kVar = eVar != null ? (oa.k) ((m3.f) eVar).a() : null;
        if (kVar == null) {
            kVar = new oa.k(this, getContext());
        }
        if (iVar != kVar.f425323d) {
            kVar.f425323d = iVar;
            kVar.a();
        }
        kVar.setFocusable(true);
        kVar.setMinimumWidth(m20349x5556c013());
        if (android.text.TextUtils.isEmpty(iVar.f425314d)) {
            kVar.setContentDescription(iVar.f425313c);
        } else {
            kVar.setContentDescription(iVar.f425314d);
        }
        iVar.f425318h = kVar;
        return iVar;
    }

    public void m() {
        int m8300xfda78ef6;
        n();
        p012xc85e97e9.p114xa324943e.p115xd1075a44.a aVar = this.P;
        if (aVar != null) {
            int mo8338x7444f759 = aVar.mo8338x7444f759();
            for (int i17 = 0; i17 < mo8338x7444f759; i17++) {
                oa.i l17 = l();
                l17.e(this.P.mo8340x337c8253(i17));
                d(l17, false);
            }
            p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe = this.N;
            if (c1190x18d3c3fe == null || mo8338x7444f759 <= 0 || (m8300xfda78ef6 = c1190x18d3c3fe.m8300xfda78ef6()) == m20352xe06bcb0d() || m8300xfda78ef6 >= m20353x443e53f0()) {
                return;
            }
            q(k(m8300xfda78ef6), true);
        }
    }

    public void n() {
        for (int childCount = this.f126077g.getChildCount() - 1; childCount >= 0; childCount--) {
            p(childCount);
        }
        java.util.Iterator it = this.f126074d.iterator();
        while (it.hasNext()) {
            oa.i iVar = (oa.i) it.next();
            it.remove();
            iVar.f425317g = null;
            iVar.f425318h = null;
            iVar.f425311a = null;
            iVar.f425312b = null;
            iVar.f425313c = null;
            iVar.f425314d = null;
            iVar.f425315e = -1;
            iVar.f425316f = null;
            ((m3.g) V).b(iVar);
        }
        this.f126075e = null;
    }

    public void o(int i17) {
        oa.i iVar = this.f126075e;
        int i18 = iVar != null ? iVar.f425315e : 0;
        p(i17);
        java.util.ArrayList arrayList = this.f126074d;
        oa.i iVar2 = (oa.i) arrayList.remove(i17);
        if (iVar2 != null) {
            iVar2.f425317g = null;
            iVar2.f425318h = null;
            iVar2.f425311a = null;
            iVar2.f425312b = null;
            iVar2.f425313c = null;
            iVar2.f425314d = null;
            iVar2.f425315e = -1;
            iVar2.f425316f = null;
            ((m3.g) V).b(iVar2);
        }
        int size = arrayList.size();
        for (int i19 = i17; i19 < size; i19++) {
            ((oa.i) arrayList.get(i19)).f425315e = i19;
        }
        if (i18 == i17) {
            q(arrayList.isEmpty() ? null : (oa.i) arrayList.get(java.lang.Math.max(0, i17 - 1)), true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.N == null) {
            android.view.ViewParent parent = getParent();
            if (parent instanceof p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe) {
                u((p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.T) {
            m20382x3da43a7b(null);
            this.T = false;
        }
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        oa.k kVar;
        android.graphics.drawable.Drawable drawable;
        int i17 = 0;
        while (true) {
            oa.h hVar = this.f126077g;
            if (i17 >= hVar.getChildCount()) {
                super.onDraw(canvas);
                return;
            }
            android.view.View childAt = hVar.getChildAt(i17);
            if ((childAt instanceof oa.k) && (drawable = (kVar = (oa.k) childAt).f425329m) != null) {
                drawable.setBounds(kVar.getLeft(), kVar.getTop(), kVar.getRight(), kVar.getBottom());
                kVar.f425329m.draw(canvas);
            }
            i17++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
    
        if (r1.getMeasuredWidth() != getMeasuredWidth()) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0075, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
    
        r6 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0072, code lost:
    
        if (r1.getMeasuredWidth() < getMeasuredWidth()) goto L28;
     */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.m20348xe3cd9b12()
            int r0 = r5.i(r0)
            int r1 = r5.getPaddingTop()
            int r0 = r0 + r1
            int r1 = r5.getPaddingBottom()
            int r0 = r0 + r1
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r1 == r2) goto L24
            if (r1 == 0) goto L1f
            goto L30
        L1f:
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            goto L30
        L24:
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            int r7 = java.lang.Math.min(r0, r7)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r3)
        L30:
            int r0 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r6)
            if (r1 == 0) goto L49
            int r1 = r5.f126093z
            if (r1 <= 0) goto L3f
            goto L47
        L3f:
            r1 = 56
            int r1 = r5.i(r1)
            int r1 = r0 - r1
        L47:
            r5.f126091x = r1
        L49:
            super.onMeasure(r6, r7)
            int r6 = r5.getChildCount()
            r0 = 1
            if (r6 != r0) goto L97
            r6 = 0
            android.view.View r1 = r5.getChildAt(r6)
            int r2 = r5.F
            if (r2 == 0) goto L6a
            if (r2 == r0) goto L5f
            goto L77
        L5f:
            int r2 = r1.getMeasuredWidth()
            int r4 = r5.getMeasuredWidth()
            if (r2 == r4) goto L75
            goto L76
        L6a:
            int r2 = r1.getMeasuredWidth()
            int r4 = r5.getMeasuredWidth()
            if (r2 >= r4) goto L75
            goto L76
        L75:
            r0 = r6
        L76:
            r6 = r0
        L77:
            if (r6 == 0) goto L97
            int r6 = r5.getPaddingTop()
            int r0 = r5.getPaddingBottom()
            int r6 = r6 + r0
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            int r0 = r0.height
            int r6 = android.view.ViewGroup.getChildMeasureSpec(r7, r6, r0)
            int r7 = r5.getMeasuredWidth()
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r3)
            r1.measure(r7, r6)
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff.onMeasure(int, int):void");
    }

    public final void p(int i17) {
        oa.h hVar = this.f126077g;
        oa.k kVar = (oa.k) hVar.getChildAt(i17);
        hVar.removeViewAt(i17);
        if (kVar != null) {
            if (kVar.f425323d != null) {
                kVar.f425323d = null;
                kVar.a();
            }
            kVar.setSelected(false);
            ((m3.f) this.U).b(kVar);
        }
        requestLayout();
    }

    public void q(oa.i iVar, boolean z17) {
        oa.i iVar2 = this.f126075e;
        java.util.ArrayList arrayList = this.K;
        if (iVar2 == iVar) {
            if (iVar2 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((oa.c) arrayList.get(size)).h0(iVar);
                }
                f(iVar.f425315e);
                return;
            }
            return;
        }
        int i17 = iVar != null ? iVar.f425315e : -1;
        if (z17) {
            if ((iVar2 == null || iVar2.f425315e == -1) && i17 != -1) {
                s(i17, 0.0f, true, true);
            } else {
                f(i17);
            }
            if (i17 != -1) {
                m20351x9cf397fd(i17);
            }
        }
        this.f126075e = iVar;
        if (iVar2 != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                ((oa.c) arrayList.get(size2)).l4(iVar2);
            }
        }
        if (iVar != null) {
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                ((oa.c) arrayList.get(size3)).u1(iVar);
            }
        }
    }

    public void r(p012xc85e97e9.p114xa324943e.p115xd1075a44.a aVar, boolean z17) {
        android.database.DataSetObserver dataSetObserver;
        p012xc85e97e9.p114xa324943e.p115xd1075a44.a aVar2 = this.P;
        if (aVar2 != null && (dataSetObserver = this.Q) != null) {
            aVar2.m8348xfde4bf72(dataSetObserver);
        }
        this.P = aVar;
        if (z17 && aVar != null) {
            if (this.Q == null) {
                this.Q = new oa.e(this);
            }
            aVar.m8344x4b262a2b(this.Q);
        }
        m();
    }

    public void s(int i17, float f17, boolean z17, boolean z18) {
        int round = java.lang.Math.round(i17 + f17);
        if (round >= 0) {
            oa.h hVar = this.f126077g;
            if (round >= hVar.getChildCount()) {
                return;
            }
            if (z18) {
                android.animation.ValueAnimator valueAnimator = hVar.f425309n;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    hVar.f425309n.cancel();
                }
                hVar.f425305g = i17;
                hVar.f425306h = f17;
                hVar.c();
            }
            android.animation.ValueAnimator valueAnimator2 = this.M;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.M.cancel();
            }
            scrollTo(h(i17, f17), 0);
            if (z17) {
                m20351x9cf397fd(round);
            }
        }
    }

    /* renamed from: setInlineLabel */
    public void m20362xd755e19(boolean z17) {
        if (this.G == z17) {
            return;
        }
        this.G = z17;
        int i17 = 0;
        while (true) {
            oa.h hVar = this.f126077g;
            if (i17 >= hVar.getChildCount()) {
                g();
                return;
            }
            android.view.View childAt = hVar.getChildAt(i17);
            if (childAt instanceof oa.k) {
                oa.k kVar = (oa.k) childAt;
                kVar.setOrientation(!kVar.f425331o.G ? 1 : 0);
                android.widget.TextView textView = kVar.f425327h;
                if (textView == null && kVar.f425328i == null) {
                    kVar.c(kVar.f425324e, kVar.f425325f);
                } else {
                    kVar.c(textView, kVar.f425328i);
                }
            }
            i17++;
        }
    }

    /* renamed from: setInlineLabelResource */
    public void m20363x536c5d47(int i17) {
        m20362xd755e19(getResources().getBoolean(i17));
    }

    @java.lang.Deprecated
    /* renamed from: setOnTabSelectedListener */
    public void m20364xbc0f6683(oa.c cVar) {
        oa.c cVar2 = this.f126073J;
        if (cVar2 != null) {
            this.K.remove(cVar2);
        }
        this.f126073J = cVar;
        if (cVar != null) {
            a(cVar);
        }
    }

    /* renamed from: setScrollAnimatorListener */
    public void m20365xedde80aa(android.animation.Animator.AnimatorListener animatorListener) {
        j();
        this.M.addListener(animatorListener);
    }

    /* renamed from: setSelectedTabIndicator */
    public void m20367x172ff7b7(android.graphics.drawable.Drawable drawable) {
        if (this.f126086s != drawable) {
            this.f126086s = drawable;
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.u0.k(this.f126077g);
        }
    }

    /* renamed from: setSelectedTabIndicatorColor */
    public void m20368xc75d81ec(int i17) {
        oa.h hVar = this.f126077g;
        android.graphics.Paint paint = hVar.f425303e;
        if (paint.getColor() != i17) {
            paint.setColor(i17);
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.u0.k(hVar);
        }
    }

    /* renamed from: setSelectedTabIndicatorGravity */
    public void m20369x3e244697(int i17) {
        if (this.E != i17) {
            this.E = i17;
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.u0.k(this.f126077g);
        }
    }

    @java.lang.Deprecated
    /* renamed from: setSelectedTabIndicatorHeight */
    public void m20370x2c4c8fbe(int i17) {
        oa.h hVar = this.f126077g;
        if (hVar.f425302d != i17) {
            hVar.f425302d = i17;
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.u0.k(hVar);
        }
    }

    /* renamed from: setTabGravity */
    public void m20371x33be8efb(int i17) {
        if (this.C != i17) {
            this.C = i17;
            g();
        }
    }

    /* renamed from: setTabIconTint */
    public void m20372x11c19807(android.content.res.ColorStateList colorStateList) {
        if (this.f126084q != colorStateList) {
            this.f126084q = colorStateList;
            java.util.ArrayList arrayList = this.f126074d;
            int size = arrayList.size();
            for (int i17 = 0; i17 < size; i17++) {
                ((oa.i) arrayList.get(i17)).f();
            }
        }
    }

    /* renamed from: setTabIconTintResource */
    public void m20373x600ec935(int i17) {
        android.content.Context context = getContext();
        java.lang.Object obj = k.a.f384389a;
        m20372x11c19807(context.getColorStateList(i17));
    }

    /* renamed from: setTabIndicatorFullWidth */
    public void m20374x5ef8445b(boolean z17) {
        this.H = z17;
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.u0.k(this.f126077g);
    }

    /* renamed from: setTabMode */
    public void m20375x54a12416(int i17) {
        if (i17 != this.F) {
            this.F = i17;
            g();
        }
    }

    /* renamed from: setTabRippleColor */
    public void m20376x95e7e540(android.content.res.ColorStateList colorStateList) {
        if (this.f126085r == colorStateList) {
            return;
        }
        this.f126085r = colorStateList;
        int i17 = 0;
        while (true) {
            oa.h hVar = this.f126077g;
            if (i17 >= hVar.getChildCount()) {
                return;
            }
            android.view.View childAt = hVar.getChildAt(i17);
            if (childAt instanceof oa.k) {
                android.content.Context context = getContext();
                int i18 = oa.k.f425322p;
                ((oa.k) childAt).b(context);
            }
            i17++;
        }
    }

    /* renamed from: setTabRippleColorResource */
    public void m20377xf6d4cd6e(int i17) {
        android.content.Context context = getContext();
        java.lang.Object obj = k.a.f384389a;
        m20376x95e7e540(context.getColorStateList(i17));
    }

    /* renamed from: setTabTextColors */
    public void m20378x170da130(android.content.res.ColorStateList colorStateList) {
        if (this.f126083p != colorStateList) {
            this.f126083p = colorStateList;
            java.util.ArrayList arrayList = this.f126074d;
            int size = arrayList.size();
            for (int i17 = 0; i17 < size; i17++) {
                ((oa.i) arrayList.get(i17)).f();
            }
        }
    }

    @java.lang.Deprecated
    /* renamed from: setTabsFromPagerAdapter */
    public void m20379xb1597df6(p012xc85e97e9.p114xa324943e.p115xd1075a44.a aVar) {
        r(aVar, false);
    }

    /* renamed from: setUnboundedRipple */
    public void m20380x47af472(boolean z17) {
        if (this.I == z17) {
            return;
        }
        this.I = z17;
        int i17 = 0;
        while (true) {
            oa.h hVar = this.f126077g;
            if (i17 >= hVar.getChildCount()) {
                return;
            }
            android.view.View childAt = hVar.getChildAt(i17);
            if (childAt instanceof oa.k) {
                android.content.Context context = getContext();
                int i18 = oa.k.f425322p;
                ((oa.k) childAt).b(context);
            }
            i17++;
        }
    }

    /* renamed from: setUnboundedRippleResource */
    public void m20381x1a468aa0(int i17) {
        m20380x47af472(getResources().getBoolean(i17));
    }

    /* renamed from: setupWithViewPager */
    public void m20382x3da43a7b(p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe) {
        u(c1190x18d3c3fe, true, false);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return m20350x76843091() > 0;
    }

    public void t(int i17, int i18) {
        m20378x170da130(new android.content.res.ColorStateList(new int[][]{android.widget.HorizontalScrollView.SELECTED_STATE_SET, android.widget.HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i18, i17}));
    }

    public final void u(p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe, boolean z17, boolean z18) {
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe2 = this.N;
        if (c1190x18d3c3fe2 != null) {
            oa.j jVar = this.R;
            if (jVar != null) {
                c1190x18d3c3fe2.m8314x7cd807d6(jVar);
            }
            oa.b bVar = this.S;
            if (bVar != null) {
                this.N.m8313xd89903f0(bVar);
            }
        }
        oa.c cVar = this.L;
        if (cVar != null) {
            this.K.remove(cVar);
            this.L = null;
        }
        if (c1190x18d3c3fe != null) {
            this.N = c1190x18d3c3fe;
            if (this.R == null) {
                this.R = new oa.j(this);
            }
            oa.j jVar2 = this.R;
            jVar2.f425321f = 0;
            jVar2.f425320e = 0;
            c1190x18d3c3fe.m8289xa5a25773(jVar2);
            oa.l lVar = new oa.l(c1190x18d3c3fe);
            this.L = lVar;
            a(lVar);
            p012xc85e97e9.p114xa324943e.p115xd1075a44.a m8299xf939df19 = c1190x18d3c3fe.m8299xf939df19();
            if (m8299xf939df19 != null) {
                r(m8299xf939df19, z17);
            }
            if (this.S == null) {
                this.S = new oa.b(this);
            }
            oa.b bVar2 = this.S;
            bVar2.f425292d = z17;
            c1190x18d3c3fe.m8288xa7bfb333(bVar2);
            s(c1190x18d3c3fe.m8300xfda78ef6(), 0.0f, true, true);
        } else {
            this.N = null;
            r(null, false);
        }
        this.T = z18;
    }

    public void v(boolean z17) {
        int i17 = 0;
        while (true) {
            oa.h hVar = this.f126077g;
            if (i17 >= hVar.getChildCount()) {
                return;
            }
            android.view.View childAt = hVar.getChildAt(i17);
            childAt.setMinimumWidth(m20349x5556c013());
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (this.F == 1 && this.C == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            if (z17) {
                childAt.requestLayout();
            }
            i17++;
        }
    }

    public C2718xca2902ff(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f126074d = new java.util.ArrayList();
        this.f126076f = new android.graphics.RectF();
        this.f126091x = Integer.MAX_VALUE;
        this.K = new java.util.ArrayList();
        this.U = new m3.f(12);
        setHorizontalScrollBarEnabled(false);
        oa.h hVar = new oa.h(this, context);
        this.f126077g = hVar;
        super.addView(hVar, 0, new android.widget.FrameLayout.LayoutParams(-2, -1));
        android.content.res.TypedArray d17 = fa.d0.d(context, attributeSet, v9.a.f515664u, i17, com.p314xaae8f345.mm.R.C30868x68b1db1.f576283v8, 22);
        int dimensionPixelSize = d17.getDimensionPixelSize(10, -1);
        if (hVar.f425302d != dimensionPixelSize) {
            hVar.f425302d = dimensionPixelSize;
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.u0.k(hVar);
        }
        int color = d17.getColor(7, 0);
        android.graphics.Paint paint = hVar.f425303e;
        if (paint.getColor() != color) {
            paint.setColor(color);
            java.util.WeakHashMap weakHashMap2 = n3.l1.f415895a;
            n3.u0.k(hVar);
        }
        m20367x172ff7b7(ia.a.b(context, d17, 5));
        m20369x3e244697(d17.getInt(9, 0));
        m20374x5ef8445b(d17.getBoolean(8, true));
        int dimensionPixelSize2 = d17.getDimensionPixelSize(15, 0);
        this.f126081n = dimensionPixelSize2;
        this.f126080m = dimensionPixelSize2;
        this.f126079i = dimensionPixelSize2;
        this.f126078h = dimensionPixelSize2;
        this.f126078h = d17.getDimensionPixelSize(18, dimensionPixelSize2);
        this.f126079i = d17.getDimensionPixelSize(19, dimensionPixelSize2);
        this.f126080m = d17.getDimensionPixelSize(17, dimensionPixelSize2);
        this.f126081n = d17.getDimensionPixelSize(16, dimensionPixelSize2);
        int resourceId = d17.getResourceId(22, com.p314xaae8f345.mm.R.C30868x68b1db1.f576126r4);
        this.f126082o = resourceId;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId, j.a.f377730y);
        try {
            this.f126088u = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.f126083p = ia.a.a(context, obtainStyledAttributes, 3);
            obtainStyledAttributes.recycle();
            if (d17.hasValue(23)) {
                this.f126083p = ia.a.a(context, d17, 23);
            }
            if (d17.hasValue(21)) {
                this.f126083p = new android.content.res.ColorStateList(new int[][]{android.widget.HorizontalScrollView.SELECTED_STATE_SET, android.widget.HorizontalScrollView.EMPTY_STATE_SET}, new int[]{d17.getColor(21, 0), this.f126083p.getDefaultColor()});
            }
            this.f126084q = ia.a.a(context, d17, 3);
            this.f126087t = fa.e0.a(d17.getInt(4, -1), null);
            this.f126085r = ia.a.a(context, d17, 20);
            this.D = d17.getInt(6, 300);
            this.f126092y = d17.getDimensionPixelSize(13, -1);
            this.f126093z = d17.getDimensionPixelSize(12, -1);
            this.f126090w = d17.getResourceId(0, 0);
            this.B = d17.getDimensionPixelSize(1, 0);
            this.F = d17.getInt(14, 1);
            this.C = d17.getInt(2, 0);
            this.G = d17.getBoolean(11, false);
            this.I = d17.getBoolean(24, false);
            d17.recycle();
            android.content.res.Resources resources = getResources();
            this.f126089v = resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561831tv);
            this.A = resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561829tt);
            g();
        } catch (java.lang.Throwable th6) {
            obtainStyledAttributes.recycle();
            throw th6;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(android.view.View view, int i17) {
        e(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public android.widget.FrameLayout.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        e(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(android.view.View view, int i17, android.view.ViewGroup.LayoutParams layoutParams) {
        e(view);
    }

    /* renamed from: setSelectedTabIndicator */
    public void m20366x172ff7b7(int i17) {
        if (i17 != 0) {
            m20367x172ff7b7(k.a.a(getContext(), i17));
        } else {
            m20367x172ff7b7((android.graphics.drawable.Drawable) null);
        }
    }
}
