package rx4;

/* loaded from: classes8.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final org.json.JSONObject f482847a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f482848b;

    /* renamed from: c, reason: collision with root package name */
    public final int f482849c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f482850d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f482851e;

    /* renamed from: f, reason: collision with root package name */
    public final rx4.v0 f482852f;

    public w0(org.json.JSONObject raw, boolean z17) {
        int length;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(raw, "raw");
        this.f482847a = raw;
        this.f482848b = z17;
        this.f482850d = "";
        this.f482851e = new java.util.ArrayList();
        this.f482849c = raw.optInt("type", 0);
        java.lang.String optString = raw.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
        this.f482850d = optString;
        try {
            org.json.JSONArray optJSONArray = raw.optJSONArray("items");
            if (optJSONArray != null && optJSONArray.length() - 1 >= 0) {
                int i17 = 0;
                while (true) {
                    java.util.List list = this.f482851e;
                    org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i17);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optJSONObject, "optJSONObject(...)");
                    list.add(new rx4.x0(optJSONObject, i17, this.f482848b));
                    if (i17 == length) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
        } catch (org.json.JSONException unused) {
        }
        org.json.JSONObject optJSONObject2 = this.f482847a.optJSONObject("bannerInfo");
        if (optJSONObject2 != null) {
            org.json.JSONObject optJSONObject3 = optJSONObject2.optJSONObject("jumpInfo");
            int optInt = optJSONObject2.optInt("type", 0);
            java.lang.String optString2 = optJSONObject2.optString("iconUrl", "");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString2, "optString(...)");
            java.lang.String optString3 = optJSONObject2.optString("subTitle", "");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString3, "optString(...)");
            int optInt2 = optJSONObject2.optInt("parentType", 64);
            java.lang.String optString4 = optJSONObject2.optString("mixerCommonContext", "");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString4, "optString(...)");
            int optInt3 = optJSONObject3 != null ? optJSONObject3.optInt("jumpType", 0) : 0;
            java.lang.String optString5 = optJSONObject3 != null ? optJSONObject3.optString("appId", "") : null;
            java.lang.String str = optString5 == null ? "" : optString5;
            java.lang.String optString6 = optJSONObject3 != null ? optJSONObject3.optString("weappUrl", "") : null;
            optString6 = optString6 == null ? "" : optString6;
            java.lang.String optString7 = optJSONObject3 != null ? optJSONObject3.optString("userName", "") : null;
            java.lang.String str2 = optString7 == null ? "" : optString7;
            java.lang.String optString8 = optJSONObject3 != null ? optJSONObject3.optString("action", "") : null;
            java.lang.String str3 = optString8 == null ? "" : optString8;
            java.lang.String optString9 = optJSONObject3 != null ? optJSONObject3.optString("ecsJumpInfoBase64", "") : null;
            this.f482852f = new rx4.v0(optInt, optString2, optString3, optInt2, optString4, optInt3, str, optString6, str2, str3, optString9 == null ? "" : optString9);
        }
    }

    /* renamed from: equals */
    public boolean m163430xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx4.w0)) {
            return false;
        }
        rx4.w0 w0Var = (rx4.w0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f482847a, w0Var.f482847a) && this.f482848b == w0Var.f482848b;
    }

    /* renamed from: hashCode */
    public int m163431x8cdac1b() {
        return (this.f482847a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f482848b);
    }

    /* renamed from: toString */
    public java.lang.String m163432x9616526c() {
        return "FTSRecommendBlock(raw=" + this.f482847a + ", isNewStyle=" + this.f482848b + ')';
    }
}
