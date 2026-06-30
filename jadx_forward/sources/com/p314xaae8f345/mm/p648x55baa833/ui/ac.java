package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes11.dex */
public class ac implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.cc f145574d;

    public ac(com.p314xaae8f345.mm.p648x55baa833.ui.cc ccVar) {
        this.f145574d = ccVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/SeeRoomMemberUI$ChatroomMemberAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SeeRoomMemberUI", "onItemClick %s%s", view, view.getTag());
        if (view.getTag() != null) {
            int intValue = ((java.lang.Integer) view.getTag()).intValue();
            com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10365x4886147c activityC10365x4886147c = this.f145574d.f145624m;
            ((com.p314xaae8f345.mm.p648x55baa833.ui.tb) activityC10365x4886147c.f145485x).onItemClick(activityC10365x4886147c.f145468d, view, intValue, intValue);
        }
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/SeeRoomMemberUI$ChatroomMemberAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
