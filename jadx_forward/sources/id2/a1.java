package id2;

/* loaded from: classes3.dex */
public final class a1 implements com.p314xaae8f345.mm.ui.p2740x696c9db.c5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ id2.v1 f372008d;

    public a1(id2.v1 v1Var) {
        this.f372008d = v1Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.c5
    public final void w2(int i17, boolean z17) {
        id2.v1 v1Var = this.f372008d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(v1Var.f372367d, "onKeyboardHeightChanged, height:" + i17 + ", isResized:" + z17);
        dl2.f0 f0Var = (dl2.f0) ((jz5.n) v1Var.f372383w).mo141623x754a37bb();
        if (((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c) ((jz5.n) f0Var.f316732c).mo141623x754a37bb()).isShowing) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(f0Var.f316751v);
            int intValue = valueOf.intValue();
            if (!(intValue >= 0 && intValue < ((dl2.p) ((jz5.n) f0Var.f316737h).mo141623x754a37bb()).mo1894x7e414b06())) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue2 = valueOf.intValue();
                jz5.g gVar = f0Var.f316736g;
                android.view.ViewGroup.LayoutParams layoutParams = ((com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) ((jz5.n) gVar).mo141623x754a37bb()).getLayoutParams();
                android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
                if (layoutParams2 != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f0Var.f316731b, "[onKeyBoardChange], height = " + i17 + ", pos = " + intValue2);
                    layoutParams2.setMargins(layoutParams2.leftMargin, layoutParams2.topMargin, layoutParams2.rightMargin, i17);
                    ((com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) ((jz5.n) gVar).mo141623x754a37bb()).setLayoutParams(layoutParams2);
                    if (i17 > 0) {
                        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) ((jz5.n) gVar).mo141623x754a37bb();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList.add(java.lang.Integer.valueOf(intValue2));
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(c22849x81a93d25, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveGiftPkgChooseView", "onKeyBoardChange", "(I)V", "Undefined", "scrollToPosition", "(I)V");
                        c22849x81a93d25.a1(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(c22849x81a93d25, "com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveGiftPkgChooseView", "onKeyBoardChange", "(I)V", "Undefined", "scrollToPosition", "(I)V");
                    }
                }
            }
        }
    }
}
