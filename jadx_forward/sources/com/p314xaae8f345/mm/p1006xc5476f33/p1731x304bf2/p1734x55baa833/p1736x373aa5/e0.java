package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5;

/* loaded from: classes8.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15850x99d4a1f6 f220610d;

    public e0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15850x99d4a1f6 c15850x99d4a1f6) {
        this.f220610d = c15850x99d4a1f6;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15850x99d4a1f6 c15850x99d4a1f6 = this.f220610d;
        c15850x99d4a1f6.f220437i2 = c15850x99d4a1f6.f220436h2.getHeight();
        int height = c15850x99d4a1f6.getHeight();
        int computeVerticalScrollExtent = c15850x99d4a1f6.computeVerticalScrollExtent();
        int computeVerticalScrollRange = c15850x99d4a1f6.computeVerticalScrollRange();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatRoomListView", "mMinFooterHeight:%d, listViewHeight:%d, extentHeight:%d, rangeHeight:%d", java.lang.Integer.valueOf(c15850x99d4a1f6.f220437i2), java.lang.Integer.valueOf(height), java.lang.Integer.valueOf(computeVerticalScrollExtent), java.lang.Integer.valueOf(computeVerticalScrollRange));
        int i17 = ((computeVerticalScrollExtent - computeVerticalScrollRange) - c15850x99d4a1f6.f220437i2) / 2;
        if (i17 > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15848xb1a1c7b3 c15848xb1a1c7b3 = c15850x99d4a1f6.f220436h2;
            android.view.View view = c15848xb1a1c7b3.f220424n;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/chatroom/view/ChatRoomFooterView", "extendEmptyLayout", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomFooterView", "extendEmptyLayout", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) c15848xb1a1c7b3.f220424n.getLayoutParams();
            layoutParams.topMargin += i17;
            layoutParams.bottomMargin += i17;
            c15848xb1a1c7b3.f220424n.setLayoutParams(layoutParams);
        }
    }
}
