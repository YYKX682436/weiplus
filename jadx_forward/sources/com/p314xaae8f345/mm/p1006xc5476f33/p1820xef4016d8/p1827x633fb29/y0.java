package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public class y0 implements com.p314xaae8f345.mm.p947xba6de98f.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.z0 f227247a;

    public y0(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.z0 z0Var) {
        this.f227247a = z0Var;
    }

    @Override // com.p314xaae8f345.mm.p947xba6de98f.q0
    public void a(com.p314xaae8f345.mm.p947xba6de98f.n1 n1Var) {
        dn.m mVar = n1Var.f152639d;
        java.lang.String str = (mVar == null || android.text.TextUtils.isEmpty(mVar.f69595x6d25b0d9)) ? "" : mVar.f69595x6d25b0d9;
        com.p314xaae8f345.mm.p947xba6de98f.m1 m1Var = com.p314xaae8f345.mm.p947xba6de98f.m1.f152610f;
        com.p314xaae8f345.mm.p947xba6de98f.m1 m1Var2 = n1Var.f152636a;
        if (m1Var2 != m1Var) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyC2CNYPredownloadImgListener", "voice download fullPath: %s %s %s", str, m1Var2, java.lang.Integer.valueOf(n1Var.f152638c));
        }
        int ordinal = m1Var2.ordinal();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.z0 z0Var = this.f227247a;
        if (ordinal != 0) {
            if (ordinal == 1) {
                if (n1Var.f152641f == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyC2CNYPredownloadImgListener", "OnDownloadCallbackSuccess, but getSceneResult is null");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.z0.b(z0Var, str);
                    return;
                }
                long k17 = com.p314xaae8f345.mm.vfs.w6.k(str);
                if (k17 >= z0Var.f227260d) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyC2CNYPredownloadImgListener", "OnDownloadCallbackSuccess");
                    return;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyC2CNYPredownloadImgListener", "OnDownloadCallbackSuccess, but realLength:%s < voiceFileLength:%s, need to delete", java.lang.Long.valueOf(k17), java.lang.Long.valueOf(z0Var.f227260d));
                    com.p314xaae8f345.mm.vfs.w6.h(str);
                    return;
                }
            }
            if (ordinal == 2) {
                dn.g gVar = n1Var.f152640e;
                if (gVar != null) {
                    long j17 = gVar.f69496x83ec3dd;
                    long j18 = n1Var.f152640e.f69500x8ab84c59;
                    return;
                }
                return;
            }
            if (ordinal != 6 && ordinal != 7 && ordinal != 10) {
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyC2CNYPredownloadImgListener", "cdn download error");
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.z0.b(z0Var, str);
    }
}
