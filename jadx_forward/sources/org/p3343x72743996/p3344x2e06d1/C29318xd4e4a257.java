package org.p3343x72743996.p3344x2e06d1;

/* renamed from: org.chromium.base.LocaleUtils */
/* loaded from: classes13.dex */
public class C29318xd4e4a257 {

    /* renamed from: org.chromium.base.LocaleUtils$ApisN */
    /* loaded from: classes13.dex */
    public static class ApisN {
        /* renamed from: prependToLocaleList */
        public static android.os.LocaleList m152490x8ca04da1(java.lang.String str, android.os.LocaleList localeList) {
            return android.os.LocaleList.forLanguageTags(java.lang.String.format("%1$s,%2$s", str, localeList.toLanguageTags().replaceFirst(java.lang.String.format("(^|,)%1$s$|%1$s,", str), "")));
        }

        /* renamed from: setConfigLocales */
        public static void m152491x457f2675(android.content.Context context, android.content.res.Configuration configuration, java.lang.String str) {
            configuration.setLocales(m152490x8ca04da1(str, context.getResources().getConfiguration().getLocales()));
        }

        /* renamed from: setLocaleList */
        public static void m152492x6a5c7c1a(android.content.res.Configuration configuration) {
            android.os.LocaleList.setDefault(configuration.getLocales());
        }
    }

    private C29318xd4e4a257() {
    }

    /* renamed from: forLanguageTag */
    public static java.util.Locale m152474xf39d4899(java.lang.String str) {
        return m152482xaf4bf605(java.util.Locale.forLanguageTag(str));
    }

    /* renamed from: getConfigurationLanguage */
    public static java.lang.String m152475xbb9ae8b8(android.content.res.Configuration configuration) {
        java.util.Locale locale = configuration.locale;
        return locale != null ? locale.toLanguageTag() : "";
    }

    /* renamed from: getContextLanguage */
    public static java.lang.String m152476x9f88dff1(android.content.Context context) {
        return m152475xbb9ae8b8(context.getResources().getConfiguration());
    }

    /* renamed from: getDefaultCountryCode */
    private static java.lang.String m152477xfd212f98() {
        org.p3343x72743996.p3344x2e06d1.AbstractC29292xc4d0dbf m152292x9cf0d20b = org.p3343x72743996.p3344x2e06d1.AbstractC29292xc4d0dbf.m152292x9cf0d20b();
        return m152292x9cf0d20b.mo152309xefec5a6e(org.p3343x72743996.p3344x2e06d1.C29284xa13724f3.f73147x48e1081a) ? m152292x9cf0d20b.mo152306x583a9167(org.p3343x72743996.p3344x2e06d1.C29284xa13724f3.f73147x48e1081a) : java.util.Locale.getDefault().getCountry();
    }

    /* renamed from: getDefaultLocaleListString */
    public static java.lang.String m152478x5064b074() {
        return m152488x506b51ac(android.os.LocaleList.getDefault());
    }

    /* renamed from: getDefaultLocaleString */
    public static java.lang.String m152479xac15cb6() {
        return m152487x86b923a7(java.util.Locale.getDefault());
    }

    /* renamed from: getUpdatedLanguageForAndroid */
    public static java.lang.String m152480xd749c043(java.lang.String str) {
        str.getClass();
        return !str.equals("fil") ? !str.equals("und") ? str : "" : "tl";
    }

    /* renamed from: getUpdatedLanguageForChromium */
    public static java.lang.String m152481xbc03ea42(java.lang.String str) {
        str.getClass();
        char c17 = 65535;
        switch (str.hashCode()) {
            case 3365:
                if (str.equals("in")) {
                    c17 = 0;
                    break;
                }
                break;
            case 3374:
                if (str.equals("iw")) {
                    c17 = 1;
                    break;
                }
                break;
            case 3391:
                if (str.equals("ji")) {
                    c17 = 2;
                    break;
                }
                break;
            case 3405:
                if (str.equals("jw")) {
                    c17 = 3;
                    break;
                }
                break;
            case 3704:
                if (str.equals("tl")) {
                    c17 = 4;
                    break;
                }
                break;
            case 102533:
                if (str.equals("gom")) {
                    c17 = 5;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
                return dm.i4.f66865x76d1ec5a;
            case 1:
                return "he";
            case 2:
                return "yi";
            case 3:
                return "jv";
            case 4:
                return "fil";
            case 5:
                return "kok";
            default:
                return str;
        }
    }

    /* renamed from: getUpdatedLocaleForAndroid */
    public static java.util.Locale m152482xaf4bf605(java.util.Locale locale) {
        java.lang.String language = locale.getLanguage();
        java.lang.String m152480xd749c043 = m152480xd749c043(language);
        return m152480xd749c043.equals(language) ? locale : new java.util.Locale.Builder().setLocale(locale).setLanguage(m152480xd749c043).build();
    }

    /* renamed from: getUpdatedLocaleForChromium */
    public static java.util.Locale m152483xe4486cc0(java.util.Locale locale) {
        java.lang.String language = locale.getLanguage();
        java.lang.String m152481xbc03ea42 = m152481xbc03ea42(language);
        return m152481xbc03ea42.equals(language) ? locale : new java.util.Locale.Builder().setLocale(locale).setLanguage(m152481xbc03ea42).build();
    }

    /* renamed from: isBaseLanguageEqual */
    public static boolean m152484x7c28ab61(java.lang.String str, java.lang.String str2) {
        return android.text.TextUtils.equals(m152486x96e1f64(str), m152486x96e1f64(str2));
    }

    /* renamed from: setDefaultLocalesFromConfiguration */
    public static void m152485x6f5347b2(android.content.res.Configuration configuration) {
        org.p3343x72743996.p3344x2e06d1.C29318xd4e4a257.ApisN.m152492x6a5c7c1a(configuration);
    }

    /* renamed from: toBaseLanguage */
    public static java.lang.String m152486x96e1f64(java.lang.String str) {
        int indexOf = str.indexOf(45);
        return indexOf < 0 ? str : str.substring(0, indexOf);
    }

    /* renamed from: toLanguageTag */
    public static java.lang.String m152487x86b923a7(java.util.Locale locale) {
        java.lang.String m152481xbc03ea42 = m152481xbc03ea42(locale.getLanguage());
        java.lang.String country = locale.getCountry();
        if (m152481xbc03ea42.equals("no") && country.equals("NO") && locale.getVariant().equals("NY")) {
            return "nn-NO";
        }
        if (country.isEmpty()) {
            return m152481xbc03ea42;
        }
        return m152481xbc03ea42 + "-" + country;
    }

    /* renamed from: toLanguageTags */
    public static java.lang.String m152488x506b51ac(android.os.LocaleList localeList) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < localeList.size(); i17++) {
            arrayList.add(m152487x86b923a7(m152483xe4486cc0(localeList.get(i17))));
        }
        return android.text.TextUtils.join(",", arrayList);
    }

    /* renamed from: updateConfig */
    public static void m152489xac5f2d6b(android.content.Context context, android.content.res.Configuration configuration, java.lang.String str) {
        org.p3343x72743996.p3344x2e06d1.C29318xd4e4a257.ApisN.m152491x457f2675(context, configuration, str);
    }
}
