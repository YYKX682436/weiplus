package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class dp extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f109954d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI39 f109955e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f109956f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dp(com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI39 occupyFinderUI39, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f109955e = occupyFinderUI39;
        this.f109956f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.feed.ui.dp(this.f109955e, this.f109956f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.feed.ui.dp) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f109954d;
        java.lang.String str = this.f109956f;
        com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI39 occupyFinderUI39 = this.f109955e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add(str);
            this.f109954d = 1;
            int i18 = com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI39.C;
            obj = occupyFinderUI39.d7(1, linkedList, this);
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
            int i19 = com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI39.C;
            occupyFinderUI39.f7("live_sensitive_word_add", "view_clk", str);
        }
        return jz5.f0.f302826a;
    }
}
