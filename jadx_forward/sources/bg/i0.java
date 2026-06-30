package bg;

/* loaded from: classes7.dex */
public class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg.j0 f101340d;

    public i0(bg.j0 j0Var) {
        this.f101340d = j0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        bg.j0 j0Var = this.f101340d;
        if (j0Var.f101344d.f101348a.T1.get()) {
            bg.l0 l0Var = j0Var.f101344d;
            ye1.e eVar = l0Var.f101348a.f101297h;
            if (eVar == null || eVar.mo1856xc00617a4()) {
                return;
            }
            l0Var.f101348a.K(false, true);
        }
    }
}
