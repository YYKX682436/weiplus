package com.tencent.mm.chatroom.ui;

/* loaded from: classes4.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ChatRoomBindAppUI f64046d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f64047e;

    public b(com.tencent.mm.chatroom.ui.ChatRoomBindAppUI chatRoomBindAppUI, android.content.Intent intent) {
        this.f64046d = chatRoomBindAppUI;
        this.f64047e = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.chatroom.ui.ChatRoomBindAppUI chatRoomBindAppUI = this.f64046d;
        chatRoomBindAppUI.setResult(-1, this.f64047e);
        chatRoomBindAppUI.finish();
    }
}
