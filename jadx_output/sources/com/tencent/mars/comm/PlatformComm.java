package com.tencent.mars.comm;

/* loaded from: classes12.dex */
public class PlatformComm {
    public static final int EMobile = 2;
    public static final int ENoNet = -1;
    public static final int EOtherNet = 3;
    public static final int EWifi = 1;
    protected static final boolean IS_PROXY_ON = false;
    public static final int NETTYPE_2G = 3;
    public static final int NETTYPE_3G = 4;
    public static final int NETTYPE_4G = 5;
    public static final int NETTYPE_5G = 7;
    public static final int NETTYPE_NON = -1;
    public static final int NETTYPE_NOT_WIFI = 0;
    public static final int NETTYPE_UNKNOWN = 6;
    public static final int NETTYPE_WAP = 2;
    public static final int NETTYPE_WIFI = 1;
    protected static final java.lang.String TAG = "PlatformComm";
    protected static android.content.Context context;
    protected static android.os.Handler handler;
    public static com.tencent.mars.comm.PlatformComm.IReportCrash reportCrashImp;
    public static com.tencent.mars.comm.PlatformComm.IResetProcess resetprocessimp;

    /* loaded from: classes12.dex */
    public static class APNInfo {
        public java.lang.String extraInfo;
        public int netType;
        public int subNetType;
    }

    /* loaded from: classes12.dex */
    public static class CertVerifyResult {
        public boolean isIssuedByKnownRoot = false;
        public int status = 0;
        public byte[][] certificateChain = null;
    }

    /* loaded from: classes12.dex */
    public interface IReportCrash {
        void reportIdkey();
    }

    /* loaded from: classes12.dex */
    public interface IResetProcess {
        void restartProcess();
    }

    /* loaded from: classes12.dex */
    public static class SIMInfo {
        public java.lang.String ispCode;
        public java.lang.String ispName;
    }

    /* loaded from: classes12.dex */
    public static class WifiInfo {
        public java.lang.String bssid;
        public java.lang.String ssid;
    }

    public static void init(android.content.Context context2, android.os.Handler handler2) {
        context = context2;
        handler = handler2;
        com.tencent.mars.comm.NetworkSignalUtil.InitNetworkSignalUtil(context2);
    }

    /* loaded from: classes12.dex */
    public static class C2Java {
        public static com.tencent.mars.comm.PlatformComm.C2Java.CallBack mCallBack;

        /* loaded from: classes12.dex */
        public interface CallBack {
            int doCertificateVerify(java.lang.String str, byte[][] bArr);

            com.tencent.mars.comm.PlatformComm.CertVerifyResult doCertificateVerifyWithDetail(java.lang.String str, byte[][] bArr);

            com.tencent.mars.comm.PlatformComm.APNInfo getAPNInfo();

            int getCurRadioAccessNetworkInfo();

            com.tencent.mars.comm.PlatformComm.SIMInfo getCurSIMInfo();

            com.tencent.mars.comm.PlatformComm.WifiInfo getCurWifiInfo();

            int getNetInfo();

            int getProxyInfo(java.lang.StringBuffer stringBuffer);

            long getSignal(boolean z17);

            int getStatisticsNetType();

            boolean isNetworkConnected();

            void restartProcess();

            boolean startAlarm(int i17, int i18);

            boolean startAlarm(int i17, int i18, int i19);

            boolean stopAlarm(int i17);

            com.tencent.mars.comm.PlatformComm.CertVerifyResult verifyCertWithUserCA(byte[][] bArr);

            com.tencent.mars.comm.WakerLock wakeupLock_new();
        }

        public static int doCertificateVerify(java.lang.String str, byte[][] bArr) {
            com.tencent.mars.comm.PlatformComm.C2Java.CallBack callBack = mCallBack;
            if (callBack != null) {
                return callBack.doCertificateVerify(str, bArr);
            }
            com.tencent.mars.xlog.Log.e(com.tencent.mars.comm.PlatformComm.TAG, "doCertificateVerify, mCallBack is null");
            return -1;
        }

        public static com.tencent.mars.comm.PlatformComm.CertVerifyResult doCertificateVerifyWithDetail(java.lang.String str, byte[][] bArr) {
            com.tencent.mars.comm.PlatformComm.C2Java.CallBack callBack = mCallBack;
            if (callBack != null) {
                return callBack.doCertificateVerifyWithDetail(str, bArr);
            }
            com.tencent.mars.xlog.Log.e(com.tencent.mars.comm.PlatformComm.TAG, "doCertificateVerifyWithDetail, mCallBack is null");
            return null;
        }

        public static com.tencent.mars.comm.PlatformComm.APNInfo getAPNInfo() {
            com.tencent.mars.comm.PlatformComm.C2Java.CallBack callBack = mCallBack;
            if (callBack != null) {
                return callBack.getAPNInfo();
            }
            com.tencent.mars.xlog.Log.e(com.tencent.mars.comm.PlatformComm.TAG, "getAPNInfo, mCallBack is null");
            return null;
        }

        public static int getCurRadioAccessNetworkInfo() {
            com.tencent.mars.comm.PlatformComm.C2Java.CallBack callBack = mCallBack;
            if (callBack != null) {
                return callBack.getCurRadioAccessNetworkInfo();
            }
            com.tencent.mars.xlog.Log.e(com.tencent.mars.comm.PlatformComm.TAG, "getCurRadioAccessNetworkInfo, mCallBack is null");
            return -1;
        }

