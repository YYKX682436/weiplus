package com.tencent.mm.plugin.appbrand.widget.recent;

/* loaded from: classes7.dex */
public class l2 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.recent.BaseAppBrandRecentView f91999d;

    /* renamed from: e, reason: collision with root package name */
    public int f92000e;

    /* renamed from: f, reason: collision with root package name */
    public int f92001f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.recyclerview.widget.g3 f92002g;

    /* renamed from: h, reason: collision with root package name */
    public androidx.recyclerview.widget.g3 f92003h;

    /* renamed from: m, reason: collision with root package name */
    public int f92005m;

    /* renamed from: q, reason: collision with root package name */
    public androidx.recyclerview.widget.LinearLayoutManager f92009q;

    /* renamed from: s, reason: collision with root package name */
    public final int f92011s;

    /* renamed from: i, reason: collision with root package name */
    public int f92004i = 0;

    /* renamed from: n, reason: collision with root package name */
    public final float f92006n = android.view.ViewConfiguration.get(com.tencent.mm.sdk.platformtools.x2.f193071a).getScaledTouchSlop();

    /* renamed from: o, reason: collision with root package name */
    public int f92007o = -1;

    /* renamed from: p, reason: collision with root package name */
    public boolean f92008p = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f92010r = false;

    /* renamed from: t, reason: collision with root package name */
    public int f92012t = 0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f92013u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f92014v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f92015w = false;

    public l2(int i17) {
        this.f92011s = 0;
        this.f92011s = i17;
    }

    public static int a(int i17) {
        if (i17 == 0) {
            return 0;
        }
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        boolean[] zArr = com.tencent.mm.plugin.appbrand.widget.recent.w.f92082i;
        if (!zArr[0]) {
            synchronized (zArr) {
                if (!zArr[0]) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRecentConfig", "DesktopConfig init mCurrentType: %d", 1);
                    com.tencent.mm.plugin.appbrand.widget.recent.w.f92074a = 4.0f;
                    com.tencent.mm.plugin.appbrand.widget.recent.w.f92075b = 4;
                    com.tencent.mm.plugin.appbrand.widget.recent.w.f92076c = 3.0f;
                    com.tencent.mm.plugin.appbrand.widget.recent.w.f92077d = 3;
                    com.tencent.mm.plugin.appbrand.widget.recent.w.f92079f = 4.0f;
                    com.tencent.mm.plugin.appbrand.widget.recent.w.f92080g = 4;
                    if (((int) (com.tencent.mm.plugin.appbrand.widget.recent.y.b(context, 4.0f) + (context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479924j3) * 2 * com.tencent.mm.plugin.appbrand.widget.recent.y.c(context)))) <= i65.a.b(context, 10)) {
                        com.tencent.mm.plugin.appbrand.widget.recent.w.f92079f = com.tencent.mm.plugin.appbrand.widget.recent.w.f92076c;
                        com.tencent.mm.plugin.appbrand.widget.recent.w.f92080g = com.tencent.mm.plugin.appbrand.widget.recent.w.f92077d;
                    } else {
                        com.tencent.mm.plugin.appbrand.widget.recent.w.f92079f = com.tencent.mm.plugin.appbrand.widget.recent.w.f92074a;
                        com.tencent.mm.plugin.appbrand.widget.recent.w.f92080g = com.tencent.mm.plugin.appbrand.widget.recent.w.f92075b;
                    }
                    com.tencent.mm.plugin.appbrand.widget.recent.w.f92081h = 2;
                    int max = java.lang.Math.max(2, 1);
                    com.tencent.mm.plugin.appbrand.widget.recent.w.f92081h = max;
                    com.tencent.mm.plugin.appbrand.widget.recent.w.f92081h = java.lang.Math.min(max, 4);
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRecentConfig", "DesktopConfig init showCountPerPage: %f, completelyShowCountPerPage: %d, mRecentAppBrandMaxShowLines: %d", java.lang.Float.valueOf(com.tencent.mm.plugin.appbrand.widget.recent.w.f92079f), java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.widget.recent.w.f92080g), java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.widget.recent.w.f92081h));
                    zArr[0] = true;
                }
            }
        }
        return (i17 * com.tencent.mm.plugin.appbrand.widget.recent.w.f92080g) + 1;
    }

    public final int b(int i17) {
        int i18 = this.f92004i;
        float width = this.f91999d.getWidth();
        int i19 = this.f92004i;
        int i27 = i17 - this.f92001f;
        float f17 = i27;
        float f18 = width / 2.0f;
        int i28 = this.f92011s;
        if (f17 >= f18) {
            i18 = c(this.f92009q.y());
        } else {
            if (i27 >= 0 && f17 < this.f92006n) {
                com.tencent.mars.xlog.Log.i("ViewPagerHelper", "[getOffsetToPosition] targetPage: %s targetPos: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i18 == 0 ? 0 : (this.f92005m * i18) + i28));
                if (i18 == 0) {
                    return 0;
                }
                return (i18 * this.f92005m) + i28;
            }
            if (f17 <= (-width) / 2.0f) {
                i18 = c(this.f92009q.w());
            }
        }
        int itemCount = this.f91999d.getAdapter().getItemCount();
        int i29 = this.f92005m;
        int i37 = itemCount / i29;
        if (itemCount % i29 != 0) {
            i37++;
        }
        int max = java.lang.Math.max(java.lang.Math.min(i18, i37 - 1), -1);
        if (max - i19 > 1) {
            max = i19 + 1;
        } else if (i19 - max > 1) {
            max = i19 - 1;
        }
        com.tencent.mars.xlog.Log.i("ViewPagerHelper", "[getOffsetToPosition] lastPage: %d, targetPage: %d targetPos: %d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(max), java.lang.Integer.valueOf(a(max)));
        if (max == 0) {
            return 0;
        }
        return (max * this.f92005m) + i28;
    }

    public int c(int i17) {
        if (this.f92011s == 0) {
            return i17 / this.f92005m;
        }
        int i18 = this.f92005m;
        int i19 = i17 / i18;
        return (i17 % i18 != 0 || i17 == 0) ? i19 : i19 - 1;
    }

    public final void d() {
        if (this.f92008p) {
            com.tencent.mars.xlog.Log.i("ViewPagerHelper", "onScrollAnimationEnd");
            this.f92008p = false;
            this.f92010r = false;
            this.f92007o = -1;
        }
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/recent/ViewPagerHelper", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        com.tencent.mars.xlog.Log.i("ViewPagerHelper", "onScrollStateChanged newState: %d", java.lang.Integer.valueOf(i17));
        if (i17 == 0 && this.f92012t != 2) {
            int b17 = b(this.f92000e);
            com.tencent.mm.plugin.appbrand.widget.recent.BaseAppBrandRecentView baseAppBrandRecentView = this.f91999d;
            if (baseAppBrandRecentView != null && this.f92014v) {
                this.f92002g.f12049a = b17;
                this.f92015w = true;
                baseAppBrandRecentView.getLayoutManager().startSmoothScroll(this.f92002g);
            }
            this.f92013u = true;
        } else if (!this.f92013u && i17 == 2) {
            this.f92013u = true;
        } else if (i17 == 0) {
            this.f92001f = this.f92000e;
            this.f92013u = false;
            int w17 = this.f92009q.w();
            com.tencent.mars.xlog.Log.i("ViewPagerHelper", "onScrollStateChanged firstPos: %d", java.lang.Integer.valueOf(w17));
            if (w17 != -1) {
                int i18 = w17 / this.f92005m;
                this.f92004i = i18;
                com.tencent.mars.xlog.Log.i("ViewPagerHelper", "onScrollStateChanged mCurPage: %d, firstVisible: %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(w17));
            } else {
                com.tencent.mars.xlog.Log.e("ViewPagerHelper", "onScrollStateChanged firstPos is -1, invalid, mCurPage: %d", java.lang.Integer.valueOf(this.f92004i));
            }
            this.f92014v = false;
            if (this.f92010r) {
                float f17 = com.tencent.mm.plugin.appbrand.widget.recent.w.f92074a;
                this.f92010r = false;
                this.f92008p = true;
                int c17 = c(0);
                this.f92007o = a(c17);
                int c18 = c(this.f92009q.t());
                this.f92004i = c18;
                com.tencent.mars.xlog.Log.i("ViewPagerHelper", "fastScroll curPage: %d, pos: %d, targetPage: %d, targetPos: %d", java.lang.Integer.valueOf(c18), 0, java.lang.Integer.valueOf(c17), java.lang.Integer.valueOf(this.f92007o));
                int i19 = this.f92004i;
                int i27 = this.f92007o;
                com.tencent.mm.plugin.appbrand.widget.recent.BaseAppBrandRecentView baseAppBrandRecentView2 = this.f91999d;
                if (baseAppBrandRecentView2 != null) {
                    this.f92003h.f12049a = i27;
                    this.f92015w = true;
                    baseAppBrandRecentView2.getLayoutManager().startSmoothScroll(this.f92003h);
                }
                d();
            } else {
                d();
            }
            if (this.f92015w) {
                com.tencent.mars.xlog.Log.i("ViewPagerHelper", "scrollBy x: -1, y: 0");
                this.f92015w = false;
                this.f91999d.scrollBy(-1, 0);
            }
        } else if (i17 == 1) {
            com.tencent.mars.xlog.Log.i("ViewPagerHelper", "SCROLL_STATE_DRAGGING");
            this.f92014v = true;
        }
        this.f92012t = i17;
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/recent/ViewPagerHelper", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/recent/ViewPagerHelper", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        this.f92000e += i17;
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/recent/ViewPagerHelper", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
