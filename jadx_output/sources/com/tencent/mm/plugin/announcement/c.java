package com.tencent.mm.plugin.announcement;

/* loaded from: classes12.dex */
public class c implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f74688a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.announcement.ChatroomNoticeUI f74689b;

    public c(com.tencent.mm.plugin.announcement.ChatroomNoticeUI chatroomNoticeUI, int i17) {
        this.f74689b = chatroomNoticeUI;
        this.f74688a = i17;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        int i17 = com.tencent.mm.plugin.announcement.ChatroomNoticeUI.f74675p1;
        com.tencent.mm.plugin.announcement.ChatroomNoticeUI chatroomNoticeUI = this.f74689b;
        if (chatroomNoticeUI.f74678x0) {
            chatroomNoticeUI.enableOptionMenu(true);
        } else {
            chatroomNoticeUI.enableOptionMenu(false);
        }
        chatroomNoticeUI.r7(this.f74688a == 5 ? 9 : 7);
    }
}
