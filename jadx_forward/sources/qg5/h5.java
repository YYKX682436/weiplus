package qg5;

/* loaded from: classes8.dex */
public final class h5 implements xj.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qg5.n5 f444544a;

    public h5(qg5.n5 n5Var) {
        this.f444544a = n5Var;
    }

    @Override // xj.l
    /* renamed from: onJumpAppCancel */
    public void mo25335x737e9bce() {
        ((qg5.e3) qg5.n5.U6(this.f444544a)).oj("journey_summarize");
    }

    @Override // xj.l
    /* renamed from: onJumpAppCheckExpose */
    public void mo25336x6332c618() {
    }

    @Override // xj.l
    /* renamed from: onJumpAppFail */
    public void mo25337x30578972() {
        ((qg5.e3) qg5.n5.U6(this.f444544a)).oj("journey_summarize");
    }

    @Override // xj.l
    /* renamed from: onJumpAppSuccess */
    public void mo25338x6c3e7d2f() {
        ((qg5.e3) qg5.n5.U6(this.f444544a)).oj("journey_summarize");
    }

    @Override // xj.l
    /* renamed from: onJumpDownloadPage */
    public void mo25339xfa564284() {
        qg5.n5 n5Var = this.f444544a;
        qg5.e3 e3Var = (qg5.e3) qg5.n5.U6(n5Var);
        ((cy1.a) e3Var.ij()).Ej("jump_yuanbao_download_end", e3Var.nj("journey_summarize"), 35480);
        ((qg5.e3) qg5.n5.U6(n5Var)).oj("journey_summarize");
    }
}
