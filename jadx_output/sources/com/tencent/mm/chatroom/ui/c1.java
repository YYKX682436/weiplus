package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class c1 implements c01.da {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f64063d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f64064e;

    public c1(com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI, com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI2, java.lang.String str) {
        this.f64063d = new java.lang.ref.WeakReference(chatroomInfoUI2);
        this.f64064e = str;
    }

    @Override // c01.da
    public boolean a() {
        if (((com.tencent.mm.chatroom.ui.ChatroomInfoUI) this.f64063d.get()) != null) {
            return com.tencent.mm.chatroom.ui.ChatroomInfoUI.Y;
        }
        return true;
    }

    @Override // c01.da
    public void c() {
        android.app.ProgressDialog progressDialog;
        com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI = (com.tencent.mm.chatroom.ui.ChatroomInfoUI) this.f64063d.get();
        if (chatroomInfoUI != null && (progressDialog = chatroomInfoUI.f63689d) != null) {
            progressDialog.dismiss();
        }
        ((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).Ai(this.f64064e);
    }
}
