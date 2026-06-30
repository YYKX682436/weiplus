package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes.dex */
public final class k3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.m3 f145802d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.z3 f145803e;

    public k3(com.p314xaae8f345.mm.p648x55baa833.ui.m3 m3Var, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        this.f145802d = m3Var;
        this.f145803e = z3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/GroupAdminMemberViewHolder$fillContent$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p648x55baa833.ui.m3 m3Var = this.f145802d;
        com.p314xaae8f345.mm.p648x55baa833.ui.j3 j3Var = m3Var.f145889f;
        if (j3Var != null) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f145803e;
            java.lang.String d17 = z3Var.d1();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getUsername(...)");
            com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10343x243c08b1 activityC10343x243c08b1 = (com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10343x243c08b1) j3Var;
            java.lang.String string = activityC10343x243c08b1.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lnr, com.p314xaae8f345.mm.p648x55baa833.ui.m3.i(m3Var, z3Var));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) activityC10343x243c08b1.mo55332x76847179(), 1, true);
            k0Var.q(string, 17);
            k0Var.f293405n = new com.p314xaae8f345.mm.p648x55baa833.ui.e3(activityC10343x243c08b1);
            k0Var.f293414s = new com.p314xaae8f345.mm.p648x55baa833.ui.f3(activityC10343x243c08b1, d17);
            k0Var.v();
        }
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/GroupAdminMemberViewHolder$fillContent$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
