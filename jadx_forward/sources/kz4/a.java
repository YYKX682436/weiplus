package kz4;

/* loaded from: classes12.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final kk.j f395479a = new jt0.j(30);

    /* renamed from: b, reason: collision with root package name */
    public static android.text.Spanned f395480b = null;

    public static android.text.Spanned a(java.lang.String str) {
        android.text.Spanned spanned;
        if (str == null) {
            str = "";
        }
        java.lang.String replaceAll = java.util.regex.Pattern.compile("\n", 2).matcher(str).replaceAll("<br/>");
        java.lang.String concat = !replaceAll.startsWith("<html>") ? "<html>".concat(replaceAll) : replaceAll;
        if (!concat.endsWith("</html>")) {
            concat = concat.concat("</html>");
        }
        android.text.Spanned spanned2 = null;
        try {
            f395480b = null;
            spanned = android.text.Html.fromHtml(concat, null, new kz4.m());
        } catch (java.lang.Throwable unused) {
            spanned = f395480b;
            if (spanned == null) {
                spanned = null;
            }
        }
        if (spanned != null) {
            int length = spanned.toString().length();
            if (length > 1 && spanned.toString().endsWith("\n")) {
                if (spanned.getSpans(length, length, android.text.style.ParagraphStyle.class).length > 0) {
                    spanned2 = (android.text.Spanned) spanned.subSequence(0, length - 1);
                } else {
                    int i17 = length - 1;
                    if (spanned.getSpans(i17, length, kz4.f.class).length > 0) {
                        spanned = (android.text.Spanned) spanned.subSequence(0, i17);
                    }
                }
            }
            spanned2 = spanned;
        }
        ((lt0.f) f395479a).put(replaceAll, spanned2);
        return spanned2;
    }
}
