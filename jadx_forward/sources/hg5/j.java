package hg5;

/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f362954a;

    /* renamed from: b, reason: collision with root package name */
    public float f362955b;

    /* renamed from: c, reason: collision with root package name */
    public float f362956c;

    /* renamed from: d, reason: collision with root package name */
    public float f362957d;

    /* renamed from: e, reason: collision with root package name */
    public float f362958e;

    /* renamed from: f, reason: collision with root package name */
    public float f362959f;

    /* renamed from: g, reason: collision with root package name */
    public float f362960g;

    public j(java.lang.ref.WeakReference halfScreenWebView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(halfScreenWebView, "halfScreenWebView");
        this.f362954a = halfScreenWebView;
    }

    public static void a(hg5.j jVar, android.view.View view, android.view.View view2, int i17, float f17, boolean z17, android.view.View view3, int i18, java.lang.Object obj) {
        float f18 = (i18 & 8) != 0 ? 1.0f : f17;
        boolean z18 = (i18 & 16) != 0 ? true : z17;
        android.view.View view4 = (i18 & 32) != 0 ? null : view3;
        jVar.getClass();
        if (view == null || view2 == null) {
            return;
        }
        view.setOnTouchListener(new hg5.i(view4, jVar, new p3321xbce91901.jvm.p3324x21ffc6bd.g0(), f18, view, z18, view2, i17));
    }

    public final void b(android.view.View view, int i17) {
        if (view == null) {
            return;
        }
        float f17 = this.f362959f;
        float f18 = i17;
        java.lang.ref.WeakReference weakReference = this.f362954a;
        if (f17 > f18) {
            p012xc85e97e9.p016x746ad0e3.app.i0 i0Var = (p012xc85e97e9.p016x746ad0e3.app.i0) weakReference.get();
            if (i0Var != null) {
                i0Var.cancel();
            }
        } else {
            if (!(f17 == 0.0f)) {
                if (f17 == 0.0f) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.HalfScreenDialogDragHelper", "animateDialogVerticalTranslation start equals end and ignore");
                } else {
                    android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(f17, 0.0f);
                    ofFloat.setInterpolator(new android.view.animation.DecelerateInterpolator());
                    ofFloat.setDuration(350L);
                    ofFloat.addUpdateListener(new hg5.e(view));
                    ofFloat.addListener(new hg5.f(this, 0.0f));
                    ofFloat.start();
                }
            }
        }
        float f19 = this.f362960g;
        if (f19 > f18) {
            p012xc85e97e9.p016x746ad0e3.app.i0 i0Var2 = (p012xc85e97e9.p016x746ad0e3.app.i0) weakReference.get();
            if (i0Var2 != null) {
                i0Var2.cancel();
                return;
            }
            return;
        }
        if (f19 == 0.0f) {
            return;
        }
        if (f19 == 0.0f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.HalfScreenDialogDragHelper", "animateDialogVerticalTranslation start equals end and ignore");
            return;
        }
        android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(f19, 0.0f);
        ofFloat2.setInterpolator(new android.view.animation.DecelerateInterpolator());
        ofFloat2.setDuration(350L);
        ofFloat2.addUpdateListener(new hg5.g(view));
        ofFloat2.addListener(new hg5.h(this, 0.0f));
        ofFloat2.start();
    }
}
