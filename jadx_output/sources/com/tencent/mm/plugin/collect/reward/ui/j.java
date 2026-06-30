package com.tencent.mm.plugin.collect.reward.ui;

/* loaded from: classes9.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.reward.ui.QrRewardGrantUI.AnonymousClass8 f96308d;

    public j(com.tencent.mm.plugin.collect.reward.ui.QrRewardGrantUI.AnonymousClass8 anonymousClass8) {
        this.f96308d = anonymousClass8;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.QrRewardGrantUI", "click kinda finish button");
        com.tencent.mm.plugin.collect.reward.ui.QrRewardGrantUI.this.finish();
    }
}
