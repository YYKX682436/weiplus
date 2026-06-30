package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes.dex */
public final class z2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10343x243c08b1 f146239d;

    public z2(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10343x243c08b1 activityC10343x243c08b1) {
        this.f146239d = activityC10343x243c08b1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/GroupAdminManagerUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rd0.e1 e1Var = (rd0.e1) i95.n0.c(rd0.e1.class);
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10343x243c08b1 activityC10343x243c08b1 = this.f146239d;
        java.lang.String string = activityC10343x243c08b1.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lns);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10343x243c08b1 activityC10343x243c08b12 = this.f146239d;
        java.lang.String str = activityC10343x243c08b12.f145294e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        android.content.Intent Ai = ((qd0.q0) e1Var).Ai(activityC10343x243c08b1, string, str, activityC10343x243c08b12.f145296g, activityC10343x243c08b12.f145297h, false);
        Ai.putExtra("block_contact", c01.z1.r());
        int i17 = com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10343x243c08b1.f145292q;
        Ai.putExtra("max_limit_num", 3 - activityC10343x243c08b12.f145296g.size());
        Ai.putExtra("too_many_member_tip_string", activityC10343x243c08b12.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lno));
        Ai.putExtra("too_many_member_tip_ok_string", activityC10343x243c08b12.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi));
        activityC10343x243c08b12.startActivityForResult(Ai, 0);
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/GroupAdminManagerUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
