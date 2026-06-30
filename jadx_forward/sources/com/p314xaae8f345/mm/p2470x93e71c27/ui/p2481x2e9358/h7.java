package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public final class h7 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public float f271881d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f271882e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.c8 f271883f;

    public h7(android.view.View view, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.c8 c8Var) {
        this.f271882e = view;
        this.f271883f = c8Var;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper$fullScreenEdtLayout$2$1$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        java.lang.Integer valueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getAction()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            this.f271881d = motionEvent.getRawY();
        } else {
            float f17 = 0.0f;
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.c8 c8Var = this.f271883f;
            android.view.View view2 = this.f271882e;
            if (valueOf != null && valueOf.intValue() == 2) {
                float rawY = motionEvent.getRawY() - this.f271881d;
                int height = view2.getHeight() / 2;
                c8Var.f271754c.mo81353xc6fc1640().a();
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
                    c8Var.a();
                } else {
                    if (translationY < ((java.lang.Number) ((jz5.n) c8Var.f271760i).mo141623x754a37bb()).intValue() && view != null) {
                        view.performClick();
                    }
                    view2.animate().translationY(0.0f).start();
                }
            }
        }
        yj0.a.i(true, this, "com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper$fullScreenEdtLayout$2$1$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
