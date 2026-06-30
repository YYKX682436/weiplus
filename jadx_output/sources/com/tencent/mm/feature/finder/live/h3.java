package com.tencent.mm.feature.finder.live;

/* loaded from: classes3.dex */
public final class h3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f66745d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kn0.g f66746e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f66747f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f66748g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.nw1 f66749h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(kn0.g gVar, long j17, java.lang.String str, r45.nw1 nw1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f66746e = gVar;
        this.f66747f = j17;
        this.f66748g = str;
        this.f66749h = nw1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.feature.finder.live.h3(this.f66746e, this.f66747f, this.f66748g, this.f66749h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.feature.finder.live.h3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f66745d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveFeatureService", "enterPreloadPlayer: preload start");
            gl2.e eVar = new gl2.e(this.f66746e, this.f66747f, this.f66748g, this.f66749h, null, 16, null);
            this.f66745d = 1;
            if (eVar.m(this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        int i18 = uc.n.f426265k1;
        uc.m.f426264a = null;
        return jz5.f0.f302826a;
    }
}
