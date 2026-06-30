package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public final class z1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f64702d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.f4 f64703e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.h1 f64704f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f64705g;

    public z1(android.content.Context context, com.tencent.mm.ui.widget.dialog.f4 f4Var, com.tencent.mm.chatroom.ui.h1 h1Var, int i17) {
        this.f64702d = context;
        this.f64703e = f4Var;
        this.f64704f = h1Var;
        this.f64705g = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Context context = this.f64702d;
        if (context != null && (context instanceof android.app.Activity) && !((android.app.Activity) context).isDestroyed()) {
            this.f64703e.cancel();
        }
        com.tencent.mm.chatroom.ui.j1 j1Var = (com.tencent.mm.chatroom.ui.j1) this.f64704f;
        j1Var.getClass();
        com.tencent.mm.storage.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
        int i17 = com.tencent.mm.chatroom.ui.ChatroomManagerUI.f63727s;
        com.tencent.mm.chatroom.ui.ChatroomManagerUI chatroomManagerUI = j1Var.f64244a;
        com.tencent.mm.storage.a3 z07 = a17.z0(chatroomManagerUI.Z6());
        int i18 = (int) (z07.field_chatroomStatus | 2);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatroomManagerUI", "dealDelChatroomBtn, state = " + i18);
        z07.field_chatroomStatus = i18;
        c01.v1.M(z07);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("dismiss_chatroom", true);
        chatroomManagerUI.setResult(-1, intent);
        chatroomManagerUI.W6(4L, this.f64705g);
        chatroomManagerUI.finish();
    }
}
