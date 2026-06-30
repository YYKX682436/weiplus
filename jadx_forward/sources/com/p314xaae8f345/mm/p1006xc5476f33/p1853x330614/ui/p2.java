package com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui;

/* loaded from: classes9.dex */
public class p2 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.xj6 f229996d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l81.e1 f229997e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.y1 f229998f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.C16481x8b52b61f f229999g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.C16481x8b52b61f c16481x8b52b61f, r45.xj6 xj6Var, l81.e1 e1Var, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.y1 y1Var) {
        super(false);
        this.f229999g = c16481x8b52b61f;
        this.f229996d = xj6Var;
        this.f229997e = e1Var;
        this.f229998f = y1Var;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        java.lang.String str;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("key_tiny_app_scene", com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46406xaf4081cb);
        bundle.putString("realname_verify_process_jump_plugin", "mall");
        bundle.putString("realname_verify_process_jump_activity", ".ui.MallWalletUI");
        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.C16481x8b52b61f c16481x8b52b61f = this.f229999g;
        android.content.Context context = c16481x8b52b61f.getContext();
        r45.xj6 xj6Var = this.f229996d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z1.d(context, xj6Var.f471706n, bundle, this.f229997e, this.f229998f, null);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6152x2909442 c6152x2909442 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6152x2909442();
        c6152x2909442.f136414g.f88910a = xj6Var.f471704i;
        c6152x2909442.e();
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.C16481x8b52b61f.f229831v;
        c16481x8b52b61f.b();
        r45.bm5 bm5Var = xj6Var.f471703h;
        int i18 = 3;
        str = "";
        if (bm5Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bm5Var.f452406e)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.C16481x8b52b61f.a(c16481x8b52b61f, xj6Var.f471703h.f452406e);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(22735, xj6Var.f471703h.f452406e, 3, "");
            if ("Lqt".equals(xj6Var.f471703h.f452406e)) {
                java.lang.String str2 = xj6Var.f471703h.f452406e;
                c16481x8b52b61f.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallWalletSectionCellView", "lqtOnClickRedDotReq, redDotID: %s", str2);
                new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.b0(str2).l().q(new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.q2(c16481x8b52b61f));
            }
        }
        r45.yt5 yt5Var = xj6Var.f471706n;
        int i19 = yt5Var.f472887d;
        if (i19 == 1) {
            str = yt5Var.f472888e;
            i18 = 1;
        } else if (i19 == 2) {
            r45.nm6 nm6Var = yt5Var.f472889f;
            str = nm6Var != null ? nm6Var.f463051d : "";
            i18 = 2;
        } else if (i19 == 4) {
            str = yt5Var.f472888e;
        } else {
            i18 = 0;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16502, 2, str, java.lang.Integer.valueOf(i18));
    }
}
