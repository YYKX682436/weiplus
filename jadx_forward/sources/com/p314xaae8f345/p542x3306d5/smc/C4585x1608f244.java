package com.p314xaae8f345.p542x3306d5.smc;

/* renamed from: com.tencent.mars.smc.SmcManager */
/* loaded from: classes12.dex */
public class C4585x1608f244 extends com.p314xaae8f345.p542x3306d5.app.AbstractC4441x1e602b7c {

    /* renamed from: mCallBack */
    protected com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244.CallBack f19538x1aab3bf2;

    /* renamed from: nativeHandle */
    protected long f19539x7b5cfd1f = 0;

    /* renamed from: callbackHandle */
    protected long f19536x429972cd = 0;

    /* renamed from: isInitiated */
    protected volatile boolean f19537x376602e1 = false;

    /* renamed from: com.tencent.mars.smc.SmcManager$BaseInfo */
    /* loaded from: classes12.dex */
    public static class BaseInfo {

        /* renamed from: deviceBrand */
        public java.lang.String f19540xa26fc2d1;

        /* renamed from: deviceModel */
        public java.lang.String f19541xa3097273;

        /* renamed from: languageVer */
        public java.lang.String f19542xb9e9dd2b;

        /* renamed from: osName */
        public java.lang.String f19543xc3e36a8f;

        /* renamed from: osVersion */
        public java.lang.String f19544x6c00fe54;
    }

    /* renamed from: com.tencent.mars.smc.SmcManager$CallBack */
    /* loaded from: classes12.dex */
    public interface CallBack {
        /* renamed from: getKVCommPath */
        java.lang.String mo40398xb7d8cfb2();

        /* renamed from: getKVCommReqBaseInfo */
        com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244.BaseInfo mo40399x3ae299b0();

        /* renamed from: getSingleReportBufSizeB */
        int mo40400x9deff5e0();

        /* renamed from: onReportDataReady */
        void mo40401xdaa0e966(byte[] bArr, byte[] bArr2, int i17, java.lang.String str);

        /* renamed from: onRequestGetStrategy */
        boolean mo40402x427a6719(byte[] bArr, int i17);

        /* renamed from: onSelfMonitorOpLogReady */
        boolean mo40403x4bfb482f(byte[] bArr);

        /* renamed from: parseKVPluginMsg */
        void mo40404x39af5590(java.lang.String str);
    }

    public C4585x1608f244(long j17) {
        m40340x484edc98(j17);
    }

    /* renamed from: OnJniCreateSmcManagerFromContext */
    public native void m40339xd0f8953f(java.lang.Object obj);

    /* renamed from: OnJniCreateSmcManagerFromHandle */
    public native void m40340x484edc98(long j17);

    /* renamed from: OnJniDestroySmcManager */
    public native void m40341x50e6d38();

    /* renamed from: OnJniFlushAllReportData */
    public native void m40342xc0e4dea1();

    /* renamed from: OnJniGetLoadLibraries */
    public native java.util.ArrayList<java.lang.String> m40343x6a0689e3();

    /* renamed from: OnJniGetStrategyVersions */
    public native java.util.ArrayList<java.lang.Integer> m40344xc9cdf9e();

    /* renamed from: OnJniOnCreate */
    public native void m40345xfcb4bb01();

    /* renamed from: OnJniOnPluginMsg */
    public native void m40346x1c0b7b29(long j17, long j18, long j19, long j27, long j28, long j29);

    /* renamed from: OnJniOnReportResp */
    public native void m40347xef95faa9(int i17, int i18, byte[] bArr, int i19);

    /* renamed from: OnJniOnStrategyResp */
    public native void m40348xcb144428(int i17, int i18, byte[] bArr, int i19);

    /* renamed from: OnJniReportIDKey */
    public native void m40349x79fc3d8a(long j17, long j18, long j19, boolean z17);

    /* renamed from: OnJniReportListIDKey */
    public native void m40350x9a94cc8c(com.p314xaae8f345.p542x3306d5.smc.C4582x424c344[] c4582x424c344Arr, boolean z17, boolean z18);

    /* renamed from: OnJniSetCallback */
    public native void m40351xf6496dc1(com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244.CallBack callBack);

