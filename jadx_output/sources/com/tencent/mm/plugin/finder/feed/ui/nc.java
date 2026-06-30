package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class nc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveRemindConsumeWecoinUI f110339d;

    public nc(com.tencent.mm.plugin.finder.feed.ui.FinderLiveRemindConsumeWecoinUI finderLiveRemindConsumeWecoinUI) {
        this.f110339d = finderLiveRemindConsumeWecoinUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f110339d.onBackPressed();
    }
}
