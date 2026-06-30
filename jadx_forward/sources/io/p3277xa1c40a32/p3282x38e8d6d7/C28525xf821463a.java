package io.p3277xa1c40a32.p3282x38e8d6d7;

/* renamed from: io.clipworks.corekit.SimpleDateFormatUtils */
/* loaded from: classes12.dex */
public class C28525xf821463a {
    /* renamed from: getTimeStringByFormatAndLocale */
    public static java.lang.String m136908xa913caf(java.lang.String str, java.lang.String format, java.lang.String localeStr) {
        dz5.a aVar = dz5.a.f327014a;
        long parseLong = java.lang.Long.parseLong(str);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(format, "format");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localeStr, "localeStr");
        java.util.Date date = new java.util.Date(parseLong);
        try {
            java.util.Locale locale = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(localeStr, "zh_CN") ? java.util.Locale.CHINA : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(localeStr, "en_US") ? java.util.Locale.US : null;
            java.lang.String format2 = new java.text.SimpleDateFormat(format, locale == null ? java.util.Locale.CHINA : locale).format(date);
            return !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(locale, java.util.Locale.CHINA) ? format2 : aVar.a(format2);
        } catch (java.lang.Exception e17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.m("formatTimestamp: ", e17);
            return null;
        }
    }
}
