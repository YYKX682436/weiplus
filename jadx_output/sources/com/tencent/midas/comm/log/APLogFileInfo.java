package com.tencent.midas.comm.log;

/* loaded from: classes13.dex */
public class APLogFileInfo {
    public static java.lang.String dirName = "";
    public static java.lang.String fileName = "";
    public static java.lang.String mmapName = "";

    private static java.lang.String buildDirName() {
        com.tencent.midas.comm.APLogInfo logInfo = com.tencent.midas.comm.APLog.getLogInfo();
        if (logInfo == null || logInfo.getLogPath() == null) {
            return "";
        }
        java.lang.String logPath = logInfo.getLogPath();
        java.lang.String str = java.io.File.separator;
        if (!logPath.endsWith(str)) {
            logPath = logPath + str;
        }
        java.lang.String str2 = logPath + logInfo.getPkgName() + str;
        if (android.text.TextUtils.isEmpty(logInfo.getProcessName())) {
            return str2;
        }
        return str2 + logInfo.getProcessName() + str;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0056 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String buildFileName(boolean r3) {
        /*
            r0 = 0
            java.lang.String r1 = com.tencent.midas.comm.log.APLogFileInfo.dirName     // Catch: java.lang.Throwable -> L50
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L50
            if (r1 != 0) goto L54
            java.lang.StringBuffer r1 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> L50
            java.lang.String r2 = com.tencent.midas.comm.log.APLogFileInfo.dirName     // Catch: java.lang.Throwable -> L50
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L50
            java.lang.String r0 = com.tencent.midas.comm.log.APLogFileInfo.dirName     // Catch: java.lang.Throwable -> L4d
            java.lang.String r2 = java.io.File.separator     // Catch: java.lang.Throwable -> L4d
            boolean r0 = r0.endsWith(r2)     // Catch: java.lang.Throwable -> L4d
            if (r0 != 0) goto L1d
            r1.append(r2)     // Catch: java.lang.Throwable -> L4d
        L1d:
            java.lang.String r0 = com.tencent.midas.comm.log.APLogFileInfo.dirName     // Catch: java.lang.Throwable -> L4d
            java.lang.String r0 = com.tencent.midas.comm.log.util.APLogFileUtil.getLastLogFileName(r0)     // Catch: java.lang.Throwable -> L4d
            if (r3 == 0) goto L33
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L4d
            if (r3 != 0) goto L33
            r1.append(r0)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> L4d
            return r3
        L33:
            java.lang.String r3 = com.tencent.midas.comm.log.util.APLogFileUtil.getToday()     // Catch: java.lang.Throwable -> L4d
            r1.append(r3)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r3 = "_"
            r1.append(r3)     // Catch: java.lang.Throwable -> L4d
            int r3 = buildFileNumber(r0)     // Catch: java.lang.Throwable -> L4d
            r1.append(r3)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r3 = ".txt"
            r1.append(r3)     // Catch: java.lang.Throwable -> L4d
            r0 = r1
            goto L54
        L4d:
            r3 = move-exception
            r0 = r1
            goto L51
        L50:
            r3 = move-exception
        L51:
            r3.toString()
        L54:
            if (r0 != 0) goto L59
            java.lang.String r3 = ""
            goto L5d
        L59:
            java.lang.String r3 = r0.toString()
        L5d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.midas.comm.log.APLogFileInfo.buildFileName(boolean):java.lang.String");
    }

    private static int buildFileNumber(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return 1;
        }
        try {
            java.lang.String[] split = str.split(com.tencent.midas.comm.log.util.APLogFileUtil.getToday() + "_");
            if (split.length > 1) {
                return java.lang.Integer.parseInt(split[1].split(".txt")[0]) + 1;
            }
            return 1;
        } catch (java.lang.Throwable th6) {
            th6.getMessage();
            return 1;
        }
    }

    private static java.lang.String buildMmapName() {
        return dirName + java.io.File.separator + "MidasLog.mmap";
    }

    public static void create() {
        try {
            dirName = buildDirName();
            fileName = buildFileName(true);
            mmapName = buildMmapName();
        } catch (java.lang.Throwable th6) {
            th6.toString();
        }
    }

    public static void updateFileName() {
        fileName = buildFileName(false);
    }
}
