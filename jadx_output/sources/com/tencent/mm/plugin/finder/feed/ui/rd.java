package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class rd extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public boolean f110493d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f110494e;

    /* renamed from: f, reason: collision with root package name */
    public int f110495f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f110496g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorRoleUI f110497h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rd(com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorRoleUI finderLiveVisitorRoleUI, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f110497h = finderLiveVisitorRoleUI;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.finder.feed.ui.rd rdVar = new com.tencent.mm.plugin.finder.feed.ui.rd(this.f110497h, continuation);
        rdVar.f110496g = obj;
        return rdVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.feed.ui.rd) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.ui.rd.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
