package com.tencent.mm.chatroom.ui;

/* loaded from: classes.dex */
public final class k3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.m3 f64269d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f64270e;

    public k3(com.tencent.mm.chatroom.ui.m3 m3Var, com.tencent.mm.storage.z3 z3Var) {
        this.f64269d = m3Var;
        this.f64270e = z3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/GroupAdminMemberViewHolder$fillContent$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.chatroom.ui.m3 m3Var = this.f64269d;
        com.tencent.mm.chatroom.ui.j3 j3Var = m3Var.f64356f;
        if (j3Var != null) {
            com.tencent.mm.storage.z3 z3Var = this.f64270e;
            java.lang.String d17 = z3Var.d1();
            kotlin.jvm.internal.o.f(d17, "getUsername(...)");
            com.tencent.mm.chatroom.ui.GroupAdminManagerUI groupAdminManagerUI = (com.tencent.mm.chatroom.ui.GroupAdminManagerUI) j3Var;
            java.lang.String string = groupAdminManagerUI.getContext().getString(com.tencent.mm.R.string.lnr, com.tencent.mm.chatroom.ui.m3.i(m3Var, z3Var));
            kotlin.jvm.internal.o.f(string, "getString(...)");
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) groupAdminManagerUI.getContext(), 1, true);
            k0Var.q(string, 17);
            k0Var.f211872n = new com.tencent.mm.chatroom.ui.e3(groupAdminManagerUI);
            k0Var.f211881s = new com.tencent.mm.chatroom.ui.f3(groupAdminManagerUI, d17);
            k0Var.v();
        }
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/GroupAdminMemberViewHolder$fillContent$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
