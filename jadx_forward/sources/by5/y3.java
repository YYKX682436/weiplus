package by5;

/* loaded from: classes13.dex */
public abstract class y3 {
    public static java.lang.String a(android.content.Context context, int i17, java.lang.String str, java.lang.String str2) {
        java.lang.String d17 = by5.a1.d(context, "xweb_error_page.html");
        if (d17 == null) {
            return d17;
        }
        return d17.replaceAll("placeholder_errorCode", i17 + "").replaceAll("placeholder_description", java.util.regex.Matcher.quoteReplacement(str)).replaceAll("placeholder_failingUrl", java.util.regex.Matcher.quoteReplacement(str2));
    }
}
