package com.p314xaae8f345.p2841xd11c237d.smc;

/* renamed from: com.tencent.paymars.smc.SmcManager */
/* loaded from: classes12.dex */
public class C23035x1608f244 extends com.p314xaae8f345.p2841xd11c237d.app.AbstractC23009x1e602b7c {

    /* renamed from: ICallBack */
    protected com.p314xaae8f345.p2841xd11c237d.smc.C23035x1608f244.CallBack f40240x410b9fce;

    /* renamed from: nativeHandle */
    protected long f40243x7b5cfd1f = 0;

    /* renamed from: callbackHandle */
    protected long f40241x429972cd = 0;

    /* renamed from: isInitiated */
    protected volatile boolean f40242x376602e1 = false;

    /* renamed from: com.tencent.paymars.smc.SmcManager$BaseInfo */
    /* loaded from: classes12.dex */
    public static class BaseInfo {

        /* renamed from: deviceBrand */
        public java.lang.String f40244xa26fc2d1;

        /* renamed from: deviceModel */
        public java.lang.String f40245xa3097273;

        /* renamed from: languageVer */
        public java.lang.String f40246xb9e9dd2b;

        /* renamed from: osName */
        public java.lang.String f40247xc3e36a8f;

        /* renamed from: osVersion */
        public java.lang.String f40248x6c00fe54;
    }

    /* renamed from: com.tencent.paymars.smc.SmcManager$CallBack */
    /* loaded from: classes12.dex */
    public interface CallBack {
        /* renamed from: getKVCommPath */
        java.lang.String mo68455xb7d8cfb2();

        /* renamed from: getKVCommReqBaseInfo */
        com.p314xaae8f345.p2841xd11c237d.smc.C23035x1608f244.BaseInfo mo68456x3ae299b0();

        /* renamed from: getSingleReportBufSizeB */
        int mo68457x9deff5e0();

        /* renamed from: onReportDataReady */
        void mo68458xdaa0e966(byte[] bArr, byte[] bArr2, int i17, java.lang.String str);

        /* renamed from: onRequestGetStrategy */
        boolean mo68459x427a6719(byte[] bArr, int i17);

        /* renamed from: onSelfMonitorOpLogReady */
        boolean mo68460x4bfb482f(byte[] bArr);

        /* renamed from: parseKVPluginMsg */
        void mo68461x39af5590(java.lang.String str);
    }

    public C23035x1608f244(long j17) {
        m84482x484edc98(j17);
    }

    /* renamed from: OnJniCreateSmcManagerFromContext */
    public native void m84481xd0f8953f(java.lang.Object obj);

    /* renamed from: OnJniCreateSmcManagerFromHandle */
    public native void m84482x484edc98(long j17);

    /* renamed from: OnJniDestroySmcManager */
    public native void m84483x50e6d38();

    /* renamed from: OnJniFlushAllReportData */
    public native void m84484xc0e4dea1();

    /* renamed from: OnJniGetLoadLibraries */
    public native java.util.ArrayList<java.lang.String> m84485x6a0689e3();

    /* renamed from: OnJniGetStrategyVersions */
    public native java.util.ArrayList<java.lang.Integer> m84486xc9cdf9e();

    /* renamed from: OnJniOnCreate */
    public native void m84487xfcb4bb01();

    /* renamed from: OnJniOnPluginMsg */
    public native void m84488x1c0b7b29(long j17, long j18, long j19, long j27, long j28, long j29);

    /* renamed from: OnJniOnReportResp */
    public native void m84489xef95faa9(int i17, int i18, byte[] bArr, int i19);

    /* renamed from: OnJniOnStrategyResp */
    public native void m84490xcb144428(int i17, int i18, byte[] bArr, int i19);

    /* renamed from: OnJniReportIDKey */
    public native void m84491x79fc3d8a(long j17, long j18, long j19, boolean z17);

    /* renamed from: OnJniReportListIDKey */
    public native void m84492x9a94cc8c(com.p314xaae8f345.p2841xd11c237d.smc.C23031x424c344[] c23031x424c344Arr, boolean z17, boolean z18);

    /* renamed from: OnJniSetCallback */
    public native void m84493xf6496dc1(com.p314xaae8f345.p2841xd11c237d.smc.C23035x1608f244.CallBack callBack);

