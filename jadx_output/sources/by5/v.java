package by5;

/* loaded from: classes13.dex */
public abstract class v {
    static {
        new java.util.HashMap();
    }

    public static synchronized boolean a(java.lang.String str, long j17) {
        synchronized (by5.v.class) {
            if ("true".equals(com.tencent.xweb.b.m().f("dis_" + str))) {
                by5.c4.f("FrequentLimiter", "canDo, dis_" + str + " is true");
                return false;
            }
            android.content.SharedPreferences a17 = by5.d4.a("FREQUENT_LIMITER", false);
            long j18 = a17.getLong(str, 0L);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (java.lang.Math.abs(currentTimeMillis - j18) >= j17) {
                a17.edit().putLong(str, currentTimeMillis).commit();
                return true;
            }
            by5.c4.f("FrequentLimiter", "canDo, time not up for " + str);
            return false;
        }
    }

    public static synchronized boolean b(java.lang.String str) {
        synchronized (by5.v.class) {
            android.content.SharedPreferences a17 = by5.d4.a("REPORT_DAILY", true);
            java.lang.String format = new java.text.SimpleDateFormat("yyyyMMdd").format(new java.util.Date());
            if (format.equals(a17.getString(str, ""))) {
                return false;
            }
            if (!"true".equals(com.tencent.xweb.c.z().f("dis_" + str))) {
                a17.edit().putString(str, format).commit();
                return true;
            }
            by5.c4.f("FrequentLimiter", "canDoDaily, dis_" + str + " is true");
            return false;
        }
    }

    public static synchronized boolean c(java.lang.String str, java.lang.String str2) {
        synchronized (by5.v.class) {
            android.content.SharedPreferences a17 = by5.d4.a("xweb_value_changed", false);
            java.lang.String string = a17.getString(str, "");
            if (string == null) {
                string = "";
            }
            if (string.equals(str2)) {
                return false;
            }
            a17.edit().putString(str, str2).commit();
            return true;
        }
    }
}
