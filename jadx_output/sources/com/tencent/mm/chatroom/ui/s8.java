package com.tencent.mm.chatroom.ui;

/* loaded from: classes5.dex */
public final class s8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.u8 f64510d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f64511e;

    public s8(com.tencent.mm.chatroom.ui.u8 u8Var, com.tencent.mm.storage.z3 z3Var) {
        this.f64510d = u8Var;
        this.f64511e = z3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/RoomFollowMemberViewHolder$fillContent$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.chatroom.ui.u8 u8Var = this.f64510d;
        com.tencent.mm.chatroom.ui.r8 r8Var = u8Var.f64575f;
        if (r8Var != null) {
            com.tencent.mm.storage.z3 z3Var = this.f64511e;
            java.lang.String d17 = z3Var.d1();
            kotlin.jvm.internal.o.f(d17, "getUsername(...)");
            r8Var.M0(d17, com.tencent.mm.chatroom.ui.u8.i(u8Var, z3Var));
        }
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/RoomFollowMemberViewHolder$fillContent$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
