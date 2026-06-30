package s34;

/* loaded from: classes4.dex */
public final class h1 {
    public h1(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final s34.i1 a(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fromJson", "com.tencent.mm.plugin.sns.ad.adxml.ColorInfo$Companion");
        if (jSONObject == null) {
            s34.i1 i1Var = new s34.i1(null, null, 3, null);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fromJson", "com.tencent.mm.plugin.sns.ad.adxml.ColorInfo$Companion");
            return i1Var;
        }
        java.lang.String optString = jSONObject.optString("color", "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
        java.lang.String optString2 = jSONObject.optString("colorDark", "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString2, "optString(...)");
        s34.i1 i1Var2 = new s34.i1(optString, optString2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fromJson", "com.tencent.mm.plugin.sns.ad.adxml.ColorInfo$Companion");
        return i1Var2;
    }
}
