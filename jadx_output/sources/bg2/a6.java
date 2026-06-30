package bg2;

/* loaded from: classes2.dex */
public final class a6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.q6 f19922d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6(bg2.q6 q6Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f19922d = q6Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bg2.a6(this.f19922d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((bg2.a6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.LinkedList list;
        dg2.m mVar;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        bg2.q6 q6Var = this.f19922d;
        r45.vw0 vw0Var = q6Var.f20414f;
        if (vw0Var == null || (list = vw0Var.getList(2)) == null || (mVar = q6Var.f20415g) == null) {
            return null;
        }
        mVar.b(list);
        return jz5.f0.f302826a;
    }
}
