package com.tencent.mars.comm;

/* loaded from: classes12.dex */
public class PlatformCommC2JavaCallBack implements com.tencent.mars.comm.PlatformComm.C2Java.CallBack {
    private static final java.lang.String TAG = "MicroMsg.PlatformCommC2JavaCallBack";

    /* loaded from: classes12.dex */
    public static class Assert {
        public static void assertTrue(java.lang.String str, boolean z17) {
        }

        public static void assertTrue(boolean z17) {
        }
    }

    private static com.tencent.mars.comm.PlatformComm.CertVerifyResult convertToCronetResult(com.tencent.mars.comm.AndroidCertVerifyResult androidCertVerifyResult) {
        com.tencent.mars.comm.PlatformComm.CertVerifyResult certVerifyResult = new com.tencent.mars.comm.PlatformComm.CertVerifyResult();
        certVerifyResult.status = androidCertVerifyResult.getStatus();
        certVerifyResult.isIssuedByKnownRoot = androidCertVerifyResult.isIssuedByKnownRoot();
        certVerifyResult.certificateChain = androidCertVerifyResult.getCertificateChainEncoded();
        return certVerifyResult;
    }

    private static java.lang.String exception2String(java.lang.Exception exc) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        exc.printStackTrace(new java.io.PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @Override // com.tencent.mars.comm.PlatformComm.C2Java.CallBack
    public int doCertificateVerify(java.lang.String str, byte[][] bArr) {
        com.tencent.mars.xlog.Log.i(TAG, "verify certificate for %s", str);
        try {
            com.tencent.mars.comm.AndroidCertVerifyResult verifyServerCertificates = com.tencent.mars.comm.X509Util.verifyServerCertificates(bArr, "RSA", str);
            com.tencent.mars.xlog.Log.i(TAG, "host %s verify result %d, is known roots %b", str, java.lang.Integer.valueOf(verifyServerCertificates.getStatus()), java.lang.Boolean.valueOf(verifyServerCertificates.isIssuedByKnownRoot()));
            return verifyServerCertificates.getStatus();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, e17.getLocalizedMessage());
            return -1;
        }
    }

