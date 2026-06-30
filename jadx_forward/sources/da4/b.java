package da4;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f309303a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f309304b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f309305c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f309306d;

    public b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.f309303a = str;
        this.f309304b = str2;
        this.f309305c = str3;
        this.f309306d = str4;
    }

    public final android.content.Intent a() {
        android.net.Uri parse;
        java.lang.String queryParameter;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseIntent", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketIntentNode");
        java.lang.String str = this.f309303a;
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseIntent", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketIntentNode");
            return null;
        }
        android.content.Intent intent = new android.content.Intent();
        java.lang.String str2 = this.f309305c;
        if (android.text.TextUtils.isEmpty(str2)) {
            parse = android.net.Uri.parse(str);
            str2 = parse.getQueryParameter(dm.i4.f66865x76d1ec5a);
            if (android.text.TextUtils.isEmpty(str2)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseIntent", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketIntentNode");
                return null;
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("estimateUri", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketIntentNode");
            parse = android.net.Uri.parse(str);
            if (!android.text.TextUtils.isEmpty(str2)) {
                java.util.Set<java.lang.String> queryParameterNames = parse.getQueryParameterNames();
                if (queryParameterNames == null || queryParameterNames.isEmpty() || !queryParameterNames.contains(dm.i4.f66865x76d1ec5a)) {
                    parse = parse.buildUpon().appendQueryParameter(dm.i4.f66865x76d1ec5a, str2).build();
                } else if (!str2.equals(parse.getQueryParameter(dm.i4.f66865x76d1ec5a))) {
                    android.net.Uri.Builder clearQuery = parse.buildUpon().clearQuery();
                    for (java.lang.String str3 : queryParameterNames) {
                        if (dm.i4.f66865x76d1ec5a.equals(str3)) {
                            clearQuery.appendQueryParameter(dm.i4.f66865x76d1ec5a, str2);
                        } else if (str3 != null && (queryParameter = parse.getQueryParameter(str3)) != null) {
                            clearQuery.appendQueryParameter(str3, queryParameter);
                        }
                    }
                    parse = clearQuery.build();
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("estimateUri", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketIntentNode");
        }
        intent.putExtra("target_app_id", str2);
        intent.setAction("android.intent.action.VIEW");
        intent.setData(parse);
        java.lang.String str4 = this.f309304b;
        if (!android.text.TextUtils.isEmpty(str4)) {
            intent.setPackage(str4);
        }
        java.lang.String str5 = this.f309306d;
        if (!android.text.TextUtils.isEmpty(str5)) {
            intent.putExtra("market_app_name", str5);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseIntent", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketIntentNode");
        return intent;
    }
}
