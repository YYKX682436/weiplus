package com.tencent.liteapp.gen;

/* loaded from: classes15.dex */
public abstract class LiteAppReporter {

    /* loaded from: classes15.dex */
    public static final class CppProxy extends com.tencent.liteapp.gen.LiteAppReporter {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final java.util.concurrent.atomic.AtomicBoolean destroyed = new java.util.concurrent.atomic.AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j17) {
            if (j17 == 0) {
                throw new java.lang.RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j17;
        }

        private native void nativeDestroy(long j17);

        private native java.lang.String native_getAppId(long j17);

        private native com.tencent.liteapp.gen.LiteAppOpenScene native_getScene(long j17);

        private native java.lang.String native_getSessionId(long j17);

        private native java.lang.String native_getVersion(long j17);

        private native boolean native_isSampling(long j17);

        private native boolean native_isTemporarySample(long j17);

        private native void native_logDownload(long j17, com.tencent.liteapp.gen.DownloadAction downloadAction);

        private native void native_logDownload(long j17, com.tencent.liteapp.gen.DownloadAction downloadAction, long j18);

        private native void native_logDownload(long j17, com.tencent.liteapp.gen.DownloadAction downloadAction, long j18, java.util.HashMap<java.lang.String, java.lang.String> hashMap);

        private native void native_logDownload(long j17, com.tencent.liteapp.gen.DownloadAction downloadAction, java.lang.String str);

        private native void native_logDownload(long j17, com.tencent.liteapp.gen.DownloadAction downloadAction, java.lang.String str, long j18);

        private native void native_logDownload(long j17, com.tencent.liteapp.gen.DownloadAction downloadAction, java.lang.String str, java.util.HashMap<java.lang.String, java.lang.String> hashMap);

        private native void native_logDownload(long j17, com.tencent.liteapp.gen.DownloadAction downloadAction, java.util.HashMap<java.lang.String, java.lang.String> hashMap);

        private native void native_logDownloadWithExpandDimension1(long j17, com.tencent.liteapp.gen.DownloadAction downloadAction, java.lang.String str);

        private native void native_logDownloadWithUri(long j17, com.tencent.liteapp.gen.DownloadAction downloadAction, java.lang.String str);

        private native void native_logOther(long j17, com.tencent.liteapp.gen.OtherAction otherAction);

        private native void native_logOther(long j17, com.tencent.liteapp.gen.OtherAction otherAction, long j18);

        private native void native_logOther(long j17, com.tencent.liteapp.gen.OtherAction otherAction, long j18, java.util.HashMap<java.lang.String, java.lang.String> hashMap);

        private native void native_logOther(long j17, com.tencent.liteapp.gen.OtherAction otherAction, java.lang.String str);

        private native void native_logOther(long j17, com.tencent.liteapp.gen.OtherAction otherAction, java.lang.String str, long j18);

        private native void native_logOther(long j17, com.tencent.liteapp.gen.OtherAction otherAction, java.lang.String str, java.util.HashMap<java.lang.String, java.lang.String> hashMap);

        private native void native_logOther(long j17, com.tencent.liteapp.gen.OtherAction otherAction, java.util.HashMap<java.lang.String, java.lang.String> hashMap);

        private native void native_logOtherWithExpandDimension1(long j17, com.tencent.liteapp.gen.OtherAction otherAction, java.lang.String str);

        private native void native_logOtherWithUri(long j17, com.tencent.liteapp.gen.OtherAction otherAction, java.lang.String str);

        private native void native_logPerf(long j17, java.lang.String str, boolean z17);

        private native void native_logPerf(long j17, java.lang.String str, boolean z17, java.util.HashMap<java.lang.String, java.lang.String> hashMap);

        private native void native_logRunning(long j17, com.tencent.liteapp.gen.RunningAction runningAction);

        private native void native_logRunning(long j17, com.tencent.liteapp.gen.RunningAction runningAction, long j18);

