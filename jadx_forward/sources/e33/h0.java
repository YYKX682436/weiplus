package e33;

/* loaded from: classes10.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e33.i0 f328776d;

    public h0(e33.i0 i0Var) {
        this.f328776d = i0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        e33.i0 i0Var = this.f328776d;
        if (i0Var.f328817h.f220065o.getVisibility() == 0) {
            i0Var.f328817h.f220065o.animate().alpha(0.0f).setDuration(300L).withEndAction(new e33.g0(this)).start();
        }
    }
}
