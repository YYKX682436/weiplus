package aq;

/* loaded from: classes4.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f12962d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.api.QueryImageData f12963e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.StringBuilder f12964f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.tencent.mm.api.QueryImageData queryImageData, java.lang.StringBuilder sb6, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f12963e = queryImageData;
        this.f12964f = sb6;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new aq.t(this.f12963e, this.f12964f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((aq.t) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f12962d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            aq.r0 r0Var = aq.r0.f12940a;
            java.lang.String sb6 = this.f12964f.toString();
            kotlin.jvm.internal.o.f(sb6, "toString(...)");
            this.f12962d = 1;
            if (aq.r0.b(r0Var, this.f12963e, sb6, this) == aVar) {
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
