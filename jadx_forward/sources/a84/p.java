package a84;

/* loaded from: classes4.dex */
public abstract class p {
    public static final boolean a(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        org.json.JSONObject optJSONObject;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableAdTextClickableByTemplate", "com.tencent.mm.plugin.sns.ad.utils.AdExprUtilKt");
        org.json.JSONArray jSONArray = null;
        org.json.JSONObject c17 = s74.x2.f486122a.c((c17933xe8d1b226 == null || (m70354x74235b3e = c17933xe8d1b226.m70354x74235b3e()) == null) ? null : m70354x74235b3e.f38169xb503b96a);
        if (c17 != null && (optJSONObject = c17.optJSONObject("ad-template-extra-info")) != null) {
            jSONArray = optJSONObject.optJSONArray("ad-normal-clickable-areas");
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        if (jSONArray != null) {
            c75.c.d(jSONArray, new a84.o(c0Var));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdExprUtil", "enableAdTextClickableByTemplate " + c0Var.f391645d);
        boolean z17 = c0Var.f391645d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableAdTextClickableByTemplate", "com.tencent.mm.plugin.sns.ad.utils.AdExprUtilKt");
        return z17;
    }

    public static final boolean b(int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 c17902x72cc1771) {
        java.lang.Integer h17;
        org.json.JSONArray optJSONArray;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableExpr", "com.tencent.mm.plugin.sns.ad.utils.AdExprUtilKt");
        if (c17902x72cc1771 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableExpr", "com.tencent.mm.plugin.sns.ad.utils.AdExprUtilKt");
            return false;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getExprValue", "com.tencent.mm.plugin.sns.ad.utils.AdExprUtilKt");
        java.lang.String str = null;
        if (valueOf != null) {
            valueOf.intValue();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdExprUtil", "try get expId = " + valueOf);
            org.json.JSONObject jSONObject = c17902x72cc1771.f38077x3220b120;
            if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray("exp_para")) != null) {
                int i18 = 0;
                while (true) {
                    if (!(i18 < optJSONArray.length())) {
                        break;
                    }
                    java.lang.Object obj = optJSONArray.get(i18);
                    i18++;
                    if (obj instanceof org.json.JSONObject) {
                        org.json.JSONObject jSONObject2 = (org.json.JSONObject) obj;
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("" + valueOf, jSONObject2.optString("exp_id"))) {
                            str = jSONObject2.optString("exp_value");
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdExprUtil", "expId = " + valueOf + "  value = " + str);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getExprValue", "com.tencent.mm.plugin.sns.ad.utils.AdExprUtilKt");
                            break;
                        }
                    }
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getExprValue", "com.tencent.mm.plugin.sns.ad.utils.AdExprUtilKt");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getExprValue", "com.tencent.mm.plugin.sns.ad.utils.AdExprUtilKt");
        }
        boolean z17 = ((str == null || (h17 = r26.h0.h(str)) == null) ? 0 : h17.intValue()) > 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableExpr", "com.tencent.mm.plugin.sns.ad.utils.AdExprUtilKt");
        return z17;
    }

    public static final boolean c(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        java.lang.Object m143895xf1229813;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hasAdEndCover", "com.tencent.mm.plugin.sns.ad.utils.AdExprUtilKt");
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdExprUtil", "the sns info is null, there is no end cover.");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasAdEndCover", "com.tencent.mm.plugin.sns.ad.utils.AdExprUtilKt");
            return false;
        }
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            s74.x2 x2Var = s74.x2.f486122a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e = c17933xe8d1b226.m70354x74235b3e();
            org.json.JSONObject c17 = x2Var.c(m70354x74235b3e != null ? m70354x74235b3e.f38169xb503b96a : null);
            org.json.JSONObject optJSONObject = c17 != null ? c17.optJSONObject("ad-template-extra-info") : null;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.valueOf(optJSONObject != null ? optJSONObject.optBoolean("ad-has-end-cover") : false));
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
            ca4.q.c("catching_tag", p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813));
        }
        java.lang.Boolean bool = (java.lang.Boolean) (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813) ? null : m143895xf1229813);
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdExprUtil", "the ad-has-end-cover node value is " + booleanValue);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasAdEndCover", "com.tencent.mm.plugin.sns.ad.utils.AdExprUtilKt");
        return booleanValue;
    }
}
