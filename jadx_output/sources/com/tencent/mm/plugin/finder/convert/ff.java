package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class ff extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f103369d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f103370e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.zf f103371f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f103372g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103373h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f103374i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f103375m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ff(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.plugin.finder.convert.zf zfVar, long j17, in5.s0 s0Var, java.lang.Integer num, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f103370e = baseFinderFeed;
        this.f103371f = zfVar;
        this.f103372g = j17;
        this.f103373h = s0Var;
        this.f103374i = num;
        this.f103375m = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.convert.ff(this.f103370e, this.f103371f, this.f103372g, this.f103373h, this.f103374i, this.f103375m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.convert.ff) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f103369d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f103369d = 1;
            if (kotlinx.coroutines.k1.b(500L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        com.tencent.mm.plugin.finder.convert.ef efVar = new com.tencent.mm.plugin.finder.convert.ef(this.f103370e, this.f103371f, this.f103372g, this.f103373h, this.f103374i, this.f103375m, null);
        this.f103369d = 2;
        if (kotlinx.coroutines.l.g(g3Var, efVar, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
