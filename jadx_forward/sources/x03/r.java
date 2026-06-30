package x03;

/* loaded from: classes15.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x03.i0 f532642d;

    public r(x03.i0 i0Var) {
        this.f532642d = i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x03.s1 s1Var = this.f532642d.f532580d;
        if (s1Var != null) {
            ((x03.i1) s1Var).c(false, 2, null);
        }
    }
}
