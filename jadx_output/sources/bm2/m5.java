package bm2;

/* loaded from: classes3.dex */
public final class m5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.n5 f22108d;

    public m5(bm2.n5 n5Var) {
        this.f22108d = n5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bm2.n5 n5Var = this.f22108d;
        android.view.ViewGroup viewGroup = n5Var.H;
        if (viewGroup != null) {
            viewGroup.getGlobalVisibleRect(n5Var.Z);
        }
        n5Var.f22145h.setInterceptTouchRect(n5Var.Z);
    }
}
