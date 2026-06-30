package com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44;

/* renamed from: com.tencent.mm.xcompat.viewpager2.widget.ViewPager2 */
/* loaded from: classes15.dex */
public final class C22956x1a4bbf4 extends android.view.ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Rect f296265d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Rect f296266e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.c f296267f;

    /* renamed from: g, reason: collision with root package name */
    public int f296268g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f296269h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.w0 f296270i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.e0 f296271m;

    /* renamed from: n, reason: collision with root package name */
    public int f296272n;

    /* renamed from: o, reason: collision with root package name */
    public android.os.Parcelable f296273o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 f296274p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.m0 f296275q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.g f296276r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.c f296277s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.d f296278t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.e f296279u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.b1 f296280v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f296281w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f296282x;

    /* renamed from: y, reason: collision with root package name */
    public int f296283y;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.l f296284z;

    /* renamed from: com.tencent.mm.xcompat.viewpager2.widget.ViewPager2$SavedState */
    /* loaded from: classes15.dex */
    public static class SavedState extends android.view.View.BaseSavedState {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.C22956x1a4bbf4.SavedState> f39974x681a0c0c = new com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.w();

        /* renamed from: d, reason: collision with root package name */
        public int f296285d;

        /* renamed from: e, reason: collision with root package name */
        public int f296286e;

        /* renamed from: f, reason: collision with root package name */
        public android.os.Parcelable f296287f;

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f296285d = parcel.readInt();
            this.f296286e = parcel.readInt();
            this.f296287f = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            super.writeToParcel(parcel, i17);
            parcel.writeInt(this.f296285d);
            parcel.writeInt(this.f296286e);
            parcel.writeParcelable(this.f296287f, i17);
        }
    }

    public C22956x1a4bbf4(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f296265d = new android.graphics.Rect();
        this.f296266e = new android.graphics.Rect();
        this.f296267f = new com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.c(3);
        this.f296269h = false;
        this.f296270i = new com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.h(this);
        this.f296272n = -1;
        this.f296280v = null;
        this.f296281w = false;
        this.f296282x = true;
        this.f296283y = -1;
        a(context, attributeSet);
    }

    public final void a(android.content.Context context, android.util.AttributeSet attributeSet) {
        this.f296284z = new com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.s(this);
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.v vVar = new com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.v(this, context);
        this.f296274p = vVar;
        vVar.setId(android.view.View.generateViewId());
        this.f296274p.setDescendantFocusability(131072);
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.n nVar = new com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.n(this, context);
        this.f296271m = nVar;
        this.f296274p.m83615x900dcbe1(nVar);
        this.f296274p.m83622x747fcb66(1);
        int[] iArr = sq5.a.f492920b;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            n3.f1.d(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        }
        try {
            m83658x1a6eb00e(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
            this.f296274p.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4 = this.f296274p;
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.k kVar = new com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.k(this);
            if (c22949xf1deaba4.H == null) {
                c22949xf1deaba4.H = new java.util.ArrayList();
            }
            ((java.util.ArrayList) c22949xf1deaba4.H).add(kVar);
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.g gVar = new com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.g(this);
            this.f296276r = gVar;
            this.f296278t = new com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.d(this, gVar, this.f296274p);
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.u uVar = new com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.u(this);
            this.f296275q = uVar;
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba42 = this.f296274p;
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba43 = uVar.f296024a;
            if (c22949xf1deaba43 != c22949xf1deaba42) {
                com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.k1 k1Var = uVar.f296025b;
                if (c22949xf1deaba43 != null) {
                    java.util.List list = c22949xf1deaba43.H1;
                    if (list != null) {
                        ((java.util.ArrayList) list).remove(k1Var);
                    }
                    uVar.f296024a.m83616x9a6969cf(null);
                }
                uVar.f296024a = c22949xf1deaba42;
                if (c22949xf1deaba42 != null) {
                    if (c22949xf1deaba42.m83603x6392d05b() != null) {
                        throw new java.lang.IllegalStateException("An instance of OnFlingListener already set.");
                    }
                    uVar.f296024a.h(k1Var);
                    uVar.f296024a.m83616x9a6969cf(uVar);
                    new android.widget.Scroller(uVar.f296024a.getContext(), new android.view.animation.DecelerateInterpolator());
                    uVar.c();
                }
            }
            this.f296274p.h(this.f296276r);
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.c cVar = new com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.c(3);
            this.f296277s = cVar;
            this.f296276r.f296294a = cVar;
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.i iVar = new com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.i(this);
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.j jVar = new com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.j(this);
            ((java.util.ArrayList) cVar.f296289a).add(iVar);
            ((java.util.ArrayList) this.f296277s.f296289a).add(jVar);
            this.f296284z.a(this.f296277s, this.f296274p);
            ((java.util.ArrayList) this.f296277s.f296289a).add(this.f296267f);
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.e eVar = new com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.e(this.f296271m);
            this.f296279u = eVar;
            ((java.util.ArrayList) this.f296277s.f296289a).add(eVar);
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba44 = this.f296274p;
            attachViewToParent(c22949xf1deaba44, 0, c22949xf1deaba44.getLayoutParams());
        } catch (java.lang.Throwable th6) {
            obtainStyledAttributes.recycle();
            throw th6;
        }
    }

    public final void b() {
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.u0 m83648xf939df19;
        if (this.f296272n == -1 || (m83648xf939df19 = m83648xf939df19()) == null) {
            return;
        }
        if (this.f296273o != null) {
            this.f296273o = null;
        }
        int max = java.lang.Math.max(0, java.lang.Math.min(this.f296272n, m83648xf939df19.a() - 1));
        this.f296268g = max;
        this.f296272n = -1;
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4 = this.f296274p;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(max));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c22949xf1deaba4, arrayList.toArray(), "com/tencent/mm/xcompat/viewpager2/widget/ViewPager2", "restorePendingState", "()V", "Undefined", "scrollToPosition", "(I)V");
        c22949xf1deaba4.b0(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(c22949xf1deaba4, "com/tencent/mm/xcompat/viewpager2/widget/ViewPager2", "restorePendingState", "()V", "Undefined", "scrollToPosition", "(I)V");
        ((com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.s) this.f296284z).c();
    }

    public void c(int i17, boolean z17) {
        if (this.f296278t.f296290a.f296306m) {
            throw new java.lang.IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
        }
        d(i17, z17);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i17) {
        return this.f296274p.canScrollHorizontally(i17);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i17) {
        return this.f296274p.canScrollVertically(i17);
    }

    public void d(int i17, boolean z17) {
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.o oVar;
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.u0 m83648xf939df19 = m83648xf939df19();
        if (m83648xf939df19 == null) {
            if (this.f296272n != -1) {
                this.f296272n = java.lang.Math.max(i17, 0);
                return;
            }
            return;
        }
        if (m83648xf939df19.a() <= 0) {
            return;
        }
        int min = java.lang.Math.min(java.lang.Math.max(i17, 0), m83648xf939df19.a() - 1);
        int i18 = this.f296268g;
        if (min == i18) {
            if (this.f296276r.f296299f == 0) {
                return;
            }
        }
        if (min == i18 && z17) {
            return;
        }
        double d17 = i18;
        this.f296268g = min;
        ((com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.s) this.f296284z).c();
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.g gVar = this.f296276r;
        if (!(gVar.f296299f == 0)) {
            gVar.e();
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.f fVar = gVar.f296300g;
            d17 = fVar.f296291a + fVar.f296292b;
        }
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.g gVar2 = this.f296276r;
        gVar2.getClass();
        gVar2.f296298e = z17 ? 2 : 3;
        gVar2.f296306m = false;
        boolean z18 = gVar2.f296302i != min;
        gVar2.f296302i = min;
        gVar2.c(2);
        if (z18 && (oVar = gVar2.f296294a) != null) {
            oVar.c(min);
        }
        if (!z17) {
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4 = this.f296274p;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(min));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c22949xf1deaba4, arrayList.toArray(), "com/tencent/mm/xcompat/viewpager2/widget/ViewPager2", "setCurrentItemInternal", "(IZ)V", "Undefined", "scrollToPosition", "(I)V");
            c22949xf1deaba4.b0(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(c22949xf1deaba4, "com/tencent/mm/xcompat/viewpager2/widget/ViewPager2", "setCurrentItemInternal", "(IZ)V", "Undefined", "scrollToPosition", "(I)V");
            return;
        }
        double d18 = min;
        if (java.lang.Math.abs(d18 - d17) <= 3.0d) {
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba42 = this.f296274p;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(java.lang.Integer.valueOf(min));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(c22949xf1deaba42, arrayList2.toArray(), "com/tencent/mm/xcompat/viewpager2/widget/ViewPager2", "setCurrentItemInternal", "(IZ)V", "Undefined", "smoothScrollToPosition", "(I)V");
            c22949xf1deaba42.e0(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(c22949xf1deaba42, "com/tencent/mm/xcompat/viewpager2/widget/ViewPager2", "setCurrentItemInternal", "(IZ)V", "Undefined", "smoothScrollToPosition", "(I)V");
            return;
        }
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba43 = this.f296274p;
        int i19 = d18 > d17 ? min - 3 : min + 3;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
        arrayList3.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(c22949xf1deaba43, arrayList3.toArray(), "com/tencent/mm/xcompat/viewpager2/widget/ViewPager2", "setCurrentItemInternal", "(IZ)V", "Undefined", "scrollToPosition", "(I)V");
        c22949xf1deaba43.b0(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(c22949xf1deaba43, "com/tencent/mm/xcompat/viewpager2/widget/ViewPager2", "setCurrentItemInternal", "(IZ)V", "Undefined", "scrollToPosition", "(I)V");
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba44 = this.f296274p;
        c22949xf1deaba44.post(new com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.x(min, c22949xf1deaba44));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(android.util.SparseArray sparseArray) {
        android.os.Parcelable parcelable = (android.os.Parcelable) sparseArray.get(getId());
        if (parcelable instanceof com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.C22956x1a4bbf4.SavedState) {
            int i17 = ((com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.C22956x1a4bbf4.SavedState) parcelable).f296285d;
            sparseArray.put(this.f296274p.getId(), (android.os.Parcelable) sparseArray.get(i17));
            sparseArray.remove(i17);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        b();
    }

    public void e() {
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.m0 m0Var = this.f296275q;
        if (m0Var == null) {
            throw new java.lang.IllegalStateException("Design assumption violated.");
        }
        android.view.View b17 = m0Var.b(this.f296271m);
        if (b17 == null) {
            return;
        }
        int o17 = this.f296271m.o(b17);
        if (o17 != this.f296268g && m83654x54496c8e() == 0) {
            this.f296277s.c(o17);
        }
        this.f296269h = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public java.lang.CharSequence getAccessibilityClassName() {
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.l lVar = this.f296284z;
        lVar.getClass();
        if (!(lVar instanceof com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.s)) {
            return super.getAccessibilityClassName();
        }
        this.f296284z.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    /* renamed from: getAdapter */
    public com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.u0 m83648xf939df19() {
        return this.f296274p.m83594xf939df19();
    }

    /* renamed from: getCurrentItem */
    public int m83649xfda78ef6() {
        return this.f296268g;
    }

    /* renamed from: getItemDecorationCount */
    public int m83650x883dc776() {
        return this.f296274p.m83598x883dc776();
    }

    /* renamed from: getOffscreenPageLimit */
    public int m83651xa9089c07() {
        return this.f296283y;
    }

    /* renamed from: getOrientation */
    public int m83652x84093c9a() {
        return this.f296271m.f296026n == 1 ? 1 : 0;
    }

    /* renamed from: getPageSize */
    public int m83653xaf1414a6() {
        int height;
        int paddingBottom;
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4 = this.f296274p;
        if (m83652x84093c9a() == 0) {
            height = c22949xf1deaba4.getWidth() - c22949xf1deaba4.getPaddingLeft();
            paddingBottom = c22949xf1deaba4.getPaddingRight();
        } else {
            height = c22949xf1deaba4.getHeight() - c22949xf1deaba4.getPaddingTop();
            paddingBottom = c22949xf1deaba4.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    /* renamed from: getScrollState */
    public int m83654x54496c8e() {
        return this.f296276r.f296299f;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        int i17;
        int i18;
        int a17;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.C22956x1a4bbf4 c22956x1a4bbf4 = ((com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.s) this.f296284z).f296316d;
        if (c22956x1a4bbf4.m83648xf939df19() == null) {
            i17 = 0;
            i18 = 0;
        } else if (c22956x1a4bbf4.m83652x84093c9a() == 1) {
            i17 = c22956x1a4bbf4.m83648xf939df19().a();
            i18 = 1;
        } else {
            i18 = c22956x1a4bbf4.m83648xf939df19().a();
            i17 = 1;
        }
        accessibilityNodeInfo.setCollectionInfo(android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(i17, i18, false, 0));
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.u0 m83648xf939df19 = c22956x1a4bbf4.m83648xf939df19();
        if (m83648xf939df19 == null || (a17 = m83648xf939df19.a()) == 0 || !c22956x1a4bbf4.f296282x) {
            return;
        }
        if (c22956x1a4bbf4.f296268g > 0) {
            accessibilityNodeInfo.addAction(8192);
        }
        if (c22956x1a4bbf4.f296268g < a17 - 1) {
            accessibilityNodeInfo.addAction(4096);
        }
        accessibilityNodeInfo.setScrollable(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        int measuredWidth = this.f296274p.getMeasuredWidth();
        int measuredHeight = this.f296274p.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        android.graphics.Rect rect = this.f296265d;
        rect.left = paddingLeft;
        rect.right = (i19 - i17) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i27 - i18) - getPaddingBottom();
        android.graphics.Rect rect2 = this.f296266e;
        android.view.Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.f296274p.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.f296269h) {
            e();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        measureChild(this.f296274p, i17, i18);
        int measuredWidth = this.f296274p.getMeasuredWidth();
        int measuredHeight = this.f296274p.getMeasuredHeight();
        int measuredState = this.f296274p.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(android.view.View.resolveSizeAndState(java.lang.Math.max(paddingLeft, getSuggestedMinimumWidth()), i17, measuredState), android.view.View.resolveSizeAndState(java.lang.Math.max(paddingTop, getSuggestedMinimumHeight()), i18, measuredState << 16));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.C22956x1a4bbf4.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.C22956x1a4bbf4.SavedState savedState = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.C22956x1a4bbf4.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f296272n = savedState.f296286e;
        this.f296273o = savedState.f296287f;
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.C22956x1a4bbf4.SavedState savedState = new com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.C22956x1a4bbf4.SavedState(super.onSaveInstanceState());
        savedState.f296285d = this.f296274p.getId();
        int i17 = this.f296272n;
        if (i17 == -1) {
            i17 = this.f296268g;
        }
        savedState.f296286e = i17;
        android.os.Parcelable parcelable = this.f296273o;
        if (parcelable != null) {
            savedState.f296287f = parcelable;
        } else {
            this.f296274p.m83594xf939df19();
        }
        return savedState;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(android.view.View view) {
        throw new java.lang.IllegalStateException("ViewPager2 does not support direct child views");
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i17, android.os.Bundle bundle) {
        ((com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.s) this.f296284z).getClass();
        if (!(i17 == 8192 || i17 == 4096)) {
            return super.performAccessibilityAction(i17, bundle);
        }
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.s sVar = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.s) this.f296284z;
        sVar.getClass();
        if (!(i17 == 8192 || i17 == 4096)) {
            throw new java.lang.IllegalStateException();
        }
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.C22956x1a4bbf4 c22956x1a4bbf4 = sVar.f296316d;
        int m83649xfda78ef6 = i17 == 8192 ? c22956x1a4bbf4.m83649xfda78ef6() - 1 : c22956x1a4bbf4.m83649xfda78ef6() + 1;
        if (c22956x1a4bbf4.f296282x) {
            c22956x1a4bbf4.d(m83649xfda78ef6, true);
        }
        return true;
    }

    /* renamed from: setAdapter */
    public void m83655x6cab2c8d(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.u0 u0Var) {
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.u0 m83594xf939df19 = this.f296274p.m83594xf939df19();
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.s sVar = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.s) this.f296284z;
        if (m83594xf939df19 != null) {
            m83594xf939df19.f296177a.unregisterObserver(sVar.f296315c);
        } else {
            sVar.getClass();
        }
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.w0 w0Var = this.f296270i;
        if (m83594xf939df19 != null) {
            m83594xf939df19.f296177a.unregisterObserver(w0Var);
        }
        this.f296274p.m83608x6cab2c8d(u0Var);
        this.f296268g = 0;
        b();
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.s sVar2 = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.s) this.f296284z;
        sVar2.c();
        if (u0Var != null) {
            u0Var.f296177a.registerObserver(sVar2.f296315c);
        }
        if (u0Var != null) {
            u0Var.f296177a.registerObserver(w0Var);
        }
    }

    /* renamed from: setCurrentItem */
    public void m83656x940d026a(int i17) {
        c(i17, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i17) {
        super.setLayoutDirection(i17);
        ((com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.s) this.f296284z).c();
    }

    /* renamed from: setOffscreenPageLimit */
    public void m83657x40341e13(int i17) {
        if (i17 < 1 && i17 != -1) {
            throw new java.lang.IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f296283y = i17;
        this.f296274p.requestLayout();
    }

    /* renamed from: setOrientation */
    public void m83658x1a6eb00e(int i17) {
        this.f296271m.Y(i17);
        ((com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.s) this.f296284z).c();
    }

    /* renamed from: setPageTransformer */
    public void m83659xec491e48(com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.t tVar) {
        if (tVar != null) {
            if (!this.f296281w) {
                this.f296280v = this.f296274p.m83597x5701d990();
                this.f296281w = true;
            }
            this.f296274p.m83612x8d4ad49c(null);
        } else if (this.f296281w) {
            this.f296274p.m83612x8d4ad49c(this.f296280v);
            this.f296280v = null;
            this.f296281w = false;
        }
        this.f296279u.getClass();
        if (tVar == null) {
            return;
        }
        this.f296279u.getClass();
        this.f296279u.getClass();
    }

    /* renamed from: setUserInputEnabled */
    public void m83660xf88f3804(boolean z17) {
        this.f296282x = z17;
        ((com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.s) this.f296284z).c();
    }

    public C22956x1a4bbf4(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f296265d = new android.graphics.Rect();
        this.f296266e = new android.graphics.Rect();
        this.f296267f = new com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.c(3);
        this.f296269h = false;
        this.f296270i = new com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.h(this);
        this.f296272n = -1;
        this.f296280v = null;
        this.f296281w = false;
        this.f296282x = true;
        this.f296283y = -1;
        a(context, attributeSet);
    }
}
