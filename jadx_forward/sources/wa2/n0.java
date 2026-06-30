package wa2;

/* loaded from: classes3.dex */
public final class n0 extends android.widget.FrameLayout implements android.view.GestureDetector.OnGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f525685d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f525686e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f525687f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f525688g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f525689h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f525690i;

    /* renamed from: m, reason: collision with root package name */
    public wa2.b0 f525691m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f525692n;

    /* renamed from: o, reason: collision with root package name */
    public int f525693o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        setBackgroundColor(0);
        this.f525685d = jz5.h.b(new wa2.m0(context, this));
        wa2.j0 j0Var = new wa2.j0(context);
        j0Var.setBackgroundColor(-16777216);
        j0Var.setAlpha(0.0f);
        addView(j0Var, new android.widget.FrameLayout.LayoutParams(-1, -1));
        this.f525686e = j0Var;
        jz5.g b17 = jz5.h.b(new wa2.k0(context));
        this.f525689h = b17;
        setTag("GestureFrameLayout");
        if (((java.lang.Boolean) ((jz5.n) b17).mo141623x754a37bb()).booleanValue()) {
            post(new wa2.i0(this));
        }
    }

    /* renamed from: getTouchDetector */
    private final android.view.GestureDetector m173375x29d4686f() {
        return (android.view.GestureDetector) ((jz5.n) this.f525685d).mo141623x754a37bb();
    }

    public final com.p314xaae8f345.mm.p2776x373aa5.C22786x7b0352c5 a(android.view.ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = viewGroup.getChildAt(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(childAt, "getChildAt(...)");
            if ((childAt instanceof android.view.ViewGroup) && !(childAt instanceof com.p314xaae8f345.mm.p2776x373aa5.C22786x7b0352c5)) {
                com.p314xaae8f345.mm.p2776x373aa5.C22786x7b0352c5 a17 = a((android.view.ViewGroup) childAt);
                if (a17 != null) {
                    return a17;
                }
            } else if (childAt instanceof com.p314xaae8f345.mm.p2776x373aa5.C22786x7b0352c5) {
                com.p314xaae8f345.mm.p2776x373aa5.C22786x7b0352c5 c22786x7b0352c5 = (com.p314xaae8f345.mm.p2776x373aa5.C22786x7b0352c5) childAt;
                if (viewGroup.getHeight() <= c22786x7b0352c5.getHeight()) {
                    return c22786x7b0352c5;
                }
            } else {
                continue;
            }
        }
        return null;
    }

    public final com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 b(android.view.ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = viewGroup.getChildAt(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(childAt, "getChildAt(...)");
            if ((childAt instanceof android.view.ViewGroup) && !(childAt instanceof com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864)) {
                com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 b17 = b((android.view.ViewGroup) childAt);
                if (b17 != null) {
                    return b17;
                }
            } else if (childAt instanceof com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864) {
                com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 c22851x22587864 = (com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864) childAt;
                if (viewGroup.getHeight() <= c22851x22587864.getHeight()) {
                    return c22851x22587864;
                }
            } else {
                continue;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent ev6) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        int i17 = this.f525693o;
        if (i17 == -1) {
            if (ev6.getAction() == 3 || ev6.getAction() == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GestureFrameLayout", "dispatchTouchEvent: isInterceptTouchEvent=-1, reset to 0");
                this.f525693o = 0;
            }
            return super.dispatchTouchEvent(ev6);
        }
        if (i17 == 0) {
            return super.dispatchTouchEvent(ev6);
        }
        if (i17 == 1) {
            int i18 = (getContext().getResources().getDisplayMetrics().heightPixels * 3) / 4;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GestureFrameLayout", "dispatchTouchEvent: isInterceptTouchEvent=1, rawY=" + ev6.getRawY() + ", threshold=" + i18 + ", isEnableDragExit=" + ((java.lang.Boolean) ((jz5.n) this.f525689h).mo141623x754a37bb()).booleanValue());
            if (ev6.getRawY() >= i18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GestureFrameLayout", "dispatchTouchEvent: rawY >= threshold, 放弃拦截, isInterceptTouchEvent → -1");
                this.f525693o = -1;
                return super.dispatchTouchEvent(ev6);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GestureFrameLayout", "dispatchTouchEvent: rawY < threshold, 进入拖拽模式, isInterceptTouchEvent → 2");
            android.view.MotionEvent obtain = android.view.MotionEvent.obtain(ev6);
            obtain.setAction(3);
            super.dispatchTouchEvent(obtain);
            android.view.MotionEvent obtain2 = android.view.MotionEvent.obtain(ev6);
            obtain2.setAction(0);
            android.view.GestureDetector m173375x29d4686f = m173375x29d4686f();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(obtain2);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(m173375x29d4686f, arrayList.toArray(), "com/tencent/mm/plugin/finder/animation/GestureFrameLayout", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            yj0.a.g(m173375x29d4686f, m173375x29d4686f.onTouchEvent((android.view.MotionEvent) arrayList.get(0)), "com/tencent/mm/plugin/finder/animation/GestureFrameLayout", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            this.f525693o = 2;
        }
        android.view.GestureDetector m173375x29d4686f2 = m173375x29d4686f();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(ev6);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(m173375x29d4686f2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/animation/GestureFrameLayout", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        yj0.a.g(m173375x29d4686f2, m173375x29d4686f2.onTouchEvent((android.view.MotionEvent) arrayList2.get(0)), "com/tencent/mm/plugin/finder/animation/GestureFrameLayout", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        if (ev6.getAction() == 3 || ev6.getAction() == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GestureFrameLayout", "dispatchTouchEvent: 手势结束, isInterceptTouchEvent → 0, 调用 onTouchCancel");
            this.f525693o = 0;
            float a17 = h3.a.a(1.0f - ((m173377xc2a54588().getTranslationY() * 1.0f) / m173377xc2a54588().getHeight()), 0.0f, 1.0f);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GestureFrameLayout", "[onTouchCancel] scale=" + a17);
            if (a17 > 0.8f) {
                android.view.View m173377xc2a54588 = m173377xc2a54588();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList3.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(m173377xc2a54588, arrayList3.toArray(), "com/tencent/mm/plugin/finder/animation/GestureFrameLayout", if1.n.f69930x24728b, "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                m173377xc2a54588.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
                yj0.a.f(m173377xc2a54588, "com/tencent/mm/plugin/finder/animation/GestureFrameLayout", if1.n.f69930x24728b, "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                this.f525690i = false;
                wa2.b0 b0Var = this.f525691m;
                if (b0Var != null) {
                    ((im2.f) b0Var).a(false);
                }
                m173377xc2a54588().animate().setListener(null).setUpdateListener(new wa2.l0(this)).translationX(0.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(280L).start();
                com.p314xaae8f345.mm.p2776x373aa5.C22786x7b0352c5 a18 = a(this);
                if (a18 != null) {
                    a18.setTranslationY(0.0f);
                }
                z17 = true;
            } else {
                z17 = true;
                this.f525690i = true;
                wa2.b0 b0Var2 = this.f525691m;
                if (b0Var2 != null) {
                    ((im2.f) b0Var2).a(true);
                }
                android.content.Context context = m173377xc2a54588().getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                ((android.app.Activity) context).finish();
            }
        } else {
            z17 = true;
        }
        return z17;
    }

    /* renamed from: getBgView */
    public final android.view.View m173376x12263380() {
        return this.f525686e;
    }

    /* renamed from: getContentView */
    public final android.view.View m173377xc2a54588() {
        android.view.View view = this.f525687f;
        if (view != null) {
            return view;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentView");
        throw null;
    }

    /* renamed from: getDisabled */
    public final boolean m173378x8c0077f2() {
        return this.f525692n;
    }

    /* renamed from: getDragListener */
    public final wa2.b0 m173379x3ba2747e() {
        return this.f525691m;
    }

    /* renamed from: getSourceView */
    public final android.view.View m173380xac024956() {
        return this.f525688g;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent e17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        wa2.b0 b0Var = this.f525691m;
        if (b0Var == null) {
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1540xac8f1cfd.C14380x23078afd c14380x23078afd = ((im2.f) b0Var).f373844a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c14380x23078afd.f198514d, "onDragDown");
        c14380x23078afd.m158354x19263085().getWindow().getDecorView().setBackgroundColor(0);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent e27, float f17, float f18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e27, "e2");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent e17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/animation/GestureFrameLayout", "android/view/GestureDetector$OnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/animation/GestureFrameLayout", "android/view/GestureDetector$OnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent e27, float f17, float f18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e27, "e2");
        wa2.u.f525714d.getClass();
        android.view.View m173377xc2a54588 = m173377xc2a54588();
        m173377xc2a54588.setTranslationY(m173377xc2a54588.getTranslationY() - f18);
        android.view.View m173377xc2a545882 = m173377xc2a54588();
        m173377xc2a545882.setTranslationX(m173377xc2a545882.getTranslationX() - f17);
        float a17 = h3.a.a(1.0f - ((m173377xc2a54588().getTranslationY() * 1.0f) / m173377xc2a54588().getHeight()), 0.0f, 1.0f);
        wa2.b0 b0Var = this.f525691m;
        if (b0Var != null) {
            float translationX = m173377xc2a54588().getTranslationX();
            float translationY = m173377xc2a54588().getTranslationY();
            java.lang.String str = ((im2.f) b0Var).f373844a.f198514d;
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5478xe7e70c2a c5478xe7e70c2a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5478xe7e70c2a();
            am.nb nbVar = c5478xe7e70c2a.f135816g;
            nbVar.f88949a = (int) translationX;
            nbVar.f88950b = (int) translationY;
            nbVar.f88951c = a17;
            c5478xe7e70c2a.e();
        }
        android.view.View view = this.f525686e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(a17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/animation/GestureFrameLayout", "onScroll", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/animation/GestureFrameLayout", "onScroll", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        m173377xc2a54588().setScaleX(a17);
        m173377xc2a54588().setScaleY(a17);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(android.view.MotionEvent e17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent e17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/animation/GestureFrameLayout", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        yj0.a.i(false, this, "com/tencent/mm/plugin/finder/animation/GestureFrameLayout", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return false;
    }

    /* renamed from: setContentView */
    public final void m173381x590ab8fc(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<set-?>");
        this.f525687f = view;
    }

    /* renamed from: setDisabled */
    public final void m173382x86b8d8fe(boolean z17) {
        this.f525692n = z17;
    }

    /* renamed from: setDragListener */
    public final void m173383x71eb6f8a(wa2.b0 b0Var) {
        this.f525691m = b0Var;
    }

    /* renamed from: setDragToClose */
    public final void m173384x78a556a7(boolean z17) {
        this.f525690i = z17;
    }

    /* renamed from: setSourceView */
    public final void m173385xda269762(android.view.View view) {
        this.f525688g = view;
    }
}
