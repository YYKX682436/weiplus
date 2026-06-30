package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes3.dex */
public class c extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.AAEntranceUI f72586d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.plugin.aa.ui.AAEntranceUI aAEntranceUI) {
        super(false);
        this.f72586d = aAEntranceUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        int i17 = com.tencent.mm.plugin.aa.ui.AAEntranceUI.f72426f;
        com.tencent.mm.plugin.aa.ui.AAEntranceUI aAEntranceUI = this.f72586d;
        aAEntranceUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AAEntranceUI", "go to contact");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_from_scene", 1);
        intent.putExtra("Select_Conv_Type", 3);
        intent.putExtra("select_is_ret", false);
        intent.putExtra("mutil_select_is_ret", false);
        intent.putExtra("Select_block_List", c01.z1.r());
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_RECENT_LAUNCH_AA_GROUP_STRING_SYNC, null);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        intent.putExtra("recent_remittance_contact_list", str);
        j45.l.n(aAEntranceUI.getContext(), "remittance", ".ui.SelectRemittanceContactUI", intent, 1);
    }
}
