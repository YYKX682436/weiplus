package b03;

/* loaded from: classes11.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b03.l f16832d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(b03.l lVar) {
        super(1);
        this.f16832d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        b03.l lVar = this.f16832d;
        com.tencent.mars.xlog.Log.i(lVar.f16842e, "releaseGPUResource, allImageFree:" + booleanValue);
        if (lVar.f16840c) {
            ((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).bj(true);
        }
        b03.a0 a0Var = lVar.f16841d;
        if (a0Var != null) {
            ((ku5.t0) ku5.t0.f312615d).h(new b03.w(a0Var), "EngineGroupMemReporter_serial");
        }
        return jz5.f0.f302826a;
    }
}
