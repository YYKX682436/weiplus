package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes3.dex */
public final class e4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f102117d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f102118e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f102119f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f102120g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f102121h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(kotlin.jvm.internal.f0 f0Var, android.content.Context context, int i17, float f17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f102118e = f0Var;
        this.f102119f = context;
        this.f102120g = i17;
        this.f102121h = f17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.assist.e4(this.f102118e, this.f102119f, this.f102120g, this.f102121h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.assist.e4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f102117d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            com.tencent.mm.plugin.finder.assist.d4 d4Var = new com.tencent.mm.plugin.finder.assist.d4(this.f102118e, this.f102119f, this.f102120g, this.f102121h, null);
            this.f102117d = 1;
            if (kotlinx.coroutines.l.g(g3Var, d4Var, this) == aVar) {
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
