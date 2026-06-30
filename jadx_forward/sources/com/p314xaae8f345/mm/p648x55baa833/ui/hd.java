package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes12.dex */
public class hd implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.kd f145747d;

    public hd(com.p314xaae8f345.mm.p648x55baa833.ui.kd kdVar) {
        this.f145747d = kdVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p2621x8fb0427b.ya z07;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/SelectMemberUI$SelectMemberAdapter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int intValue = ((java.lang.Integer) view.getTag()).intValue();
        com.p314xaae8f345.mm.p648x55baa833.ui.kd kdVar = this.f145747d;
        com.p314xaae8f345.mm.p648x55baa833.ui.bd item = kdVar.getItem(intValue);
        if (item == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SelectMemberAdapter", "item is null");
            yj0.a.h(this, "com/tencent/mm/chatroom/ui/SelectMemberUI$SelectMemberAdapter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = item.f145592a;
        if (z3Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SelectMemberAdapter", "contact is null");
            yj0.a.h(this, "com/tencent/mm/chatroom/ui/SelectMemberUI$SelectMemberAdapter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10372xd653ffea activityC10372xd653ffea = kdVar.f145825o;
        java.lang.String d17 = z3Var.d1();
        java.lang.String P0 = z3Var.P0();
        activityC10372xd653ffea.getClass();
        java.lang.String str = (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(null) || (z07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.ab) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).mj()).z0(d17)) == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z07.f66694xdd77ad16)) ? null : z07.f66692x4854b29d;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Contact_User", d17);
            intent.putExtra("Contact_RemarkName", str);
            com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var = activityC10372xd653ffea.f145511n;
            if (a3Var != null) {
                intent.putExtra("Contact_RoomNickname", a3Var.z0(d17));
            }
            intent.putExtra("Contact_Nick", P0);
            intent.putExtra("Contact_RoomMember", true);
            intent.putExtra("room_name", activityC10372xd653ffea.f145512o);
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
            intent.putExtra("Contact_Scene", 14);
            intent.putExtra("Is_RoomOwner", true);
            intent.putExtra("Contact_ChatRoomId", activityC10372xd653ffea.f145512o);
            j45.l.j(activityC10372xd653ffea, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
        }
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/SelectMemberUI$SelectMemberAdapter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
