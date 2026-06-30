package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes11.dex */
public class kb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f145814d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.lb f145815e;

    public kb(com.p314xaae8f345.mm.p648x55baa833.ui.lb lbVar, int i17) {
        this.f145815e = lbVar;
        this.f145814d = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p2621x8fb0427b.ya z07;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/SeeRoomManagerUI$ManagerAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p648x55baa833.ui.lb lbVar = this.f145815e;
        java.util.ArrayList arrayList2 = (java.util.ArrayList) lbVar.f145842d;
        int i17 = this.f145814d;
        int i18 = ((com.p314xaae8f345.mm.p648x55baa833.ui.ib) arrayList2.get(i17)).f145767a;
        if (i18 == 1) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = ((com.p314xaae8f345.mm.p648x55baa833.ui.ib) ((java.util.ArrayList) lbVar.f145842d).get(i17)).f145768b;
            com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10364x5bffdef3 activityC10364x5bffdef3 = lbVar.f145844f;
            java.lang.String d17 = z3Var.d1();
            lbVar.getClass();
            java.lang.String w07 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z3Var.w0()) ? z3Var.w0() : lbVar.f145844f.f145463e.z0(z3Var.d1());
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(w07)) {
                w07 = z3Var.f2();
            }
            if (!z3Var.r2()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.ya z08 = ((com.p314xaae8f345.mm.p2621x8fb0427b.ab) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).mj()).z0(z3Var.d1());
                if (z08 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z08.f66692x4854b29d)) {
                    w07 = z08.f66692x4854b29d;
                }
            }
            java.lang.String P0 = z3Var.P0();
            int i19 = com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10364x5bffdef3.f145461i;
            activityC10364x5bffdef3.getClass();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(w07) && (z07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.ab) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).mj()).z0(d17)) != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z07.f66694xdd77ad16)) {
                w07 = z07.f66692x4854b29d;
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17)) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Contact_User", d17);
                intent.putExtra("Contact_RemarkName", w07);
                com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var = activityC10364x5bffdef3.f145463e;
                if (a3Var != null) {
                    intent.putExtra("Contact_RoomNickname", a3Var.z0(d17));
                }
                intent.putExtra("Contact_Nick", P0);
                intent.putExtra("Contact_RoomMember", true);
                intent.putExtra("room_name", activityC10364x5bffdef3.f145464f);
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(d17, true);
                if (n17 != null && ((int) n17.E2) > 0 && n17.r2()) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6005x8a110b2f c6005x8a110b2f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6005x8a110b2f();
                    am.au auVar = c6005x8a110b2f.f136299g;
                    auVar.f87720a = intent;
                    auVar.f87721b = d17;
                    c6005x8a110b2f.e();
                }
                if (n17 != null && n17.k2()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(10298, n17.d1() + ",14");
                }
                intent.putExtra("Contact_Scene", 96);
                intent.putExtra("Is_RoomOwner", true);
                intent.putExtra("Contact_ChatRoomId", activityC10364x5bffdef3.f145464f);
                j45.l.j(activityC10364x5bffdef3, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
            }
        } else if (i18 == 2) {
            android.content.Intent intent2 = new android.content.Intent(lbVar.f145844f, (java.lang.Class<?>) com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10367x479b7a81.class);
            intent2.putExtra("RoomInfo_Id", lbVar.f145844f.f145464f);
            lbVar.f145844f.startActivityForResult(intent2, 0);
        } else if (i18 == 3) {
            android.content.Intent intent3 = new android.content.Intent(lbVar.f145844f, (java.lang.Class<?>) com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10370x551acb57.class);
            intent3.putExtra("RoomInfo_Id", lbVar.f145844f.f145464f);
            com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10364x5bffdef3 activityC10364x5bffdef32 = lbVar.f145844f;
            activityC10364x5bffdef32.getClass();
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.Iterator it = ((java.util.ArrayList) activityC10364x5bffdef32.f145465g.f145842d).iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p648x55baa833.ui.ib ibVar = (com.p314xaae8f345.mm.p648x55baa833.ui.ib) it.next();
                if (ibVar.f145767a == 1) {
                    linkedList.add(ibVar.f145768b.d1());
                }
            }
            intent3.putExtra("RoomManagers", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(linkedList, ","));
            lbVar.f145844f.startActivityForResult(intent3, 1);
        }
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/SeeRoomManagerUI$ManagerAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
