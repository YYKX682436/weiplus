package j51;

/* loaded from: classes11.dex */
public abstract class a {
    public static int a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        try {
            new java.io.File(str3).deleteOnExit();
            int m48586x6582048 = com.p314xaae8f345.mm.p998xbc2a843b.p999x5e8986d.C11318x7f721ce0.m48586x6582048(str, str2, str3, 262144L);
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("HdiffApk-CmdUtils", "hpatchz = code = " + m48586x6582048);
            return m48586x6582048;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("HdiffApk-CmdUtils", "hpatchz e = " + e17);
            return 999;
        }
    }
}
