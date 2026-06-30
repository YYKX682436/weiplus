package hg5;

/* loaded from: classes8.dex */
public final class i implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f362946d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hg5.j f362947e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.g0 f362948f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f362949g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f362950h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f362951i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.view.View f362952m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f362953n;

    public i(android.view.View view, hg5.j jVar, p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var, float f17, android.view.View view2, boolean z17, android.view.View view3, int i17) {
        this.f362946d = view;
        this.f362947e = jVar;
        this.f362948f = g0Var;
        this.f362949g = f17;
        this.f362950h = view2;
        this.f362951i = z17;
        this.f362952m = view3;
        this.f362953n = i17;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        float f17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/dialog/HalfScreenDialogDragHelper$initDragView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        android.view.View view2 = this.f362946d;
        if (view2 != null) {
            view2.dispatchTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var = this.f362948f;
        hg5.j jVar = this.f362947e;
        if (action != 0) {
            android.view.View view3 = this.f362952m;
            if (action == 1) {
                if (java.lang.System.currentTimeMillis() - g0Var.f391654d < 350) {
                    this.f362950h.performClick();
                }
                jVar.b(view3, this.f362953n);
                jVar.f362955b = 0.0f;
                jVar.f362957d = 0.0f;
                android.view.View view4 = this.f362950h;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList2.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/ui/dialog/HalfScreenDialogDragHelper$initDragView$1", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view4.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(view4, "com/tencent/mm/ui/dialog/HalfScreenDialogDragHelper$initDragView$1", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
            } else if (action == 2) {
                if (jVar.f362956c == 0.0f) {
                    g0Var.f391654d = java.lang.System.currentTimeMillis();
                    jVar.f362956c = motionEvent.getRawY();
                    jVar.f362958e = motionEvent.getRawX();
                }
                jVar.f362958e = motionEvent.getRawX();
                jVar.f362956c = motionEvent.getRawY();
                float f18 = jVar.f362956c - jVar.f362955b;
                float f19 = jVar.f362958e - jVar.f362957d;
                if (this.f362951i) {
                    float f27 = jVar.f362959f;
                    float f28 = f18 + f27;
                    f17 = f28 >= 0.0f ? f28 : 0.0f;
                    if (!(f17 == f27)) {
                        jVar.f362959f = f17;
                        view3.setTranslationY(f17);
                    }
                } else {
                    float f29 = jVar.f362960g;
                    float f37 = f19 + f29;
                    f17 = f37 >= 0.0f ? f37 : 0.0f;
                    if (!(f17 == f29)) {
                        jVar.f362960g = f17;
                        view3.setTranslationX(f17);
                    }
                }
                jVar.f362955b = jVar.f362956c;
                jVar.f362957d = jVar.f362958e;
            }
        } else {
            jVar.f362955b = motionEvent.getRawY();
            jVar.f362957d = motionEvent.getRawX();
            g0Var.f391654d = java.lang.System.currentTimeMillis();
            float f38 = this.f362949g;
            if (!(f38 == 1.0f)) {
                android.view.View view5 = this.f362950h;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList3.add(java.lang.Float.valueOf(f38));
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view5, arrayList3.toArray(), "com/tencent/mm/ui/dialog/HalfScreenDialogDragHelper$initDragView$1", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view5.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
                yj0.a.f(view5, "com/tencent/mm/ui/dialog/HalfScreenDialogDragHelper$initDragView$1", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        }
        yj0.a.i(true, this, "com/tencent/mm/ui/dialog/HalfScreenDialogDragHelper$initDragView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