        private native void native_logRunning(long j17, com.tencent.liteapp.gen.RunningAction runningAction, long j18, java.util.HashMap<java.lang.String, java.lang.String> hashMap);

        private native void native_logRunning(long j17, com.tencent.liteapp.gen.RunningAction runningAction, java.lang.String str);

        private native void native_logRunning(long j17, com.tencent.liteapp.gen.RunningAction runningAction, java.lang.String str, long j18);

        private native void native_logRunning(long j17, com.tencent.liteapp.gen.RunningAction runningAction, java.lang.String str, java.util.HashMap<java.lang.String, java.lang.String> hashMap);

        private native void native_logRunning(long j17, com.tencent.liteapp.gen.RunningAction runningAction, java.util.HashMap<java.lang.String, java.lang.String> hashMap);

        private native void native_logRunningWithExpandDimension1(long j17, com.tencent.liteapp.gen.RunningAction runningAction, java.lang.String str);

        private native void native_logRunningWithUri(long j17, com.tencent.liteapp.gen.RunningAction runningAction, java.lang.String str);

        private native void native_logStart(long j17, com.tencent.liteapp.gen.StartAction startAction);

        private native void native_logStart(long j17, com.tencent.liteapp.gen.StartAction startAction, long j18);

        private native void native_logStart(long j17, com.tencent.liteapp.gen.StartAction startAction, long j18, java.util.HashMap<java.lang.String, java.lang.String> hashMap);

        private native void native_logStart(long j17, com.tencent.liteapp.gen.StartAction startAction, java.lang.String str);

        private native void native_logStart(long j17, com.tencent.liteapp.gen.StartAction startAction, java.lang.String str, long j18);

        private native void native_logStart(long j17, com.tencent.liteapp.gen.StartAction startAction, java.lang.String str, java.util.HashMap<java.lang.String, java.lang.String> hashMap);

        private native void native_logStart(long j17, com.tencent.liteapp.gen.StartAction startAction, java.util.HashMap<java.lang.String, java.lang.String> hashMap);

        private native void native_logStartWithExpandDimension1(long j17, com.tencent.liteapp.gen.StartAction startAction, java.lang.String str);

        private native void native_logStartWithUri(long j17, com.tencent.liteapp.gen.StartAction startAction, java.lang.String str);

        private native void native_report(long j17, com.tencent.liteapp.gen.LiteAppReportData liteAppReportData);

        private native void native_setAppId(long j17, java.lang.String str);

        private native void native_setScene(long j17, com.tencent.liteapp.gen.LiteAppOpenScene liteAppOpenScene);

        private native void native_setVersion(long j17, java.lang.String str);

        public void destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        public void finalize() {
            destroy();
            super.finalize();
        }

        @Override // com.tencent.liteapp.gen.LiteAppReporter
        public java.lang.String getAppId() {
            return native_getAppId(this.nativeRef);
        }

        @Override // com.tencent.liteapp.gen.LiteAppReporter
        public com.tencent.liteapp.gen.LiteAppOpenScene getScene() {
            return native_getScene(this.nativeRef);
        }

        @Override // com.tencent.liteapp.gen.LiteAppReporter
        public java.lang.String getSessionId() {
            return native_getSessionId(this.nativeRef);
        }

        @Override // com.tencent.liteapp.gen.LiteAppReporter
        public java.lang.String getVersion() {
            return native_getVersion(this.nativeRef);
        }

        @Override // com.tencent.liteapp.gen.LiteAppReporter
        public boolean isSampling() {
            return native_isSampling(this.nativeRef);
        }

        @Override // com.tencent.liteapp.gen.LiteAppReporter
        public boolean isTemporarySample() {
            return native_isTemporarySample(this.nativeRef);
        }

        @Override // com.tencent.liteapp.gen.LiteAppReporter
        public void logDownload(com.tencent.liteapp.gen.DownloadAction downloadAction) {
            native_logDownload(this.nativeRef, downloadAction);
        }

