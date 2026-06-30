package com.tencent.mm.plugin.announcement;

/* loaded from: classes12.dex */
public class n implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.announcement.ChatroomNoticeUI f74701d;

    public n(com.tencent.mm.plugin.announcement.ChatroomNoticeUI chatroomNoticeUI) {
        this.f74701d = chatroomNoticeUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f74701d.finish();
    }
}
