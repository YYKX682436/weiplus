package com.tencent.mm.plugin.collect.reward.ui;

/* loaded from: classes9.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI f96332d;

    public t(com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI qrRewardMainUI) {
        this.f96332d = qrRewardMainUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f96332d.showVKB();
    }
}
