package b03;

/* loaded from: classes11.dex */
public final class e extends com.tencent.matrix.lifecycle.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b03.l f16831b;

    public e(b03.l lVar) {
        this.f16831b = lVar;
    }

    @Override // com.tencent.matrix.lifecycle.g
    public void a() {
        e50.z0 z0Var;
        pi0.q qVar;
        com.tencent.mars.xlog.Log.i(this.f16831b.f16842e, "deepBackgroundCallback onEnterDeepBackground");
        b03.l lVar = this.f16831b;
        lVar.f16848k = true;
        if (lVar.f16843f && (qVar = (z0Var = (e50.z0) ((f50.y) i95.n0.c(f50.y.class))).f249558e) != null) {
            qVar.f(z0Var.f249567q);
        }
        ku5.u0 u0Var = ku5.t0.f312615d;
        b03.d dVar = new b03.d(this.f16831b);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.w(dVar, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, null);
    }

    @Override // com.tencent.matrix.lifecycle.g
    public void b() {
        b03.l lVar = this.f16831b;
        com.tencent.mars.xlog.Log.i(lVar.f16842e, "deepBackgroundCallback onExitBackground");
        lVar.f16848k = false;
    }
}
