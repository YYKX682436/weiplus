package s2;

/* loaded from: classes14.dex */
public final class b0 extends p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.AbstractC1058x6d8e7db5 {
    public final android.graphics.Rect A;
    public final n0.v2 B;
    public boolean C;
    public final int[] D;

    /* renamed from: n, reason: collision with root package name */
    public yz5.a f483730n;

    /* renamed from: o, reason: collision with root package name */
    public s2.g0 f483731o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f483732p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f483733q;

    /* renamed from: r, reason: collision with root package name */
    public final s2.c0 f483734r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.WindowManager f483735s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.WindowManager.LayoutParams f483736t;

    /* renamed from: u, reason: collision with root package name */
    public s2.f0 f483737u;

    /* renamed from: v, reason: collision with root package name */
    public p2.s f483738v;

    /* renamed from: w, reason: collision with root package name */
    public final n0.v2 f483739w;

    /* renamed from: x, reason: collision with root package name */
    public final n0.v2 f483740x;

    /* renamed from: y, reason: collision with root package name */
    public p2.o f483741y;

    /* renamed from: z, reason: collision with root package name */
    public final n0.e5 f483742z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b0(yz5.a r15, s2.g0 r16, java.lang.String r17, android.view.View r18, p2.f r19, s2.f0 r20, java.util.UUID r21, s2.c0 r22, int r23, p3321xbce91901.jvm.p3324x21ffc6bd.i r24) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s2.b0.<init>(yz5.a, s2.g0, java.lang.String, android.view.View, p2.f, s2.f0, java.util.UUID, s2.c0, int, kotlin.jvm.internal.i):void");
    }

    /* renamed from: getContent */
    private final yz5.p m163629x76847043() {
        return (yz5.p) this.B.mo128745x754a37bb();
    }

    /* renamed from: getDisplayHeight */
    private final int m163630x3de938d3() {
        return a06.d.b(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density);
    }

    /* renamed from: getDisplayWidth */
    private final int m163631xc0c3e09a() {
        return a06.d.b(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density);
    }

    /* renamed from: getParams$ui_release$annotations */
    public static /* synthetic */ void m163632xe405c104() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getParentLayoutCoordinates */
    public final s1.z m163633xd296f0b1() {
        return (s1.z) this.f483740x.mo128745x754a37bb();
    }

    /* renamed from: setClippingEnabled */
    private final void m163634x3090135d(boolean z17) {
        android.view.WindowManager.LayoutParams layoutParams = this.f483736t;
        layoutParams.flags = z17 ? layoutParams.flags & (-513) : layoutParams.flags | 512;
        ((s2.e0) this.f483734r).b(this.f483735s, this, layoutParams);
    }

    /* renamed from: setContent */
    private final void m163635xe9f5bdb7(yz5.p pVar) {
        ((n0.q4) this.B).mo148714x53d8522f(pVar);
    }

    /* renamed from: setIsFocusable */
    private final void m163636x1791ba66(boolean z17) {
        android.view.WindowManager.LayoutParams layoutParams = this.f483736t;
        layoutParams.flags = !z17 ? layoutParams.flags | 8 : layoutParams.flags & (-9);
        ((s2.e0) this.f483734r).b(this.f483735s, this, layoutParams);
    }

    /* renamed from: setParentLayoutCoordinates */
    private final void m163637xe8c6d625(s1.z zVar) {
        ((n0.q4) this.f483740x).mo148714x53d8522f(zVar);
    }

    /* renamed from: setSecurePolicy */
    private final void m163638xb5dec50b(s2.h0 h0Var) {
        android.view.View view = this.f483733q;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        android.view.ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        android.view.WindowManager.LayoutParams layoutParams2 = layoutParams instanceof android.view.WindowManager.LayoutParams ? (android.view.WindowManager.LayoutParams) layoutParams : null;
        boolean z17 = true;
        boolean z18 = (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(h0Var, "<this>");
        int ordinal = h0Var.ordinal();
        if (ordinal == 0) {
            z17 = z18;
        } else if (ordinal != 1) {
            if (ordinal != 2) {
                throw new jz5.j();
            }
            z17 = false;
        }
        android.view.WindowManager.LayoutParams layoutParams3 = this.f483736t;
        layoutParams3.flags = z17 ? layoutParams3.flags | 8192 : layoutParams3.flags & (-8193);
        ((s2.e0) this.f483734r).b(this.f483735s, this, layoutParams3);
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.AbstractC1058x6d8e7db5
    public void a(n0.o oVar, int i17) {
        java.lang.Object obj = n0.e1.f415025a;
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(-857613600);
        m163629x76847043().mo149xb9724478(y0Var, 0);
        n0.f4 q17 = y0Var.q();
        if (q17 == null) {
            return;
        }
        ((n0.l3) q17).f415141d = new s2.z(this, i17);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent event) {
        android.view.KeyEvent.DispatcherState keyDispatcherState;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (event.getKeyCode() == 4 && this.f483731o.f483757b) {
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(event);
            }
            if (event.getAction() == 0 && event.getRepeatCount() == 0) {
                android.view.KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(event, this);
                }
                return true;
            }
            if (event.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(event) && !event.isCanceled()) {
                yz5.a aVar = this.f483730n;
                if (aVar != null) {
                    aVar.mo152xb9724478();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(event);
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.AbstractC1058x6d8e7db5
    public void e(boolean z17, int i17, int i18, int i19, int i27) {
        super.e(z17, i17, i18, i19, i27);
        android.view.View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        android.view.WindowManager.LayoutParams layoutParams = this.f483736t;
        layoutParams.width = childAt.getMeasuredWidth();
        layoutParams.height = childAt.getMeasuredHeight();
        ((s2.e0) this.f483734r).b(this.f483735s, this, layoutParams);
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.AbstractC1058x6d8e7db5
    public void f(int i17, int i18) {
        this.f483731o.getClass();
        super.f(android.view.View.MeasureSpec.makeMeasureSpec(m163631xc0c3e09a(), Integer.MIN_VALUE), android.view.View.MeasureSpec.makeMeasureSpec(m163630x3de938d3(), Integer.MIN_VALUE));
    }

    /* renamed from: getCanCalculatePosition */
    public final boolean m163639x87df5135() {
        return ((java.lang.Boolean) ((n0.x1) this.f483742z).mo128745x754a37bb()).booleanValue();
    }

    /* renamed from: getParams$ui_release */
    public final android.view.WindowManager.LayoutParams m163640xe47caa84() {
        return this.f483736t;
    }

    /* renamed from: getParentLayoutDirection */
    public final p2.s m163641xa56df3b5() {
        return this.f483738v;
    }

    /* renamed from: getPopupContentSize-bOM6tXw */
    public final p2.q m163642x99e2a2d4() {
        return (p2.q) this.f483739w.mo128745x754a37bb();
    }

    /* renamed from: getPositionProvider */
    public final s2.f0 m163643x90b631b0() {
        return this.f483737u;
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.AbstractC1058x6d8e7db5
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.C;
    }

    /* renamed from: getSubCompositionView */
    public p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.AbstractC1058x6d8e7db5 m163644x9bc7e705() {
        return this;
    }

    /* renamed from: getTestTag */
    public final java.lang.String m163645xe9041d72() {
        return this.f483732p;
    }

    /* renamed from: getViewRoot */
    public android.view.View m163646xc320929d() {
        return null;
    }

    public final void j(n0.g1 parent, yz5.p content) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        m7016xae77971(parent);
        m163635xe9f5bdb7(content);
        this.C = true;
    }

    public final void k(yz5.a aVar, s2.g0 properties, java.lang.String testTag, p2.s layoutDirection) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(properties, "properties");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(testTag, "testTag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutDirection, "layoutDirection");
        this.f483730n = aVar;
        this.f483731o = properties;
        this.f483732p = testTag;
        m163636x1791ba66(properties.f483756a);
        m163638xb5dec50b(properties.f483759d);
        m163634x3090135d(properties.f483761f);
        int ordinal = layoutDirection.ordinal();
        if (ordinal != 0) {
            i17 = 1;
            if (ordinal != 1) {
                throw new jz5.j();
            }
        } else {
            i17 = 0;
        }
        super.setLayoutDirection(i17);
    }

    public final void l() {
        s1.z m163633xd296f0b1 = m163633xd296f0b1();
        if (m163633xd296f0b1 == null) {
            return;
        }
        u1.c1 c1Var = (u1.c1) m163633xd296f0b1;
        long j17 = c1Var.f483585f;
        long u07 = c1Var.u0(d1.e.f307156b);
        long a17 = p2.n.a(a06.d.b(d1.e.c(u07)), a06.d.b(d1.e.d(u07)));
        int i17 = (int) (a17 >> 32);
        p2.o oVar = new p2.o(i17, p2.m.b(a17), ((int) (j17 >> 32)) + i17, p2.m.b(a17) + p2.q.b(j17));
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(oVar, this.f483741y)) {
            return;
        }
        this.f483741y = oVar;
        n();
    }

    public final void m(s1.z parentLayoutCoordinates) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentLayoutCoordinates, "parentLayoutCoordinates");
        m163637xe8c6d625(parentLayoutCoordinates);
        l();
    }

    public final void n() {
        p2.q m163642x99e2a2d4;
        long a17;
        p2.o oVar = this.f483741y;
        if (oVar == null || (m163642x99e2a2d4 = m163642x99e2a2d4()) == null) {
            return;
        }
        s2.c0 c0Var = this.f483734r;
        ((s2.e0) c0Var).getClass();
        android.view.View composeView = this.f483733q;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(composeView, "composeView");
        android.graphics.Rect outRect = this.A;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        composeView.getWindowVisibleDisplayFrame(outRect);
        long a18 = p2.r.a(outRect.right - outRect.left, outRect.bottom - outRect.top);
        s2.f0 f0Var = this.f483737u;
        p2.s layoutDirection = this.f483738v;
        k0.l lVar = (k0.l) f0Var;
        lVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutDirection, "layoutDirection");
        int ordinal = lVar.f384474a.ordinal();
        long j17 = lVar.f384475b;
        int i17 = oVar.f432925b;
        int i18 = oVar.f432924a;
        if (ordinal != 0) {
            long j18 = m163642x99e2a2d4.f432929a;
            if (ordinal == 1) {
                a17 = p2.n.a((i18 + ((int) (j17 >> 32))) - ((int) (j18 >> 32)), i17 + p2.m.b(j17));
            } else {
                if (ordinal != 2) {
                    throw new jz5.j();
                }
                int i19 = p2.m.f432922c;
                a17 = p2.n.a((i18 + ((int) (j17 >> 32))) - (((int) (j18 >> 32)) / 2), i17 + p2.m.b(j17));
            }
        } else {
            a17 = p2.n.a(i18 + ((int) (j17 >> 32)), i17 + p2.m.b(j17));
        }
        android.view.WindowManager.LayoutParams layoutParams = this.f483736t;
        layoutParams.x = (int) (a17 >> 32);
        layoutParams.y = p2.m.b(a17);
        if (this.f483731o.f483760e) {
            c0Var.a(this, (int) (a18 >> 32), p2.q.b(a18));
        }
        ((s2.e0) c0Var).b(this.f483735s, this, layoutParams);
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (!this.f483731o.f483758c) {
            return super.onTouchEvent(motionEvent);
        }
        boolean z17 = false;
        if ((motionEvent != null && motionEvent.getAction() == 0) && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            yz5.a aVar = this.f483730n;
            if (aVar != null) {
                aVar.mo152xb9724478();
            }
            return true;
        }
        if (motionEvent != null && motionEvent.getAction() == 4) {
            z17 = true;
        }
        if (!z17) {
            return super.onTouchEvent(motionEvent);
        }
        yz5.a aVar2 = this.f483730n;
        if (aVar2 != null) {
            aVar2.mo152xb9724478();
        }
        return true;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i17) {
    }

    /* renamed from: setParentLayoutDirection */
    public final void m163647x7580a629(p2.s sVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sVar, "<set-?>");
        this.f483738v = sVar;
    }

    /* renamed from: setPopupContentSize-fhxjrPA */
    public final void m163648x4a670db2(p2.q qVar) {
        ((n0.q4) this.f483739w).mo148714x53d8522f(qVar);
    }

    /* renamed from: setPositionProvider */
    public final void m163649x34b2c6bc(s2.f0 f0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(f0Var, "<set-?>");
        this.f483737u = f0Var;
    }

    /* renamed from: setTestTag */
    public final void m163650x5c756ae6(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        this.f483732p = str;
    }
}
