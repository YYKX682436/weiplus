package bm2;

/* loaded from: classes3.dex */
public final class m5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.n5 f103641d;

    public m5(bm2.n5 n5Var) {
        this.f103641d = n5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bm2.n5 n5Var = this.f103641d;
        android.view.ViewGroup viewGroup = n5Var.H;
        if (viewGroup != null) {
            viewGroup.getGlobalVisibleRect(n5Var.Z);
        }
        n5Var.f103678h.m81304xd9ff9323(n5Var.Z);
    }
}
