package com.tencent.mm.plugin.announcement;

/* loaded from: classes12.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.announcement.ChatroomNoticeUI f74698d;

    public k(com.tencent.mm.plugin.announcement.ChatroomNoticeUI chatroomNoticeUI) {
        this.f74698d = chatroomNoticeUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j17;
        int i17 = com.tencent.mm.plugin.announcement.ChatroomNoticeUI.f74675p1;
        com.tencent.mm.plugin.announcement.ChatroomNoticeUI chatroomNoticeUI = this.f74698d;
        chatroomNoticeUI.r7(4);
        int intExtra = chatroomNoticeUI.getIntent().getIntExtra("from_scene", 0);
        chatroomNoticeUI.getClass();
        com.tencent.mm.autogen.mmdata.rpt.ViewRoomDescStruct viewRoomDescStruct = new com.tencent.mm.autogen.mmdata.rpt.ViewRoomDescStruct();
        viewRoomDescStruct.f61627d = viewRoomDescStruct.b("ChatName", chatroomNoticeUI.K, true);
        viewRoomDescStruct.f61630g = c01.e2.I(chatroomNoticeUI.K) ? 0L : 1L;
        viewRoomDescStruct.f61629f = chatroomNoticeUI.M;
        viewRoomDescStruct.f61632i = viewRoomDescStruct.b("NoticeId", "" + chatroomNoticeUI.W, true);
        if (chatroomNoticeUI.R) {
            j17 = 1;
        } else {
            j17 = chatroomNoticeUI.S ? 2 : 3;
        }
        viewRoomDescStruct.f61628e = j17;
        viewRoomDescStruct.f61633j = chatroomNoticeUI.p7() ? 0L : 1L;
        viewRoomDescStruct.f61631h = intExtra;
        viewRoomDescStruct.k();
        chatroomNoticeUI.runOnUiThread(new com.tencent.mm.plugin.announcement.j(this));
    }
}
