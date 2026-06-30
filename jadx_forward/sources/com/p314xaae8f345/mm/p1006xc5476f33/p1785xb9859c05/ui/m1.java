package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes15.dex */
public class m1 implements com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.j1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16133x8935f7ee f224472a;

    public m1(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16133x8935f7ee activityC16133x8935f7ee) {
        this.f224472a = activityC16133x8935f7ee;
    }

    public void a(java.lang.String str) {
        char charAt = str.charAt(0);
        boolean equals = "↑".equals(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16133x8935f7ee activityC16133x8935f7ee = this.f224472a;
        if (equals) {
            activityC16133x8935f7ee.f224111d.setSelection(0);
            return;
        }
        int[] iArr = activityC16133x8935f7ee.f224112e.f224380h;
        if (iArr == null) {
            return;
        }
        for (int i17 = 0; i17 < iArr.length; i17++) {
            if (iArr[i17] == charAt) {
                android.widget.ListView listView = activityC16133x8935f7ee.f224111d;
                listView.setSelection(i17 + listView.getHeaderViewsCount());
                return;
            }
        }
    }
}
