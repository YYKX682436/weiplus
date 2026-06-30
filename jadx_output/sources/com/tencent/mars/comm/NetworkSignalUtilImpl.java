package com.tencent.mars.comm;

/* loaded from: classes12.dex */
public class NetworkSignalUtilImpl implements com.tencent.mars.comm.NetworkSignalUtil.INetworkSignalUtil {
    private static final java.lang.String TAG = "MicroMsg.NetworkSignalUtilImpl";
    private static final int WIFI_STRENGTH_MAX_LEVEL = 10;

    @Override // com.tencent.mars.comm.NetworkSignalUtil.INetworkSignalUtil
    public void InitNetworkSignalUtil(android.content.Context context) {
        com.tencent.mm.sdk.platformtools.v0.f193027a.k();
    }

    @Override // com.tencent.mars.comm.NetworkSignalUtil.INetworkSignalUtil
    public long calWifiStrengthInNum(int i17) {
        return java.lang.Math.max(java.lang.Math.min(android.net.wifi.WifiManager.calculateSignalLevel(i17, 10), 10), 0) * 10;
    }

    @Override // com.tencent.mars.comm.NetworkSignalUtil.INetworkSignalUtil
    public long getGSMSignalStrength() {
        com.tencent.mm.sdk.platformtools.j0 j0Var = com.tencent.mm.sdk.platformtools.v0.f193031e;
        int i17 = j0Var.f192749a;
        int i18 = i17 == 1 ? j0Var.f192750b : (j0Var.f192751c + 113) / 2;
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

    @Override // com.tencent.mars.comm.NetworkSignalUtil.INetworkSignalUtil
    public long getWifiSignalStrength() {
        return calWifiStrengthInNum(com.tencent.mm.sdk.platformtools.v0.f193027a.h());
    }
}
