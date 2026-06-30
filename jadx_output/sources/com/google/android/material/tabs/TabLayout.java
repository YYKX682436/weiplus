package com.google.android.material.tabs;

@androidx.viewpager.widget.j
/* loaded from: classes15.dex */
public class TabLayout extends android.widget.HorizontalScrollView {
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
    public oa.c f44540J;
    public final java.util.ArrayList K;
    public oa.c L;
    public android.animation.ValueAnimator M;
    public androidx.viewpager.widget.ViewPager N;
    public androidx.viewpager.widget.a P;
    public android.database.DataSetObserver Q;
    public oa.j R;
    public oa.b S;
    public boolean T;
    public final m3.e U;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f44541d;

    /* renamed from: e, reason: collision with root package name */
    public oa.i f44542e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.RectF f44543f;

    /* renamed from: g, reason: collision with root package name */
    public final oa.h f44544g;

    /* renamed from: h, reason: collision with root package name */
    public final int f44545h;

    /* renamed from: i, reason: collision with root package name */
    public final int f44546i;

    /* renamed from: m, reason: collision with root package name */
    public final int f44547m;

    /* renamed from: n, reason: collision with root package name */
    public final int f44548n;

    /* renamed from: o, reason: collision with root package name */
    public final int f44549o;

    /* renamed from: p, reason: collision with root package name */
    public android.content.res.ColorStateList f44550p;

    /* renamed from: q, reason: collision with root package name */
    public android.content.res.ColorStateList f44551q;

    /* renamed from: r, reason: collision with root package name */
    public android.content.res.ColorStateList f44552r;

    /* renamed from: s, reason: collision with root package name */
    public android.graphics.drawable.Drawable f44553s;

    /* renamed from: t, reason: collision with root package name */
    public final android.graphics.PorterDuff.Mode f44554t;

    /* renamed from: u, reason: collision with root package name */
    public final float f44555u;

    /* renamed from: v, reason: collision with root package name */
    public final float f44556v;

    /* renamed from: w, reason: collision with root package name */
    public final int f44557w;

    /* renamed from: x, reason: collision with root package name */
    public int f44558x;

    /* renamed from: y, reason: collision with root package name */
    public final int f44559y;

    /* renamed from: z, reason: collision with root package name */
    public final int f44560z;

