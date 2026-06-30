package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2217x5e9bb8;

/* renamed from: com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView */
/* loaded from: classes13.dex */
public class C18379xb7ff44a extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2217x5e9bb8.C18380xc0117007 {

    /* renamed from: y0, reason: collision with root package name */
    public static final /* synthetic */ int f251788y0 = 0;
    public int A;
    public boolean B;
    public final java.util.List C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public android.widget.AbsListView.OnScrollListener H;
    public ud4.k0 I;

    /* renamed from: J, reason: collision with root package name */
    public ud4.j0 f251789J;
    public android.widget.AdapterView.OnItemClickListener K;
    public final android.widget.AdapterView.OnItemClickListener L;
    public boolean M;
    public java.util.Stack N;
    public ud4.f0 P;
    public android.view.View Q;
    public boolean R;
    public final ud4.i0 S;
    public int T;
    public float U;
    public float V;
    public float W;

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.drawable.BitmapDrawable f251790d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Rect f251791e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Rect f251792f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Rect f251793g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Rect f251794h;

    /* renamed from: i, reason: collision with root package name */
    public float f251795i;

    /* renamed from: m, reason: collision with root package name */
    public int f251796m;

    /* renamed from: n, reason: collision with root package name */
    public int f251797n;

    /* renamed from: o, reason: collision with root package name */
    public float f251798o;

    /* renamed from: p, reason: collision with root package name */
    public float f251799p;

    /* renamed from: p0, reason: collision with root package name */
    public float f251800p0;

    /* renamed from: q, reason: collision with root package name */
    public int f251801q;

    /* renamed from: r, reason: collision with root package name */
    public int f251802r;

    /* renamed from: s, reason: collision with root package name */
    public int f251803s;

    /* renamed from: t, reason: collision with root package name */
    public int f251804t;

    /* renamed from: u, reason: collision with root package name */
    public int f251805u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.List f251806v;

    /* renamed from: w, reason: collision with root package name */
    public long f251807w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f251808x;

    /* renamed from: x0, reason: collision with root package name */
    public final android.widget.AbsListView.OnScrollListener f251809x0;

    /* renamed from: y, reason: collision with root package name */
    public int f251810y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f251811z;

    public C18379xb7ff44a(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f251795i = 1.0f;
        this.f251796m = 0;
        this.f251797n = 0;
        this.f251798o = 0.0f;
        this.f251799p = 0.0f;
        this.f251801q = -1;
        this.f251802r = -1;
        this.f251803s = -1;
        this.f251804t = -1;
        this.f251806v = new java.util.ArrayList();
        this.f251807w = -1L;
        this.f251808x = false;
        this.f251810y = -1;
        this.A = 0;
        this.B = false;
        this.C = new java.util.LinkedList();
        this.F = true;
        this.G = true;
        this.L = new ud4.w(this);
        this.R = false;
        this.S = new ud4.i0(this, null);
        this.T = -1;
        this.W = 0.0f;
        this.f251800p0 = 0.0f;
        this.f251809x0 = new ud4.v(this);
        r(context);
    }

