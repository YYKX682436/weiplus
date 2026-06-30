package va5;

/* loaded from: classes11.dex */
public class p extends android.widget.LinearLayout {
    public static final /* synthetic */ int P = 0;
    public android.widget.OverScroller A;
    public oa5.b B;
    public android.widget.OverScroller C;
    public oa5.b D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public va5.b I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f515954J;
    public java.lang.Runnable K;
    public va5.g L;
    public boolean M;
    public float N;

    /* renamed from: d, reason: collision with root package name */
    public int f515955d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f515956e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f515957f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f515958g;

    /* renamed from: h, reason: collision with root package name */
    public final va5.v f515959h;

    /* renamed from: i, reason: collision with root package name */
    public int f515960i;

    /* renamed from: m, reason: collision with root package name */
    public int f515961m;

    /* renamed from: n, reason: collision with root package name */
    public float f515962n;

    /* renamed from: o, reason: collision with root package name */
    public float f515963o;

    /* renamed from: p, reason: collision with root package name */
    public int f515964p;

    /* renamed from: q, reason: collision with root package name */
    public n3.q f515965q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f515966r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f515967s;

    /* renamed from: t, reason: collision with root package name */
    public int f515968t;

    /* renamed from: u, reason: collision with root package name */
    public final int f515969u;

    /* renamed from: v, reason: collision with root package name */
    public final int f515970v;

    /* renamed from: w, reason: collision with root package name */
    public final int f515971w;

    /* renamed from: x, reason: collision with root package name */
    public final int f515972x;

    /* renamed from: y, reason: collision with root package name */
    public final int f515973y;

    /* renamed from: z, reason: collision with root package name */
    public final int f515974z;

