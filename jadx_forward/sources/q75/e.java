package q75;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.regex.Pattern f442139c = java.util.regex.Pattern.compile("([a-zA-Z*-.0-9]+/[a-zA-Z*-.0-9]+)");

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f442140a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f442141b;

    public e(java.lang.String str, java.lang.String str2) {
        this.f442140a = str;
        this.f442141b = str2;
    }

    public static q75.e a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        java.util.regex.Matcher matcher = f442139c.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        java.lang.String group = matcher.group(0);
        java.lang.String trim = str.contains("charset=") ? str.substring(str.indexOf("charset=") + 8).trim() : null;
        if (android.text.TextUtils.isEmpty(trim)) {
            trim = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c;
        }
        return new q75.e(group, trim);
    }

    /* renamed from: toString */
    public java.lang.String m159584x9616526c() {
        return "ContentType{mimeType='" + this.f442140a + "', charset='" + this.f442141b + "'}";
    }
}
