package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class j7 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorCommentManagerUI f110179a;

    public j7(com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorCommentManagerUI finderLiveAnchorCommentManagerUI) {
        this.f110179a = finderLiveAnchorCommentManagerUI;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorCommentManagerUI finderLiveAnchorCommentManagerUI = this.f110179a;
        if (i17 == 0 && fVar.f70616b == 0) {
            db5.t7.h(finderLiveAnchorCommentManagerUI.getContext(), finderLiveAnchorCommentManagerUI.getContext().getResources().getString(com.tencent.mm.R.string.dtb));
        } else {
            db5.t7.g(finderLiveAnchorCommentManagerUI.getContext(), finderLiveAnchorCommentManagerUI.getContext().getResources().getString(com.tencent.mm.R.string.dtd));
        }
        int i18 = com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorCommentManagerUI.f109322J;
        finderLiveAnchorCommentManagerUI.f7();
        return jz5.f0.f302826a;
    }
}
