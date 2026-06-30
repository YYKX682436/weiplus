package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class a0 implements com.tencent.mm.chatroom.ui.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f64021a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ChatroomInfoUI f64022b;

    public a0(com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI, boolean z17) {
        this.f64022b = chatroomInfoUI;
        this.f64021a = z17;
    }

    @Override // com.tencent.mm.chatroom.ui.b1
    public void a(android.widget.CheckBox checkBox) {
        checkBox.setOnClickListener(new com.tencent.mm.chatroom.ui.z(this));
        checkBox.setChecked(this.f64022b.f63692g);
    }

    @Override // com.tencent.mm.chatroom.ui.b1
    public void b(android.widget.CheckBox checkBox) {
        com.tencent.mm.storage.a3 a3Var;
        boolean isChecked = checkBox.isChecked();
        com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI = this.f64022b;
        if (isChecked) {
            if (!chatroomInfoUI.B || (a3Var = chatroomInfoUI.F) == null || a3Var.A0().size() <= 2) {
                chatroomInfoUI.g7(this.f64021a, chatroomInfoUI.getResources().getString(com.tencent.mm.R.string.hqk));
                return;
            } else {
                chatroomInfoUI.h7(0, chatroomInfoUI.getResources().getString(com.tencent.mm.R.string.hqk));
                return;
            }
        }
        java.lang.String str = chatroomInfoUI.A;
        chatroomInfoUI.r7();
        com.tencent.mm.roomsdk.model.factory.a f17 = ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).wi(str).f(str, false);
        chatroomInfoUI.U = f17;
        f17.f192248d = new com.tencent.mm.chatroom.ui.g0(chatroomInfoUI);
        f17.b();
    }
}
