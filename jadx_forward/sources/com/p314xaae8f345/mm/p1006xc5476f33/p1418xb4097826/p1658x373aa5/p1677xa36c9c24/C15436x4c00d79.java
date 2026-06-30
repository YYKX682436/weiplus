package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24;

@p012xc85e97e9.p114xa324943e.p115xd1075a44.j
/* renamed from: com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout */
/* loaded from: classes15.dex */
public class C15436x4c00d79 extends android.widget.HorizontalScrollView {

    /* renamed from: x0, reason: collision with root package name */
    public static final m3.e f214631x0 = new m3.g(16);
    public int A;
    public final int B;
    public int C;
    public final int D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public zx2.o f214632J;
    public final java.util.ArrayList K;
    public zx2.o L;
    public android.animation.ValueAnimator M;
    public p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe N;
    public p012xc85e97e9.p114xa324943e.p115xd1075a44.a P;
    public android.database.DataSetObserver Q;
    public zx2.v R;
    public zx2.n S;
    public boolean T;
    public final m3.e U;
    public final android.animation.TimeInterpolator V;
    public final boolean W;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f214633d;

    /* renamed from: e, reason: collision with root package name */
    public zx2.u f214634e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.RectF f214635f;

    /* renamed from: g, reason: collision with root package name */
    public final zx2.t f214636g;

    /* renamed from: h, reason: collision with root package name */
    public int f214637h;

    /* renamed from: i, reason: collision with root package name */
    public int f214638i;

    /* renamed from: m, reason: collision with root package name */
    public int f214639m;

    /* renamed from: n, reason: collision with root package name */
    public int f214640n;

    /* renamed from: o, reason: collision with root package name */
    public final int f214641o;

    /* renamed from: p, reason: collision with root package name */
    public android.content.res.ColorStateList f214642p;

    /* renamed from: p0, reason: collision with root package name */
    public final boolean f214643p0;

    /* renamed from: q, reason: collision with root package name */
    public android.content.res.ColorStateList f214644q;

    /* renamed from: r, reason: collision with root package name */
    public android.content.res.ColorStateList f214645r;

    /* renamed from: s, reason: collision with root package name */
    public android.graphics.drawable.Drawable f214646s;

    /* renamed from: t, reason: collision with root package name */
    public final android.graphics.PorterDuff.Mode f214647t;

    /* renamed from: u, reason: collision with root package name */
    public final float f214648u;

    /* renamed from: v, reason: collision with root package name */
    public final float f214649v;

    /* renamed from: w, reason: collision with root package name */
    public final int f214650w;

    /* renamed from: x, reason: collision with root package name */
    public int f214651x;

    /* renamed from: y, reason: collision with root package name */
    public final int f214652y;

    /* renamed from: z, reason: collision with root package name */
    public final int f214653z;

