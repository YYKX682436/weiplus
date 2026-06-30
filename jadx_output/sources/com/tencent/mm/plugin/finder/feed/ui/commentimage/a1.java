package com.tencent.mm.plugin.finder.feed.ui.commentimage;

/* loaded from: classes10.dex */
public final class a1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.commentimage.d1 f109796d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f109797e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f109798f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(com.tencent.mm.plugin.finder.feed.ui.commentimage.d1 d1Var, so2.y0 y0Var, kotlin.jvm.internal.c0 c0Var) {
        super(1);
        this.f109796d = d1Var;
        this.f109797e = y0Var;
        this.f109798f = c0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (!((java.lang.Boolean) obj).booleanValue()) {
            long id6 = this.f109796d.O6().getId();
            long itemId = this.f109797e.getItemId();
            boolean z17 = !this.f109798f.f310112d;
            com.tencent.mm.autogen.events.FinderCommentChangeEvent finderCommentChangeEvent = new com.tencent.mm.autogen.events.FinderCommentChangeEvent();
            am.ta taVar = finderCommentChangeEvent.f54263g;
            taVar.f7993a = id6;
            taVar.f7994b = itemId;
            taVar.f7995c = z17 ? com.tencent.mm.plugin.finder.storage.wj0.Z : com.tencent.mm.plugin.finder.storage.wj0.f128259p0;
            finderCommentChangeEvent.e();
        }
        return jz5.f0.f302826a;
    }
}