    /* renamed from: OnJniSetDebugFlag */
    public native void m84494x5450a63(boolean z17);

    /* renamed from: OnJniSetFreqLimitCount */
    public native void m84495x85e8af28(int i17);

    /* renamed from: OnJniSetMaxLogItemSize */
    public native void m84496xb9cd4d90(long j17);

    /* renamed from: OnJniSetMonitorId */
    public native void m84497xb1933a19(boolean z17, int i17, int i18, int i19, int i27, int i28, int i29);

    /* renamed from: OnJniSetTimeZone */
    public native void m84498x84be0995(int i17);

    /* renamed from: OnJniSetUin */
    public native void m84499xae80f95e(long j17);

    /* renamed from: OnJniUpdateFreqLimitConfig */
    public native void m84500x61b88bb6(java.lang.String str);

    /* renamed from: OnJniWriteImportKvData */
    public native void m84501x8cb9f4b3(long j17, java.lang.String str, boolean z17, boolean z18);

    /* renamed from: OnJniWriteImportKvDataWithType */
    public native void m84502x7527d6f3(long j17, long j18, java.lang.String str, boolean z17, boolean z18);

    /* renamed from: OnJniWriteImportKvPbData */
    public native void m84503x5a820f85(long j17, byte[] bArr, boolean z17);

    /* renamed from: OnJniWriteImportKvPbDataWithType */
    public native void m84504x8e58ffc5(long j17, long j18, byte[] bArr, boolean z17);

    /* renamed from: OnJniWriteKvData */
    public native void m84505xd088136e(long j17, java.lang.String str, boolean z17, boolean z18);

    /* renamed from: OnJniWriteKvDataWithIsolate */
    public native void m84506x969ac0b7(long j17, java.lang.String str, boolean z17, boolean z18, java.lang.String str2);

    /* renamed from: OnJniWriteKvDataWithType */
    public native void m84507x5df50aae(long j17, long j18, java.lang.String str, boolean z17, boolean z18);

    /* renamed from: OnJniWriteKvPbData */
    public native void m84508xe3436b80(long j17, byte[] bArr, boolean z17);

    /* renamed from: OnJniWriteKvPbDataWithType */
    public native void m84509x78a830c0(long j17, long j18, byte[] bArr, boolean z17);

    /* renamed from: OnPluginMsg */
    public void m84510xf57a740f(long j17, long j18, long j19, long j27, long j28, long j29) {
        m84488x1c0b7b29(j17, j18, j19, j27, j28, j29);
    }

    /* renamed from: OnReportResp */
    public void m84511x44061e83(int i17, int i18, byte[] bArr, int i19) {
        m84489xef95faa9(i17, i18, bArr, i19);
    }

    /* renamed from: OnStrategyResp */
    public void m84512xc40ad982(int i17, int i18, byte[] bArr, int i19) {
        m84490xcb144428(i17, i18, bArr, i19);
    }

    /* renamed from: SetDebugFlag */
    public void m84513x59b52e3d(boolean z17) {
        m84494x5450a63(z17);
    }

    /* renamed from: SetMaxLogItemSize */
    public void m84514xd8fb81f6(long j17) {
        m84496xb9cd4d90(j17);
    }

    /* renamed from: SetMonitorId */
    public void m84515x6035df3(boolean z17, int i17, int i18, int i19, int i27, int i28, int i29) {
        m84497xb1933a19(z17, i17, i18, i19, i27, i28, i29);
    }

    /* renamed from: flushAllReportData */
    public void m84516x19b97adb() {
        m84484xc0e4dea1();
    }

    /* renamed from: getCallBack */
    public com.p314xaae8f345.p2841xd11c237d.smc.C23035x1608f244.CallBack m84517x7187d1db() {
        return this.f40240x410b9fce;
    }

    /* renamed from: getLoadLibraries */
    public java.util.ArrayList<java.lang.String> m84518x31e8ec9d() {
        return m84485x6a0689e3();
    }

    @Override // com.p314xaae8f345.p2841xd11c237d.app.AbstractC23009x1e602b7c
    /* renamed from: getNativeHandle */
    public long mo84241xdc4f8f95() {
        return this.f40243x7b5cfd1f;
    }

