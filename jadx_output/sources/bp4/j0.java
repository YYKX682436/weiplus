package bp4;

/* loaded from: classes10.dex */
public final class j0 implements bp4.c0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bp4.k0 f23201d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ju3.d0 f23202e;

    public j0(bp4.k0 k0Var, ju3.d0 d0Var) {
        this.f23201d = k0Var;
        this.f23202e = d0Var;
    }

    @Override // bp4.c0
    public void h(long j17, java.lang.Object obj) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1468L, 0L);
        com.tencent.mm.videocomposition.play.VideoCompositionPlayView videoCompositionPlayView = this.f23201d.f23214m;
        if (videoCompositionPlayView != null) {
            videoCompositionPlayView.j(j17);
        }
    }

    @Override // bp4.c0
    public void pause() {
        ju3.d0.k(this.f23202e, ju3.c0.f301895p1, null, 2, null);
    }

    @Override // bp4.c0
    public void resume() {
        ju3.d0.k(this.f23202e, ju3.c0.f301913x1, null, 2, null);
    }
}
