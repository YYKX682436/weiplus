package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes8.dex */
public final class fc extends com.tencent.mm.network.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLivePrecheckLicenseUI f110012d;

    public fc(com.tencent.mm.plugin.finder.feed.ui.FinderLivePrecheckLicenseUI finderLivePrecheckLicenseUI) {
        this.f110012d = finderLivePrecheckLicenseUI;
    }

    @Override // com.tencent.mm.network.s0
    public void onNetworkChange(int i17) {
        com.tencent.mars.xlog.Log.i("FinderLivePrecheckLicenseUI", "licenseLoadUrl onNetworkChange status:" + i17 + '!');
        com.tencent.mm.plugin.finder.feed.ui.FinderLivePrecheckLicenseUI finderLivePrecheckLicenseUI = this.f110012d;
        finderLivePrecheckLicenseUI.d7(finderLivePrecheckLicenseUI.C);
    }
}
