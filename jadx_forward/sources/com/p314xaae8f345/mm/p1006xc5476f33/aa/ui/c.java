package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes3.dex */
public class c extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11338x9bb0fc0a f154119d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11338x9bb0fc0a activityC11338x9bb0fc0a) {
        super(false);
        this.f154119d = activityC11338x9bb0fc0a;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11338x9bb0fc0a.f153959f;
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11338x9bb0fc0a activityC11338x9bb0fc0a = this.f154119d;
        activityC11338x9bb0fc0a.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AAEntranceUI", "go to contact");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_from_scene", 1);
        intent.putExtra("Select_Conv_Type", 3);
        intent.putExtra("select_is_ret", false);
        intent.putExtra("mutil_select_is_ret", false);
        intent.putExtra("Select_block_List", c01.z1.r());
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_RECENT_LAUNCH_AA_GROUP_STRING_SYNC, null);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        intent.putExtra("recent_remittance_contact_list", str);
        j45.l.n(activityC11338x9bb0fc0a.mo55332x76847179(), "remittance", ".ui.SelectRemittanceContactUI", intent, 1);
    }
}
