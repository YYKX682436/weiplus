package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes3.dex */
public class v4 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f72853d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        super(false);
        this.f72853d = k0Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        this.f72853d.u();
    }
}
