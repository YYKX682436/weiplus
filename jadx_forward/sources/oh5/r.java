package oh5;

/* loaded from: classes12.dex */
public abstract class r {
    public static final long a(java.lang.String str) {
        try {
            java.util.Date parse = new java.text.SimpleDateFormat("yyyy-MM-dd", java.util.Locale.getDefault()).parse(str);
            if (parse != null) {
                return parse.getTime();
            }
            return 0L;
        } catch (java.lang.Throwable th6) {
            oj.j.d("Matrix.Safe", th6, "", new java.lang.Object[0]);
            return 0L;
        }
    }

    public static final oh5.q b(java.lang.Object obj) {
        return new oh5.q(obj, a("9999-11-11"));
    }
}
