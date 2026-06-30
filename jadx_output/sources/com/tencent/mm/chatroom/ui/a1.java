package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class a1 implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ChatroomInfoUI f64023d;

    public a1(com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI) {
        this.f64023d = chatroomInfoUI;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView absListView, int i17, int i18, int i19) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/ChatroomInfoUI$9", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        int i27 = i17 + i18;
        boolean z17 = com.tencent.mm.chatroom.ui.ChatroomInfoUI.Y;
        com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI = this.f64023d;
        android.view.View findViewById = chatroomInfoUI.getListView().findViewById(com.tencent.mm.R.id.suy);
        if (findViewById == null) {
            com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference = chatroomInfoUI.f63701s;
            if (contactListExpandPreference != null) {
                if (i27 <= ((r35.u1) contactListExpandPreference.M).f369272d.size()) {
                    chatroomInfoUI.q7();
                } else {
                    chatroomInfoUI.l7();
                }
            }
        } else if (i27 > chatroomInfoUI.getListView().getPositionForView(findViewById)) {
            int[] iArr = new int[2];
            findViewById.getLocationOnScreen(iArr);
            if ((iArr[1] + findViewById.getHeight()) - com.tencent.mm.ui.bl.h(chatroomInfoUI) <= i65.a.k(chatroomInfoUI)) {
                chatroomInfoUI.l7();
            } else {
                chatroomInfoUI.q7();
            }
        } else {
            chatroomInfoUI.l7();
        }
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/ChatroomInfoUI$9", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/ChatroomInfoUI$9", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/ChatroomInfoUI$9", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
