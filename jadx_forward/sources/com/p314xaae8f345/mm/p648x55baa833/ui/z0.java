package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes11.dex */
public class z0 implements r35.d2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5 f146234a;

    public z0(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5 activityC10332x8a1129f5) {
        this.f146234a = activityC10332x8a1129f5;
    }

    @Override // r35.d2
    public void a(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        boolean z17 = com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5.Y;
        this.f146234a.d7();
    }

    @Override // r35.d2
    public void b(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
    }

    @Override // r35.d2
    public void c(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        boolean z17 = com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5.Y;
        this.f146234a.c7();
    }

    @Override // r35.d2
    public void d(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 c19662x4f7a67f3 = this.f146234a.f145234s;
        if (c19662x4f7a67f3 != null) {
            c19662x4f7a67f3.N();
        }
    }

    @Override // r35.d2
    public void e(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var;
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5 activityC10332x8a1129f5 = this.f146234a;
        java.lang.String c17 = lz.a.c(activityC10332x8a1129f5.f145234s, i17);
        java.lang.String b17 = lz.a.b(activityC10332x8a1129f5.f145234s, i17);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (b17 == null) {
            b17 = "";
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17)) {
            gm0.j1.i();
            com.p314xaae8f345.mm.p2621x8fb0427b.ya z07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.ab) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).mj()).z0(c17);
            if (z07 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z07.f66694xdd77ad16)) {
                b17 = z07.f66692x4854b29d;
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17)) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", c17);
        intent.putExtra("Contact_RemarkName", b17);
        if (activityC10332x8a1129f5.f145227i && (a3Var = activityC10332x8a1129f5.F) != null) {
            intent.putExtra("Contact_RoomNickname", a3Var.z0(c17));
        }
        java.lang.String a17 = lz.a.a(activityC10332x8a1129f5.f145234s, i17);
        intent.putExtra("Contact_Nick", a17 != null ? a17 : "");
        intent.putExtra("Contact_RoomMember", true);
        intent.putExtra("room_name", activityC10332x8a1129f5.f145228m.d1());
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(c17, true);
        if (n17 != null && ((int) n17.E2) > 0 && n17.r2()) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6005x8a110b2f c6005x8a110b2f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6005x8a110b2f();
            am.au auVar = c6005x8a110b2f.f136299g;
            auVar.f87720a = intent;
            auVar.f87721b = c17;
            c6005x8a110b2f.e();
        }
        if (activityC10332x8a1129f5.f145227i) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.mo68477x336bdfd8(219L, 9L, 1L, true);
            if (n17 != null && n17.k2()) {
                g0Var.mo68478xbd3cda5f(10298, n17.d1() + ",14");
            }
            intent.putExtra("Contact_Scene", 14);
        }
        intent.putExtra("Is_RoomOwner", activityC10332x8a1129f5.B);
        intent.putExtra("Contact_ChatRoomId", activityC10332x8a1129f5.A);
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.q4(activityC10332x8a1129f5.A)) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6800x63c0d5b8 c6800x63c0d5b8 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6800x63c0d5b8();
            c6800x63c0d5b8.p(activityC10332x8a1129f5.A);
            c6800x63c0d5b8.f141319e = 12L;
            c6800x63c0d5b8.k();
        }
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 8);
        j45.l.j(activityC10332x8a1129f5, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
    }
}
