package com.tencent.mm.chatroom.ui;

/* loaded from: classes7.dex */
public class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f64560d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ChatroomInfoUI f64561e;

    public u0(com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI, long j17) {
        this.f64561e = chatroomInfoUI;
        this.f64560d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.autogen.mmdata.rpt.DismissedChatroomInfoReportStruct dismissedChatroomInfoReportStruct = new com.tencent.mm.autogen.mmdata.rpt.DismissedChatroomInfoReportStruct();
        long j17 = this.f64560d;
        dismissedChatroomInfoReportStruct.f55861e = j17;
        com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI = this.f64561e;
        dismissedChatroomInfoReportStruct.f55860d = dismissedChatroomInfoReportStruct.b("roomUsername", chatroomInfoUI.A, true);
        dismissedChatroomInfoReportStruct.k();
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatroomInfoUI", "24182 action = " + j17 + ",UserRole = 0,mRoomId = " + chatroomInfoUI.A);
    }
}
