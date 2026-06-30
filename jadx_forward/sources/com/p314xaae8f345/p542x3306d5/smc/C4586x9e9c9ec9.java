package com.p314xaae8f345.p542x3306d5.smc;

/* renamed from: com.tencent.mars.smc.SmcManagerCallbackWithPush */
/* loaded from: classes12.dex */
public class C4586x9e9c9ec9 implements com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244.CallBack {
    private static final java.lang.String TAG = "MicroMsg.SmcManagerCallbackWithPush";

    /* renamed from: context */
    private android.content.Context f19545x38b735af;

    /* renamed from: kvReportNotify */
    private com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.InterfaceC17195x10840331 f19546x7d0cbaa8 = null;

    public C4586x9e9c9ec9(android.content.Context context) {
        this.f19545x38b735af = context;
    }

    /* renamed from: getAppFilePath */
    private java.lang.String m40405xda9123cc() {
        android.content.Context context = this.f19545x38b735af;
        if (context == null) {
            return null;
        }
        try {
            com.p314xaae8f345.mm.vfs.r6 j17 = com.p314xaae8f345.mm.vfs.r6.j(context.getFilesDir());
            if (!j17.m()) {
                j17.J();
            }
            return j17.m82469x9616526c();
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244.CallBack
    /* renamed from: getKVCommPath */
    public java.lang.String mo40398xb7d8cfb2() {
        java.lang.String str = m40405xda9123cc() + "/kvcomm-push/";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "[TEST-PATH (Smc)]path:" + m40405xda9123cc());
        return str;
    }

    @Override // com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244.CallBack
    /* renamed from: getKVCommReqBaseInfo */
    public com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244.BaseInfo mo40399x3ae299b0() {
        com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244.BaseInfo baseInfo = new com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244.BaseInfo();
        baseInfo.f19541xa3097273 = wo.w0.m() + android.os.Build.CPU_ABI;
        baseInfo.f19540xa26fc2d1 = android.os.Build.BRAND;
        baseInfo.f19543xc3e36a8f = "android-" + android.os.Build.MANUFACTURER;
        baseInfo.f19544x6c00fe54 = "" + android.os.Build.VERSION.SDK_INT;
        baseInfo.f19542xb9e9dd2b = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d();
        return baseInfo;
    }

    @Override // com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244.CallBack
    /* renamed from: getSingleReportBufSizeB */
    public int mo40400x9deff5e0() {
        return 20480;
    }

    @Override // com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244.CallBack
    /* renamed from: onReportDataReady */
    public void mo40401xdaa0e966(byte[] bArr, byte[] bArr2, int i17, java.lang.String str) {
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.InterfaceC17195x10840331 interfaceC17195x10840331 = this.f19546x7d0cbaa8;
            if (interfaceC17195x10840331 == null || bArr2 == null || bArr2.length <= 0) {
                return;
            }
            interfaceC17195x10840331.mo43094x7b3da11b(bArr, bArr2, i17);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("KVReportJni", e17.getMessage());
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244.CallBack
    /* renamed from: onRequestGetStrategy */
    public boolean mo40402x427a6719(byte[] bArr, int i17) {
        try {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273980j && com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0).getBoolean("gprs_alert", true)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "onRequestGetStrategy gprs alert return false");
                return false;
            }
            synchronized (this) {
            }
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("KVReportJni", "onRequestGetStrategy error: " + e17.getMessage());
            return false;
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244.CallBack
    /* renamed from: onSelfMonitorOpLogReady */
    public boolean mo40403x4bfb482f(byte[] bArr) {
        if (!gm0.j1.b().n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "onReportKVDaSelfMonitorOpLogReady account not ready");
            return false;
        }
        try {
            p45.k kVar = new p45.k();
            kVar.mo11468x92b714fd(bArr);
            if (com.p314xaae8f345.p542x3306d5.smc.C4587xd5ddedd6.m40411xf90de413(kVar).f473986d <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("KVReportJni", "error selfmonitor count");
            }
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("KVReportJni", e17.getMessage());
            return false;
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244.CallBack
    /* renamed from: parseKVPluginMsg */
    public void mo40404x39af5590(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "msg content is null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "receive msg: " + str);
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "sysmsg", null);
        if (d17 == null || d17.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "plugin msg parse fail:" + str);
            return;
        }
        java.lang.String str2 = (java.lang.String) d17.get(".sysmsg.$type");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || !str2.equalsIgnoreCase("getkvidkeystg")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "plugin msg parse fail:" + str);
            return;
        }
        long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) d17.get(".sysmsg.getkvidkeystg.generalversion"), -1L);
        long V2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) d17.get(".sysmsg.getkvidkeystg.specialversion"), -1L);
        long V3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) d17.get(".sysmsg.getkvidkeystg.whiteorblackuinversion"), -1L);
        long V4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) d17.get(".sysmsg.getkvidkeystg.timeinterval"), -1L);
        long V5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) d17.get(".sysmsg.getkvidkeystg.kvgeneralversion"), -1L);
        long V6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) d17.get(".sysmsg.getkvidkeystg.kvspecialversion"), -1L);
        long V7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) d17.get(".sysmsg.getkvidkeystg.kvwhiteorblackuinversion"), -1L);
        if (V == -1 || V2 == -1 || V3 == -1 || V4 == -1 || -1 == V5 || -1 == V6 || -1 == V7) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "plugin msg parse fail:" + str);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "plugin msg version:" + V + ", " + V2 + ", " + V3);
        ((com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244.class)).m40368xf57a740f(V5, V6, V7, V, V2, V4);
    }

    /* renamed from: setKvReportNotify */
    public void m40406x339aefaa(com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.InterfaceC17195x10840331 interfaceC17195x10840331) {
        this.f19546x7d0cbaa8 = interfaceC17195x10840331;
    }
}
