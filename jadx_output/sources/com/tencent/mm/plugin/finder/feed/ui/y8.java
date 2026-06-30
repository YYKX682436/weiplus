package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes8.dex */
public final class y8 implements com.tencent.mm.ui.tools.c5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveCreateVisitorModeUI f110759d;

    public y8(com.tencent.mm.plugin.finder.feed.ui.FinderLiveCreateVisitorModeUI finderLiveCreateVisitorModeUI) {
        this.f110759d = finderLiveCreateVisitorModeUI;
    }

    @Override // com.tencent.mm.ui.tools.c5
    public final void w2(int i17, boolean z17) {
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveCreateVisitorModeUI finderLiveCreateVisitorModeUI = this.f110759d;
        com.tencent.mars.xlog.Log.i(finderLiveCreateVisitorModeUI.f109355v, "onKeyboardHeightChanged, height:" + i17 + ", isResized:" + z17);
        boolean z18 = i17 > 0;
        android.widget.Button button = finderLiveCreateVisitorModeUI.D;
        android.view.ViewGroup.LayoutParams layoutParams = button != null ? button.getLayoutParams() : null;
        android.widget.RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : null;
        int dimensionPixelOffset = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479731dn);
        if (layoutParams2 != null) {
            if (z18) {
                int i18 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).y;
                android.widget.Button button2 = finderLiveCreateVisitorModeUI.D;
                int height = button2 != null ? button2.getHeight() : 0;
                int[] iArr = new int[2];
                android.view.View view = finderLiveCreateVisitorModeUI.C;
                if (view != null) {
                    view.getLocationOnScreen(iArr);
                }
                int i19 = iArr[1];
                android.view.View view2 = finderLiveCreateVisitorModeUI.C;
                int height2 = view2 != null ? view2.getHeight() : 1;
                com.tencent.mars.xlog.Log.i(finderLiveCreateVisitorModeUI.f109355v, "adjustConfirmBtn screenHeight:" + i18 + ",confirmBtnContainerH:" + height + ",descContainerY:" + i19 + ",itemHeight:" + height2 + ",height:" + i17);
                if (height != 0 && i19 != 0) {
                    int i27 = i19 + height2;
                    if (((i18 - dimensionPixelOffset) - height) - i27 > i17) {
                        int dimensionPixelOffset2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479731dn);
                        int dimensionPixelOffset3 = (((i18 - i17) - i27) - height) - com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479723df);
                        layoutParams2.removeRule(3);
                        layoutParams2.addRule(12);
                        if (dimensionPixelOffset2 > dimensionPixelOffset3) {
                            dimensionPixelOffset2 = dimensionPixelOffset3;
                        }
                        layoutParams2.bottomMargin = i17 + dimensionPixelOffset2;
                    }
                }
                android.view.View view3 = finderLiveCreateVisitorModeUI.C;
                if (view3 != null) {
                    int id6 = view3.getId();
                    layoutParams2.removeRule(12);
                    layoutParams2.addRule(3, id6);
                    layoutParams2.bottomMargin = 0;
                }
            } else {
                layoutParams2.removeRule(3);
                layoutParams2.addRule(12);
                layoutParams2.bottomMargin = finderLiveCreateVisitorModeUI.N;
            }
            android.widget.Button button3 = finderLiveCreateVisitorModeUI.D;
            android.view.ViewParent parent = button3 != null ? button3.getParent() : null;
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.updateViewLayout(finderLiveCreateVisitorModeUI.D, layoutParams2);
            }
        }
    }
}
