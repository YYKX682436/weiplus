package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes11.dex */
public class tb implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10365x4886147c f146089d;

    public tb(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10365x4886147c activityC10365x4886147c) {
        this.f146089d = activityC10365x4886147c;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var;
        com.p314xaae8f345.mm.p2621x8fb0427b.ya z07;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/SeeRoomMemberUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10365x4886147c activityC10365x4886147c = this.f146089d;
        if (i17 > activityC10365x4886147c.f145469e.getCount() - 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SeeRoomMemberUI", "[onItemClick]count=%s position=%s", java.lang.Integer.valueOf(activityC10365x4886147c.f145469e.getCount()), java.lang.Integer.valueOf(i17));
            yj0.a.h(this, "com/tencent/mm/chatroom/ui/SeeRoomMemberUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        int i18 = activityC10365x4886147c.f145469e.getItem(i17).f146224a;
        if (i18 == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SeeRoomMemberUI", "[onItemClick] Add member");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(219L, 6L, 1L, true);
            activityC10365x4886147c.getClass();
            qy.i iVar = (qy.i) i95.n0.c(qy.i.class);
            java.lang.String str = activityC10365x4886147c.f145472h;
            ((py.a) iVar).getClass();
            java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(c01.v1.m(str), ",");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("titile", activityC10365x4886147c.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571467fx));
            intent.putExtra("list_type", 1);
            com.p314xaae8f345.mm.ui.p2690x38b72420.i5.e();
            intent.putExtra("list_attr", com.p314xaae8f345.mm.ui.p2690x38b72420.i5.f288315c);
            intent.putExtra("always_select_contact", c17);
            intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 4);
            intent.putExtra("KBlockOpenImFav", com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(activityC10365x4886147c.f145472h));
            intent.putExtra("is_select_record_msg_mode", com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(activityC10365x4886147c.f145472h));
            intent.putExtra("menu_mode", 2);
            intent.putExtra("chatroomName", activityC10365x4886147c.f145472h);
            j45.l.v(activityC10365x4886147c, ".ui.contact.SelectContactUI", intent, 1);
            yj0.a.h(this, "com/tencent/mm/chatroom/ui/SeeRoomMemberUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        if (i18 == 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SeeRoomMemberUI", "[onItemClick] Delete member");
            activityC10365x4886147c.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(219L, 8L, 1L, true);
            qy.i iVar2 = (qy.i) i95.n0.c(qy.i.class);
            java.lang.String str2 = activityC10365x4886147c.f145472h;
            ((py.a) iVar2).getClass();
            java.util.List m17 = c01.v1.m(str2);
            java.lang.String c18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(m17, ",");
            int size = ((java.util.LinkedList) m17).size();
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("RoomInfo_Id", activityC10365x4886147c.f145472h);
            intent2.putExtra("Is_Chatroom", true);
            intent2.putExtra("Chatroom_member_list", c18);
            intent2.putExtra("room_member_count", size);
            intent2.putExtra("Is_RoomOwner", activityC10365x4886147c.f145481t);
            com.p314xaae8f345.mm.ui.p2690x38b72420.i5.e();
            intent2.putExtra("list_attr", com.p314xaae8f345.mm.ui.p2690x38b72420.i5.f288315c);
            intent2.putExtra("room_name", activityC10365x4886147c.f145472h);
            intent2.putExtra("room_owner_name", activityC10365x4886147c.f145470f.f69107x5be1edb3);
            intent2.setClass(activityC10365x4886147c, com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10369x3b98011d.class);
            activityC10365x4886147c.startActivityForResult(intent2, 2);
            yj0.a.h(this, "com/tencent/mm/chatroom/ui/SeeRoomMemberUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        if (i18 == 1) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = activityC10365x4886147c.f145469e.getItem(i17).f146225b;
            if (z3Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SeeRoomMemberUI", "cont is null");
                yj0.a.h(this, "com/tencent/mm/chatroom/ui/SeeRoomMemberUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            activityC10365x4886147c.f145475n = z3Var.d1();
            java.lang.String P0 = z3Var.P0();
            java.lang.String U6 = com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10365x4886147c.U6(activityC10365x4886147c.f145470f, activityC10365x4886147c.f145475n);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(U6)) {
                activityC10365x4886147c.f145474m = z3Var.g2();
            } else {
                activityC10365x4886147c.f145474m = U6;
            }
            com.p314xaae8f345.mm.ui.p2690x38b72420.c9.a(activityC10365x4886147c.f145480s.getText().toString(), 1, 6, i17 + 1);
            java.lang.String str3 = activityC10365x4886147c.f145475n;
            java.lang.String str4 = activityC10365x4886147c.f145474m;
            activityC10365x4886147c.getClass();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4) && (z07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.ab) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).mj()).z0(str3)) != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z07.f66694xdd77ad16)) {
                str4 = z07.f66692x4854b29d;
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                android.content.Intent intent3 = new android.content.Intent();
                intent3.putExtra("Contact_User", str3);
                intent3.putExtra("Contact_RemarkName", str4);
                if (activityC10365x4886147c.f145476o && (a3Var = activityC10365x4886147c.f145470f) != null) {
                    intent3.putExtra("Contact_RoomNickname", a3Var.z0(str3));
                }
                intent3.putExtra("Contact_Nick", P0);
                intent3.putExtra("Contact_RoomMember", true);
                intent3.putExtra("room_name", activityC10365x4886147c.f145478q);
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str3, true);
                if (n17 != null && ((int) n17.E2) > 0 && n17.r2()) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6005x8a110b2f c6005x8a110b2f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6005x8a110b2f();
                    am.au auVar = c6005x8a110b2f.f136299g;
                    auVar.f87720a = intent3;
                    auVar.f87721b = str3;
                    c6005x8a110b2f.e();
                }
                if (activityC10365x4886147c.f145476o) {
                    if (n17 != null && n17.k2()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(10298, n17.d1() + ",14");
                    }
                    intent3.putExtra("Contact_Scene", 14);
                } else if (activityC10365x4886147c.f145477p) {
                    intent3.putExtra("Contact_Scene", 44);
                    if (!c01.z1.J(n17.d1())) {
                        intent3.putExtra("Contact_IsLBSFriend", true);
                    }
                }
                intent3.putExtra("Is_RoomOwner", activityC10365x4886147c.f145481t);
                intent3.putExtra("Contact_ChatRoomId", activityC10365x4886147c.f145472h);
                intent3.putExtra("CONTACT_INFO_UI_SOURCE", 10);
                j45.l.j(activityC10365x4886147c, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent3, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/SeeRoomMemberUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
