package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002;

/* renamed from: com.google.android.gms.common.util.ProcessUtils */
/* loaded from: classes13.dex */
public class C2008x800f03a2 {
    private static java.lang.String zza;
    private static int zzb;

    private C2008x800f03a2() {
    }

    /* renamed from: getMyProcessName */
    public static java.lang.String m18616x5d999098() {
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
                        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(readLine);
                        str = readLine.trim();
                    } catch (java.io.IOException unused2) {
                    } catch (java.lang.Throwable th7) {
                        th = th7;
                        bufferedReader2 = bufferedReader;
                        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C2001xa159df2b.m18580xd71209a9(bufferedReader2);
                        throw th;
                    }
                    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C2001xa159df2b.m18580xd71209a9(bufferedReader);
                }
                zza = str;
            }
        }
        return zza;
    }
}
