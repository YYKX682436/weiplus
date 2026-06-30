package com.tencent.mm.plugin.collect.reward.ui;

/* loaded from: classes4.dex */
public class z implements com.tencent.mm.plugin.wallet_core.ui.c7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI f96338a;

    public z(com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI qrRewardMainUI) {
        this.f96338a = qrRewardMainUI;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.c7
    public void a(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.QrRewardMainUI", "click save code");
        zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
        ((yb0.g) b0Var).Ni(this.f96338a, new com.tencent.mm.plugin.collect.reward.ui.x(this), new com.tencent.mm.plugin.collect.reward.ui.y(this));
    }
}
