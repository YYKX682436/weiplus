package az0;

/* loaded from: classes5.dex */
public final class kb extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f15644d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az0.xb f15645e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f15646f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb(az0.xb xbVar, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f15645e = xbVar;
        this.f15646f = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new az0.kb(this.f15645e, this.f15646f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((az0.kb) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f15644d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            yz5.l lVar = this.f15646f;
            az0.xb xbVar = this.f15645e;
            az0.jb jbVar = new az0.jb(xbVar, lVar);
            this.f15644d = 1;
            if (xbVar.Q0("1008", jbVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
