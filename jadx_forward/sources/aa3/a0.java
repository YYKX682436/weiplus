package aa3;

/* loaded from: classes9.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aa3.e0 f84040d;

    public a0(aa3.e0 e0Var) {
        this.f84040d = e0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aa3.e0 e0Var = this.f84040d;
        if (e0Var.f84051g.getParent() != null) {
            android.view.ViewParent parent = e0Var.f84051g.getParent();
            if (parent instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) parent).removeView(e0Var.f84051g);
            }
        }
    }
}