    /* renamed from: OnJniSetDebugFlag */
    public native void m40352x5450a63(boolean z17);

    /* renamed from: OnJniSetFreqLimitCount */
    public native void m40353x85e8af28(int i17);

    /* renamed from: OnJniSetMaxLogItemSize */
    public native void m40354xb9cd4d90(long j17);

    /* renamed from: OnJniSetMonitorId */
    public native void m40355xb1933a19(boolean z17, int i17, int i18, int i19, int i27, int i28, int i29);

    /* renamed from: OnJniSetTimeZone */
    public native void m40356x84be0995(int i17);

    /* renamed from: OnJniSetUin */
    public native void m40357xae80f95e(long j17);

    /* renamed from: OnJniUpdateFreqLimitConfig */
    public native void m40358x61b88bb6(java.lang.String str);

    /* renamed from: OnJniWriteImportKvData */
    public native void m40359x8cb9f4b3(long j17, java.lang.String str, boolean z17, boolean z18);

    /* renamed from: OnJniWriteImportKvDataWithType */
    public native void m40360x7527d6f3(long j17, long j18, java.lang.String str, boolean z17, boolean z18);

    /* renamed from: OnJniWriteImportKvPbData */
    public native void m40361x5a820f85(long j17, byte[] bArr, boolean z17);

    /* renamed from: OnJniWriteImportKvPbDataWithType */
    public native void m40362x8e58ffc5(long j17, long j18, byte[] bArr, boolean z17);

    /* renamed from: OnJniWriteKvData */
    public native void m40363xd088136e(long j17, java.lang.String str, boolean z17, boolean z18);

    /* renamed from: OnJniWriteKvDataWithIsolate */
    public native void m40364x969ac0b7(long j17, java.lang.String str, boolean z17, boolean z18, java.lang.String str2);

    /* renamed from: OnJniWriteKvDataWithType */
    public native void m40365x5df50aae(long j17, long j18, java.lang.String str, boolean z17, boolean z18);

    /* renamed from: OnJniWriteKvPbData */
    public native void m40366xe3436b80(long j17, byte[] bArr, boolean z17);

    /* renamed from: OnJniWriteKvPbDataWithType */
    public native void m40367x78a830c0(long j17, long j18, byte[] bArr, boolean z17);

    /* renamed from: OnPluginMsg */
    public void m40368xf57a740f(long j17, long j18, long j19, long j27, long j28, long j29) {
        m40346x1c0b7b29(j17, j18, j19, j27, j28, j29);
    }

    /* renamed from: OnReportResp */
    public void m40369x44061e83(int i17, int i18, byte[] bArr, int i19) {
        m40347xef95faa9(i17, i18, bArr, i19);
    }

    /* renamed from: OnStrategyResp */
    public void m40370xc40ad982(int i17, int i18, byte[] bArr, int i19) {
        m40348xcb144428(i17, i18, bArr, i19);
    }

    /* renamed from: SetDebugFlag */
    public void m40371x59b52e3d(boolean z17) {
        m40352x5450a63(z17);
    }

    /* renamed from: SetMaxLogItemSize */
    public void m40372xd8fb81f6(long j17) {
        m40354xb9cd4d90(j17);
    }

    /* renamed from: SetMonitorId */
    public void m40373x6035df3(boolean z17, int i17, int i18, int i19, int i27, int i28, int i29) {
        m40355xb1933a19(z17, i17, i18, i19, i27, i28, i29);
    }

    /* renamed from: flushAllReportData */
    public void m40374x19b97adb() {
        m40342xc0e4dea1();
    }

    /* renamed from: getCallBack */
    public com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244.CallBack m40375x7187d1db() {
        return this.f19538x1aab3bf2;
    }

    /* renamed from: getLoadLibraries */
    public java.util.ArrayList<java.lang.String> m40376x31e8ec9d() {
        return m40343x6a0689e3();
    }

    @Override // com.p314xaae8f345.p542x3306d5.app.AbstractC4441x1e602b7c
    /* renamed from: getNativeHandle */
    public long mo37556xdc4f8f95() {
        return this.f19539x7b5cfd1f;
    }

