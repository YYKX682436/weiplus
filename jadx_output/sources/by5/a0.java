package by5;

/* loaded from: classes13.dex */
public abstract class a0 {
    public static double a() {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        return calendar.get(11) + (calendar.get(12) / 60.0d);
    }

    public static double b(java.lang.String str) {
        java.lang.String[] split;
        if (!android.text.TextUtils.isEmpty(str) && (split = str.split(":")) != null && split.length != 0) {
            by5.z d17 = d(split[0]);
            if (!d17.f36615a) {
                return -1.0d;
            }
            double a17 = d17.a();
            if (split.length == 2) {
                int b17 = e(split[1]).b();
                if (b17 < 0 || b17 >= 60) {
                    return -1.0d;
                }
                a17 += (b17 * 1.0d) / 60.0d;
            }
            if (a17 >= 0.0d && a17 <= 24.0d) {
                return a17;
            }
        }
        return -1.0d;
    }

    public static long c() {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        return ((24 - calendar.get(11)) * 3600000) - (calendar.get(12) * 60000);
    }

    public static by5.z d(java.lang.String str) {
        by5.z zVar = new by5.z();
        try {
            zVar.f36616b = java.lang.Double.valueOf(java.lang.Double.parseDouble(str));
            zVar.f36615a = true;
        } catch (java.lang.Throwable th6) {
            by5.c4.d("NumberUtil", "safeParseDouble error", th6);
        }
        return zVar;
    }

    public static by5.z e(java.lang.String str) {
        by5.z zVar = new by5.z();
        if (str == null) {
            return zVar;
        }
        try {
            java.lang.String trim = str.trim();
            while (trim.startsWith("0") && trim.length() > 1) {
                trim = trim.substring(1);
            }
            zVar.f36616b = java.lang.Integer.valueOf(java.lang.Integer.parseInt(trim));
            zVar.f36615a = true;
        } catch (java.lang.Throwable th6) {
            by5.c4.d("NumberUtil", "safeParseInt error", th6);
        }
        return zVar;
    }
}
