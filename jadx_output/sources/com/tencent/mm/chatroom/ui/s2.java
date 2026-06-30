package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class s2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f64498d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.u2 f64499e;

    public s2(com.tencent.mm.chatroom.ui.u2 u2Var, com.tencent.mm.storage.z3 z3Var) {
        this.f64499e = u2Var;
        this.f64498d = z3Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.chatroom.ui.u2 u2Var = this.f64499e;
        com.tencent.mm.chatroom.ui.DelChatroomMemberUI delChatroomMemberUI = u2Var.f64563d.f64590e;
        boolean z17 = delChatroomMemberUI.f63755p;
        com.tencent.mm.storage.z3 z3Var = this.f64498d;
        if (!z17) {
            com.tencent.mm.chatroom.ui.DelChatroomMemberUI.T6(delChatroomMemberUI, z3Var.d1(), false);
            return;
        }
        delChatroomMemberUI.f63756q = null;
        gd0.f V6 = com.tencent.mm.chatroom.ui.DelChatroomMemberUI.V6(delChatroomMemberUI.f63748f, delChatroomMemberUI.f63758s, 2, z3Var.d1(), new com.tencent.mm.chatroom.ui.r2(this));
        com.tencent.mm.chatroom.ui.DelChatroomMemberUI delChatroomMemberUI2 = u2Var.f64563d.f64590e;
        android.app.ProgressDialog progressDialog = delChatroomMemberUI2.f63757r;
        if (progressDialog == null) {
            delChatroomMemberUI2.f63757r = db5.e1.Q(delChatroomMemberUI2, delChatroomMemberUI2.getString(com.tencent.mm.R.string.f490573yv), delChatroomMemberUI2.getString(com.tencent.mm.R.string.i4_), true, true, new com.tencent.mm.chatroom.ui.p2(delChatroomMemberUI2, V6));
        } else {
            progressDialog.show();
        }
    }
}
