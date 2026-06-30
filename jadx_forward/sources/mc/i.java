package mc;

/* loaded from: classes14.dex */
public abstract class i {
    public static android.content.Context a(android.content.Context context, java.util.Locale locale) {
        if (context == null) {
            mc.p.f407064a.e("LanguageManager", "update locale, but context is null.");
            return null;
        }
        mc.p.f407064a.b("LanguageManager", "country: " + locale.getCountry() + " language: " + locale.getLanguage());
        android.content.res.Configuration configuration = context.getResources().getConfiguration();
        configuration.setLocale(locale);
        return context.createConfigurationContext(configuration);
    }
}
