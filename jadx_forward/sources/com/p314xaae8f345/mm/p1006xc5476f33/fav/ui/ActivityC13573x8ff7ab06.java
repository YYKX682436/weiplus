package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* renamed from: com.tencent.mm.plugin.fav.ui.FavTextEditUI */
/* loaded from: classes12.dex */
public class ActivityC13573x8ff7ab06 extends com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22507xb3b58831 {
    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22507xb3b58831
    public void U6(java.lang.CharSequence charSequence) {
        if (charSequence == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(charSequence.toString())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavTextEditUI", "text is null");
            return;
        }
        int intExtra = getIntent().getIntExtra("key_fav_item_id", -1);
        java.lang.String charSequence2 = charSequence.toString();
        if (intExtra <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavTextEditUI", "modEditText favid:%d", java.lang.Integer.valueOf(intExtra));
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.bo4 bo4Var = new r45.bo4();
        bo4Var.f452451d = 4;
        bo4Var.f452452e = 0;
        linkedList.add(bo4Var);
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        r45.eo4 eo4Var = new r45.eo4();
        eo4Var.f455155d = "favitem.desc";
        eo4Var.f455157f = charSequence2 == null ? "" : charSequence2;
        linkedList2.add(eo4Var);
        r45.eo4 eo4Var2 = new r45.eo4();
        eo4Var2.f455155d = "favitem.edittime";
        eo4Var2.f455157f = java.lang.String.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1());
        linkedList2.add(eo4Var2);
        o72.r2 re6 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().re(intExtra);
        if (re6 != null) {
            long i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
            re6.f67638x7d4eb57c = i17;
            re6.f67640x5ab01132.g(i17);
            r45.bq0 bq0Var = re6.f67640x5ab01132;
            if (charSequence2 == null) {
                charSequence2 = "";
            }
            bq0Var.e(charSequence2);
            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().mo9952xce0038c9(re6, dm.i4.f66867x2a5c95c7);
        }
        gm0.j1.d().g(new o72.l5(intExtra, linkedList, linkedList2, 0));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(10874, 1);
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22507xb3b58831, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570286ab1;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22507xb3b58831, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        m78497xc03943d(true);
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.ca6);
    }
}
