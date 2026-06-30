package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes5.dex */
public final class n9 implements com.p314xaae8f345.mm.p648x55baa833.ui.r8 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10359x5d5d51f0 f145926d;

    public n9(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10359x5d5d51f0 activityC10359x5d5d51f0) {
        this.f145926d = activityC10359x5d5d51f0;
    }

    @Override // com.p314xaae8f345.mm.p648x55baa833.ui.r8
    public void B3(java.lang.String userName, java.lang.String remarkName, java.lang.String nickName, boolean z17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.ya z07;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(remarkName, "remarkName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickName, "nickName");
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10359x5d5d51f0 activityC10359x5d5d51f0 = this.f145926d;
        activityC10359x5d5d51f0.getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(remarkName) && (z07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.ab) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).mj()).z0(userName)) != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z07.f66694xdd77ad16)) {
            remarkName = z07.f66692x4854b29d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoomStillNotifyMessageManagerUI", "stranger.remarkName: " + remarkName);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(userName)) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", userName);
        intent.putExtra("Contact_RemarkName", remarkName);
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 V6 = activityC10359x5d5d51f0.V6();
        if (V6 != null) {
            intent.putExtra("Contact_RoomNickname", V6.z0(userName));
        }
        intent.putExtra("Contact_Nick", nickName);
        intent.putExtra("Contact_RoomMember", true);
        intent.putExtra("room_name", activityC10359x5d5d51f0.X6());
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
        intent.putExtra("Contact_ChatRoomId", activityC10359x5d5d51f0.X6());
        j45.l.j(activityC10359x5d5d51f0.mo55332x76847179(), com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
    }

    @Override // com.p314xaae8f345.mm.p648x55baa833.ui.r8
    public void M0(java.lang.String userName, java.lang.String nickName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickName, "nickName");
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10359x5d5d51f0 activityC10359x5d5d51f0 = this.f145926d;
        activityC10359x5d5d51f0.getClass();
        java.lang.String string = activityC10359x5d5d51f0.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lnu, nickName);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) activityC10359x5d5d51f0.mo55332x76847179(), 1, true);
        k0Var.q(string, 17);
        k0Var.f293405n = new com.p314xaae8f345.mm.p648x55baa833.ui.w9(activityC10359x5d5d51f0);
        k0Var.f293414s = new com.p314xaae8f345.mm.p648x55baa833.ui.x9(activityC10359x5d5d51f0, userName);
        k0Var.v();
    }
}
