package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes11.dex */
public final class e9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10358xb91848f8 f145665d;

    public e9(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10358xb91848f8 activityC10358xb91848f8) {
        this.f145665d = activityC10358xb91848f8;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/RoomSpecialFollowMemberManagerUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rd0.e1 e1Var = (rd0.e1) i95.n0.c(rd0.e1.class);
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10358xb91848f8 activityC10358xb91848f8 = this.f145665d;
        java.lang.String string = activityC10358xb91848f8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lns);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10358xb91848f8 activityC10358xb91848f82 = this.f145665d;
        java.lang.String str = activityC10358xb91848f82.f145390e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        android.content.Intent Ai = ((qd0.q0) e1Var).Ai(activityC10358xb91848f8, string, str, activityC10358xb91848f82.f145395m, activityC10358xb91848f82.f145396n, true);
        Ai.putExtra("block_contact", c01.z1.r());
        com.p314xaae8f345.mm.p648x55baa833.ui.b9 b9Var = com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10358xb91848f8.f145388u;
        Ai.putExtra("max_limit_num", b9Var.a() - activityC10358xb91848f82.f145395m.size());
        Ai.putExtra("too_many_member_tip_string", activityC10358xb91848f82.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i6k, java.lang.String.valueOf(b9Var.a())));
        Ai.putExtra("too_many_member_tip_ok_string", activityC10358xb91848f82.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi));
        int i17 = com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10343x243c08b1.f145292q;
        activityC10358xb91848f82.startActivityForResult(Ai, 0);
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/RoomSpecialFollowMemberManagerUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
