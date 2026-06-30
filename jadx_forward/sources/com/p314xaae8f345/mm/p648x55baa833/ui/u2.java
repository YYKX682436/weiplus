package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes11.dex */
public class u2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.v2 f146096d;

    public u2(com.p314xaae8f345.mm.p648x55baa833.ui.v2 v2Var) {
        this.f146096d = v2Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/DelChatroomMemberUI$DelChatroomMemberAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int intValue = ((java.lang.Integer) view.getTag()).intValue();
        com.p314xaae8f345.mm.p648x55baa833.ui.v2 v2Var = this.f146096d;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.z3) v2Var.getItem(intValue);
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10342x4f979a0c activityC10342x4f979a0c = v2Var.f146123e;
        java.lang.String string = activityC10342x4f979a0c.f145288p ? activityC10342x4f979a0c.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i4f, v2Var.a(z3Var)) : activityC10342x4f979a0c.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i4e, v2Var.a(z3Var));
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10342x4f979a0c activityC10342x4f979a0c2 = v2Var.f146123e;
        java.lang.String string2 = activityC10342x4f979a0c2.f145288p ? activityC10342x4f979a0c2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i4n) : activityC10342x4f979a0c2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i4m);
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10342x4f979a0c activityC10342x4f979a0c3 = v2Var.f146123e;
        db5.e1.C(activityC10342x4f979a0c3, string, null, string2, activityC10342x4f979a0c3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), true, new com.p314xaae8f345.mm.p648x55baa833.ui.s2(this, z3Var), new com.p314xaae8f345.mm.p648x55baa833.ui.t2(this, z3Var));
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/DelChatroomMemberUI$DelChatroomMemberAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
