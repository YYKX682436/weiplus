package com.tencent.mm.plugin.announcement;

/* loaded from: classes12.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.announcement.p f74702d;

    public o(com.tencent.mm.plugin.announcement.p pVar) {
        this.f74702d = pVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.announcement.p pVar = this.f74702d;
        pVar.f74703a.setResult(0);
        pVar.f74703a.finish();
        com.tencent.mm.plugin.announcement.ChatroomNoticeUI chatroomNoticeUI = pVar.f74703a;
        int i17 = com.tencent.mm.plugin.announcement.ChatroomNoticeUI.f74675p1;
        chatroomNoticeUI.r7(11);
    }
}
