package b92;

/* loaded from: classes.dex */
public final class i2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f18441d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b92.m2 f18442e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(xg2.h hVar, kotlin.coroutines.Continuation continuation, b92.m2 m2Var) {
        super(2, continuation);
        this.f18441d = hVar;
        this.f18442e = m2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new b92.i2(this.f18441d, continuation, this.f18442e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        b92.i2 i2Var = (b92.i2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        i2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.je2 je2Var = (r45.je2) ((xg2.i) this.f18441d).f454393b;
        com.tencent.mars.xlog.Log.i("FinderLiveQosReportService", "reportLoop: cgi success, report_interval=" + je2Var.getInteger(1));
        if (je2Var.getInteger(1) > 0) {
            this.f18442e.f18484g = je2Var.getInteger(1) * 1000;
        }
        return jz5.f0.f302826a;
    }
}
