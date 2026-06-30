package com.tencent.midas.comm.log.internal;

/* loaded from: classes13.dex */
public class APLogger {
    public static final int LOG_LEVEL_DEBUG = 2;
    public static final int LOG_LEVEL_ERROR = 5;
    public static final int LOG_LEVEL_INFO = 3;
    public static final int LOG_LEVEL_SILENT = 6;
    public static final int LOG_LEVEL_VERBOSE = 1;
    public static final int LOG_LEVEL_WARN = 4;
    private com.tencent.midas.comm.log.internal.APLogAppender appender = null;

    private APLogger() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        r3 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0007 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x000f, B:10:0x0013), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void log(int r2, java.lang.String r3, java.lang.String r4) {
        /*
            r3 = 0
        L1:
            int r0 = r4.length()     // Catch: java.lang.Throwable -> L1b
            if (r3 >= r0) goto L33
            int r0 = r4.length()     // Catch: java.lang.Throwable -> L1b
            int r1 = r3 + 3600
            if (r0 > r1) goto L13
            r4.substring(r3)     // Catch: java.lang.Throwable -> L1b
            goto L16
        L13:
            r4.substring(r3, r1)     // Catch: java.lang.Throwable -> L1b
        L16:
            switch(r2) {
                case 1: goto L19;
                case 2: goto L19;
                case 3: goto L19;
                case 4: goto L19;
                case 5: goto L19;
                case 6: goto L19;
                default: goto L19;
            }
        L19:
            r3 = r1
            goto L1
        L1b:
            r2 = move-exception
            java.util.Locale r3 = java.util.Locale.CHINA
            java.lang.Class r4 = r2.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.String r2 = r2.getMessage()
            java.lang.Object[] r2 = new java.lang.Object[]{r4, r2}
            java.lang.String r4 = "print log error: <%s>%s"
            java.lang.String.format(r3, r4, r2)
        L33:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.midas.comm.log.internal.APLogger.log(int, java.lang.String, java.lang.String):void");
    }

    public static com.tencent.midas.comm.log.internal.APLogger open() {
        com.tencent.midas.comm.log.internal.APLogger aPLogger = new com.tencent.midas.comm.log.internal.APLogger();
        aPLogger.openAppender();
        return aPLogger;
    }

    private void openAppender() {
        this.appender = com.tencent.midas.comm.log.internal.APLogAppender.open();
    }

    public void flush() {
        try {
            com.tencent.midas.comm.log.internal.APLogAppender aPLogAppender = this.appender;
            if (aPLogAppender != null) {
                aPLogAppender.flushAndWrite();
            }
        } catch (java.lang.Throwable th6) {
            java.lang.String.format(java.util.Locale.CHINA, "flush log error: %s\n, stackTrace: %s", th6.toString(), th6.getStackTrace()[3]);
        }
    }

    public void write(java.lang.String str) {
        this.appender.append(str);
    }
}
