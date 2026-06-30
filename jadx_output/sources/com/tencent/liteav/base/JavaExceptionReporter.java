package com.tencent.liteav.base;

@com.tencent.liteav.base.annotations.JNINamespace("base::android")
/* loaded from: classes12.dex */
public class JavaExceptionReporter implements java.lang.Thread.UncaughtExceptionHandler {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final boolean mCrashAfterReport;
    private boolean mHandlingException;
    private final java.lang.Thread.UncaughtExceptionHandler mParent;

    private JavaExceptionReporter(java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler, boolean z17) {
        this.mParent = uncaughtExceptionHandler;
        this.mCrashAfterReport = z17;
    }

    private static void installHandler(boolean z17) {
        java.lang.Thread.setDefaultUncaughtExceptionHandler(new com.tencent.liteav.base.JavaExceptionReporter(java.lang.Thread.getDefaultUncaughtExceptionHandler(), z17));
    }

    public static void reportStackTrace(java.lang.String str) {
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(java.lang.Thread thread, java.lang.Throwable th6) {
        if (!this.mHandlingException) {
            this.mHandlingException = true;
        }
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.mParent;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th6);
        }
    }
}
