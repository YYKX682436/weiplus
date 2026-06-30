package uu3;

/* loaded from: classes5.dex */
public class u extends com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2000xb118f8f1.AbstractGestureDetectorOnGestureListenerC17037xc8d40da6 {
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
    public android.widget.FrameLayout f512831J;
    public boolean K;
    public vu3.c L;
    public vu3.c M;
    public vu3.c N;
    public vu3.c P;
    public final java.util.Set Q;
    public float R;
    public float S;
    public final java.util.List T;
    public final uu3.i U;
    public android.graphics.Paint V;
    public android.graphics.Paint W;

    /* renamed from: l1, reason: collision with root package name */
    public int f512832l1;

    /* renamed from: p0, reason: collision with root package name */
    public final float[] f512833p0;

    /* renamed from: p1, reason: collision with root package name */
    public boolean f512834p1;

    /* renamed from: v, reason: collision with root package name */
    public yz5.a f512835v;

    /* renamed from: w, reason: collision with root package name */
    public yz5.l f512836w;

    /* renamed from: x, reason: collision with root package name */
    public yz5.l f512837x;

    /* renamed from: x0, reason: collision with root package name */
    public final float f512838x0;

    /* renamed from: y, reason: collision with root package name */
    public yz5.l f512839y;

    /* renamed from: y0, reason: collision with root package name */
    public int f512840y0;

