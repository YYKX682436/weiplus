package com.tencent.mm.plugin.collect.reward.ui;

/* loaded from: classes9.dex */
public class j0 implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.reward.ui.QrRewardSelectMoneyUI f96309a;

    public j0(com.tencent.mm.plugin.collect.reward.ui.QrRewardSelectMoneyUI qrRewardSelectMoneyUI, long j17) {
        this.f96309a = qrRewardSelectMoneyUI;
    }

    @Override // c01.o8
    public void a(java.lang.String str, boolean z17) {
        if (z17) {
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            java.lang.System.currentTimeMillis();
            ((com.tencent.mm.feature.avatar.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
            com.tencent.mm.modelavatar.g.f(str, 3);
            ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.tencent.mm.modelavatar.d1.wi().i(str);
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.QrRewardSelectMoneyUI", "getContact failed");
        }
        kv.z zVar = (kv.z) i95.n0.c(kv.z.class);
        com.tencent.mm.plugin.collect.reward.ui.QrRewardSelectMoneyUI qrRewardSelectMoneyUI = this.f96309a;
        ((com.tencent.mm.feature.avatar.w) zVar).Ri(qrRewardSelectMoneyUI.f96249e, str, 0.03f);
        qrRewardSelectMoneyUI.V6(str);
    }
}