    /* renamed from: getStrategyVersions */
    public java.util.ArrayList<java.lang.Integer> m40377xce5bcaa4() {
        return m40344xc9cdf9e();
    }

    /* renamed from: isInitiated */
    public boolean m40378x376602e1() {
        return this.f19537x376602e1;
    }

    /* renamed from: onCreate */
    public void m40379x3e5a77bb() {
        m40345xfcb4bb01();
    }

    /* renamed from: onDestroy */
    public void m40380xac79a11b() {
        m40341x50e6d38();
        this.f19539x7b5cfd1f = 0L;
        this.f19536x429972cd = 0L;
    }

    /* renamed from: reportIDKey */
    public void m40381xf0018e90(long j17, long j18, long j19, boolean z17) {
        m40349x79fc3d8a(j17, j18, j19, z17);
    }

    /* renamed from: reportListIDKey */
    public void m40382xfbde2a92(com.p314xaae8f345.p542x3306d5.smc.C4582x424c344[] c4582x424c344Arr, boolean z17, boolean z18) {
        m40350x9a94cc8c(c4582x424c344Arr, z17, z18);
    }

    /* renamed from: setCallback */
    public void m40383x6c4ebec7(com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244.CallBack callBack) {
        this.f19538x1aab3bf2 = callBack;
        m40351xf6496dc1(callBack);
    }

    /* renamed from: setFreqLimitCount */
    public void m40384xba52a3ae(int i17) {
        m40353x85e8af28(i17);
    }

    /* renamed from: setInitiated */
    public void m40385x4ce9f2a9(boolean z17) {
        this.f19537x376602e1 = z17;
    }

    /* renamed from: setTimeZone */
    public void m40386xfac35a9b(int i17) {
        m40356x84be0995(i17);
    }

    /* renamed from: setUin */
    public void m40387xca029c98(long j17) {
        m40357xae80f95e(j17);
    }

    /* renamed from: updateFreqLimitConfig */
    public void m40388xaf68cd3c(java.lang.String str) {
        m40358x61b88bb6(str);
    }

    /* renamed from: writeImportKvData */
    public void m40389xc123e939(long j17, java.lang.String str, boolean z17, boolean z18) {
        m40359x8cb9f4b3(j17, str, z17, z18);
    }

    /* renamed from: writeImportKvDataWithType */
    public void m40390x62fe579(long j17, long j18, java.lang.String str, boolean z17, boolean z18) {
        m40360x7527d6f3(j17, j18, str, z17, z18);
    }

    /* renamed from: writeImportKvPbData */
    public void m40391x1c40fa8b(long j17, byte[] bArr, boolean z17) {
        m40361x5a820f85(j17, bArr, z17);
    }

    /* renamed from: writeImportKvPbDataWithType */
    public void m40392xfd9784cb(long j17, long j18, byte[] bArr, boolean z17) {
        m40362x8e58ffc5(j17, j18, bArr, z17);
    }

    /* renamed from: writeKvData */
    public void m40393x468d6474(long j17, java.lang.String str, boolean z17, boolean z18) {
        m40363xd088136e(j17, str, z17, z18);
    }

    /* renamed from: writeKvDataWithIsolate */
    public void m40394xfef2aff1(long j17, java.lang.String str, boolean z17, boolean z18, java.lang.String str2) {
        m40364x969ac0b7(j17, str, z17, z18, str2);
    }

    /* renamed from: writeKvDataWithType */
    public void m40395x1fb3f5b4(long j17, long j18, java.lang.String str, boolean z17, boolean z18) {
        m40365x5df50aae(j17, j18, str, z17, z18);
    }

    /* renamed from: writeKvPbData */
    public void m40396xed389306(long j17, byte[] bArr, boolean z17) {
        m40366xe3436b80(j17, bArr, z17);
    }

    /* renamed from: writeKvPbDataWithType */
    public void m40397xc6587246(long j17, long j18, byte[] bArr, boolean z17) {
        m40367x78a830c0(j17, j18, bArr, z17);
    }

    public C4585x1608f244(com.p314xaae8f345.p542x3306d5.app.C4443x9befcd8f c4443x9befcd8f) {
        m40339xd0f8953f(c4443x9befcd8f);
    }
}
