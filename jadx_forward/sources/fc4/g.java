package fc4;

/* loaded from: classes4.dex */
public final class g extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.VelocityTracker f342677d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f342678e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f342679f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15 f342680g;

    /* renamed from: h, reason: collision with root package name */
    public xc4.p f342681h;

    /* renamed from: i, reason: collision with root package name */
    public float f342682i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f342683m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f342684n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f342685o;

    /* renamed from: p, reason: collision with root package name */
    public int f342686p;

    /* renamed from: q, reason: collision with root package name */
    public int f342687q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f342688r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f342689s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.GestureDetector f342690t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        android.view.VelocityTracker obtain = android.view.VelocityTracker.obtain();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtain, "obtain(...)");
        this.f342677d = obtain;
        this.f342682i = 1.0f;
        this.f342690t = new android.view.GestureDetector(m80379x76847179(), new fc4.a(this));
    }

    public static void O6(fc4.g gVar, boolean z17, int i17, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("finishImpl$default", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC");
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        gVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("finishImpl", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC");
        gVar.P6(2);
        gVar.m158354x19263085().setResult(-1, new android.content.Intent());
        gVar.m158354x19263085().finish();
        if (z17) {
            gVar.m158354x19263085().overridePendingTransition(0, 0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("finishImpl", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("finishImpl$default", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC");
    }

    public final void P6(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("publishExitStatus", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5568xa650f04c c5568xa650f04c = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5568xa650f04c();
        int intExtra = m158359x1e885992().getIntExtra("sns_position", 0);
        am.ie ieVar = c5568xa650f04c.f135888g;
        ieVar.f88478a = intExtra;
        ieVar.f88482e = i17;
        xc4.p pVar = this.f342681h;
        ieVar.f88481d = pVar != null ? pVar.W0() : null;
        c5568xa650f04c.e();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("publishExitStatus", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q6() {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fc4.g.Q6():void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBackPressed */
    public boolean mo2274xbdc3c5dc() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBackPressed", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC");
        Q6();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBackPressed", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC");
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f4  */
    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo450x3e5a77bb(android.os.Bundle r17) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fc4.g.mo450x3e5a77bb(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC");
        this.f342677d.recycle();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC");
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent event) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTouch", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(event);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/flexible/FlexibleAnimationUIC", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        android.view.GestureDetector gestureDetector = this.f342690t;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(event);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(gestureDetector, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/flexible/FlexibleAnimationUIC", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        yj0.a.g(gestureDetector, gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList2.get(0)), "com/tencent/mm/plugin/sns/ui/flexible/FlexibleAnimationUIC", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        android.view.VelocityTracker velocityTracker = this.f342677d;
        velocityTracker.addMovement(event);
        int action = event.getAction() & 255;
        if (action == 1) {
            velocityTracker.clear();
            if (this.f342684n) {
                view.setPivotX(view.getWidth() / 2);
                view.setPivotY(view.getHeight() / 2);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                android.view.View view2 = this.f342679f;
                if (view2 != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList3.add(java.lang.Float.valueOf(1.0f));
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ui/flexible/FlexibleAnimationUIC", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view2.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/flexible/FlexibleAnimationUIC", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
                this.f342682i = 1.0f;
                this.f342683m = false;
                this.f342685o = false;
                android.view.View view3 = this.f342678e;
                if (view3 != null) {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList4.add(0);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/sns/ui/flexible/FlexibleAnimationUIC", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/sns/ui/flexible/FlexibleAnimationUIC", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                yj0.a.i(true, this, "com/tencent/mm/plugin/sns/ui/flexible/FlexibleAnimationUIC", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouch", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC");
                return true;
            }
            if (this.f342683m && !this.f342685o) {
                Q6();
                yj0.a.i(true, this, "com/tencent/mm/plugin/sns/ui/flexible/FlexibleAnimationUIC", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouch", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC");
                return true;
            }
            this.f342685o = false;
            view.setLongClickable(true);
        } else if (action == 2) {
            velocityTracker.computeCurrentVelocity(1000);
            int xVelocity = (int) velocityTracker.getXVelocity();
            int yVelocity = (int) velocityTracker.getYVelocity();
            float translationX = view.getTranslationX();
            float translationY = view.getTranslationY();
            this.f342686p = (int) translationX;
            this.f342687q = (int) translationY;
            if ((java.lang.Math.abs(translationX) > 250.0f || java.lang.Math.abs(yVelocity) <= java.lang.Math.abs(xVelocity) || yVelocity <= 0 || this.f342685o) && !this.f342683m) {
                this.f342683m = false;
            } else {
                float height = 1 - (translationY / view.getHeight());
                float f17 = height <= 1.0f ? height : 1.0f;
                if (((yVelocity > 0 && f17 < this.f342682i) || yVelocity < 0) && f17 >= 0.5d) {
                    this.f342682i = f17;
                    view.setPivotX(view.getWidth() / 2);
                    view.setPivotY(view.getHeight() / 2);
                    view.setScaleX(f17);
                    view.setScaleY(f17);
                    view.setTranslationY(translationY);
                    android.view.View view4 = this.f342679f;
                    if (view4 != null) {
                        java.util.ArrayList arrayList5 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                        arrayList5.add(java.lang.Float.valueOf(f17));
                        java.util.Collections.reverse(arrayList5);
                        yj0.a.d(view4, arrayList5.toArray(), "com/tencent/mm/plugin/sns/ui/flexible/FlexibleAnimationUIC", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        view4.setAlpha(((java.lang.Float) arrayList5.get(0)).floatValue());
                        yj0.a.f(view4, "com/tencent/mm/plugin/sns/ui/flexible/FlexibleAnimationUIC", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    }
                    android.view.View view5 = this.f342678e;
                    if (view5 != null) {
                        java.util.ArrayList arrayList6 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                        arrayList6.add(4);
                        java.util.Collections.reverse(arrayList6);
                        yj0.a.d(view5, arrayList6.toArray(), "com/tencent/mm/plugin/sns/ui/flexible/FlexibleAnimationUIC", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view5.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                        yj0.a.f(view5, "com/tencent/mm/plugin/sns/ui/flexible/FlexibleAnimationUIC", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    if (!this.f342688r) {
                        this.f342688r = true;
                        P6(1);
                    }
                }
                this.f342683m = true;
            }
            if (translationY > 200.0f) {
                this.f342684n = false;
            } else if (translationY > 10.0f) {
                this.f342684n = true;
            }
            if (translationY > 50.0f) {
                view.setLongClickable(false);
            }
            boolean z17 = this.f342683m;
            yj0.a.i(z17, this, "com/tencent/mm/plugin/sns/ui/flexible/FlexibleAnimationUIC", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouch", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC");
            return z17;
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ui/flexible/FlexibleAnimationUIC", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouch", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC");
        return false;
    }
}
