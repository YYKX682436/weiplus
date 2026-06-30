package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class p7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f108256d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.r7 f108257e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.n0 f108258f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7(com.tencent.mm.plugin.finder.feed.model.r7 r7Var, com.tencent.mm.plugin.finder.feed.model.internal.n0 n0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f108257e = r7Var;
        this.f108258f = n0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.feed.model.p7(this.f108257e, this.f108258f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.feed.model.p7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.model.p7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
