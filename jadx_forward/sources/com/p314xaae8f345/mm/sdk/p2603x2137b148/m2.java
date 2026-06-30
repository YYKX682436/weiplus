package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes12.dex */
public abstract class m2 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.List f274380a = java.util.Arrays.asList("zh_CN", "en");

    /* renamed from: b, reason: collision with root package name */
    public static java.util.Locale f274381b;

    static {
        java.util.Locale locale = android.os.LocaleList.getDefault().get(0);
        f274381b = locale;
        java.util.Locale.setDefault(locale);
    }

    public static java.lang.String a(java.lang.String str) {
        java.lang.String trim = java.util.Locale.getDefault().getLanguage().trim();
        java.lang.String str2 = trim + "_" + java.util.Locale.getDefault().getCountry().trim();
        java.lang.String trim2 = java.util.Locale.getDefault().getScript().trim();
        return trim.equals("en") ? trim : (trim2 == null || !trim2.equals("Hans")) ? (trim2 == null || !trim2.equals("Hant")) ? str2.equals("zh_TW") ? "zh_TW" : str2.equals("zh_HK") ? "zh_HK" : (str2.equals("zh_CN") || "zh".equals(trim)) ? "zh_CN" : com.p314xaae8f345.mm.sdk.p2603x2137b148.x9.c() ? str : trim.equals("th") ? "th" : (trim.equals(dm.i4.f66865x76d1ec5a) || trim.equals("in")) ? dm.i4.f66865x76d1ec5a : trim.equals("vi") ? "vi" : trim.equals("pt") ? "pt" : trim.equals("es") ? "es" : trim.equals("ru") ? "ru" : trim.equals("ar") ? "ar" : trim.equals("ja") ? "ja" : trim.equals("it") ? "it" : trim.equals("ko") ? "ko" : trim.equals("ms") ? "ms" : trim.equals("tr") ? "tr" : trim.equals("de") ? "de" : trim.equals("fr") ? "fr" : str : str2.equals("zh_TW") ? "zh_TW" : "zh_HK" : "zh_CN";
    }

    public static java.lang.String b(android.content.Context context, java.lang.String str, int i17, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str) || k(str)) {
            return str2;
        }
        java.lang.String[] stringArray = context.getResources().getStringArray(i17);
        if (stringArray.length != 19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LocaleUtil", "get translate languageName failed, language count not paired, languageName count: " + stringArray.length + ", Locales count: 19");
            return str2;
        }
        java.lang.String str3 = null;
        for (int i18 = 0; i18 < stringArray.length; i18++) {
            if (str.equalsIgnoreCase(com.p314xaae8f345.mm.sdk.p2603x2137b148.l2.f274351a[i18])) {
                str3 = stringArray[i18];
            }
        }
        return android.text.TextUtils.isEmpty(str3) ? str2 : str3;
    }

    public static java.lang.String c(android.content.Context context) {
        java.lang.String str;
        try {
            str = q(context);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LocaleUtil", th6, "getActualTranslateLanguageCode error", new java.lang.Object[0]);
            str = "language_default";
        }
        return str.equalsIgnoreCase("language_default") ? f(context) : str;
    }

    public static java.lang.String d() {
        return a("en");
    }

    public static java.lang.String e() {
        return java.util.Locale.getDefault().getCountry().trim();
    }

    public static java.lang.String f(android.content.Context context) {
        java.lang.String str;
        try {
            str = p(context.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 4), context);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LocaleUtil", th6, "getCurrentLanguage error", new java.lang.Object[0]);
            str = "language_default";
        }
        return str.equalsIgnoreCase("language_default") ? d() : str;
    }

    public static java.lang.String g(android.content.Context context, int i17, int i18) {
        java.lang.String[] stringArray = context.getResources().getStringArray(i17);
        java.lang.String p17 = p(context.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 4), context);
        if (p17 == null) {
            return context.getString(i18);
        }
        java.lang.String[] strArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.l2.f274351a;
        int i19 = 0;
        for (int i27 = 0; i27 < 19; i27++) {
            if (strArr[i27].equals(p17)) {
                return stringArray[i19];
            }
            i19++;
        }
        return context.getString(i18);
    }

    public static java.lang.String h(android.content.Context context) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).contains("language_key")) {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).getString("language_key", "language_default");
        }
        if (context == null) {
            return "language_default";
        }
        java.lang.String string = context.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 4).getString("language_key", "language_default");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).putString("language_key", string);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocaleUtil", "getSettingLanguage save Language:%s, result:%s", string, java.lang.Boolean.TRUE);
        return string;
    }

    public static java.util.Locale i(android.content.Context context) {
        java.lang.String o17 = o(context.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 4), context);
        if (o17.equals("language_default")) {
            u(context, java.util.Locale.ENGLISH);
            return java.util.Locale.getDefault();
        }
        java.util.Locale s17 = s(o17);
        u(context, s17);
        return s17;
    }

    public static boolean j() {
        java.lang.String d17 = d();
        return d17.equals("zh_CN") || d17.equals("zh_TW") || d17.equals("zh_HK");
    }

    public static boolean k(java.lang.String str) {
        if (str == null || str.trim().isEmpty()) {
            return false;
        }
        return str.equalsIgnoreCase("language_default");
    }

    public static boolean l(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        return str.equalsIgnoreCase("zh_TW") || str.equalsIgnoreCase("zh_HK") || str.equalsIgnoreCase("zh_CN") || str.equalsIgnoreCase("en") || str.equalsIgnoreCase("th") || str.equals(dm.i4.f66865x76d1ec5a) || str.equals("in") || str.equals("vi") || str.equalsIgnoreCase("pt") || str.equalsIgnoreCase("es") || str.equalsIgnoreCase("ru") || str.equalsIgnoreCase("ar") || str.equalsIgnoreCase("ja") || str.equalsIgnoreCase("it") || str.equalsIgnoreCase("ko") || str.equalsIgnoreCase("ms") || str.equalsIgnoreCase("tr") || str.equalsIgnoreCase("de") || str.equalsIgnoreCase("fr");
    }

    public static boolean m() {
        return d().equals("zh_CN");
    }

    public static boolean n() {
        return d().equals("zh_TW") || d().equals("zh_HK");
    }

    public static java.lang.String o(android.content.SharedPreferences sharedPreferences, android.content.Context context) {
        java.lang.String h17 = h(context);
        if (h17.length() > 0 && !h17.equals("language_default")) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.e8.a("language_key", h17);
            return h17;
        }
        java.lang.String a17 = a("en");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.e8.a("language_key", a17);
        return a17;
    }

    public static java.lang.String p(android.content.SharedPreferences sharedPreferences, android.content.Context context) {
        java.lang.String h17 = h(context);
        return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h17) ? h17 : "language_default";
    }

    public static java.lang.String q(android.content.Context context) {
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).getString("translate_language_code_key", null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocaleUtil", "loadTranslateLanguageSettings, languageCode: " + string);
        if (string != null && !string.trim().isEmpty()) {
            return string;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LocaleUtil", "loadTranslateLanguageSettings, translate languageCode not exits, returns default.");
        return "language_default";
    }

    public static boolean r(android.content.Context context, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LocaleUtil", "will save translate languageCode: " + str);
        if (android.text.TextUtils.isEmpty(str)) {
            str = "language_default";
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).putString("translate_language_code_key", str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LocaleUtil", "save translate languageCode successfully.");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.e8.a("translate_language_code_key", str);
        return true;
    }

    public static java.util.Locale s(java.lang.String str) {
        if (str.equals("zh_TW")) {
            return java.util.Locale.TAIWAN;
        }
        if (str.equals("zh_HK")) {
            return new java.util.Locale("zh", "HK");
        }
        if (str.equals("en")) {
            return java.util.Locale.ENGLISH;
        }
        if (str.equals("zh_CN")) {
            return java.util.Locale.CHINA;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x9.c()) {
            return java.util.Locale.ENGLISH;
        }
        if (str.equalsIgnoreCase("th") || str.equalsIgnoreCase(dm.i4.f66865x76d1ec5a) || str.equalsIgnoreCase("in") || str.equalsIgnoreCase("vi") || str.equalsIgnoreCase("pt") || str.equalsIgnoreCase("es") || str.equalsIgnoreCase("ru") || str.equalsIgnoreCase("ar") || str.equalsIgnoreCase("ja") || str.equalsIgnoreCase("it") || str.equalsIgnoreCase("ko") || str.equalsIgnoreCase("ms") || str.equalsIgnoreCase("tr") || str.equalsIgnoreCase("de") || str.equalsIgnoreCase("fr")) {
            return new java.util.Locale(str);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LocaleUtil", "transLanguageToLocale country = ".concat(str));
        return java.util.Locale.ENGLISH;
    }

    public static java.lang.String t(java.util.Locale locale) {
        java.lang.String language = locale.getLanguage();
        java.lang.String script = locale.getScript();
        java.lang.String upperCase = locale.getCountry().toUpperCase();
        if (script != null && script.equals("Hans")) {
            return "zh_CN";
        }
        if (script != null && script.equals("Hant")) {
            return (upperCase == null || !upperCase.equals("TW")) ? "zh_HK" : "zh_TW";
        }
        if (!language.equals("zh")) {
            return language;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(upperCase)) {
            return "zh_CN";
        }
        return language + "_" + upperCase;
    }

    public static void u(android.content.Context context, java.util.Locale locale) {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocaleUtil", "updateApplicationResourceLocale:" + locale.getLanguage() + " locale: " + locale.getLanguage());
            android.content.res.Resources resources = context.getResources();
            android.content.res.Configuration configuration = resources.getConfiguration();
            android.util.DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            configuration.locale = locale;
            resources.updateConfiguration(configuration, displayMetrics);
            android.content.res.Resources.getSystem().updateConfiguration(configuration, displayMetrics);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.a9.f273996a = t(locale);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.q9.a();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.h9 h9Var = com.p314xaae8f345.mm.sdk.p2603x2137b148.p9.f274468a.f274400a;
            if (h9Var != null) {
                h9Var.mo13963xc84a8199();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LocaleUtil", e17, "updateApplicationResourceLocale err~~~", new java.lang.Object[0]);
        }
    }
}