        @Override // com.tencent.liteapp.gen.LiteAppReporter
        public void logDownloadWithExpandDimension1(com.tencent.liteapp.gen.DownloadAction downloadAction, java.lang.String str) {
            native_logDownloadWithExpandDimension1(this.nativeRef, downloadAction, str);
        }

        @Override // com.tencent.liteapp.gen.LiteAppReporter
        public void logDownloadWithUri(com.tencent.liteapp.gen.DownloadAction downloadAction, java.lang.String str) {
            native_logDownloadWithUri(this.nativeRef, downloadAction, str);
        }

        @Override // com.tencent.liteapp.gen.LiteAppReporter
        public void logOther(com.tencent.liteapp.gen.OtherAction otherAction) {
            native_logOther(this.nativeRef, otherAction);
        }

        @Override // com.tencent.liteapp.gen.LiteAppReporter
        public void logOtherWithExpandDimension1(com.tencent.liteapp.gen.OtherAction otherAction, java.lang.String str) {
            native_logOtherWithExpandDimension1(this.nativeRef, otherAction, str);
        }

        @Override // com.tencent.liteapp.gen.LiteAppReporter
        public void logOtherWithUri(com.tencent.liteapp.gen.OtherAction otherAction, java.lang.String str) {
            native_logOtherWithUri(this.nativeRef, otherAction, str);
        }

        @Override // com.tencent.liteapp.gen.LiteAppReporter
        public void logPerf(java.lang.String str, boolean z17) {
            native_logPerf(this.nativeRef, str, z17);
        }

        @Override // com.tencent.liteapp.gen.LiteAppReporter
        public void logRunning(com.tencent.liteapp.gen.RunningAction runningAction) {
            native_logRunning(this.nativeRef, runningAction);
        }

        @Override // com.tencent.liteapp.gen.LiteAppReporter
        public void logRunningWithExpandDimension1(com.tencent.liteapp.gen.RunningAction runningAction, java.lang.String str) {
            native_logRunningWithExpandDimension1(this.nativeRef, runningAction, str);
        }

        @Override // com.tencent.liteapp.gen.LiteAppReporter
        public void logRunningWithUri(com.tencent.liteapp.gen.RunningAction runningAction, java.lang.String str) {
            native_logRunningWithUri(this.nativeRef, runningAction, str);
        }

        @Override // com.tencent.liteapp.gen.LiteAppReporter
        public void logStart(com.tencent.liteapp.gen.StartAction startAction) {
            native_logStart(this.nativeRef, startAction);
        }

        @Override // com.tencent.liteapp.gen.LiteAppReporter
        public void logStartWithExpandDimension1(com.tencent.liteapp.gen.StartAction startAction, java.lang.String str) {
            native_logStartWithExpandDimension1(this.nativeRef, startAction, str);
        }

        @Override // com.tencent.liteapp.gen.LiteAppReporter
        public void logStartWithUri(com.tencent.liteapp.gen.StartAction startAction, java.lang.String str) {
            native_logStartWithUri(this.nativeRef, startAction, str);
        }

        @Override // com.tencent.liteapp.gen.LiteAppReporter
        public void report(com.tencent.liteapp.gen.LiteAppReportData liteAppReportData) {
            native_report(this.nativeRef, liteAppReportData);
        }

        @Override // com.tencent.liteapp.gen.LiteAppReporter
        public void setAppId(java.lang.String str) {
            native_setAppId(this.nativeRef, str);
        }

        @Override // com.tencent.liteapp.gen.LiteAppReporter
        public void setScene(com.tencent.liteapp.gen.LiteAppOpenScene liteAppOpenScene) {
            native_setScene(this.nativeRef, liteAppOpenScene);
        }

        @Override // com.tencent.liteapp.gen.LiteAppReporter
        public void setVersion(java.lang.String str) {
            native_setVersion(this.nativeRef, str);
        }

