package com.tencent.mm.plugin.announcement;

/* loaded from: classes12.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.core.widget.NestedScrollView f74693d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.announcement.ChatroomNoticeUI f74694e;

    public g(com.tencent.mm.plugin.announcement.ChatroomNoticeUI chatroomNoticeUI, androidx.core.widget.NestedScrollView nestedScrollView) {
        this.f74694e = chatroomNoticeUI;
        this.f74693d = nestedScrollView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.announcement.ChatroomNoticeUI chatroomNoticeUI = this.f74694e;
        chatroomNoticeUI.N.setVisibility(8);
        this.f74693d.setScrollY(0);
        chatroomNoticeUI.Y = true;
        chatroomNoticeUI.i7(true);
    }
}
