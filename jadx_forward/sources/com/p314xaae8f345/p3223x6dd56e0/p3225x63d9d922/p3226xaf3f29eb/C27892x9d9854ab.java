package com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb;

/* renamed from: com.tencent.youtu.sdkkitframework.common.YtLogger */
/* loaded from: classes13.dex */
public final class C27892x9d9854ab {

    /* renamed from: DEBUG_LEVEL */
    public static final int f61653x6e39f258 = 4;

    /* renamed from: ERROR_LEVEL */
    public static final int f61654x85bdd24d = 0;

    /* renamed from: INFO_LEVEL */
    public static final int f61655x36d5a893 = 2;

    /* renamed from: VERB_LEVEL */
    public static final int f61656x97059844 = 5;

    /* renamed from: WARN_LEVEL */
    public static final int f61657xb508146b = 1;

    /* renamed from: loggerListener */
    private static com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.IYtLoggerListener f61663x70688e64;

    /* renamed from: needLogFile */
    private static boolean f61665xe5c4256a;

    /* renamed from: dateFormat */
    private static java.text.DateFormat f61659x940d945 = new java.text.SimpleDateFormat("yyyy-MM-dd_HH-mm-ss.SSS");

    /* renamed from: localLogName */
    private static java.lang.String f61662xbf02ea04 = "youtu_log";

    /* renamed from: localFile */
    private static java.io.File f61661xb8239b87 = null;

    /* renamed from: currentLogLevel */
    private static int f61658xfd460b39 = 0;

    /* renamed from: keywords */
    private static java.lang.String f61660x1f2e9faa = "default";

    /* renamed from: mExecutorService */
    private static java.util.concurrent.ExecutorService f61664x59d59235 = java.util.concurrent.Executors.newSingleThreadExecutor();

    /* renamed from: com.tencent.youtu.sdkkitframework.common.YtLogger$IYtLoggerListener */
    /* loaded from: classes13.dex */
    public interface IYtLoggerListener {
        void log(java.lang.String str, java.lang.String str2);
    }

    public static void d(java.lang.String str, java.lang.Object obj) {
        if (f61658xfd460b39 >= 4) {
            m120651x7b381307(4, str, "[YoutuLog]-[DEBUG]-" + obj);
        }
    }

    public static void e(java.lang.String str, java.lang.String str2) {
        if (f61658xfd460b39 >= 0) {
            m120651x7b381307(0, str, "[YoutuLog]-[ERROR]-" + str2);
        }
    }

    /* renamed from: getCustomLogFile */
    private static java.io.File m120644xe5c0279(java.lang.String str) {
        java.io.File file = new java.io.File(str);
        if (!file.exists() && !file.mkdirs()) {
            return null;
        }
        java.io.File file2 = new java.io.File(file.getPath() + java.io.File.separator + (f61659x940d945.format(new java.util.Date()) + ".log"));
        if (!file2.exists()) {
            try {
                file2.createNewFile();
            } catch (java.lang.Exception unused) {
            }
        }
        return file2;
    }

    /* renamed from: getLogFile */
    private static java.io.File m120645x522506aa(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(android.os.Environment.getExternalStorageDirectory());
        java.lang.String str2 = java.io.File.separator;
        sb6.append(str2);
        sb6.append("youtulog");
        sb6.append(str2);
        sb6.append(str);
        java.io.File file = new java.io.File(sb6.toString());
        if (!file.exists() && !file.mkdirs()) {
            return null;
        }
        java.io.File file2 = new java.io.File(file.getPath() + str2 + (f61659x940d945.format(new java.util.Date()) + ".log"));
        if (!file2.exists()) {
            try {
                file2.createNewFile();
            } catch (java.lang.Exception unused) {
            }
        }
        return file2;
    }

    public static void i(java.lang.String str, java.lang.String str2) {
        if (f61658xfd460b39 >= 2) {
            m120651x7b381307(2, str, "[YoutuLog]-[INFO]-" + str2);
        }
    }

    /* renamed from: save2File */
    private static void m120646x86aa571(java.lang.String str) {
        java.io.File file = f61661xb8239b87;
        if (file != null) {
            m120652xac26b9fb(file, str);
        }
    }

    /* renamed from: setLogLevel */
    public static void m120647xed871122(int i17) {
        f61658xfd460b39 = java.lang.Math.min(i17, java.lang.Math.max(i17, 0));
    }

    /* renamed from: setLoggerListener */
    public static void m120648x26f6c366(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.IYtLoggerListener iYtLoggerListener) {
        f61663x70688e64 = iYtLoggerListener;
    }

    /* renamed from: setNeedLogFile */
    public static void m120650x55ffdfa8(boolean z17, java.lang.String str, java.lang.String str2) {
        f61665xe5c4256a = z17;
        f61660x1f2e9faa = str2;
        if (z17) {
            f61662xbf02ea04 = str;
            f61661xb8239b87 = m120644xe5c0279(str);
        }
    }

    /* renamed from: showLog */
    private static void m120651x7b381307(int i17, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.IYtLoggerListener iYtLoggerListener = f61663x70688e64;
        if (iYtLoggerListener != null) {
            iYtLoggerListener.log(str, str2);
        }
    }

    public static void v(java.lang.String str, java.lang.Object obj) {
        if (f61658xfd460b39 >= 5) {
            m120651x7b381307(5, str, "[YoutuLog]-[VERB]-" + obj);
        }
    }

    public static void w(java.lang.String str, java.lang.String str2) {
        if (f61658xfd460b39 >= 1) {
            m120651x7b381307(1, str, "[YoutuLog]-[WARN]-" + str2);
        }
    }

    /* renamed from: writeFile */
    private static void m120652xac26b9fb(final java.io.File file, final java.lang.String str) {
        if (str.contains(f61660x1f2e9faa)) {
            f61664x59d59235.submit(new java.lang.Runnable() { // from class: com.tencent.youtu.sdkkitframework.common.YtLogger.1
                @Override // java.lang.Runnable
                public void run() {
                    java.io.PrintWriter printWriter;
                    java.lang.Throwable th6;
                    java.io.PrintWriter printWriter2 = null;
                    try {
                        printWriter = new java.io.PrintWriter(new java.io.BufferedWriter(new java.io.FileWriter(file, true)));
                    } catch (java.lang.Exception unused) {
                    } catch (java.lang.Throwable th7) {
                        printWriter = null;
                        th6 = th7;
                    }
                    try {
                        printWriter.println(str);
                        printWriter.flush();
                        printWriter.close();
                    } catch (java.lang.Exception unused2) {
                        printWriter2 = printWriter;
                        if (printWriter2 != null) {
                            printWriter2.close();
                        }
                    } catch (java.lang.Throwable th8) {
                        th6 = th8;
                        if (printWriter != null) {
                            printWriter.close();
                        }
                        throw th6;
                    }
                }
            });
        }
    }

    /* renamed from: setNeedLogFile */
    public static void m120649x55ffdfa8(boolean z17, java.lang.String str) {
        f61665xe5c4256a = z17;
        if (z17) {
            f61662xbf02ea04 = str;
            f61661xb8239b87 = m120645x522506aa(str);
        }
    }
}
