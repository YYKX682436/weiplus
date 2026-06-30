package com.google.android.gms.common.util;

/* loaded from: classes13.dex */
public class ProcessUtils {
    private static java.lang.String zza;
    private static int zzb;

    private ProcessUtils() {
    }

    public static java.lang.String getMyProcessName() {
        java.io.BufferedReader bufferedReader;
        if (zza == null) {
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                zza = android.app.Application.getProcessName();
            } else {
                int i17 = zzb;
                if (i17 == 0) {
                    i17 = android.os.Process.myPid();
                    zzb = i17;
                }
                java.lang.String str = null;
                str = null;
                str = null;
                java.io.BufferedReader bufferedReader2 = null;
                if (i17 > 0) {
                    try {
                        java.lang.String str2 = "/proc/" + i17 + "/cmdline";
                        android.os.StrictMode.ThreadPolicy allowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
                        try {
                            bufferedReader = new java.io.BufferedReader(new java.io.FileReader(str2));
                        } finally {
                            android.os.StrictMode.setThreadPolicy(allowThreadDiskReads);
                        }
                    } catch (java.io.IOException unused) {
                        bufferedReader = null;
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                    }
                    try {
                        java.lang.String readLine = bufferedReader.readLine();
                        com.google.android.gms.common.internal.Preconditions.checkNotNull(readLine);
                        str = readLine.trim();
                    } catch (java.io.IOException unused2) {
                    } catch (java.lang.Throwable th7) {
                        th = th7;
                        bufferedReader2 = bufferedReader;
                        com.google.android.gms.common.util.IOUtils.closeQuietly(bufferedReader2);
                        throw th;
                    }
                    com.google.android.gms.common.util.IOUtils.closeQuietly(bufferedReader);
                }
                zza = str;
            }
        }
        return zza;
    }
}
