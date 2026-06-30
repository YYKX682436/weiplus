package ec3;

/* loaded from: classes2.dex */
public final class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ec3.g1 f332581d;

    public l0(ec3.g1 g1Var) {
        this.f332581d = g1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.LinearLayout Y6 = this.f332581d.Y6();
        if (Y6 != null) {
            Y6.setPressed(false);
        }
    }
}