        @Override // com.tencent.liteapp.gen.LiteAppReporter
        public void logDownload(com.tencent.liteapp.gen.DownloadAction downloadAction, long j17) {
            native_logDownload(this.nativeRef, downloadAction, j17);
        }

        @Override // com.tencent.liteapp.gen.LiteAppReporter
        public void logOther(com.tencent.liteapp.gen.OtherAction otherAction, long j17) {
            native_logOther(this.nativeRef, otherAction, j17);
        }

        @Override // com.tencent.liteapp.gen.LiteAppReporter
        public void logPerf(java.lang.String str, boolean z17, java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
            native_logPerf(this.nativeRef, str, z17, hashMap);
        }

        @Override // com.tencent.liteapp.gen.LiteAppReporter
        public void logRunning(com.tencent.liteapp.gen.RunningAction runningAction, long j17) {
            native_logRunning(this.nativeRef, runningAction, j17);
        }

        @Override // com.tencent.liteapp.gen.LiteAppReporter
        public void logStart(com.tencent.liteapp.gen.StartAction startAction, long j17) {
            native_logStart(this.nativeRef, startAction, j17);
        }

        @Override // com.tencent.liteapp.gen.LiteAppReporter
        public void logDownload(com.tencent.liteapp.gen.DownloadAction downloadAction, java.lang.String str) {
            native_logDownload(this.nativeRef, downloadAction, str);
        }

        @Override // com.tencent.liteapp.gen.LiteAppReporter
        public void logOther(com.tencent.liteapp.gen.OtherAction otherAction, java.lang.String str) {
            native_logOther(this.nativeRef, otherAction, str);
        }

        @Override // com.tencent.liteapp.gen.LiteAppReporter
        public void logRunning(com.tencent.liteapp.gen.RunningAction runningAction, java.lang.String str) {
            native_logRunning(this.nativeRef, runningAction, str);
        }

        @Override // com.tencent.liteapp.gen.LiteAppReporter
        public void logStart(com.tencent.liteapp.gen.StartAction startAction, java.lang.String str) {
            native_logStart(this.nativeRef, startAction, str);
        }

        @Override // com.tencent.liteapp.gen.LiteAppReporter
        public void logDownload(com.tencent.liteapp.gen.DownloadAction downloadAction, java.lang.String str, long j17) {
            native_logDownload(this.nativeRef, downloadAction, str, j17);
        }

        @Override // com.tencent.liteapp.gen.LiteAppReporter
        public void logOther(com.tencent.liteapp.gen.OtherAction otherAction, java.lang.String str, long j17) {
            native_logOther(this.nativeRef, otherAction, str, j17);
        }

        @Override // com.tencent.liteapp.gen.LiteAppReporter
        public void logRunning(com.tencent.liteapp.gen.RunningAction runningAction, java.lang.String str, long j17) {
            native_logRunning(this.nativeRef, runningAction, str, j17);
        }

        @Override // com.tencent.liteapp.gen.LiteAppReporter
        public void logStart(com.tencent.liteapp.gen.StartAction startAction, java.lang.String str, long j17) {
            native_logStart(this.nativeRef, startAction, str, j17);
        }

        @Override // com.tencent.liteapp.gen.LiteAppReporter
        public void logDownload(com.tencent.liteapp.gen.DownloadAction downloadAction, java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
            native_logDownload(this.nativeRef, downloadAction, hashMap);
        }

        @Override // com.tencent.liteapp.gen.LiteAppReporter
        public void logOther(com.tencent.liteapp.gen.OtherAction otherAction, java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
            native_logOther(this.nativeRef, otherAction, hashMap);
        }

        @Override // com.tencent.liteapp.gen.LiteAppReporter
        public void logRunning(com.tencent.liteapp.gen.RunningAction runningAction, java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
            native_logRunning(this.nativeRef, runningAction, hashMap);
        }

        @Override // com.tencent.liteapp.gen.LiteAppReporter
        public void logStart(com.tencent.liteapp.gen.StartAction startAction, java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
            native_logStart(this.nativeRef, startAction, hashMap);
        }

