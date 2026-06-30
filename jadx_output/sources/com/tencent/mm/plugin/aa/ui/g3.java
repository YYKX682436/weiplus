package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes3.dex */
public class g3 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f72657d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        super(false);
        this.f72657d = k0Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        int i17 = com.tencent.mm.plugin.aa.ui.LaunchAAUI.S1;
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("aa_pay");
        M.getClass();
        M.putBoolean("new_open_IM_user_guide_show", false);
        this.f72657d.u();
    }
}
