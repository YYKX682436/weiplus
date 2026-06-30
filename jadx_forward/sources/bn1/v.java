package bn1;

/* loaded from: classes14.dex */
public class v extends com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1248x373aa5.AbstractGestureDetectorOnGestureListenerC12829xf500c313 {
    public yz5.l A;
    public yz5.p B;
    public yz5.p C;
    public yz5.q D;
    public yz5.s E;
    public android.view.View F;
    public android.widget.FrameLayout G;
    public android.widget.FrameLayout H;
    public android.widget.FrameLayout I;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.FrameLayout f104356J;
    public boolean K;
    public cn1.g L;
    public cn1.g M;
    public cn1.g N;
    public cn1.g P;
    public final java.util.Set Q;
    public float R;
    public float S;
    public final java.util.List T;
    public final bn1.i U;
    public android.graphics.Paint V;
    public android.graphics.Paint W;

    /* renamed from: l1, reason: collision with root package name */
    public int f104357l1;

    /* renamed from: p0, reason: collision with root package name */
    public final float[] f104358p0;

    /* renamed from: p1, reason: collision with root package name */
    public boolean f104359p1;

    /* renamed from: v, reason: collision with root package name */
    public yz5.a f104360v;

    /* renamed from: w, reason: collision with root package name */
    public yz5.l f104361w;

    /* renamed from: x, reason: collision with root package name */
    public yz5.l f104362x;

    /* renamed from: x0, reason: collision with root package name */
    public final float f104363x0;

    /* renamed from: y, reason: collision with root package name */
    public yz5.l f104364y;

    /* renamed from: y0, reason: collision with root package name */
    public int f104365y0;

