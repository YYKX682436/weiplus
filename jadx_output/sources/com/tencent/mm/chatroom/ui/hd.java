package com.tencent.mm.chatroom.ui;

/* loaded from: classes12.dex */
public class hd implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.kd f64214d;

    public hd(com.tencent.mm.chatroom.ui.kd kdVar) {
        this.f64214d = kdVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.storage.ya z07;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/SelectMemberUI$SelectMemberAdapter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int intValue = ((java.lang.Integer) view.getTag()).intValue();
        com.tencent.mm.chatroom.ui.kd kdVar = this.f64214d;
        com.tencent.mm.chatroom.ui.bd item = kdVar.getItem(intValue);
        if (item == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SelectMemberAdapter", "item is null");
            yj0.a.h(this, "com/tencent/mm/chatroom/ui/SelectMemberUI$SelectMemberAdapter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.storage.z3 z3Var = item.f64059a;
        if (z3Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SelectMemberAdapter", "contact is null");
            yj0.a.h(this, "com/tencent/mm/chatroom/ui/SelectMemberUI$SelectMemberAdapter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.chatroom.ui.SelectMemberUI selectMemberUI = kdVar.f64292o;
        java.lang.String d17 = z3Var.d1();
        java.lang.String P0 = z3Var.P0();
        selectMemberUI.getClass();
        java.lang.String str = (!com.tencent.mm.sdk.platformtools.t8.K0(null) || (z07 = ((com.tencent.mm.storage.ab) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).mj()).z0(d17)) == null || com.tencent.mm.sdk.platformtools.t8.K0(z07.field_encryptUsername)) ? null : z07.field_conRemark;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Contact_User", d17);
            intent.putExtra("Contact_RemarkName", str);
            com.tencent.mm.storage.a3 a3Var = selectMemberUI.f63978n;
            if (a3Var != null) {
                intent.putExtra("Contact_RoomNickname", a3Var.z0(d17));
            }
            intent.putExtra("Contact_Nick", P0);
            intent.putExtra("Contact_RoomMember", true);
            intent.putExtra("room_name", selectMemberUI.f63979o);
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
            intent.putExtra("Contact_Scene", 14);
            intent.putExtra("Is_RoomOwner", true);
            intent.putExtra("Contact_ChatRoomId", selectMemberUI.f63979o);
            j45.l.j(selectMemberUI, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
        }
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/SelectMemberUI$SelectMemberAdapter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
