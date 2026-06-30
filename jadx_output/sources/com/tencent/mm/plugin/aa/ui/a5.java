package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes5.dex */
public class a5 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f72570d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f72571e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.LaunchAAUI f72572f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI, android.widget.ImageView imageView, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        super(false);
        this.f72572f = launchAAUI;
        this.f72570d = imageView;
        this.f72571e = k0Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Aa.LaunchAAUI", "choose aaByPersonMember mdoe");
        android.widget.ImageView imageView = this.f72570d;
        if (imageView.getVisibility() == 8) {
            imageView.setVisibility(0);
        }
        com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI = this.f72572f;
        launchAAUI.f72504h = 3;
        launchAAUI.f72505i = 4;
        launchAAUI.H7();
        this.f72571e.u();
    }
}
