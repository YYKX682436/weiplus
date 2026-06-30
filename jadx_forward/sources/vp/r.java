package vp;

/* loaded from: classes15.dex */
public class r implements android.view.Choreographer.FrameCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vp.k f520358d;

    public r(vp.k kVar, vp.l lVar) {
        this.f520358d = kVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j17) {
        vp.k kVar = this.f520358d;
        if (kVar.f520323f && !kVar.f520321d && kVar.f520322e) {
            vp.j0 j0Var = kVar.K;
            if (j0Var.a()) {
                j0Var.f520314a.removeMessages(4);
                j0Var.f520314a.sendEmptyMessage(4);
            }
        }
    }
}
