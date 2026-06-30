package bg2;

/* loaded from: classes2.dex */
public final class a8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f19924d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bg2.l8 f19925e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8(xg2.h hVar, kotlin.coroutines.Continuation continuation, bg2.l8 l8Var) {
        super(2, continuation);
        this.f19924d = hVar;
        this.f19925e = l8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bg2.a8(this.f19924d, continuation, this.f19925e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        bg2.a8 a8Var = (bg2.a8) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        a8Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        rm0.j jVar = ((xg2.a) ((xg2.b) this.f19924d).f454381b).f454379a;
        if (jVar != null) {
            com.tencent.mars.xlog.Log.i(this.f19925e.f20274e, "[requestClickFeedBack] errCode = " + jVar.f397425f);
        }
        return jz5.f0.f302826a;
    }
}
