package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class jk extends com.tencent.mm.plugin.finder.presenter.contract.FinderSelfHistoryContract.PlayHistoryViewCallback {
    public final /* synthetic */ android.view.View A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk(com.tencent.mm.plugin.finder.feed.ui.FinderSelfHistoryContentFragment finderSelfHistoryContentFragment, android.view.View view, int i17, com.tencent.mm.ui.MMActivity mMActivity, int i18) {
        super(i17, mMActivity, finderSelfHistoryContentFragment, 0, i18, false, 32, null);
        this.A = view;
    }

    @Override // com.tencent.mm.plugin.finder.presenter.contract.FinderSelfHistoryContract.PlayHistoryViewCallback, com.tencent.mm.plugin.finder.feed.a1
    public android.view.View A() {
        return this.A;
    }
}
