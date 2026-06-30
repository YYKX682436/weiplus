package gl5;

/* loaded from: classes5.dex */
public final class u0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public float f354633d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f354634e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gl5.d1 f354635f;

    public u0(android.view.View view, gl5.d1 d1Var) {
        this.f354634e = view;
        this.f354635f = d1Var;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/cedit/edit/FullScreenEditHelperHalfScreen$fullScreenEdtLayout$2$1$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        java.lang.Integer valueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getAction()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            this.f354633d = motionEvent.getRawY();
        } else {
            float f17 = 0.0f;
            gl5.d1 d1Var = this.f354635f;
            android.view.View view2 = this.f354634e;
            if (valueOf != null && valueOf.intValue() == 2) {
                float rawY = motionEvent.getRawY() - this.f354633d;
                int height = view2.getHeight() / 2;
                d1Var.f354458b.mo81353xc6fc1640().a();
                if (rawY > 0.0f) {
                    f17 = height;
                    if (rawY < f17) {
                        f17 = rawY;
                    }
                }
                view2.setTranslationY(f17);
            } else if (valueOf != null && valueOf.intValue() == 1) {
                int height2 = view2.getHeight() / 8;
                float translationY = view2.getTranslationY();
                if (translationY > height2) {
                    d1Var.b();
                } else {
                    if (translationY < ((java.lang.Number) ((jz5.n) d1Var.f354467k).mo141623x754a37bb()).intValue() && view != null) {
                        view.performClick();
                    }
                    view2.animate().translationY(0.0f).start();
                }
            }
        }
        yj0.a.i(true, this, "com/tencent/mm/ui/widget/cedit/edit/FullScreenEditHelperHalfScreen$fullScreenEdtLayout$2$1$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
