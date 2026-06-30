package com.tencent.mm.plugin.announcement;

/* loaded from: classes12.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.announcement.ChatroomNoticeUI f74696d;

    public i(com.tencent.mm.plugin.announcement.ChatroomNoticeUI chatroomNoticeUI) {
        this.f74696d = chatroomNoticeUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.announcement.ChatroomNoticeUI chatroomNoticeUI = this.f74696d;
        com.tencent.mm.plugin.announcement.ChatroomNoticeUI.m7(chatroomNoticeUI);
        chatroomNoticeUI.enableOptionMenu(0, true);
        chatroomNoticeUI.f74678x0 = true;
    }
}
