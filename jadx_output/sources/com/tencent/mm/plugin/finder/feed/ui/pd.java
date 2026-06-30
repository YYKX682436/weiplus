package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class pd extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f110419d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorRoleUI f110420e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pd(com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorRoleUI finderLiveVisitorRoleUI, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f110420e = finderLiveVisitorRoleUI;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.feed.ui.pd(this.f110420e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.feed.ui.pd) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f110419d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorRoleUI activity = this.f110420e;
            kotlin.jvm.internal.o.g(activity, "activity");
            com.tencent.mm.plugin.finder.live.viewmodel.z2 z2Var = (com.tencent.mm.plugin.finder.live.viewmodel.z2) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.live.viewmodel.z2.class);
            this.f110419d = 1;
            obj = z2Var.P6(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
