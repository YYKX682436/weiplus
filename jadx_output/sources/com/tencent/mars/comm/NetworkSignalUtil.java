package com.tencent.mars.comm;

/* loaded from: classes12.dex */
public class NetworkSignalUtil {
    public static final java.lang.String TAG = "MicroMsg.NetworkSignalUtil";
    public static com.tencent.mars.comm.NetworkSignalUtil.INetworkSignalUtil myNetworkSignalUtil;

    /* loaded from: classes12.dex */
    public interface INetworkSignalUtil {
        void InitNetworkSignalUtil(android.content.Context context);

        long calWifiStrengthInNum(int i17);

        long getGSMSignalStrength();

        long getWifiSignalStrength();
    }

    public static void InitNetworkSignalUtil(android.content.Context context) {
        myNetworkSignalUtil.InitNetworkSignalUtil(context);
    }

    public static long calWifiStrengthInNum(int i17) {
        return myNetworkSignalUtil.calWifiStrengthInNum(i17);
    }

    public static long getGSMSignalStrength() {
        return myNetworkSignalUtil.getGSMSignalStrength();
    }

    public static long getWifiSignalStrength() {
        return myNetworkSignalUtil.getWifiSignalStrength();
    }

    public static void setMyNetworkSignalUtil(com.tencent.mars.comm.NetworkSignalUtil.INetworkSignalUtil iNetworkSignalUtil) {
        myNetworkSignalUtil = iNetworkSignalUtil;
    }
}
