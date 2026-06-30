package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes5.dex */
public final class s8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.u8 f146043d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.z3 f146044e;

    public s8(com.p314xaae8f345.mm.p648x55baa833.ui.u8 u8Var, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        this.f146043d = u8Var;
        this.f146044e = z3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/RoomFollowMemberViewHolder$fillContent$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p648x55baa833.ui.u8 u8Var = this.f146043d;
        com.p314xaae8f345.mm.p648x55baa833.ui.r8 r8Var = u8Var.f146108f;
        if (r8Var != null) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f146044e;
            java.lang.String d17 = z3Var.d1();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getUsername(...)");
            r8Var.M0(d17, com.p314xaae8f345.mm.p648x55baa833.ui.u8.i(u8Var, z3Var));
        }
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/RoomFollowMemberViewHolder$fillContent$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
