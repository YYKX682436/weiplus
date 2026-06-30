package cj5;

/* loaded from: classes.dex */
public final class j2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.l2 f42154d;

    public j2(cj5.l2 l2Var) {
        this.f42154d = l2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cj5.l2 l2Var = this.f42154d;
        l2Var.X6().requestLayout();
        l2Var.X6().invalidate();
    }
}
