package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5;

/* renamed from: com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer */
/* loaded from: classes13.dex */
public class C26118xa74407c<T extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26110x1f5a1c0d> implements com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.InterfaceC26117xa1cd4bd<T> {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f296999a = true;

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f297000b = false;

    /* renamed from: c, reason: collision with root package name */
    public static final android.animation.TimeInterpolator f297001c = new android.view.animation.DecelerateInterpolator();

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7 f297002d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.ui.C26120xc54a63a f297003e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.C26111x2ace1473<T> f297004f;

    /* renamed from: g, reason: collision with root package name */
    public final float f297005g;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.drawable.ShapeDrawable f297007i;

    /* renamed from: l, reason: collision with root package name */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.MarkerCache<T> f297010l;

    /* renamed from: n, reason: collision with root package name */
    public java.util.Set<? extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26109x9733a9da<T>> f297012n;

    /* renamed from: r, reason: collision with root package name */
    public float f297016r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c<T>.ViewModifier f297017s;

    /* renamed from: sideLength */
    public double f49864x874d671d;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.C26111x2ace1473.OnClusterClickListener<T> f297018t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.C26111x2ace1473.OnClusterInfoWindowClickListener<T> f297019u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.C26111x2ace1473.ClusterInfoWindowAdapter<T> f297020v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.C26111x2ace1473.OnClusterItemClickListener<T> f297021w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.C26111x2ace1473.OnClusterItemInfoWindowClickListener<T> f297022x;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.C26111x2ace1473.ClusterItemInfoWindowAdapter<T> f297023y;

    /* renamed from: h, reason: collision with root package name */
    public int[] f297006h = {10, 20, 50, 100, 200, 500, 1000};

