package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class kb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f64281d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.lb f64282e;

    public kb(com.tencent.mm.chatroom.ui.lb lbVar, int i17) {
        this.f64282e = lbVar;
        this.f64281d = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.storage.ya z07;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/SeeRoomManagerUI$ManagerAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.chatroom.ui.lb lbVar = this.f64282e;
        java.util.ArrayList arrayList2 = (java.util.ArrayList) lbVar.f64309d;
        int i17 = this.f64281d;
        int i18 = ((com.tencent.mm.chatroom.ui.ib) arrayList2.get(i17)).f64234a;
        if (i18 == 1) {
            com.tencent.mm.storage.z3 z3Var = ((com.tencent.mm.chatroom.ui.ib) ((java.util.ArrayList) lbVar.f64309d).get(i17)).f64235b;
            com.tencent.mm.chatroom.ui.SeeRoomManagerUI seeRoomManagerUI = lbVar.f64311f;
            java.lang.String d17 = z3Var.d1();
            lbVar.getClass();
            java.lang.String w07 = !com.tencent.mm.sdk.platformtools.t8.K0(z3Var.w0()) ? z3Var.w0() : lbVar.f64311f.f63930e.z0(z3Var.d1());
            if (com.tencent.mm.sdk.platformtools.t8.K0(w07)) {
                w07 = z3Var.f2();
            }
            if (!z3Var.r2()) {
                com.tencent.mm.storage.ya z08 = ((com.tencent.mm.storage.ab) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).mj()).z0(z3Var.d1());
                if (z08 != null && !com.tencent.mm.sdk.platformtools.t8.K0(z08.field_conRemark)) {
                    w07 = z08.field_conRemark;
                }
            }
            java.lang.String P0 = z3Var.P0();
            int i19 = com.tencent.mm.chatroom.ui.SeeRoomManagerUI.f63928i;
            seeRoomManagerUI.getClass();
            if (com.tencent.mm.sdk.platformtools.t8.K0(w07) && (z07 = ((com.tencent.mm.storage.ab) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).mj()).z0(d17)) != null && !com.tencent.mm.sdk.platformtools.t8.K0(z07.field_encryptUsername)) {
                w07 = z07.field_conRemark;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Contact_User", d17);
                intent.putExtra("Contact_RemarkName", w07);
                com.tencent.mm.storage.a3 a3Var = seeRoomManagerUI.f63930e;
                if (a3Var != null) {
                    intent.putExtra("Contact_RoomNickname", a3Var.z0(d17));
                }
                intent.putExtra("Contact_Nick", P0);
                intent.putExtra("Contact_RoomMember", true);
                intent.putExtra("room_name", seeRoomManagerUI.f63931f);
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
                intent.putExtra("Contact_ChatRoomId", seeRoomManagerUI.f63931f);
                j45.l.j(seeRoomManagerUI, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
            }
        } else if (i18 == 2) {
            android.content.Intent intent2 = new android.content.Intent(lbVar.f64311f, (java.lang.Class<?>) com.tencent.mm.chatroom.ui.SelectAddRoomManagerUI.class);
            intent2.putExtra("RoomInfo_Id", lbVar.f64311f.f63931f);
            lbVar.f64311f.startActivityForResult(intent2, 0);
        } else if (i18 == 3) {
            android.content.Intent intent3 = new android.content.Intent(lbVar.f64311f, (java.lang.Class<?>) com.tencent.mm.chatroom.ui.SelectDelRoomManagerUI.class);
            intent3.putExtra("RoomInfo_Id", lbVar.f64311f.f63931f);
            com.tencent.mm.chatroom.ui.SeeRoomManagerUI seeRoomManagerUI2 = lbVar.f64311f;
            seeRoomManagerUI2.getClass();
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.Iterator it = ((java.util.ArrayList) seeRoomManagerUI2.f63932g.f64309d).iterator();
            while (it.hasNext()) {
                com.tencent.mm.chatroom.ui.ib ibVar = (com.tencent.mm.chatroom.ui.ib) it.next();
                if (ibVar.f64234a == 1) {
                    linkedList.add(ibVar.f64235b.d1());
                }
            }
            intent3.putExtra("RoomManagers", com.tencent.mm.sdk.platformtools.t8.c1(linkedList, ","));
            lbVar.f64311f.startActivityForResult(intent3, 1);
        }
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/SeeRoomManagerUI$ManagerAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
