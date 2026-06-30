package ah1;

/* loaded from: classes7.dex */
public final class l implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ah1.c0 f4844d;

    public l(ah1.c0 c0Var) {
        this.f4844d = c0Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        kotlin.jvm.internal.o.g(view, "view");
        view.removeOnLayoutChangeListener(this);
        ah1.c0 c0Var = this.f4844d;
        android.widget.RelativeLayout relativeLayout = c0Var.f4815x;
        if (relativeLayout != null) {
            relativeLayout.getViewTreeObserver().addOnPreDrawListener(new ah1.j(relativeLayout, c0Var));
        } else {
            kotlin.jvm.internal.o.o("mRootView");
            throw null;
        }
    }
}
