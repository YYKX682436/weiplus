package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class x8 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.z8 f64661d;

    public x8(com.tencent.mm.chatroom.ui.z8 z8Var) {
        this.f64661d = z8Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.chatroom.ui.z8 z8Var = this.f64661d;
        z8Var.f64722a.f63853q = true;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Chat_User", z8Var.f64722a.f63847h.d1());
        intent.addFlags(67108864);
        j45.l.u(z8Var.f64722a, ".ui.chatting.ChattingUI", intent, null);
    }
}
