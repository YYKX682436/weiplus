package bg2;

/* loaded from: classes2.dex */
public final class y1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.d2 f20660d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(bg2.d2 d2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f20660d = d2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bg2.y1(this.f20660d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        bg2.y1 y1Var = (bg2.y1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        y1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        for (java.lang.Object obj2 : this.f20660d.f417141d.f417144d) {
            tc2.h hVar = obj2 instanceof tc2.h ? (tc2.h) obj2 : null;
            if (hVar != null) {
                hVar.onLiveEnd();
            }
        }
        return jz5.f0.f302826a;
    }
}
