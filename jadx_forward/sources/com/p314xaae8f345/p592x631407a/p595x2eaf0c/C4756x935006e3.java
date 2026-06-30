package com.p314xaae8f345.p592x631407a.p595x2eaf0c;

/* renamed from: com.tencent.midas.comm.APLogInfo */
/* loaded from: classes13.dex */
public class C4756x935006e3 {

    /* renamed from: LOG_TAG */
    public static final java.lang.String f20270x3f3d67df = "MidasComm<Log>";

    /* renamed from: LOG_VERSION_CODE */
    public static final int f20271x5ee4664f = 45;

    /* renamed from: LOG_VERSION_NAME */
    public static final java.lang.String f20272x5ee932ed = "1.3.4";

    /* renamed from: logCallbackClassName */
    private java.lang.String f20278x212ba67a;

    /* renamed from: context */
    private android.content.Context f20275x38b735af = null;

    /* renamed from: logTag */
    private java.lang.String f20281xbe97adb6 = "Midas";

    /* renamed from: logEnable */
    private boolean f20279x5c1d31e7 = true;

    /* renamed from: logPath */
    private java.lang.String f20280x145c3989 = "";

    /* renamed from: hasWritePermission */
    private boolean f20277x44eb4d14 = false;

    /* renamed from: pkgName */
    private java.lang.String f20282xe120da77 = "";

    /* renamed from: processName */
    private java.lang.String f20284xc0f3d9a = "";

    /* renamed from: writeLog */
    private boolean f20285x91f0d2e5 = true;

    /* renamed from: printLog */
    private boolean f20283xba7add57 = false;

    /* renamed from: compressLog */
    private boolean f20274x5559ec82 = true;

    /* renamed from: encryptLog */
    private boolean f20276xa5d6a29f = true;

    /* renamed from: autoFlush */
    private boolean f20273x61a1a295 = true;

    /* renamed from: initLogPath */
    private void m41608x630a9a59() {
        try {
            android.content.Context context = this.f20275x38b735af;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("midas");
            java.lang.String str = java.io.File.separator;
            sb6.append(str);
            sb6.append("log");
            sb6.append(str);
            java.io.File externalFilesDir = context.getExternalFilesDir(sb6.toString());
            this.f20280x145c3989 = externalFilesDir == null ? "" : externalFilesDir.getPath();
        } catch (java.lang.Throwable th6) {
            th6.getMessage();
        }
    }

    /* renamed from: initPermission */
    private void m41609x17b9f2ff() {
        this.f20277x44eb4d14 = this.f20275x38b735af.getPackageManager().checkPermission("android.permission.WRITE_EXTERNAL_STORAGE", this.f20282xe120da77) == 0;
    }

    /* renamed from: initPkgName */
    private void m41610x2fcf3b47() {
        android.content.Context context = this.f20275x38b735af;
        if (context == null) {
            return;
        }
        try {
            this.f20282xe120da77 = context.getPackageManager().getPackageInfo(this.f20275x38b735af.getApplicationContext().getPackageName(), 0).packageName;
        } catch (java.lang.Throwable th6) {
            th6.toString();
        }
    }

