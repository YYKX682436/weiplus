package com.tencent.matrix.memguard;

/* loaded from: classes12.dex */
public final class MemGuard {

    /* loaded from: classes2.dex */
    public static final class Options {
        public boolean ignoreOverlappedReading;
        public java.lang.String[] ignoredSOPatterns;
        public java.lang.String issueDumpFilePath;
        public int maxAllocationSize;
        public int maxDetectableAllocationCount;
        public int maxSkippedAllocationCount;
        public int minAllocationSize;
        public int percentageOfLeftSideGuard;
        public boolean perfectRightSideGuard;
        public java.lang.String[] targetSOPatterns;

        public java.lang.String toString() {
            return "Options{minAllocationSize=" + this.minAllocationSize + ", maxAllocationSize=" + this.maxAllocationSize + ", maxDetectableAllocationCount=" + this.maxDetectableAllocationCount + ", maxSkippedAllocationCount=" + this.maxSkippedAllocationCount + ", percentageOfLeftSideGuard=" + this.percentageOfLeftSideGuard + ", perfectRightSideGuard=" + this.perfectRightSideGuard + ", ignoreOverlappedReading=" + this.ignoreOverlappedReading + ", issueDumpFilePath=" + this.issueDumpFilePath + ", targetSOPatterns=" + java.util.Arrays.toString(this.targetSOPatterns) + ", ignoredSOPatterns=" + java.util.Arrays.toString(this.ignoredSOPatterns) + '}';
        }
    }

    static {
        new hi.a();
    }

    private static void c2jNotifyOnIssueDumped(java.lang.String str) {
        java.lang.Thread thread = new java.lang.Thread(new hi.b(str), "MemGuard.IssueCB");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        thread.start();
        try {
            thread.join(5000L);
        } catch (java.lang.InterruptedException unused) {
            oj.j.f("MemGuard", "Issue callback was interrupted.", new java.lang.Object[0]);
        }
        if (java.lang.System.currentTimeMillis() - currentTimeMillis > 5000) {
            oj.j.f("MemGuard", "Timeout when call issue callback.", new java.lang.Object[0]);
        }
    }

    private static native java.lang.String nativeGetIssueDumpFilePath();

    private static native boolean nativeInstall(com.tencent.matrix.memguard.MemGuard.Options options, boolean z17);

    private static native boolean nativeInstallSigHandler();
}
