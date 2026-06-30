package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes11.dex */
public class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.a0 f146233d;

    public z(com.p314xaae8f345.mm.p648x55baa833.ui.a0 a0Var) {
        this.f146233d = a0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/ChatroomInfoUI$25$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z17 = view instanceof android.widget.CheckBox;
        com.p314xaae8f345.mm.p648x55baa833.ui.a0 a0Var = this.f146233d;
        if (z17) {
            a0Var.f145555b.f145225g = ((android.widget.CheckBox) view).isChecked();
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h17 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) a0Var.f145555b.f145226h).h("room_clear_chatting_history");
        if (h17 instanceof com.p314xaae8f345.mm.p648x55baa833.ui.C10354x65bd049d) {
            ((com.p314xaae8f345.mm.p648x55baa833.ui.C10354x65bd049d) h17).L = !a0Var.f145555b.f145225g;
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h18 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) a0Var.f145555b.f145226h).h("room_del_quit");
        if (h18 instanceof com.p314xaae8f345.mm.p648x55baa833.ui.C10353x726ccc8) {
            ((com.p314xaae8f345.mm.p648x55baa833.ui.C10353x726ccc8) h18).W = !a0Var.f145555b.f145225g;
        }
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/ChatroomInfoUI$25$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
