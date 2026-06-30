package com.tencent.mm.chatroom.ui;

/* loaded from: classes12.dex */
public class p4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.q4 f64423d;

    public p4(com.tencent.mm.chatroom.ui.q4 q4Var) {
        this.f64423d = q4Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI$ChatroomAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.storage.z3 z3Var = (com.tencent.mm.storage.z3) view.getTag();
        if (z3Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ManagerRoomByWeworkUI", "click:contact is nul");
            yj0.a.h(this, "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI$ChatroomAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.chatroom.ui.q4 q4Var = this.f64423d;
        java.lang.Boolean bool = (java.lang.Boolean) q4Var.f64443g.get(z3Var.d1());
        if (!bool.booleanValue() && q4Var.f64444h == 5) {
            db5.t7.makeText(q4Var.f64440d, com.tencent.mm.R.string.k4w, 0).show();
            yj0.a.h(this, "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI$ChatroomAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        q4Var.f64443g.put(z3Var.d1(), java.lang.Boolean.valueOf(bool.booleanValue() ? false : true));
        if (bool.booleanValue()) {
            q4Var.f64444h--;
            if (q4Var.f64442f.contains(z3Var.d1())) {
                q4Var.f64446m--;
            } else {
                q4Var.f64447n--;
            }
        } else {
            q4Var.f64444h++;
            if (q4Var.f64442f.contains(z3Var.d1())) {
                q4Var.f64446m++;
            } else {
                q4Var.f64447n++;
            }
        }
        q4Var.notifyDataSetChanged();
        com.tencent.mm.chatroom.ui.s4 s4Var = q4Var.f64445i;
        if (s4Var != null) {
            com.tencent.mm.chatroom.ui.n4 n4Var = (com.tencent.mm.chatroom.ui.n4) s4Var;
            n4Var.getClass();
            int i17 = com.tencent.mm.chatroom.ui.ManagerRoomByWeworkUI.I;
            n4Var.f64388a.Z6();
        }
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI$ChatroomAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
