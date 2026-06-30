package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public final class n1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f64382d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f64383e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ChatroomManagerUI f64384f;

    public n1(long j17, long j18, com.tencent.mm.chatroom.ui.ChatroomManagerUI chatroomManagerUI) {
        this.f64382d = j17;
        this.f64383e = j18;
        this.f64384f = chatroomManagerUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.autogen.mmdata.rpt.DismissChatroomReportStruct dismissChatroomReportStruct = new com.tencent.mm.autogen.mmdata.rpt.DismissChatroomReportStruct();
        long j17 = this.f64382d;
        dismissChatroomReportStruct.f55858f = j17;
        long j18 = this.f64383e;
        dismissChatroomReportStruct.f55859g = j18;
        com.tencent.mm.chatroom.ui.ChatroomManagerUI chatroomManagerUI = this.f64384f;
        dismissChatroomReportStruct.f55857e = chatroomManagerUI.f63736o;
        dismissChatroomReportStruct.f55856d = dismissChatroomReportStruct.b("roomUsername", chatroomManagerUI.Z6(), true);
        dismissChatroomReportStruct.k();
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatroomManagerUI", "24180 action = " + j17 + ",code = " + j18 + ",mMembersCount = " + chatroomManagerUI.f63736o + ",mRoomId = " + chatroomManagerUI.Z6());
    }
}
