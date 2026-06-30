package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class t2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f64520d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.u2 f64521e;

    public t2(com.tencent.mm.chatroom.ui.u2 u2Var, com.tencent.mm.storage.z3 z3Var) {
        this.f64521e = u2Var;
        this.f64520d = z3Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.chatroom.ui.v2 v2Var = this.f64521e.f64563d;
        com.tencent.mm.chatroom.ui.DelChatroomMemberUI delChatroomMemberUI = v2Var.f64590e;
        if (delChatroomMemberUI.f63753n == 1) {
            com.tencent.mm.chatroom.ui.DelChatroomMemberUI.U6(delChatroomMemberUI, delChatroomMemberUI.f63758s, delChatroomMemberUI.f63754o, delChatroomMemberUI.f63750h, v2Var.getCount(), 1, 1, this.f64520d.d1());
        }
    }
}
