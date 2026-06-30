package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5;

/* loaded from: classes.dex */
public class w2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f220865d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15859x7405890d f220866e;

    public w2(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15859x7405890d c15859x7405890d, int i17) {
        this.f220866e = c15859x7405890d;
        this.f220865d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15859x7405890d c15859x7405890d = this.f220866e;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = c15859x7405890d.A2;
        int i17 = this.f220865d;
        android.view.View mo7935xa188593e = c1162x665295de.mo7935xa188593e(i17);
        if (mo7935xa188593e != null) {
            int measuredHeight = c15859x7405890d.getMeasuredHeight() - mo7935xa188593e.getMeasuredHeight();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de2 = c15859x7405890d.A2;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(measuredHeight));
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c1162x665295de2, arrayList.toArray(), "com/tencent/mm/plugin/game/chatroom/view/GameChatListView$7", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            c1162x665295de2.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(c1162x665295de2, "com/tencent/mm/plugin/game/chatroom/view/GameChatListView$7", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
    }
}