    @Override // com.tencent.mars.comm.PlatformComm.C2Java.CallBack
    public com.tencent.mars.comm.PlatformComm.CertVerifyResult doCertificateVerifyWithDetail(java.lang.String str, byte[][] bArr) {
        com.tencent.mars.xlog.Log.i(TAG, "verify certificate for %s", str);
        try {
            com.tencent.mars.comm.AndroidCertVerifyResult verifyServerCertificates = com.tencent.mars.comm.X509Util.verifyServerCertificates(bArr, "RSA", str);
            com.tencent.mars.comm.PlatformComm.CertVerifyResult certVerifyResult = new com.tencent.mars.comm.PlatformComm.CertVerifyResult();
            certVerifyResult.status = verifyServerCertificates.getStatus();
            certVerifyResult.isIssuedByKnownRoot = verifyServerCertificates.isIssuedByKnownRoot();
            certVerifyResult.certificateChain = verifyServerCertificates.getCertificateChainEncoded();
            verifyServerCertificates.getCertificateChainEncoded();
            com.tencent.mars.xlog.Log.i(TAG, "host %s verify result %d, is known roots %b", str, java.lang.Integer.valueOf(verifyServerCertificates.getStatus()), java.lang.Boolean.valueOf(verifyServerCertificates.isIssuedByKnownRoot()));
            return certVerifyResult;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, e17.getLocalizedMessage());
            com.tencent.mars.comm.PlatformComm.CertVerifyResult certVerifyResult2 = new com.tencent.mars.comm.PlatformComm.CertVerifyResult();
            certVerifyResult2.status = -1;
            return certVerifyResult2;
        }
    }

    @Override // com.tencent.mars.comm.PlatformComm.C2Java.CallBack
    public com.tencent.mars.comm.PlatformComm.APNInfo getAPNInfo() {
        try {
            android.net.NetworkInfo activeNetworkInfo = ((android.net.ConnectivityManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("connectivity")).getActiveNetworkInfo();
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
            com.tencent.mars.comm.PlatformCommC2JavaCallBack.Assert.assertTrue(false);
            return 0;
        }
        try {
            return ((android.telephony.TelephonyManager) context.getSystemService("phone")).getNetworkType();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, exception2String(e17));
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
            com.tencent.mars.comm.PlatformCommC2JavaCallBack.Assert.assertTrue(e17.getClass().getSimpleName() + ":" + e17.getStackTrace()[0] + ", " + e17.getStackTrace()[1], false);
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
            connectivityManager = (android.net.ConnectivityManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("connectivity");
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
            if (com.tencent.mars.comm.PlatformComm.context != null) {
                return z17 ? com.tencent.mars.comm.NetworkSignalUtil.getWifiSignalStrength() : com.tencent.mars.comm.NetworkSignalUtil.getGSMSignalStrength();
            }
            com.tencent.mars.comm.PlatformCommC2JavaCallBack.Assert.assertTrue(false);
            return 0L;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
            return 0L;
        }
    }

    @Override // com.tencent.mars.comm.PlatformComm.C2Java.CallBack
    public int getStatisticsNetType() {
        android.content.Context context = com.tencent.mars.comm.PlatformComm.context;
        if (context == null) {
            com.tencent.mars.comm.PlatformCommC2JavaCallBack.Assert.assertTrue(false);
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
            com.tencent.mars.comm.PlatformCommC2JavaCallBack.Assert.assertTrue(e17.getClass().getSimpleName() + ":" + e17.getStackTrace()[0] + ", " + e17.getStackTrace()[1], false);
            return -1;
        }
    }

    @Override // com.tencent.mars.comm.PlatformComm.C2Java.CallBack
    public boolean isNetworkConnected() {
        android.content.Context context = com.tencent.mars.comm.PlatformComm.context;
        if (context == null) {
            com.tencent.mars.comm.PlatformCommC2JavaCallBack.Assert.assertTrue(false);
            return false;
        }
        try {
            return com.tencent.mars.comm.NetStatusUtil.isNetworkConnectedAboveApi23(context);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, exception2String(e17));
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
            com.tencent.mars.comm.PlatformCommC2JavaCallBack.Assert.assertTrue(e17.getClass().getSimpleName() + ":" + e17.getStackTrace()[0] + ", " + e17.getStackTrace()[1], false);
            return false;
        }
    }

    @Override // com.tencent.mars.comm.PlatformComm.C2Java.CallBack
    public void restartProcess() {
        if (com.tencent.mars.comm.PlatformComm.resetprocessimp == null) {
            return;
        }
        try {
            com.tencent.mars.comm.PlatformComm.handler.post(new java.lang.Runnable() { // from class: com.tencent.mars.comm.PlatformCommC2JavaCallBack.1
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
        com.tencent.mars.xlog.Log.i(TAG, "start alarm type:%d id is %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        android.content.Context context = com.tencent.mars.comm.PlatformComm.context;
        if (context == null) {
            com.tencent.mars.comm.PlatformCommC2JavaCallBack.Assert.assertTrue(false);
            return false;
        }
        try {
            return com.tencent.mars.comm.Alarm.start(i17, i18, i19, context);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.comm.PlatformComm.IReportCrash iReportCrash = com.tencent.mars.comm.PlatformComm.reportCrashImp;
            if (iReportCrash != null) {
                iReportCrash.reportIdkey();
            }
            com.tencent.mars.xlog.Log.e(TAG, exception2String(e17));
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
            com.tencent.mars.comm.PlatformCommC2JavaCallBack.Assert.assertTrue(e17.getClass().getSimpleName() + ":" + e17.getStackTrace()[0] + ", " + e17.getStackTrace()[1], false);
            return false;
        }
    }

    @Override // com.tencent.mars.comm.PlatformComm.C2Java.CallBack
    public boolean stopAlarm(int i17) {
        android.content.Context context = com.tencent.mars.comm.PlatformComm.context;
        if (context == null) {
            com.tencent.mars.comm.PlatformCommC2JavaCallBack.Assert.assertTrue(false);
            return false;
        }
        try {
            return com.tencent.mars.comm.Alarm.stop(i17, context);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, exception2String(e17));
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
            com.tencent.mars.comm.PlatformCommC2JavaCallBack.Assert.assertTrue(e17.getClass().getSimpleName() + ":" + e17.getStackTrace()[0] + ", " + e17.getStackTrace()[1], false);
            return false;
        }
    }

    @Override // com.tencent.mars.comm.PlatformComm.C2Java.CallBack
    public com.tencent.mars.comm.PlatformComm.CertVerifyResult verifyCertWithUserCA(byte[][] bArr) {
        try {
            try {
                com.tencent.mars.xlog.Log.i("cronet", "verifyCertWithUserCA");
                java.security.KeyStore keyStore = java.security.KeyStore.getInstance("AndroidCAStore");
                keyStore.load(null, null);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Enumeration<java.lang.String> aliases = keyStore.aliases();
                while (aliases.hasMoreElements()) {
                    java.lang.String nextElement = aliases.nextElement();
                    if (nextElement != null && nextElement.startsWith("user:")) {
                        arrayList.add(nextElement);
                    }
                }
                com.tencent.mars.xlog.Log.i("cronet", "alias list size %d", java.lang.Integer.valueOf(arrayList.size()));
                if (arrayList.isEmpty()) {
                    com.tencent.mars.xlog.Log.e("cronet", "checkServerTrusted self check aliasList null");
                    return convertToCronetResult(new com.tencent.mars.comm.AndroidCertVerifyResult(-1));
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (byte[] bArr2 : bArr) {
                    try {
                        arrayList2.add(com.tencent.mars.comm.X509Util.createCertificateFromBytes(bArr2));
                    } catch (java.security.cert.CertificateException e17) {
                        com.tencent.mars.xlog.Log.e("cronet", e17.getLocalizedMessage());
                        return convertToCronetResult(new com.tencent.mars.comm.AndroidCertVerifyResult(-5));
                    }
                }
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    java.security.cert.X509Certificate x509Certificate = (java.security.cert.X509Certificate) keyStore.getCertificate((java.lang.String) it.next());
                    java.util.Iterator it6 = arrayList2.iterator();
                    while (it6.hasNext()) {
                        try {
                            ((java.security.cert.X509Certificate) it6.next()).verify(x509Certificate.getPublicKey());
                            com.tencent.mars.xlog.Log.i("cronet", "do user verify success");
                            return convertToCronetResult(new com.tencent.mars.comm.AndroidCertVerifyResult(0));
                        } catch (java.lang.Exception e18) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("cronet", e18, "Exception: check user verify certificate", new java.lang.Object[0]);
                        }
                    }
                }
                return convertToCronetResult(new com.tencent.mars.comm.AndroidCertVerifyResult(-1));
            } catch (java.security.cert.CertificateException e19) {
                e = e19;
                com.tencent.mars.xlog.Log.e("cronet", e.getLocalizedMessage());
                return convertToCronetResult(new com.tencent.mars.comm.AndroidCertVerifyResult(-1));
            }
        } catch (java.io.IOException e27) {
            e = e27;
            com.tencent.mars.xlog.Log.e("cronet", e.getLocalizedMessage());
            return convertToCronetResult(new com.tencent.mars.comm.AndroidCertVerifyResult(-1));
        } catch (java.security.KeyStoreException e28) {
            e = e28;
            com.tencent.mars.xlog.Log.e("cronet", e.getLocalizedMessage());
            return convertToCronetResult(new com.tencent.mars.comm.AndroidCertVerifyResult(-1));
        } catch (java.security.NoSuchAlgorithmException e29) {
            e = e29;
            com.tencent.mars.xlog.Log.e("cronet", e.getLocalizedMessage());
            return convertToCronetResult(new com.tencent.mars.comm.AndroidCertVerifyResult(-1));
        }
    }

    @Override // com.tencent.mars.comm.PlatformComm.C2Java.CallBack
    public com.tencent.mars.comm.WakerLock wakeupLock_new() {
        android.content.Context context = com.tencent.mars.comm.PlatformComm.context;
        if (context == null) {
            com.tencent.mars.comm.PlatformCommC2JavaCallBack.Assert.assertTrue(false);
            return null;
        }
        try {
            return new com.tencent.mars.comm.MMWakerLock(context, TAG);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, exception2String(e17));
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
            com.tencent.mars.comm.PlatformCommC2JavaCallBack.Assert.assertTrue(e17.getClass().getSimpleName() + ":" + e17.getStackTrace()[0] + ", " + e17.getStackTrace()[1], false);
            return null;
        }
    }

    @Override // com.tencent.mars.comm.PlatformComm.C2Java.CallBack
    public boolean startAlarm(int i17, int i18) {
        com.tencent.mars.xlog.Log.i(TAG, "start alarm no type id is %d", java.lang.Integer.valueOf(i17));
        android.content.Context context = com.tencent.mars.comm.PlatformComm.context;
        if (context == null) {
            com.tencent.mars.comm.PlatformCommC2JavaCallBack.Assert.assertTrue(false);
            return false;
        }
        try {
            return com.tencent.mars.comm.Alarm.start(113, i17, i18, context);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.comm.PlatformComm.IReportCrash iReportCrash = com.tencent.mars.comm.PlatformComm.reportCrashImp;
            if (iReportCrash != null) {
                iReportCrash.reportIdkey();
            }
            com.tencent.mars.xlog.Log.e(TAG, exception2String(e17));
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
            com.tencent.mars.comm.PlatformCommC2JavaCallBack.Assert.assertTrue(e17.getClass().getSimpleName() + ":" + e17.getStackTrace()[0] + ", " + e17.getStackTrace()[1], false);
            return false;
        }
    }
}
