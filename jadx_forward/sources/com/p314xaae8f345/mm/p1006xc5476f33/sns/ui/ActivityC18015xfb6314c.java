package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI */
/* loaded from: classes11.dex */
public class ActivityC18015xfb6314c extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18115x808957e7 {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18115x808957e7
    public void V6(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("__onCreate", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
        gm0.j1.i();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().a(this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("__onCreate", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18115x808957e7
    public void W6() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("__onDestroy", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
        gm0.j1.i();
        if (gm0.j1.b().m()) {
            gm0.j1.i();
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().e(this);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("__onDestroy", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18115x808957e7
    public void X6() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dealBack", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
        if ((this.f248981i + " " + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f248979g, ",")).equals(this.f248982m) && this.f248980h != 0) {
            finish();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dealBack", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
            return;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Lj().b1(this.f248980h, this.f248981i)) {
            db5.e1.s(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.jfg, this.f248981i), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dealBack", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
            return;
        }
        java.util.List<java.lang.String> b76 = b7();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        for (java.lang.String str : b76) {
            if (!this.f248979g.contains(str)) {
                linkedList.add(str);
            }
        }
        for (java.lang.String str2 : this.f248979g) {
            if (!b76.contains(str2)) {
                linkedList2.add(str2);
            }
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            c01.e2.l0((java.lang.String) it.next(), false);
        }
        java.util.Iterator it6 = linkedList2.iterator();
        while (it6.hasNext()) {
            c01.e2.l0((java.lang.String) it6.next(), true);
        }
        finish();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dealBack", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18115x808957e7
    public void Y6(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dealDelChatRoomMember", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
        super.Y6(str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dealDelChatRoomMember", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18115x808957e7
    public void Z6(java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dealOnAddContact", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
        com.p314xaae8f345.mm.p2621x8fb0427b.e8 pj6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.pj();
        java.lang.String r17 = c01.z1.r();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (!this.f248979g.contains(str) && ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) pj6).n(str, true).r2() && !r17.equals(str)) {
                this.f248979g.add(str);
            }
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 c19662x4f7a67f3 = this.f248978f;
        if (c19662x4f7a67f3 != null) {
            c19662x4f7a67f3.S(this.f248979g);
        }
        d7();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dealOnAddContact", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18115x808957e7
    public void a7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("deleteTag", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteTag", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18115x808957e7
    public java.util.List b7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getListUserName", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (this.f248980h != 4) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getListUserName", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
            return linkedList;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateListUserNameByContact", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
        new java.util.LinkedList();
        ((yb0.e) ((zb0.z) i95.n0.c(zb0.z.class))).getClass();
        java.util.List b17 = k35.c.b();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateListUserNameByContact", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getListUserName", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
        return b17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18115x808957e7, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
        super.onCreate(bundle);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18115x808957e7, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 c19662x4f7a67f3 = this.f248978f;
        if (c19662x4f7a67f3 != null) {
            c19662x4f7a67f3.getClass();
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f248976d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        gm0.j1.i();
        gm0.j1.n().f354821b.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.a0.f33775x366c91de, this);
        gm0.j1.i();
        gm0.j1.n().f354821b.q(291, this);
        gm0.j1.i();
        gm0.j1.n().f354821b.q(292, this);
        gm0.j1.i();
        gm0.j1.n().f354821b.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.c0.f33779x366c91de, this);
        gm0.j1.i();
        if (gm0.j1.b().m()) {
            gm0.j1.i();
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().e(this);
        }
        super.onDestroy();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18115x808957e7, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSceneEnd", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsBlackDetailUI", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f248976d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSceneEnd", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
    }
}
