package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ChatroomInfoUI f64612d;

    public w0(com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI) {
        this.f64612d = chatroomInfoUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.storage.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
        com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI = this.f64612d;
        com.tencent.mm.storage.a3 z07 = a17.z0(chatroomInfoUI.A);
        chatroomInfoUI.F = z07;
        if (z07 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChatroomInfoUI", "member is null");
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(z07.field_roomowner)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChatroomInfoUI", "roomowner is null");
            return;
        }
        chatroomInfoUI.f63697o.sendEmptyMessage(0);
        chatroomInfoUI.B = chatroomInfoUI.F.field_roomowner.equals(c01.z1.r());
        if (chatroomInfoUI.f63691f) {
            return;
        }
        com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference = chatroomInfoUI.f63701s;
        java.lang.String str = chatroomInfoUI.F.field_roomowner;
        lz.f fVar = contactListExpandPreference.M;
        if (fVar != null) {
            ((r35.u1) fVar).f369274f.D = str;
        }
    }

    public java.lang.String toString() {
        return super.toString() + "|onNotifyChange";
    }
}
