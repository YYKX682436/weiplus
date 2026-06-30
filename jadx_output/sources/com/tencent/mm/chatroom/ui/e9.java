package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public final class e9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.RoomSpecialFollowMemberManagerUI f64132d;

    public e9(com.tencent.mm.chatroom.ui.RoomSpecialFollowMemberManagerUI roomSpecialFollowMemberManagerUI) {
        this.f64132d = roomSpecialFollowMemberManagerUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/RoomSpecialFollowMemberManagerUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rd0.e1 e1Var = (rd0.e1) i95.n0.c(rd0.e1.class);
        com.tencent.mm.chatroom.ui.RoomSpecialFollowMemberManagerUI roomSpecialFollowMemberManagerUI = this.f64132d;
        java.lang.String string = roomSpecialFollowMemberManagerUI.getString(com.tencent.mm.R.string.lns);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        com.tencent.mm.chatroom.ui.RoomSpecialFollowMemberManagerUI roomSpecialFollowMemberManagerUI2 = this.f64132d;
        java.lang.String str = roomSpecialFollowMemberManagerUI2.f63857e;
        kotlin.jvm.internal.o.d(str);
        android.content.Intent Ai = ((qd0.q0) e1Var).Ai(roomSpecialFollowMemberManagerUI, string, str, roomSpecialFollowMemberManagerUI2.f63862m, roomSpecialFollowMemberManagerUI2.f63863n, true);
        Ai.putExtra("block_contact", c01.z1.r());
        com.tencent.mm.chatroom.ui.b9 b9Var = com.tencent.mm.chatroom.ui.RoomSpecialFollowMemberManagerUI.f63855u;
        Ai.putExtra("max_limit_num", b9Var.a() - roomSpecialFollowMemberManagerUI2.f63862m.size());
        Ai.putExtra("too_many_member_tip_string", roomSpecialFollowMemberManagerUI2.getString(com.tencent.mm.R.string.i6k, java.lang.String.valueOf(b9Var.a())));
        Ai.putExtra("too_many_member_tip_ok_string", roomSpecialFollowMemberManagerUI2.getString(com.tencent.mm.R.string.f490454vi));
        int i17 = com.tencent.mm.chatroom.ui.GroupAdminManagerUI.f63759q;
        roomSpecialFollowMemberManagerUI2.startActivityForResult(Ai, 0);
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/RoomSpecialFollowMemberManagerUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
