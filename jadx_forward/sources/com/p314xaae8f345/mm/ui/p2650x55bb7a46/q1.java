package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public final class q1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21612x526290cc f284129d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21612x526290cc activityC21612x526290cc) {
        super(1);
        this.f284129d = activityC21612x526290cc;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea c21628xcedb13ea;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21897x17252689 c21897x17252689;
        boolean z17;
        android.view.MotionEvent it = (android.view.MotionEvent) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        int i17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21612x526290cc.f279694z;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21612x526290cc activityC21612x526290cc = this.f284129d;
        activityC21612x526290cc.getClass();
        boolean z18 = true;
        if (it.getAction() == 0) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21897x17252689 c21897x172526892 = activityC21612x526290cc.f279787h.B;
            int rawX = (int) it.getRawX();
            int rawY = (int) it.getRawY();
            if (c21897x172526892 != null) {
                int[] iArr = new int[2];
                c21897x172526892.getLocationOnScreen(iArr);
                int i18 = iArr[0];
                int i19 = iArr[1];
                int measuredWidth = c21897x172526892.getMeasuredWidth() + i18;
                int measuredHeight = c21897x172526892.getMeasuredHeight() + i19;
                if (i18 <= rawX && rawX <= measuredWidth) {
                    if (i19 <= rawY && rawY <= measuredHeight) {
                        z17 = true;
                        activityC21612x526290cc.f279697w = z17;
                    }
                }
            }
            z17 = false;
            activityC21612x526290cc.f279697w = z17;
        }
        if (activityC21612x526290cc.f279697w && ((c21628xcedb13ea = activityC21612x526290cc.f279787h) == null || (c21897x17252689 = c21628xcedb13ea.B) == null || !c21897x17252689.E0() || !c21628xcedb13ea.B.m79076x2e45158f())) {
            z18 = false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizDialogChattingUI", "dialogCanPullDown:   isDownInListViewArea:" + activityC21612x526290cc.f279697w + "  result:" + z18);
        return java.lang.Boolean.valueOf(z18);
    }
}
