package com.tencent.mm.chatroom.ui;

/* loaded from: classes.dex */
public final class z2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.GroupAdminManagerUI f64706d;

    public z2(com.tencent.mm.chatroom.ui.GroupAdminManagerUI groupAdminManagerUI) {
        this.f64706d = groupAdminManagerUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/GroupAdminManagerUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rd0.e1 e1Var = (rd0.e1) i95.n0.c(rd0.e1.class);
        com.tencent.mm.chatroom.ui.GroupAdminManagerUI groupAdminManagerUI = this.f64706d;
        java.lang.String string = groupAdminManagerUI.getString(com.tencent.mm.R.string.lns);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        com.tencent.mm.chatroom.ui.GroupAdminManagerUI groupAdminManagerUI2 = this.f64706d;
        java.lang.String str = groupAdminManagerUI2.f63761e;
        kotlin.jvm.internal.o.d(str);
        android.content.Intent Ai = ((qd0.q0) e1Var).Ai(groupAdminManagerUI, string, str, groupAdminManagerUI2.f63763g, groupAdminManagerUI2.f63764h, false);
        Ai.putExtra("block_contact", c01.z1.r());
        int i17 = com.tencent.mm.chatroom.ui.GroupAdminManagerUI.f63759q;
        Ai.putExtra("max_limit_num", 3 - groupAdminManagerUI2.f63763g.size());
        Ai.putExtra("too_many_member_tip_string", groupAdminManagerUI2.getString(com.tencent.mm.R.string.lno));
        Ai.putExtra("too_many_member_tip_ok_string", groupAdminManagerUI2.getString(com.tencent.mm.R.string.f490454vi));
        groupAdminManagerUI2.startActivityForResult(Ai, 0);
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/GroupAdminManagerUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
