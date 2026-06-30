package r2;

/* loaded from: classes14.dex */
public abstract class o extends android.view.ViewGroup implements n3.h0 {

    /* renamed from: d, reason: collision with root package name */
    public final o1.e f450264d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f450265e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.a f450266f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f450267g;

    /* renamed from: h, reason: collision with root package name */
    public z0.t f450268h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.l f450269i;

    /* renamed from: m, reason: collision with root package name */
    public p2.f f450270m;

    /* renamed from: n, reason: collision with root package name */
    public yz5.l f450271n;

    /* renamed from: o, reason: collision with root package name */
    public p012xc85e97e9.p093xedfae76a.y f450272o;

    /* renamed from: p, reason: collision with root package name */
    public o4.g f450273p;

    /* renamed from: q, reason: collision with root package name */
    public final x0.r0 f450274q;

    /* renamed from: r, reason: collision with root package name */
    public final yz5.l f450275r;

    /* renamed from: s, reason: collision with root package name */
    public final yz5.a f450276s;

    /* renamed from: t, reason: collision with root package name */
    public yz5.l f450277t;

    /* renamed from: u, reason: collision with root package name */
    public final int[] f450278u;

    /* renamed from: v, reason: collision with root package name */
    public int f450279v;

    /* renamed from: w, reason: collision with root package name */
    public int f450280w;

    /* renamed from: x, reason: collision with root package name */
    public final n3.j0 f450281x;

