package b03;

/* loaded from: classes11.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b03.l f98365d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(b03.l lVar) {
        super(1);
        this.f98365d = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        b03.l lVar = this.f98365d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(lVar.f98375e, "releaseGPUResource, allImageFree:" + booleanValue);
        if (lVar.f98373c) {
            ((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).bj(true);
        }
        b03.a0 a0Var = lVar.f98374d;
        if (a0Var != null) {
            ((ku5.t0) ku5.t0.f394148d).h(new b03.w(a0Var), "EngineGroupMemReporter_serial");
        }
        return jz5.f0.f384359a;
    }
}