    public TabLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.tencent.mm.R.attr.f478434jr);
    }

    private int getDefaultHeight() {
        java.util.ArrayList arrayList = this.f44541d;
        int size = arrayList.size();
        boolean z17 = false;
        int i17 = 0;
        while (true) {
            if (i17 < size) {
                oa.i iVar = (oa.i) arrayList.get(i17);
                if (iVar != null && iVar.f343779b != null && !android.text.TextUtils.isEmpty(iVar.f343780c)) {
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

    private int getTabMinWidth() {
        int i17 = this.f44559y;
        if (i17 != -1) {
            return i17;
        }
        if (this.F == 0) {
            return this.A;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return java.lang.Math.max(0, ((this.f44544g.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i17) {
        oa.h hVar = this.f44544g;
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
        d(iVar, this.f44541d.isEmpty());
    }

    public void c(oa.i iVar, int i17, boolean z17) {
        if (iVar.f343784g != this) {
            throw new java.lang.IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        iVar.f343782e = i17;
        java.util.ArrayList arrayList = this.f44541d;
        arrayList.add(i17, iVar);
        int size = arrayList.size();
        while (true) {
            i17++;
            if (i17 >= size) {
                break;
            } else {
                ((oa.i) arrayList.get(i17)).f343782e = i17;
            }
        }
        oa.k kVar = iVar.f343785h;
        int i18 = iVar.f343782e;
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -1);
        if (this.F == 1 && this.C == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
        this.f44544g.addView(kVar, i18, layoutParams);
        if (z17) {
            iVar.b();
        }
    }

    public void d(oa.i iVar, boolean z17) {
        c(iVar, this.f44541d.size(), z17);
    }

    public final void e(android.view.View view) {
        if (!(view instanceof com.google.android.material.tabs.TabItem)) {
            throw new java.lang.IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        com.google.android.material.tabs.TabItem tabItem = (com.google.android.material.tabs.TabItem) view;
        oa.i l17 = l();
        java.lang.CharSequence charSequence = tabItem.f44537d;
        if (charSequence != null) {
            l17.e(charSequence);
        }
        android.graphics.drawable.Drawable drawable = tabItem.f44538e;
        if (drawable != null) {
            l17.f343779b = drawable;
            l17.f();
        }
        int i17 = tabItem.f44539f;
        if (i17 != 0) {
            l17.c(i17);
        }
        if (!android.text.TextUtils.isEmpty(tabItem.getContentDescription())) {
            l17.f343781d = tabItem.getContentDescription();
            l17.f();
        }
        b(l17);
    }

    public final void f(int i17) {
        if (i17 == -1) {
            return;
        }
        if (getWindowToken() != null) {
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            if (n3.x0.c(this)) {
                oa.h hVar = this.f44544g;
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
        int max = this.F == 0 ? java.lang.Math.max(0, this.B - this.f44545h) : 0;
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        oa.h hVar = this.f44544g;
        n3.v0.k(hVar, max, 0, 0, 0);
        int i17 = this.F;
        if (i17 == 0) {
            hVar.setGravity(8388611);
        } else if (i17 == 1) {
            hVar.setGravity(1);
        }
        v(true);
    }

    public int getSelectedTabPosition() {
        oa.i iVar = this.f44542e;
        if (iVar != null) {
            return iVar.f343782e;
        }
        return -1;
    }

    public int getTabCount() {
        return this.f44541d.size();
    }

    public int getTabGravity() {
        return this.C;
    }

    public android.content.res.ColorStateList getTabIconTint() {
        return this.f44551q;
    }

    public int getTabIndicatorGravity() {
        return this.E;
    }

    public int getTabMaxWidth() {
        return this.f44558x;
    }

    public int getTabMode() {
        return this.F;
    }

    public android.content.res.ColorStateList getTabRippleColor() {
        return this.f44552r;
    }

    public android.graphics.drawable.Drawable getTabSelectedIndicator() {
        return this.f44553s;
    }

    public android.content.res.ColorStateList getTabTextColors() {
        return this.f44550p;
    }

    public final int h(int i17, float f17) {
        if (this.F != 0) {
            return 0;
        }
        oa.h hVar = this.f44544g;
        android.view.View childAt = hVar.getChildAt(i17);
        int i18 = i17 + 1;
        android.view.View childAt2 = i18 < hVar.getChildCount() ? hVar.getChildAt(i18) : null;
        int width = childAt != null ? childAt.getWidth() : 0;
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i19 = (int) ((width + width2) * 0.5f * f17);
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        return n3.v0.d(this) == 0 ? left + i19 : left - i19;
    }

    public int i(int i17) {
        return java.lang.Math.round(getResources().getDisplayMetrics().density * i17);
    }

    public final void j() {
        if (this.M == null) {
            android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
            this.M = valueAnimator;
            valueAnimator.setInterpolator(w9.a.f444035b);
            this.M.setDuration(this.D);
            this.M.addUpdateListener(new oa.a(this));
        }
    }

    public oa.i k(int i17) {
        if (i17 < 0 || i17 >= getTabCount()) {
            return null;
        }
        return (oa.i) this.f44541d.get(i17);
    }

    public oa.i l() {
        oa.i iVar = (oa.i) ((m3.g) V).a();
        if (iVar == null) {
            iVar = new oa.i();
        }
        iVar.f343784g = this;
        m3.e eVar = this.U;
        oa.k kVar = eVar != null ? (oa.k) ((m3.f) eVar).a() : null;
        if (kVar == null) {
            kVar = new oa.k(this, getContext());
        }
        if (iVar != kVar.f343790d) {
            kVar.f343790d = iVar;
            kVar.a();
        }
        kVar.setFocusable(true);
        kVar.setMinimumWidth(getTabMinWidth());
        if (android.text.TextUtils.isEmpty(iVar.f343781d)) {
            kVar.setContentDescription(iVar.f343780c);
        } else {
            kVar.setContentDescription(iVar.f343781d);
        }
        iVar.f343785h = kVar;
        return iVar;
    }

    public void m() {
        int currentItem;
        n();
        androidx.viewpager.widget.a aVar = this.P;
        if (aVar != null) {
            int count = aVar.getCount();
            for (int i17 = 0; i17 < count; i17++) {
                oa.i l17 = l();
                l17.e(this.P.getPageTitle(i17));
                d(l17, false);
            }
            androidx.viewpager.widget.ViewPager viewPager = this.N;
            if (viewPager == null || count <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            q(k(currentItem), true);
        }
    }

    public void n() {
        for (int childCount = this.f44544g.getChildCount() - 1; childCount >= 0; childCount--) {
            p(childCount);
        }
        java.util.Iterator it = this.f44541d.iterator();
        while (it.hasNext()) {
            oa.i iVar = (oa.i) it.next();
            it.remove();
            iVar.f343784g = null;
            iVar.f343785h = null;
            iVar.f343778a = null;
            iVar.f343779b = null;
            iVar.f343780c = null;
            iVar.f343781d = null;
            iVar.f343782e = -1;
            iVar.f343783f = null;
            ((m3.g) V).b(iVar);
        }
        this.f44542e = null;
    }

    public void o(int i17) {
        oa.i iVar = this.f44542e;
        int i18 = iVar != null ? iVar.f343782e : 0;
        p(i17);
        java.util.ArrayList arrayList = this.f44541d;
        oa.i iVar2 = (oa.i) arrayList.remove(i17);
        if (iVar2 != null) {
            iVar2.f343784g = null;
            iVar2.f343785h = null;
            iVar2.f343778a = null;
            iVar2.f343779b = null;
            iVar2.f343780c = null;
            iVar2.f343781d = null;
            iVar2.f343782e = -1;
            iVar2.f343783f = null;
            ((m3.g) V).b(iVar2);
        }
        int size = arrayList.size();
        for (int i19 = i17; i19 < size; i19++) {
            ((oa.i) arrayList.get(i19)).f343782e = i19;
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
            if (parent instanceof androidx.viewpager.widget.ViewPager) {
                u((androidx.viewpager.widget.ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.T) {
            setupWithViewPager(null);
            this.T = false;
        }
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        oa.k kVar;
        android.graphics.drawable.Drawable drawable;
        int i17 = 0;
        while (true) {
            oa.h hVar = this.f44544g;
            if (i17 >= hVar.getChildCount()) {
                super.onDraw(canvas);
                return;
            }
            android.view.View childAt = hVar.getChildAt(i17);
            if ((childAt instanceof oa.k) && (drawable = (kVar = (oa.k) childAt).f343796m) != null) {
                drawable.setBounds(kVar.getLeft(), kVar.getTop(), kVar.getRight(), kVar.getBottom());
                kVar.f343796m.draw(canvas);
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
            int r0 = r5.getDefaultHeight()
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
            int r1 = r5.f44560z
            if (r1 <= 0) goto L3f
            goto L47
        L3f:
            r1 = 56
            int r1 = r5.i(r1)
            int r1 = r0 - r1
        L47:
            r5.f44558x = r1
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    public final void p(int i17) {
        oa.h hVar = this.f44544g;
        oa.k kVar = (oa.k) hVar.getChildAt(i17);
        hVar.removeViewAt(i17);
        if (kVar != null) {
            if (kVar.f343790d != null) {
                kVar.f343790d = null;
                kVar.a();
            }
            kVar.setSelected(false);
            ((m3.f) this.U).b(kVar);
        }
        requestLayout();
    }

    public void q(oa.i iVar, boolean z17) {
        oa.i iVar2 = this.f44542e;
        java.util.ArrayList arrayList = this.K;
        if (iVar2 == iVar) {
            if (iVar2 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((oa.c) arrayList.get(size)).h0(iVar);
                }
                f(iVar.f343782e);
                return;
            }
            return;
        }
        int i17 = iVar != null ? iVar.f343782e : -1;
        if (z17) {
            if ((iVar2 == null || iVar2.f343782e == -1) && i17 != -1) {
                s(i17, 0.0f, true, true);
            } else {
                f(i17);
            }
            if (i17 != -1) {
                setSelectedTabView(i17);
            }
        }
        this.f44542e = iVar;
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

    public void r(androidx.viewpager.widget.a aVar, boolean z17) {
        android.database.DataSetObserver dataSetObserver;
        androidx.viewpager.widget.a aVar2 = this.P;
        if (aVar2 != null && (dataSetObserver = this.Q) != null) {
            aVar2.unregisterDataSetObserver(dataSetObserver);
        }
        this.P = aVar;
        if (z17 && aVar != null) {
            if (this.Q == null) {
                this.Q = new oa.e(this);
            }
            aVar.registerDataSetObserver(this.Q);
        }
        m();
    }

    public void s(int i17, float f17, boolean z17, boolean z18) {
        int round = java.lang.Math.round(i17 + f17);
        if (round >= 0) {
            oa.h hVar = this.f44544g;
            if (round >= hVar.getChildCount()) {
                return;
            }
            if (z18) {
                android.animation.ValueAnimator valueAnimator = hVar.f343776n;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    hVar.f343776n.cancel();
                }
                hVar.f343772g = i17;
                hVar.f343773h = f17;
                hVar.c();
            }
            android.animation.ValueAnimator valueAnimator2 = this.M;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.M.cancel();
            }
            scrollTo(h(i17, f17), 0);
            if (z17) {
                setSelectedTabView(round);
            }
        }
    }

    public void setInlineLabel(boolean z17) {
        if (this.G == z17) {
            return;
        }
        this.G = z17;
        int i17 = 0;
        while (true) {
            oa.h hVar = this.f44544g;
            if (i17 >= hVar.getChildCount()) {
                g();
                return;
            }
            android.view.View childAt = hVar.getChildAt(i17);
            if (childAt instanceof oa.k) {
                oa.k kVar = (oa.k) childAt;
                kVar.setOrientation(!kVar.f343798o.G ? 1 : 0);
                android.widget.TextView textView = kVar.f343794h;
                if (textView == null && kVar.f343795i == null) {
                    kVar.c(kVar.f343791e, kVar.f343792f);
                } else {
                    kVar.c(textView, kVar.f343795i);
                }
            }
            i17++;
        }
    }

    public void setInlineLabelResource(int i17) {
        setInlineLabel(getResources().getBoolean(i17));
    }

    @java.lang.Deprecated
    public void setOnTabSelectedListener(oa.c cVar) {
        oa.c cVar2 = this.f44540J;
        if (cVar2 != null) {
            this.K.remove(cVar2);
        }
        this.f44540J = cVar;
        if (cVar != null) {
            a(cVar);
        }
    }

    public void setScrollAnimatorListener(android.animation.Animator.AnimatorListener animatorListener) {
        j();
        this.M.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(android.graphics.drawable.Drawable drawable) {
        if (this.f44553s != drawable) {
            this.f44553s = drawable;
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.u0.k(this.f44544g);
        }
    }

    public void setSelectedTabIndicatorColor(int i17) {
        oa.h hVar = this.f44544g;
        android.graphics.Paint paint = hVar.f343770e;
        if (paint.getColor() != i17) {
            paint.setColor(i17);
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.u0.k(hVar);
        }
    }

    public void setSelectedTabIndicatorGravity(int i17) {
        if (this.E != i17) {
            this.E = i17;
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.u0.k(this.f44544g);
        }
    }

    @java.lang.Deprecated
    public void setSelectedTabIndicatorHeight(int i17) {
        oa.h hVar = this.f44544g;
        if (hVar.f343769d != i17) {
            hVar.f343769d = i17;
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.u0.k(hVar);
        }
    }

    public void setTabGravity(int i17) {
        if (this.C != i17) {
            this.C = i17;
            g();
        }
    }

    public void setTabIconTint(android.content.res.ColorStateList colorStateList) {
        if (this.f44551q != colorStateList) {
            this.f44551q = colorStateList;
            java.util.ArrayList arrayList = this.f44541d;
            int size = arrayList.size();
            for (int i17 = 0; i17 < size; i17++) {
                ((oa.i) arrayList.get(i17)).f();
            }
        }
    }

    public void setTabIconTintResource(int i17) {
        android.content.Context context = getContext();
        java.lang.Object obj = k.a.f302856a;
        setTabIconTint(context.getColorStateList(i17));
    }

    public void setTabIndicatorFullWidth(boolean z17) {
        this.H = z17;
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.u0.k(this.f44544g);
    }

    public void setTabMode(int i17) {
        if (i17 != this.F) {
            this.F = i17;
            g();
        }
    }

    public void setTabRippleColor(android.content.res.ColorStateList colorStateList) {
        if (this.f44552r == colorStateList) {
            return;
        }
        this.f44552r = colorStateList;
        int i17 = 0;
        while (true) {
            oa.h hVar = this.f44544g;
            if (i17 >= hVar.getChildCount()) {
                return;
            }
            android.view.View childAt = hVar.getChildAt(i17);
            if (childAt instanceof oa.k) {
                android.content.Context context = getContext();
                int i18 = oa.k.f343789p;
                ((oa.k) childAt).b(context);
            }
            i17++;
        }
    }

    public void setTabRippleColorResource(int i17) {
        android.content.Context context = getContext();
        java.lang.Object obj = k.a.f302856a;
        setTabRippleColor(context.getColorStateList(i17));
    }

    public void setTabTextColors(android.content.res.ColorStateList colorStateList) {
        if (this.f44550p != colorStateList) {
            this.f44550p = colorStateList;
            java.util.ArrayList arrayList = this.f44541d;
            int size = arrayList.size();
            for (int i17 = 0; i17 < size; i17++) {
                ((oa.i) arrayList.get(i17)).f();
            }
        }
    }

    @java.lang.Deprecated
    public void setTabsFromPagerAdapter(androidx.viewpager.widget.a aVar) {
        r(aVar, false);
    }

    public void setUnboundedRipple(boolean z17) {
        if (this.I == z17) {
            return;
        }
        this.I = z17;
        int i17 = 0;
        while (true) {
            oa.h hVar = this.f44544g;
            if (i17 >= hVar.getChildCount()) {
                return;
            }
            android.view.View childAt = hVar.getChildAt(i17);
            if (childAt instanceof oa.k) {
                android.content.Context context = getContext();
                int i18 = oa.k.f343789p;
                ((oa.k) childAt).b(context);
            }
            i17++;
        }
    }

    public void setUnboundedRippleResource(int i17) {
        setUnboundedRipple(getResources().getBoolean(i17));
    }

    public void setupWithViewPager(androidx.viewpager.widget.ViewPager viewPager) {
        u(viewPager, true, false);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public void t(int i17, int i18) {
        setTabTextColors(new android.content.res.ColorStateList(new int[][]{android.widget.HorizontalScrollView.SELECTED_STATE_SET, android.widget.HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i18, i17}));
    }

    public final void u(androidx.viewpager.widget.ViewPager viewPager, boolean z17, boolean z18) {
        androidx.viewpager.widget.ViewPager viewPager2 = this.N;
        if (viewPager2 != null) {
            oa.j jVar = this.R;
            if (jVar != null) {
                viewPager2.removeOnPageChangeListener(jVar);
            }
            oa.b bVar = this.S;
            if (bVar != null) {
                this.N.removeOnAdapterChangeListener(bVar);
            }
        }
        oa.c cVar = this.L;
        if (cVar != null) {
            this.K.remove(cVar);
            this.L = null;
        }
        if (viewPager != null) {
            this.N = viewPager;
            if (this.R == null) {
                this.R = new oa.j(this);
            }
            oa.j jVar2 = this.R;
            jVar2.f343788f = 0;
            jVar2.f343787e = 0;
            viewPager.addOnPageChangeListener(jVar2);
            oa.l lVar = new oa.l(viewPager);
            this.L = lVar;
            a(lVar);
            androidx.viewpager.widget.a adapter = viewPager.getAdapter();
            if (adapter != null) {
                r(adapter, z17);
            }
            if (this.S == null) {
                this.S = new oa.b(this);
            }
            oa.b bVar2 = this.S;
            bVar2.f343759d = z17;
            viewPager.addOnAdapterChangeListener(bVar2);
            s(viewPager.getCurrentItem(), 0.0f, true, true);
        } else {
            this.N = null;
            r(null, false);
        }
        this.T = z18;
    }

    public void v(boolean z17) {
        int i17 = 0;
        while (true) {
            oa.h hVar = this.f44544g;
            if (i17 >= hVar.getChildCount()) {
                return;
            }
            android.view.View childAt = hVar.getChildAt(i17);
            childAt.setMinimumWidth(getTabMinWidth());
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

    public TabLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f44541d = new java.util.ArrayList();
        this.f44543f = new android.graphics.RectF();
        this.f44558x = Integer.MAX_VALUE;
        this.K = new java.util.ArrayList();
        this.U = new m3.f(12);
        setHorizontalScrollBarEnabled(false);
        oa.h hVar = new oa.h(this, context);
        this.f44544g = hVar;
        super.addView(hVar, 0, new android.widget.FrameLayout.LayoutParams(-2, -1));
        android.content.res.TypedArray d17 = fa.d0.d(context, attributeSet, v9.a.f434131u, i17, com.tencent.mm.R.style.f494750v8, 22);
        int dimensionPixelSize = d17.getDimensionPixelSize(10, -1);
        if (hVar.f343769d != dimensionPixelSize) {
            hVar.f343769d = dimensionPixelSize;
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.u0.k(hVar);
        }
        int color = d17.getColor(7, 0);
        android.graphics.Paint paint = hVar.f343770e;
        if (paint.getColor() != color) {
            paint.setColor(color);
            java.util.WeakHashMap weakHashMap2 = n3.l1.f334362a;
            n3.u0.k(hVar);
        }
        setSelectedTabIndicator(ia.a.b(context, d17, 5));
        setSelectedTabIndicatorGravity(d17.getInt(9, 0));
        setTabIndicatorFullWidth(d17.getBoolean(8, true));
        int dimensionPixelSize2 = d17.getDimensionPixelSize(15, 0);
        this.f44548n = dimensionPixelSize2;
        this.f44547m = dimensionPixelSize2;
        this.f44546i = dimensionPixelSize2;
        this.f44545h = dimensionPixelSize2;
        this.f44545h = d17.getDimensionPixelSize(18, dimensionPixelSize2);
        this.f44546i = d17.getDimensionPixelSize(19, dimensionPixelSize2);
        this.f44547m = d17.getDimensionPixelSize(17, dimensionPixelSize2);
        this.f44548n = d17.getDimensionPixelSize(16, dimensionPixelSize2);
        int resourceId = d17.getResourceId(22, com.tencent.mm.R.style.f494593r4);
        this.f44549o = resourceId;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId, j.a.f296197y);
        try {
            this.f44555u = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.f44550p = ia.a.a(context, obtainStyledAttributes, 3);
            obtainStyledAttributes.recycle();
            if (d17.hasValue(23)) {
                this.f44550p = ia.a.a(context, d17, 23);
            }
            if (d17.hasValue(21)) {
                this.f44550p = new android.content.res.ColorStateList(new int[][]{android.widget.HorizontalScrollView.SELECTED_STATE_SET, android.widget.HorizontalScrollView.EMPTY_STATE_SET}, new int[]{d17.getColor(21, 0), this.f44550p.getDefaultColor()});
            }
            this.f44551q = ia.a.a(context, d17, 3);
            this.f44554t = fa.e0.a(d17.getInt(4, -1), null);
            this.f44552r = ia.a.a(context, d17, 20);
            this.D = d17.getInt(6, 300);
            this.f44559y = d17.getDimensionPixelSize(13, -1);
            this.f44560z = d17.getDimensionPixelSize(12, -1);
            this.f44557w = d17.getResourceId(0, 0);
            this.B = d17.getDimensionPixelSize(1, 0);
            this.F = d17.getInt(14, 1);
            this.C = d17.getInt(2, 0);
            this.G = d17.getBoolean(11, false);
            this.I = d17.getBoolean(24, false);
            d17.recycle();
            android.content.res.Resources resources = getResources();
            this.f44556v = resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f480298tv);
            this.A = resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f480296tt);
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

    public void setSelectedTabIndicator(int i17) {
        if (i17 != 0) {
            setSelectedTabIndicator(k.a.a(getContext(), i17));
        } else {
            setSelectedTabIndicator((android.graphics.drawable.Drawable) null);
        }
    }
}