    public static /* synthetic */ long b(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2217x5e9bb8.C18379xb7ff44a c18379xb7ff44a) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1000", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        long j17 = c18379xb7ff44a.f251807w;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1000", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        return j17;
    }

    public static void c(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2217x5e9bb8.C18379xb7ff44a c18379xb7ff44a, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1300", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        c18379xb7ff44a.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("animateReorder", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        boolean z17 = i18 > i17;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (z17) {
            int min = java.lang.Math.min(i17, i18);
            while (min < java.lang.Math.max(i17, i18)) {
                android.view.View o17 = c18379xb7ff44a.o(c18379xb7ff44a.m(min));
                int i19 = min + 1;
                if (i19 % c18379xb7ff44a.m71176xa6887a23() == 0) {
                    linkedList.add(c18379xb7ff44a.l(o17, (-o17.getWidth()) * (c18379xb7ff44a.m71176xa6887a23() - 1), 0.0f, o17.getHeight(), 0.0f));
                } else {
                    linkedList.add(c18379xb7ff44a.l(o17, o17.getWidth(), 0.0f, 0.0f, 0.0f));
                }
                min = i19;
            }
        } else {
            for (int max = java.lang.Math.max(i17, i18); max > java.lang.Math.min(i17, i18); max--) {
                android.view.View o18 = c18379xb7ff44a.o(c18379xb7ff44a.m(max));
                if ((c18379xb7ff44a.m71176xa6887a23() + max) % c18379xb7ff44a.m71176xa6887a23() == 0) {
                    linkedList.add(c18379xb7ff44a.l(o18, o18.getWidth() * (c18379xb7ff44a.m71176xa6887a23() - 1), 0.0f, -o18.getHeight(), 0.0f));
                } else {
                    linkedList.add(c18379xb7ff44a.l(o18, -o18.getWidth(), 0.0f, 0.0f, 0.0f));
                }
            }
        }
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(linkedList);
        animatorSet.setDuration(300L);
        animatorSet.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        animatorSet.addListener(new ud4.e0(c18379xb7ff44a));
        animatorSet.start();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("animateReorder", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1300", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    public static /* synthetic */ android.widget.AbsListView.OnScrollListener d(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2217x5e9bb8.C18379xb7ff44a c18379xb7ff44a) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1900", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        android.widget.AbsListView.OnScrollListener onScrollListener = c18379xb7ff44a.H;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1900", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        return onScrollListener;
    }

    public static /* synthetic */ boolean f(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2217x5e9bb8.C18379xb7ff44a c18379xb7ff44a, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$202", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        c18379xb7ff44a.D = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$202", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        return z17;
    }

    public static void g(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2217x5e9bb8.C18379xb7ff44a c18379xb7ff44a) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        c18379xb7ff44a.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateEnableState", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        c18379xb7ff44a.setEnabled((c18379xb7ff44a.D || c18379xb7ff44a.E) ? false : true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateEnableState", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    /* renamed from: getAdapterInterface */
    private ud4.i m71175xc1049a20() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdapterInterface", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        ud4.i iVar = (ud4.i) getAdapter();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdapterInterface", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        return iVar;
    }

    /* renamed from: getColumnCount */
    private int m71176xa6887a23() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getColumnCount", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        ud4.b bVar = (ud4.b) m71175xc1049a20();
        bVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getColumnCount", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getColumnCount", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getColumnCount", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        return bVar.f508216h;
    }

    public static /* synthetic */ android.view.View h(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2217x5e9bb8.C18379xb7ff44a c18379xb7ff44a) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$900", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        android.view.View view = c18379xb7ff44a.Q;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$900", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        return view;
    }

    public static boolean t() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isPreLollipop", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isPreLollipop", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A() {
        /*
            Method dump skipped, instructions count: 583
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2217x5e9bb8.C18379xb7ff44a.A():void");
    }

    public final void B(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateNeighborViewsForId", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        java.util.List list = this.f251806v;
        ((java.util.ArrayList) list).clear();
        int n17 = n(j17);
        for (int firstVisiblePosition = getFirstVisiblePosition(); firstVisiblePosition <= getLastVisiblePosition(); firstVisiblePosition++) {
            if (n17 != firstVisiblePosition && ((ud4.h) m71175xc1049a20()).f(firstVisiblePosition)) {
                ((java.util.ArrayList) list).add(java.lang.Long.valueOf(m(firstVisiblePosition)));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateNeighborViewsForId", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dispatchDraw", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        super.dispatchDraw(canvas);
        android.graphics.drawable.BitmapDrawable bitmapDrawable = this.f251790d;
        if (bitmapDrawable != null) {
            bitmapDrawable.setAlpha((int) (this.f251795i * 255.0f));
            this.f251790d.draw(canvas);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dispatchDraw", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    public final void i(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("animateWobble", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        android.animation.ObjectAnimator k17 = k(view);
        k17.setFloatValues(-2.0f, 2.0f);
        k17.start();
        ((java.util.LinkedList) this.C).add(k17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("animateWobble", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    public final void j(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("animateWobbleInverse", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        android.animation.ObjectAnimator k17 = k(view);
        k17.setFloatValues(2.0f, -2.0f);
        k17.start();
        ((java.util.LinkedList) this.C).add(k17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("animateWobbleInverse", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    public final android.animation.ObjectAnimator k(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createBaseWobble", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        t();
        view.setLayerType(1, null);
        android.animation.ObjectAnimator objectAnimator = new android.animation.ObjectAnimator();
        objectAnimator.setDuration(180L);
        objectAnimator.setRepeatMode(2);
        objectAnimator.setRepeatCount(-1);
        objectAnimator.setPropertyName("rotation");
        objectAnimator.setTarget(view);
        objectAnimator.addListener(new ud4.x(this, view));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createBaseWobble", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        return objectAnimator;
    }

    public final android.animation.AnimatorSet l(android.view.View view, float f17, float f18, float f19, float f27) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createTranslationAnimations", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "translationX", f17, f18);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(view, "translationY", f19, f27);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createTranslationAnimations", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        return animatorSet;
    }

    public final long m(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getId", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        long itemId = getAdapter().getItemId(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getId", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        return itemId;
    }

    public int n(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPositionForID", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        android.view.View o17 = o(j17);
        if (o17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPositionForID", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            return -1;
        }
        int positionForView = getPositionForView(o17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPositionForID", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        return positionForView;
    }

    public android.view.View o(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getViewForId", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        int firstVisiblePosition = getFirstVisiblePosition();
        android.widget.ListAdapter adapter = getAdapter();
        for (int i17 = 0; i17 < getChildCount(); i17++) {
            android.view.View childAt = getChildAt(i17);
            if (adapter.getItemId(firstVisiblePosition + i17) == j17) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getViewForId", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                return childAt;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getViewForId", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        return null;
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DynamicGridView", "onInterceptTouchEvent " + motionEvent.getAction() + " " + onInterceptTouchEvent);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        return onInterceptTouchEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        ud4.f0 f0Var;
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTouchEvent", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        if (this.R) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouchEvent", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            return onTouchEvent;
        }
        int findPointerIndex = motionEvent.findPointerIndex(this.f251810y);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DynamicGridView", "onTouchEvent " + motionEvent.getAction());
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.U = motionEvent.getX();
            this.V = motionEvent.getY();
            float x17 = motionEvent.getX();
            float y17 = motionEvent.getY();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("findChildViewPosUnderWithoutTranslation", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridUtils");
            int childCount = getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findChildViewPosUnderWithoutTranslation", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridUtils");
                    childCount = -1;
                    break;
                }
                if (ud4.u.a(getChildAt(childCount), x17, y17)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findChildViewPosUnderWithoutTranslation", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridUtils");
                    break;
                }
                childCount--;
            }
            this.T = childCount;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DynamicGridView", "onTouchEvent " + motionEvent.getAction() + ",downPos " + this.T);
            if (!this.D && this.T >= 0) {
                ud4.i0 i0Var = this.S;
                i0Var.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startDetectLongPress", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$MyHandler");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stopDetectLongPress", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$MyHandler");
                i0Var.removeMessages(1);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stopDetectLongPress", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$MyHandler");
                i0Var.sendEmptyMessageDelayed(1, 300L);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startDetectLongPress", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$MyHandler");
            }
            this.f251803s = -1;
            this.f251804t = -1;
            this.f251801q = (int) motionEvent.getX();
            this.f251802r = (int) motionEvent.getY();
            this.W = motionEvent.getRawX();
            this.f251800p0 = motionEvent.getRawY();
            this.f251810y = motionEvent.getPointerId(0);
            if (this.B && isEnabled()) {
                layoutChildren();
                w(pointToPosition(this.f251801q, this.f251802r));
            } else if (!isEnabled()) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouchEvent", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                return false;
            }
        } else if (action == 1) {
            A();
            if (this.M && (f0Var = this.P) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTransitions", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$DynamicGridModification");
                java.util.List list = f0Var.f508230a;
                java.util.Collections.reverse(list);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTransitions", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$DynamicGridModification");
                if (!list.isEmpty()) {
                    this.N.push(this.P);
                    this.P = new ud4.f0();
                }
            }
        } else if (action == 2) {
            this.U = motionEvent.getX();
            this.V = motionEvent.getY();
            if (this.f251808x && this.f251810y != -1 && findPointerIndex != -1) {
                if (this.f251804t != -1 || this.f251803s != -1) {
                    if (this.W > 0.0f && this.f251800p0 > 0.0f) {
                        this.f251798o = motionEvent.getRawX() - this.W;
                        this.f251799p = motionEvent.getRawY() - this.f251800p0;
                    }
                    this.f251803s = (int) motionEvent.getY(findPointerIndex);
                    int x18 = (int) motionEvent.getX(findPointerIndex);
                    this.f251804t = x18;
                    int i17 = this.f251803s - this.f251802r;
                    int i18 = x18 - this.f251801q;
                    android.graphics.Rect rect = this.f251791e;
                    android.graphics.Rect rect2 = this.f251793g;
                    rect.offsetTo(rect2.left + i18 + this.f251797n, rect2.top + i17 + this.f251796m);
                    android.graphics.drawable.BitmapDrawable bitmapDrawable = this.f251790d;
                    if (bitmapDrawable != null) {
                        bitmapDrawable.setBounds(this.f251791e);
                    }
                    invalidate();
                    p();
                    this.f251811z = false;
                    q();
                    if (this.f251789J != null) {
                        android.graphics.Rect rect3 = new android.graphics.Rect(this.f251794h);
                        rect3.offset((int) this.f251798o, (int) this.f251799p);
                        motionEvent.getRawY();
                        ud4.l lVar = (ud4.l) this.f251789J;
                        lVar.getClass();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDragging", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView$1");
                        boolean a17 = lVar.a(rect3);
                        ud4.t tVar = lVar.f508253c;
                        if (a17) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
                            tVar.getClass();
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("highlightDelArea", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
                            android.view.View view = tVar.f508271g;
                            android.graphics.drawable.Drawable background = view.getBackground();
                            android.content.Context context = tVar.f508265a;
                            if (background != null) {
                                view.getBackground().setColorFilter(b3.l.m9702x7444d5ad(context, com.p314xaae8f345.mm.R.C30859x5a72f63.ahd), android.graphics.PorterDuff.Mode.SRC_ATOP);
                            }
                            android.graphics.drawable.Drawable m9707x4a96be14 = b3.l.m9707x4a96be14(context, com.p314xaae8f345.mm.R.raw.f81254xd098199);
                            if (m9707x4a96be14 != null) {
                                m9707x4a96be14.mutate();
                                m9707x4a96be14.setColorFilter(-1, android.graphics.PorterDuff.Mode.SRC_IN);
                            }
                            tVar.f508272h.setImageDrawable(m9707x4a96be14);
                            tVar.f508273i.setText(com.p314xaae8f345.mm.R.C30867xcad56011.jcg);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("highlightDelArea", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
                            boolean z18 = tVar.f508278n;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
                            if (!z18) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$202", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
                                tVar.f508278n = true;
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$202", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
                                ca4.z0.I0(new long[]{0, 10});
                            }
                            z17 = false;
                        } else {
                            ud4.t.a(tVar);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$202", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
                            z17 = false;
                            tVar.f508278n = false;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$202", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDragging", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView$1");
                    } else {
                        z17 = false;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouchEvent", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                    return z17;
                }
                this.f251803s = (int) motionEvent.getY(findPointerIndex);
                int x19 = (int) motionEvent.getX(findPointerIndex);
                this.f251804t = x19;
                this.f251801q = x19;
                this.f251802r = this.f251803s;
            }
        } else if (action == 3) {
            z();
            A();
        } else if (action == 6 && motionEvent.getPointerId((motionEvent.getAction() & 65280) >> 8) == this.f251810y) {
            A();
        }
        boolean onTouchEvent2 = super.onTouchEvent(motionEvent);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouchEvent", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        return onTouchEvent2;
    }

    public final void p() {
        int i17;
        java.util.Iterator it;
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleCellSwitch", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        int i18 = this.f251803s - this.f251802r;
        int i19 = this.f251804t - this.f251801q;
        int centerY = this.f251792f.centerY() + this.f251796m + i18;
        int centerX = this.f251792f.centerX() + this.f251797n + i19;
        android.view.View o17 = o(this.f251807w);
        this.Q = o17;
        if (o17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleCellSwitch", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            return;
        }
        java.lang.String str2 = "getColumnAndRowForView";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getColumnAndRowForView", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        int positionForView = getPositionForView(o17);
        int m71176xa6887a23 = m71176xa6887a23();
        android.graphics.Point point = new android.graphics.Point(positionForView % m71176xa6887a23, positionForView / m71176xa6887a23);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getColumnAndRowForView", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        java.util.Iterator it6 = ((java.util.ArrayList) this.f251806v).iterator();
        float f17 = 0.0f;
        android.view.View view = null;
        float f18 = 0.0f;
        while (it6.hasNext()) {
            android.view.View o18 = o(((java.lang.Long) it6.next()).longValue());
            if (o18 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(str2, "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                int positionForView2 = getPositionForView(o18);
                int m71176xa6887a232 = m71176xa6887a23();
                it = it6;
                android.graphics.Point point2 = new android.graphics.Point(positionForView2 % m71176xa6887a232, positionForView2 / m71176xa6887a232);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("aboveRight", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                str = str2;
                boolean z17 = point2.y < point.y && point2.x > point.x;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("aboveRight", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                if (!z17 || centerY >= o18.getBottom() || centerX <= o18.getLeft()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("aboveLeft", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                    boolean z18 = point2.y < point.y && point2.x < point.x;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("aboveLeft", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                    if (!z18 || centerY >= o18.getBottom() || centerX >= o18.getRight()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("belowRight", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                        boolean z19 = point2.y > point.y && point2.x > point.x;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("belowRight", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                        if (!z19 || centerY <= o18.getTop() || centerX <= o18.getLeft()) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("belowLeft", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                            boolean z27 = point2.y > point.y && point2.x < point.x;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("belowLeft", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                            if (!z27 || centerY <= o18.getTop() || centerX >= o18.getRight()) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("above", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                                boolean z28 = point2.y < point.y && point2.x == point.x;
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("above", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                                if (!z28 || centerY >= o18.getBottom() - this.f251805u) {
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("below", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                                    boolean z29 = point2.y > point.y && point2.x == point.x;
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("below", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                                    if (!z29 || centerY <= o18.getTop() + this.f251805u) {
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("right", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                                        boolean z37 = point2.y == point.y && point2.x > point.x;
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("right", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                                        if (!z37 || centerX <= o18.getLeft() + this.f251805u) {
                                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("left", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                                            boolean z38 = point2.y == point.y && point2.x < point.x;
                                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("left", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                                            if (!z38 || centerX >= o18.getRight() - this.f251805u) {
                                                i17 = centerY;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getViewX", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridUtils");
                float abs = java.lang.Math.abs((o18.getRight() - o18.getLeft()) / 2);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getViewX", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridUtils");
                android.view.View view2 = this.Q;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getViewX", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridUtils");
                float abs2 = java.lang.Math.abs((view2.getRight() - view2.getLeft()) / 2);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getViewX", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridUtils");
                float abs3 = java.lang.Math.abs(abs - abs2);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getViewY", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridUtils");
                float abs4 = java.lang.Math.abs((o18.getBottom() - o18.getTop()) / 2);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getViewY", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridUtils");
                i17 = centerY;
                android.view.View view3 = this.Q;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getViewY", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridUtils");
                float abs5 = java.lang.Math.abs((view3.getBottom() - view3.getTop()) / 2);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getViewY", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridUtils");
                float abs6 = java.lang.Math.abs(abs4 - abs5);
                if (abs3 >= f17 && abs6 >= f18) {
                    f18 = abs6;
                    f17 = abs3;
                    view = o18;
                }
            } else {
                i17 = centerY;
                it = it6;
                str = str2;
            }
            it6 = it;
            str2 = str;
            centerY = i17;
        }
        if (view != null) {
            int positionForView3 = getPositionForView(this.Q);
            int positionForView4 = getPositionForView(view);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DynamicGridView", "switch " + positionForView3 + "," + positionForView4);
            ud4.i m71175xc1049a20 = m71175xc1049a20();
            if (positionForView4 != -1) {
                ud4.h hVar = (ud4.h) m71175xc1049a20;
                if (hVar.f(positionForView3) && hVar.f(positionForView4)) {
                    u(positionForView3, positionForView4);
                    if (this.M) {
                        this.P.a(positionForView3, positionForView4);
                    }
                    this.f251802r = this.f251803s;
                    this.f251801q = this.f251804t;
                    s();
                    t();
                    t();
                    ud4.h0 h0Var = new ud4.h0(this, i19, i18);
                    B(this.f251807w);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("animateSwitchCell", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$LSwitchCellAnimator");
                    getViewTreeObserver().addOnPreDrawListener(new ud4.g0(h0Var, positionForView3, positionForView4));
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("animateSwitchCell", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$LSwitchCellAnimator");
                }
            }
            B(this.f251807w);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleCellSwitch", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleCellSwitch", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    public final void q() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleMobileCellScroll", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        android.graphics.Rect rect = this.f251791e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleMobileCellScroll", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        int computeVerticalScrollOffset = computeVerticalScrollOffset();
        int height = getHeight();
        int computeVerticalScrollExtent = computeVerticalScrollExtent();
        int computeVerticalScrollRange = computeVerticalScrollRange();
        int i17 = rect.top;
        int height2 = rect.height();
        boolean z17 = true;
        if (i17 <= 0 && computeVerticalScrollOffset > 0) {
            smoothScrollBy(-this.A, 0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleMobileCellScroll", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        } else if (i17 + height2 < height || computeVerticalScrollOffset + computeVerticalScrollExtent >= computeVerticalScrollRange) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleMobileCellScroll", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            z17 = false;
        } else {
            smoothScrollBy(this.A, 0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleMobileCellScroll", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        }
        this.f251811z = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleMobileCellScroll", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    public void r(android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        super.setOnScrollListener(this.f251809x0);
        this.A = (int) ((context.getResources().getDisplayMetrics().density * 8.0f) + 0.5f);
        this.f251805u = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561833tx);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    public final boolean s() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isPostHoneycomb", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isPostHoneycomb", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        return true;
    }

    @Override // android.widget.AdapterView
    public /* bridge */ /* synthetic */ void setAdapter(android.widget.ListAdapter listAdapter) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setAdapter", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        setAdapter2(listAdapter);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAdapter", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    /* renamed from: setEditModeEnabled */
    public void m71177xb824b6f2(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setEditModeEnabled", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        this.G = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setEditModeEnabled", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    /* renamed from: setHoverAlpha */
    public void m71178x2ad66384(float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setHoverAlpha", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        this.f251795i = f17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setHoverAlpha", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    /* renamed from: setNeedBanTouch */
    public void m71179x835328a8(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setNeedBanTouch", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        this.R = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setNeedBanTouch", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    /* renamed from: setOnDragListener */
    public void m71180x680a289(ud4.j0 j0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnDragListener", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        this.f251789J = j0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnDragListener", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    /* renamed from: setOnDropListener */
    public void m71181x98ecb944(ud4.k0 k0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnDropListener", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        this.I = k0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnDropListener", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    /* renamed from: setOnEditModeChangeListener */
    public void m71182x13c8c7f2(ud4.l0 l0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnEditModeChangeListener", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnEditModeChangeListener", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    @Override // android.widget.AdapterView
    public void setOnItemClickListener(android.widget.AdapterView.OnItemClickListener onItemClickListener) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnItemClickListener", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        this.K = onItemClickListener;
        super.setOnItemClickListener(this.L);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnItemClickListener", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    @Override // android.widget.AbsListView
    public void setOnScrollListener(android.widget.AbsListView.OnScrollListener onScrollListener) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnScrollListener", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        this.H = onScrollListener;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnScrollListener", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    /* renamed from: setOnSelectedItemBitmapCreationListener */
    public void m71183xd961b3b1(ud4.m0 m0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnSelectedItemBitmapCreationListener", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnSelectedItemBitmapCreationListener", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    /* renamed from: setUndoSupportEnabled */
    public void m71184x3823678(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setUndoSupportEnabled", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        if (this.M != z17) {
            if (z17) {
                this.N = new java.util.Stack();
            } else {
                this.N = null;
            }
        }
        this.M = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setUndoSupportEnabled", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    /* renamed from: setWobbleInEditMode */
    public void m71185xa0af8705(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setWobbleInEditMode", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        this.F = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setWobbleInEditMode", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    public final void u(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reorderElements", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        ud4.j0 j0Var = this.f251789J;
        if (j0Var != null) {
            ((ud4.l) j0Var).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDragPositionsChanged", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView$1");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDragPositionsChanged", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView$1");
        }
        ud4.h hVar = (ud4.h) m71175xc1049a20();
        hVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reorderItems", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reorderItems", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
        if (i18 < hVar.getCount()) {
            java.util.ArrayList arrayList = hVar.f508215g;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reorder", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridUtils");
            arrayList.add(i18, arrayList.remove(i17));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reorder", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridUtils");
            hVar.notifyDataSetChanged();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reorderItems", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
        ud4.d dVar = hVar.f508243r;
        if (dVar != null) {
            dVar.a(hVar.k(i17), hVar.k(i18));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reorderItems", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reorderElements", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    public final void v(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reset", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DynamicGridView", "reseting");
        ((java.util.ArrayList) this.f251806v).clear();
        this.f251807w = -1L;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridView", "reset", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridView", "reset", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f251790d = null;
        s();
        if (this.F) {
            if (this.B) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("restartWobble", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                y(false);
                x();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("restartWobble", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            } else {
                y(true);
            }
        }
        for (int i17 = 0; i17 < getLastVisiblePosition() - getFirstVisiblePosition(); i17++) {
            android.view.View childAt = getChildAt(i17);
            if (childAt != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(childAt, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridView", "reset", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                childAt.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(childAt, "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridView", "reset", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        invalidate();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reset", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    public final boolean w(int i17) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startDragAtPosition", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        ud4.h hVar = (ud4.h) m71175xc1049a20();
        hVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("canDrag", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        if (i17 < hVar.j()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("canDrag", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
            z17 = false;
        } else if (hVar.f508240o) {
            z17 = i17 != hVar.getCount() - 1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("canDrag", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("canDrag", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("canDrag", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("canDrag", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
            z17 = true;
        }
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startDragAtPosition", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            return false;
        }
        this.f251796m = 0;
        this.f251797n = 0;
        this.f251798o = 0.0f;
        this.f251799p = 0.0f;
        android.view.View childAt = getChildAt(i17 - getFirstVisiblePosition());
        if (childAt == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startDragAtPosition", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            return false;
        }
        this.f251807w = getAdapter().getItemId(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DynamicGridView", "startDragAtPosition: view pos=%d, mMobileItemId=%s", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(this.f251807w));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAndAddHoverView", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        int width = childAt.getWidth();
        int height = childAt.getHeight();
        int top = childAt.getTop();
        int left = childAt.getLeft();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBitmapFromView", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        int width2 = childAt.getWidth();
        int height2 = childAt.getHeight();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(height2));
        arrayList.add(java.lang.Integer.valueOf(width2));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridView", "getBitmapFromView", "(Landroid/view/View;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridView", "getBitmapFromView", "(Landroid/view/View;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        childAt.draw(new android.graphics.Canvas(createBitmap));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBitmapFromView", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(getResources(), createBitmap);
        this.f251792f = new android.graphics.Rect(left, top, left + width, top + height);
        android.graphics.Rect rect = this.f251792f;
        int i18 = (int) (width * 0.05f);
        int i19 = (int) (height * 0.05f);
        this.f251791e = new android.graphics.Rect(rect.left - i18, rect.top - i19, rect.right + i18, rect.bottom + i19);
        this.f251793g = new android.graphics.Rect(this.f251791e);
        bitmapDrawable.setBounds(this.f251792f);
        android.graphics.Rect r17 = pm0.v.r(childAt);
        this.f251794h = r17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DynamicGridView", "getAndAddHoverView: mDraggingViewOriginBounds:%s", r17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAndAddHoverView", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        this.f251790d = bitmapDrawable;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("animateBounds", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        android.animation.ObjectAnimator ofObject = android.animation.ObjectAnimator.ofObject(this.f251790d, "bounds", new ud4.y(this), this.f251791e);
        ofObject.addUpdateListener(new ud4.z(this));
        ofObject.addListener(new ud4.a0(this));
        ofObject.setDuration(10L);
        ofObject.start();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("animateBounds", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        s();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(4);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(childAt, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridView", "startDragAtPosition", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        childAt.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(childAt, "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridView", "startDragAtPosition", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        B(this.f251807w);
        ud4.j0 j0Var = this.f251789J;
        if (j0Var != null) {
            ud4.l lVar = (ud4.l) j0Var;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDragStarted", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView$1");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DynamicGrid", "drag started at position " + i17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2217x5e9bb8.C18379xb7ff44a c18379xb7ff44a = lVar.f508251a;
            float elevation = c18379xb7ff44a.getElevation();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$002", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
            ud4.t tVar = lVar.f508253c;
            tVar.f508270f = elevation;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$002", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
            c18379xb7ff44a.setElevation(100.0f);
            c18379xb7ff44a.m71178x2ad66384(0.9f);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("animateShowDelArea", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
            android.view.View view = tVar.f508271g;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridPreviewImgView", "animateShowDelArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridPreviewImgView", "animateShowDelArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(tVar.f508271g, "translationY", r8.getHeight(), 0.0f);
            ofFloat.setDuration(200L);
            ofFloat.start();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("animateShowDelArea", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
            android.view.View view2 = lVar.f508252b;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridPreviewImgView$1", "onDragStarted", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridPreviewImgView$1", "onDragStarted", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$202", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
            tVar.f508278n = false;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$202", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDragStarted", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView$1");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startDragAtPosition", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        return true;
    }

    public final void x() {
        java.lang.Boolean bool;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startWobbleAnimation", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        for (int i17 = 0; i17 < getChildCount(); i17++) {
            android.view.View childAt = getChildAt(i17);
            if (childAt != null && (bool = java.lang.Boolean.TRUE) != childAt.getTag(com.p314xaae8f345.mm.R.id.cxa)) {
                if (i17 % 2 == 0) {
                    i(childAt);
                } else {
                    j(childAt);
                }
                childAt.setTag(com.p314xaae8f345.mm.R.id.cxa, bool);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startWobbleAnimation", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    public final void y(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stopWobble", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        java.util.List list = this.C;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((android.animation.Animator) it.next()).cancel();
        }
        list.clear();
        for (int i17 = 0; i17 < getChildCount(); i17++) {
            android.view.View childAt = getChildAt(i17);
            if (childAt != null) {
                if (z17) {
                    childAt.setRotation(0.0f);
                }
                childAt.setTag(com.p314xaae8f345.mm.R.id.cxa, java.lang.Boolean.FALSE);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stopWobble", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    public final void z() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("touchEventsCancelled", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        android.view.View o17 = o(this.f251807w);
        if (o17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("touchEventsCancelled", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            return;
        }
        if (this.f251808x) {
            v(o17);
        }
        this.f251808x = false;
        this.f251811z = false;
        this.f251810y = -1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("touchEventsCancelled", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    @Override // android.widget.GridView, android.widget.AbsListView
    /* renamed from: setAdapter, reason: avoid collision after fix types in other method */
    public void setAdapter2(android.widget.ListAdapter listAdapter) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setAdapter", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        super.setAdapter(listAdapter);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAdapter", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    public C18379xb7ff44a(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f251795i = 1.0f;
        this.f251796m = 0;
        this.f251797n = 0;
        this.f251798o = 0.0f;
        this.f251799p = 0.0f;
        this.f251801q = -1;
        this.f251802r = -1;
        this.f251803s = -1;
        this.f251804t = -1;
        this.f251806v = new java.util.ArrayList();
        this.f251807w = -1L;
        this.f251808x = false;
        this.f251810y = -1;
        this.A = 0;
        this.B = false;
        this.C = new java.util.LinkedList();
        this.F = true;
        this.G = true;
        this.L = new ud4.w(this);
        this.R = false;
        this.S = new ud4.i0(this, null);
        this.T = -1;
        this.W = 0.0f;
        this.f251800p0 = 0.0f;
        this.f251809x0 = new ud4.v(this);
        r(context);
    }
}
