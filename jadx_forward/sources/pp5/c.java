package pp5;

/* loaded from: classes8.dex */
public abstract class c {
    public static boolean a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(8);
        try {
            sb6.append(tp3.b.a("\u0085\u008b\u0089\u0082\u0084\u0084\u0083\u00ad¬°¬\u0086ªº\u008b°¸¶²½·\u008c\u00ad¡¢\u0090¥¨¤¾¢¤¥³µ³§±"));
            java.lang.String sb7 = sb6.toString();
            sb6.delete(0, sb6.length());
            sb6.append(((pp5.c.class.hashCode() >>> 31) | 1) ^ 1);
            return !sb6.toString().equals(b(sb7, sb6.toString()));
        } catch (java.lang.Throwable unused) {
            java.lang.String sb8 = sb6.toString();
            sb6.delete(0, sb6.length());
            sb6.append(((pp5.c.class.hashCode() >>> 31) | 1) ^ 1);
            return !sb6.toString().equals(b(sb8, sb6.toString()));
        }
    }

    public static java.lang.String b(java.lang.String str, java.lang.String str2) {
        return j62.e.g().a(str, str2, false, true);
    }
}
