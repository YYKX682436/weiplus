package com.tencent.mm.plugin.appbrand.debugger.console;

/* loaded from: classes12.dex */
public abstract class s0 implements com.tencent.mars.xlog.Log.LogImp {
    @Override // com.tencent.mars.xlog.Log.LogImp
    public void appenderClose() {
    }

    @Override // com.tencent.mars.xlog.Log.LogImp
    public void appenderFlush(long j17, boolean z17) {
    }

    @Override // com.tencent.mars.xlog.Log.LogImp
    public void appenderOpen(int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, int i19) {
    }

    @Override // com.tencent.mars.xlog.Log.LogImp
    public int getLogLevel(long j17) {
        return 0;
    }

    @Override // com.tencent.mars.xlog.Log.LogImp
    public long getNativeLogLevelFunc() {
        return 0L;
    }

    @Override // com.tencent.mars.xlog.Log.LogImp
    public long getNativeWriteLogFunc() {
        return 0L;
    }

    @Override // com.tencent.mars.xlog.Log.LogImp
    public long getXlogInstance(java.lang.String str) {
        return 0L;
    }

    @Override // com.tencent.mars.xlog.Log.LogImp
    public void logF(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, long j18, long j19, java.lang.String str4) {
    }

    @Override // com.tencent.mars.xlog.Log.LogImp
    public void moveLogsFromCacheDirToLogDir() {
    }

    @Override // com.tencent.mars.xlog.Log.LogImp
    public long openLogInstance(int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, int i19) {
        return 0L;
    }

    @Override // com.tencent.mars.xlog.Log.LogImp
    public void releaseXlogInstance(java.lang.String str) {
    }

    @Override // com.tencent.mars.xlog.Log.LogImp
    public void setAppenderMode(long j17, int i17) {
    }

    @Override // com.tencent.mars.xlog.Log.LogImp
    public void setConsoleLogOpen(long j17, boolean z17) {
    }

    @Override // com.tencent.mars.xlog.Log.LogImp
    public void setMaxAliveTime(long j17, long j18) {
    }

    @Override // com.tencent.mars.xlog.Log.LogImp
    public void setMaxFileSize(long j17, long j18) {
    }
}
