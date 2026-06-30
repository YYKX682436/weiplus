package x03;

/* loaded from: classes15.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x03.i0 f532605d;

    public m(x03.i0 i0Var) {
        this.f532605d = i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x03.s1 s1Var = this.f532605d.f532580d;
        if (s1Var != null) {
            ((x03.i1) s1Var).c(false, 2, null);
        }
    }
}
