package com.tencent.mm.feature.finder.live;

/* loaded from: classes3.dex */
public final class s5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f66915d;

    /* renamed from: e, reason: collision with root package name */
    public int f66916e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f66917f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f66918g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f66919h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5(yz5.l lVar, java.lang.String str, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f66917f = lVar;
        this.f66918g = str;
        this.f66919h = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.feature.finder.live.s5(this.f66917f, this.f66918g, this.f66919h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.feature.finder.live.s5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        yz5.l lVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f66916e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            s40.a1 a1Var = (s40.a1) i95.n0.c(s40.a1.class);
            yz5.l lVar2 = this.f66917f;
            this.f66915d = lVar2;
            this.f66916e = 1;
            obj = ((com.tencent.mm.feature.finder.live.z5) a1Var).Ui(this.f66918g, this.f66919h, this);
            if (obj == aVar) {
                return aVar;
            }
            lVar = lVar2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lVar = (yz5.l) this.f66915d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        lVar.invoke(obj);
        return jz5.f0.f302826a;
    }
}