    /* renamed from: y, reason: collision with root package name */
    public final u1.w f450282y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(android.content.Context context, n0.g1 g1Var, o1.e dispatcher) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        this.f450264d = dispatcher;
        if (g1Var != null) {
            java.util.Map map = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k5.f92153a;
            setTag(com.p314xaae8f345.mm.R.id.f564571ux, g1Var);
        }
        setSaveFromParentEnabled(false);
        this.f450266f = r2.n.f450263d;
        this.f450268h = z0.p.f550454d;
        this.f450270m = new p2.g(1.0f, 1.0f);
        this.f450274q = new x0.r0(new r2.m(this));
        this.f450275r = new r2.i(this);
        this.f450276s = new r2.l(this);
        this.f450278u = new int[2];
        this.f450279v = Integer.MIN_VALUE;
        this.f450280w = Integer.MIN_VALUE;
        this.f450281x = new n3.j0(this);
        u1.w wVar = new u1.w(false, 1, null);
        p1.g0 g0Var = new p1.g0();
        g0Var.f432353d = new p1.h0(this);
        p1.k0 k0Var = new p1.k0();
        p1.k0 k0Var2 = g0Var.f432354e;
        if (k0Var2 != null) {
            k0Var2.f432374d = null;
        }
        g0Var.f432354e = k0Var;
        k0Var.f432374d = g0Var;
        m161346x459bb0cc(k0Var);
        z0.t a17 = s1.h1.a(b1.j.a(g0Var, new r2.g(wVar, this)), new r2.h(this, wVar));
        wVar.M(this.f450268h.k(a17));
        this.f450269i = new r2.a(wVar, a17);
        wVar.K(this.f450270m);
        this.f450271n = new r2.b(wVar);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        wVar.S = new r2.c(this, wVar, h0Var);
        wVar.T = new r2.d(this, h0Var);
        wVar.L(new r2.f(this, wVar));
        this.f450282y = wVar;
    }

    public static final int a(r2.o oVar, int i17, int i18, int i19) {
        oVar.getClass();
        return (i19 >= 0 || i17 == i18) ? android.view.View.MeasureSpec.makeMeasureSpec(e06.p.f(i19, i17, i18), 1073741824) : (i19 != -2 || i18 == Integer.MAX_VALUE) ? (i19 != -1 || i18 == Integer.MAX_VALUE) ? android.view.View.MeasureSpec.makeMeasureSpec(0, 0) : android.view.View.MeasureSpec.makeMeasureSpec(i18, 1073741824) : android.view.View.MeasureSpec.makeMeasureSpec(i18, Integer.MIN_VALUE);
    }

    @Override // n3.g0
    public boolean B(android.view.View child, android.view.View target, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        return ((i17 & 2) == 0 && (i17 & 1) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean gatherTransparentRegion(android.graphics.Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.f450278u;
        getLocationInWindow(iArr);
        int i17 = iArr[0];
        region.op(i17, iArr[1], i17 + getWidth(), iArr[1] + getHeight(), android.graphics.Region.Op.DIFFERENCE);
        return true;
    }

    /* renamed from: getDensity */
    public final p2.f m161331x9a59d0b2() {
        return this.f450270m;
    }

    /* renamed from: getLayoutNode */
    public final u1.w m161332x29b3042() {
        return this.f450282y;
    }

    @Override // android.view.View
    public android.view.ViewGroup.LayoutParams getLayoutParams() {
        android.view.ViewGroup.LayoutParams layoutParams;
        android.view.View view = this.f450265e;
        return (view == null || (layoutParams = view.getLayoutParams()) == null) ? new android.view.ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    /* renamed from: getLifecycleOwner */
    public final p012xc85e97e9.p093xedfae76a.y m161333x95c7fa5f() {
        return this.f450272o;
    }

    /* renamed from: getModifier */
    public final z0.t m161334x572a404d() {
        return this.f450268h;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        n3.j0 j0Var = this.f450281x;
        return j0Var.f415879b | j0Var.f415878a;
    }

    /* renamed from: getOnDensityChanged$ui_release */
    public final yz5.l m161335xd4f585ff() {
        return this.f450271n;
    }

    /* renamed from: getOnModifierChanged$ui_release */
    public final yz5.l m161336x4cbf1038() {
        return this.f450269i;
    }

    /* renamed from: getOnRequestDisallowInterceptTouchEvent$ui_release */
    public final yz5.l m161337xf1a7e758() {
        return this.f450277t;
    }

    /* renamed from: getSavedStateRegistryOwner */
    public final o4.g m161338xd0dd2e16() {
        return this.f450273p;
    }

    /* renamed from: getUpdate */
    public final yz5.a m161339x33175bbf() {
        return this.f450266f;
    }

    /* renamed from: getView */
    public final android.view.View m161340xfb86a31b() {
        return this.f450265e;
    }

    @Override // n3.g0
    public void h(android.view.View child, android.view.View target, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        this.f450281x.a(child, target, i17, i18);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public android.view.ViewParent invalidateChildInParent(int[] iArr, android.graphics.Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        this.f450282y.u();
        return null;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        android.view.View view = this.f450265e;
        return view != null ? view.isNestedScrollingEnabled() : super.isNestedScrollingEnabled();
    }

    @Override // n3.g0
    public void j(android.view.View target, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        this.f450281x.b(target, i17);
    }

    @Override // n3.g0
    public void l(android.view.View target, int i17, int i18, int i19, int i27, int i28) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        if (isNestedScrollingEnabled()) {
            float f17 = i17;
            float f18 = -1;
            this.f450264d.b(d1.f.a(f17 * f18, i18 * f18), d1.f.a(i19 * f18, i27 * f18), i28 == 0 ? 1 : 2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f450274q.c();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(android.view.View child, android.view.View target) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        super.onDescendantInvalidated(child, target);
        this.f450282y.u();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        x0.r0 r0Var = this.f450274q;
        x0.i iVar = r0Var.f532469e;
        if (iVar != null) {
            ((x0.k) iVar).mo174763x63a5261f();
        }
        r0Var.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        android.view.View view = this.f450265e;
        if (view != null) {
            view.layout(0, 0, i19 - i17, i27 - i18);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        android.view.View view = this.f450265e;
        if (view != null) {
            view.measure(i17, i18);
        }
        android.view.View view2 = this.f450265e;
        int measuredWidth = view2 != null ? view2.getMeasuredWidth() : 0;
        android.view.View view3 = this.f450265e;
        setMeasuredDimension(measuredWidth, view3 != null ? view3.getMeasuredHeight() : 0);
        this.f450279v = i17;
        this.f450280w = i18;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(android.view.View target, float f17, float f18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        p3325xe03a0797.p3326xc267989b.l.d(this.f450264d.d(), null, null, new r2.j(z17, this, p2.x.a(f17 * (-1.0f), (-1.0f) * f18), null), 3, null);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(android.view.View target, float f17, float f18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        p3325xe03a0797.p3326xc267989b.l.d(this.f450264d.d(), null, null, new r2.k(this, p2.x.a(f17 * (-1.0f), f18 * (-1.0f)), null), 3, null);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z17) {
        yz5.l lVar = this.f450277t;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.valueOf(z17));
        }
        super.requestDisallowInterceptTouchEvent(z17);
    }

    /* renamed from: setDensity */
    public final void m161341xdcb1e26(p2.f value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        if (value != this.f450270m) {
            this.f450270m = value;
            yz5.l lVar = this.f450271n;
            if (lVar != null) {
                lVar.mo146xb9724478(value);
            }
        }
    }

    /* renamed from: setLifecycleOwner */
    public final void m161342x5dbe626b(p012xc85e97e9.p093xedfae76a.y yVar) {
        if (yVar != this.f450272o) {
            this.f450272o = yVar;
            setTag(com.p314xaae8f345.mm.R.id.p28, yVar);
        }
    }

    /* renamed from: setModifier */
    public final void m161343x51e2a159(z0.t value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        if (value != this.f450268h) {
            this.f450268h = value;
            yz5.l lVar = this.f450269i;
            if (lVar != null) {
                lVar.mo146xb9724478(value);
            }
        }
    }

    /* renamed from: setOnDensityChanged$ui_release */
    public final void m161344xdd0d9173(yz5.l lVar) {
        this.f450271n = lVar;
    }

    /* renamed from: setOnModifierChanged$ui_release */
    public final void m161345x47a87344(yz5.l lVar) {
        this.f450269i = lVar;
    }

    /* renamed from: setOnRequestDisallowInterceptTouchEvent$ui_release */
    public final void m161346x459bb0cc(yz5.l lVar) {
        this.f450277t = lVar;
    }

    /* renamed from: setSavedStateRegistryOwner */
    public final void m161347xe70d138a(o4.g gVar) {
        if (gVar != this.f450273p) {
            this.f450273p = gVar;
            o4.j.b(this, gVar);
        }
    }

    /* renamed from: setUpdate */
    public final void m161348x264c8fcb(yz5.a value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        this.f450266f = value;
        this.f450267g = true;
        ((r2.l) this.f450276s).mo152xb9724478();
    }

    /* renamed from: setView$ui_release */
    public final void m161349xaf4b3f9(android.view.View view) {
        if (view != this.f450265e) {
            this.f450265e = view;
            removeAllViews();
            if (view != null) {
                addView(view);
                this.f450276s.mo152xb9724478();
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // n3.g0
    public void t(android.view.View target, int i17, int i18, int[] consumed, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(consumed, "consumed");
        if (isNestedScrollingEnabled()) {
            float f17 = i17;
            float f18 = -1;
            long a17 = d1.f.a(f17 * f18, i18 * f18);
            int i27 = i19 == 0 ? 1 : 2;
            o1.a aVar = this.f450264d.f423556c;
            long d17 = aVar != null ? aVar.d(a17, i27) : d1.e.f307156b;
            consumed[0] = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p3.a(d1.e.c(d17));
            consumed[1] = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p3.a(d1.e.d(d17));
        }
    }

    @Override // n3.h0
    public void z(android.view.View target, int i17, int i18, int i19, int i27, int i28, int[] consumed) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(consumed, "consumed");
        if (isNestedScrollingEnabled()) {
            float f17 = i17;
            float f18 = -1;
            long b17 = this.f450264d.b(d1.f.a(f17 * f18, i18 * f18), d1.f.a(i19 * f18, i27 * f18), i28 == 0 ? 1 : 2);
            consumed[0] = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p3.a(d1.e.c(b17));
            consumed[1] = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p3.a(d1.e.d(b17));
        }
    }
}
