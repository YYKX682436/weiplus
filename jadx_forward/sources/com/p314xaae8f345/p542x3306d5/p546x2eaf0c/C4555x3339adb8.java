package com.p314xaae8f345.p542x3306d5.p546x2eaf0c;

/* renamed from: com.tencent.mars.comm.NetworkSignalUtilImpl */
/* loaded from: classes12.dex */
public class C4555x3339adb8 implements com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4554x915d5378.INetworkSignalUtil {
    private static final java.lang.String TAG = "MicroMsg.NetworkSignalUtilImpl";

    /* renamed from: WIFI_STRENGTH_MAX_LEVEL */
    private static final int f19311xe4309f95 = 10;

    @Override // com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4554x915d5378.INetworkSignalUtil
    /* renamed from: InitNetworkSignalUtil */
    public void mo40103x1d820048(android.content.Context context) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.v0.f274560a.k();
    }

    @Override // com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4554x915d5378.INetworkSignalUtil
    /* renamed from: calWifiStrengthInNum */
    public long mo40104x7d71991d(int i17) {
        return java.lang.Math.max(java.lang.Math.min(android.net.wifi.WifiManager.calculateSignalLevel(i17, 10), 10), 0) * 10;
    }

    @Override // com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4554x915d5378.INetworkSignalUtil
    /* renamed from: getGSMSignalStrength */
    public long mo40105x9d8d85b4() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.j0 j0Var = com.p314xaae8f345.mm.sdk.p2603x2137b148.v0.f274564e;
        int i17 = j0Var.f274282a;
        int i18 = i17 == 1 ? j0Var.f274283b : (j0Var.f274284c + 113) / 2;
        if ((i17 == 1) && i18 == 99) {
            return -1L;
        }
        long j17 = i18 * 3.2258065f;
        if (j17 > 100) {
            j17 = 100;
        }
        if (j17 < 0) {
            return 0L;
        }
        return j17;
    }

    @Override // com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4554x915d5378.INetworkSignalUtil
    /* renamed from: getWifiSignalStrength */
    public long mo40106xf0ac4f74() {
        return mo40104x7d71991d(com.p314xaae8f345.mm.sdk.p2603x2137b148.v0.f274560a.h());
    }
}