    /* renamed from: j, reason: collision with root package name */
    public java.util.Set<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.MarkerWithPosition> f297008j = java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap());

    /* renamed from: k, reason: collision with root package name */
    public android.util.SparseArray<com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4392x4177761e> f297009k = new android.util.SparseArray<>();

    /* renamed from: m, reason: collision with root package name */
    public int f297011m = 4;

    /* renamed from: o, reason: collision with root package name */
    public boolean f297013o = true;

    /* renamed from: p, reason: collision with root package name */
    public java.util.Map<com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26109x9733a9da<T>> f297014p = new java.util.HashMap();

    /* renamed from: q, reason: collision with root package name */
    public java.util.Map<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26109x9733a9da<T>, com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a> f297015q = new java.util.HashMap();

    /* renamed from: com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer$AnimationTask */
    /* loaded from: classes13.dex */
    public class AnimationTask extends android.animation.AnimatorListenerAdapter implements android.animation.ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.MarkerWithPosition f297030a;

        /* renamed from: b, reason: collision with root package name */
        public final com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a f297031b;

        /* renamed from: c, reason: collision with root package name */
        public final com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 f297032c;

        /* renamed from: d, reason: collision with root package name */
        public final com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 f297033d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f297034e;

        /* renamed from: f, reason: collision with root package name */
        public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.C26106x6689edf3 f297035f;

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            if (this.f297034e) {
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.this.f297015q.remove((com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26109x9733a9da) com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.this.f297014p.get(this.f297031b));
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.this.f297010l.m100197xc84af884(this.f297031b);
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.this.f297014p.remove(this.f297031b);
                this.f297035f.a(this.f297031b);
            }
            this.f297030a.f297053b = this.f297033d;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
            double animatedFraction = valueAnimator.getAnimatedFraction();
            double m37195x2605e9e2 = ((this.f297033d.m37195x2605e9e2() - this.f297032c.m37195x2605e9e2()) * animatedFraction) + this.f297032c.m37195x2605e9e2();
            double m37196x79d7af9 = this.f297033d.m37196x79d7af9() - this.f297032c.m37196x79d7af9();
            if (java.lang.Math.abs(m37196x79d7af9) > 180.0d) {
                m37196x79d7af9 -= java.lang.Math.signum(m37196x79d7af9) * 360.0d;
            }
            this.f297031b.mo37260xa32537ab(new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26(m37195x2605e9e2, (m37196x79d7af9 * animatedFraction) + this.f297032c.m37196x79d7af9()));
        }

        /* renamed from: perform */
        public void m100195xd789e761() {
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setInterpolator(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.f297001c);
            ofFloat.addUpdateListener(this);
            ofFloat.addListener(this);
            ofFloat.start();
        }

        /* renamed from: removeOnAnimationComplete */
        public void m100196x3265119a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.C26106x6689edf3 c26106x6689edf3) {
            this.f297035f = c26106x6689edf3;
            this.f297034e = true;
        }

        public AnimationTask(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.MarkerWithPosition markerWithPosition, com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 c4406x873d1d26, com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 c4406x873d1d262) {
            this.f297030a = markerWithPosition;
            this.f297031b = markerWithPosition.f297052a;
            this.f297032c = c4406x873d1d26;
            this.f297033d = c4406x873d1d262;
        }
    }

    /* renamed from: com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer$CreateMarkerTask */
    /* loaded from: classes13.dex */
    public class CreateMarkerTask {

        /* renamed from: a, reason: collision with root package name */
        public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26109x9733a9da<T> f297037a;

        /* renamed from: b, reason: collision with root package name */
        public final java.util.Set<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.MarkerWithPosition> f297038b;

        /* renamed from: c, reason: collision with root package name */
        public final com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 f297039c;

        public CreateMarkerTask(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26109x9733a9da<T> interfaceC26109x9733a9da, java.util.Set<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.MarkerWithPosition> set, com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 c4406x873d1d26) {
            this.f297037a = interfaceC26109x9733a9da;
            this.f297038b = set;
            this.f297039c = c4406x873d1d26;
        }

        public final void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c<T>.MarkerModifier markerModifier) {
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.MarkerWithPosition markerWithPosition;
            if (!com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.this.m100194xbaca4e3f(this.f297037a)) {
                for (T t17 : this.f297037a.mo100118x749b8e0a()) {
                    com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a = com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.this.f297010l.get((com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.MarkerCache) t17);
                    if (interfaceC4409x88f1805a == null) {
                        com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4410xea4764e4 m37268xabc2c2b5 = new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4410xea4764e4().m37307x2c929929(t17.mo100121xa86cd69f()).m37268xabc2c2b5(0.5f, 0.5f);
                        com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 c4406x873d1d26 = this.f297039c;
                        if (c4406x873d1d26 != null) {
                            m37268xabc2c2b5.m37307x2c929929(c4406x873d1d26);
                        }
                        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.this.mo100188x18a278e4(t17, m37268xabc2c2b5);
                        interfaceC4409x88f1805a = com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.this.f297004f.m100129x6a9405ee().a(m37268xabc2c2b5);
                        markerWithPosition = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.MarkerWithPosition(interfaceC4409x88f1805a);
                        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.this.f297010l.put(t17, interfaceC4409x88f1805a);
                        com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 c4406x873d1d262 = this.f297039c;
                        if (c4406x873d1d262 != null) {
                            markerModifier.m100198xccec32e1(markerWithPosition, c4406x873d1d262, t17.mo100121xa86cd69f());
                        }
                    } else {
                        markerWithPosition = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.MarkerWithPosition(interfaceC4409x88f1805a);
                    }
                    com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.this.m100190xd2ff3a3(t17, interfaceC4409x88f1805a);
                    this.f297038b.add(markerWithPosition);
                }
                return;
            }
            com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4410xea4764e4 c4410xea4764e4 = new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4410xea4764e4();
            com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 c4406x873d1d263 = this.f297039c;
            if (c4406x873d1d263 == null) {
                c4406x873d1d263 = this.f297037a.mo100119xa86cd69f();
            }
            com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4410xea4764e4 m37268xabc2c2b52 = c4410xea4764e4.m37307x2c929929(c4406x873d1d263).m37268xabc2c2b5(0.5f, 0.5f);
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.this.mo100189xbcb2bab1(this.f297037a, m37268xabc2c2b52);
            com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a a17 = com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.this.f297004f.m100128x4c1c285c().a(m37268xabc2c2b52);
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.this.f297014p.put(a17, this.f297037a);
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.this.f297015q.put(this.f297037a, a17);
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.MarkerWithPosition markerWithPosition2 = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.MarkerWithPosition(a17);
            com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 c4406x873d1d264 = this.f297039c;
            if (c4406x873d1d264 != null) {
                markerModifier.m100198xccec32e1(markerWithPosition2, c4406x873d1d264, this.f297037a.mo100119xa86cd69f());
            }
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.this.m100191xf0716cf0(this.f297037a, a17);
            this.f297038b.add(markerWithPosition2);
        }
    }

    /* renamed from: com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer$MarkerCache */
    /* loaded from: classes13.dex */
    public static class MarkerCache<T> {

        /* renamed from: a, reason: collision with root package name */
        public java.util.Map<T, com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a> f297041a;

        /* renamed from: b, reason: collision with root package name */
        public java.util.Map<com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a, T> f297042b;

        public MarkerCache() {
            this.f297041a = new java.util.HashMap();
            this.f297042b = new java.util.HashMap();
        }

        public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a get(T t17) {
            return this.f297041a.get(t17);
        }

        public void put(T t17, com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a) {
            this.f297041a.put(t17, interfaceC4409x88f1805a);
            this.f297042b.put(interfaceC4409x88f1805a, t17);
        }

        /* renamed from: remove */
        public void m100197xc84af884(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a) {
            T t17 = this.f297042b.get(interfaceC4409x88f1805a);
            this.f297042b.remove(interfaceC4409x88f1805a);
            this.f297041a.remove(t17);
        }

        public T get(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a) {
            return this.f297042b.get(interfaceC4409x88f1805a);
        }
    }

    /* renamed from: com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer$MarkerModifier */
    /* loaded from: classes13.dex */
    public class MarkerModifier extends android.os.Handler implements android.os.MessageQueue.IdleHandler {

        /* renamed from: a, reason: collision with root package name */
        public final java.util.concurrent.locks.Lock f297043a;

        /* renamed from: b, reason: collision with root package name */
        public final java.util.concurrent.locks.Condition f297044b;

        /* renamed from: c, reason: collision with root package name */
        public java.util.Queue<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c<T>.CreateMarkerTask> f297045c;

        /* renamed from: d, reason: collision with root package name */
        public java.util.Queue<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c<T>.CreateMarkerTask> f297046d;

        /* renamed from: e, reason: collision with root package name */
        public java.util.Queue<com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a> f297047e;

        /* renamed from: f, reason: collision with root package name */
        public java.util.Queue<com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a> f297048f;

        /* renamed from: g, reason: collision with root package name */
        public java.util.Queue<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c<T>.AnimationTask> f297049g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f297050h;

        public final void a() {
            try {
                if (!this.f297048f.isEmpty()) {
                    a(this.f297048f.poll());
                } else if (!this.f297049g.isEmpty()) {
                    this.f297049g.poll().m100195xd789e761();
                } else if (!this.f297046d.isEmpty()) {
                    this.f297046d.poll().a(this);
                } else if (!this.f297045c.isEmpty()) {
                    this.f297045c.poll().a(this);
                } else if (!this.f297047e.isEmpty()) {
                    a(this.f297047e.poll());
                }
            } catch (java.lang.NullPointerException unused) {
                if (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.f297000b) {
                    m100200xae7a2e7a();
                }
            }
        }

        public void add(boolean z17, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c<T>.CreateMarkerTask createMarkerTask) {
            this.f297043a.lock();
            sendEmptyMessage(0);
            if (z17) {
                this.f297046d.add(createMarkerTask);
            } else {
                this.f297045c.add(createMarkerTask);
            }
            this.f297043a.unlock();
        }

        /* renamed from: animate */
        public void m100198xccec32e1(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.MarkerWithPosition markerWithPosition, com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 c4406x873d1d26, com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 c4406x873d1d262) {
            this.f297043a.lock();
            this.f297049g.add(new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.AnimationTask(markerWithPosition, c4406x873d1d26, c4406x873d1d262));
            this.f297043a.unlock();
        }

        /* renamed from: animateThenRemove */
        public void m100199xca3112c2(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.MarkerWithPosition markerWithPosition, com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 c4406x873d1d26, com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 c4406x873d1d262) {
            this.f297043a.lock();
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c<T>.AnimationTask animationTask = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.AnimationTask(markerWithPosition, c4406x873d1d26, c4406x873d1d262);
            animationTask.m100196x3265119a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.this.f297004f.m100130xf44a7a5d());
            this.f297049g.add(animationTask);
            this.f297043a.unlock();
        }

        /* renamed from: cancel */
        public void m100200xae7a2e7a() {
            this.f297046d.clear();
            this.f297049g.clear();
            this.f297045c.clear();
            this.f297048f.clear();
            this.f297047e.clear();
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            if (!this.f297050h) {
                android.os.Looper.myQueue().addIdleHandler(this);
                this.f297050h = true;
            }
            removeMessages(0);
            this.f297043a.lock();
            try {
                int max = java.lang.Math.max(java.lang.Math.max(java.lang.Math.max(this.f297048f.size(), this.f297049g.size()), this.f297047e.size()), java.lang.Math.max(this.f297045c.size(), this.f297046d.size()));
                for (int i17 = 0; i17 < max; i17++) {
                    a();
                }
                if (m100201xb9a12e43()) {
                    sendEmptyMessageDelayed(0, 100L);
                } else {
                    this.f297050h = false;
                    android.os.Looper.myQueue().removeIdleHandler(this);
                    this.f297044b.signalAll();
                }
            } finally {
                this.f297043a.unlock();
            }
        }

        /* renamed from: isBusy */
        public boolean m100201xb9a12e43() {
            boolean z17;
            try {
                this.f297043a.lock();
                if (this.f297045c.isEmpty() && this.f297046d.isEmpty() && this.f297048f.isEmpty() && this.f297047e.isEmpty()) {
                    if (this.f297049g.isEmpty()) {
                        z17 = false;
                        return z17;
                    }
                }
                z17 = true;
                return z17;
            } finally {
                this.f297043a.unlock();
            }
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            sendEmptyMessage(0);
            return true;
        }

        /* renamed from: remove */
        public void m100202xc84af884(boolean z17, com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a) {
            this.f297043a.lock();
            sendEmptyMessage(0);
            if (z17) {
                this.f297048f.add(interfaceC4409x88f1805a);
            } else {
                this.f297047e.add(interfaceC4409x88f1805a);
            }
            this.f297043a.unlock();
        }

        /* renamed from: waitUntilFree */
        public void m100203x1b598cf5() {
            while (m100201xb9a12e43()) {
                sendEmptyMessage(0);
                this.f297043a.lock();
                try {
                    try {
                        if (m100201xb9a12e43()) {
                            this.f297044b.await();
                        }
                    } catch (java.lang.InterruptedException e17) {
                        throw new java.lang.RuntimeException(e17);
                    }
                } finally {
                    this.f297043a.unlock();
                }
            }
        }

        public MarkerModifier() {
            super(android.os.Looper.getMainLooper());
            java.util.concurrent.locks.ReentrantLock reentrantLock = new java.util.concurrent.locks.ReentrantLock();
            this.f297043a = reentrantLock;
            this.f297044b = reentrantLock.newCondition();
            this.f297045c = new java.util.LinkedList();
            this.f297046d = new java.util.LinkedList();
            this.f297047e = new java.util.LinkedList();
            this.f297048f = new java.util.LinkedList();
            this.f297049g = new java.util.LinkedList();
        }

        public final void a(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a) {
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.this.f297015q.remove((com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26109x9733a9da) com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.this.f297014p.get(interfaceC4409x88f1805a));
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.this.f297010l.m100197xc84af884(interfaceC4409x88f1805a);
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.this.f297014p.remove(interfaceC4409x88f1805a);
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.this.f297004f.m100130xf44a7a5d().a(interfaceC4409x88f1805a);
        }
    }

    /* renamed from: com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer$MarkerWithPosition */
    /* loaded from: classes13.dex */
    public static class MarkerWithPosition {

        /* renamed from: a, reason: collision with root package name */
        public final com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a f297052a;

        /* renamed from: b, reason: collision with root package name */
        public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 f297053b;

        /* renamed from: equals */
        public boolean m100204xb2c87fbf(java.lang.Object obj) {
            if (obj instanceof com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.MarkerWithPosition) {
                return this.f297052a.m37229xb2c87fbf(((com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.MarkerWithPosition) obj).f297052a);
            }
            return false;
        }

        /* renamed from: hashCode */
        public int m100205x8cdac1b() {
            return this.f297052a.m37240x8cdac1b();
        }

        public MarkerWithPosition(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a) {
            this.f297052a = interfaceC4409x88f1805a;
            this.f297053b = interfaceC4409x88f1805a.mo37234xa86cd69f();
        }
    }

    /* renamed from: com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer$RenderTask */
    /* loaded from: classes13.dex */
    public class RenderTask implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final java.util.Set<? extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26109x9733a9da<T>> f297054a;

        /* renamed from: b, reason: collision with root package name */
        public java.lang.Runnable f297055b;

        /* renamed from: c, reason: collision with root package name */
        public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25943x166a66f f297056c;

        /* renamed from: d, reason: collision with root package name */
        public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.i f297057d;

        /* renamed from: e, reason: collision with root package name */
        public float f297058e;

        /* renamed from: f, reason: collision with root package name */
        public double f297059f;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            java.util.ArrayList arrayList;
            com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a;
            if (this.f297054a.equals(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.this.f297012n) && !com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.this.f297013o) {
                this.f297055b.run();
                return;
            }
            if (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.this.f297013o) {
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.this.f297013o = false;
            }
            java.util.ArrayList arrayList2 = null;
            java.lang.Object[] objArr = 0;
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.MarkerModifier markerModifier = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.MarkerModifier();
            float f17 = this.f297058e;
            boolean z17 = f17 > com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.this.f297016r;
            float f18 = f17 - com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.this.f297016r;
            java.util.Set<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.MarkerWithPosition> set = com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.this.f297008j;
            com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4407xcb530b7b m37435x227a49d1 = this.f297056c.mo98928xf0312250().m37435x227a49d1();
            if (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.this.f297012n == null || !com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.f296999a) {
                arrayList = null;
            } else {
                arrayList = new java.util.ArrayList();
                for (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26109x9733a9da<T> interfaceC26109x9733a9da : com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.this.f297012n) {
                    if (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.this.m100194xbaca4e3f(interfaceC26109x9733a9da) && m37435x227a49d1.m37207xde2d761f(interfaceC26109x9733a9da.mo100119xa86cd69f())) {
                        arrayList.add(this.f297057d.a(interfaceC26109x9733a9da.mo100119xa86cd69f()));
                    }
                }
            }
            java.util.Set newSetFromMap = java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap());
            for (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26109x9733a9da<T> interfaceC26109x9733a9da2 : this.f297054a) {
                if (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.this.f297012n == null || !com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.this.f297012n.contains(interfaceC26109x9733a9da2) || !com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.this.m100194xbaca4e3f(interfaceC26109x9733a9da2) || (interfaceC4409x88f1805a = (com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a) com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.this.f297015q.get(interfaceC26109x9733a9da2)) == null) {
                    boolean m37207xde2d761f = m37435x227a49d1.m37207xde2d761f(interfaceC26109x9733a9da2.mo100119xa86cd69f());
                    if (z17 && m37207xde2d761f && com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.f296999a) {
                        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.h b17 = com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.b(arrayList, this.f297057d.a(interfaceC26109x9733a9da2.mo100119xa86cd69f()), this.f297059f);
                        if (b17 != null) {
                            markerModifier.add(true, new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.CreateMarkerTask(interfaceC26109x9733a9da2, newSetFromMap, this.f297057d.a(b17)));
                        } else {
                            markerModifier.add(true, new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.CreateMarkerTask(interfaceC26109x9733a9da2, newSetFromMap, null));
                        }
                    } else {
                        markerModifier.add(m37207xde2d761f, new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.CreateMarkerTask(interfaceC26109x9733a9da2, newSetFromMap, null));
                    }
                } else {
                    newSetFromMap.add(new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.MarkerWithPosition(interfaceC4409x88f1805a));
                }
            }
            markerModifier.m100203x1b598cf5();
            set.removeAll(newSetFromMap);
            if (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.f296999a) {
                arrayList2 = new java.util.ArrayList();
                for (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26109x9733a9da<T> interfaceC26109x9733a9da3 : this.f297054a) {
                    if (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.this.m100194xbaca4e3f(interfaceC26109x9733a9da3) && m37435x227a49d1.m37207xde2d761f(interfaceC26109x9733a9da3.mo100119xa86cd69f())) {
                        arrayList2.add(this.f297057d.a(interfaceC26109x9733a9da3.mo100119xa86cd69f()));
                    }
                }
            }
            for (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.MarkerWithPosition markerWithPosition : set) {
                boolean m37207xde2d761f2 = m37435x227a49d1.m37207xde2d761f(markerWithPosition.f297053b);
                if (z17 || f18 <= -3.0f || !m37207xde2d761f2 || !com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.f296999a) {
                    markerModifier.m100202xc84af884(m37207xde2d761f2, markerWithPosition.f297052a);
                } else {
                    com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.h b18 = com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.b(arrayList2, this.f297057d.a(markerWithPosition.f297053b), this.f297059f);
                    if (b18 != null) {
                        markerModifier.m100199xca3112c2(markerWithPosition, markerWithPosition.f297053b, this.f297057d.a(b18));
                    } else {
                        markerModifier.m100202xc84af884(true, markerWithPosition.f297052a);
                    }
                }
            }
            markerModifier.m100203x1b598cf5();
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.this.f297008j = newSetFromMap;
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.this.f297012n = this.f297054a;
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.this.f297016r = f17;
            this.f297055b.run();
        }

        /* renamed from: setCallback */
        public void m100206x6c4ebec7(java.lang.Runnable runnable) {
            this.f297055b = runnable;
        }

        /* renamed from: setMapZoom */
        public void m100207xe320b88d(float f17) {
            this.f297058e = f17;
            this.f297057d = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.i(java.lang.Math.pow(2.0d, java.lang.Math.min(f17, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.this.f297016r) - 1.0f) * 256.0d);
        }

        /* renamed from: setProjection */
        public void m100208xa6f9d051(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25943x166a66f interfaceC25943x166a66f) {
            this.f297056c = interfaceC25943x166a66f;
        }

        public RenderTask(java.util.Set<? extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26109x9733a9da<T>> set, double d17) {
            this.f297054a = set;
            this.f297059f = d17;
        }
    }

    /* renamed from: com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer$ViewModifier */
    /* loaded from: classes13.dex */
    public class ViewModifier extends android.os.Handler {

        /* renamed from: a, reason: collision with root package name */
        public boolean f297061a;

        /* renamed from: b, reason: collision with root package name */
        public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c<T>.RenderTask f297062b;

        public ViewModifier() {
            this.f297061a = false;
            this.f297062b = null;
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25943x166a66f mo98968x78d58245;
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c<T>.RenderTask renderTask;
            if (message.what == 1) {
                this.f297061a = false;
                if (this.f297062b != null) {
                    sendEmptyMessage(0);
                    return;
                }
                return;
            }
            removeMessages(0);
            if (this.f297061a || this.f297062b == null || (mo98968x78d58245 = com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.this.f297002d.mo98968x78d58245()) == null) {
                return;
            }
            synchronized (this) {
                renderTask = this.f297062b;
                this.f297062b = null;
                this.f297061a = true;
            }
            renderTask.m100206x6c4ebec7(new java.lang.Runnable() { // from class: com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.ViewModifier.1
                @Override // java.lang.Runnable
                public void run() {
                    com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.ViewModifier.this.sendEmptyMessage(1);
                }
            });
            renderTask.m100208xa6f9d051(mo98968x78d58245);
            try {
                renderTask.m100207xe320b88d(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.this.f297002d.mo98961xd2ef9864().m37104xfb888c49());
                new java.lang.Thread(renderTask).start();
            } catch (java.lang.NullPointerException unused) {
                boolean unused2 = com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.f297000b;
            }
        }

        /* renamed from: queue */
        public void m100209x66f1911(java.util.Set<? extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26109x9733a9da<T>> set) {
            synchronized (this) {
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c c26118xa74407c = com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.this;
                this.f297062b = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.RenderTask(set, c26118xa74407c.f49864x874d671d);
            }
            sendEmptyMessage(0);
        }
    }

    public C26118xa74407c(android.content.Context context, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7 interfaceC25945x718093f7, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.C26111x2ace1473<T> c26111x2ace1473) {
        this.f297010l = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.MarkerCache<>();
        this.f297017s = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.ViewModifier();
        this.f297002d = interfaceC25945x718093f7;
        float f17 = context.getResources().getDisplayMetrics().density;
        this.f297005g = f17;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.ui.C26120xc54a63a c26120xc54a63a = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.ui.C26120xc54a63a(context);
        this.f297003e = c26120xc54a63a;
        c26120xc54a63a.m100219x590ab8fc(a(context));
        c26120xc54a63a.m100222x1d8f3e73(android.R.style.TextAppearance, -1118482, 16.0f, 1);
        c26120xc54a63a.m100216xccfd5b30(d());
        this.f297004f = c26111x2ace1473;
        if ((c26111x2ace1473.m100127xcde25b9() instanceof com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.C26115x55bfd68 ? ((com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.C26115x55bfd68) c26111x2ace1473.m100127xcde25b9()).m100164xcde25b9() : c26111x2ace1473.m100127xcde25b9()) instanceof com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.C26114xe1bbf3c7) {
            this.f49864x874d671d = (((com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.C26114xe1bbf3c7) r5).m100160xc759f8c9() + 0.5d) * f17;
        } else {
            this.f49864x874d671d = f17 * 35.0f;
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.InterfaceC26117xa1cd4bd
    /* renamed from: cancel */
    public void mo100168xae7a2e7a() {
        f297000b = true;
        mo100171x573fcf43();
    }

    /* renamed from: getBucket */
    public int m100179x12f16ce0(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26109x9733a9da<T> interfaceC26109x9733a9da) {
        int mo100120xfb854877 = interfaceC26109x9733a9da.mo100120xfb854877();
        int[] iArr = this.f297006h;
        if (iArr == null) {
            return mo100120xfb854877;
        }
        int i17 = 0;
        if (mo100120xfb854877 <= iArr[0]) {
            return mo100120xfb854877;
        }
        while (true) {
            int[] iArr2 = this.f297006h;
            if (i17 >= iArr2.length - 1) {
                return iArr2[iArr2.length - 1];
            }
            int i18 = i17 + 1;
            if (mo100120xfb854877 < iArr2[i18]) {
                return iArr2[i17];
            }
            i17 = i18;
        }
    }

    /* renamed from: getBuckets */
    public int[] m100180x4b3c2f93() {
        return this.f297006h;
    }

    /* renamed from: getCluster */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26109x9733a9da<T> m100181x71c84dc4(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a) {
        return this.f297014p.get(interfaceC4409x88f1805a);
    }

    /* renamed from: getClusterItem */
    public T m100182x95c6baf7(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a) {
        return this.f297010l.get(interfaceC4409x88f1805a);
    }

    /* renamed from: getClusterText */
    public java.lang.String m100183x95cb8511(int i17) {
        int[] iArr = this.f297006h;
        if (iArr != null && i17 >= iArr[0]) {
            return java.lang.String.valueOf(i17) + "+";
        }
        return java.lang.String.valueOf(i17);
    }

    /* renamed from: getColor */
    public int m100184x7444d5ad(int i17) {
        float min = 300.0f - java.lang.Math.min(i17, 300.0f);
        return android.graphics.Color.HSVToColor(new float[]{((min * min) / 90000.0f) * 220.0f, 1.0f, 0.6f});
    }

    /* renamed from: getMarker */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a m100186x24a3b730(T t17) {
        return this.f297010l.get((com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.MarkerCache<T>) t17);
    }

    /* renamed from: getMinClusterSize */
    public int m100187x5b77e05f() {
        return this.f297011m;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.InterfaceC26117xa1cd4bd
    /* renamed from: onAdd */
    public void mo100169x64f3242() {
        this.f297004f.m100129x6a9405ee().a(new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMarkerClickListener() { // from class: com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMarkerClickListener
            /* renamed from: onMarkerClick */
            public boolean mo14570x289a5e0f(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a) {
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26110x1f5a1c0d interfaceC26110x1f5a1c0d = (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26110x1f5a1c0d) com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.this.f297010l.get(interfaceC4409x88f1805a);
                return (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.this.f297021w == null || interfaceC26110x1f5a1c0d == null || !com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.this.f297021w.mo100151x2ee7a95a(interfaceC26110x1f5a1c0d)) ? false : true;
            }
        });
        this.f297004f.m100129x6a9405ee().a(new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnInfoWindowClickListener() { // from class: com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnInfoWindowClickListener
            /* renamed from: onInfoWindowClick */
            public void mo66012xc56a6a0b(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a) {
                if (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.this.f297022x != null) {
                    com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.this.f297022x.m100152x549fdf3c((com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26110x1f5a1c0d) com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.this.f297010l.get(interfaceC4409x88f1805a));
                }
            }
        });
        this.f297004f.m100129x6a9405ee().a(new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.InfoWindowAdapter() { // from class: com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.InfoWindowAdapter
            /* renamed from: getInfoWindow */
            public android.view.View mo99027xc3c42a34(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a) {
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26110x1f5a1c0d interfaceC26110x1f5a1c0d = (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26110x1f5a1c0d) com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.this.f297010l.get(interfaceC4409x88f1805a);
                if (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.this.f297023y == null || interfaceC26110x1f5a1c0d == null) {
                    return null;
                }
                return com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.this.f297023y.m100147xc3c42a34(interfaceC26110x1f5a1c0d);
            }

            @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.InfoWindowAdapter
            /* renamed from: onInfoWindowDettached */
            public void mo99028xf6653887(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a, android.view.View view) {
            }
        });
        this.f297004f.m100128x4c1c285c().a(new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMarkerClickListener() { // from class: com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.4
            @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMarkerClickListener
            /* renamed from: onMarkerClick */
            public boolean mo14570x289a5e0f(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a) {
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26109x9733a9da<T> interfaceC26109x9733a9da = (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26109x9733a9da) com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.this.f297014p.get(interfaceC4409x88f1805a);
                return (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.this.f297018t == null || interfaceC26109x9733a9da == null || !com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.this.f297018t.mo100149x37087b2d(interfaceC26109x9733a9da)) ? false : true;
            }
        });
        this.f297004f.m100128x4c1c285c().a(new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnInfoWindowClickListener() { // from class: com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.5
            @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnInfoWindowClickListener
            /* renamed from: onInfoWindowClick */
            public void mo66012xc56a6a0b(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a) {
                if (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.this.f297019u != null) {
                    com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.this.f297019u.m100150x232ec54f((com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26109x9733a9da) com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.this.f297014p.get(interfaceC4409x88f1805a));
                }
            }
        });
        this.f297004f.m100128x4c1c285c().a(new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.InfoWindowAdapter() { // from class: com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer.6
            @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.InfoWindowAdapter
            /* renamed from: getInfoWindow */
            public android.view.View mo99027xc3c42a34(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a) {
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26109x9733a9da<T> interfaceC26109x9733a9da = (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26109x9733a9da) com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.this.f297014p.get(interfaceC4409x88f1805a);
                if (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.this.f297020v == null || interfaceC26109x9733a9da == null) {
                    return null;
                }
                return com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c.this.f297020v.m100144xc3c42a34(interfaceC26109x9733a9da);
            }

            @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.InfoWindowAdapter
            /* renamed from: onInfoWindowDettached */
            public void mo99028xf6653887(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a, android.view.View view) {
            }
        });
    }

    /* renamed from: onBeforeClusterItemRendered */
    public void mo100188x18a278e4(T t17, com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4410xea4764e4 c4410xea4764e4) {
    }

    /* renamed from: onBeforeClusterRendered */
    public void mo100189xbcb2bab1(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26109x9733a9da<T> interfaceC26109x9733a9da, com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4410xea4764e4 c4410xea4764e4) {
        int m100179x12f16ce0 = m100179x12f16ce0(interfaceC26109x9733a9da);
        com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4392x4177761e c4392x4177761e = this.f297009k.get(m100179x12f16ce0);
        if (c4392x4177761e == null) {
            this.f297007i.getPaint().setColor(m100184x7444d5ad(m100179x12f16ce0));
            c4392x4177761e = com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4393x93ded50c.m37090x63040d79(this.f297003e.m100215x2650f87(m100183x95cb8511(m100179x12f16ce0)));
            this.f297009k.put(m100179x12f16ce0, c4392x4177761e);
        }
        c4410xea4764e4.m37295x313c79(c4392x4177761e);
    }

    /* renamed from: onClusterItemRendered */
    public void m100190xd2ff3a3(T t17, com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a) {
    }

    /* renamed from: onClusterRendered */
    public void m100191xf0716cf0(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26109x9733a9da<T> interfaceC26109x9733a9da, com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a) {
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.InterfaceC26117xa1cd4bd
    /* renamed from: onClustersChanged */
    public void mo100170x4380eadc(java.util.Set<? extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26109x9733a9da<T>> set) {
        this.f297017s.m100209x66f1911(set);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.InterfaceC26117xa1cd4bd
    /* renamed from: onRemove */
    public void mo100171x573fcf43() {
        this.f297004f.m100129x6a9405ee().a((com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMarkerClickListener) null);
        this.f297004f.m100128x4c1c285c().a((com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMarkerClickListener) null);
    }

    /* renamed from: setBuckets */
    public void m100192xbead7d07(int[] iArr) {
        this.f297006h = iArr;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.InterfaceC26117xa1cd4bd
    /* renamed from: setInfoWindowAdapter */
    public void mo100172x3d10faef(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.C26111x2ace1473.ClusterInfoWindowAdapter clusterInfoWindowAdapter) {
        this.f297020v = clusterInfoWindowAdapter;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.InterfaceC26117xa1cd4bd
    /* renamed from: setItemInfoWindowAdapter */
    public void mo100173xcb30d91c(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.C26111x2ace1473.ClusterItemInfoWindowAdapter clusterItemInfoWindowAdapter) {
        this.f297023y = clusterItemInfoWindowAdapter;
    }

    /* renamed from: setMinClusterSize */
    public void m100193x236e486b(int i17) {
        this.f297011m = i17;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.C26111x2ace1473<T> c26111x2ace1473 = this.f297004f;
        if (c26111x2ace1473 != null) {
            this.f297013o = true;
            c26111x2ace1473.m100126x33fb11fa();
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.InterfaceC26117xa1cd4bd
    /* renamed from: setOnClusterClickListener */
    public void mo100174x908e3a03(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.C26111x2ace1473.OnClusterClickListener<T> onClusterClickListener) {
        this.f297018t = onClusterClickListener;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.InterfaceC26117xa1cd4bd
    /* renamed from: setOnClusterInfoWindowClickListener */
    public void mo100175x246ee7a5(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.C26111x2ace1473.OnClusterInfoWindowClickListener<T> onClusterInfoWindowClickListener) {
        this.f297019u = onClusterInfoWindowClickListener;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.InterfaceC26117xa1cd4bd
    /* renamed from: setOnClusterItemClickListener */
    public void mo100176x48419a30(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.C26111x2ace1473.OnClusterItemClickListener<T> onClusterItemClickListener) {
        this.f297021w = onClusterItemClickListener;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.InterfaceC26117xa1cd4bd
    /* renamed from: setOnClusterItemInfoWindowClickListener */
    public void mo100177x79db392(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.C26111x2ace1473.OnClusterItemInfoWindowClickListener<T> onClusterItemInfoWindowClickListener) {
        this.f297022x = onClusterItemInfoWindowClickListener;
    }

    /* renamed from: shouldRenderAsCluster */
    public boolean m100194xbaca4e3f(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26109x9733a9da<T> interfaceC26109x9733a9da) {
        return interfaceC26109x9733a9da.mo100120xfb854877() > this.f297011m;
    }

    public final android.graphics.drawable.LayerDrawable d() {
        this.f297007i = new android.graphics.drawable.ShapeDrawable(new android.graphics.drawable.shapes.OvalShape());
        android.graphics.drawable.ShapeDrawable shapeDrawable = new android.graphics.drawable.ShapeDrawable(new android.graphics.drawable.shapes.OvalShape());
        shapeDrawable.getPaint().setColor(-2130706433);
        android.graphics.drawable.LayerDrawable layerDrawable = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{shapeDrawable, this.f297007i});
        int i17 = (int) (this.f297005g * 3.0f);
        layerDrawable.setLayerInset(1, i17, i17, i17, i17);
        return layerDrawable;
    }

    /* renamed from: getMarker */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a m100185x24a3b730(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26109x9733a9da<T> interfaceC26109x9733a9da) {
        return this.f297015q.get(interfaceC26109x9733a9da);
    }

    public static com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.h b(java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.h> list, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.h hVar, double d17) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.h hVar2 = null;
        if (list != null && !list.isEmpty()) {
            double d18 = d17 * d17;
            for (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.h hVar3 : list) {
                double a17 = a(hVar3, hVar);
                if (a17 < d18) {
                    hVar2 = hVar3;
                    d18 = a17;
                }
            }
        }
        return hVar2;
    }

    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.l a(android.content.Context context) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.l lVar = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.l(context);
        lVar.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
        lVar.setId(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.ui.C26120xc54a63a.f49865x349577c5);
        int i17 = (int) (this.f297005g * 12.0f);
        lVar.setPadding(i17, i17, i17, i17);
        return lVar;
    }

    public static double a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.h hVar, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.h hVar2) {
        double d17 = hVar.f296930a - hVar2.f296930a;
        double d18 = hVar.f296931b - hVar2.f296931b;
        return (d17 * d17) + (d18 * d18);
    }
}
