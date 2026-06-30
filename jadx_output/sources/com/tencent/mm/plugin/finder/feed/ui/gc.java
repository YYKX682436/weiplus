package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes8.dex */
public final class gc implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLivePrecheckLicenseUI f110082d;

    public gc(com.tencent.mm.plugin.finder.feed.ui.FinderLivePrecheckLicenseUI finderLivePrecheckLicenseUI) {
        this.f110082d = finderLivePrecheckLicenseUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.finder.feed.ui.FinderLivePrecheckLicenseUI finderLivePrecheckLicenseUI = this.f110082d;
        finderLivePrecheckLicenseUI.D--;
        finderLivePrecheckLicenseUI.f7();
        if (finderLivePrecheckLicenseUI.D > 0) {
            return true;
        }
        android.widget.Button button = finderLivePrecheckLicenseUI.f109405x;
        if (button == null) {
            return false;
        }
        button.setEnabled(true);
        return false;
    }
}
