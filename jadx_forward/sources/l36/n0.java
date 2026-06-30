package l36;

/* loaded from: classes8.dex */
public final class n0 {

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.regex.Pattern f397087b = java.util.regex.Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.regex.Pattern f397088c = java.util.regex.Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f397089a;

    public n0(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.f397089a = str;
    }

    public static l36.n0 a(java.lang.String str) {
        java.util.regex.Matcher matcher = f397087b.matcher(str);
        if (!matcher.lookingAt()) {
            throw new java.lang.IllegalArgumentException("No subtype found for: \"" + str + '\"');
        }
        java.lang.String group = matcher.group(1);
        java.util.Locale locale = java.util.Locale.US;
        java.lang.String lowerCase = group.toLowerCase(locale);
        java.lang.String lowerCase2 = matcher.group(2).toLowerCase(locale);
        java.util.regex.Matcher matcher2 = f397088c.matcher(str);
        java.lang.String str2 = null;
        for (int end = matcher.end(); end < str.length(); end = matcher2.end()) {
            matcher2.region(end, str.length());
            if (!matcher2.lookingAt()) {
                throw new java.lang.IllegalArgumentException("Parameter is not formatted correctly: \"" + str.substring(end) + "\" for: \"" + str + '\"');
            }
            java.lang.String group2 = matcher2.group(1);
            if (group2 != null && group2.equalsIgnoreCase("charset")) {
                java.lang.String group3 = matcher2.group(2);
                if (group3 == null) {
                    group3 = matcher2.group(3);
                } else if (group3.startsWith("'") && group3.endsWith("'") && group3.length() > 2) {
                    group3 = group3.substring(1, group3.length() - 1);
                }
                if (str2 != null && !group3.equalsIgnoreCase(str2)) {
                    throw new java.lang.IllegalArgumentException("Multiple charsets defined: \"" + str2 + "\" and: \"" + group3 + "\" for: \"" + str + '\"');
                }
                str2 = group3;
            }
        }
        return new l36.n0(str, lowerCase, lowerCase2, str2);
    }

    /* renamed from: equals */
    public boolean m145034xb2c87fbf(java.lang.Object obj) {
        return (obj instanceof l36.n0) && ((l36.n0) obj).f397089a.equals(this.f397089a);
    }

    /* renamed from: hashCode */
    public int m145035x8cdac1b() {
        return this.f397089a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m145036x9616526c() {
        return this.f397089a;
    }
}
