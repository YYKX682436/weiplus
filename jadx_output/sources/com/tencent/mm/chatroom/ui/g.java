package com.tencent.mm.chatroom.ui;

/* loaded from: classes.dex */
public class g extends tg3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ChatroomInfoUI f64170e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI, int i17, r35.m3 m3Var) {
        super(i17, m3Var);
        this.f64170e = chatroomInfoUI;
    }

    @Override // tg3.a
    public void a(android.view.View view) {
        android.content.Intent intent = new android.content.Intent();
        intent.setFlags(268435456);
        intent.setClassName(com.tencent.mm.sdk.platformtools.x2.f193071a, "com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
        intent.putExtra("rawUrl", "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyt) + "/cgi-bin/newreadtemplate?t=work_wechat/about_group");
        j45.l.j(this.f64170e, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, null);
    }
}
