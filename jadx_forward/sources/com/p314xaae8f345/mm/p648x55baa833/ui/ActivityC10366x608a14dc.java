package com.p314xaae8f345.mm.p648x55baa833.ui;

/* renamed from: com.tencent.mm.chatroom.ui.SeeRoomOwnerManagerUI */
/* loaded from: classes8.dex */
public class ActivityC10366x608a14dc extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.a3 f145487d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f145488e;

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576455bo;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f574422i52);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p648x55baa833.ui.ec(this));
        this.f145488e = getIntent().getStringExtra("RoomInfo_Id");
        com.p314xaae8f345.mm.p2621x8fb0427b.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
        java.lang.String str = this.f145488e;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = a17.z0(str);
        this.f145487d = z07;
        if (z07 != null) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21568x1a71b23b c21568x1a71b23b = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21568x1a71b23b(mo55332x76847179(), null);
            c21568x1a71b23b.J(com.p314xaae8f345.mm.R.C30867xcad56011.f574440i72);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).d(c21568x1a71b23b, -1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SeeRoomOwnerManagerUI", "[onCreate] owner:%s", this.f145487d.f69107x5be1edb3);
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f145487d.f69107x5be1edb3, true);
            com.p314xaae8f345.mm.p648x55baa833.ui.fc fcVar = new com.p314xaae8f345.mm.p648x55baa833.ui.fc(this, mo55332x76847179(), n17);
            fcVar.C(n17.d1());
            fcVar.i().putString(dm.i4.f66875xa013b0d5, n17.d1());
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
            java.lang.String g27 = n17.g2();
            ((ke0.e) xVar).getClass();
            fcVar.L(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(mo55332x76847179, g27));
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).d(fcVar, -1);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21568x1a71b23b c21568x1a71b23b2 = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21568x1a71b23b(mo55332x76847179(), null);
            c21568x1a71b23b2.J(com.p314xaae8f345.mm.R.C30867xcad56011.i58);
            boolean z18 = false;
            for (java.lang.String str2 : this.f145487d.A0()) {
                if (this.f145487d.G0(str2)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SeeRoomOwnerManagerUI", "[resetData] Room Manager:%s", str2);
                    if (!z18) {
                        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).d(c21568x1a71b23b2, -1);
                        z18 = true;
                    }
                    com.p314xaae8f345.mm.p2621x8fb0427b.z3 n18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str2, true);
                    com.p314xaae8f345.mm.p648x55baa833.ui.gc gcVar = new com.p314xaae8f345.mm.p648x55baa833.ui.gc(this, mo55332x76847179(), n18);
                    gcVar.C(str2);
                    gcVar.i().putString(dm.i4.f66875xa013b0d5, n18.d1());
                    le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = mo55332x76847179();
                    java.lang.String g28 = n18.g2();
                    ((ke0.e) xVar2).getClass();
                    gcVar.L(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(mo55332x768471792, g28));
                    ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).d(gcVar, -1);
                }
            }
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).notifyDataSetChanged();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        com.p314xaae8f345.mm.p2621x8fb0427b.ya z07;
        if (!(c21560x1fce98fb instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21557x1753ef1b)) {
            return false;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(c21560x1fce98fb.i().getString(dm.i4.f66875xa013b0d5), true);
        java.lang.String d17 = n17.d1();
        java.lang.String g27 = n17.g2();
        java.lang.String P0 = n17.P0();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g27) && (z07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.ab) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).mj()).z0(d17)) != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z07.f66694xdd77ad16)) {
            g27 = z07.f66692x4854b29d;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17)) {
            return false;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", d17);
        intent.putExtra("Contact_RemarkName", g27);
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var = this.f145487d;
        if (a3Var != null) {
            intent.putExtra("Contact_RoomNickname", a3Var.z0(d17));
        }
        intent.putExtra("Contact_Nick", P0);
        intent.putExtra("Contact_RoomMember", true);
        intent.putExtra("room_name", this.f145488e);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(d17, true);
        if (n18 != null && ((int) n18.E2) > 0 && n18.r2()) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6005x8a110b2f c6005x8a110b2f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6005x8a110b2f();
            am.au auVar = c6005x8a110b2f.f136299g;
            auVar.f87720a = intent;
            auVar.f87721b = d17;
            c6005x8a110b2f.e();
        }
        if (n18 != null && n18.k2()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(10298, n18.d1() + ",14");
        }
        intent.putExtra("Contact_Scene", 96);
        intent.putExtra("Is_RoomOwner", true);
        intent.putExtra("Contact_ChatRoomId", this.f145488e);
        j45.l.j(this, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
        return false;
    }
}
