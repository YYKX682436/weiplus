package jh;

/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f381200a;

    public static java.lang.String a(android.content.Context context, int i17) {
        java.io.BufferedInputStream bufferedInputStream;
        int read;
        java.lang.String str;
        if (context != null && i17 > 0) {
            try {
                java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((android.app.ActivityManager) context.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100)).getRunningAppProcesses();
                if (runningAppProcesses != null) {
                    for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                        if (runningAppProcessInfo.pid == i17 && (str = runningAppProcessInfo.processName) != null && !str.equals("")) {
                            return runningAppProcessInfo.processName;
                        }
                    }
                }
            } catch (java.lang.Exception unused) {
            }
            byte[] bArr = new byte[128];
            java.io.BufferedInputStream bufferedInputStream2 = null;
            try {
                try {
                    bufferedInputStream = new java.io.BufferedInputStream(new java.io.FileInputStream("/proc/" + i17 + "/cmdline"));
                } catch (java.lang.Exception unused2) {
                }
            } catch (java.lang.Exception unused3) {
            } catch (java.lang.Throwable th6) {
                th = th6;
            }
            try {
                read = bufferedInputStream.read(bArr);
            } catch (java.lang.Exception unused4) {
                bufferedInputStream2 = bufferedInputStream;
                if (bufferedInputStream2 != null) {
                    bufferedInputStream2.close();
                }
                return "";
            } catch (java.lang.Throwable th7) {
                th = th7;
                bufferedInputStream2 = bufferedInputStream;
                if (bufferedInputStream2 != null) {
                    try {
                        bufferedInputStream2.close();
                    } catch (java.lang.Exception unused5) {
                    }
                }
                throw th;
            }
            if (read > 0) {
                for (int i18 = 0; i18 < read; i18++) {
                    byte b17 = bArr[i18];
                    if (b17 <= 128 && b17 > 0) {
                    }
                    read = i18;
                    break;
                }
                java.lang.String str2 = new java.lang.String(bArr, 0, read);
                try {
                    bufferedInputStream.close();
                } catch (java.lang.Exception unused6) {
                }
                return str2;
            }
            bufferedInputStream.close();
        }
        return "";
    }
}
