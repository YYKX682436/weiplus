package gx2;

/* loaded from: classes2.dex */
public class q extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1664xb118f8f1.AbstractGestureDetectorOnGestureListenerC15396x3fa945f1 {
    public yz5.l A;
    public yz5.l B;
    public yz5.p C;
    public yz5.p D;
    public yz5.q E;
    public yz5.s F;
    public android.view.View G;
    public android.widget.FrameLayout H;
    public android.widget.FrameLayout I;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.FrameLayout f358895J;
    public android.widget.FrameLayout K;
    public boolean L;
    public hx2.i M;
    public hx2.i N;
    public hx2.i P;
    public hx2.i Q;
    public final java.util.Set R;
    public float S;
    public float T;
    public final java.util.List U;
    public boolean V;
    public final gx2.d W;

    /* renamed from: l1, reason: collision with root package name */
    public final float f358896l1;

    /* renamed from: p0, reason: collision with root package name */
    public android.graphics.Paint f358897p0;

    /* renamed from: p1, reason: collision with root package name */
    public int f358898p1;

    /* renamed from: v, reason: collision with root package name */
    public yz5.a f358899v;

    /* renamed from: w, reason: collision with root package name */
    public yz5.l f358900w;

    /* renamed from: x, reason: collision with root package name */
    public yz5.p f358901x;

    /* renamed from: x0, reason: collision with root package name */
    public android.graphics.Paint f358902x0;

    /* renamed from: x1, reason: collision with root package name */
    public int f358903x1;

    /* renamed from: y, reason: collision with root package name */
    public yz5.l f358904y;

    /* renamed from: y0, reason: collision with root package name */
    public final float[] f358905y0;

    /* renamed from: y1, reason: collision with root package name */
    public boolean f358906y1;

