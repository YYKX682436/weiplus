package lj2;

/* loaded from: classes10.dex */
public final class z implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lj2.c0 f400500d;

    public z(lj2.c0 c0Var) {
        this.f400500d = c0Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        lj2.c0 c0Var = this.f400500d;
        android.view.ViewTreeObserver viewTreeObserver = c0Var.f400363a.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        c0Var.f400363a.getLeft();
        if (c0Var.f400370h) {
            c0Var.b().f400470a.setTranslationX(-c0Var.f400363a.getWidth());
            c0Var.c().f400480a.setTranslationX(-c0Var.f400363a.getWidth());
            return true;
        }
        c0Var.b().f400470a.setTranslationX(c0Var.f400363a.getWidth());
        c0Var.c().f400480a.setTranslationX(c0Var.f400363a.getWidth());
        return true;
    }
}
