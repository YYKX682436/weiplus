package bg;

/* loaded from: classes7.dex */
public class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg.l0 f19813d;

    public k0(bg.l0 l0Var) {
        this.f19813d = l0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        bg.l0 l0Var = this.f19813d;
        if (l0Var.f19815a.T1.get()) {
            return;
        }
        bg.f fVar = l0Var.f19815a;
        if (fVar.f19764h != null) {
            com.tencent.mars.xlog.Log.i(fVar.A(), "setSurface mSurface");
            fVar.f19764h.setSurface(fVar.f19763g);
            if (fVar.f19764h.isPlaying()) {
                return;
            }
            fVar.K(false, true);
        }
    }
}
