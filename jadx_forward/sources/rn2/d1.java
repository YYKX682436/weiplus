package rn2;

/* loaded from: classes8.dex */
public final class d1 implements com.p314xaae8f345.mm.ui.p2740x696c9db.c5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rn2.f1 f479222d;

    public d1(rn2.f1 f1Var) {
        this.f479222d = f1Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.c5
    public final void w2(int i17, boolean z17) {
        rn2.f1 f1Var = this.f479222d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f1Var.f479262d, "onKeyboardHeightChanged, height:" + i17 + ", isResized:" + z17);
        boolean z18 = i17 > 0;
        if (f1Var.f479266h == z18) {
            return;
        }
        f1Var.f479266h = z18;
        rn2.g gVar = f1Var.f479264f;
        if (gVar != null) {
            rn2.t2 t2Var = (rn2.t2) gVar;
            android.view.View view = t2Var.H;
            android.view.ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
            android.widget.RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : null;
            int dimensionPixelOffset = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561264dn);
            if (layoutParams2 != null) {
                if (z18) {
                    int i18 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).y;
                    android.view.View view2 = t2Var.H;
                    int height = view2 != null ? view2.getHeight() : 0;
                    int[] iArr = new int[2];
                    android.view.View view3 = t2Var.f479398q;
                    if (view3 != null) {
                        view3.getLocationOnScreen(iArr);
                    }
                    int i19 = iArr[1];
                    android.view.View view4 = t2Var.f479398q;
                    int height2 = view4 != null ? view4.getHeight() : 0;
                    int i27 = ((i18 - dimensionPixelOffset) - height) - (i19 + height2);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLotteryCreateViewCallback", "adjustConfirmBtnLayout screenHeight:" + i18 + ", bottomSpaceHeight:" + dimensionPixelOffset + ", confirmBtnContainerH:" + height + ",descContainerY:" + i19 + ",itemHeight:" + height2 + ",leftHeight:" + i27 + ",height:" + i17);
                    if (height == 0 || i19 == 0 || i27 <= i17) {
                        android.view.View view5 = t2Var.f479395p;
                        if (view5 != null) {
                            int id6 = view5.getId();
                            layoutParams2.removeRule(2);
                            layoutParams2.removeRule(12);
                            layoutParams2.addRule(3, id6);
                            layoutParams2.bottomMargin = 0;
                        }
                    } else {
                        layoutParams2.removeRule(2);
                        layoutParams2.removeRule(3);
                        layoutParams2.addRule(12);
                        layoutParams2.bottomMargin = i17;
                    }
                } else {
                    layoutParams2.removeRule(2);
                    layoutParams2.removeRule(3);
                    layoutParams2.addRule(12);
                    layoutParams2.bottomMargin = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561265dp);
                }
                android.view.View view6 = t2Var.H;
                android.view.ViewParent parent = view6 != null ? view6.getParent() : null;
                android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.updateViewLayout(t2Var.H, layoutParams2);
                }
            }
        }
    }
}
