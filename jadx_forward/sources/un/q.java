package un;

/* loaded from: classes5.dex */
public final class q {
    public q(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(android.content.Context context, java.lang.String roomName, java.lang.String userName, java.lang.String str, java.lang.String str2, boolean z17, java.lang.String ticket) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roomName, "roomName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ticket, "ticket");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatroomApplicantsContactListUIC", "goToContactInfo roomName = " + roomName + ", userName = " + userName + ", nickName = " + str + ", remarkName = " + str2 + ", hideFooter = " + z17);
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 W0 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().W0(roomName);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", userName);
        if (str2 == null || str2.length() == 0) {
            intent.putExtra("Contact_RoomNickname", W0.z0(userName));
            str2 = W0.z0(userName);
        }
        if (str2 == null || str2.length() == 0) {
            com.p314xaae8f345.mm.p2621x8fb0427b.ya z07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.ab) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).mj()).z0(userName);
            str2 = z07 != null ? z07.f66694xdd77ad16 : null;
        }
        if (str2 != null) {
            intent.putExtra("Contact_RemarkName", str2);
        }
        intent.putExtra("key_add_contact_verify_ticket", ticket);
        intent.putExtra("Contact_Nick", str);
        intent.putExtra("Contact_RoomMember", true);
        intent.putExtra("room_name", roomName);
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 16);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(userName, true);
        if (n17 != null && ((int) n17.E2) > 0 && n17.r2()) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6005x8a110b2f c6005x8a110b2f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6005x8a110b2f();
            am.au auVar = c6005x8a110b2f.f136299g;
            auVar.f87720a = intent;
            auVar.f87721b = userName;
            c6005x8a110b2f.e();
        }
        if (n17 != null && n17.k2()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(10298, n17.d1() + ",14");
        }
        if (z17) {
            intent.putExtra("Contact_Scene", 96);
        } else {
            intent.putExtra("Contact_Scene", 14);
        }
        intent.putExtra("Is_RoomOwner", true);
        intent.putExtra("Contact_ChatRoomId", roomName);
        j45.l.j(context, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
    }
}
