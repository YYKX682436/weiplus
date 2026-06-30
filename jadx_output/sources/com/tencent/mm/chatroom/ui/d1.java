package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class d1 implements c01.da {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f64098d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f64099e;

    public d1(com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI, com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI2, java.lang.String str) {
        this.f64098d = new java.lang.ref.WeakReference(chatroomInfoUI2);
        this.f64099e = str;
    }

    @Override // c01.da
    public boolean a() {
        com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI = (com.tencent.mm.chatroom.ui.ChatroomInfoUI) this.f64098d.get();
        if (chatroomInfoUI != null) {
            return chatroomInfoUI.N;
        }
        return true;
    }

    @Override // c01.da
    public void c() {
        com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI = (com.tencent.mm.chatroom.ui.ChatroomInfoUI) this.f64098d.get();
        if (chatroomInfoUI != null) {
            android.app.ProgressDialog progressDialog = chatroomInfoUI.f63690e;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            java.lang.String str = this.f64099e;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                return;
            }
            db5.t7.h(chatroomInfoUI, str);
        }
    }
}
