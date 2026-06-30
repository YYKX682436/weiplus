package com.tencent.mars.smc;

/* loaded from: classes12.dex */
public class SmcManager extends com.tencent.mars.app.BaseManager {
    protected com.tencent.mars.smc.SmcManager.CallBack mCallBack;
    protected long nativeHandle = 0;
    protected long callbackHandle = 0;
    protected volatile boolean isInitiated = false;

    /* loaded from: classes12.dex */
    public static class BaseInfo {
        public java.lang.String deviceBrand;
        public java.lang.String deviceModel;
        public java.lang.String languageVer;
        public java.lang.String osName;
        public java.lang.String osVersion;
    }

    /* loaded from: classes12.dex */
    public interface CallBack {
        java.lang.String getKVCommPath();

        com.tencent.mars.smc.SmcManager.BaseInfo getKVCommReqBaseInfo();

        int getSingleReportBufSizeB();

        void onReportDataReady(byte[] bArr, byte[] bArr2, int i17, java.lang.String str);

        boolean onRequestGetStrategy(byte[] bArr, int i17);

        boolean onSelfMonitorOpLogReady(byte[] bArr);

        void parseKVPluginMsg(java.lang.String str);
    }

    public SmcManager(long j17) {
        OnJniCreateSmcManagerFromHandle(j17);
    }

    public native void OnJniCreateSmcManagerFromContext(java.lang.Object obj);

    public native void OnJniCreateSmcManagerFromHandle(long j17);

    public native void OnJniDestroySmcManager();

    public native void OnJniFlushAllReportData();

    public native java.util.ArrayList<java.lang.String> OnJniGetLoadLibraries();

    public native java.util.ArrayList<java.lang.Integer> OnJniGetStrategyVersions();

    public native void OnJniOnCreate();

    public native void OnJniOnPluginMsg(long j17, long j18, long j19, long j27, long j28, long j29);

    public native void OnJniOnReportResp(int i17, int i18, byte[] bArr, int i19);

    public native void OnJniOnStrategyResp(int i17, int i18, byte[] bArr, int i19);

    public native void OnJniReportIDKey(long j17, long j18, long j19, boolean z17);

    public native void OnJniReportListIDKey(com.tencent.mars.smc.IDKey[] iDKeyArr, boolean z17, boolean z18);

    public native void OnJniSetCallback(com.tencent.mars.smc.SmcManager.CallBack callBack);

    public native void OnJniSetDebugFlag(boolean z17);

    public native void OnJniSetFreqLimitCount(int i17);

    public native void OnJniSetMaxLogItemSize(long j17);

    public native void OnJniSetMonitorId(boolean z17, int i17, int i18, int i19, int i27, int i28, int i29);

    public native void OnJniSetTimeZone(int i17);

    public native void OnJniSetUin(long j17);

    public native void OnJniUpdateFreqLimitConfig(java.lang.String str);

    public native void OnJniWriteImportKvData(long j17, java.lang.String str, boolean z17, boolean z18);

    public native void OnJniWriteImportKvDataWithType(long j17, long j18, java.lang.String str, boolean z17, boolean z18);

    public native void OnJniWriteImportKvPbData(long j17, byte[] bArr, boolean z17);

    public native void OnJniWriteImportKvPbDataWithType(long j17, long j18, byte[] bArr, boolean z17);

    public native void OnJniWriteKvData(long j17, java.lang.String str, boolean z17, boolean z18);

    public native void OnJniWriteKvDataWithIsolate(long j17, java.lang.String str, boolean z17, boolean z18, java.lang.String str2);

    public native void OnJniWriteKvDataWithType(long j17, long j18, java.lang.String str, boolean z17, boolean z18);

    public native void OnJniWriteKvPbData(long j17, byte[] bArr, boolean z17);

    public native void OnJniWriteKvPbDataWithType(long j17, long j18, byte[] bArr, boolean z17);

    public void OnPluginMsg(long j17, long j18, long j19, long j27, long j28, long j29) {
        OnJniOnPluginMsg(j17, j18, j19, j27, j28, j29);
    }

    public void OnReportResp(int i17, int i18, byte[] bArr, int i19) {
        OnJniOnReportResp(i17, i18, bArr, i19);
    }