    /* renamed from: getStrategyVersions */
    public java.util.ArrayList<java.lang.Integer> m84519xce5bcaa4() {
        return m84486xc9cdf9e();
    }

    /* renamed from: isInitiated */
    public boolean m84520x376602e1() {
        return this.f40242x376602e1;
    }

    /* renamed from: onCreate */
    public void m84521x3e5a77bb() {
        m84487xfcb4bb01();
    }

    /* renamed from: onDestroy */
    public void m84522xac79a11b() {
        m84483x50e6d38();
        this.f40243x7b5cfd1f = 0L;
        this.f40241x429972cd = 0L;
    }

    /* renamed from: reportIDKey */
    public void m84523xf0018e90(long j17, long j18, long j19, boolean z17) {
        m84491x79fc3d8a(j17, j18, j19, z17);
    }

    /* renamed from: reportListIDKey */
    public void m84524xfbde2a92(com.p314xaae8f345.p2841xd11c237d.smc.C23031x424c344[] c23031x424c344Arr, boolean z17, boolean z18) {
        m84492x9a94cc8c(c23031x424c344Arr, z17, z18);
    }

    /* renamed from: setCallback */
    public void m84525x6c4ebec7(com.p314xaae8f345.p2841xd11c237d.smc.C23035x1608f244.CallBack callBack) {
        this.f40240x410b9fce = callBack;
        m84493xf6496dc1(callBack);
    }

    /* renamed from: setFreqLimitCount */
    public void m84526xba52a3ae(int i17) {
        m84495x85e8af28(i17);
    }

    /* renamed from: setInitiated */
    public void m84527x4ce9f2a9(boolean z17) {
        this.f40242x376602e1 = z17;
    }

    /* renamed from: setTimeZone */
    public void m84528xfac35a9b(int i17) {
        m84498x84be0995(i17);
    }

    /* renamed from: setUin */
    public void m84529xca029c98(long j17) {
        m84499xae80f95e(j17);
    }

    /* renamed from: updateFreqLimitConfig */
    public void m84530xaf68cd3c(java.lang.String str) {
        m84500x61b88bb6(str);
    }

    /* renamed from: writeImportKvData */
    public void m84531xc123e939(long j17, java.lang.String str, boolean z17, boolean z18) {
        m84501x8cb9f4b3(j17, str, z17, z18);
    }

    /* renamed from: writeImportKvDataWithType */
    public void m84532x62fe579(long j17, long j18, java.lang.String str, boolean z17, boolean z18) {
        m84502x7527d6f3(j17, j18, str, z17, z18);
    }

    /* renamed from: writeImportKvPbData */
    public void m84533x1c40fa8b(long j17, byte[] bArr, boolean z17) {
        m84503x5a820f85(j17, bArr, z17);
    }

    /* renamed from: writeImportKvPbDataWithType */
    public void m84534xfd9784cb(long j17, long j18, byte[] bArr, boolean z17) {
        m84504x8e58ffc5(j17, j18, bArr, z17);
    }

    /* renamed from: writeKvData */
    public void m84535x468d6474(long j17, java.lang.String str, boolean z17, boolean z18) {
        m84505xd088136e(j17, str, z17, z18);
    }

    /* renamed from: writeKvDataWithIsolate */
    public void m84536xfef2aff1(long j17, java.lang.String str, boolean z17, boolean z18, java.lang.String str2) {
        m84506x969ac0b7(j17, str, z17, z18, str2);
    }

    /* renamed from: writeKvDataWithType */
    public void m84537x1fb3f5b4(long j17, long j18, java.lang.String str, boolean z17, boolean z18) {
        m84507x5df50aae(j17, j18, str, z17, z18);
    }

    /* renamed from: writeKvPbData */
    public void m84538xed389306(long j17, byte[] bArr, boolean z17) {
        m84508xe3436b80(j17, bArr, z17);
    }

    /* renamed from: writeKvPbDataWithType */
    public void m84539xc6587246(long j17, long j18, byte[] bArr, boolean z17) {
        m84509x78a830c0(j17, j18, bArr, z17);
    }

    public C23035x1608f244(com.p314xaae8f345.p2841xd11c237d.app.C23011x9befcd8f c23011x9befcd8f) {
        m84481xd0f8953f(c23011x9befcd8f);
    }
}
