package com.p314xaae8f345.p542x3306d5.p546x2eaf0c;

/* renamed from: com.tencent.mars.comm.PlatformComm */
/* loaded from: classes12.dex */
public class C4556x13096e3f {

    /* renamed from: EMobile */
    public static final int f19312xcbbd7547 = 2;

    /* renamed from: ENoNet */
    public static final int f19313x7a3d32d7 = -1;

    /* renamed from: EOtherNet */
    public static final int f19314xb47de7d2 = 3;

    /* renamed from: EWifi */
    public static final int f19315x3f578fa = 1;

    /* renamed from: IS_PROXY_ON */
    protected static final boolean f19316xa259a8e5 = false;

    /* renamed from: NETTYPE_2G */
    public static final int f19317x72a7fd5d = 3;

    /* renamed from: NETTYPE_3G */
    public static final int f19318x72a7fd7c = 4;

    /* renamed from: NETTYPE_4G */
    public static final int f19319x72a7fd9b = 5;

    /* renamed from: NETTYPE_5G */
    public static final int f19320x72a7fdba = 7;

    /* renamed from: NETTYPE_NON */
    public static final int f19321xe25818a5 = -1;

    /* renamed from: NETTYPE_NOT_WIFI */
    public static final int f19322xf226fa29 = 0;

    /* renamed from: NETTYPE_UNKNOWN */
    public static final int f19323xc2326622 = 6;

    /* renamed from: NETTYPE_WAP */
    public static final int f19324xe25838be = 2;

    /* renamed from: NETTYPE_WIFI */
    public static final int f19325x68aefc1d = 1;
    protected static final java.lang.String TAG = "PlatformComm";

    /* renamed from: context */
    protected static android.content.Context f19326x38b735af;

    /* renamed from: handler */
    protected static android.os.Handler f19327x294b574a;

    /* renamed from: reportCrashImp */
    public static com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.IReportCrash f19328xfd8e0bf9;

    /* renamed from: resetprocessimp */
    public static com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.IResetProcess f19329xdef3358c;

    /* renamed from: com.tencent.mars.comm.PlatformComm$APNInfo */
    /* loaded from: classes12.dex */
    public static class APNInfo {

        /* renamed from: extraInfo */
        public java.lang.String f19330xf0e1e4de;

        /* renamed from: netType */
        public int f19331x6dd19677;

        /* renamed from: subNetType */
        public int f19332x1581e817;
    }

    /* renamed from: com.tencent.mars.comm.PlatformComm$CertVerifyResult */
    /* loaded from: classes12.dex */
    public static class CertVerifyResult {

        /* renamed from: isIssuedByKnownRoot */
        public boolean f19335x5df97c79 = false;

        /* renamed from: status */
        public int f19336xcacdcff2 = 0;

        /* renamed from: certificateChain */
        public byte[][] f19334x5f8e0b6a = null;
    }

    /* renamed from: com.tencent.mars.comm.PlatformComm$IReportCrash */
    /* loaded from: classes12.dex */
    public interface IReportCrash {
        /* renamed from: reportIdkey */
        void mo40126xf0109290();
    }

    /* renamed from: com.tencent.mars.comm.PlatformComm$IResetProcess */
    /* loaded from: classes12.dex */
    public interface IResetProcess {
        /* renamed from: restartProcess */
        void mo40127x93fef960();
    }

    /* renamed from: com.tencent.mars.comm.PlatformComm$SIMInfo */
    /* loaded from: classes12.dex */
    public static class SIMInfo {

        /* renamed from: ispCode */
        public java.lang.String f19337x7cf60793;

        /* renamed from: ispName */
        public java.lang.String f19338x7cfad431;
    }

    /* renamed from: com.tencent.mars.comm.PlatformComm$WifiInfo */
    /* loaded from: classes12.dex */
    public static class WifiInfo {

        /* renamed from: bssid */
        public java.lang.String f19339x59b02dd;

        /* renamed from: ssid */
        public java.lang.String f19340x36037b;
    }

    /* renamed from: init */
    public static void m40107x316510(android.content.Context context, android.os.Handler handler) {
        f19326x38b735af = context;
        f19327x294b574a = handler;
        com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4554x915d5378.m40098x1d820048(context);
    }

