package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes12.dex */
public class p4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.q4 f145956d;

    public p4(com.p314xaae8f345.mm.p648x55baa833.ui.q4 q4Var) {
        this.f145956d = q4Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI$ChatroomAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.z3) view.getTag();
        if (z3Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ManagerRoomByWeworkUI", "click:contact is nul");
            yj0.a.h(this, "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI$ChatroomAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.p648x55baa833.ui.q4 q4Var = this.f145956d;
        java.lang.Boolean bool = (java.lang.Boolean) q4Var.f145976g.get(z3Var.d1());
        if (!bool.booleanValue() && q4Var.f145977h == 5) {
            db5.t7.m123882x26a183b(q4Var.f145973d, com.p314xaae8f345.mm.R.C30867xcad56011.k4w, 0).show();
            yj0.a.h(this, "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI$ChatroomAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        q4Var.f145976g.put(z3Var.d1(), java.lang.Boolean.valueOf(bool.booleanValue() ? false : true));
        if (bool.booleanValue()) {
            q4Var.f145977h--;
            if (q4Var.f145975f.contains(z3Var.d1())) {
                q4Var.f145979m--;
            } else {
                q4Var.f145980n--;
            }
        } else {
            q4Var.f145977h++;
            if (q4Var.f145975f.contains(z3Var.d1())) {
                q4Var.f145979m++;
            } else {
                q4Var.f145980n++;
            }
        }
        q4Var.m8146xced61ae5();
        com.p314xaae8f345.mm.p648x55baa833.ui.s4 s4Var = q4Var.f145978i;
        if (s4Var != null) {
            com.p314xaae8f345.mm.p648x55baa833.ui.n4 n4Var = (com.p314xaae8f345.mm.p648x55baa833.ui.n4) s4Var;
            n4Var.getClass();
            int i17 = com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10347x6bb1b752.I;
            n4Var.f145921a.Z6();
        }
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/ManagerRoomByWeworkUI$ChatroomAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
