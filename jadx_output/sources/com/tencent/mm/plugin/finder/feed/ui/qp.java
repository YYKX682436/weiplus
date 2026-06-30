package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class qp extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f110467d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI40 f110468e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f110469f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qp(com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI40 occupyFinderUI40, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f110468e = occupyFinderUI40;
        this.f110469f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.feed.ui.qp(this.f110468e, this.f110469f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.feed.ui.qp) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f110467d;
        java.lang.String str = this.f110469f;
        com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI40 occupyFinderUI40 = this.f110468e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add(str);
            this.f110467d = 1;
            int i18 = com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI40.G;
            obj = occupyFinderUI40.e7(2, linkedList, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
            int i19 = com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI40.G;
            occupyFinderUI40.getClass();
            ((ml2.j0) i95.n0.c(ml2.j0.class)).Nj("live_sensitive_word_delete", "view_clk", kz5.b1.e(new jz5.l("sensitive_word", str)));
        }
        return jz5.f0.f302826a;
    }
}