    /* renamed from: z, reason: collision with root package name */
    public yz5.l f104366z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(android.content.Context context, bn1.f builder) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(builder, "builder");
        this.f104360v = bn1.h.f104341d;
        this.C = bn1.t.f104352d;
        this.D = bn1.s.f104351d;
        this.E = bn1.r.f104350d;
        this.Q = new java.util.HashSet();
        this.R = -1.0f;
        this.T = new java.util.ArrayList();
        this.U = new bn1.i();
        this.f104358p0 = new float[]{0.0f, 1.0f};
        this.f104363x0 = ym5.x.a(getContext(), 60.0f);
        this.R = -1.0f;
        this.S = builder.f104334a;
        m53917x38cb7e8(true);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
        frameLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        this.f104356J = frameLayout;
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dz9, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        m10889x43427e3f(inflate);
        android.view.View findViewById = m10871xe6eebdcb().findViewById(com.p314xaae8f345.mm.R.id.d4n);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        m10895xffc883b2((android.widget.FrameLayout) findViewById);
        android.view.View findViewById2 = m10871xe6eebdcb().findViewById(com.p314xaae8f345.mm.R.id.d4l);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        m10888xd6411aea((android.widget.FrameLayout) findViewById2);
        android.view.View findViewById3 = m10871xe6eebdcb().findViewById(com.p314xaae8f345.mm.R.id.d4m);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.I = (android.widget.FrameLayout) findViewById3;
        m10876xc8f1ea3e().setOnClickListener(bn1.j.f104342d);
        m10870x9f6a8176().setOnClickListener(bn1.k.f104343d);
        android.widget.FrameLayout frameLayout2 = this.I;
        if (frameLayout2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("footerContainer");
            throw null;
        }
        frameLayout2.setOnClickListener(bn1.l.f104344d);
        android.view.View m10871xe6eebdcb = m10871xe6eebdcb();
        android.widget.FrameLayout frameLayout3 = m10871xe6eebdcb instanceof android.widget.FrameLayout ? (android.widget.FrameLayout) m10871xe6eebdcb : null;
        if (frameLayout3 != null) {
            m10871xe6eebdcb().setOutlineProvider(new bn1.m(frameLayout3.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9)));
            m10871xe6eebdcb().setClipToOutline(true);
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, (int) this.S);
            layoutParams.gravity = 80;
            frameLayout3.setLayoutParams(layoutParams);
        }
        android.widget.FrameLayout frameLayout4 = this.f104356J;
        if (frameLayout4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("backgroundContainer");
            throw null;
        }
        addView(frameLayout4);
        addView(m10871xe6eebdcb());
        cn1.g gVar = builder.f104335b;
        if (gVar != null) {
            m10894xc4d6542e(gVar);
        }
        cn1.g gVar2 = builder.f104336c;
        if (gVar2 != null) {
            m10887x9b4eeb66(gVar2);
        }
        java.util.Iterator it = ((java.util.HashSet) builder.f104337d).iterator();
        while (it.hasNext()) {
            cn1.f callbackComponent = (cn1.f) it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callbackComponent, "callbackComponent");
            ((java.util.HashSet) this.Q).add(callbackComponent);
        }
        bn1.i area = this.U;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(area, "area");
        ((java.util.ArrayList) this.T).add(area);
        java.util.Iterator it6 = ((java.util.ArrayList) builder.f104339f).iterator();
        while (it6.hasNext()) {
            bn1.g area2 = (bn1.g) it6.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(area2, "area");
            ((java.util.ArrayList) this.T).add(area2);
        }
        setLayoutParams(builder.f104338e);
        m53918x590ab8fc(m10871xe6eebdcb());
        int i17 = builder.f104340g;
        if (i17 >= 0 && java.lang.Math.abs(i17) <= 2) {
            this.edgeAttached = i17;
        }
        m53926x14354464(this.R);
        mo10892x46e30de3(this.S);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1248x373aa5.AbstractGestureDetectorOnGestureListenerC12829xf500c313
    public void b() {
        yz5.l lVar = this.f104362x;
        if (lVar != null) {
            lVar.mo146xb9724478(this);
        }
        l(new bn1.n(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1248x373aa5.AbstractGestureDetectorOnGestureListenerC12829xf500c313
    public void c() {
        k((int) this.R, (int) this.S);
        yz5.l lVar = this.f104366z;
        if (lVar != null) {
            lVar.mo146xb9724478(this);
        }
        l(new bn1.o(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1248x373aa5.AbstractGestureDetectorOnGestureListenerC12829xf500c313
    public void d() {
        yz5.l lVar = this.f104361w;
        if (lVar != null) {
            lVar.mo146xb9724478(this);
        }
        l(new bn1.p(this));
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(android.graphics.Canvas canvas, android.view.View child, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        if (!this.f104359p1) {
            return super.drawChild(canvas, child, j17);
        }
        int save = canvas.save();
        canvas.rotate(180.0f, this.f104365y0 / 2.0f, this.f104357l1 / 2.0f);
        float f17 = this.f104365y0;
        float f18 = this.f104363x0;
        android.graphics.Paint paint = this.W;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(paint);
        canvas.drawRect(0.0f, 0.0f, f17, f18, paint);
        canvas.restoreToCount(save);
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        boolean drawChild = super.drawChild(canvas, child, j17);
        int save2 = canvas.save();
        canvas.rotate(180.0f, this.f104365y0 / 2.0f, this.f104357l1 / 2.0f);
        float f19 = this.f104365y0;
        float f27 = this.f104363x0;
        android.graphics.Paint paint2 = this.V;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(paint2);
        canvas.drawRect(0.0f, 0.0f, f19, f27, paint2);
        canvas.restoreToCount(save2);
        canvas.restoreToCount(saveLayer);
        return drawChild;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1248x373aa5.AbstractGestureDetectorOnGestureListenerC12829xf500c313
    public void e() {
        k((int) this.S, (int) this.R);
        yz5.l lVar = this.f104364y;
        if (lVar != null) {
            lVar.mo146xb9724478(this);
        }
        l(new bn1.q(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1248x373aa5.AbstractGestureDetectorOnGestureListenerC12829xf500c313
    public boolean f(android.view.MotionEvent motionEvent, android.view.MotionEvent e27, float f17, float f18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e27, "e2");
        return this.K || (((java.lang.Boolean) this.f104360v.mo152xb9724478()).booleanValue() && f18 > 0.0f && ((java.lang.Boolean) this.E.v(this, motionEvent, e27, java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18))).booleanValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0056, code lost:
    
        if (r0 != false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0077  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1248x373aa5.AbstractGestureDetectorOnGestureListenerC12829xf500c313
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean g(boolean r5, float r6) {
        /*
            r4 = this;
            yz5.a r0 = r4.f104360v
            java.lang.Object r0 = r0.mo152xb9724478()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            r2 = 0
            if (r5 != 0) goto L5a
            boolean r3 = r4.isDrawerOpen
            if (r3 == 0) goto L18
            boolean r3 = r4.K
            if (r3 != 0) goto L58
        L18:
            if (r0 == 0) goto L5a
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 < 0) goto L58
            float r0 = r4.m53916x6c20397b()
            float r3 = r4.m53899xb31a8d2()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L2d
            r0 = r1
            goto L2e
        L2d:
            r0 = r2
        L2e:
            if (r0 != 0) goto L55
            float r0 = r4.m53916x6c20397b()
            float r3 = r4.m53897x5b0187e4()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L3e
            r0 = r1
            goto L3f
        L3e:
            r0 = r2
        L3f:
            if (r0 != 0) goto L55
            float r0 = r4.m53916x6c20397b()
            float r3 = r4.m53900x5b051b9d()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L4f
            r0 = r1
            goto L50
        L4f:
            r0 = r2
        L50:
            if (r0 == 0) goto L53
            goto L55
        L53:
            r0 = r2
            goto L56
        L55:
            r0 = r1
        L56:
            if (r0 != 0) goto L5a
        L58:
            r0 = r1
            goto L5b
        L5a:
            r0 = r2
        L5b:
            if (r0 == 0) goto L74
            yz5.q r0 = r4.D
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            java.lang.Object r5 = r0.mo147xb9724478(r4, r5, r6)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L74
            goto L75
        L74:
            r1 = r2
        L75:
            if (r1 == 0) goto L80
            float r5 = r4.R
            int r5 = (int) r5
            float r6 = r4.S
            int r6 = (int) r6
            r4.k(r5, r6)
        L80:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bn1.v.g(boolean, float):boolean");
    }

    /* renamed from: getBackgroundComponent */
    public final cn1.g m10868x3e5ab839() {
        return this.P;
    }

    /* renamed from: getCenterComponent */
    public final cn1.g m10869x647851f2() {
        return this.M;
    }

    /* renamed from: getCenterContainer */
    public final android.widget.FrameLayout m10870x9f6a8176() {
        android.widget.FrameLayout frameLayout = this.H;
        if (frameLayout != null) {
            return frameLayout;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("centerContainer");
        throw null;
    }

    /* renamed from: getContainer */
    public final android.view.View m10871xe6eebdcb() {
        android.view.View view = this.F;
        if (view != null) {
            return view;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("container");
        throw null;
    }

    /* renamed from: getContentReachTop */
    public final yz5.a m10872x411cf845() {
        return this.f104360v;
    }

    /* renamed from: getEnableFading */
    public final boolean m10873xe5217a12() {
        return this.f104359p1;
    }

    /* renamed from: getFooterComponent */
    public final cn1.g m10874x3337776c() {
        return this.N;
    }

    /* renamed from: getHeaderComponent */
    public final cn1.g m10875x8dffbaba() {
        return this.L;
    }

    /* renamed from: getHeaderContainer */
    public final android.widget.FrameLayout m10876xc8f1ea3e() {
        android.widget.FrameLayout frameLayout = this.G;
        if (frameLayout != null) {
            return frameLayout;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerContainer");
        throw null;
    }

    /* renamed from: getOnDrawerClose */
    public final yz5.l m10877xe8d32872() {
        return this.f104362x;
    }

    /* renamed from: getOnDrawerDetach */
    public final yz5.l m10878x32e61c59() {
        return this.A;
    }

    /* renamed from: getOnDrawerExpand */
    public final yz5.l m10879x35a4e360() {
        return this.f104366z;
    }

    /* renamed from: getOnDrawerOpen */
    public final yz5.l m10880x4156a490() {
        return this.f104361w;
    }

    /* renamed from: getOnDrawerPeek */
    public final yz5.l m10881x4156efa1() {
        return this.f104364y;
    }

    /* renamed from: getOnInterceptFling */
    public final yz5.s m10882x3b5f34ef() {
        return this.E;
    }

    /* renamed from: getOnInterceptScroll */
    public final yz5.q m10883x463bb19a() {
        return this.D;
    }

    /* renamed from: getOnInterceptTouch */
    public final yz5.p m10884x3c2606d2() {
        return this.C;
    }

    /* renamed from: getOnTranslationChange */
    public final yz5.p m10885x8d7b126c() {
        return this.B;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1248x373aa5.AbstractGestureDetectorOnGestureListenerC12829xf500c313
    public boolean h(android.view.MotionEvent e17) {
        android.view.View a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        int action = e17.getAction();
        if (action == 0) {
            this.K = false;
            java.util.Iterator it = ((java.util.ArrayList) this.T).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ((bn1.i) ((bn1.g) it.next())).getClass();
                android.graphics.Rect rect = new android.graphics.Rect();
                cn1.g m10875x8dffbaba = m10875x8dffbaba();
                if (m10875x8dffbaba != null && (a17 = m10875x8dffbaba.a()) != null) {
                    a17.getGlobalVisibleRect(rect);
                }
                if (rect.contains((int) e17.getX(), (int) e17.getY())) {
                    this.K = true;
                    break;
                }
            }
        } else if (action == 1 || action == 3) {
            this.K = false;
        }
        boolean z17 = this.isDrawerOpen && ((java.lang.Boolean) this.C.mo149xb9724478(this, e17)).booleanValue();
        if (!z17) {
            this.K = false;
        }
        return z17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1248x373aa5.AbstractGestureDetectorOnGestureListenerC12829xf500c313
    public void i(float f17, java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        yz5.p pVar = this.B;
        if (pVar != null) {
            pVar.mo149xb9724478(this, java.lang.Float.valueOf(f17));
        }
        l(new bn1.u(this, f17, source));
    }

    public final void k(int i17, int i18) {
        if (m10871xe6eebdcb().getLayoutParams().height == i17) {
            android.view.View m10871xe6eebdcb = m10871xe6eebdcb();
            android.view.ViewGroup.LayoutParams layoutParams = m10871xe6eebdcb().getLayoutParams();
            layoutParams.height = i18;
            m10871xe6eebdcb.setLayoutParams(layoutParams);
            android.view.View m10871xe6eebdcb2 = m10871xe6eebdcb();
            float f17 = i17 - i18;
            m10871xe6eebdcb2.setTranslationY(m10871xe6eebdcb2.getTranslationY() - f17);
            m53925x5783fbbb(getOriginalTranslationY() - f17);
        }
    }

    public final void l(yz5.l lVar) {
        cn1.g gVar = this.L;
        if (gVar != null) {
            lVar.mo146xb9724478(gVar);
        }
        cn1.g gVar2 = this.M;
        if (gVar2 != null) {
            lVar.mo146xb9724478(gVar2);
        }
        cn1.g gVar3 = this.N;
        if (gVar3 != null) {
            lVar.mo146xb9724478(gVar3);
        }
        cn1.g gVar4 = this.P;
        if (gVar4 != null) {
            lVar.mo146xb9724478(gVar4);
        }
        java.util.Iterator it = this.Q.iterator();
        while (it.hasNext()) {
            lVar.mo146xb9724478((cn1.f) it.next());
        }
    }

    public final void m(android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.ViewParent parent = view.getParent();
        android.view.ViewGroup viewGroup2 = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup2 != null) {
            viewGroup2.removeView(view);
        }
        viewGroup.removeAllViews();
        viewGroup.addView(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yz5.l lVar = this.A;
        if (lVar != null) {
            lVar.mo146xb9724478(this);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1248x373aa5.AbstractGestureDetectorOnGestureListenerC12829xf500c313, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent e17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        super.onSingleTapUp(e17);
        return false;
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.V = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint paint2 = this.V;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(paint2);
        paint2.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OUT));
        int[] iArr = {com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw), 0};
        android.graphics.Paint paint3 = this.V;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(paint3);
        paint3.setShader(new android.graphics.LinearGradient(0.0f, 0.0f, 0.0f, this.f104363x0, iArr, this.f104358p0, android.graphics.Shader.TileMode.CLAMP));
        android.graphics.Paint paint4 = new android.graphics.Paint();
        this.W = paint4;
        paint4.setColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        this.f104365y0 = getWidth();
        this.f104357l1 = getHeight();
    }

    /* renamed from: setBackgroundComponent */
    public final void m10886x8c9f77ad(cn1.g component) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        this.P = component;
        android.view.View a17 = component.a();
        if (a17 != null) {
            android.widget.FrameLayout frameLayout = this.f104356J;
            if (frameLayout != null) {
                m(frameLayout, a17);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("backgroundContainer");
                throw null;
            }
        }
    }

    /* renamed from: setCenterComponent */
    public final void m10887x9b4eeb66(cn1.g component) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        this.M = component;
        android.view.View a17 = component.a();
        if (a17 != null) {
            m(m10870x9f6a8176(), a17);
        }
    }

    /* renamed from: setCenterContainer */
    public final void m10888xd6411aea(android.widget.FrameLayout frameLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameLayout, "<set-?>");
        this.H = frameLayout;
    }

    /* renamed from: setContainer */
    public final void m10889x43427e3f(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<set-?>");
        this.F = view;
    }

    /* renamed from: setContentReachTop */
    public final void m10890x77f391b9(yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aVar, "<set-?>");
        this.f104360v = aVar;
    }

    /* renamed from: setEnableFading */
    public final void m10891x1b6a751e(boolean z17) {
        this.f104359p1 = z17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1248x373aa5.AbstractGestureDetectorOnGestureListenerC12829xf500c313
    /* renamed from: setExpandHeight */
    public void mo10892x46e30de3(float f17) {
        super.mo10892x46e30de3(f17);
        if (this.S == f17) {
            return;
        }
        this.S = f17;
        android.view.View m10871xe6eebdcb = m10871xe6eebdcb();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca55 = m10871xe6eebdcb instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55) m10871xe6eebdcb : null;
        if (c22646x1e9ca55 != null) {
            c22646x1e9ca55.getLayoutParams().height = (int) this.S;
            c22646x1e9ca55.requestLayout();
        }
    }

    /* renamed from: setFooterComponent */
    public final void m10893x6a0e10e0(cn1.g component) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        this.N = component;
        android.view.View a17 = component.a();
        if (a17 != null) {
            android.widget.FrameLayout frameLayout = this.I;
            if (frameLayout != null) {
                m(frameLayout, a17);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("footerContainer");
                throw null;
            }
        }
    }

    /* renamed from: setHeaderComponent */
    public final void m10894xc4d6542e(cn1.g component) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        this.L = component;
        android.view.View a17 = component.a();
        if (a17 != null) {
            m(m10876xc8f1ea3e(), a17);
        }
    }

    /* renamed from: setHeaderContainer */
    public final void m10895xffc883b2(android.widget.FrameLayout frameLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameLayout, "<set-?>");
        this.G = frameLayout;
    }

    /* renamed from: setOnDrawerClose */
    public final void m10896x7ba98ee6(yz5.l lVar) {
        this.f104362x = lVar;
    }

    /* renamed from: setOnDrawerDetach */
    public final void m10897xfadc8465(yz5.l lVar) {
        this.A = lVar;
    }

    /* renamed from: setOnDrawerExpand */
    public final void m10898xfd9b4b6c(yz5.l lVar) {
        this.f104366z = lVar;
    }

    /* renamed from: setOnDrawerOpen */
    public final void m10899x779f9f9c(yz5.l lVar) {
        this.f104361w = lVar;
    }

    /* renamed from: setOnDrawerPeek */
    public final void m10900x779feaad(yz5.l lVar) {
        this.f104364y = lVar;
    }

    /* renamed from: setOnInterceptFling */
    public final void m10901xdf5bc9fb(yz5.s sVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sVar, "<set-?>");
        this.E = sVar;
    }

    /* renamed from: setOnInterceptScroll */
    public final void m10902x21d1be0e(yz5.q qVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(qVar, "<set-?>");
        this.D = qVar;
    }

    /* renamed from: setOnInterceptTouch */
    public final void m10903xe0229bde(yz5.p pVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pVar, "<set-?>");
        this.C = pVar;
    }

    /* renamed from: setOnTranslationChange */
    public final void m10904xdbbfd1e0(yz5.p pVar) {
        this.B = pVar;
    }
}
