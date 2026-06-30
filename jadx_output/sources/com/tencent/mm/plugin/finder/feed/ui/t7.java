package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class t7 implements com.tencent.mm.ui.tools.c5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorUI f110557d;

    public t7(com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorUI finderLiveAnchorUI) {
        this.f110557d = finderLiveAnchorUI;
    }

    @Override // com.tencent.mm.ui.tools.c5
    public final void w2(int i17, boolean z17) {
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorUI finderLiveAnchorUI = this.f110557d;
        com.tencent.mars.xlog.Log.i(finderLiveAnchorUI.f109332v, "onKeyboardHeightChanged, height:" + i17 + ", isResized:" + z17);
        boolean z18 = i17 > 0;
        if (finderLiveAnchorUI.f109333w == z18) {
            return;
        }
        finderLiveAnchorUI.f109333w = z18;
        com.tencent.mm.plugin.finder.live.view.v1 v1Var = finderLiveAnchorUI.f109334x;
        if (v1Var != null) {
            v1Var.keyboardChange(z18, i17);
        }
    }
}
