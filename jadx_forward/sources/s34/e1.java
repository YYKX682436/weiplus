package s34;

/* loaded from: classes4.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f484159a;

    /* renamed from: b, reason: collision with root package name */
    public int f484160b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f484161c = new java.util.ArrayList();

    public static final s34.e1 b(java.util.Map values, java.lang.String prefKey) {
        java.lang.Object m143895xf1229813;
        s34.e1 e1Var;
        java.lang.Object m143895xf12298132;
        java.lang.Integer h17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.adxml.CollectedAdInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.adxml.CollectedAdInfo$Companion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prefKey, "prefKey");
        if (values.containsKey(prefKey)) {
            s34.e1 e1Var2 = new s34.e1();
            boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b("1", values.get(prefKey.concat(".isCollectedAd")));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCollectedAd", "com.tencent.mm.plugin.sns.ad.adxml.CollectedAdInfo");
            e1Var2.f484159a = b17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCollectedAd", "com.tencent.mm.plugin.sns.ad.adxml.CollectedAdInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setThemeId", "com.tencent.mm.plugin.sns.ad.adxml.CollectedAdInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setThemeId", "com.tencent.mm.plugin.sns.ad.adxml.CollectedAdInfo");
            java.lang.String str = (java.lang.String) values.get(prefKey.concat(".collectedAdType"));
            int intValue = (str == null || (h17 = r26.h0.h(str)) == null) ? 0 : h17.intValue();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCollectedAdType", "com.tencent.mm.plugin.sns.ad.adxml.CollectedAdInfo");
            e1Var2.f484160b = intValue;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCollectedAdType", "com.tencent.mm.plugin.sns.ad.adxml.CollectedAdInfo");
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                java.lang.String str2 = (java.lang.String) values.get(prefKey.concat(".subAdItemListString"));
                if (str2 == null) {
                    str2 = "";
                }
                boolean z17 = str2.length() > 0;
                jz5.f0 f0Var = jz5.f0.f384359a;
                if (z17) {
                    try {
                        org.json.JSONArray jSONArray = new org.json.JSONArray(str2);
                        int min = java.lang.Math.min(jSONArray.length(), 9);
                        for (int i17 = 0; i17 < min; i17++) {
                            java.util.List a17 = e1Var2.a();
                            s34.u1 u1Var = s34.v1.f484320m;
                            org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "getJSONObject(...)");
                            ((java.util.ArrayList) a17).add(u1Var.a(jSONObject));
                        }
                        m143895xf12298132 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var);
                    } catch (java.lang.Throwable th6) {
                        p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                        m143895xf12298132 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
                    }
                    if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf12298132)) {
                        ca4.q.c("SnsAd.CollectedAdInfo", p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf12298132));
                    }
                    p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf12298132);
                }
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var);
            } catch (java.lang.Throwable th7) {
                p3321xbce91901.C29043x91b2b43d.Companion companion3 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th7));
            }
            if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
                ca4.q.c("SnsAd.CollectedAdInfo", p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813));
            }
            p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.CollectedAdInfo$Companion");
            e1Var = e1Var2;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.CollectedAdInfo$Companion");
            e1Var = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.CollectedAdInfo");
        return e1Var;
    }

    public final java.util.List a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSubAdItemList", "com.tencent.mm.plugin.sns.ad.adxml.CollectedAdInfo");
        java.util.List list = this.f484161c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSubAdItemList", "com.tencent.mm.plugin.sns.ad.adxml.CollectedAdInfo");
        return list;
    }
}