        @Override // com.tencent.liteapp.gen.LiteAppReporter
        public void logDownload(com.tencent.liteapp.gen.DownloadAction downloadAction, long j17, java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
            native_logDownload(this.nativeRef, downloadAction, j17, hashMap);
        }

        @Override // com.tencent.liteapp.gen.LiteAppReporter
        public void logOther(com.tencent.liteapp.gen.OtherAction otherAction, long j17, java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
            native_logOther(this.nativeRef, otherAction, j17, hashMap);
        }

        @Override // com.tencent.liteapp.gen.LiteAppReporter
        public void logRunning(com.tencent.liteapp.gen.RunningAction runningAction, long j17, java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
            native_logRunning(this.nativeRef, runningAction, j17, hashMap);
        }

        @Override // com.tencent.liteapp.gen.LiteAppReporter
        public void logStart(com.tencent.liteapp.gen.StartAction startAction, long j17, java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
            native_logStart(this.nativeRef, startAction, j17, hashMap);
        }

        @Override // com.tencent.liteapp.gen.LiteAppReporter
        public void logDownload(com.tencent.liteapp.gen.DownloadAction downloadAction, java.lang.String str, java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
            native_logDownload(this.nativeRef, downloadAction, str, hashMap);
        }

        @Override // com.tencent.liteapp.gen.LiteAppReporter
        public void logOther(com.tencent.liteapp.gen.OtherAction otherAction, java.lang.String str, java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
            native_logOther(this.nativeRef, otherAction, str, hashMap);
        }

        @Override // com.tencent.liteapp.gen.LiteAppReporter
        public void logRunning(com.tencent.liteapp.gen.RunningAction runningAction, java.lang.String str, java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
            native_logRunning(this.nativeRef, runningAction, str, hashMap);
        }

        @Override // com.tencent.liteapp.gen.LiteAppReporter
        public void logStart(com.tencent.liteapp.gen.StartAction startAction, java.lang.String str, java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
            native_logStart(this.nativeRef, startAction, str, hashMap);
        }
    }

    public static native com.tencent.liteapp.gen.LiteAppReporter create(java.lang.String str, com.tencent.liteapp.gen.LiteAppReporterDependency liteAppReporterDependency, java.lang.String str2);

    public abstract java.lang.String getAppId();

    public abstract com.tencent.liteapp.gen.LiteAppOpenScene getScene();

    public abstract java.lang.String getSessionId();

    public abstract java.lang.String getVersion();

    public abstract boolean isSampling();

    public abstract boolean isTemporarySample();

    public abstract void logDownload(com.tencent.liteapp.gen.DownloadAction downloadAction);

    public abstract void logDownload(com.tencent.liteapp.gen.DownloadAction downloadAction, long j17);

    public abstract void logDownload(com.tencent.liteapp.gen.DownloadAction downloadAction, long j17, java.util.HashMap<java.lang.String, java.lang.String> hashMap);

    public abstract void logDownload(com.tencent.liteapp.gen.DownloadAction downloadAction, java.lang.String str);

    public abstract void logDownload(com.tencent.liteapp.gen.DownloadAction downloadAction, java.lang.String str, long j17);

    public abstract void logDownload(com.tencent.liteapp.gen.DownloadAction downloadAction, java.lang.String str, java.util.HashMap<java.lang.String, java.lang.String> hashMap);

    public abstract void logDownload(com.tencent.liteapp.gen.DownloadAction downloadAction, java.util.HashMap<java.lang.String, java.lang.String> hashMap);

    public abstract void logDownloadWithExpandDimension1(com.tencent.liteapp.gen.DownloadAction downloadAction, java.lang.String str);

    public abstract void logDownloadWithUri(com.tencent.liteapp.gen.DownloadAction downloadAction, java.lang.String str);

    public abstract void logOther(com.tencent.liteapp.gen.OtherAction otherAction);

