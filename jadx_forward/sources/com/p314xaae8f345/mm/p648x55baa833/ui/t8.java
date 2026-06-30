package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes5.dex */
public final class t8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.u8 f146084d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.z3 f146085e;

    public t8(com.p314xaae8f345.mm.p648x55baa833.ui.u8 u8Var, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        this.f146084d = u8Var;
        this.f146085e = z3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/RoomFollowMemberViewHolder$fillContent$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p648x55baa833.ui.u8 u8Var = this.f146084d;
        com.p314xaae8f345.mm.p648x55baa833.ui.r8 r8Var = u8Var.f146108f;
        if (r8Var != null) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f146085e;
            java.lang.String d17 = z3Var.d1();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getUsername(...)");
            java.lang.String i17 = com.p314xaae8f345.mm.p648x55baa833.ui.u8.i(u8Var, z3Var);
            java.lang.String P0 = z3Var.P0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(P0, "getNickname(...)");
            r8Var.B3(d17, i17, P0, true);
        }
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/RoomFollowMemberViewHolder$fillContent$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