    static {
        new va5.d(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(android.view.View contentView, va5.v menuView, java.lang.Integer num, android.view.animation.Interpolator interpolator, android.view.animation.Interpolator interpolator2) {
        super(contentView.getContext());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentView, "contentView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuView, "menuView");
        this.f515955d = 1;
        this.f515956e = "MicroMsg.SwipeMenuLayout";
        this.f515969u = ym5.x.a(getContext(), 15.0f);
        this.f515970v = ym5.x.a(getContext(), 15.0f);
        this.f515971w = ym5.x.a(getContext(), 30.0f);
        this.f515972x = -ym5.x.a(getContext(), 500.0f);
        this.f515973y = ym5.x.a(getContext(), 32.0f);
        this.f515974z = android.view.ViewConfiguration.get(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getScaledTouchSlop();
        this.N = 0.8f;
        this.f515957f = contentView;
        this.f515959h = menuView;
        menuView.m171396x1627522c(this);
        this.f515958g = contentView.findViewById(com.p314xaae8f345.mm.R.id.d0v);
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(getContext());
        viewConfiguration.getScaledMaximumFlingVelocity();
        this.f515968t = viewConfiguration.getScaledPagingTouchSlop();
        setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, -2));
        this.f515965q = new n3.q(getContext(), new va5.h(this));
        this.C = interpolator != null ? new android.widget.OverScroller(getContext(), interpolator) : new android.widget.OverScroller(getContext(), new va5.e());
        this.A = interpolator2 != null ? new android.widget.OverScroller(getContext(), interpolator2) : new android.widget.OverScroller(getContext(), new va5.f(1.0f, 0.3f));
        contentView.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
        int m171393xc082385a = menuView.m171393xc082385a();
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(m171393xc082385a <= 0 ? -2 : m171393xc082385a, -2);
        if (num != null) {
            layoutParams.height = num.intValue();
        }
        addView(contentView);
        addView(menuView, layoutParams);
    }

    public static void a(va5.p pVar, int i17, android.graphics.drawable.Drawable newIcon, long j17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateMenuIconSwitch");
        }
        if ((i18 & 4) != 0) {
            j17 = 200;
        }
        pVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newIcon, "newIcon");
        va5.v vVar = pVar.f515959h;
        vVar.getClass();
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) vVar.findViewById(i17);
        android.widget.ImageView imageView = linearLayout != null ? (android.widget.ImageView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.vb_) : null;
        if (imageView == null) {
            return;
        }
        imageView.post(new va5.t(imageView, j17, newIcon));
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x01ca, code lost:
    
        invalidate();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01cd, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: va5.p.b(android.view.MotionEvent):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x00fb, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(int r20) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: va5.p.c(int):void");
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f515964p != 1) {
            android.widget.OverScroller overScroller = this.C;
            if (overScroller != null && overScroller.computeScrollOffset()) {
                int i17 = this.E;
                android.widget.OverScroller overScroller2 = this.C;
                c((i17 - (overScroller2 != null ? overScroller2.getCurrX() : 0)) * this.f515955d);
                invalidate();
                return;
            }
            return;
        }
        android.widget.OverScroller overScroller3 = this.A;
        if (overScroller3 != null && overScroller3.computeScrollOffset()) {
            android.widget.OverScroller overScroller4 = this.A;
            c((overScroller4 != null ? overScroller4.getCurrX() : 0) * this.f515955d);
            invalidate();
            return;
        }
        if (this.f515954J) {
            android.widget.OverScroller overScroller5 = this.A;
            if (overScroller5 != null && overScroller5.isFinished()) {
                r1 = 1;
            }
            if (r1 == 0 || !this.f515954J) {
                return;
            }
            java.lang.Runnable runnable = this.K;
            if (runnable != null) {
                removeCallbacks(runnable);
                this.K = null;
            }
            va5.o oVar = new va5.o(this);
            this.K = oVar;
            postDelayed(oVar, 150L);
        }
    }

    /* renamed from: getContentView */
    public final android.view.View m171379xc2a54588() {
        return this.f515957f;
    }

    /* renamed from: getExpandIndex */
    public final int m171380xbe8ab122() {
        return this.f515959h.m171392xbe8ab122();
    }

    /* renamed from: getMenuView */
    public final va5.v m171381x57de3a1a() {
        return this.f515959h;
    }

    /* renamed from: getPosition */
    public final int m171382xa86cd69f() {
        return this.F;
    }

    /* renamed from: getSwipeEnable */
    public final boolean m171383xe81ac427() {
        return this.f515967s;
    }

    /* renamed from: getSwipeThresholdRatio */
    public final float m171384x85d34104() {
        return this.N;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent ev6) {
        android.widget.OverScroller overScroller;
        android.widget.OverScroller overScroller2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        if (!this.f515967s) {
            return super.onInterceptTouchEvent(ev6);
        }
        int action = ev6.getAction();
        boolean z17 = false;
        if (action == 0) {
            this.f515960i = (int) ev6.getX();
            this.f515961m = (int) ev6.getY();
            this.f515962n = ev6.getX();
            this.f515963o = 0.0f;
            this.G = false;
            this.H = false;
            this.f515966r = false;
            this.M = false;
            java.lang.Runnable runnable = this.K;
            if (runnable != null) {
                removeCallbacks(runnable);
                this.K = null;
            }
        } else if (action == 2) {
            float abs = java.lang.Math.abs(ev6.getX() - this.f515960i);
            float abs2 = java.lang.Math.abs(ev6.getY() - this.f515961m);
            if (abs > this.f515968t && abs > abs2 * 2.19f) {
                android.widget.OverScroller overScroller3 = this.A;
                if ((overScroller3 != null && overScroller3.computeScrollOffset()) && (overScroller2 = this.A) != null) {
                    overScroller2.abortAnimation();
                }
                android.widget.OverScroller overScroller4 = this.C;
                if (overScroller4 != null && overScroller4.computeScrollOffset()) {
                    z17 = true;
                }
                if (z17 && (overScroller = this.C) != null) {
                    overScroller.abortAnimation();
                }
                oa5.b bVar = this.D;
                if (bVar != null) {
                    bVar.c();
                }
                this.D = null;
                oa5.b bVar2 = this.B;
                if (bVar2 != null) {
                    bVar2.c();
                }
                this.B = null;
                android.view.ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                this.f515962n = ev6.getX();
                this.f515963o = 0.0f;
                return true;
            }
        }
        return super.onInterceptTouchEvent(ev6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0028, code lost:
    
        if (r0 != 3) goto L95;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: va5.p.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: setAutoCloseMode */
    public final void m171385xf232298a(boolean z17) {
        this.f515954J = z17;
    }

    /* renamed from: setOnMenuStateChangeListener */
    public final void m171386x5d2a0075(va5.b onMenuStateChangeListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onMenuStateChangeListener, "onMenuStateChangeListener");
        this.I = onMenuStateChangeListener;
    }

    /* renamed from: setOnSwipeThresholdListener */
    public final void m171387x64f96166(va5.g gVar) {
        this.L = gVar;
    }

    /* renamed from: setPosition */
    public final void m171388xa32537ab(int i17) {
        this.F = i17;
        this.f515959h.m171399xa32537ab(i17);
    }

    /* renamed from: setSwipeDirection */
    public final void m171389xf70e9e67(int i17) {
        this.f515955d = i17;
    }

    /* renamed from: setSwipeEnable */
    public final void m171390x7e80379b(boolean z17) {
        this.f515967s = z17;
    }

    /* renamed from: setSwipeThresholdRatio */
    public final void m171391xd4180078(float f17) {
        this.N = e06.p.e(f17, 0.0f, 1.0f);
    }
}
