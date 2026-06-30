package bg;

/* loaded from: classes7.dex */
public class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg.j0 f19807d;

    public i0(bg.j0 j0Var) {
        this.f19807d = j0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        bg.j0 j0Var = this.f19807d;
        if (j0Var.f19811d.f19815a.T1.get()) {
            bg.l0 l0Var = j0Var.f19811d;
            ye1.e eVar = l0Var.f19815a.f19764h;
            if (eVar == null || eVar.isPlaying()) {
                return;
            }
            l0Var.f19815a.K(false, true);
        }
    }
}
