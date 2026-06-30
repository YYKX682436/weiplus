package io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff;

/* renamed from: io.flutter.embedding.engine.systemchannels.LocalizationChannel */
/* loaded from: classes13.dex */
public class C28659x3a87280a {
    private static final java.lang.String TAG = "LocalizationChannel";

    /* renamed from: channel */
    public final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 f71315x2c0b7d03;

    /* renamed from: handler */
    public final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler f71316x294b574a;

    /* renamed from: localizationMessageHandler */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28659x3a87280a.LocalizationMessageHandler f71317x98d1bc3c;

    /* renamed from: io.flutter.embedding.engine.systemchannels.LocalizationChannel$LocalizationMessageHandler */
    /* loaded from: classes13.dex */
    public interface LocalizationMessageHandler {
        /* renamed from: getStringResource */
        java.lang.String mo138185x861eb435(java.lang.String str, java.lang.String str2);
    }

    public C28659x3a87280a(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192 c28604xeb2eb192) {
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler methodCallHandler = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.LocalizationChannel.1
            @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler
            /* renamed from: onMethodCall */
            public void mo294x9bfdc61e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
                if (io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28659x3a87280a.this.f71317x98d1bc3c == null) {
                    return;
                }
                java.lang.String str = c28687x4bb242ff.f71610xbfc5d0e1;
                str.getClass();
                if (!str.equals("Localization.getStringResource")) {
                    result.mo65719xbc9fa82f();
                    return;
                }
                org.json.JSONObject jSONObject = (org.json.JSONObject) c28687x4bb242ff.m138434x86ac7956();
                try {
                    result.mo65720x90b54003(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28659x3a87280a.this.f71317x98d1bc3c.mo138185x861eb435(jSONObject.getString("key"), jSONObject.has("locale") ? jSONObject.getString("locale") : null));
                } catch (org.json.JSONException e17) {
                    result.mo65718x5c4d208("error", e17.getMessage(), null);
                }
            }
        };
        this.f71316x294b574a = methodCallHandler;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2(c28604xeb2eb192, "flutter/localization", io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28684x5180d5ad.f71608x4fbc8495);
        this.f71315x2c0b7d03 = c28688xe8dbe4c2;
        c28688xe8dbe4c2.m138441xdf757329(methodCallHandler);
    }

    /* renamed from: sendLocales */
    public void m138183x4777cb1(java.util.List<java.util.Locale> list) {
        io.p3284xd2ae381c.Log.v(TAG, "Sending Locales to Flutter.");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Locale locale : list) {
            io.p3284xd2ae381c.Log.v(TAG, "Locale (Language: " + locale.getLanguage() + ", Country: " + locale.getCountry() + ", Variant: " + locale.getVariant() + ")");
            arrayList.add(locale.getLanguage());
            arrayList.add(locale.getCountry());
            arrayList.add(locale.getScript());
            arrayList.add(locale.getVariant());
        }
        this.f71315x2c0b7d03.m138438xd8c5c779("setLocale", arrayList);
    }

    /* renamed from: setLocalizationMessageHandler */
    public void m138184xe7be7e3e(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28659x3a87280a.LocalizationMessageHandler localizationMessageHandler) {
        this.f71317x98d1bc3c = localizationMessageHandler;
    }
}
