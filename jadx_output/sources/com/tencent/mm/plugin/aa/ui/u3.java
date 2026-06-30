package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class u3 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.LaunchAAUI f72833d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI) {
        super(false);
        this.f72833d = launchAAUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI = this.f72833d;
        launchAAUI.hideTenpayKB();
        launchAAUI.hideVKB();
        com.tencent.mm.plugin.aa.ui.LaunchAAUI.h7(launchAAUI, 330, launchAAUI.H1);
    }
}
