package io.p3284xd2ae381c.p3301xc5476f33.p3304xcf99c699;

/* renamed from: io.flutter.plugin.localization.LocalizationPlugin */
/* loaded from: classes13.dex */
public class C28703xa4b6c74c {

    /* renamed from: context */
    private final android.content.Context f71734x38b735af;

    /* renamed from: localizationChannel */
    private final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28659x3a87280a f71735xefd3602a;

    /* renamed from: localizationMessageHandler */
    final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28659x3a87280a.LocalizationMessageHandler f71736x98d1bc3c;

    public C28703xa4b6c74c(android.content.Context context, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28659x3a87280a c28659x3a87280a) {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28659x3a87280a.LocalizationMessageHandler localizationMessageHandler = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28659x3a87280a.LocalizationMessageHandler() { // from class: io.flutter.plugin.localization.LocalizationPlugin.1
            @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28659x3a87280a.LocalizationMessageHandler
            /* renamed from: getStringResource */
            public java.lang.String mo138185x861eb435(java.lang.String str, java.lang.String str2) {
                android.content.Context context2 = io.p3284xd2ae381c.p3301xc5476f33.p3304xcf99c699.C28703xa4b6c74c.this.f71734x38b735af;
                if (str2 != null) {
                    java.util.Locale m138569xccb5be55 = io.p3284xd2ae381c.p3301xc5476f33.p3304xcf99c699.C28703xa4b6c74c.m138569xccb5be55(str2);
                    android.content.res.Configuration configuration = new android.content.res.Configuration(io.p3284xd2ae381c.p3301xc5476f33.p3304xcf99c699.C28703xa4b6c74c.this.f71734x38b735af.getResources().getConfiguration());
                    configuration.setLocale(m138569xccb5be55);
                    context2 = io.p3284xd2ae381c.p3301xc5476f33.p3304xcf99c699.C28703xa4b6c74c.this.f71734x38b735af.createConfigurationContext(configuration);
                }
                int identifier = context2.getResources().getIdentifier(str, "string", io.p3284xd2ae381c.p3301xc5476f33.p3304xcf99c699.C28703xa4b6c74c.this.f71734x38b735af.getPackageName());
                if (identifier != 0) {
                    return context2.getResources().getString(identifier);
                }
                return null;
            }
        };
        this.f71736x98d1bc3c = localizationMessageHandler;
        this.f71734x38b735af = context;
        this.f71735xefd3602a = c28659x3a87280a;
        c28659x3a87280a.m138184xe7be7e3e(localizationMessageHandler);
    }

    /* renamed from: localeFromString */
    public static java.util.Locale m138569xccb5be55(java.lang.String str) {
        java.util.Locale.Builder builder = new java.util.Locale.Builder();
        java.lang.String[] split = str.replace('_', '-').split("-");
        builder.setLanguage(split[0]);
        int i17 = 1;
        if (split.length > 1 && split[1].length() == 4) {
            builder.setScript(split[1]);
            i17 = 2;
        }
        if (split.length > i17 && split[i17].length() >= 2 && split[i17].length() <= 3) {
            builder.setRegion(split[i17]);
        }
        return builder.build();
    }

    /* renamed from: resolveNativeLocale */
    public java.util.Locale m138570xd934f15d(java.util.List<java.util.Locale> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (android.os.Build.VERSION.SDK_INT < 26) {
            android.os.LocaleList locales = this.f71734x38b735af.getResources().getConfiguration().getLocales();
            for (int i17 = 0; i17 < locales.size(); i17++) {
                java.util.Locale locale = locales.get(i17);
                for (java.util.Locale locale2 : list) {
                    if (locale.equals(locale2)) {
                        return locale2;
                    }
                }
                for (java.util.Locale locale3 : list) {
                    if (locale.getLanguage().equals(locale3.toLanguageTag())) {
                        return locale3;
                    }
                }
                for (java.util.Locale locale4 : list) {
                    if (locale.getLanguage().equals(locale4.getLanguage())) {
                        return locale4;
                    }
                }
            }
            return list.get(0);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.os.LocaleList locales2 = this.f71734x38b735af.getResources().getConfiguration().getLocales();
        int size = locales2.size();
        for (int i18 = 0; i18 < size; i18++) {
            java.util.Locale locale5 = locales2.get(i18);
            java.lang.String language = locale5.getLanguage();
            if (!locale5.getScript().isEmpty()) {
                language = language + "-" + locale5.getScript();
            }
            if (!locale5.getCountry().isEmpty()) {
                language = language + "-" + locale5.getCountry();
            }
            arrayList.add(new java.util.Locale.LanguageRange(language));
            arrayList.add(new java.util.Locale.LanguageRange(locale5.getLanguage()));
            arrayList.add(new java.util.Locale.LanguageRange(locale5.getLanguage() + "-*"));
        }
        java.util.Locale lookup = java.util.Locale.lookup(arrayList, list);
        return lookup != null ? lookup : list.get(0);
    }

    /* renamed from: sendLocalesToFlutter */
    public void m138571x71f8eb70(android.content.res.Configuration configuration) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.os.LocaleList locales = configuration.getLocales();
        int size = locales.size();
        for (int i17 = 0; i17 < size; i17++) {
            arrayList.add(locales.get(i17));
        }
        this.f71735xefd3602a.m138183x4777cb1(arrayList);
    }
}
