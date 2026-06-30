package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes8.dex */
public final class y8 implements com.p314xaae8f345.mm.ui.p2740x696c9db.c5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13996x5a58c237 f192292d;

    public y8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13996x5a58c237 activityC13996x5a58c237) {
        this.f192292d = activityC13996x5a58c237;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.c5
    public final void w2(int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13996x5a58c237 activityC13996x5a58c237 = this.f192292d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC13996x5a58c237.f190888v, "onKeyboardHeightChanged, height:" + i17 + ", isResized:" + z17);
        boolean z18 = i17 > 0;
        android.widget.Button button = activityC13996x5a58c237.D;
        android.view.ViewGroup.LayoutParams layoutParams = button != null ? button.getLayoutParams() : null;
        android.widget.RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : null;
        int dimensionPixelOffset = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561264dn);
        if (layoutParams2 != null) {
            if (z18) {
                int i18 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).y;
                android.widget.Button button2 = activityC13996x5a58c237.D;
                int height = button2 != null ? button2.getHeight() : 0;
                int[] iArr = new int[2];
                android.view.View view = activityC13996x5a58c237.C;
                if (view != null) {
                    view.getLocationOnScreen(iArr);
                }
                int i19 = iArr[1];
                android.view.View view2 = activityC13996x5a58c237.C;
                int height2 = view2 != null ? view2.getHeight() : 1;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC13996x5a58c237.f190888v, "adjustConfirmBtn screenHeight:" + i18 + ",confirmBtnContainerH:" + height + ",descContainerY:" + i19 + ",itemHeight:" + height2 + ",height:" + i17);
                if (height != 0 && i19 != 0) {
                    int i27 = i19 + height2;
                    if (((i18 - dimensionPixelOffset) - height) - i27 > i17) {
                        int dimensionPixelOffset2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561264dn);
                        int dimensionPixelOffset3 = (((i18 - i17) - i27) - height) - com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561256df);
                        layoutParams2.removeRule(3);
                        layoutParams2.addRule(12);
                        if (dimensionPixelOffset2 > dimensionPixelOffset3) {
                            dimensionPixelOffset2 = dimensionPixelOffset3;
                        }
                        layoutParams2.bottomMargin = i17 + dimensionPixelOffset2;
                    }
                }
                android.view.View view3 = activityC13996x5a58c237.C;
                if (view3 != null) {
                    int id6 = view3.getId();
                    layoutParams2.removeRule(12);
                    layoutParams2.addRule(3, id6);
                    layoutParams2.bottomMargin = 0;
                }
            } else {
                layoutParams2.removeRule(3);
                layoutParams2.addRule(12);
                layoutParams2.bottomMargin = activityC13996x5a58c237.N;
            }
            android.widget.Button button3 = activityC13996x5a58c237.D;
            android.view.ViewParent parent = button3 != null ? button3.getParent() : null;
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.updateViewLayout(activityC13996x5a58c237.D, layoutParams2);
            }
        }
    }
}
