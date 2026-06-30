package ry4;

/* loaded from: classes.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry4.c0 f483217d;

    public w(ry4.c0 c0Var) {
        this.f483217d = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ry4.c0 c0Var = this.f483217d;
        android.widget.ScrollView scrollView = c0Var.f483133r;
        if (scrollView != null) {
            scrollView.smoothScrollTo(0, ((java.lang.Number) ((jz5.n) c0Var.f483132q).mo141623x754a37bb()).intValue());
        }
    }
}
