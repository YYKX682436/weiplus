package e33;

/* loaded from: classes10.dex */
public class l2 implements t23.q2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f328850a;

    public l2(e33.v2 v2Var, e33.u2 u2Var) {
        this.f328850a = new java.lang.ref.WeakReference(u2Var.f329020e);
    }

    @Override // t23.q2
    public void a(t23.r2 r2Var) {
        android.view.View view = (android.view.View) this.f328850a.get();
        if (view == null || !r2Var.m165765xb2c87fbf(view.getTag())) {
            return;
        }
        view.setTag(null);
    }
}