    public void OnStrategyResp(int i17, int i18, byte[] bArr, int i19) {
        OnJniOnStrategyResp(i17, i18, bArr, i19);
    }

    public void SetDebugFlag(boolean z17) {
        OnJniSetDebugFlag(z17);
    }

    public void SetMaxLogItemSize(long j17) {
        OnJniSetMaxLogItemSize(j17);
    }

    public void SetMonitorId(boolean z17, int i17, int i18, int i19, int i27, int i28, int i29) {
        OnJniSetMonitorId(z17, i17, i18, i19, i27, i28, i29);
    }

    public void flushAllReportData() {
        OnJniFlushAllReportData();
    }

    public com.tencent.mars.smc.SmcManager.CallBack getCallBack() {
        return this.mCallBack;
    }

    public java.util.ArrayList<java.lang.String> getLoadLibraries() {
        return OnJniGetLoadLibraries();
    }

    @Override // com.tencent.mars.app.BaseManager
    public long getNativeHandle() {
        return this.nativeHandle;
    }

    public java.util.ArrayList<java.lang.Integer> getStrategyVersions() {
        return OnJniGetStrategyVersions();
    }

    public boolean isInitiated() {
        return this.isInitiated;
    }

    public void onCreate() {
        OnJniOnCreate();
    }

    public void onDestroy() {
        OnJniDestroySmcManager();
        this.nativeHandle = 0L;
        this.callbackHandle = 0L;
    }

    public void reportIDKey(long j17, long j18, long j19, boolean z17) {
        OnJniReportIDKey(j17, j18, j19, z17);
    }

    public void reportListIDKey(com.tencent.mars.smc.IDKey[] iDKeyArr, boolean z17, boolean z18) {
        OnJniReportListIDKey(iDKeyArr, z17, z18);
    }

    public void setCallback(com.tencent.mars.smc.SmcManager.CallBack callBack) {
        this.mCallBack = callBack;
        OnJniSetCallback(callBack);
    }

    public void setFreqLimitCount(int i17) {
        OnJniSetFreqLimitCount(i17);
    }

    public void setInitiated(boolean z17) {
        this.isInitiated = z17;
    }

    public void setTimeZone(int i17) {
        OnJniSetTimeZone(i17);
    }

    public void setUin(long j17) {
        OnJniSetUin(j17);
    }

    public void updateFreqLimitConfig(java.lang.String str) {
        OnJniUpdateFreqLimitConfig(str);
    }

    public void writeImportKvData(long j17, java.lang.String str, boolean z17, boolean z18) {
        OnJniWriteImportKvData(j17, str, z17, z18);
    }

    public void writeImportKvDataWithType(long j17, long j18, java.lang.String str, boolean z17, boolean z18) {
        OnJniWriteImportKvDataWithType(j17, j18, str, z17, z18);
    }

    public void writeImportKvPbData(long j17, byte[] bArr, boolean z17) {
        OnJniWriteImportKvPbData(j17, bArr, z17);
    }

    public void writeImportKvPbDataWithType(long j17, long j18, byte[] bArr, boolean z17) {
        OnJniWriteImportKvPbDataWithType(j17, j18, bArr, z17);
    }

    public void writeKvData(long j17, java.lang.String str, boolean z17, boolean z18) {
        OnJniWriteKvData(j17, str, z17, z18);
    }

    public void writeKvDataWithIsolate(long j17, java.lang.String str, boolean z17, boolean z18, java.lang.String str2) {
        OnJniWriteKvDataWithIsolate(j17, str, z17, z18, str2);
    }

    public void writeKvDataWithType(long j17, long j18, java.lang.String str, boolean z17, boolean z18) {
        OnJniWriteKvDataWithType(j17, j18, str, z17, z18);
    }

    public void writeKvPbData(long j17, byte[] bArr, boolean z17) {
        OnJniWriteKvPbData(j17, bArr, z17);
    }

    public void writeKvPbDataWithType(long j17, long j18, byte[] bArr, boolean z17) {
        OnJniWriteKvPbDataWithType(j17, j18, bArr, z17);
    }

    public SmcManager(com.tencent.mars.app.Context context) {
        OnJniCreateSmcManagerFromContext(context);
    }
}
