package c01;

/* loaded from: classes.dex */
public abstract class y1 {
    public static java.lang.String a(java.lang.String str, long j17) {
        java.lang.String str2;
        java.lang.String format = new java.text.SimpleDateFormat("ssHHmmMMddyy").format(new java.util.Date(j17));
        if (str == null || str.length() <= 1) {
            str2 = format + "fffffff";
        } else {
            str2 = format + kk.k.g(str.getBytes()).substring(0, 7);
        }
        return (str2 + java.lang.String.format("%04x", java.lang.Long.valueOf(j17 % 65535))) + ((j17 % 7) + 100);
    }
}
