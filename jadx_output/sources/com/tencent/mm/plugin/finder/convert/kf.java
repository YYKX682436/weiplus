package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class kf extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.zf f103829d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f103830e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kf(com.tencent.mm.plugin.finder.convert.zf zfVar, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f103829d = zfVar;
        this.f103830e = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.convert.kf(this.f103829d, this.f103830e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.convert.kf) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.String str = this.f103829d.f105110p1;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("deleteLiveFeed FinderFeedLogic deleteFeed ");
        long j17 = this.f103830e;
        sb6.append(j17);
        com.tencent.mars.xlog.Log.e(str, sb6.toString());
        cu2.u.f222441a.b(j17);
        return java.lang.Boolean.TRUE;
    }
}
