package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd;

/* loaded from: classes3.dex */
public final class a {
    public a(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final boolean a(android.view.View view, android.view.MotionEvent ev6) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isTouchPointInView", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC$Companion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        boolean z17 = false;
        if (view == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isTouchPointInView", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC$Companion");
            return false;
        }
        int rawX = (int) ev6.getRawX();
        int rawY = (int) ev6.getRawY();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i17 = iArr[0];
        int i18 = iArr[1];
        int measuredWidth = view.getMeasuredWidth() + i17;
        if ((i18 <= rawY && rawY <= view.getMeasuredHeight() + i18) && rawX >= i17 && rawX <= measuredWidth) {
            z17 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isTouchPointInView", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC$Companion");
        return z17;
    }
}
