package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class u2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.v2 f64563d;

    public u2(com.tencent.mm.chatroom.ui.v2 v2Var) {
        this.f64563d = v2Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/DelChatroomMemberUI$DelChatroomMemberAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int intValue = ((java.lang.Integer) view.getTag()).intValue();
        com.tencent.mm.chatroom.ui.v2 v2Var = this.f64563d;
        com.tencent.mm.storage.z3 z3Var = (com.tencent.mm.storage.z3) v2Var.getItem(intValue);
        com.tencent.mm.chatroom.ui.DelChatroomMemberUI delChatroomMemberUI = v2Var.f64590e;
        java.lang.String string = delChatroomMemberUI.f63755p ? delChatroomMemberUI.getString(com.tencent.mm.R.string.i4f, v2Var.a(z3Var)) : delChatroomMemberUI.getString(com.tencent.mm.R.string.i4e, v2Var.a(z3Var));
        com.tencent.mm.chatroom.ui.DelChatroomMemberUI delChatroomMemberUI2 = v2Var.f64590e;
        java.lang.String string2 = delChatroomMemberUI2.f63755p ? delChatroomMemberUI2.getString(com.tencent.mm.R.string.i4n) : delChatroomMemberUI2.getString(com.tencent.mm.R.string.i4m);
        com.tencent.mm.chatroom.ui.DelChatroomMemberUI delChatroomMemberUI3 = v2Var.f64590e;
        db5.e1.C(delChatroomMemberUI3, string, null, string2, delChatroomMemberUI3.getString(com.tencent.mm.R.string.f490347sg), true, new com.tencent.mm.chatroom.ui.s2(this, z3Var), new com.tencent.mm.chatroom.ui.t2(this, z3Var));
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/DelChatroomMemberUI$DelChatroomMemberAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