    /* renamed from: z, reason: collision with root package name */
    public yz5.l f512841z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(android.content.Context context, uu3.f builder) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(builder, "builder");
        this.f512835v = uu3.h.f512817d;
        this.C = uu3.s.f512827d;
        this.D = uu3.r.f512826d;
        this.E = uu3.q.f512825d;
        this.Q = new java.util.HashSet();
        this.R = -1.0f;
        this.T = new java.util.ArrayList();
        this.U = new uu3.i();
        this.f512833p0 = new float[]{0.0f, 1.0f};
        this.f512838x0 = ym5.x.a(getContext(), 60.0f);
        this.R = -1.0f;
        this.S = builder.f512809a;
        m68125x38cb7e8(true);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
        frameLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        this.f512831J = frameLayout;
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dbq, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        m170557x43427e3f(inflate);
        android.view.View findViewById = m170539xe6eebdcb().findViewById(com.p314xaae8f345.mm.R.id.d4n);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        m170562xffc883b2((android.widget.FrameLayout) findViewById);
        android.view.View findViewById2 = m170539xe6eebdcb().findViewById(com.p314xaae8f345.mm.R.id.d4l);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        m170556xd6411aea((android.widget.FrameLayout) findViewById2);
        android.view.View findViewById3 = m170539xe6eebdcb().findViewById(com.p314xaae8f345.mm.R.id.d4m);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.I = (android.widget.FrameLayout) findViewById3;
        m170544xc8f1ea3e().setContentDescription(i65.a.r(getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f571889so));
        m170544xc8f1ea3e().setOnClickListener(new uu3.j(this));
        m170538x9f6a8176().setOnClickListener(uu3.k.f512819d);
        android.widget.FrameLayout frameLayout2 = this.I;
        if (frameLayout2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("footerContainer");
            throw null;
        }
        frameLayout2.setOnClickListener(uu3.l.f512820d);
        android.view.View m170539xe6eebdcb = m170539xe6eebdcb();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca55 = m170539xe6eebdcb instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55) m170539xe6eebdcb : null;
        if (c22646x1e9ca55 != null) {
            float dimension = c22646x1e9ca55.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
            c22646x1e9ca55.b(dimension, dimension, 0.0f, 0.0f);
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, (int) this.S);
            layoutParams.gravity = 80;
            c22646x1e9ca55.setLayoutParams(layoutParams);
        }
        android.widget.FrameLayout frameLayout3 = this.f512831J;
        if (frameLayout3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("backgroundContainer");
            throw null;
        }
        addView(frameLayout3);
        addView(m170539xe6eebdcb());
        vu3.c cVar = builder.f512810b;
        if (cVar != null) {
            m170561xc4d6542e(cVar);
        }
        vu3.c cVar2 = builder.f512811c;
        if (cVar2 != null) {
            m170555x9b4eeb66(cVar2);
        }
        vu3.c cVar3 = builder.f512812d;
        if (cVar3 != null) {
            m170554x8c9f77ad(cVar3);
        }
        java.util.Iterator it = ((java.util.HashSet) builder.f512813e).iterator();
        while (it.hasNext()) {
            vu3.i callbackComponent = (vu3.i) it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callbackComponent, "callbackComponent");
            callbackComponent.f521757a = this;
            ((java.util.HashSet) this.Q).add(callbackComponent);
        }
        uu3.i area = this.U;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(area, "area");
        ((java.util.ArrayList) this.T).add(area);
        java.util.Iterator it6 = ((java.util.ArrayList) builder.f512815g).iterator();
        while (it6.hasNext()) {
            uu3.g area2 = (uu3.g) it6.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(area2, "area");
            ((java.util.ArrayList) this.T).add(area2);
        }
        setLayoutParams(builder.f512814f);
        m68126x590ab8fc(m170539xe6eebdcb());
        int i17 = builder.f512816h;
        if (i17 >= 0 && java.lang.Math.abs(i17) <= 2) {
            this.edgeAttached = i17;
        }
        m68135x14354464(this.R);
        mo68131x46e30de3(this.S);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2000xb118f8f1.AbstractGestureDetectorOnGestureListenerC17037xc8d40da6
    public void d() {
        yz5.l lVar = this.f512837x;
        if (lVar != null) {
            lVar.mo146xb9724478(this);
        }
        n(new uu3.m(this));
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(android.graphics.Canvas canvas, android.view.View child, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        if (!this.f512834p1) {
            return super.drawChild(canvas, child, j17);
        }
        int save = canvas.save();
        canvas.rotate(180.0f, this.f512840y0 / 2.0f, this.f512832l1 / 2.0f);
        float f17 = this.f512840y0;
        float f18 = this.f512838x0;
        android.graphics.Paint paint = this.W;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(paint);
        canvas.drawRect(0.0f, 0.0f, f17, f18, paint);
        canvas.restoreToCount(save);
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        boolean drawChild = super.drawChild(canvas, child, j17);
        int save2 = canvas.save();
        canvas.rotate(180.0f, this.f512840y0 / 2.0f, this.f512832l1 / 2.0f);
        float f19 = this.f512840y0;
        float f27 = this.f512838x0;
        android.graphics.Paint paint2 = this.V;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(paint2);
        canvas.drawRect(0.0f, 0.0f, f19, f27, paint2);
        canvas.restoreToCount(save2);
        canvas.restoreToCount(saveLayer);
        return drawChild;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2000xb118f8f1.AbstractGestureDetectorOnGestureListenerC17037xc8d40da6
    public void e() {
        m((int) this.R, (int) this.S);
        yz5.l lVar = this.f512841z;
        if (lVar != null) {
            lVar.mo146xb9724478(this);
        }
        n(new uu3.n(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2000xb118f8f1.AbstractGestureDetectorOnGestureListenerC17037xc8d40da6
    public void f() {
        yz5.l lVar = this.f512836w;
        if (lVar != null) {
            lVar.mo146xb9724478(this);
        }
        n(new uu3.o(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2000xb118f8f1.AbstractGestureDetectorOnGestureListenerC17037xc8d40da6
    public void g() {
        m((int) this.S, (int) this.R);
        yz5.l lVar = this.f512839y;
        if (lVar != null) {
            lVar.mo146xb9724478(this);
        }
        n(new uu3.p(this));
    }

    /* renamed from: getBackgroundComponent */
    public final vu3.c m170536x3e5ab839() {
        return this.P;
    }

    /* renamed from: getCenterComponent */
    public final vu3.c m170537x647851f2() {
        return this.M;
    }

    /* renamed from: getCenterContainer */
    public final android.widget.FrameLayout m170538x9f6a8176() {
        android.widget.FrameLayout frameLayout = this.H;
        if (frameLayout != null) {
            return frameLayout;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("centerContainer");
        throw null;
    }

    /* renamed from: getContainer */
    public final android.view.View m170539xe6eebdcb() {
        android.view.View view = this.F;
        if (view != null) {
            return view;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("container");
        throw null;
    }

    /* renamed from: getContentReachTop */
    public final yz5.a m170540x411cf845() {
        return this.f512835v;
    }

    /* renamed from: getEnableFading */
    public final boolean m170541xe5217a12() {
        return this.f512834p1;
    }

    /* renamed from: getFooterComponent */
    public final vu3.c m170542x3337776c() {
        return this.N;
    }

    /* renamed from: getHeaderComponent */
    public final vu3.c m170543x8dffbaba() {
        return this.L;
    }

    /* renamed from: getHeaderContainer */
    public final android.widget.FrameLayout m170544xc8f1ea3e() {
        android.widget.FrameLayout frameLayout = this.G;
        if (frameLayout != null) {
            return frameLayout;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerContainer");
        throw null;
    }

    /* renamed from: getOnDrawerClose */
    public final yz5.l m170545xe8d32872() {
        return this.f512837x;
    }

    /* renamed from: getOnDrawerDetach */
    public final yz5.l m170546x32e61c59() {
        return this.A;
    }

    /* renamed from: getOnDrawerExpand */
    public final yz5.l m170547x35a4e360() {
        return this.f512841z;
    }

    /* renamed from: getOnDrawerOpen */
    public final yz5.l m170548x4156a490() {
        return this.f512836w;
    }

    /* renamed from: getOnDrawerPeek */
    public final yz5.l m170549x4156efa1() {
        return this.f512839y;
    }

    /* renamed from: getOnInterceptFling */
    public final yz5.s m170550x3b5f34ef() {
        return this.E;
    }

    /* renamed from: getOnInterceptScroll */
    public final yz5.q m170551x463bb19a() {
        return this.D;
    }

    /* renamed from: getOnInterceptTouch */
    public final yz5.p m170552x3c2606d2() {
        return this.C;
    }

    /* renamed from: getOnTranslationChange */
    public final yz5.p m170553x8d7b126c() {
        return this.B;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2000xb118f8f1.AbstractGestureDetectorOnGestureListenerC17037xc8d40da6
    public boolean h(android.view.MotionEvent motionEvent, android.view.MotionEvent e27, float f17, float f18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e27, "e2");
        return this.K || (((java.lang.Boolean) this.f512835v.mo152xb9724478()).booleanValue() && f18 > 0.0f && ((java.lang.Boolean) this.E.v(this, motionEvent, e27, java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18))).booleanValue());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2000xb118f8f1.AbstractGestureDetectorOnGestureListenerC17037xc8d40da6
    public boolean i(boolean z17, float f17) {
        boolean z18;
        boolean booleanValue = ((java.lang.Boolean) this.f512835v.mo152xb9724478()).booleanValue();
        if (z17) {
            z18 = false;
        } else {
            z18 = this.isDrawerOpen && this.K && booleanValue && (f17 < 0.0f || !b());
            b();
        }
        boolean z19 = z18 && ((java.lang.Boolean) this.D.mo147xb9724478(this, java.lang.Boolean.valueOf(z17), java.lang.Float.valueOf(f17))).booleanValue();
        if (z19) {
            m((int) this.R, (int) this.S);
        }
        return z19;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2000xb118f8f1.AbstractGestureDetectorOnGestureListenerC17037xc8d40da6
    public boolean j(android.view.MotionEvent e17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        int action = e17.getAction();
        if (action == 0) {
            this.K = false;
            java.util.Iterator it = this.T.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((uu3.g) it.next()).a(this).contains((int) e17.getX(), (int) e17.getY())) {
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
        e17.getAction();
        e17.getX();
        e17.getY();
        return z17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2000xb118f8f1.AbstractGestureDetectorOnGestureListenerC17037xc8d40da6
    public void k(float f17, java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        yz5.p pVar = this.B;
        if (pVar != null) {
            pVar.mo149xb9724478(this, java.lang.Float.valueOf(f17));
        }
        n(new uu3.t(this, f17, source));
    }

    public final void m(int i17, int i18) {
        if (m170539xe6eebdcb().getLayoutParams().height == i17) {
            android.view.View m170539xe6eebdcb = m170539xe6eebdcb();
            android.view.ViewGroup.LayoutParams layoutParams = m170539xe6eebdcb().getLayoutParams();
            layoutParams.height = i18;
            m170539xe6eebdcb.setLayoutParams(layoutParams);
            android.view.View m170539xe6eebdcb2 = m170539xe6eebdcb();
            float f17 = i17 - i18;
            m170539xe6eebdcb2.setTranslationY(m170539xe6eebdcb2.getTranslationY() - f17);
            m68134x5783fbbb(getOriginalTranslationY() - f17);
        }
    }

    public final void n(yz5.l lVar) {
        vu3.c cVar = this.L;
        if (cVar != null) {
            lVar.mo146xb9724478(cVar);
        }
        vu3.c cVar2 = this.M;
        if (cVar2 != null) {
            lVar.mo146xb9724478(cVar2);
        }
        vu3.c cVar3 = this.N;
        if (cVar3 != null) {
            lVar.mo146xb9724478(cVar3);
        }
        vu3.c cVar4 = this.P;
        if (cVar4 != null) {
            lVar.mo146xb9724478(cVar4);
        }
        java.util.Iterator it = this.Q.iterator();
        while (it.hasNext()) {
            lVar.mo146xb9724478((vu3.i) it.next());
        }
    }

    public final void o(android.view.ViewGroup viewGroup, android.view.View view) {
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

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2000xb118f8f1.AbstractGestureDetectorOnGestureListenerC17037xc8d40da6, android.view.GestureDetector.OnGestureListener
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
        paint3.setShader(new android.graphics.LinearGradient(0.0f, 0.0f, 0.0f, this.f512838x0, iArr, this.f512833p0, android.graphics.Shader.TileMode.CLAMP));
        android.graphics.Paint paint4 = new android.graphics.Paint();
        this.W = paint4;
        paint4.setColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        this.f512840y0 = getWidth();
        this.f512832l1 = getHeight();
    }

    /* renamed from: setBackgroundComponent */
    public final void m170554x8c9f77ad(vu3.c component) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        this.P = component;
        component.f521757a = this;
        android.view.View a17 = component.a();
        if (a17 != null) {
            android.widget.FrameLayout frameLayout = this.f512831J;
            if (frameLayout != null) {
                o(frameLayout, a17);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("backgroundContainer");
                throw null;
            }
        }
    }

    /* renamed from: setCenterComponent */
    public final void m170555x9b4eeb66(vu3.c component) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        this.M = component;
        component.f521757a = this;
        android.view.View a17 = component.a();
        if (a17 != null) {
            o(m170538x9f6a8176(), a17);
        }
    }

    /* renamed from: setCenterContainer */
    public final void m170556xd6411aea(android.widget.FrameLayout frameLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameLayout, "<set-?>");
        this.H = frameLayout;
    }

    /* renamed from: setContainer */
    public final void m170557x43427e3f(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<set-?>");
        this.F = view;
    }

    /* renamed from: setContentReachTop */
    public final void m170558x77f391b9(yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aVar, "<set-?>");
        this.f512835v = aVar;
    }

    /* renamed from: setEnableFading */
    public final void m170559x1b6a751e(boolean z17) {
        this.f512834p1 = z17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2000xb118f8f1.AbstractGestureDetectorOnGestureListenerC17037xc8d40da6
    /* renamed from: setExpandHeight */
    public void mo68131x46e30de3(float f17) {
        super.mo68131x46e30de3(f17);
        if (this.S == f17) {
            return;
        }
        this.S = f17;
        android.view.View m170539xe6eebdcb = m170539xe6eebdcb();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca55 = m170539xe6eebdcb instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55) m170539xe6eebdcb : null;
        if (c22646x1e9ca55 != null) {
            c22646x1e9ca55.getLayoutParams().height = (int) this.S;
            c22646x1e9ca55.requestLayout();
        }
    }

    /* renamed from: setFooterComponent */
    public final void m170560x6a0e10e0(vu3.c component) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        this.N = component;
        component.f521757a = this;
        android.view.View a17 = component.a();
        if (a17 != null) {
            android.widget.FrameLayout frameLayout = this.I;
            if (frameLayout != null) {
                o(frameLayout, a17);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("footerContainer");
                throw null;
            }
        }
    }

    /* renamed from: setHeaderComponent */
    public final void m170561xc4d6542e(vu3.c component) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        this.L = component;
        component.f521757a = this;
        android.view.View a17 = component.a();
        if (a17 != null) {
            o(m170544xc8f1ea3e(), a17);
        }
    }

    /* renamed from: setHeaderContainer */
    public final void m170562xffc883b2(android.widget.FrameLayout frameLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameLayout, "<set-?>");
        this.G = frameLayout;
    }

    /* renamed from: setOnDrawerClose */
    public final void m170563x7ba98ee6(yz5.l lVar) {
        this.f512837x = lVar;
    }

    /* renamed from: setOnDrawerDetach */
    public final void m170564xfadc8465(yz5.l lVar) {
        this.A = lVar;
    }

    /* renamed from: setOnDrawerExpand */
    public final void m170565xfd9b4b6c(yz5.l lVar) {
        this.f512841z = lVar;
    }

    /* renamed from: setOnDrawerOpen */
    public final void m170566x779f9f9c(yz5.l lVar) {
        this.f512836w = lVar;
    }

    /* renamed from: setOnDrawerPeek */
    public final void m170567x779feaad(yz5.l lVar) {
        this.f512839y = lVar;
    }

    /* renamed from: setOnInterceptFling */
    public final void m170568xdf5bc9fb(yz5.s sVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sVar, "<set-?>");
        this.E = sVar;
    }

    /* renamed from: setOnInterceptScroll */
    public final void m170569x21d1be0e(yz5.q qVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(qVar, "<set-?>");
        this.D = qVar;
    }

    /* renamed from: setOnInterceptTouch */
    public final void m170570xe0229bde(yz5.p pVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pVar, "<set-?>");
        this.C = pVar;
    }

    /* renamed from: setOnTranslationChange */
    public final void m170571xdbbfd1e0(yz5.p pVar) {
        this.B = pVar;
    }
}
