package zv4;

/* loaded from: classes8.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final zv4.m f558014a = new zv4.m();

    /* renamed from: b, reason: collision with root package name */
    public static org.json.JSONObject f558015b;

    public final su4.j2 a(android.content.Context context, zv4.i iVar) {
        su4.j2 j2Var = new su4.j2();
        j2Var.f494494x = java.net.URLDecoder.decode(iVar.f558002h, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
        j2Var.f494471a = context;
        java.lang.Integer num = iVar.f557996b;
        j2Var.f494472b = num != null ? num.intValue() : 0;
        j2Var.f494474d = iVar.f557995a;
        java.lang.Integer num2 = iVar.f557997c;
        j2Var.f494473c = num2 != null ? num2.intValue() : 0;
        j2Var.f494475e = iVar.f557998d;
        j2Var.f494476f = iVar.f558004j == 1;
        j2Var.f494481k = iVar.f558006l;
        j2Var.f494482l = iVar.f558007m;
        j2Var.f494478h = true;
        j2Var.f494479i = iVar.f558008n;
        j2Var.f494480j = iVar.f558009o;
        j2Var.f494487q = iVar.f558010p;
        int i17 = iVar.f558001g;
        if (i17 == 1 || i17 == 2) {
            j2Var.A = i17 == 1;
        }
        j2Var.f494491u = false;
        j2Var.f494486p = false;
        j2Var.f494496z = iVar.f558003i;
        j2Var.f494493w = iVar.f558005k;
        return j2Var;
    }

    public final zv4.i b(org.json.JSONObject jSONObject) {
        org.json.JSONObject optJSONObject;
        if (jSONObject == null) {
            return new zv4.i("", null, null, "", "", "", 0, "", "", 0, false, false, "", false, false, "");
        }
        org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("customNavBarParams");
        java.lang.String optString = jSONObject.optString("query");
        java.lang.String str = optString == null ? "" : optString;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811));
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(jSONObject.optInt("type"));
        java.lang.String optString2 = jSONObject.optString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984);
        java.lang.String str2 = optString2 == null ? "" : optString2;
        java.lang.String optString3 = jSONObject.optString("searchId");
        java.lang.String str3 = optString3 == null ? "" : optString3;
        java.lang.String optString4 = jSONObject.optString("subSessionId");
        java.lang.String str4 = optString4 == null ? "" : optString4;
        int optInt = jSONObject.optInt("ftsNeedHideKeyBoard", 0);
        java.lang.String optString5 = jSONObject.optString("extParams");
        java.lang.String str5 = optString5 == null ? "" : optString5;
        java.lang.String optString6 = jSONObject.optString("searchPlaceHolder");
        java.lang.String str6 = optString6 == null ? "" : optString6;
        int optInt2 = jSONObject.optInt("isHomePage", 0);
        boolean optBoolean = jSONObject.optBoolean("needPreGet", false);
        boolean optBoolean2 = jSONObject.optBoolean("enableRestoreEducatePage", false);
        java.lang.String optString7 = jSONObject.optString("forceUseThemeMode");
        if (optString7 == null) {
            optString7 = "";
        }
        boolean optBoolean3 = optJSONObject2 != null ? optJSONObject2.optBoolean("hideSearchBar", false) : false;
        boolean optBoolean4 = optJSONObject2 != null ? optJSONObject2.optBoolean("hideNavBar", false) : false;
        java.lang.String optString8 = (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("nativeConfig")) == null) ? null : optJSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        if (optString8 == null) {
            optString8 = "";
        }
        return new zv4.i(str, valueOf, valueOf2, str2, str3, str4, optInt, str5, str6, optInt2, optBoolean, optBoolean2, optString7, optBoolean3, optBoolean4, optString8);
    }

    public final void c(android.content.Context context, org.json.JSONObject jSONObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        try {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Vi(a(context, b(jSONObject)));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearchSourceImgJumpInfoUtil", "startWebSearch: web search started successfully");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearchSourceImgJumpInfoUtil", "startWebSearch failed: " + e17.getMessage(), e17);
        }
    }
}
