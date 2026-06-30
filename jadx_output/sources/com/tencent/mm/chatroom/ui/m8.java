package com.tencent.mm.chatroom.ui;

/* loaded from: classes8.dex */
public class m8 extends com.tencent.xweb.h1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.RoomAnnouncementUI f64371a;

    public m8(com.tencent.mm.chatroom.ui.RoomAnnouncementUI roomAnnouncementUI) {
        this.f64371a = roomAnnouncementUI;
    }

    @Override // com.tencent.xweb.h1
    public boolean B(com.tencent.xweb.WebView webView, java.lang.String str) {
        if (!str.equals("weixin://chatroom/upgradeagree")) {
            return false;
        }
        com.tencent.mm.chatroom.ui.RoomAnnouncementUI roomAnnouncementUI = this.f64371a;
        com.tencent.mm.chatroom.ui.ea.a(roomAnnouncementUI, roomAnnouncementUI.f63842f, roomAnnouncementUI.f63841e);
        return true;
    }
}
