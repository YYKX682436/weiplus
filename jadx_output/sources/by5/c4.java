package by5;

/* loaded from: classes13.dex */
public abstract class c4 {

    /* renamed from: a, reason: collision with root package name */
    public static by5.w f36423a;

    /* renamed from: b, reason: collision with root package name */
    public static final int f36424b = android.os.Process.myPid();

    public static void a(java.lang.String str, java.lang.String str2) {
        if (str2 == null || str2.isEmpty()) {
            return;
        }
        f(str, str2);
        if (org.xwalk.core.XWalkEnvironment.isTurnOnKVLog) {
            java.lang.String str3 = " " + str + com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LOG + str2;
            java.lang.String str4 = f36424b + com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LOG + new java.text.SimpleDateFormat("MM-dd hh:mm:ss").format(new java.util.Date()) + com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LOG + str3;
            android.content.SharedPreferences a17 = by5.d4.a("UPDATELOG", true);
            try {
                java.lang.String str5 = str4 + "\n" + a17.getString("log", "");
                if (str5.length() > 10240) {
                    str5 = str5.substring(0, 5120);
                }
                a17.edit().putString("log", str5).apply();
            } catch (java.lang.Throwable th6) {
                d("XWebLog", "addInitializeLog error", th6);
            }
        }
    }

    public static void b(java.lang.String str, java.lang.String str2) {
        e(str);
        by5.w wVar = f36423a;
        if (wVar != null) {
            wVar.getClass();
        }
    }

    public static void c(java.lang.String str, java.lang.String str2) {
        java.lang.String e17 = e(str);
        by5.w wVar = f36423a;
        if (wVar != null) {
            ((com.tencent.mm.xwebutil.z) wVar).getClass();
            com.tencent.mars.xlog.Log.e(e17, str2);
        }
    }

    public static void d(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        java.lang.String e17 = e(str);
        by5.w wVar = f36423a;
        if (wVar != null) {
            ((com.tencent.mm.xwebutil.z) wVar).getClass();
            com.tencent.mars.xlog.Log.printErrStackTrace(e17, th6, str2, new java.lang.Object[0]);
        }
    }

    public static java.lang.String e(java.lang.String str) {
        if (str != null && str.startsWith("MicroMsg")) {
            return str;
        }
        if (str != null && str.startsWith("XWeb.Core")) {
            return str;
        }
        return "XWeb.SDK." + str;
    }

    public static void f(java.lang.String str, java.lang.String str2) {
        java.lang.String e17 = e(str);
        by5.w wVar = f36423a;
        if (wVar != null) {
            ((com.tencent.mm.xwebutil.z) wVar).getClass();
            com.tencent.mars.xlog.Log.i(e17, str2);
        }
    }

    public static void g(java.lang.String str, java.lang.String str2) {
        java.lang.String e17 = e(str);
        by5.w wVar = f36423a;
        if (wVar != null) {
            ((com.tencent.mm.xwebutil.z) wVar).getClass();
            com.tencent.mars.xlog.Log.w(e17, str2);
        }
    }
}
