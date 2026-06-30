package com.p314xaae8f345.p542x3306d5.p546x2eaf0c;

/* renamed from: com.tencent.mars.comm.NetworkSignalUtil */
/* loaded from: classes12.dex */
public class C4554x915d5378 {
    public static final java.lang.String TAG = "MicroMsg.NetworkSignalUtil";

    /* renamed from: myNetworkSignalUtil */
    public static com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4554x915d5378.INetworkSignalUtil f19310xbdcd34c;

    /* renamed from: com.tencent.mars.comm.NetworkSignalUtil$INetworkSignalUtil */
    /* loaded from: classes12.dex */
    public interface INetworkSignalUtil {
        /* renamed from: InitNetworkSignalUtil */
        void mo40103x1d820048(android.content.Context context);

        /* renamed from: calWifiStrengthInNum */
        long mo40104x7d71991d(int i17);

        /* renamed from: getGSMSignalStrength */
        long mo40105x9d8d85b4();

        /* renamed from: getWifiSignalStrength */
        long mo40106xf0ac4f74();
    }

    /* renamed from: InitNetworkSignalUtil */
    public static void m40098x1d820048(android.content.Context context) {
        f19310xbdcd34c.mo40103x1d820048(context);
    }

    /* renamed from: calWifiStrengthInNum */
    public static long m40099x7d71991d(int i17) {
        return f19310xbdcd34c.mo40104x7d71991d(i17);
    }

    /* renamed from: getGSMSignalStrength */
    public static long m40100x9d8d85b4() {
        return f19310xbdcd34c.mo40105x9d8d85b4();
    }

    /* renamed from: getWifiSignalStrength */
    public static long m40101xf0ac4f74() {
        return f19310xbdcd34c.mo40106xf0ac4f74();
    }

    /* renamed from: setMyNetworkSignalUtil */
    public static void m40102xb2516f8a(com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4554x915d5378.INetworkSignalUtil iNetworkSignalUtil) {
        f19310xbdcd34c = iNetworkSignalUtil;
    }
}
