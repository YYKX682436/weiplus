package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5;

/* loaded from: classes15.dex */
public class v2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15859x7405890d f220856d;

    public v2(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15859x7405890d c15859x7405890d) {
        this.f220856d = c15859x7405890d;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/view/GameChatListView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15859x7405890d c15859x7405890d = this.f220856d;
        android.view.View view2 = c15859x7405890d.f220512y2;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/game/chatroom/view/GameChatListView$6", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/game/chatroom/view/GameChatListView$6", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (c15859x7405890d.f220512y2.getTag() instanceof java.lang.Long) {
            long longValue = ((java.lang.Long) c15859x7405890d.f220512y2.getTag()).longValue();
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.g.f149728a.g(2L, 2L, c15859x7405890d.f220496i2, c15859x7405890d.f220495h2, longValue, "", 0L, c15859x7405890d.f220500m2);
            c15859x7405890d.r1(longValue, false);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/view/GameChatListView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
