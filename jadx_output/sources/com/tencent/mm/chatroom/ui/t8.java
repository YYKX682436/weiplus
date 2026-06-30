package com.tencent.mm.chatroom.ui;

/* loaded from: classes5.dex */
public final class t8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.u8 f64551d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f64552e;

    public t8(com.tencent.mm.chatroom.ui.u8 u8Var, com.tencent.mm.storage.z3 z3Var) {
        this.f64551d = u8Var;
        this.f64552e = z3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/RoomFollowMemberViewHolder$fillContent$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.chatroom.ui.u8 u8Var = this.f64551d;
        com.tencent.mm.chatroom.ui.r8 r8Var = u8Var.f64575f;
        if (r8Var != null) {
            com.tencent.mm.storage.z3 z3Var = this.f64552e;
            java.lang.String d17 = z3Var.d1();
            kotlin.jvm.internal.o.f(d17, "getUsername(...)");
            java.lang.String i17 = com.tencent.mm.chatroom.ui.u8.i(u8Var, z3Var);
            java.lang.String P0 = z3Var.P0();
            kotlin.jvm.internal.o.f(P0, "getNickname(...)");
            r8Var.B3(d17, i17, P0, true);
        }
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/RoomFollowMemberViewHolder$fillContent$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
