package com.p314xaae8f345.p542x3306d5.p546x2eaf0c;

/* renamed from: com.tencent.mars.comm.PlatformCommC2JavaCallBack */
/* loaded from: classes12.dex */
public class C4557xbe4d295 implements com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.C2Java.CallBack {
    private static final java.lang.String TAG = "MicroMsg.PlatformCommC2JavaCallBack";

    /* renamed from: com.tencent.mars.comm.PlatformCommC2JavaCallBack$Assert */
    /* loaded from: classes12.dex */
    public static class Assert {
        /* renamed from: assertTrue */
        public static void m40130x7ca149f4(java.lang.String str, boolean z17) {
        }

        /* renamed from: assertTrue */
        public static void m40131x7ca149f4(boolean z17) {
        }
    }

    /* renamed from: convertToCronetResult */
    private static com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.CertVerifyResult m40128x463484e8(com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4546xcbb9aa9 c4546xcbb9aa9) {
        com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.CertVerifyResult certVerifyResult = new com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.CertVerifyResult();
        certVerifyResult.f19336xcacdcff2 = c4546xcbb9aa9.m39971x2fe4f2e8();
        certVerifyResult.f19335x5df97c79 = c4546xcbb9aa9.m39973x5df97c79();
        certVerifyResult.f19334x5f8e0b6a = c4546xcbb9aa9.m39970x2846ae0e();
        return certVerifyResult;
    }

