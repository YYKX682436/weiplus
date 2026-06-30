package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0005\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0016\u0010\b\u001a\u00020\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0002¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/plugin/game/luggage/GameRoundContainerView;", "Landroid/widget/FrameLayout;", "Lkotlin/Function0;", "Ljz5/f0;", com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1928x4237fde6.CastExtraArgs.f5946x7ee2b4b4, "setOnDismissListener", "", "delegate", "setCanCragDelegate", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "luggage-game_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.game.luggage.GameRoundContainerView */
/* loaded from: classes4.dex */
public final class C15872x5d00238a extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final int f221010d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Path f221011e;

    /* renamed from: f, reason: collision with root package name */
    public float f221012f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f221013g;

    /* renamed from: h, reason: collision with root package name */
    public final int f221014h;

    /* renamed from: i, reason: collision with root package name */
    public final int f221015i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.VelocityTracker f221016m;

    /* renamed from: n, reason: collision with root package name */
    public float f221017n;

    /* renamed from: o, reason: collision with root package name */
    public yz5.a f221018o;

    /* renamed from: p, reason: collision with root package name */
    public yz5.a f221019p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15872x5d00238a(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.f221010d = com.p314xaae8f345.mm.ui.zk.a(context, 12);
        this.f221014h = 300;
        this.f221015i = 1000;
        this.f221016m = android.view.VelocityTracker.obtain();
        setClickable(true);
        setFocusable(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        android.graphics.Path path = this.f221011e;
        if (path == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
            throw null;
        }
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f221016m.recycle();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent ev6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(ev6);
        if (onInterceptTouchEvent) {
            return onInterceptTouchEvent;
        }
        int action = ev6.getAction();
        if (action == 0) {
            this.f221012f = ev6.getRawY();
            this.f221017n = ev6.getRawY();
            this.f221013g = false;
        } else if (action == 2) {
            float rawY = ev6.getRawY() - this.f221017n;
            yz5.a aVar = this.f221019p;
            if ((aVar != null ? ((java.lang.Boolean) aVar.mo152xb9724478()).booleanValue() : false) && rawY > 0.0f) {
                this.f221013g = true;
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        android.graphics.Path path = new android.graphics.Path();
        this.f221011e = path;
        int i28 = this.f221010d;
        path.addArc(0.0f, 0.0f, i28 * 2.0f, i28 * 2.0f, 180.0f, 90.0f);
        android.graphics.Path path2 = this.f221011e;
        if (path2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
            throw null;
        }
        float f17 = i17;
        path2.lineTo(f17 - i28, 0.0f);
        android.graphics.Path path3 = this.f221011e;
        if (path3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
            throw null;
        }
        path3.addArc(f17 - (i28 * 2.0f), 0.0f, f17, i28 * 2.0f, 270.0f, 90.0f);
        android.graphics.Path path4 = this.f221011e;
        if (path4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
            throw null;
        }
        float f18 = i18;
        path4.lineTo(f17, f18);
        android.graphics.Path path5 = this.f221011e;
        if (path5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
            throw null;
        }
        path5.lineTo(0.0f, f18);
        android.graphics.Path path6 = this.f221011e;
        if (path6 != null) {
            path6.lineTo(0.0f, i28);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if (r1 != 3) goto L24;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            java.lang.String r0 = "event"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r0)
            android.view.VelocityTracker r0 = r5.f221016m
            r0.addMovement(r6)
            int r1 = r6.getAction()
            r2 = 0
            r3 = 1
            if (r1 == r3) goto L37
            r4 = 2
            if (r1 == r4) goto L19
            r6 = 3
            if (r1 == r6) goto L37
            goto L73
        L19:
            boolean r0 = r5.f221013g
            if (r0 == 0) goto L73
            float r0 = r6.getRawY()
            float r1 = r5.f221012f
            float r0 = r0 - r1
            float r1 = r5.getTranslationY()
            float r1 = r1 + r0
            float r0 = java.lang.Math.max(r1, r2)
            r5.setTranslationY(r0)
            float r6 = r6.getRawY()
            r5.f221012f = r6
            goto L73
        L37:
            boolean r6 = r5.f221013g
            if (r6 == 0) goto L73
            r6 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r6)
            float r6 = r0.getYVelocity()
            float r0 = r5.getTranslationY()
            int r1 = r5.f221014h
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L69
            int r0 = r5.f221015i
            float r0 = (float) r0
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 <= 0) goto L57
            goto L69
        L57:
            android.view.ViewPropertyAnimator r6 = r5.animate()
            android.view.ViewPropertyAnimator r6 = r6.translationY(r2)
            r0 = 300(0x12c, double:1.48E-321)
            android.view.ViewPropertyAnimator r6 = r6.setDuration(r0)
            r6.start()
            goto L70
        L69:
            yz5.a r6 = r5.f221018o
            if (r6 == 0) goto L70
            r6.mo152xb9724478()
        L70:
            r6 = 0
            r5.f221013g = r6
        L73:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.C15872x5d00238a.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: setCanCragDelegate */
    public final void m64508xa9cb5ca8(yz5.a aVar) {
        this.f221019p = aVar;
    }

    /* renamed from: setOnDismissListener */
    public final void m64509xc07e953d(yz5.a listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f221018o = listener;
    }
}
