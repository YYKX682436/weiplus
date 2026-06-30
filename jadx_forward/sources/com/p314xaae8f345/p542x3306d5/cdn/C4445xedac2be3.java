package com.p314xaae8f345.p542x3306d5.cdn;

/* renamed from: com.tencent.mars.cdn.CdnC2JavaCallBack */
/* loaded from: classes7.dex */
public class C4445xedac2be3 implements com.p314xaae8f345.p542x3306d5.cdn.C4444x9204715e.CallBack {
    private static final java.lang.String TAG = "mars.CdnC2Java";

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4444x9204715e.CallBack
    /* renamed from: calcVideoRangeTs */
    public java.lang.String mo37632x9197296(java.lang.String str, double d17, long j17) {
        return ((com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.InterfaceC10689xe9fde544) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.InterfaceC10689xe9fde544.class)).mo10210x9197296(str, d17, j17);
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4444x9204715e.CallBack
    /* renamed from: exportFileToExternalPath */
    public java.lang.String mo37633x8d65241b(java.lang.String str) {
        return com.p314xaae8f345.mm.vfs.w6.i(str, false);
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4444x9204715e.CallBack
    /* renamed from: getSystemProperty */
    public java.lang.String mo37634x585ae21a(java.lang.String str) {
        return java.lang.System.getProperty(str);
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4444x9204715e.CallBack
    /* renamed from: getUSBState */
    public int mo37635x91d0a2e3() {
        android.content.Intent registerReceiver = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return -1;
        }
        try {
            return registerReceiver.getIntExtra("plugged", 0);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "err:%s", e17.getMessage());
            return -1;
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4444x9204715e.CallBack
    /* renamed from: isFileReady */
    public int mo37636xf70a437d(java.lang.String str) {
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f294812f;
        if (str2 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (!(m17.a() ? m17.f294799a.F(m17.f294800b) : false)) {
            return -1;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "checkFileProperty sdcard state " + fp.m.c());
        int mo37635x91d0a2e3 = mo37635x91d0a2e3();
        if (2 == mo37635x91d0a2e3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "checkFileProperty usb is connecting PC");
        }
        return mo37635x91d0a2e3;
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4444x9204715e.CallBack
    /* renamed from: queryFreeSpace */
    public long mo37637xdf5d7612(java.lang.String str) {
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
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
