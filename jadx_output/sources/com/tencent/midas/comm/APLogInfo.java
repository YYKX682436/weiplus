package com.tencent.midas.comm;

/* loaded from: classes13.dex */
public class APLogInfo {
    public static final java.lang.String LOG_TAG = "MidasComm<Log>";
    public static final int LOG_VERSION_CODE = 45;
    public static final java.lang.String LOG_VERSION_NAME = "1.3.4";
    private java.lang.String logCallbackClassName;
    private android.content.Context context = null;
    private java.lang.String logTag = "Midas";
    private boolean logEnable = true;
    private java.lang.String logPath = "";
    private boolean hasWritePermission = false;
    private java.lang.String pkgName = "";
    private java.lang.String processName = "";
    private boolean writeLog = true;
    private boolean printLog = false;
    private boolean compressLog = true;
    private boolean encryptLog = true;
    private boolean autoFlush = true;

    private void initLogPath() {
        try {
            android.content.Context context = this.context;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("midas");
            java.lang.String str = java.io.File.separator;
            sb6.append(str);
            sb6.append("log");
            sb6.append(str);
            java.io.File externalFilesDir = context.getExternalFilesDir(sb6.toString());
            this.logPath = externalFilesDir == null ? "" : externalFilesDir.getPath();
        } catch (java.lang.Throwable th6) {
            th6.getMessage();
        }
    }

    private void initPermission() {
        this.hasWritePermission = this.context.getPackageManager().checkPermission("android.permission.WRITE_EXTERNAL_STORAGE", this.pkgName) == 0;
    }

    private void initPkgName() {
        android.content.Context context = this.context;
        if (context == null) {
            return;
        }
        try {
            this.pkgName = context.getPackageManager().getPackageInfo(this.context.getApplicationContext().getPackageName(), 0).packageName;
        } catch (java.lang.Throwable th6) {
            th6.toString();
        }
    }

    private void initProcessName() {
        try {
            int myPid = android.os.Process.myPid();
            android.app.ActivityManager activityManager = (android.app.ActivityManager) this.context.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            if (activityManager != null) {
                for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                    if (runningAppProcessInfo.pid == myPid) {
                        java.lang.String[] split = runningAppProcessInfo.processName.split(":");
                        if (split.length > 1) {
                            this.processName = split[1];
                        } else {
                            this.processName = "";
                        }
                    }
                }
            }
        } catch (java.lang.Throwable th6) {
            th6.toString();
        }
    }

    private void setPrintLog(boolean z17) {
        this.printLog = z17;
    }

    private void setWriteLog(boolean z17) {
        this.writeLog = z17;
    }

    public android.content.Context getContext() {
        return this.context;
    }

    public java.lang.String getLogCallbackClassName() {
        return this.logCallbackClassName;
    }

    public java.lang.String getLogPath() {
        return this.logPath;
    }

    public java.lang.String getLogTag() {
        return this.logTag;
    }

    public java.lang.String getPkgName() {
        return this.pkgName;
    }

    public java.lang.String getProcessName() {
        return this.processName;
    }

    public void init() {
        if (this.context == null) {
            return;
        }
        initPkgName();
        initLogPath();
    }

    public boolean isAutoFlush() {
        return this.autoFlush;
    }

    public boolean isCompressLog() {
        return this.compressLog;
    }

    public boolean isEncryptLog() {
        return this.encryptLog;
    }

    public boolean isHasWritePermission() {
        return this.hasWritePermission;
    }

    public boolean isLogEnable() {
        return this.logEnable;
    }

    public boolean isPrintLog() {
        return this.printLog;
    }

    public boolean isWriteLog() {
        try {
            if ((this.context.getExternalFilesDir(null).getFreeSpace() / 1024) / 1024 < 500) {
                return false;
            }
            return this.writeLog;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    public void setAutoFlush(boolean z17) {
        this.autoFlush = z17;
    }

    public void setCompressLog(boolean z17) {
        this.compressLog = z17;
    }

    public void setContext(android.content.Context context) {
        this.context = context.getApplicationContext();
    }

    public void setEncryptKey(java.lang.String str) {
        com.tencent.midas.comm.log.processor.APLogEncryptor.setEncryptKey(str);
    }

    public void setEncryptLog(boolean z17) {
        this.encryptLog = z17;
    }

    public void setEncryptProtocolVersion(byte b17) {
        com.tencent.midas.comm.log.processor.APLogEncryptor.setProtocolVersion(b17);
    }

    public void setLogCallbackClassName(java.lang.String str) {
        this.logCallbackClassName = str;
    }

    public void setLogEnable(boolean z17) {
        this.logEnable = z17;
    }

    public void setLogFileKeepDays(int i17) {
        com.tencent.midas.comm.log.util.APLogFileUtil.maxLogKeepDays = i17;
    }

    public void setLogFileNum(int i17) {
        com.tencent.midas.comm.log.util.APLogFileUtil.maxLogFileNum = i17;
    }

    public void setLogFileSizeMB(int i17) {
        com.tencent.midas.comm.log.util.APLogFileUtil.maxLogFileSizeMB = i17;
    }

    public void setLogParamFromServer(java.lang.String str) {
        setLogWrite(str);
    }

    public void setLogPath(java.lang.String str) {
        this.logPath = str;
    }

    public void setLogTag(java.lang.String str) {
        this.logTag = str;
    }

    public void setLogWrite(java.lang.String str) {
        int i17;
        try {
            i17 = java.lang.Integer.valueOf(str).intValue();
        } catch (java.lang.Throwable unused) {
            i17 = 3;
        }
        setPrintLog((i17 & 1) == 1);
        setWriteLog((i17 & 2) == 2);
    }

    public boolean shouldPrintLog() {
        return this.logEnable || this.printLog || com.tencent.midas.comm.log.util.APLogFileUtil.isDebugMode(com.tencent.midas.comm.log.APLogFileInfo.dirName);
    }
}
