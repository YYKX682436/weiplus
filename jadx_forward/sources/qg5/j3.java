package qg5;

/* loaded from: classes8.dex */
public final class j3 implements xj.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qg5.u3 f444558a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f444559b;

    public j3(qg5.u3 u3Var, yz5.a aVar) {
        this.f444558a = u3Var;
        this.f444559b = aVar;
    }

    @Override // xj.l
    /* renamed from: onJumpAppCancel */
    public void mo25335x737e9bce() {
        ((qg5.e3) qg5.u3.T6(this.f444558a)).oj("journey_copy");
    }

    @Override // xj.l
    /* renamed from: onJumpAppCheckExpose */
    public void mo25336x6332c618() {
    }

    @Override // xj.l
    /* renamed from: onJumpAppFail */
    public void mo25337x30578972() {
        ((qg5.e3) qg5.u3.T6(this.f444558a)).oj("journey_copy");
    }

    @Override // xj.l
    /* renamed from: onJumpAppSuccess */
    public void mo25338x6c3e7d2f() {
        ((qg5.e3) qg5.u3.T6(this.f444558a)).oj("journey_copy");
        yz5.a aVar = this.f444559b;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }

    @Override // xj.l
    /* renamed from: onJumpDownloadPage */
    public void mo25339xfa564284() {
        qg5.u3 u3Var = this.f444558a;
        qg5.e3 e3Var = (qg5.e3) qg5.u3.T6(u3Var);
        ((cy1.a) e3Var.ij()).Ej("jump_yuanbao_download_end", e3Var.nj("journey_copy"), 35480);
        ((qg5.e3) qg5.u3.T6(u3Var)).oj("journey_copy");
    }
}
