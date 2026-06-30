package com.p314xaae8f345.p542x3306d5.p550x382fcc;

/* renamed from: com.tencent.mars.xlog.LogLogic */
/* loaded from: classes12.dex */
public class C4606x7ad32a9a {

    /* renamed from: callBack */
    protected static com.p314xaae8f345.p542x3306d5.p550x382fcc.C4606x7ad32a9a.ICallBack f19743xf5ad9465;

    /* renamed from: com.tencent.mars.xlog.LogLogic$ICallBack */
    /* loaded from: classes12.dex */
    public interface ICallBack {
        /* renamed from: hitLogRuleCallback */
        void m40594xc50cbcb2(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4);
    }

    /* renamed from: addLogRule */
    public static native void m40578x861ac47f(int i17, java.lang.String str, java.lang.String str2);

    /* renamed from: appendMemLog */
    public static java.lang.String m40579x4356b8e9(java.lang.String str) {
        return str;
    }

    /* renamed from: convertStreamToString */
    public static java.lang.String m40580xab1fa9f(java.io.InputStream inputStream) {
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

    /* renamed from: getAppenderModeFromCfg */
    public static native int m40581xc7266e3a();

    /* renamed from: getDalvikHeap */
    public static long m40582x773023ab() {
        java.lang.Runtime runtime = java.lang.Runtime.getRuntime();
        return (runtime.totalMemory() - runtime.freeMemory()) / 1024;
    }

    /* renamed from: getIPxxLogLevel */
    public static native int m40583x8d97287d();

    /* renamed from: getLogLevelFromCfg */
    public static native int m40584xe5709b64();

    /* renamed from: getNativeHeap */
    public static long m40585xa7416699() {
        return android.os.Debug.getNativeHeapAllocatedSize() / 1024;
    }

    /* renamed from: getStringFromFile */
    public static java.lang.String m40586x503c8c6d(java.lang.String str) {
        java.io.BufferedInputStream bufferedInputStream;
        java.lang.Throwable th6;
        try {
            bufferedInputStream = new java.io.BufferedInputStream(new java.io.FileInputStream(new java.io.File(str)));
            try {
                java.lang.String m40580xab1fa9f = m40580xab1fa9f(bufferedInputStream);
                bufferedInputStream.close();
                return m40580xab1fa9f;
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

    /* renamed from: getVmSize */
    public static java.lang.String m40587x349a524e() {
        try {
            java.lang.String[] split = m40586x503c8c6d(java.lang.String.format("/proc/%s/status", java.lang.Integer.valueOf(android.os.Process.myPid()))).trim().split("\n");
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

    /* renamed from: getVmStatus */
    public static java.lang.String m40588x77dee2ff() {
        java.lang.String format = java.lang.String.format("/proc/%s/status", java.lang.Integer.valueOf(android.os.Process.myPid()));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        try {
            sb6.append(m40586x503c8c6d(format).trim());
            return sb6.toString();
        } catch (java.lang.Exception unused) {
            return sb6.toString();
        }
    }

    /* renamed from: hitLogRuleCallback */
    public static void m40589xc50cbcb2(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.C4606x7ad32a9a.ICallBack iCallBack = f19743xf5ad9465;
        if (iCallBack == null) {
            return;
        }
        iCallBack.m40594xc50cbcb2(str, str2, str3, i17, str4);
    }

    /* renamed from: initIPxxLogInfo */
    public static native void m40590xade5069b();

    /* renamed from: removeLogRule */
    public static native void m40591x5b9f2f3c(java.lang.String str);

    /* renamed from: setCallBack */
    public static void m40592x6c4032e7(com.p314xaae8f345.p542x3306d5.p550x382fcc.C4606x7ad32a9a.ICallBack iCallBack) {
        f19743xf5ad9465 = iCallBack;
    }

    /* renamed from: setIPxxLogML */
    public static native void m40593x3f450b9a(int i17, int i18);
}
