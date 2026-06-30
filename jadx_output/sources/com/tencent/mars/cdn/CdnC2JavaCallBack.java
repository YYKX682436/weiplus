package com.tencent.mars.cdn;

/* loaded from: classes7.dex */
public class CdnC2JavaCallBack implements com.tencent.mars.cdn.CdnC2Java.CallBack {
    private static final java.lang.String TAG = "mars.CdnC2Java";

    @Override // com.tencent.mars.cdn.CdnC2Java.CallBack
    public java.lang.String calcVideoRangeTs(java.lang.String str, double d17, long j17) {
        return ((com.tencent.mm.feature.sight.api.ISightJNIService) i95.n0.c(com.tencent.mm.feature.sight.api.ISightJNIService.class)).calcVideoRangeTs(str, d17, j17);
    }

    @Override // com.tencent.mars.cdn.CdnC2Java.CallBack
    public java.lang.String exportFileToExternalPath(java.lang.String str) {
        return com.tencent.mm.vfs.w6.i(str, false);
    }

    @Override // com.tencent.mars.cdn.CdnC2Java.CallBack
    public java.lang.String getSystemProperty(java.lang.String str) {
        return java.lang.System.getProperty(str);
    }

    @Override // com.tencent.mars.cdn.CdnC2Java.CallBack
    public int getUSBState() {
        android.content.Intent registerReceiver = com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return -1;
        }
        try {
            return registerReceiver.getIntExtra("plugged", 0);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, "err:%s", e17.getMessage());
            return -1;
        }
    }

    @Override // com.tencent.mars.cdn.CdnC2Java.CallBack
    public int isFileReady(java.lang.String str) {
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f213279f;
        if (str2 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (!(m17.a() ? m17.f213266a.F(m17.f213267b) : false)) {
            return -1;
        }
        com.tencent.mars.xlog.Log.i(TAG, "checkFileProperty sdcard state " + fp.m.c());
        int uSBState = getUSBState();
        if (2 == uSBState) {
            com.tencent.mars.xlog.Log.i(TAG, "checkFileProperty usb is connecting PC");
        }
        return uSBState;
    }

    @Override // com.tencent.mars.cdn.CdnC2Java.CallBack
    public long queryFreeSpace(java.lang.String str) {
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
        if (!r6Var.y()) {
            r6Var = r6Var.s();
        }
        do {
            long w17 = r6Var.w();
            if (w17 > 0) {
                return w17;
            }
            r6Var = r6Var.s();
        } while (r6Var != null);
        return 0L;
    }
}
