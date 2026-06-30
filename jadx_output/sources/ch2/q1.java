package ch2;

/* loaded from: classes10.dex */
public final class q1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f41448d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ om2.i f41449e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(xg2.h hVar, kotlin.coroutines.Continuation continuation, om2.i iVar) {
        super(2, continuation);
        this.f41448d = hVar;
        this.f41449e = iVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ch2.q1(this.f41448d, continuation, this.f41449e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ch2.q1 q1Var = (ch2.q1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        q1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("FinderLiveKTVSingController", "reportSingScore fail songUniqueId: " + this.f41449e.c() + " error: " + ((xg2.a) ((xg2.b) this.f41448d).f454381b));
        return jz5.f0.f302826a;
    }
}
