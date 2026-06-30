package vp;

/* loaded from: classes15.dex */
public class j implements android.view.Choreographer.FrameCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vp.d f520313d;

    public j(vp.d dVar, vp.e eVar) {
        this.f520313d = dVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j17) {
        vp.d dVar = this.f520313d;
        if (dVar.f520277g && !dVar.f520275e && dVar.f520276f) {
            vp.g0 g0Var = dVar.L;
            if (g0Var.a()) {
                g0Var.f520306a.removeMessages(4);
                g0Var.f520306a.sendEmptyMessage(4);
            }
        }
    }
}
