package bg2;

/* loaded from: classes3.dex */
public final class p2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f20377d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.h1 f20378e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.xg6 f20379f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bg2.x2 f20380g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(so2.h1 h1Var, r45.xg6 xg6Var, bg2.x2 x2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f20378e = h1Var;
        this.f20379f = xg6Var;
        this.f20380g = x2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bg2.p2(this.f20378e, this.f20379f, this.f20380g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((bg2.p2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f20377d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            long integer = this.f20378e.f410384n.f410356a > 0 ? r8.f410358c * 1000 : this.f20379f.getInteger(1);
            this.f20377d = 1;
            if (kotlinx.coroutines.k1.b(integer, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        bg2.x2.Y6(this.f20380g);
        return jz5.f0.f302826a;
    }
}
