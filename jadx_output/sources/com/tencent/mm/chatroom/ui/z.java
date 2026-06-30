package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.a0 f64700d;

    public z(com.tencent.mm.chatroom.ui.a0 a0Var) {
        this.f64700d = a0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/ChatroomInfoUI$25$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z17 = view instanceof android.widget.CheckBox;
        com.tencent.mm.chatroom.ui.a0 a0Var = this.f64700d;
        if (z17) {
            a0Var.f64022b.f63692g = ((android.widget.CheckBox) view).isChecked();
        }
        com.tencent.mm.ui.base.preference.Preference h17 = ((com.tencent.mm.ui.base.preference.h0) a0Var.f64022b.f63693h).h("room_clear_chatting_history");
        if (h17 instanceof com.tencent.mm.chatroom.ui.RoomClearHistoryPreference) {
            ((com.tencent.mm.chatroom.ui.RoomClearHistoryPreference) h17).L = !a0Var.f64022b.f63692g;
        }
        com.tencent.mm.ui.base.preference.Preference h18 = ((com.tencent.mm.ui.base.preference.h0) a0Var.f64022b.f63693h).h("room_del_quit");
        if (h18 instanceof com.tencent.mm.chatroom.ui.RoomButtonPreference) {
            ((com.tencent.mm.chatroom.ui.RoomButtonPreference) h18).W = !a0Var.f64022b.f63692g;
        }
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/ChatroomInfoUI$25$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
