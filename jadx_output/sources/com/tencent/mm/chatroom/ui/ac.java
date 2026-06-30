package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class ac implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.cc f64041d;

    public ac(com.tencent.mm.chatroom.ui.cc ccVar) {
        this.f64041d = ccVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/SeeRoomMemberUI$ChatroomMemberAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.SeeRoomMemberUI", "onItemClick %s%s", view, view.getTag());
        if (view.getTag() != null) {
            int intValue = ((java.lang.Integer) view.getTag()).intValue();
            com.tencent.mm.chatroom.ui.SeeRoomMemberUI seeRoomMemberUI = this.f64041d.f64091m;
            ((com.tencent.mm.chatroom.ui.tb) seeRoomMemberUI.f63952x).onItemClick(seeRoomMemberUI.f63935d, view, intValue, intValue);
        }
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/SeeRoomMemberUI$ChatroomMemberAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
