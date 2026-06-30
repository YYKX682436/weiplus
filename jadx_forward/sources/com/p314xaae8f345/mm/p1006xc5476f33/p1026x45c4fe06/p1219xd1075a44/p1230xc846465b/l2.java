package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b;

/* loaded from: classes7.dex */
public class l2 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.AbstractC12805xabdd4ef7 f173532d;

    /* renamed from: e, reason: collision with root package name */
    public int f173533e;

    /* renamed from: f, reason: collision with root package name */
    public int f173534f;

    /* renamed from: g, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.g3 f173535g;

    /* renamed from: h, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.g3 f173536h;

    /* renamed from: m, reason: collision with root package name */
    public int f173538m;

    /* renamed from: q, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de f173542q;

    /* renamed from: s, reason: collision with root package name */
    public final int f173544s;

    /* renamed from: i, reason: collision with root package name */
    public int f173537i = 0;

    /* renamed from: n, reason: collision with root package name */
    public final float f173539n = android.view.ViewConfiguration.get(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getScaledTouchSlop();

    /* renamed from: o, reason: collision with root package name */
    public int f173540o = -1;

    /* renamed from: p, reason: collision with root package name */
    public boolean f173541p = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f173543r = false;

    /* renamed from: t, reason: collision with root package name */
    public int f173545t = 0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f173546u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f173547v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f173548w = false;

    public l2(int i17) {
        this.f173544s = 0;
        this.f173544s = i17;
    }

    public static int a(int i17) {
        if (i17 == 0) {
            return 0;
        }
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        boolean[] zArr = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.w.f173615i;
        if (!zArr[0]) {
            synchronized (zArr) {
                if (!zArr[0]) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRecentConfig", "DesktopConfig init mCurrentType: %d", 1);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.w.f173607a = 4.0f;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.w.f173608b = 4;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.w.f173609c = 3.0f;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.w.f173610d = 3;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.w.f173612f = 4.0f;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.w.f173613g = 4;
                    if (((int) (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.y.b(context, 4.0f) + (context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561457j3) * 2 * com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.y.c(context)))) <= i65.a.b(context, 10)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.w.f173612f = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.w.f173609c;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.w.f173613g = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.w.f173610d;
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.w.f173612f = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.w.f173607a;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.w.f173613g = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.w.f173608b;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.w.f173614h = 2;
                    int max = java.lang.Math.max(2, 1);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.w.f173614h = max;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.w.f173614h = java.lang.Math.min(max, 4);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRecentConfig", "DesktopConfig init showCountPerPage: %f, completelyShowCountPerPage: %d, mRecentAppBrandMaxShowLines: %d", java.lang.Float.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.w.f173612f), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.w.f173613g), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.w.f173614h));
                    zArr[0] = true;
                }
            }
        }
        return (i17 * com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.w.f173613g) + 1;
    }

    public final int b(int i17) {
        int i18 = this.f173537i;
        float width = this.f173532d.getWidth();
        int i19 = this.f173537i;
        int i27 = i17 - this.f173534f;
        float f17 = i27;
        float f18 = width / 2.0f;
        int i28 = this.f173544s;
        if (f17 >= f18) {
            i18 = c(this.f173542q.y());
        } else {
            if (i27 >= 0 && f17 < this.f173539n) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ViewPagerHelper", "[getOffsetToPosition] targetPage: %s targetPos: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i18 == 0 ? 0 : (this.f173538m * i18) + i28));
                if (i18 == 0) {
                    return 0;
                }
                return (i18 * this.f173538m) + i28;
            }
            if (f17 <= (-width) / 2.0f) {
                i18 = c(this.f173542q.w());
            }
        }
        int mo1894x7e414b06 = this.f173532d.mo7946xf939df19().mo1894x7e414b06();
        int i29 = this.f173538m;
        int i37 = mo1894x7e414b06 / i29;
        if (mo1894x7e414b06 % i29 != 0) {
            i37++;
        }
        int max = java.lang.Math.max(java.lang.Math.min(i18, i37 - 1), -1);
        if (max - i19 > 1) {
            max = i19 + 1;
        } else if (i19 - max > 1) {
            max = i19 - 1;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ViewPagerHelper", "[getOffsetToPosition] lastPage: %d, targetPage: %d targetPos: %d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(max), java.lang.Integer.valueOf(a(max)));
        if (max == 0) {
            return 0;
        }
        return (max * this.f173538m) + i28;
    }

    public int c(int i17) {
        if (this.f173544s == 0) {
            return i17 / this.f173538m;
        }
        int i18 = this.f173538m;
        int i19 = i17 / i18;
        return (i17 % i18 != 0 || i17 == 0) ? i19 : i19 - 1;
    }

    public final void d() {
        if (this.f173541p) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ViewPagerHelper", "onScrollAnimationEnd");
            this.f173541p = false;
            this.f173543r = false;
            this.f173540o = -1;
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c1163xf1deaba4);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/recent/ViewPagerHelper", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ViewPagerHelper", "onScrollStateChanged newState: %d", java.lang.Integer.valueOf(i17));
        if (i17 == 0 && this.f173545t != 2) {
            int b17 = b(this.f173533e);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.AbstractC12805xabdd4ef7 abstractC12805xabdd4ef7 = this.f173532d;
            if (abstractC12805xabdd4ef7 != null && this.f173547v) {
                this.f173535g.f93582a = b17;
                this.f173548w = true;
                abstractC12805xabdd4ef7.getLayoutManager().m8099x6305639d(this.f173535g);
            }
            this.f173546u = true;
        } else if (!this.f173546u && i17 == 2) {
            this.f173546u = true;
        } else if (i17 == 0) {
            this.f173534f = this.f173533e;
            this.f173546u = false;
            int w17 = this.f173542q.w();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ViewPagerHelper", "onScrollStateChanged firstPos: %d", java.lang.Integer.valueOf(w17));
            if (w17 != -1) {
                int i18 = w17 / this.f173538m;
                this.f173537i = i18;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ViewPagerHelper", "onScrollStateChanged mCurPage: %d, firstVisible: %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(w17));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ViewPagerHelper", "onScrollStateChanged firstPos is -1, invalid, mCurPage: %d", java.lang.Integer.valueOf(this.f173537i));
            }
            this.f173547v = false;
            if (this.f173543r) {
                float f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.w.f173607a;
                this.f173543r = false;
                this.f173541p = true;
                int c17 = c(0);
                this.f173540o = a(c17);
                int c18 = c(this.f173542q.t());
                this.f173537i = c18;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ViewPagerHelper", "fastScroll curPage: %d, pos: %d, targetPage: %d, targetPos: %d", java.lang.Integer.valueOf(c18), 0, java.lang.Integer.valueOf(c17), java.lang.Integer.valueOf(this.f173540o));
                int i19 = this.f173537i;
                int i27 = this.f173540o;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.AbstractC12805xabdd4ef7 abstractC12805xabdd4ef72 = this.f173532d;
                if (abstractC12805xabdd4ef72 != null) {
                    this.f173536h.f93582a = i27;
                    this.f173548w = true;
                    abstractC12805xabdd4ef72.getLayoutManager().m8099x6305639d(this.f173536h);
                }
                d();
            } else {
                d();
            }
            if (this.f173548w) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ViewPagerHelper", "scrollBy x: -1, y: 0");
                this.f173548w = false;
                this.f173532d.scrollBy(-1, 0);
            }
        } else if (i17 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ViewPagerHelper", "SCROLL_STATE_DRAGGING");
            this.f173547v = true;
        }
        this.f173545t = i17;
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/recent/ViewPagerHelper", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c1163xf1deaba4);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/recent/ViewPagerHelper", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        this.f173533e += i17;
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/recent/ViewPagerHelper", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