    public C15436x4c00d79(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559967jr);
    }

    /* renamed from: getDefaultHeight */
    private int m62972xe3cd9b12() {
        java.util.ArrayList arrayList = this.f214633d;
        int size = arrayList.size();
        boolean z17 = false;
        int i17 = 0;
        while (true) {
            if (i17 < size) {
                zx2.u uVar = (zx2.u) arrayList.get(i17);
                if (uVar != null && uVar.f558615b != null && !android.text.TextUtils.isEmpty(uVar.f558616c)) {
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
    private int m62973x5556c013() {
        int i17 = this.f214652y;
        if (i17 != -1) {
            return i17;
        }
        if (this.F == 0) {
            return this.A;
        }
        return 0;
    }

    /* renamed from: getTabScrollRange */
    private int m62974x76843091() {
        return java.lang.Math.max(0, ((this.f214636g.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    /* renamed from: setSelectedTabView */
    private void m62975x9cf397fd(int i17) {
        zx2.t tVar = this.f214636g;
        int childCount = tVar.getChildCount();
        if (i17 < childCount) {
            int i18 = 0;
            while (i18 < childCount) {
                android.view.View childAt = tVar.getChildAt(i18);
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

    public void a(zx2.o oVar) {
        java.util.ArrayList arrayList = this.K;
        if (arrayList.contains(oVar)) {
            return;
        }
        arrayList.add(oVar);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(android.view.View view) {
        c(view);
    }

    public void b(zx2.u uVar, int i17, boolean z17) {
        if (uVar.f558620g != this) {
            throw new java.lang.IllegalArgumentException("Tab belongs to a different CustomTabLayout.");
        }
        uVar.f558618e = i17;
        java.util.ArrayList arrayList = this.f214633d;
        arrayList.add(i17, uVar);
        int size = arrayList.size();
        while (true) {
            i17++;
            if (i17 >= size) {
                break;
            } else {
                ((zx2.u) arrayList.get(i17)).f558618e = i17;
            }
        }
        zx2.w wVar = uVar.f558621h;
        int i18 = uVar.f558618e;
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -1);
        if (this.F == 1 && this.C == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
        this.f214636g.addView(wVar, i18, layoutParams);
        if (z17) {
            uVar.b();
        }
    }

    public final void c(android.view.View view) {
        if (!(view instanceof com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2717x6997428)) {
            throw new java.lang.IllegalArgumentException("Only TabItem instances can be added to CustomTabLayout");
        }
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2717x6997428 c2717x6997428 = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2717x6997428) view;
        zx2.u j17 = j();
        java.lang.CharSequence charSequence = c2717x6997428.f126070d;
        if (charSequence != null) {
            if (android.text.TextUtils.isEmpty(j17.f558617d) && !android.text.TextUtils.isEmpty(charSequence)) {
                j17.f558621h.setContentDescription(charSequence);
            }
            j17.f558616c = charSequence;
            zx2.w wVar = j17.f558621h;
            if (wVar != null) {
                wVar.b();
            }
        }
        android.graphics.drawable.Drawable drawable = c2717x6997428.f126071e;
        if (drawable != null) {
            j17.f558615b = drawable;
            zx2.w wVar2 = j17.f558621h;
            if (wVar2 != null) {
                wVar2.b();
            }
        }
        int i17 = c2717x6997428.f126072f;
        if (i17 != 0) {
            j17.c(i17);
        }
        if (!android.text.TextUtils.isEmpty(c2717x6997428.getContentDescription())) {
            j17.f558617d = c2717x6997428.getContentDescription();
            zx2.w wVar3 = j17.f558621h;
            if (wVar3 != null) {
                wVar3.b();
            }
        }
        java.util.ArrayList arrayList = this.f214633d;
        b(j17, arrayList.size(), arrayList.isEmpty());
    }

    public final void d(int i17) {
        if (i17 != -1) {
            if (getWindowToken() != null) {
                java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                if (n3.x0.c(this)) {
                    zx2.t tVar = this.f214636g;
                    int childCount = tVar.getChildCount();
                    boolean z17 = false;
                    int i18 = 0;
                    while (true) {
                        if (i18 >= childCount) {
                            break;
                        }
                        if (tVar.getChildAt(i18).getWidth() <= 0) {
                            z17 = true;
                            break;
                        }
                        i18++;
                    }
                    if (!z17) {
                        int scrollX = getScrollX();
                        int f17 = f(i17, 0.0f);
                        if (scrollX != f17) {
                            h();
                            this.M.setIntValues(scrollX, f17);
                            this.M.start();
                        }
                        tVar.a(i17, this.D);
                        return;
                    }
                }
            }
            o(i17, 0.0f, true, true);
        }
    }

    public final void e() {
        int max = this.F == 0 ? java.lang.Math.max(0, this.B - this.f214637h) : 0;
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        zx2.t tVar = this.f214636g;
        n3.v0.k(tVar, max, 0, 0, 0);
        int i17 = this.F;
        if (i17 == 0) {
            tVar.setGravity(8388611);
        } else if (i17 == 1) {
            tVar.setGravity(1);
        }
        q(true);
    }

    public final int f(int i17, float f17) {
        if (this.F != 0) {
            return 0;
        }
        zx2.t tVar = this.f214636g;
        android.view.View childAt = tVar.getChildAt(i17);
        int i18 = i17 + 1;
        android.view.View childAt2 = i18 < tVar.getChildCount() ? tVar.getChildAt(i18) : null;
        int width = childAt != null ? childAt.getWidth() : 0;
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i19 = (int) ((width + width2) * 0.5f * f17);
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        return n3.v0.d(this) == 0 ? left + i19 : left - i19;
    }

    public int g(int i17) {
        return java.lang.Math.round(getResources().getDisplayMetrics().density * i17);
    }

    /* renamed from: getScrollableTabMinWidth */
    public int m62976x549d676c() {
        return this.A;
    }

    /* renamed from: getSelectedTabPosition */
    public int m62977xe06bcb0d() {
        zx2.u uVar = this.f214634e;
        if (uVar != null) {
            return uVar.f558618e;
        }
        return -1;
    }

    /* renamed from: getTabCount */
    public int m62978x443e53f0() {
        return this.f214633d.size();
    }

    /* renamed from: getTabGravity */
    public int m62979x59a40ef() {
        return this.C;
    }

    /* renamed from: getTabIconTint */
    public android.content.res.ColorStateList m62980x7b5c2493() {
        return this.f214644q;
    }

    /* renamed from: getTabIndicatorGravity */
    public int m62981xf87743be() {
        return this.E;
    }

    /* renamed from: getTabMaxWidth */
    public int m62982xbf355c41() {
        return this.f214651x;
    }

    /* renamed from: getTabMode */
    public int m62983xe12fd6a2() {
        return this.F;
    }

    /* renamed from: getTabRippleColor */
    public android.content.res.ColorStateList m62984xcdf17d34() {
        return this.f214645r;
    }

    /* renamed from: getTabSelectedIndicator */
    public android.graphics.drawable.Drawable m62985x2c506315() {
        return this.f214646s;
    }

    /* renamed from: getTabTextColors */
    public android.content.res.ColorStateList m62986x84373abc() {
        return this.f214642p;
    }

    public final void h() {
        if (this.M == null) {
            android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
            this.M = valueAnimator;
            valueAnimator.setInterpolator(this.V);
            this.M.setDuration(this.D);
            this.M.addUpdateListener(new zx2.m(this));
        }
    }

    public zx2.u i(int i17) {
        if (i17 < 0 || i17 >= m62978x443e53f0()) {
            return null;
        }
        return (zx2.u) this.f214633d.get(i17);
    }

    public zx2.u j() {
        zx2.u uVar = (zx2.u) ((m3.g) f214631x0).a();
        if (uVar == null) {
            uVar = new zx2.u();
        }
        uVar.f558620g = this;
        m3.e eVar = this.U;
        zx2.w wVar = eVar != null ? (zx2.w) ((m3.f) eVar).a() : null;
        if (wVar == null) {
            wVar = new zx2.w(this, getContext());
        }
        wVar.m179861xca0297d3(uVar);
        wVar.setFocusable(true);
        wVar.setMinimumWidth(m62973x5556c013());
        if (android.text.TextUtils.isEmpty(uVar.f558617d)) {
            wVar.setContentDescription(uVar.f558616c);
        } else {
            wVar.setContentDescription(uVar.f558617d);
        }
        uVar.f558621h = wVar;
        return uVar;
    }

    public void k() {
        int m8300xfda78ef6;
        int childCount = this.f214636g.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            } else {
                l(childCount);
            }
        }
        java.util.ArrayList arrayList = this.f214633d;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zx2.u uVar = (zx2.u) it.next();
            it.remove();
            uVar.f558620g = null;
            uVar.f558621h = null;
            uVar.f558614a = null;
            uVar.f558615b = null;
            uVar.f558616c = null;
            uVar.f558617d = null;
            uVar.f558618e = -1;
            uVar.f558619f = null;
            ((m3.g) f214631x0).b(uVar);
        }
        this.f214634e = null;
        p012xc85e97e9.p114xa324943e.p115xd1075a44.a aVar = this.P;
        if (aVar != null) {
            int mo8338x7444f759 = aVar.mo8338x7444f759();
            for (int i17 = 0; i17 < mo8338x7444f759; i17++) {
                zx2.u j17 = j();
                java.lang.CharSequence mo8340x337c8253 = this.P.mo8340x337c8253(i17);
                if (android.text.TextUtils.isEmpty(j17.f558617d) && !android.text.TextUtils.isEmpty(mo8340x337c8253)) {
                    j17.f558621h.setContentDescription(mo8340x337c8253);
                }
                j17.f558616c = mo8340x337c8253;
                zx2.w wVar = j17.f558621h;
                if (wVar != null) {
                    wVar.b();
                }
                b(j17, arrayList.size(), false);
            }
            p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe = this.N;
            if (c1190x18d3c3fe == null || mo8338x7444f759 <= 0 || (m8300xfda78ef6 = c1190x18d3c3fe.m8300xfda78ef6()) == m62977xe06bcb0d() || m8300xfda78ef6 >= m62978x443e53f0()) {
                return;
            }
            m(i(m8300xfda78ef6), true);
        }
    }

    public final void l(int i17) {
        zx2.t tVar = this.f214636g;
        zx2.w wVar = (zx2.w) tVar.getChildAt(i17);
        tVar.removeViewAt(i17);
        if (wVar != null) {
            wVar.m179861xca0297d3(null);
            wVar.setSelected(false);
            ((m3.f) this.U).b(wVar);
        }
        requestLayout();
    }

    public void m(zx2.u uVar, boolean z17) {
        zx2.u uVar2 = this.f214634e;
        java.util.ArrayList arrayList = this.K;
        if (uVar2 == uVar) {
            if (uVar2 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((zx2.o) arrayList.get(size)).c(uVar);
                }
                d(uVar.f558618e);
                return;
            }
            return;
        }
        int i17 = uVar != null ? uVar.f558618e : -1;
        if (z17) {
            if ((uVar2 == null || uVar2.f558618e == -1) && i17 != -1) {
                o(i17, 0.0f, true, true);
            } else {
                d(i17);
            }
            if (i17 != -1) {
                m62975x9cf397fd(i17);
            }
        }
        this.f214634e = uVar;
        if (uVar2 != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                ((zx2.o) arrayList.get(size2)).b(uVar2);
            }
        }
        if (uVar != null) {
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                ((zx2.o) arrayList.get(size3)).a(uVar);
            }
        }
    }

    public void n(p012xc85e97e9.p114xa324943e.p115xd1075a44.a aVar, boolean z17) {
        android.database.DataSetObserver dataSetObserver;
        p012xc85e97e9.p114xa324943e.p115xd1075a44.a aVar2 = this.P;
        if (aVar2 != null && (dataSetObserver = this.Q) != null) {
            aVar2.m8348xfde4bf72(dataSetObserver);
        }
        this.P = aVar;
        if (z17 && aVar != null) {
            if (this.Q == null) {
                this.Q = new zx2.p(this);
            }
            aVar.m8344x4b262a2b(this.Q);
        }
        k();
    }

    public void o(int i17, float f17, boolean z17, boolean z18) {
        int round = java.lang.Math.round(i17 + f17);
        if (round >= 0) {
            zx2.t tVar = this.f214636g;
            if (round < tVar.getChildCount()) {
                if (z18) {
                    android.animation.ValueAnimator valueAnimator = tVar.f558611n;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        tVar.f558611n.cancel();
                    }
                    tVar.f558607g = i17;
                    tVar.f558608h = f17;
                    tVar.e();
                }
                android.animation.ValueAnimator valueAnimator2 = this.M;
                if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                    this.M.cancel();
                }
                scrollTo(f(i17, f17), 0);
                if (z17) {
                    m62975x9cf397fd(round);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.N == null) {
            android.view.ViewParent parent = getParent();
            if (parent instanceof p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe) {
                p((p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.T) {
            m63008x3da43a7b(null);
            this.T = false;
        }
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        zx2.w wVar;
        android.graphics.drawable.Drawable drawable;
        int i17 = 0;
        while (true) {
            zx2.t tVar = this.f214636g;
            if (i17 >= tVar.getChildCount()) {
                super.onDraw(canvas);
                return;
            }
            android.view.View childAt = tVar.getChildAt(i17);
            if ((childAt instanceof zx2.w) && (drawable = (wVar = (zx2.w) childAt).f558632m) != null) {
                drawable.setBounds(wVar.getLeft(), wVar.getTop(), wVar.getRight(), wVar.getBottom());
                wVar.f558632m.draw(canvas);
            }
            i17++;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
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
            int r0 = r5.m62972xe3cd9b12()
            int r0 = r5.g(r0)
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
            int r1 = r5.f214653z
            if (r1 <= 0) goto L3f
            goto L47
        L3f:
            r1 = 56
            int r1 = r5.g(r1)
            int r1 = r0 - r1
        L47:
            r5.f214651x = r1
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15436x4c00d79.onMeasure(int, int):void");
    }

    public final void p(p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe, boolean z17, boolean z18) {
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe2 = this.N;
        if (c1190x18d3c3fe2 != null) {
            zx2.v vVar = this.R;
            if (vVar != null) {
                c1190x18d3c3fe2.m8314x7cd807d6(vVar);
            }
            zx2.n nVar = this.S;
            if (nVar != null) {
                this.N.m8313xd89903f0(nVar);
            }
        }
        zx2.o oVar = this.L;
        if (oVar != null) {
            this.K.remove(oVar);
            this.L = null;
        }
        if (c1190x18d3c3fe != null) {
            this.N = c1190x18d3c3fe;
            if (this.R == null) {
                this.R = new zx2.v(this);
            }
            zx2.v vVar2 = this.R;
            vVar2.f558624f = 0;
            vVar2.f558623e = 0;
            c1190x18d3c3fe.m8289xa5a25773(vVar2);
            zx2.x xVar = new zx2.x(c1190x18d3c3fe);
            this.L = xVar;
            a(xVar);
            p012xc85e97e9.p114xa324943e.p115xd1075a44.a m8299xf939df19 = c1190x18d3c3fe.m8299xf939df19();
            if (m8299xf939df19 != null) {
                n(m8299xf939df19, z17);
            }
            if (this.S == null) {
                this.S = new zx2.n(this);
            }
            zx2.n nVar2 = this.S;
            nVar2.f558593d = z17;
            c1190x18d3c3fe.m8288xa7bfb333(nVar2);
            o(c1190x18d3c3fe.m8300xfda78ef6(), 0.0f, true, true);
        } else {
            this.N = null;
            n(null, false);
        }
        this.T = z18;
    }

    public void q(boolean z17) {
        int i17 = 0;
        while (true) {
            zx2.t tVar = this.f214636g;
            if (i17 >= tVar.getChildCount()) {
                return;
            }
            android.view.View childAt = tVar.getChildAt(i17);
            childAt.setMinimumWidth(m62973x5556c013());
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

    /* renamed from: setInlineLabel */
    public void m62987xd755e19(boolean z17) {
        if (this.G == z17) {
            return;
        }
        this.G = z17;
        int i17 = 0;
        while (true) {
            zx2.t tVar = this.f214636g;
            if (i17 >= tVar.getChildCount()) {
                e();
                return;
            }
            android.view.View childAt = tVar.getChildAt(i17);
            if (childAt instanceof zx2.w) {
                zx2.w wVar = (zx2.w) childAt;
                wVar.setOrientation(!wVar.f558634o.G ? 1 : 0);
                android.widget.TextView textView = wVar.f558630h;
                if (textView == null && wVar.f558631i == null) {
                    wVar.d(wVar.f558627e, wVar.f558628f);
                } else {
                    wVar.d(textView, wVar.f558631i);
                }
            }
            i17++;
        }
    }

    /* renamed from: setInlineLabelResource */
    public void m62988x536c5d47(int i17) {
        m62987xd755e19(getResources().getBoolean(i17));
    }

    @java.lang.Deprecated
    /* renamed from: setOnTabSelectedListener */
    public void m62989xbc0f6683(zx2.o oVar) {
        zx2.o oVar2 = this.f214632J;
        if (oVar2 != null) {
            this.K.remove(oVar2);
        }
        this.f214632J = oVar;
        if (oVar != null) {
            a(oVar);
        }
    }

    /* renamed from: setScrollAnimatorListener */
    public void m62990xedde80aa(android.animation.Animator.AnimatorListener animatorListener) {
        h();
        this.M.addListener(animatorListener);
    }

    /* renamed from: setScrollableTabMinWidth */
    public void m62991x24b019e0(int i17) {
        this.A = i17;
    }

    /* renamed from: setSelectedTabIndicator */
    public void m62993x172ff7b7(android.graphics.drawable.Drawable drawable) {
        if (this.f214646s != drawable) {
            this.f214646s = drawable;
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.u0.k(this.f214636g);
        }
    }

    /* renamed from: setSelectedTabIndicatorColor */
    public void m62994xc75d81ec(int i17) {
        this.f214636g.m179857xeefc9911(i17);
    }

    /* renamed from: setSelectedTabIndicatorGravity */
    public void m62995x3e244697(int i17) {
        if (this.E != i17) {
            this.E = i17;
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.u0.k(this.f214636g);
        }
    }

    @java.lang.Deprecated
    /* renamed from: setSelectedTabIndicatorHeight */
    public void m62996x2c4c8fbe(int i17) {
        this.f214636g.m179858xf8905d39(i17);
    }

    /* renamed from: setTabGravity */
    public void m62997x33be8efb(int i17) {
        if (this.C != i17) {
            this.C = i17;
            e();
        }
    }

    /* renamed from: setTabIconTint */
    public void m62998x11c19807(android.content.res.ColorStateList colorStateList) {
        if (this.f214644q != colorStateList) {
            this.f214644q = colorStateList;
            java.util.ArrayList arrayList = this.f214633d;
            int size = arrayList.size();
            for (int i17 = 0; i17 < size; i17++) {
                zx2.w wVar = ((zx2.u) arrayList.get(i17)).f558621h;
                if (wVar != null) {
                    wVar.b();
                }
            }
        }
    }

    /* renamed from: setTabIconTintResource */
    public void m62999x600ec935(int i17) {
        android.content.Context context = getContext();
        java.lang.Object obj = k.a.f384389a;
        m62998x11c19807(context.getColorStateList(i17));
    }

    /* renamed from: setTabIndicatorFullWidth */
    public void m63000x5ef8445b(boolean z17) {
        this.H = z17;
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.u0.k(this.f214636g);
    }

    /* renamed from: setTabMode */
    public void m63001x54a12416(int i17) {
        if (i17 != this.F) {
            this.F = i17;
            e();
        }
    }

    /* renamed from: setTabRippleColor */
    public void m63002x95e7e540(android.content.res.ColorStateList colorStateList) {
        if (this.f214645r == colorStateList) {
            return;
        }
        this.f214645r = colorStateList;
        int i17 = 0;
        while (true) {
            zx2.t tVar = this.f214636g;
            if (i17 >= tVar.getChildCount()) {
                return;
            }
            android.view.View childAt = tVar.getChildAt(i17);
            if (childAt instanceof zx2.w) {
                android.content.Context context = getContext();
                int i18 = zx2.w.f558625p;
                ((zx2.w) childAt).c(context);
            }
            i17++;
        }
    }

    /* renamed from: setTabRippleColorResource */
    public void m63003xf6d4cd6e(int i17) {
        android.content.Context context = getContext();
        java.lang.Object obj = k.a.f384389a;
        m63002x95e7e540(context.getColorStateList(i17));
    }

    /* renamed from: setTabTextColors */
    public void m63004x170da130(android.content.res.ColorStateList colorStateList) {
        if (this.f214642p != colorStateList) {
            this.f214642p = colorStateList;
            java.util.ArrayList arrayList = this.f214633d;
            int size = arrayList.size();
            for (int i17 = 0; i17 < size; i17++) {
                zx2.w wVar = ((zx2.u) arrayList.get(i17)).f558621h;
                if (wVar != null) {
                    wVar.b();
                }
            }
        }
    }

    @java.lang.Deprecated
    /* renamed from: setTabsFromPagerAdapter */
    public void m63005xb1597df6(p012xc85e97e9.p114xa324943e.p115xd1075a44.a aVar) {
        n(aVar, false);
    }

    /* renamed from: setUnboundedRipple */
    public void m63006x47af472(boolean z17) {
        if (this.I == z17) {
            return;
        }
        this.I = z17;
        int i17 = 0;
        while (true) {
            zx2.t tVar = this.f214636g;
            if (i17 >= tVar.getChildCount()) {
                return;
            }
            android.view.View childAt = tVar.getChildAt(i17);
            if (childAt instanceof zx2.w) {
                android.content.Context context = getContext();
                int i18 = zx2.w.f558625p;
                ((zx2.w) childAt).c(context);
            }
            i17++;
        }
    }

    /* renamed from: setUnboundedRippleResource */
    public void m63007x1a468aa0(int i17) {
        m63006x47af472(getResources().getBoolean(i17));
    }

    /* renamed from: setupWithViewPager */
    public void m63008x3da43a7b(p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe) {
        p(c1190x18d3c3fe, true, false);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return m62974x76843091() > 0;
    }

    public C15436x4c00d79(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.V = new y3.b();
        this.f214633d = new java.util.ArrayList();
        this.f214635f = new android.graphics.RectF();
        this.f214651x = Integer.MAX_VALUE;
        this.K = new java.util.ArrayList();
        this.U = new m3.f(12);
        setHorizontalScrollBarEnabled(false);
        zx2.t tVar = new zx2.t(this, context);
        this.f214636g = tVar;
        super.addView(tVar, 0, new android.widget.FrameLayout.LayoutParams(-2, -1));
        android.content.res.TypedArray d17 = fa.d0.d(context, attributeSet, v9.a.f515664u, i17, com.p314xaae8f345.mm.R.C30868x68b1db1.f576283v8, 22);
        tVar.m179858xf8905d39(d17.getDimensionPixelSize(10, -1));
        tVar.m179857xeefc9911(d17.getColor(7, 0));
        m62993x172ff7b7(ia.a.b(context, d17, 5));
        m62995x3e244697(d17.getInt(9, 0));
        m63000x5ef8445b(d17.getBoolean(8, true));
        int dimensionPixelSize = d17.getDimensionPixelSize(15, 0);
        this.f214640n = dimensionPixelSize;
        this.f214639m = dimensionPixelSize;
        this.f214638i = dimensionPixelSize;
        this.f214637h = dimensionPixelSize;
        this.f214637h = d17.getDimensionPixelSize(18, dimensionPixelSize);
        this.f214638i = d17.getDimensionPixelSize(19, this.f214638i);
        this.f214639m = d17.getDimensionPixelSize(17, this.f214639m);
        this.f214640n = d17.getDimensionPixelSize(16, this.f214640n);
        int resourceId = d17.getResourceId(22, com.p314xaae8f345.mm.R.C30868x68b1db1.f576126r4);
        this.f214641o = resourceId;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId, j.a.f377730y);
        try {
            this.f214648u = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.f214642p = ia.a.a(context, obtainStyledAttributes, 3);
            obtainStyledAttributes.recycle();
            if (d17.hasValue(23)) {
                this.f214642p = ia.a.a(context, d17, 23);
            }
            if (d17.hasValue(21)) {
                this.f214642p = new android.content.res.ColorStateList(new int[][]{android.widget.HorizontalScrollView.SELECTED_STATE_SET, android.widget.HorizontalScrollView.EMPTY_STATE_SET}, new int[]{d17.getColor(21, 0), this.f214642p.getDefaultColor()});
            }
            this.f214644q = ia.a.a(context, d17, 3);
            this.f214647t = fa.e0.a(d17.getInt(4, -1), null);
            this.f214645r = ia.a.a(context, d17, 20);
            this.D = d17.getInt(6, 300);
            this.f214652y = d17.getDimensionPixelSize(13, -1);
            this.f214653z = d17.getDimensionPixelSize(12, -1);
            this.f214650w = d17.getResourceId(0, 0);
            this.B = d17.getDimensionPixelSize(1, 0);
            this.F = d17.getInt(14, 1);
            this.C = d17.getInt(2, 0);
            this.G = d17.getBoolean(11, false);
            this.I = d17.getBoolean(24, false);
            d17.recycle();
            android.content.res.Resources resources = getResources();
            this.f214649v = resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561831tv);
            this.A = resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561829tt);
            e();
            android.content.res.TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, b92.w2.f100085i);
            tVar.setClipChildren(obtainStyledAttributes2.getBoolean(0, true));
            tVar.setClipToPadding(obtainStyledAttributes2.getBoolean(1, true));
            this.W = obtainStyledAttributes2.getBoolean(2, true);
            this.f214643p0 = obtainStyledAttributes2.getBoolean(3, true);
            obtainStyledAttributes2.recycle();
        } catch (java.lang.Throwable th6) {
            obtainStyledAttributes.recycle();
            throw th6;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(android.view.View view, int i17) {
        c(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public android.widget.FrameLayout.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        c(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(android.view.View view, int i17, android.view.ViewGroup.LayoutParams layoutParams) {
        c(view);
    }

    /* renamed from: setSelectedTabIndicator */
    public void m62992x172ff7b7(int i17) {
        if (i17 != 0) {
            m62993x172ff7b7(k.a.a(getContext(), i17));
        } else {
            m62993x172ff7b7((android.graphics.drawable.Drawable) null);
        }
    }
}
