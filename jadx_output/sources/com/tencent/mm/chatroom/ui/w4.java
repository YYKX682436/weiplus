package com.tencent.mm.chatroom.ui;

/* loaded from: classes.dex */
public class w4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ModRemarkRoomNameUI f64617d;

    public w4(com.tencent.mm.chatroom.ui.ModRemarkRoomNameUI modRemarkRoomNameUI) {
        this.f64617d = modRemarkRoomNameUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/ModRemarkRoomNameUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.chatroom.ui.ModRemarkRoomNameUI modRemarkRoomNameUI = this.f64617d;
        com.tencent.mm.ui.base.MMClearEditText mMClearEditText = modRemarkRoomNameUI.f63817d;
        mMClearEditText.setText("");
        mMClearEditText.d();
        android.view.View view2 = modRemarkRoomNameUI.f63818e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/chatroom/ui/ModRemarkRoomNameUI$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/chatroom/ui/ModRemarkRoomNameUI$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/ModRemarkRoomNameUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