        public static com.tencent.mars.comm.PlatformComm.SIMInfo getCurSIMInfo() {
            com.tencent.mars.comm.PlatformComm.C2Java.CallBack callBack = mCallBack;
            if (callBack != null) {
                return callBack.getCurSIMInfo();
            }
            com.tencent.mars.xlog.Log.e(com.tencent.mars.comm.PlatformComm.TAG, "getCurSIMInfo, mCallBack is null");
            return null;
        }

        @java.lang.Deprecated
        public static com.tencent.mars.comm.PlatformComm.WifiInfo getCurWifiInfo() {
            com.tencent.mars.comm.PlatformComm.C2Java.CallBack callBack = mCallBack;
            if (callBack != null) {
                return callBack.getCurWifiInfo();
            }
            com.tencent.mars.xlog.Log.e(com.tencent.mars.comm.PlatformComm.TAG, "getCurWifiInfo, mCallBack is null");
            return null;
        }

        public static int getNetInfo() {
            com.tencent.mars.comm.PlatformComm.C2Java.CallBack callBack = mCallBack;
            if (callBack != null) {
                return callBack.getNetInfo();
            }
            com.tencent.mars.xlog.Log.e(com.tencent.mars.comm.PlatformComm.TAG, "getNetInfo, mCallBack is null");
            return -1;
        }

        public static int getProxyInfo(java.lang.StringBuffer stringBuffer) {
            com.tencent.mars.comm.PlatformComm.C2Java.CallBack callBack = mCallBack;
            if (callBack != null) {
                return callBack.getProxyInfo(stringBuffer);
            }
            com.tencent.mars.xlog.Log.e(com.tencent.mars.comm.PlatformComm.TAG, "getProxyInfo, mCallBack is null");
            return -1;
        }

        public static long getSignal(boolean z17) {
            com.tencent.mars.comm.PlatformComm.C2Java.CallBack callBack = mCallBack;
            if (callBack != null) {
                return callBack.getSignal(z17);
            }
            com.tencent.mars.xlog.Log.e(com.tencent.mars.comm.PlatformComm.TAG, "getSignal, mCallBack is null");
            return -1L;
        }

        public static int getStatisticsNetType() {
            com.tencent.mars.comm.PlatformComm.C2Java.CallBack callBack = mCallBack;
            if (callBack != null) {
                return callBack.getStatisticsNetType();
            }
            com.tencent.mars.xlog.Log.e(com.tencent.mars.comm.PlatformComm.TAG, "getStatisticsNetType, mCallBack is null");
            return -1;
        }

        public static boolean isNetworkConnected() {
            com.tencent.mars.comm.PlatformComm.C2Java.CallBack callBack = mCallBack;
            if (callBack != null) {
                return callBack.isNetworkConnected();
            }
            com.tencent.mars.xlog.Log.e(com.tencent.mars.comm.PlatformComm.TAG, "isNetworkConnected, mCallBack is null");
            return false;
        }

        public static void restartProcess() {
            com.tencent.mars.comm.PlatformComm.C2Java.CallBack callBack = mCallBack;
            if (callBack == null) {
                com.tencent.mars.xlog.Log.e(com.tencent.mars.comm.PlatformComm.TAG, "restartProcess, mCallBack is null");
            } else {
                callBack.restartProcess();
            }
        }

        public static void setCallback(com.tencent.mars.comm.PlatformComm.C2Java.CallBack callBack) {
            mCallBack = callBack;
        }

        public static boolean startAlarm(int i17, int i18, int i19) {
            com.tencent.mars.comm.PlatformComm.C2Java.CallBack callBack = mCallBack;
            if (callBack == null) {
                com.tencent.mars.xlog.Log.e(com.tencent.mars.comm.PlatformComm.TAG, "startAlarm, mCallBack is null");
                return false;
            }
            return callBack.startAlarm(i17, i18, i19);
        }

        public static boolean stopAlarm(int i17) {
            com.tencent.mars.comm.PlatformComm.C2Java.CallBack callBack = mCallBack;
            if (callBack != null) {
                return callBack.stopAlarm(i17);
            }
            com.tencent.mars.xlog.Log.e(com.tencent.mars.comm.PlatformComm.TAG, "stopAlarm, mCallBack is null");
            return false;
        }

        public static com.tencent.mars.comm.PlatformComm.CertVerifyResult verifyCertWithUserCA(byte[][] bArr) {
            com.tencent.mars.comm.PlatformComm.C2Java.CallBack callBack = mCallBack;
            if (callBack != null) {
                return callBack.verifyCertWithUserCA(bArr);
            }
            com.tencent.mars.xlog.Log.e(com.tencent.mars.comm.PlatformComm.TAG, "verifyCertWithUserCA, mCallBack is null");
            return null;
        }

        public static com.tencent.mars.comm.WakerLock wakeupLock_new() {
            com.tencent.mars.comm.PlatformComm.C2Java.CallBack callBack = mCallBack;
            if (callBack != null) {
                return callBack.wakeupLock_new();
            }
            com.tencent.mars.xlog.Log.e(com.tencent.mars.comm.PlatformComm.TAG, "wakeupLock_new, mCallBack is null");
            return null;
        }

        public static boolean startAlarm(int i17, int i18) {
            com.tencent.mars.comm.PlatformComm.C2Java.CallBack callBack = mCallBack;
            if (callBack == null) {
                com.tencent.mars.xlog.Log.e(com.tencent.mars.comm.PlatformComm.TAG, "startAlarm, mCallBack is null");
                return false;
            }
            return callBack.startAlarm(i17, i18);
        }
    }
}
