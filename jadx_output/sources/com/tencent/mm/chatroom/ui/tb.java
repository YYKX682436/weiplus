package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class tb implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.SeeRoomMemberUI f64556d;

    public tb(com.tencent.mm.chatroom.ui.SeeRoomMemberUI seeRoomMemberUI) {
        this.f64556d = seeRoomMemberUI;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mm.storage.a3 a3Var;
        com.tencent.mm.storage.ya z07;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/SeeRoomMemberUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.chatroom.ui.SeeRoomMemberUI seeRoomMemberUI = this.f64556d;
        if (i17 > seeRoomMemberUI.f63936e.getCount() - 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SeeRoomMemberUI", "[onItemClick]count=%s position=%s", java.lang.Integer.valueOf(seeRoomMemberUI.f63936e.getCount()), java.lang.Integer.valueOf(i17));
            yj0.a.h(this, "com/tencent/mm/chatroom/ui/SeeRoomMemberUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        int i18 = seeRoomMemberUI.f63936e.getItem(i17).f64691a;
        if (i18 == 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SeeRoomMemberUI", "[onItemClick] Add member");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(219L, 6L, 1L, true);
            seeRoomMemberUI.getClass();
            qy.i iVar = (qy.i) i95.n0.c(qy.i.class);
            java.lang.String str = seeRoomMemberUI.f63939h;
            ((py.a) iVar).getClass();
            java.lang.String c17 = com.tencent.mm.sdk.platformtools.t8.c1(c01.v1.m(str), ",");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("titile", seeRoomMemberUI.getString(com.tencent.mm.R.string.f489934fx));
            intent.putExtra("list_type", 1);
            com.tencent.mm.ui.contact.i5.e();
            intent.putExtra("list_attr", com.tencent.mm.ui.contact.i5.f206782c);
            intent.putExtra("always_select_contact", c17);
            intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 4);
            intent.putExtra("KBlockOpenImFav", com.tencent.mm.storage.z3.N4(seeRoomMemberUI.f63939h));
            intent.putExtra("is_select_record_msg_mode", com.tencent.mm.storage.z3.N4(seeRoomMemberUI.f63939h));
            intent.putExtra("menu_mode", 2);
            intent.putExtra("chatroomName", seeRoomMemberUI.f63939h);
            j45.l.v(seeRoomMemberUI, ".ui.contact.SelectContactUI", intent, 1);
            yj0.a.h(this, "com/tencent/mm/chatroom/ui/SeeRoomMemberUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        if (i18 == 3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SeeRoomMemberUI", "[onItemClick] Delete member");
            seeRoomMemberUI.getClass();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(219L, 8L, 1L, true);
            qy.i iVar2 = (qy.i) i95.n0.c(qy.i.class);
            java.lang.String str2 = seeRoomMemberUI.f63939h;
            ((py.a) iVar2).getClass();
            java.util.List m17 = c01.v1.m(str2);
            java.lang.String c18 = com.tencent.mm.sdk.platformtools.t8.c1(m17, ",");
            int size = ((java.util.LinkedList) m17).size();
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("RoomInfo_Id", seeRoomMemberUI.f63939h);
            intent2.putExtra("Is_Chatroom", true);
            intent2.putExtra("Chatroom_member_list", c18);
            intent2.putExtra("room_member_count", size);
            intent2.putExtra("Is_RoomOwner", seeRoomMemberUI.f63948t);
            com.tencent.mm.ui.contact.i5.e();
            intent2.putExtra("list_attr", com.tencent.mm.ui.contact.i5.f206782c);
            intent2.putExtra("room_name", seeRoomMemberUI.f63939h);
            intent2.putExtra("room_owner_name", seeRoomMemberUI.f63937f.field_roomowner);
            intent2.setClass(seeRoomMemberUI, com.tencent.mm.chatroom.ui.SelectDelMemberUI.class);
            seeRoomMemberUI.startActivityForResult(intent2, 2);
            yj0.a.h(this, "com/tencent/mm/chatroom/ui/SeeRoomMemberUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        if (i18 == 1) {
            com.tencent.mm.storage.z3 z3Var = seeRoomMemberUI.f63936e.getItem(i17).f64692b;
            if (z3Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SeeRoomMemberUI", "cont is null");
                yj0.a.h(this, "com/tencent/mm/chatroom/ui/SeeRoomMemberUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            seeRoomMemberUI.f63942n = z3Var.d1();
            java.lang.String P0 = z3Var.P0();
            java.lang.String U6 = com.tencent.mm.chatroom.ui.SeeRoomMemberUI.U6(seeRoomMemberUI.f63937f, seeRoomMemberUI.f63942n);
            if (com.tencent.mm.sdk.platformtools.t8.K0(U6)) {
                seeRoomMemberUI.f63941m = z3Var.g2();
            } else {
                seeRoomMemberUI.f63941m = U6;
            }
            com.tencent.mm.ui.contact.c9.a(seeRoomMemberUI.f63947s.getText().toString(), 1, 6, i17 + 1);
            java.lang.String str3 = seeRoomMemberUI.f63942n;
            java.lang.String str4 = seeRoomMemberUI.f63941m;
            seeRoomMemberUI.getClass();
            if (com.tencent.mm.sdk.platformtools.t8.K0(str4) && (z07 = ((com.tencent.mm.storage.ab) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).mj()).z0(str3)) != null && !com.tencent.mm.sdk.platformtools.t8.K0(z07.field_encryptUsername)) {
                str4 = z07.field_conRemark;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                android.content.Intent intent3 = new android.content.Intent();
                intent3.putExtra("Contact_User", str3);
                intent3.putExtra("Contact_RemarkName", str4);
                if (seeRoomMemberUI.f63943o && (a3Var = seeRoomMemberUI.f63937f) != null) {
                    intent3.putExtra("Contact_RoomNickname", a3Var.z0(str3));
                }
                intent3.putExtra("Contact_Nick", P0);
                intent3.putExtra("Contact_RoomMember", true);
                intent3.putExtra("room_name", seeRoomMemberUI.f63945q);
                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str3, true);
                if (n17 != null && ((int) n17.E2) > 0 && n17.r2()) {
                    com.tencent.mm.autogen.events.SetLocalQQMobileEvent setLocalQQMobileEvent = new com.tencent.mm.autogen.events.SetLocalQQMobileEvent();
                    am.au auVar = setLocalQQMobileEvent.f54766g;
                    auVar.f6187a = intent3;
                    auVar.f6188b = str3;
                    setLocalQQMobileEvent.e();
                }
                if (seeRoomMemberUI.f63943o) {
                    if (n17 != null && n17.k2()) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10298, n17.d1() + ",14");
                    }
                    intent3.putExtra("Contact_Scene", 14);
                } else if (seeRoomMemberUI.f63944p) {
                    intent3.putExtra("Contact_Scene", 44);
                    if (!c01.z1.J(n17.d1())) {
                        intent3.putExtra("Contact_IsLBSFriend", true);
                    }
                }
                intent3.putExtra("Is_RoomOwner", seeRoomMemberUI.f63948t);
                intent3.putExtra("Contact_ChatRoomId", seeRoomMemberUI.f63939h);
                intent3.putExtra("CONTACT_INFO_UI_SOURCE", 10);
                j45.l.j(seeRoomMemberUI, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent3, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/SeeRoomMemberUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
