package gt4;

/* loaded from: classes14.dex */
public final class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gt4.s0 f357042d;

    public q0(gt4.s0 s0Var) {
        this.f357042d = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gt4.s0 s0Var = this.f357042d;
        android.widget.FrameLayout frameLayout = s0Var.C;
        if (frameLayout != null) {
            s0Var.I = frameLayout.getBottom();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerLayout");
            throw null;
        }
    }
}
