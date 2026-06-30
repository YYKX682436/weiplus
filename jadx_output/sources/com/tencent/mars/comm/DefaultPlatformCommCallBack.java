package com.tencent.mars.comm;

/* loaded from: classes12.dex */
public class DefaultPlatformCommCallBack implements com.tencent.mars.comm.PlatformComm.C2Java.CallBack {
    private static final java.lang.String TAG = "DefaultPlatformCommCallBack";

    private static java.lang.String exception2String(java.lang.Exception exc) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        exc.printStackTrace(new java.io.PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public com.tencent.mars.comm.PlatformComm.CertVerifyResult convertToCronetResult(com.tencent.mars.comm.AndroidCertVerifyResult androidCertVerifyResult) {
        return null;
    }

    @Override // com.tencent.mars.comm.PlatformComm.C2Java.CallBack
    public int doCertificateVerify(java.lang.String str, byte[][] bArr) {
        return 0;
    }

    @Override // com.tencent.mars.comm.PlatformComm.C2Java.CallBack
    public com.tencent.mars.comm.PlatformComm.CertVerifyResult doCertificateVerifyWithDetail(java.lang.String str, byte[][] bArr) {
        return null;
    }

    @Override // com.tencent.mars.comm.PlatformComm.C2Java.CallBack
    public com.tencent.mars.comm.PlatformComm.APNInfo getAPNInfo() {
        try {
            android.net.NetworkInfo activeNetworkInfo = ((android.net.ConnectivityManager) com.tencent.mars.comm.PlatformComm.context.getSystemService("connectivity")).getActiveNetworkInfo();
            com.tencent.mars.comm.PlatformComm.APNInfo aPNInfo = new com.tencent.mars.comm.PlatformComm.APNInfo();
            if (activeNetworkInfo == null) {
                return null;
            }
            aPNInfo.netType = activeNetworkInfo.getType();
            aPNInfo.subNetType = activeNetworkInfo.getSubtype();
            if (1 != activeNetworkInfo.getType()) {
                aPNInfo.extraInfo = activeNetworkInfo.getExtraInfo() == null ? "" : activeNetworkInfo.getExtraInfo();
            } else {
                aPNInfo.extraInfo = getCurWifiInfo().ssid;
            }
            return aPNInfo;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    @Override // com.tencent.mars.comm.PlatformComm.C2Java.CallBack
    public int getCurRadioAccessNetworkInfo() {
        android.content.Context context = com.tencent.mars.comm.PlatformComm.context;
        if (context == null) {
            return 0;
        }
        try {
            return ((android.telephony.TelephonyManager) context.getSystemService("phone")).getNetworkType();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, exception2String(e17));
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
            return 0;
        }
    }

    @Override // com.tencent.mars.comm.PlatformComm.C2Java.CallBack
    public com.tencent.mars.comm.PlatformComm.SIMInfo getCurSIMInfo() {
        int iSPCode;
        try {
            android.content.Context context = com.tencent.mars.comm.PlatformComm.context;
            if (context == null || (iSPCode = com.tencent.mars.comm.NetStatusUtil.getISPCode(context)) == 0) {
                return null;
            }
            com.tencent.mars.comm.PlatformComm.SIMInfo sIMInfo = new com.tencent.mars.comm.PlatformComm.SIMInfo();
            sIMInfo.ispCode = "" + iSPCode;
            sIMInfo.ispName = com.tencent.mars.comm.NetStatusUtil.getISPName(com.tencent.mars.comm.PlatformComm.context);
            return sIMInfo;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    @Override // com.tencent.mars.comm.PlatformComm.C2Java.CallBack
    public com.tencent.mars.comm.PlatformComm.WifiInfo getCurWifiInfo() {
        com.tencent.mars.comm.PlatformComm.WifiInfo wifiInfo = new com.tencent.mars.comm.PlatformComm.WifiInfo();
        wifiInfo.ssid = "";
        wifiInfo.bssid = "";
        return wifiInfo;
    }

    @Override // com.tencent.mars.comm.PlatformComm.C2Java.CallBack
    public int getNetInfo() {
        android.net.NetworkInfo networkInfo;
        android.net.ConnectivityManager connectivityManager;
        try {
            connectivityManager = (android.net.ConnectivityManager) com.tencent.mars.comm.PlatformComm.context.getSystemService("connectivity");
        } catch (java.lang.Exception unused) {
            networkInfo = null;
        }
        if (connectivityManager == null) {
            return -1;
        }
        networkInfo = connectivityManager.getActiveNetworkInfo();
        if (networkInfo == null) {
            return -1;
        }
        try {
            int type = networkInfo.getType();
            if (type != 0) {
                if (type == 1) {
                    return 1;
                }
                if (type != 2 && type != 3 && type != 4 && type != 5) {
                    return 3;
                }
            }
            return 2;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
            return 3;
        }
    }

    @Override // com.tencent.mars.comm.PlatformComm.C2Java.CallBack
    public int getProxyInfo(java.lang.StringBuffer stringBuffer) {
        return -1;
    }

    @Override // com.tencent.mars.comm.PlatformComm.C2Java.CallBack
    public long getSignal(boolean z17) {
        try {
            if (com.tencent.mars.comm.PlatformComm.context == null) {
                return 0L;
            }
            return z17 ? com.tencent.mars.comm.NetworkSignalUtil.getWifiSignalStrength() : com.tencent.mars.comm.NetworkSignalUtil.getGSMSignalStrength();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
            return 0L;
        }
    }

    @Override // com.tencent.mars.comm.PlatformComm.C2Java.CallBack
    public int getStatisticsNetType() {
        android.content.Context context = com.tencent.mars.comm.PlatformComm.context;
        if (context == null) {
            return 0;
        }
        try {
            int netType = com.tencent.mars.comm.NetStatusUtil.getNetType(context);
            if (netType == -1) {
                return -1;
            }
            if (com.tencent.mars.comm.NetStatusUtil.isWifi(netType)) {
                return 1;
            }
            if (com.tencent.mars.comm.NetStatusUtil.is2G(com.tencent.mars.comm.PlatformComm.context)) {
                return 3;
            }
            if (com.tencent.mars.comm.NetStatusUtil.is3G(com.tencent.mars.comm.PlatformComm.context)) {
                return 4;
            }
            if (com.tencent.mars.comm.NetStatusUtil.is4G(com.tencent.mars.comm.PlatformComm.context)) {
                return 5;
            }
            if (com.tencent.mars.comm.NetStatusUtil.is5G(com.tencent.mars.comm.PlatformComm.context)) {
                return 7;
            }
            return com.tencent.mars.comm.NetStatusUtil.isWap(netType) ? 2 : 6;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, exception2String(e17));
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
            return -1;
        }
    }

    @Override // com.tencent.mars.comm.PlatformComm.C2Java.CallBack
    public boolean isNetworkConnected() {
        android.content.Context context = com.tencent.mars.comm.PlatformComm.context;
        if (context == null) {
            return false;
        }
        try {
            return com.tencent.mars.comm.NetStatusUtil.isNetworkConnected(context);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, exception2String(e17));
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
            return false;
        }
    }

    @Override // com.tencent.mars.comm.PlatformComm.C2Java.CallBack
    public void restartProcess() {
        if (com.tencent.mars.comm.PlatformComm.resetprocessimp == null) {
            return;
        }
        try {
            com.tencent.mars.comm.PlatformComm.handler.post(new java.lang.Runnable() { // from class: com.tencent.mars.comm.DefaultPlatformCommCallBack.1
                @Override // java.lang.Runnable
                public void run() {
                    com.tencent.mars.comm.PlatformComm.resetprocessimp.restartProcess();
                }
            });
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.mars.comm.PlatformComm.C2Java.CallBack
    public boolean startAlarm(int i17, int i18, int i19) {
        android.content.Context context = com.tencent.mars.comm.PlatformComm.context;
        if (context == null) {
            return false;
        }
        try {
            return com.tencent.mars.comm.DefaultAlarm.start(i18, i19, context);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, exception2String(e17));
            return false;
        }
    }

    @Override // com.tencent.mars.comm.PlatformComm.C2Java.CallBack
    public boolean stopAlarm(int i17) {
        android.content.Context context = com.tencent.mars.comm.PlatformComm.context;
        if (context == null) {
            return false;
        }
        try {
            return com.tencent.mars.comm.DefaultAlarm.stop(i17, context);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, exception2String(e17));
            return false;
        }
    }

    @Override // com.tencent.mars.comm.PlatformComm.C2Java.CallBack
    public com.tencent.mars.comm.PlatformComm.CertVerifyResult verifyCertWithUserCA(byte[][] bArr) {
        return null;
    }

    @Override // com.tencent.mars.comm.PlatformComm.C2Java.CallBack
    public com.tencent.mars.comm.WakerLock wakeupLock_new() {
        android.content.Context context = com.tencent.mars.comm.PlatformComm.context;
        if (context == null) {
            return null;
        }
        try {
            return new com.tencent.mars.comm.WakerLock(context);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, exception2String(e17));
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    @Override // com.tencent.mars.comm.PlatformComm.C2Java.CallBack
    public boolean startAlarm(int i17, int i18) {
        android.content.Context context = com.tencent.mars.comm.PlatformComm.context;
        if (context == null) {
            return false;
        }
        try {
            return com.tencent.mars.comm.DefaultAlarm.start(i17, i18, context);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, exception2String(e17));
            return false;
        }
    }
}
