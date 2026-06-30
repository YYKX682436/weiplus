package ah1;

/* loaded from: classes7.dex */
public final class l implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ah1.c0 f86377d;

    public l(ah1.c0 c0Var) {
        this.f86377d = c0Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        view.removeOnLayoutChangeListener(this);
        ah1.c0 c0Var = this.f86377d;
        android.widget.RelativeLayout relativeLayout = c0Var.f86348x;
        if (relativeLayout != null) {
            relativeLayout.getViewTreeObserver().addOnPreDrawListener(new ah1.j(relativeLayout, c0Var));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRootView");
            throw null;
        }
    }
}