    /* renamed from: exception2String */
    private static java.lang.String m40129x6cf4e7b4(java.lang.Exception exc) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        exc.printStackTrace(new java.io.PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @Override // com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.C2Java.CallBack
    /* renamed from: doCertificateVerify */
    public int mo39987x2f1063a5(java.lang.String str, byte[][] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "verify certificate for %s", str);
        try {
            com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4546xcbb9aa9 m40149xe12d20f8 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4560xfe45eec8.m40149xe12d20f8(bArr, "RSA", str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "host %s verify result %d, is known roots %b", str, java.lang.Integer.valueOf(m40149xe12d20f8.m39971x2fe4f2e8()), java.lang.Boolean.valueOf(m40149xe12d20f8.m39973x5df97c79()));
            return m40149xe12d20f8.m39971x2fe4f2e8();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, e17.getLocalizedMessage());
            return -1;
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.C2Java.CallBack
    /* renamed from: doCertificateVerifyWithDetail */
    public com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.CertVerifyResult mo39988xe1fe3e3c(java.lang.String str, byte[][] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "verify certificate for %s", str);
        try {
            com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4546xcbb9aa9 m40149xe12d20f8 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4560xfe45eec8.m40149xe12d20f8(bArr, "RSA", str);
            com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.CertVerifyResult certVerifyResult = new com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.CertVerifyResult();
            certVerifyResult.f19336xcacdcff2 = m40149xe12d20f8.m39971x2fe4f2e8();
            certVerifyResult.f19335x5df97c79 = m40149xe12d20f8.m39973x5df97c79();
            certVerifyResult.f19334x5f8e0b6a = m40149xe12d20f8.m39970x2846ae0e();
            m40149xe12d20f8.m39970x2846ae0e();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "host %s verify result %d, is known roots %b", str, java.lang.Integer.valueOf(m40149xe12d20f8.m39971x2fe4f2e8()), java.lang.Boolean.valueOf(m40149xe12d20f8.m39973x5df97c79()));
            return certVerifyResult;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, e17.getLocalizedMessage());
            com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.CertVerifyResult certVerifyResult2 = new com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.CertVerifyResult();
            certVerifyResult2.f19336xcacdcff2 = -1;
            return certVerifyResult2;
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.C2Java.CallBack
    /* renamed from: getAPNInfo */
    public com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.APNInfo mo39989xd5fb6337() {
        try {
            android.net.NetworkInfo activeNetworkInfo = ((android.net.ConnectivityManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("connectivity")).getActiveNetworkInfo();
            com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.APNInfo aPNInfo = new com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.APNInfo();
            if (activeNetworkInfo == null) {
                return null;
            }
            aPNInfo.f19331x6dd19677 = activeNetworkInfo.getType();
            aPNInfo.f19332x1581e817 = activeNetworkInfo.getSubtype();
            if (1 != activeNetworkInfo.getType()) {
                aPNInfo.f19330xf0e1e4de = activeNetworkInfo.getExtraInfo() == null ? "" : activeNetworkInfo.getExtraInfo();
            } else {
                aPNInfo.f19330xf0e1e4de = mo39992xce3ee28d().f19340x36037b;
            }
            return aPNInfo;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.C2Java.CallBack
    /* renamed from: getCurRadioAccessNetworkInfo */
    public int mo39990x316cb4e7() {
        android.content.Context context = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.f19326x38b735af;
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4557xbe4d295.Assert.m40131x7ca149f4(false);
            return 0;
        }
        try {
            return ((android.telephony.TelephonyManager) context.getSystemService("phone")).getNetworkType();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, m40129x6cf4e7b4(e17));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
            com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4557xbe4d295.Assert.m40130x7ca149f4(e17.getClass().getSimpleName() + ":" + e17.getStackTrace()[0] + ", " + e17.getStackTrace()[1], false);
            return 0;
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.C2Java.CallBack
    /* renamed from: getCurSIMInfo */
    public com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.SIMInfo mo39991x13cb13bb() {
        int m40065x82653f5d;
        try {
            android.content.Context context = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.f19326x38b735af;
            if (context == null || (m40065x82653f5d = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40065x82653f5d(context)) == 0) {
                return null;
            }
            com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.SIMInfo sIMInfo = new com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.SIMInfo();
            sIMInfo.f19337x7cf60793 = "" + m40065x82653f5d;
            sIMInfo.f19338x7cfad431 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40066x826a0bfb(com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.f19326x38b735af);
            return sIMInfo;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.C2Java.CallBack
    /* renamed from: getCurWifiInfo */
    public com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.WifiInfo mo39992xce3ee28d() {
        com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.WifiInfo wifiInfo = new com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.WifiInfo();
        wifiInfo.f19340x36037b = "";
        wifiInfo.f19339x59b02dd = "";
        return wifiInfo;
    }

    @Override // com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.C2Java.CallBack
    /* renamed from: getNetInfo */
    public int mo39993xab99a7b5() {
        android.net.NetworkInfo networkInfo;
        android.net.ConnectivityManager connectivityManager;
        try {
            connectivityManager = (android.net.ConnectivityManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("connectivity");
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
            return 3;
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.C2Java.CallBack
    /* renamed from: getProxyInfo */
    public int mo39994xe3092d86(java.lang.StringBuffer stringBuffer) {
        return -1;
    }

    @Override // com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.C2Java.CallBack
    /* renamed from: getSignal */
    public long mo39995x2f4c919e(boolean z17) {
        try {
            if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.f19326x38b735af != null) {
                return z17 ? com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4554x915d5378.m40101xf0ac4f74() : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4554x915d5378.m40100x9d8d85b4();
            }
            com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4557xbe4d295.Assert.m40131x7ca149f4(false);
            return 0L;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
            return 0L;
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.C2Java.CallBack
    /* renamed from: getStatisticsNetType */
    public int mo39996xee32071e() {
        android.content.Context context = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.f19326x38b735af;
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4557xbe4d295.Assert.m40131x7ca149f4(false);
            return 0;
        }
        try {
            int m40067xab9ed241 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40067xab9ed241(context);
            if (m40067xab9ed241 == -1) {
                return -1;
            }
            if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40092xb9aa8b5f(m40067xab9ed241)) {
                return 1;
            }
            if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40075x3170ff(com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.f19326x38b735af)) {
                return 3;
            }
            if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40076x31711e(com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.f19326x38b735af)) {
                return 4;
            }
            if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40077x31713d(com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.f19326x38b735af)) {
                return 5;
            }
            if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40078x31715c(com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.f19326x38b735af)) {
                return 7;
            }
            return com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40090x5fd3d5c(m40067xab9ed241) ? 2 : 6;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, m40129x6cf4e7b4(e17));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
            com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4557xbe4d295.Assert.m40130x7ca149f4(e17.getClass().getSimpleName() + ":" + e17.getStackTrace()[0] + ", " + e17.getStackTrace()[1], false);
            return -1;
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.C2Java.CallBack
    /* renamed from: isNetworkConnected */
    public boolean mo39997x550b09c5() {
        android.content.Context context = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.f19326x38b735af;
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4557xbe4d295.Assert.m40131x7ca149f4(false);
            return false;
        }
        try {
            return com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40089x474d3be3(context);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, m40129x6cf4e7b4(e17));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
            com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4557xbe4d295.Assert.m40130x7ca149f4(e17.getClass().getSimpleName() + ":" + e17.getStackTrace()[0] + ", " + e17.getStackTrace()[1], false);
            return false;
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.C2Java.CallBack
    /* renamed from: restartProcess */
    public void mo39998x93fef960() {
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.f19329xdef3358c == null) {
            return;
        }
        try {
            com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.f19327x294b574a.post(new java.lang.Runnable() { // from class: com.tencent.mars.comm.PlatformCommC2JavaCallBack.1
                @Override // java.lang.Runnable
                public void run() {
                    com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.f19329xdef3358c.mo40127x93fef960();
                }
            });
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.C2Java.CallBack
    /* renamed from: startAlarm */
    public boolean mo40000xa091330f(int i17, int i18, int i19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "start alarm type:%d id is %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        android.content.Context context = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.f19326x38b735af;
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4557xbe4d295.Assert.m40131x7ca149f4(false);
            return false;
        }
        try {
            return com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4545x3c68a31.m39968x68ac462(i17, i18, i19, context);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.IReportCrash iReportCrash = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.f19328xfd8e0bf9;
            if (iReportCrash != null) {
                iReportCrash.mo40126xf0109290();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, m40129x6cf4e7b4(e17));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
            com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4557xbe4d295.Assert.m40130x7ca149f4(e17.getClass().getSimpleName() + ":" + e17.getStackTrace()[0] + ", " + e17.getStackTrace()[1], false);
            return false;
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.C2Java.CallBack
    /* renamed from: stopAlarm */
    public boolean mo40001x5f7f336f(int i17) {
        android.content.Context context = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.f19326x38b735af;
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4557xbe4d295.Assert.m40131x7ca149f4(false);
            return false;
        }
        try {
            return com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4545x3c68a31.m39969x360802(i17, context);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, m40129x6cf4e7b4(e17));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
            com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4557xbe4d295.Assert.m40130x7ca149f4(e17.getClass().getSimpleName() + ":" + e17.getStackTrace()[0] + ", " + e17.getStackTrace()[1], false);
            return false;
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.C2Java.CallBack
    /* renamed from: verifyCertWithUserCA */
    public com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.CertVerifyResult mo40002xf7e933ec(byte[][] bArr) {
        try {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("cronet", "verifyCertWithUserCA");
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
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("cronet", "alias list size %d", java.lang.Integer.valueOf(arrayList.size()));
                if (arrayList.isEmpty()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("cronet", "checkServerTrusted self check aliasList null");
                    return m40128x463484e8(new com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4546xcbb9aa9(-1));
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (byte[] bArr2 : bArr) {
                    try {
                        arrayList2.add(com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4560xfe45eec8.m40138x54e32a26(bArr2));
                    } catch (java.security.cert.CertificateException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("cronet", e17.getLocalizedMessage());
                        return m40128x463484e8(new com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4546xcbb9aa9(-5));
                    }
                }
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    java.security.cert.X509Certificate x509Certificate = (java.security.cert.X509Certificate) keyStore.getCertificate((java.lang.String) it.next());
                    java.util.Iterator it6 = arrayList2.iterator();
                    while (it6.hasNext()) {
                        try {
                            ((java.security.cert.X509Certificate) it6.next()).verify(x509Certificate.getPublicKey());
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("cronet", "do user verify success");
                            return m40128x463484e8(new com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4546xcbb9aa9(0));
                        } catch (java.lang.Exception e18) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("cronet", e18, "Exception: check user verify certificate", new java.lang.Object[0]);
                        }
                    }
                }
                return m40128x463484e8(new com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4546xcbb9aa9(-1));
            } catch (java.security.cert.CertificateException e19) {
                e = e19;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("cronet", e.getLocalizedMessage());
                return m40128x463484e8(new com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4546xcbb9aa9(-1));
            }
        } catch (java.io.IOException e27) {
            e = e27;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("cronet", e.getLocalizedMessage());
            return m40128x463484e8(new com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4546xcbb9aa9(-1));
        } catch (java.security.KeyStoreException e28) {
            e = e28;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("cronet", e.getLocalizedMessage());
            return m40128x463484e8(new com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4546xcbb9aa9(-1));
        } catch (java.security.NoSuchAlgorithmException e29) {
            e = e29;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("cronet", e.getLocalizedMessage());
            return m40128x463484e8(new com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4546xcbb9aa9(-1));
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.C2Java.CallBack
    /* renamed from: wakeupLock_new */
    public com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4559x8e92a579 mo40003x4c678ceb() {
        android.content.Context context = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.f19326x38b735af;
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4557xbe4d295.Assert.m40131x7ca149f4(false);
            return null;
        }
        try {
            return new com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4549xd1736fd9(context, TAG);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, m40129x6cf4e7b4(e17));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
            com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4557xbe4d295.Assert.m40130x7ca149f4(e17.getClass().getSimpleName() + ":" + e17.getStackTrace()[0] + ", " + e17.getStackTrace()[1], false);
            return null;
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.C2Java.CallBack
    /* renamed from: startAlarm */
    public boolean mo39999xa091330f(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "start alarm no type id is %d", java.lang.Integer.valueOf(i17));
        android.content.Context context = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.f19326x38b735af;
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4557xbe4d295.Assert.m40131x7ca149f4(false);
            return false;
        }
        try {
            return com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4545x3c68a31.m39968x68ac462(113, i17, i18, context);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.IReportCrash iReportCrash = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.f19328xfd8e0bf9;
            if (iReportCrash != null) {
                iReportCrash.mo40126xf0109290();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, m40129x6cf4e7b4(e17));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
            com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4557xbe4d295.Assert.m40130x7ca149f4(e17.getClass().getSimpleName() + ":" + e17.getStackTrace()[0] + ", " + e17.getStackTrace()[1], false);
            return false;
        }
    }
}
