package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class qd extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f110453d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorRoleUI f110454e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qd(com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorRoleUI finderLiveVisitorRoleUI, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f110454e = finderLiveVisitorRoleUI;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.feed.ui.qd(this.f110454e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.feed.ui.qd) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f110453d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorRoleUI activity = this.f110454e;
            kotlin.jvm.internal.o.g(activity, "activity");
            com.tencent.mm.plugin.finder.live.viewmodel.v9 v9Var = (com.tencent.mm.plugin.finder.live.viewmodel.v9) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.live.viewmodel.v9.class);
            this.f110453d = 1;
            obj = v9Var.P6(this);
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
