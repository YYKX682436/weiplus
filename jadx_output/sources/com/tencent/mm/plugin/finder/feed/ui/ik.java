package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class ik extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderSelfHistoryContentFragment f110159d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ik(com.tencent.mm.plugin.finder.feed.ui.FinderSelfHistoryContentFragment finderSelfHistoryContentFragment) {
        super(1);
        this.f110159d = finderSelfHistoryContentFragment;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.feed.model.w7 it = (com.tencent.mm.plugin.finder.feed.model.w7) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.presenter.contract.FinderSelfHistoryContract.PlayHistoryViewCallback playHistoryViewCallback = this.f110159d.f109540w;
        if (playHistoryViewCallback != null) {
            playHistoryViewCallback.W();
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("viewCallback");
        throw null;
    }
}
