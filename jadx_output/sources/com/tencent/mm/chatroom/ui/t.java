package com.tencent.mm.chatroom.ui;

/* loaded from: classes5.dex */
public class t implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ChatroomInfoUI f64516a;

    public t(com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI) {
        this.f64516a = chatroomInfoUI;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatroomInfoUI", "OpenLiteApp fail");
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI = this.f64516a;
        intent.putExtra("k_username", chatroomInfoUI.A);
        intent.putExtra("showShare", false);
        intent.putExtra("rawUrl", java.lang.String.format(com.tencent.mm.ui.n2.f209398a, 36));
        j45.l.j(chatroomInfoUI, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatroomInfoUI", "OpenLiteApp success");
    }
}
