package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class zf extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f111251d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ag f111252e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f111253f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f111254g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f111255h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf(com.tencent.mm.plugin.finder.feed.ag agVar, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f111252e = agVar;
        this.f111253f = str;
        this.f111254g = str2;
        this.f111255h = str3;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.feed.zf(this.f111252e, this.f111253f, this.f111254g, this.f111255h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.feed.zf) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f111251d;
        java.lang.String str = this.f111254g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f111251d = 1;
            obj = this.f111252e.b(this.f111253f, str, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        r45.by1 by1Var = (r45.by1) obj;
        if (by1Var != null) {
            com.tencent.mm.plugin.finder.live.util.d2.e(by1Var, str, this.f111255h, true);
        }
        return jz5.f0.f302826a;
    }
}
