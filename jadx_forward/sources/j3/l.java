package j3;

/* loaded from: classes13.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Locale[] f378870a = {new java.util.Locale("en", "XA"), new java.util.Locale("ar", "XB")};

    public static java.util.Locale a(java.lang.String str) {
        return java.util.Locale.forLanguageTag(str);
    }

    public static boolean b(java.util.Locale locale, java.util.Locale locale2) {
        boolean z17;
        boolean z18;
        if (locale.equals(locale2)) {
            return true;
        }
        if (!locale.getLanguage().equals(locale2.getLanguage())) {
            return false;
        }
        java.util.Locale[] localeArr = f378870a;
        int length = localeArr.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                z17 = false;
                break;
            }
            if (localeArr[i17].equals(locale)) {
                z17 = true;
                break;
            }
            i17++;
        }
        if (!z17) {
            int length2 = localeArr.length;
            int i18 = 0;
            while (true) {
                if (i18 >= length2) {
                    z18 = false;
                    break;
                }
                if (localeArr[i18].equals(locale2)) {
                    z18 = true;
                    break;
                }
                i18++;
            }
            if (!z18) {
                java.lang.String c17 = l3.c.c(l3.c.a(l3.c.b(locale)));
                if (!c17.isEmpty()) {
                    return c17.equals(l3.c.c(l3.c.a(l3.c.b(locale2))));
                }
                java.lang.String country = locale.getCountry();
                return country.isEmpty() || country.equals(locale2.getCountry());
            }
        }
        return false;
    }
}
