package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class z0 implements r35.d2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ChatroomInfoUI f64701a;

    public z0(com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI) {
        this.f64701a = chatroomInfoUI;
    }

    @Override // r35.d2
    public void a(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        boolean z17 = com.tencent.mm.chatroom.ui.ChatroomInfoUI.Y;
        this.f64701a.d7();
    }

    @Override // r35.d2
    public void b(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
    }

    @Override // r35.d2
    public void c(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        boolean z17 = com.tencent.mm.chatroom.ui.ChatroomInfoUI.Y;
        this.f64701a.c7();
    }

    @Override // r35.d2
    public void d(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference = this.f64701a.f63701s;
        if (contactListExpandPreference != null) {
            contactListExpandPreference.N();
        }
    }

    @Override // r35.d2
    public void e(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        com.tencent.mm.storage.a3 a3Var;
        com.tencent.mm.chatroom.ui.ChatroomInfoUI chatroomInfoUI = this.f64701a;
        java.lang.String c17 = lz.a.c(chatroomInfoUI.f63701s, i17);
        java.lang.String b17 = lz.a.b(chatroomInfoUI.f63701s, i17);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (b17 == null) {
            b17 = "";
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(b17)) {
            gm0.j1.i();
            com.tencent.mm.storage.ya z07 = ((com.tencent.mm.storage.ab) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).mj()).z0(c17);
            if (z07 != null && !com.tencent.mm.sdk.platformtools.t8.K0(z07.field_encryptUsername)) {
                b17 = z07.field_conRemark;
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(c17)) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", c17);
        intent.putExtra("Contact_RemarkName", b17);
        if (chatroomInfoUI.f63694i && (a3Var = chatroomInfoUI.F) != null) {
            intent.putExtra("Contact_RoomNickname", a3Var.z0(c17));
        }
        java.lang.String a17 = lz.a.a(chatroomInfoUI.f63701s, i17);
        intent.putExtra("Contact_Nick", a17 != null ? a17 : "");
        intent.putExtra("Contact_RoomMember", true);
        intent.putExtra("room_name", chatroomInfoUI.f63695m.d1());
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(c17, true);
        if (n17 != null && ((int) n17.E2) > 0 && n17.r2()) {
            com.tencent.mm.autogen.events.SetLocalQQMobileEvent setLocalQQMobileEvent = new com.tencent.mm.autogen.events.SetLocalQQMobileEvent();
            am.au auVar = setLocalQQMobileEvent.f54766g;
            auVar.f6187a = intent;
            auVar.f6188b = c17;
            setLocalQQMobileEvent.e();
        }
        if (chatroomInfoUI.f63694i) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.idkeyStat(219L, 9L, 1L, true);
            if (n17 != null && n17.k2()) {
                g0Var.kvStat(10298, n17.d1() + ",14");
            }
            intent.putExtra("Contact_Scene", 14);
        }
        intent.putExtra("Is_RoomOwner", chatroomInfoUI.B);
        intent.putExtra("Contact_ChatRoomId", chatroomInfoUI.A);
        if (com.tencent.mm.storage.z3.q4(chatroomInfoUI.A)) {
            com.tencent.mm.autogen.mmdata.rpt.OpenIMChatRoomLogStruct openIMChatRoomLogStruct = new com.tencent.mm.autogen.mmdata.rpt.OpenIMChatRoomLogStruct();
            openIMChatRoomLogStruct.p(chatroomInfoUI.A);
            openIMChatRoomLogStruct.f59786e = 12L;
            openIMChatRoomLogStruct.k();
        }
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 8);
        j45.l.j(chatroomInfoUI, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
    }
}
