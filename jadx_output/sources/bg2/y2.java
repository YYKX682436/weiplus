package bg2;

/* loaded from: classes2.dex */
public final class y2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f20661d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f20662e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bg2.b3 f20663f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f20664g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(kotlin.jvm.internal.h0 h0Var, bg2.b3 b3Var, kotlin.jvm.internal.h0 h0Var2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f20662e = h0Var;
        this.f20663f = b3Var;
        this.f20664g = h0Var2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bg2.y2(this.f20662e, this.f20663f, this.f20664g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((bg2.y2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f20661d;
        bg2.b3 b3Var = this.f20663f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            long integer = ((r45.vg6) this.f20662e.f310123d) != null ? r8.getInteger(0) : 0L;
            com.tencent.mars.xlog.Log.i(b3Var.f19937e, "[onFocusFeedCenter] type(1), delay=" + integer);
            this.f20661d = 1;
            if (kotlinx.coroutines.k1.b(integer, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        bg2.b3.Y6(b3Var, ((java.lang.Number) this.f20664g.f310123d).intValue());
        return jz5.f0.f302826a;
    }
}