    /* renamed from: initProcessName */
    private void m41611xa800b66a() {
        try {
            int myPid = android.os.Process.myPid();
            android.app.ActivityManager activityManager = (android.app.ActivityManager) this.f20275x38b735af.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
            if (activityManager != null) {
                for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                    if (runningAppProcessInfo.pid == myPid) {
                        java.lang.String[] split = runningAppProcessInfo.processName.split(":");
                        if (split.length > 1) {
                            this.f20284xc0f3d9a = split[1];
                        } else {
                            this.f20284xc0f3d9a = "";
                        }
                    }
                }
            }
        } catch (java.lang.Throwable th6) {
            th6.toString();
        }
    }

    /* renamed from: setPrintLog */
    private void m41612x310d7bd9(boolean z17) {
        this.f20283xba7add57 = z17;
    }

    /* renamed from: setWriteLog */
    private void m41613x8837167(boolean z17) {
        this.f20285x91f0d2e5 = z17;
    }

    /* renamed from: getContext */
    public android.content.Context m41614x76847179() {
        return this.f20275x38b735af;
    }

    /* renamed from: getLogCallbackClassName */
    public java.lang.String m41615xcef762f0() {
        return this.f20278x212ba67a;
    }

    /* renamed from: getLogPath */
    public java.lang.String m41616x52297553() {
        return this.f20280x145c3989;
    }

    /* renamed from: getLogTag */
    public java.lang.String m41617x23aed0ac() {
        return this.f20281xbe97adb6;
    }

    /* renamed from: getPkgName */
    public java.lang.String m41618x1eee1641() {
        return this.f20282xe120da77;
    }

    /* renamed from: getProcessName */
    public java.lang.String m41619xe5e58464() {
        return this.f20284xc0f3d9a;
    }

    /* renamed from: init */
    public void m41620x316510() {
        if (this.f20275x38b735af == null) {
            return;
        }
        m41610x2fcf3b47();
        m41608x630a9a59();
    }

    /* renamed from: isAutoFlush */
    public boolean m41621xa7dee48b() {
        return this.f20273x61a1a295;
    }

    /* renamed from: isCompressLog */
    public boolean m41622x14e88f8() {
        return this.f20274x5559ec82;
    }

    /* renamed from: isEncryptLog */
    public boolean m41623x27419f69() {
        return this.f20276xa5d6a29f;
    }

    /* renamed from: isHasWritePermission */
    public boolean m41624x1799dfde() {
        return this.f20277x44eb4d14;
    }

    /* renamed from: isLogEnable */
    public boolean m41625xa25a73dd() {
        return this.f20279x5c1d31e7;
    }

    /* renamed from: isPrintLog */
    public boolean m41626x8b3284a1() {
        return this.f20283xba7add57;
    }

    /* renamed from: isWriteLog */
    public boolean m41627x62a87a2f() {
        try {
            if ((this.f20275x38b735af.getExternalFilesDir(null).getFreeSpace() / 1024) / 1024 < 500) {
                return false;
            }
            return this.f20285x91f0d2e5;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    /* renamed from: setAutoFlush */
    public void m41628xbd62d453(boolean z17) {
        this.f20273x61a1a295 = z17;
    }

    /* renamed from: setCompressLog */
    public void m41629xc595a6c0(boolean z17) {
        this.f20274x5559ec82 = z17;
    }

    /* renamed from: setContext */
    public void m41630xe9f5beed(android.content.Context context) {
        this.f20275x38b735af = context.getApplicationContext();
    }

    /* renamed from: setEncryptKey */
    public void m41631xc23ba3bc(java.lang.String str) {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p597xbebf4c92.C4768xdb57b1f3.m41701xc23ba3bc(str);
    }

    /* renamed from: setEncryptLog */
    public void m41632xc23ba8a1(boolean z17) {
        this.f20276xa5d6a29f = z17;
    }

    /* renamed from: setEncryptProtocolVersion */
    public void m41633xd86decfd(byte b17) {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p597xbebf4c92.C4768xdb57b1f3.m41702x83b2765e(b17);
    }

    /* renamed from: setLogCallbackClassName */
    public void m41634x494a91fc(java.lang.String str) {
        this.f20278x212ba67a = str;
    }

    /* renamed from: setLogEnable */
    public void m41635xb7de63a5(boolean z17) {
        this.f20279x5c1d31e7 = z17;
    }

    /* renamed from: setLogFileKeepDays */
    public void m41636xa478ffba(int i17) {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20381xee1144dc = i17;
    }

    /* renamed from: setLogFileNum */
    public void m41637x70e80288(int i17) {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20379xea2110a = i17;
    }

    /* renamed from: setLogFileSizeMB */
    public void m41638xf251f14(int i17) {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20380xe5c36952 = i17;
    }

    /* renamed from: setLogParamFromServer */
    public void m41639x79ad3c18(java.lang.String str) {
        m41642xee27cd7d(str);
    }

    /* renamed from: setLogPath */
    public void m41640xc59ac2c7(java.lang.String str) {
        this.f20280x145c3989 = str;
    }

    /* renamed from: setLogTag */
    public void m41641x16e404b8(java.lang.String str) {
        this.f20281xbe97adb6 = str;
    }

    /* renamed from: setLogWrite */
    public void m41642xee27cd7d(java.lang.String str) {
        int i17;
        try {
            i17 = java.lang.Integer.valueOf(str).intValue();
        } catch (java.lang.Throwable unused) {
            i17 = 3;
        }
        m41612x310d7bd9((i17 & 1) == 1);
        m41613x8837167((i17 & 2) == 2);
    }

    /* renamed from: shouldPrintLog */
    public boolean m41643x7674f42a() {
        return this.f20279x5c1d31e7 || this.f20283xba7add57 || com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.m41733x3a69248c(com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.C4762x960c2fff.f20313x638764b8);
    }
}
