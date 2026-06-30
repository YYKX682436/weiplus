package p9;

/* loaded from: classes15.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.regex.Pattern f434386a = java.util.regex.Pattern.compile("^NOTE(( |\t).*)?$");

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.regex.Pattern f434387b = java.util.regex.Pattern.compile("^\ufeff?WEBVTT(( |\t).*)?$");

    public static float a(java.lang.String str) {
        if (str.endsWith("%")) {
            return java.lang.Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new java.lang.NumberFormatException("Percentages must end with %");
    }

    public static long b(java.lang.String str) {
        java.lang.String[] split = str.split("\\.", 2);
        long j17 = 0;
        for (java.lang.String str2 : split[0].split(":")) {
            j17 = (j17 * 60) + java.lang.Long.parseLong(str2);
        }
        return ((j17 * 1000) + java.lang.Long.parseLong(split[1])) * 1000;
    }

    public static void c(t9.p pVar) {
        java.lang.String d17 = pVar.d();
        if (d17 == null || !f434387b.matcher(d17).matches()) {
            throw new i9.f("Expected WEBVTT. Got " + d17);
        }
    }
}
