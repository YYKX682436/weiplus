package com.tencent.mm.chatroom.ui;

/* loaded from: classes5.dex */
public final class n9 implements com.tencent.mm.chatroom.ui.r8 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.RoomStillNotifyMessageManagerUI f64393d;

    public n9(com.tencent.mm.chatroom.ui.RoomStillNotifyMessageManagerUI roomStillNotifyMessageManagerUI) {
        this.f64393d = roomStillNotifyMessageManagerUI;
    }

    @Override // com.tencent.mm.chatroom.ui.r8
    public void B3(java.lang.String userName, java.lang.String remarkName, java.lang.String nickName, boolean z17) {
        com.tencent.mm.storage.ya z07;
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(remarkName, "remarkName");
        kotlin.jvm.internal.o.g(nickName, "nickName");
        com.tencent.mm.chatroom.ui.RoomStillNotifyMessageManagerUI roomStillNotifyMessageManagerUI = this.f64393d;
        roomStillNotifyMessageManagerUI.getClass();
        if (com.tencent.mm.sdk.platformtools.t8.K0(remarkName) && (z07 = ((com.tencent.mm.storage.ab) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).mj()).z0(userName)) != null && !com.tencent.mm.sdk.platformtools.t8.K0(z07.field_encryptUsername)) {
            remarkName = z07.field_conRemark;
            com.tencent.mars.xlog.Log.i("MicroMsg.RoomStillNotifyMessageManagerUI", "stranger.remarkName: " + remarkName);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(userName)) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", userName);
        intent.putExtra("Contact_RemarkName", remarkName);
        com.tencent.mm.storage.a3 V6 = roomStillNotifyMessageManagerUI.V6();
        if (V6 != null) {
            intent.putExtra("Contact_RoomNickname", V6.z0(userName));
        }
        intent.putExtra("Contact_Nick", nickName);
        intent.putExtra("Contact_RoomMember", true);
        intent.putExtra("room_name", roomStillNotifyMessageManagerUI.X6());
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(userName, true);
        if (n17 != null && ((int) n17.E2) > 0 && n17.r2()) {
            com.tencent.mm.autogen.events.SetLocalQQMobileEvent setLocalQQMobileEvent = new com.tencent.mm.autogen.events.SetLocalQQMobileEvent();
            am.au auVar = setLocalQQMobileEvent.f54766g;
            auVar.f6187a = intent;
            auVar.f6188b = userName;
            setLocalQQMobileEvent.e();
        }
        if (n17 != null && n17.k2()) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10298, n17.d1() + ",14");
        }
        if (z17) {
            intent.putExtra("Contact_Scene", 96);
        } else {
            intent.putExtra("Contact_Scene", 14);
        }
        intent.putExtra("Is_RoomOwner", true);
        intent.putExtra("Contact_ChatRoomId", roomStillNotifyMessageManagerUI.X6());
        j45.l.j(roomStillNotifyMessageManagerUI.getContext(), com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
    }

    @Override // com.tencent.mm.chatroom.ui.r8
    public void M0(java.lang.String userName, java.lang.String nickName) {
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(nickName, "nickName");
        com.tencent.mm.chatroom.ui.RoomStillNotifyMessageManagerUI roomStillNotifyMessageManagerUI = this.f64393d;
        roomStillNotifyMessageManagerUI.getClass();
        java.lang.String string = roomStillNotifyMessageManagerUI.getContext().getString(com.tencent.mm.R.string.lnu, nickName);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) roomStillNotifyMessageManagerUI.getContext(), 1, true);
        k0Var.q(string, 17);
        k0Var.f211872n = new com.tencent.mm.chatroom.ui.w9(roomStillNotifyMessageManagerUI);
        k0Var.f211881s = new com.tencent.mm.chatroom.ui.x9(roomStillNotifyMessageManagerUI, userName);
        k0Var.v();
    }
}
