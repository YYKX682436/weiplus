package bs3;

/* loaded from: classes.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg3.q0 f23986d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(xg3.q0 q0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f23986d = q0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bs3.a(this.f23986d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        bs3.a aVar = (bs3.a) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        aVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).e(this.f23986d);
        return jz5.f0.f302826a;
    }
}
