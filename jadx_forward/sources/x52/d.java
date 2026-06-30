package x52;

/* loaded from: classes13.dex */
public abstract class d {
    public static java.lang.String a(java.lang.String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        if ("-1".equals(str)) {
            return "-1";
        }
        java.lang.String[] split = str.split("@");
        if (split.length <= 1) {
            return null;
        }
        return split[1];
    }

    public static long b(java.lang.String str) {
        if (str == null || str.isEmpty()) {
            return 0L;
        }
        if ("-1".equals(str)) {
            return -1L;
        }
        return java.lang.Long.valueOf(str.split("@")[0]).longValue();
    }
}
