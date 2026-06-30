package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class lp extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f110285d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI39 f110286e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lp(com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI39 occupyFinderUI39, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f110286e = occupyFinderUI39;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.feed.ui.lp(this.f110286e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.feed.ui.lp) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f110285d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f110285d = 1;
            int i18 = com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI39.C;
            if (this.f110286e.d7(3, new java.util.LinkedList(), this) == aVar) {
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
