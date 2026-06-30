package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class FavTextEditUI extends com.tencent.mm.ui.tools.MMTextInputUI {
    @Override // com.tencent.mm.ui.tools.MMTextInputUI
    public void U6(java.lang.CharSequence charSequence) {
        if (charSequence == null || com.tencent.mm.sdk.platformtools.t8.K0(charSequence.toString())) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavTextEditUI", "text is null");
            return;
        }
        int intExtra = getIntent().getIntExtra("key_fav_item_id", -1);
        java.lang.String charSequence2 = charSequence.toString();
        if (intExtra <= 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavTextEditUI", "modEditText favid:%d", java.lang.Integer.valueOf(intExtra));
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.bo4 bo4Var = new r45.bo4();
        bo4Var.f370918d = 4;
        bo4Var.f370919e = 0;
        linkedList.add(bo4Var);
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        r45.eo4 eo4Var = new r45.eo4();
        eo4Var.f373622d = "favitem.desc";
        eo4Var.f373624f = charSequence2 == null ? "" : charSequence2;
        linkedList2.add(eo4Var);
        r45.eo4 eo4Var2 = new r45.eo4();
        eo4Var2.f373622d = "favitem.edittime";
        eo4Var2.f373624f = java.lang.String.valueOf(com.tencent.mm.sdk.platformtools.t8.i1());
        linkedList2.add(eo4Var2);
        o72.r2 re6 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().re(intExtra);
        if (re6 != null) {
            long i17 = com.tencent.mm.sdk.platformtools.t8.i1();
            re6.field_edittime = i17;
            re6.field_favProto.g(i17);
            r45.bq0 bq0Var = re6.field_favProto;
            if (charSequence2 == null) {
                charSequence2 = "";
            }
            bq0Var.e(charSequence2);
            ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().update(re6, dm.i4.COL_LOCALID);
        }
        gm0.j1.d().g(new o72.l5(intExtra, linkedList, linkedList2, 0));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10874, 1);
    }

    @Override // com.tencent.mm.ui.tools.MMTextInputUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488753ab1;
    }

    @Override // com.tencent.mm.ui.tools.MMTextInputUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        customfixStatusbar(true);
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.ca6);
    }
}
