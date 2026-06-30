package com.tencent.mm.chatroom.ui;

/* loaded from: classes8.dex */
public class l8 extends com.tencent.xweb.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.RoomAnnouncementUI f64305a;

    public l8(com.tencent.mm.chatroom.ui.RoomAnnouncementUI roomAnnouncementUI) {
        this.f64305a = roomAnnouncementUI;
    }

    @Override // com.tencent.xweb.s0
    public boolean i(com.tencent.xweb.WebView webView, java.lang.String str, java.lang.String str2, com.tencent.xweb.z zVar) {
        db5.e1.t(this.f64305a, str2, null, new com.tencent.mm.chatroom.ui.k8(this));
        zVar.a();
        return true;
    }
}
