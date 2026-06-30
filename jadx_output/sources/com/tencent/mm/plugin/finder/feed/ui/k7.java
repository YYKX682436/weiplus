package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class k7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorCommentManagerUI f110215d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f110216e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7(com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorCommentManagerUI finderLiveAnchorCommentManagerUI, java.util.LinkedList linkedList) {
        super(0);
        this.f110215d = finderLiveAnchorCommentManagerUI;
        this.f110216e = linkedList;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        bm2.v1 v1Var = this.f110215d.A;
        if (v1Var != null) {
            v1Var.y(this.f110216e);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("adapter");
        throw null;
    }
}
