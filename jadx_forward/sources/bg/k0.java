package bg;

/* loaded from: classes7.dex */
public class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg.l0 f101346d;

    public k0(bg.l0 l0Var) {
        this.f101346d = l0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        bg.l0 l0Var = this.f101346d;
        if (l0Var.f101348a.T1.get()) {
            return;
        }
        bg.f fVar = l0Var.f101348a;
        if (fVar.f101297h != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.A(), "setSurface mSurface");
            fVar.f101297h.mo1864x42c875eb(fVar.f101296g);
            if (fVar.f101297h.mo1856xc00617a4()) {
                return;
            }
            fVar.K(false, true);
        }
    }
}
