package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes15.dex */
public class v6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceRankListHeaderView f99707d;

    public v6(com.tencent.mm.plugin.exdevice.ui.ExdeviceRankListHeaderView exdeviceRankListHeaderView) {
        this.f99707d = exdeviceRankListHeaderView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.exdevice.ui.ExdeviceRankListHeaderView exdeviceRankListHeaderView = this.f99707d;
        exdeviceRankListHeaderView.f99354e.startAnimation(exdeviceRankListHeaderView.f99357h);
    }
}
