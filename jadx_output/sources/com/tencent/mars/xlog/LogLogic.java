package com.tencent.mars.xlog;

/* loaded from: classes12.dex */
public class LogLogic {
    protected static com.tencent.mars.xlog.LogLogic.ICallBack callBack;

    /* loaded from: classes12.dex */
    public interface ICallBack {
        void hitLogRuleCallback(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4);
    }

    public static native void addLogRule(int i17, java.lang.String str, java.lang.String str2);

    public static java.lang.String appendMemLog(java.lang.String str) {
        return str;
    }

    public static java.lang.String convertStreamToString(java.io.InputStream inputStream) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.io.BufferedReader bufferedReader = null;
        try {
            java.io.BufferedReader bufferedReader2 = new java.io.BufferedReader(new java.io.InputStreamReader(inputStream));
            while (true) {
                try {
                    java.lang.String readLine = bufferedReader2.readLine();
                    if (readLine == null) {
                        bufferedReader2.close();
                        return sb6.toString();
                    }
                    sb6.append(readLine);
                    sb6.append('\n');
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    throw th;
                }
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    public static native int getAppenderModeFromCfg();

    public static long getDalvikHeap() {
        java.lang.Runtime runtime = java.lang.Runtime.getRuntime();
        return (runtime.totalMemory() - runtime.freeMemory()) / 1024;
    }

    public static native int getIPxxLogLevel();

    public static native int getLogLevelFromCfg();

    public static long getNativeHeap() {
        return android.os.Debug.getNativeHeapAllocatedSize() / 1024;
    }

    public static java.lang.String getStringFromFile(java.lang.String str) {
        java.io.BufferedInputStream bufferedInputStream;
        java.lang.Throwable th6;
        try {
            bufferedInputStream = new java.io.BufferedInputStream(new java.io.FileInputStream(new java.io.File(str)));
            try {
                java.lang.String convertStreamToString = convertStreamToString(bufferedInputStream);
                bufferedInputStream.close();
                return convertStreamToString;
            } catch (java.lang.Throwable th7) {
                th6 = th7;
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                throw th6;
            }
        } catch (java.lang.Throwable th8) {
            bufferedInputStream = null;
            th6 = th8;
        }
    }

    public static java.lang.String getVmSize() {
        try {
            java.lang.String[] split = getStringFromFile(java.lang.String.format("/proc/%s/status", java.lang.Integer.valueOf(android.os.Process.myPid()))).trim().split("\n");
            for (java.lang.String str : split) {
                if (str.startsWith("VmSize")) {
                    return str;
                }
            }
            return split[12];
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    public static java.lang.String getVmStatus() {
        java.lang.String format = java.lang.String.format("/proc/%s/status", java.lang.Integer.valueOf(android.os.Process.myPid()));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        try {
            sb6.append(getStringFromFile(format).trim());
            return sb6.toString();
        } catch (java.lang.Exception unused) {
            return sb6.toString();
        }
    }

    public static void hitLogRuleCallback(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4) {
        com.tencent.mars.xlog.LogLogic.ICallBack iCallBack = callBack;
        if (iCallBack == null) {
            return;
        }
        iCallBack.hitLogRuleCallback(str, str2, str3, i17, str4);
    }

    public static native void initIPxxLogInfo();

    public static native void removeLogRule(java.lang.String str);

    public static void setCallBack(com.tencent.mars.xlog.LogLogic.ICallBack iCallBack) {
        callBack = iCallBack;
    }

    public static native void setIPxxLogML(int i17, int i18);
}
