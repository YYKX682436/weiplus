package com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013;

/* renamed from: com.tencent.tinker.loader.TinkerUncaughtHandler */
/* loaded from: classes13.dex */
public class C26611x2c480bf6 implements java.lang.Thread.UncaughtExceptionHandler {
    private static final java.lang.String TAG = "Tinker.UncaughtHandler";

    /* renamed from: context */
    private final android.content.Context f55508x38b735af;

    /* renamed from: crashFile */
    private final java.io.File f55509x6e11a1c3;
    private final java.lang.Thread.UncaughtExceptionHandler ueh = java.lang.Thread.getDefaultUncaughtExceptionHandler();

    public C26611x2c480bf6(android.content.Context context) {
        this.f55508x38b735af = context;
        this.f55509x6e11a1c3 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104682x8e55de5b(context);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(java.lang.Thread thread, java.lang.Throwable th6) {
        java.io.PrintWriter printWriter;
        java.lang.Throwable th7;
        java.io.IOException e17;
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e(TAG, "TinkerUncaughtHandler catch exception:" + android.util.Log.getStackTraceString(th6), new java.lang.Object[0]);
        this.ueh.uncaughtException(thread, th6);
        if (this.f55509x6e11a1c3 == null || !(java.lang.Thread.getDefaultUncaughtExceptionHandler() instanceof com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26611x2c480bf6)) {
            return;
        }
        java.io.File parentFile = this.f55509x6e11a1c3.getParentFile();
        if (!parentFile.exists() && !parentFile.mkdirs()) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e(TAG, "print crash file error: create directory fail!", new java.lang.Object[0]);
            return;
        }
        try {
            printWriter = new java.io.PrintWriter(new java.io.FileWriter(this.f55509x6e11a1c3, false));
            try {
                try {
                    printWriter.println("process:" + com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.m104732xe5e58464(this.f55508x38b735af));
                    printWriter.println(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.m104730x7c782a81(th6));
                } catch (java.io.IOException e18) {
                    e17 = e18;
                    com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e(TAG, "print crash file error:" + android.util.Log.getStackTraceString(e17), new java.lang.Object[0]);
                    com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104666xd71209a9(printWriter);
                    android.os.Process.killProcess(android.os.Process.myPid());
                }
            } catch (java.lang.Throwable th8) {
                th7 = th8;
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104666xd71209a9(printWriter);
                throw th7;
            }
        } catch (java.io.IOException e19) {
            printWriter = null;
            e17 = e19;
        } catch (java.lang.Throwable th9) {
            printWriter = null;
            th7 = th9;
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104666xd71209a9(printWriter);
            throw th7;
        }
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104666xd71209a9(printWriter);
        android.os.Process.killProcess(android.os.Process.myPid());
    }
}