    /* renamed from: com.tencent.mars.comm.PlatformComm$C2Java */
    /* loaded from: classes12.dex */
    public static class C2Java {

        /* renamed from: mCallBack */
        public static com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.C2Java.CallBack f19333x1aab3bf2;

        /* renamed from: com.tencent.mars.comm.PlatformComm$C2Java$CallBack */
        /* loaded from: classes12.dex */
        public interface CallBack {
            /* renamed from: doCertificateVerify */
            int mo39987x2f1063a5(java.lang.String str, byte[][] bArr);

            /* renamed from: doCertificateVerifyWithDetail */
            com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.CertVerifyResult mo39988xe1fe3e3c(java.lang.String str, byte[][] bArr);

            /* renamed from: getAPNInfo */
            com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.APNInfo mo39989xd5fb6337();

            /* renamed from: getCurRadioAccessNetworkInfo */
            int mo39990x316cb4e7();

            /* renamed from: getCurSIMInfo */
            com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.SIMInfo mo39991x13cb13bb();

            /* renamed from: getCurWifiInfo */
            com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.WifiInfo mo39992xce3ee28d();

            /* renamed from: getNetInfo */
            int mo39993xab99a7b5();

            /* renamed from: getProxyInfo */
            int mo39994xe3092d86(java.lang.StringBuffer stringBuffer);

            /* renamed from: getSignal */
            long mo39995x2f4c919e(boolean z17);

            /* renamed from: getStatisticsNetType */
            int mo39996xee32071e();

            /* renamed from: isNetworkConnected */
            boolean mo39997x550b09c5();

            /* renamed from: restartProcess */
            void mo39998x93fef960();

            /* renamed from: startAlarm */
            boolean mo39999xa091330f(int i17, int i18);

            /* renamed from: startAlarm */
            boolean mo40000xa091330f(int i17, int i18, int i19);

            /* renamed from: stopAlarm */
            boolean mo40001x5f7f336f(int i17);

            /* renamed from: verifyCertWithUserCA */
            com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.CertVerifyResult mo40002xf7e933ec(byte[][] bArr);

            /* renamed from: wakeupLock_new */
            com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4559x8e92a579 mo40003x4c678ceb();
        }

        /* renamed from: doCertificateVerify */
        public static int m40108x2f1063a5(java.lang.String str, byte[][] bArr) {
            com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.C2Java.CallBack callBack = f19333x1aab3bf2;
            if (callBack != null) {
                return callBack.mo39987x2f1063a5(str, bArr);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.TAG, "doCertificateVerify, mCallBack is null");
            return -1;
        }

        /* renamed from: doCertificateVerifyWithDetail */
        public static com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.CertVerifyResult m40109xe1fe3e3c(java.lang.String str, byte[][] bArr) {
            com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.C2Java.CallBack callBack = f19333x1aab3bf2;
            if (callBack != null) {
                return callBack.mo39988xe1fe3e3c(str, bArr);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.TAG, "doCertificateVerifyWithDetail, mCallBack is null");
            return null;
        }

        /* renamed from: getAPNInfo */
        public static com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.APNInfo m40110xd5fb6337() {
            com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.C2Java.CallBack callBack = f19333x1aab3bf2;
            if (callBack != null) {
                return callBack.mo39989xd5fb6337();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.TAG, "getAPNInfo, mCallBack is null");
            return null;
        }

        /* renamed from: getCurRadioAccessNetworkInfo */
        public static int m40111x316cb4e7() {
            com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.C2Java.CallBack callBack = f19333x1aab3bf2;
            if (callBack != null) {
                return callBack.mo39990x316cb4e7();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.TAG, "getCurRadioAccessNetworkInfo, mCallBack is null");
            return -1;
        }

        /* renamed from: getCurSIMInfo */
        public static com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.SIMInfo m40112x13cb13bb() {
            com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.C2Java.CallBack callBack = f19333x1aab3bf2;
            if (callBack != null) {
                return callBack.mo39991x13cb13bb();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.TAG, "getCurSIMInfo, mCallBack is null");
            return null;
        }

