package com.tencent.mm.chatroom.ui;

/* loaded from: classes4.dex */
public final class c implements vg3.h3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ChatRoomBindAppUI f64061a;

    public c(com.tencent.mm.chatroom.ui.ChatRoomBindAppUI chatRoomBindAppUI) {
        this.f64061a = chatRoomBindAppUI;
    }

    @Override // vg3.h3
    public final void a(boolean z17, java.lang.String str, java.lang.String str2) {
        if (z17) {
            db5.t7.h(this.f64061a.getContext(), this.f64061a.getContext().getString(com.tencent.mm.R.string.f490825ay3));
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_chat_room_open_id", str2);
            ku5.u0 u0Var = ku5.t0.f312615d;
            com.tencent.mm.chatroom.ui.b bVar = new com.tencent.mm.chatroom.ui.b(this.f64061a, intent);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(bVar, 500L, false);
        }
    }
}
