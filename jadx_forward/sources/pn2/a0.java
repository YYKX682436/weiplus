package pn2;

/* loaded from: classes3.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pn2.c0 f438500d;

    public a0(pn2.c0 c0Var) {
        this.f438500d = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pn2.c0 c0Var = this.f438500d;
        android.widget.FrameLayout D = c0Var.D();
        if (D != null) {
            D.setVisibility(0);
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = c0Var.f438512o;
        if (c22789xd23e9a9b == null) {
            return;
        }
        c22789xd23e9a9b.m82582x3ae760af(1.0d);
    }
}