        @java.lang.Deprecated
        /* renamed from: getCurWifiInfo */
        public static com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.WifiInfo m40113xce3ee28d() {
            com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.C2Java.CallBack callBack = f19333x1aab3bf2;
            if (callBack != null) {
                return callBack.mo39992xce3ee28d();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.TAG, "getCurWifiInfo, mCallBack is null");
            return null;
        }

        /* renamed from: getNetInfo */
        public static int m40114xab99a7b5() {
            com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.C2Java.CallBack callBack = f19333x1aab3bf2;
            if (callBack != null) {
                return callBack.mo39993xab99a7b5();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.TAG, "getNetInfo, mCallBack is null");
            return -1;
        }

        /* renamed from: getProxyInfo */
        public static int m40115xe3092d86(java.lang.StringBuffer stringBuffer) {
            com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.C2Java.CallBack callBack = f19333x1aab3bf2;
            if (callBack != null) {
                return callBack.mo39994xe3092d86(stringBuffer);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.TAG, "getProxyInfo, mCallBack is null");
            return -1;
        }

        /* renamed from: getSignal */
        public static long m40116x2f4c919e(boolean z17) {
            com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.C2Java.CallBack callBack = f19333x1aab3bf2;
            if (callBack != null) {
                return callBack.mo39995x2f4c919e(z17);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.TAG, "getSignal, mCallBack is null");
            return -1L;
        }

        /* renamed from: getStatisticsNetType */
        public static int m40117xee32071e() {
            com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.C2Java.CallBack callBack = f19333x1aab3bf2;
            if (callBack != null) {
                return callBack.mo39996xee32071e();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.TAG, "getStatisticsNetType, mCallBack is null");
            return -1;
        }

        /* renamed from: isNetworkConnected */
        public static boolean m40118x550b09c5() {
            com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.C2Java.CallBack callBack = f19333x1aab3bf2;
            if (callBack != null) {
                return callBack.mo39997x550b09c5();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.TAG, "isNetworkConnected, mCallBack is null");
            return false;
        }

        /* renamed from: restartProcess */
        public static void m40119x93fef960() {
            com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.C2Java.CallBack callBack = f19333x1aab3bf2;
            if (callBack == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.TAG, "restartProcess, mCallBack is null");
            } else {
                callBack.mo39998x93fef960();
            }
        }

        /* renamed from: setCallback */
        public static void m40120x6c4ebec7(com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.C2Java.CallBack callBack) {
            f19333x1aab3bf2 = callBack;
        }

        /* renamed from: startAlarm */
        public static boolean m40122xa091330f(int i17, int i18, int i19) {
            com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.C2Java.CallBack callBack = f19333x1aab3bf2;
            if (callBack == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.TAG, "startAlarm, mCallBack is null");
                return false;
            }
            return callBack.mo40000xa091330f(i17, i18, i19);
        }

        /* renamed from: stopAlarm */
        public static boolean m40123x5f7f336f(int i17) {
            com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.C2Java.CallBack callBack = f19333x1aab3bf2;
            if (callBack != null) {
                return callBack.mo40001x5f7f336f(i17);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.TAG, "stopAlarm, mCallBack is null");
            return false;
        }

        /* renamed from: verifyCertWithUserCA */
        public static com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.CertVerifyResult m40124xf7e933ec(byte[][] bArr) {
            com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.C2Java.CallBack callBack = f19333x1aab3bf2;
            if (callBack != null) {
                return callBack.mo40002xf7e933ec(bArr);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.TAG, "verifyCertWithUserCA, mCallBack is null");
            return null;
        }

        /* renamed from: wakeupLock_new */
        public static com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4559x8e92a579 m40125x4c678ceb() {
            com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.C2Java.CallBack callBack = f19333x1aab3bf2;
            if (callBack != null) {
                return callBack.mo40003x4c678ceb();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.TAG, "wakeupLock_new, mCallBack is null");
            return null;
        }

        /* renamed from: startAlarm */
        public static boolean m40121xa091330f(int i17, int i18) {
            com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.C2Java.CallBack callBack = f19333x1aab3bf2;
            if (callBack == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.TAG, "startAlarm, mCallBack is null");
                return false;
            }
            return callBack.mo39999xa091330f(i17, i18);
        }
    }
}