    public abstract void logOther(com.tencent.liteapp.gen.OtherAction otherAction, long j17);

    public abstract void logOther(com.tencent.liteapp.gen.OtherAction otherAction, long j17, java.util.HashMap<java.lang.String, java.lang.String> hashMap);

    public abstract void logOther(com.tencent.liteapp.gen.OtherAction otherAction, java.lang.String str);

    public abstract void logOther(com.tencent.liteapp.gen.OtherAction otherAction, java.lang.String str, long j17);

    public abstract void logOther(com.tencent.liteapp.gen.OtherAction otherAction, java.lang.String str, java.util.HashMap<java.lang.String, java.lang.String> hashMap);

    public abstract void logOther(com.tencent.liteapp.gen.OtherAction otherAction, java.util.HashMap<java.lang.String, java.lang.String> hashMap);

    public abstract void logOtherWithExpandDimension1(com.tencent.liteapp.gen.OtherAction otherAction, java.lang.String str);

    public abstract void logOtherWithUri(com.tencent.liteapp.gen.OtherAction otherAction, java.lang.String str);

    public abstract void logPerf(java.lang.String str, boolean z17);

    public abstract void logPerf(java.lang.String str, boolean z17, java.util.HashMap<java.lang.String, java.lang.String> hashMap);

    public abstract void logRunning(com.tencent.liteapp.gen.RunningAction runningAction);

    public abstract void logRunning(com.tencent.liteapp.gen.RunningAction runningAction, long j17);

    public abstract void logRunning(com.tencent.liteapp.gen.RunningAction runningAction, long j17, java.util.HashMap<java.lang.String, java.lang.String> hashMap);

    public abstract void logRunning(com.tencent.liteapp.gen.RunningAction runningAction, java.lang.String str);

    public abstract void logRunning(com.tencent.liteapp.gen.RunningAction runningAction, java.lang.String str, long j17);

    public abstract void logRunning(com.tencent.liteapp.gen.RunningAction runningAction, java.lang.String str, java.util.HashMap<java.lang.String, java.lang.String> hashMap);

    public abstract void logRunning(com.tencent.liteapp.gen.RunningAction runningAction, java.util.HashMap<java.lang.String, java.lang.String> hashMap);

    public abstract void logRunningWithExpandDimension1(com.tencent.liteapp.gen.RunningAction runningAction, java.lang.String str);

    public abstract void logRunningWithUri(com.tencent.liteapp.gen.RunningAction runningAction, java.lang.String str);

    public abstract void logStart(com.tencent.liteapp.gen.StartAction startAction);

    public abstract void logStart(com.tencent.liteapp.gen.StartAction startAction, long j17);

    public abstract void logStart(com.tencent.liteapp.gen.StartAction startAction, long j17, java.util.HashMap<java.lang.String, java.lang.String> hashMap);

    public abstract void logStart(com.tencent.liteapp.gen.StartAction startAction, java.lang.String str);

    public abstract void logStart(com.tencent.liteapp.gen.StartAction startAction, java.lang.String str, long j17);

    public abstract void logStart(com.tencent.liteapp.gen.StartAction startAction, java.lang.String str, java.util.HashMap<java.lang.String, java.lang.String> hashMap);

    public abstract void logStart(com.tencent.liteapp.gen.StartAction startAction, java.util.HashMap<java.lang.String, java.lang.String> hashMap);

    public abstract void logStartWithExpandDimension1(com.tencent.liteapp.gen.StartAction startAction, java.lang.String str);

    public abstract void logStartWithUri(com.tencent.liteapp.gen.StartAction startAction, java.lang.String str);

    public abstract void report(com.tencent.liteapp.gen.LiteAppReportData liteAppReportData);

    public abstract void setAppId(java.lang.String str);

    public abstract void setScene(com.tencent.liteapp.gen.LiteAppOpenScene liteAppOpenScene);

    public abstract void setVersion(java.lang.String str);
}
