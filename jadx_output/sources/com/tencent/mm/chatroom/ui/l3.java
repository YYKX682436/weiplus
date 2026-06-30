package com.tencent.mm.chatroom.ui;

/* loaded from: classes5.dex */
public final class l3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.m3 f64298d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f64299e;

    public l3(com.tencent.mm.chatroom.ui.m3 m3Var, com.tencent.mm.storage.z3 z3Var) {
        this.f64298d = m3Var;
        this.f64299e = z3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.storage.ya z07;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/GroupAdminMemberViewHolder$fillContent$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.chatroom.ui.m3 m3Var = this.f64298d;
        com.tencent.mm.chatroom.ui.j3 j3Var = m3Var.f64356f;
        if (j3Var != null) {
            com.tencent.mm.storage.z3 z3Var = this.f64299e;
            java.lang.String d17 = z3Var.d1();
            kotlin.jvm.internal.o.f(d17, "getUsername(...)");
            java.lang.String i17 = com.tencent.mm.chatroom.ui.m3.i(m3Var, z3Var);
            java.lang.String P0 = z3Var.P0();
            kotlin.jvm.internal.o.f(P0, "getNickname(...)");
            com.tencent.mm.chatroom.ui.GroupAdminManagerUI groupAdminManagerUI = (com.tencent.mm.chatroom.ui.GroupAdminManagerUI) j3Var;
            if (com.tencent.mm.sdk.platformtools.t8.K0(i17) && (z07 = ((com.tencent.mm.storage.ab) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).mj()).z0(d17)) != null && !com.tencent.mm.sdk.platformtools.t8.K0(z07.field_encryptUsername)) {
                i17 = z07.field_conRemark;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Contact_User", d17);
                intent.putExtra("Contact_RemarkName", i17);
                com.tencent.mm.storage.a3 a3Var = groupAdminManagerUI.f63760d;
                if (a3Var != null) {
                    intent.putExtra("Contact_RoomNickname", a3Var.z0(d17));
                }
                intent.putExtra("Contact_Nick", P0);
                intent.putExtra("Contact_RoomMember", true);
                intent.putExtra("room_name", groupAdminManagerUI.f63761e);
                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(d17, true);
                if (n17 != null && ((int) n17.E2) > 0 && n17.r2()) {
                    com.tencent.mm.autogen.events.SetLocalQQMobileEvent setLocalQQMobileEvent = new com.tencent.mm.autogen.events.SetLocalQQMobileEvent();
                    am.au auVar = setLocalQQMobileEvent.f54766g;
                    auVar.f6187a = intent;
                    auVar.f6188b = d17;
                    setLocalQQMobileEvent.e();
                }
                if (n17 != null && n17.k2()) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10298, n17.d1() + ",14");
                }
                intent.putExtra("Contact_Scene", 96);
                intent.putExtra("Is_RoomOwner", true);
                intent.putExtra("Contact_ChatRoomId", groupAdminManagerUI.f63761e);
                j45.l.j(groupAdminManagerUI.getContext(), com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/GroupAdminMemberViewHolder$fillContent$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
