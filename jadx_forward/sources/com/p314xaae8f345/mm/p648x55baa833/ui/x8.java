package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes11.dex */
public class x8 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.z8 f146194d;

    public x8(com.p314xaae8f345.mm.p648x55baa833.ui.z8 z8Var) {
        this.f146194d = z8Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p648x55baa833.ui.z8 z8Var = this.f146194d;
        z8Var.f146255a.f145386q = true;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Chat_User", z8Var.f146255a.f145380h.d1());
        intent.addFlags(67108864);
        j45.l.u(z8Var.f146255a, ".ui.chatting.ChattingUI", intent, null);
    }
}
