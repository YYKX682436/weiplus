package a50;

/* loaded from: classes9.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a50.a0 f1525d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1526e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(a50.a0 a0Var, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f1525d = a0Var;
        this.f1526e = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new a50.q(this.f1525d, this.f1526e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        a50.q qVar = (a50.q) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        qVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        int wi6 = ((com.tencent.mm.ui.conversation.b2) ((rv.c3) i95.n0.c(rv.c3.class))).wi();
        cw5.f fVar = new cw5.f();
        if (wi6 < 0) {
            fVar.f224354e = 99999;
            fVar.f224356g[2] = true;
        } else {
            fVar.f224354e = wi6;
            fVar.f224356g[2] = true;
        }
        fVar.f224353d = ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).l() != -1;
        fVar.f224356g[1] = true;
        ((ku5.t0) ku5.t0.f312615d).h(new a50.p(fVar, this.f1525d, this.f1526e), "BizFlutterResortUserActiveReportInfo");
        return jz5.f0.f302826a;
    }
}
