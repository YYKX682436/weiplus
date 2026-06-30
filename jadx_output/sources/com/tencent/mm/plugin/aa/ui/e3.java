package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class e3 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f72624d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.LaunchAAUI f72625e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        super(false);
        this.f72625e = launchAAUI;
        this.f72624d = k0Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        int i17 = com.tencent.mm.plugin.aa.ui.LaunchAAUI.S1;
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("aa_pay");
        M.getClass();
        M.putBoolean("new_user_guide_show", false);
        this.f72624d.u();
        this.f72625e.f7(2);
    }
}
