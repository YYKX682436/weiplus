package kk5;

/* loaded from: classes8.dex */
public final class z0 implements xj.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kk5.i1 f390238a;

    public z0(kk5.i1 i1Var) {
        this.f390238a = i1Var;
    }

    @Override // xj.l
    /* renamed from: onJumpAppCancel */
    public void mo25335x737e9bce() {
        ((qg5.e3) this.f390238a.T6()).oj("journey_copy");
    }

    @Override // xj.l
    /* renamed from: onJumpAppCheckExpose */
    public void mo25336x6332c618() {
    }

    @Override // xj.l
    /* renamed from: onJumpAppFail */
    public void mo25337x30578972() {
        ((qg5.e3) this.f390238a.T6()).oj("journey_copy");
    }

    @Override // xj.l
    /* renamed from: onJumpAppSuccess */
    public void mo25338x6c3e7d2f() {
        ((qg5.e3) this.f390238a.T6()).oj("journey_copy");
    }

    @Override // xj.l
    /* renamed from: onJumpDownloadPage */
    public void mo25339xfa564284() {
        kk5.i1 i1Var = this.f390238a;
        qg5.e3 e3Var = (qg5.e3) i1Var.T6();
        ((cy1.a) e3Var.ij()).Ej("jump_yuanbao_download_end", e3Var.nj("journey_copy"), 35480);
        ((qg5.e3) i1Var.T6()).oj("journey_copy");
    }
}
