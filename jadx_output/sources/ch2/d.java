package ch2;

/* loaded from: classes10.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f41303d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(xg2.h hVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f41303d = hVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ch2.d(this.f41303d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ch2.d dVar = (ch2.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        dVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.ex1 ex1Var = (r45.ex1) ((xg2.i) this.f41303d).f454393b;
        com.tencent.mars.xlog.Log.i("FinderLiveKTVController", "getKTVResourceConfig success: " + ex1Var.f373779d);
        com.tencent.mm.plugin.finder.live.util.d2.d(ex1Var.f373780e);
        return jz5.f0.f302826a;
    }
}
