package d55;

/* loaded from: classes12.dex */
public abstract class n0 {
    public static java.lang.String a(android.content.Context context) {
        java.io.FileInputStream fileInputStream;
        int myPid = android.os.Process.myPid();
        try {
            java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((android.app.ActivityManager) context.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100)).getRunningAppProcesses();
            java.lang.String packageName = context.getPackageName();
            for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == myPid && packageName.equals(runningAppProcessInfo.processName)) {
                    return runningAppProcessInfo.processName;
                }
            }
        } catch (java.lang.Exception unused) {
            d55.o0.a(5, "MicroMsg.recovery.utils", "get proc name by am fail, try pid cmdline");
        }
        byte[] bArr = new byte[128];
        java.io.FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new java.io.FileInputStream("/proc/" + myPid + "/cmdline");
            } catch (java.lang.Throwable th6) {
                th = th6;
            }
        } catch (java.lang.Exception unused2) {
        }
        try {
            int read = fileInputStream.read(bArr);
            if (read <= 0) {
                d55.m0.c(fileInputStream);
                return "";
            }
            int i17 = 0;
            while (true) {
                if (i17 >= read) {
                    break;
                }
                if (bArr[i17] <= 0) {
                    read = i17;
                    break;
                }
                i17++;
            }
            java.lang.String str = new java.lang.String(bArr, 0, read);
            d55.m0.c(fileInputStream);
            return str;
        } catch (java.lang.Exception unused3) {
            fileInputStream2 = fileInputStream;
            d55.o0.a(5, "MicroMsg.recovery.utils", "get proc name by pid cmdline fail");
            d55.m0.c(fileInputStream2);
            return "";
        } catch (java.lang.Throwable th7) {
            th = th7;
            fileInputStream2 = fileInputStream;
            d55.m0.c(fileInputStream2);
            throw th;
        }
    }

    public static boolean b(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("-") ? android.text.TextUtils.isDigitsOnly(str.substring(1)) : android.text.TextUtils.isDigitsOnly(str);
    }

    public static boolean c(android.content.Context context, java.lang.String str) {
        if (a(context) != null) {
            if (a(context).equals(context.getPackageName() + str)) {
                return true;
            }
        }
        return false;
    }

    public static int d(long j17, int i17) {
        if (j17 >= -2147483648L && j17 <= 2147483647L) {
            return (int) j17;
        }
        d55.o0.a(5, "MicroMsg.recovery.utils", j17 + " cannot be cast to int without changing its value.");
        return i17;
    }
}
