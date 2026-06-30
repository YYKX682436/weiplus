package com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29;

/* loaded from: classes9.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static long f262906a = -1;

    public static void a(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLockReportManager", "idkey fingerprint open result: %b", java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(713L, z17 ? 0L : 1L, 1L, false);
    }

    public static void b(int i17, int i18, long j17) {
        int i19 = 6;
        if (i18 == 6) {
            i19 = 5;
        } else if (i18 != 1004) {
            i19 = (i18 == 1023 && i17 == 3) ? 4 : -1;
        }
        if (i19 != -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLockReportManager", "wallet lock idkey report id: %d, key: %d, value: %d", 713, java.lang.Integer.valueOf(i19), java.lang.Long.valueOf(j17));
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(713L, i19, j17, false);
        }
    }

    public static void c(int i17, int i18, int i19) {
        long j17 = f262906a;
        if (j17 == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletLockReportManager", "wallet lock report sessionId is -1, not create session, ignore");
        } else {
            if (i17 == -1) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLockReportManager", "reportVerifyWalletLock session: %d, protectScene: %d, walletLockType: %d, result: %d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14839, java.lang.Long.valueOf(f262906a), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        }
    }
}