    /* renamed from: z, reason: collision with root package name */
    public yz5.l f358907z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(android.content.Context context, gx2.a builder) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(builder, "builder");
        this.f358899v = gx2.c.f358879d;
        this.D = gx2.o.f358891d;
        this.E = gx2.n.f358890d;
        this.F = gx2.m.f358889d;
        this.R = new java.util.HashSet();
        this.S = -1.0f;
        this.U = new java.util.ArrayList();
        this.W = new gx2.d();
        this.f358905y0 = new float[]{0.0f, 1.0f};
        this.f358896l1 = ym5.x.a(getContext(), 60.0f);
        this.S = builder.f358868a;
        this.T = builder.f358870c;
        m62638x38cb7e8(true);
        this.V = builder.f358869b;
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
        frameLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        this.K = frameLayout;
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ag8, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        m132473x43427e3f(inflate);
        android.view.View findViewById = m132454xe6eebdcb().findViewById(com.p314xaae8f345.mm.R.id.d4n);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        m132479xffc883b2((android.widget.FrameLayout) findViewById);
        android.view.View findViewById2 = m132454xe6eebdcb().findViewById(com.p314xaae8f345.mm.R.id.d4l);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        m132472xd6411aea((android.widget.FrameLayout) findViewById2);
        android.view.View findViewById3 = m132454xe6eebdcb().findViewById(com.p314xaae8f345.mm.R.id.d4m);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f358895J = (android.widget.FrameLayout) findViewById3;
        m132459xc8f1ea3e().setOnClickListener(gx2.e.f358880d);
        m132453x9f6a8176().setOnClickListener(gx2.f.f358881d);
        android.widget.FrameLayout frameLayout2 = this.f358895J;
        if (frameLayout2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("footerContainer");
            throw null;
        }
        frameLayout2.setOnClickListener(gx2.g.f358882d);
        android.view.View m132454xe6eebdcb = m132454xe6eebdcb();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca55 = m132454xe6eebdcb instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55) m132454xe6eebdcb : null;
        if (c22646x1e9ca55 != null) {
            float dimension = c22646x1e9ca55.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
            c22646x1e9ca55.b(dimension, dimension, 0.0f, 0.0f);
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, (int) this.T);
            layoutParams.gravity = 80;
            c22646x1e9ca55.setLayoutParams(layoutParams);
        }
        android.widget.FrameLayout frameLayout3 = this.K;
        if (frameLayout3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("backgroundContainer");
            throw null;
        }
        addView(frameLayout3);
        addView(m132454xe6eebdcb());
        hx2.i iVar = builder.f358871d;
        if (iVar != null) {
            m132478xc4d6542e(iVar);
        }
        hx2.i iVar2 = builder.f358872e;
        if (iVar2 != null) {
            m132471x9b4eeb66(iVar2);
        }
        hx2.i iVar3 = builder.f358873f;
        if (iVar3 != null) {
            m132470x8c9f77ad(iVar3);
        }
        java.util.Iterator it = ((java.util.HashSet) builder.f358874g).iterator();
        while (it.hasNext()) {
            hx2.h callbackComponent = (hx2.h) it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callbackComponent, "callbackComponent");
            callbackComponent.f367189a = this;
            ((java.util.HashSet) this.R).add(callbackComponent);
        }
        if (builder.f358878k != 0) {
            m132454xe6eebdcb().setBackgroundColor(builder.f358878k);
        }
        gx2.d area = this.W;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(area, "area");
        ((java.util.ArrayList) this.U).add(area);
        java.util.Iterator it6 = ((java.util.ArrayList) builder.f358876i).iterator();
        while (it6.hasNext()) {
            gx2.b area2 = (gx2.b) it6.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(area2, "area");
            ((java.util.ArrayList) this.U).add(area2);
        }
        setLayoutParams(builder.f358875h);
        m62639x590ab8fc(m132454xe6eebdcb());
        int i17 = builder.f358877j;
        if (i17 >= 0 && java.lang.Math.abs(i17) <= 2) {
            this.edgeAttached = i17;
        }
        m62649x14354464(this.S);
        mo62645x46e30de3(this.T);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1664xb118f8f1.AbstractGestureDetectorOnGestureListenerC15396x3fa945f1
    public void d() {
        r(new gx2.h(this));
        yz5.l lVar = this.f358904y;
        if (lVar != null) {
            lVar.mo146xb9724478(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(android.graphics.Canvas canvas, android.view.View child, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        if (!this.f358906y1) {
            return super.drawChild(canvas, child, j17);
        }
        int save = canvas.save();
        canvas.rotate(180.0f, this.f358898p1 / 2.0f, this.f358903x1 / 2.0f);
        float f17 = this.f358898p1;
        float f18 = this.f358896l1;
        android.graphics.Paint paint = this.f358902x0;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(paint);
        canvas.drawRect(0.0f, 0.0f, f17, f18, paint);
        canvas.restoreToCount(save);
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        boolean drawChild = super.drawChild(canvas, child, j17);
        int save2 = canvas.save();
        canvas.rotate(180.0f, this.f358898p1 / 2.0f, this.f358903x1 / 2.0f);
        float f19 = this.f358898p1;
        float f27 = this.f358896l1;
        android.graphics.Paint paint2 = this.f358897p0;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(paint2);
        canvas.drawRect(0.0f, 0.0f, f19, f27, paint2);
        canvas.restoreToCount(save2);
        canvas.restoreToCount(saveLayer);
        return drawChild;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1664xb118f8f1.AbstractGestureDetectorOnGestureListenerC15396x3fa945f1
    public void e() {
        q((int) this.S, (int) this.T);
        yz5.l lVar = this.A;
        if (lVar != null) {
            lVar.mo146xb9724478(this);
        }
        r(new gx2.i(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1664xb118f8f1.AbstractGestureDetectorOnGestureListenerC15396x3fa945f1
    public void f() {
        yz5.l lVar = this.f358900w;
        if (lVar != null) {
            lVar.mo146xb9724478(this);
        }
        r(new gx2.j(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1664xb118f8f1.AbstractGestureDetectorOnGestureListenerC15396x3fa945f1
    public void g() {
        if (!this.V) {
            q((int) this.T, (int) this.S);
        }
        yz5.l lVar = this.f358907z;
        if (lVar != null) {
            lVar.mo146xb9724478(this);
        }
        r(new gx2.k(this));
    }

    /* renamed from: getBackgroundComponent */
    public final hx2.i m132451x3e5ab839() {
        return this.Q;
    }

    /* renamed from: getCenterComponent */
    public final hx2.i m132452x647851f2() {
        return this.N;
    }

    /* renamed from: getCenterContainer */
    public final android.widget.FrameLayout m132453x9f6a8176() {
        android.widget.FrameLayout frameLayout = this.I;
        if (frameLayout != null) {
            return frameLayout;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("centerContainer");
        throw null;
    }

    /* renamed from: getContainer */
    public final android.view.View m132454xe6eebdcb() {
        android.view.View view = this.G;
        if (view != null) {
            return view;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("container");
        throw null;
    }

    /* renamed from: getContentReachTop */
    public final yz5.a m132455x411cf845() {
        return this.f358899v;
    }

    /* renamed from: getEnableFading */
    public final boolean m132456xe5217a12() {
        return this.f358906y1;
    }

    /* renamed from: getFooterComponent */
    public final hx2.i m132457x3337776c() {
        return this.P;
    }

    /* renamed from: getHeaderComponent */
    public final hx2.i m132458x8dffbaba() {
        return this.M;
    }

    /* renamed from: getHeaderContainer */
    public final android.widget.FrameLayout m132459xc8f1ea3e() {
        android.widget.FrameLayout frameLayout = this.H;
        if (frameLayout != null) {
            return frameLayout;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerContainer");
        throw null;
    }

    /* renamed from: getOnDrawerClose */
    public final yz5.l m132460xe8d32872() {
        return this.f358904y;
    }

    /* renamed from: getOnDrawerDetach */
    public final yz5.l m132461x32e61c59() {
        return this.B;
    }

    /* renamed from: getOnDrawerExpand */
    public final yz5.l m132462x35a4e360() {
        return this.A;
    }

    /* renamed from: getOnDrawerOpen */
    public final yz5.l m132463x4156a490() {
        return this.f358900w;
    }

    /* renamed from: getOnDrawerPeek */
    public final yz5.l m132464x4156efa1() {
        return this.f358907z;
    }

    /* renamed from: getOnDrawerWillClose */
    public final yz5.p m132465x32a9cec0() {
        return this.f358901x;
    }

    /* renamed from: getOnInterceptFling */
    public final yz5.s m132466x3b5f34ef() {
        return this.F;
    }

    /* renamed from: getOnInterceptScroll */
    public final yz5.q m132467x463bb19a() {
        return this.E;
    }

    /* renamed from: getOnInterceptTouch */
    public final yz5.p m132468x3c2606d2() {
        return this.D;
    }

    /* renamed from: getOnTranslationChange */
    public final yz5.p m132469x8d7b126c() {
        return this.C;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1664xb118f8f1.AbstractGestureDetectorOnGestureListenerC15396x3fa945f1
    public void h(gx2.r closeAction) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(closeAction, "closeAction");
        r(new gx2.l(this, closeAction));
        yz5.p pVar = this.f358901x;
        if (pVar != null) {
            pVar.mo149xb9724478(this, closeAction);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1664xb118f8f1.AbstractGestureDetectorOnGestureListenerC15396x3fa945f1
    public boolean i(android.view.MotionEvent motionEvent, android.view.MotionEvent e27, float f17, float f18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e27, "e2");
        return this.L || (((java.lang.Boolean) this.f358899v.mo152xb9724478()).booleanValue() && f18 > 0.0f && ((java.lang.Boolean) this.F.v(this, motionEvent, e27, java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18))).booleanValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0056, code lost:
    
        if (r0 != false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0077  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1664xb118f8f1.AbstractGestureDetectorOnGestureListenerC15396x3fa945f1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean j(boolean r5, float r6) {
        /*
            r4 = this;
            yz5.a r0 = r4.f358899v
            java.lang.Object r0 = r0.mo152xb9724478()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            r2 = 0
            if (r5 != 0) goto L5a
            boolean r3 = r4.isDrawerOpen
            if (r3 == 0) goto L18
            boolean r3 = r4.L
            if (r3 != 0) goto L58
        L18:
            if (r0 == 0) goto L5a
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 < 0) goto L58
            float r0 = r4.m62637x6c20397b()
            float r3 = r4.m62619xb31a8d2()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L2d
            r0 = r1
            goto L2e
        L2d:
            r0 = r2
        L2e:
            if (r0 != 0) goto L55
            float r0 = r4.m62637x6c20397b()
            float r3 = r4.m62617x5b0187e4()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L3e
            r0 = r1
            goto L3f
        L3e:
            r0 = r2
        L3f:
            if (r0 != 0) goto L55
            float r0 = r4.m62637x6c20397b()
            float r3 = r4.m62620x5b051b9d()
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
            yz5.q r0 = r4.E
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
            float r5 = r4.S
            int r5 = (int) r5
            float r6 = r4.T
            int r6 = (int) r6
            r4.q(r5, r6)
        L80:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: gx2.q.j(boolean, float):boolean");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1664xb118f8f1.AbstractGestureDetectorOnGestureListenerC15396x3fa945f1
    public boolean k(android.view.MotionEvent e17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        int action = e17.getAction();
        if (action == 0) {
            this.L = false;
            java.util.Iterator it = this.U.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((gx2.b) it.next()).G6(this).contains((int) e17.getX(), (int) e17.getY())) {
                    this.L = true;
                    break;
                }
            }
        } else if (action == 1 || action == 3) {
            this.L = false;
        }
        boolean z17 = this.isDrawerOpen && ((java.lang.Boolean) this.D.mo149xb9724478(this, e17)).booleanValue();
        if (!z17) {
            this.L = false;
        }
        return z17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1664xb118f8f1.AbstractGestureDetectorOnGestureListenerC15396x3fa945f1
    public void l(float f17, java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        yz5.p pVar = this.C;
        if (pVar != null) {
            pVar.mo149xb9724478(this, java.lang.Float.valueOf(f17));
        }
        r(new gx2.p(this, f17, source));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yz5.l lVar = this.B;
        if (lVar != null) {
            lVar.mo146xb9724478(this);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1664xb118f8f1.AbstractGestureDetectorOnGestureListenerC15396x3fa945f1, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent e17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        super.onSingleTapUp(e17);
        return false;
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f358897p0 = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint paint2 = this.f358897p0;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(paint2);
        paint2.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OUT));
        int[] iArr = {com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw), 0};
        android.graphics.Paint paint3 = this.f358897p0;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(paint3);
        paint3.setShader(new android.graphics.LinearGradient(0.0f, 0.0f, 0.0f, this.f358896l1, iArr, this.f358905y0, android.graphics.Shader.TileMode.CLAMP));
        android.graphics.Paint paint4 = new android.graphics.Paint();
        this.f358902x0 = paint4;
        paint4.setColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        this.f358898p1 = getWidth();
        this.f358903x1 = getHeight();
    }

    public final void q(int i17, int i18) {
        if (m132454xe6eebdcb().getLayoutParams().height == i17) {
            android.view.View m132454xe6eebdcb = m132454xe6eebdcb();
            android.view.ViewGroup.LayoutParams layoutParams = m132454xe6eebdcb().getLayoutParams();
            layoutParams.height = i18;
            m132454xe6eebdcb.setLayoutParams(layoutParams);
            android.view.View m132454xe6eebdcb2 = m132454xe6eebdcb();
            float f17 = i17 - i18;
            m132454xe6eebdcb2.setTranslationY(m132454xe6eebdcb2.getTranslationY() - f17);
            m62648x5783fbbb(getOriginalTranslationY() - f17);
        }
    }

    public final void r(yz5.l lVar) {
        hx2.i iVar = this.M;
        if (iVar != null) {
            lVar.mo146xb9724478(iVar);
        }
        hx2.i iVar2 = this.N;
        if (iVar2 != null) {
            lVar.mo146xb9724478(iVar2);
        }
        hx2.i iVar3 = this.P;
        if (iVar3 != null) {
            lVar.mo146xb9724478(iVar3);
        }
        hx2.i iVar4 = this.Q;
        if (iVar4 != null) {
            lVar.mo146xb9724478(iVar4);
        }
        java.util.Iterator it = this.R.iterator();
        while (it.hasNext()) {
            lVar.mo146xb9724478((hx2.h) it.next());
        }
    }

    public final void s(android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.ViewParent parent = view.getParent();
        android.view.ViewGroup viewGroup2 = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup2 != null) {
            viewGroup2.removeView(view);
        }
        viewGroup.removeAllViews();
        viewGroup.addView(view);
    }

    /* renamed from: setBackgroundComponent */
    public final void m132470x8c9f77ad(hx2.i component) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        this.Q = component;
        component.f367189a = this;
        android.view.View a17 = component.a();
        if (a17 != null) {
            android.widget.FrameLayout frameLayout = this.K;
            if (frameLayout != null) {
                s(frameLayout, a17);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("backgroundContainer");
                throw null;
            }
        }
    }

    /* renamed from: setCenterComponent */
    public final void m132471x9b4eeb66(hx2.i component) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        this.N = component;
        component.f367189a = this;
        android.view.View a17 = component.a();
        if (a17 != null) {
            s(m132453x9f6a8176(), a17);
        }
    }

    /* renamed from: setCenterContainer */
    public final void m132472xd6411aea(android.widget.FrameLayout frameLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameLayout, "<set-?>");
        this.I = frameLayout;
    }

    /* renamed from: setContainer */
    public final void m132473x43427e3f(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<set-?>");
        this.G = view;
    }

    /* renamed from: setContentReachTop */
    public final void m132474x77f391b9(yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aVar, "<set-?>");
        this.f358899v = aVar;
    }

    /* renamed from: setEnableFading */
    public final void m132475x1b6a751e(boolean z17) {
        this.f358906y1 = z17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1664xb118f8f1.AbstractGestureDetectorOnGestureListenerC15396x3fa945f1
    /* renamed from: setExpandHeight */
    public void mo62645x46e30de3(float f17) {
        super.mo62645x46e30de3(f17);
        if (this.T == f17) {
            return;
        }
        this.T = f17;
        m62640xee20281a(gx2.s.f358915f);
        android.view.View m132454xe6eebdcb = m132454xe6eebdcb();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca55 = m132454xe6eebdcb instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55) m132454xe6eebdcb : null;
        if (c22646x1e9ca55 != null) {
            c22646x1e9ca55.getLayoutParams().height = (int) this.T;
            c22646x1e9ca55.requestLayout();
        }
    }

    /* renamed from: setExpandHeightAndLayoutIfNeeded */
    public final void m132476xe4d36290(float f17) {
        super.mo62645x46e30de3(f17);
        if (this.T == f17) {
            return;
        }
        this.T = f17;
        android.view.View m132454xe6eebdcb = m132454xe6eebdcb();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca55 = m132454xe6eebdcb instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55) m132454xe6eebdcb : null;
        if (c22646x1e9ca55 != null) {
            c22646x1e9ca55.getLayoutParams().height = (int) this.T;
            c22646x1e9ca55.requestLayout();
        }
        if (getCurrentState() == gx2.s.f358914e) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1664xb118f8f1.AbstractGestureDetectorOnGestureListenerC15396x3fa945f1.b(this, false, null, false, null, 10, null);
        }
    }

    /* renamed from: setFooterComponent */
    public final void m132477x6a0e10e0(hx2.i component) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        this.P = component;
        component.f367189a = this;
        android.view.View a17 = component.a();
        if (a17 != null) {
            android.widget.FrameLayout frameLayout = this.f358895J;
            if (frameLayout != null) {
                s(frameLayout, a17);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("footerContainer");
                throw null;
            }
        }
    }

    /* renamed from: setHeaderComponent */
    public final void m132478xc4d6542e(hx2.i component) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        this.M = component;
        component.f367189a = this;
        android.view.View a17 = component.a();
        if (a17 != null) {
            s(m132459xc8f1ea3e(), a17);
        }
    }

    /* renamed from: setHeaderContainer */
    public final void m132479xffc883b2(android.widget.FrameLayout frameLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameLayout, "<set-?>");
        this.H = frameLayout;
    }

    /* renamed from: setOnDrawerClose */
    public final void m132480x7ba98ee6(yz5.l lVar) {
        this.f358904y = lVar;
    }

    /* renamed from: setOnDrawerDetach */
    public final void m132481xfadc8465(yz5.l lVar) {
        this.B = lVar;
    }

    /* renamed from: setOnDrawerExpand */
    public final void m132482xfd9b4b6c(yz5.l lVar) {
        this.A = lVar;
    }

    /* renamed from: setOnDrawerOpen */
    public final void m132483x779f9f9c(yz5.l lVar) {
        this.f358900w = lVar;
    }

    /* renamed from: setOnDrawerPeek */
    public final void m132484x779feaad(yz5.l lVar) {
        this.f358907z = lVar;
    }

    /* renamed from: setOnDrawerWillClose */
    public final void m132485xe3fdb34(yz5.p pVar) {
        this.f358901x = pVar;
    }

    /* renamed from: setOnInterceptFling */
    public final void m132486xdf5bc9fb(yz5.s sVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sVar, "<set-?>");
        this.F = sVar;
    }

    /* renamed from: setOnInterceptScroll */
    public final void m132487x21d1be0e(yz5.q qVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(qVar, "<set-?>");
        this.E = qVar;
    }

    /* renamed from: setOnInterceptTouch */
    public final void m132488xe0229bde(yz5.p pVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pVar, "<set-?>");
        this.D = pVar;
    }

    /* renamed from: setOnTranslationChange */
    public final void m132489xdbbfd1e0(yz5.p pVar) {
        this.C = pVar;
    }

    /* renamed from: setPeekHeightAndLayoutIfNeeded */
    public final void m132490xf8f6de2f(float f17) {
        if (this.S == f17) {
            return;
        }
        this.S = f17;
        if (getCurrentState() != gx2.s.f358914e) {
            m62649x14354464(f17);
        } else {
            p(f17);
            requestLayout();
        }
    }
}
