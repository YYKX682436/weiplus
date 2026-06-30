package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5;

/* loaded from: classes7.dex */
public class m1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f220753d;

    /* renamed from: e, reason: collision with root package name */
    public int f220754e;

    /* renamed from: f, reason: collision with root package name */
    public int f220755f;

    /* renamed from: g, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.g3 f220756g;

    /* renamed from: h, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.g3 f220757h;

    /* renamed from: m, reason: collision with root package name */
    public int f220759m;

    /* renamed from: q, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de f220763q;

    /* renamed from: s, reason: collision with root package name */
    public final int f220765s;

    /* renamed from: i, reason: collision with root package name */
    public int f220758i = 0;

    /* renamed from: n, reason: collision with root package name */
    public final float f220760n = android.view.ViewConfiguration.get(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getScaledTouchSlop();

    /* renamed from: o, reason: collision with root package name */
    public int f220761o = -1;

    /* renamed from: p, reason: collision with root package name */
    public boolean f220762p = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f220764r = false;

    /* renamed from: t, reason: collision with root package name */
    public int f220766t = 0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f220767u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f220768v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f220769w = false;

    public m1(int i17) {
        this.f220765s = i17;
    }

    public final int a(int i17) {
        int i18 = this.f220758i;
        float width = this.f220753d.getWidth();
        int i19 = this.f220758i;
        int i27 = i17 - this.f220755f;
        float f17 = i27;
        float f18 = width / 2.0f;
        int i28 = this.f220765s;
        if (f17 >= f18) {
            i18 = b(this.f220763q.y());
        } else {
            if (i27 >= 0 && f17 < this.f220760n) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.CommonLineViewPagerHelper", "[getOffsetToPosition] targetPage: %s targetPos: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i18 == 0 ? 0 : (this.f220759m * i18) + i28));
                if (i18 == 0) {
                    return 0;
                }
                return (i18 * this.f220759m) + i28;
            }
            if (f17 <= (-width) / 2.0f) {
                i18 = b(this.f220763q.w());
            }
        }
        int mo1894x7e414b06 = this.f220753d.mo7946xf939df19().mo1894x7e414b06();
        int i29 = this.f220759m;
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.CommonLineViewPagerHelper", "[getOffsetToPosition] lastPage: %d, targetPage: %d targetPos: %d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(max), java.lang.Integer.valueOf(max == 0 ? 0 : (this.f220759m * max) + 1));
        if (max == 0) {
            return 0;
        }
        return (max * this.f220759m) + i28;
    }

    public int b(int i17) {
        if (this.f220765s == 0) {
            return i17 / this.f220759m;
        }
        int i18 = this.f220759m;
        int i19 = i17 / i18;
        return (i17 % i18 != 0 || i17 == 0) ? i19 : i19 - 1;
    }

    public final void c() {
        if (this.f220762p) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.CommonLineViewPagerHelper", "onScrollAnimationEnd");
            this.f220762p = false;
            this.f220764r = false;
            this.f220761o = -1;
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
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/view/CommonLineViewPagerHelper", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.CommonLineViewPagerHelper", "onScrollStateChanged newState: %d", java.lang.Integer.valueOf(i17));
        if (i17 == 0 && this.f220766t != 2) {
            int a17 = a(this.f220754e);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f220753d;
            if (c1163xf1deaba42 != null && this.f220768v) {
                this.f220756g.f93582a = a17;
                this.f220769w = true;
                c1163xf1deaba42.getLayoutManager().m8099x6305639d(this.f220756g);
            }
            this.f220767u = true;
        } else if (!this.f220767u && i17 == 2) {
            this.f220767u = true;
        } else if (i17 == 0) {
            this.f220755f = this.f220754e;
            this.f220767u = false;
            int w17 = this.f220763q.w();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.CommonLineViewPagerHelper", "onScrollStateChanged firstPos: %d", java.lang.Integer.valueOf(w17));
            if (w17 != -1) {
                int i18 = w17 / this.f220759m;
                this.f220758i = i18;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.CommonLineViewPagerHelper", "onScrollStateChanged mCurPage: %d, firstVisible: %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(w17));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("GameChatRoom.CommonLineViewPagerHelper", "onScrollStateChanged firstPos is -1, invalid, mCurPage: %d", java.lang.Integer.valueOf(this.f220758i));
            }
            this.f220768v = false;
            if (this.f220764r) {
                this.f220753d.mo7946xf939df19().m8151xc67946d3(this.f220753d.mo7946xf939df19().mo1894x7e414b06(), 5);
                this.f220764r = false;
                int mo1894x7e414b06 = this.f220753d.mo7946xf939df19().mo1894x7e414b06();
                int i19 = this.f220759m;
                int i27 = mo1894x7e414b06 / i19;
                if (mo1894x7e414b06 % i19 == 0) {
                    i27++;
                }
                int i28 = i27 + 1;
                int i29 = i19 * i28;
                if (i29 <= 0) {
                    i29 = 0;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.CommonLineViewPagerHelper", "smoothScrollToLastPage allCount: %d, lastPage: %d, targetPos: %d", java.lang.Integer.valueOf(mo1894x7e414b06), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29));
                this.f220762p = true;
                int b17 = b(i29);
                this.f220761o = b17 == 0 ? 0 : (this.f220759m * b17) + 1;
                int b18 = b(this.f220763q.t());
                this.f220758i = b18;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.CommonLineViewPagerHelper", "fastScroll curPage: %d, pos: %d, targetPage: %d, targetPos: %d", java.lang.Integer.valueOf(b18), java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(b17), java.lang.Integer.valueOf(this.f220761o));
                if (b17 == this.f220758i) {
                    c();
                } else {
                    int i37 = this.f220761o;
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = this.f220753d;
                    if (c1163xf1deaba43 != null) {
                        boolean z17 = this.f220768v;
                        this.f220757h.f93582a = i37;
                        this.f220769w = true;
                        c1163xf1deaba43.getLayoutManager().m8099x6305639d(this.f220757h);
                    }
                }
            } else {
                c();
            }
            if (this.f220769w) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.CommonLineViewPagerHelper", "scrollBy x: -1, y: 0");
                this.f220769w = false;
                this.f220753d.scrollBy(-1, 0);
            }
        } else if (i17 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.CommonLineViewPagerHelper", "SCROLL_STATE_DRAGGING");
            this.f220768v = true;
        }
        this.f220766t = i17;
        yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/view/CommonLineViewPagerHelper", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
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
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/view/CommonLineViewPagerHelper", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        this.f220754e += i17;
        yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/view/CommonLineViewPagerHelper", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
