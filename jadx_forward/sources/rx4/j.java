package rx4;

/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final org.json.JSONObject f482732a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f482733b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f482734c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f482735d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f482736e;

    /* renamed from: f, reason: collision with root package name */
    public final int f482737f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f482738g;

    public j(org.json.JSONObject raw, java.lang.String searchId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(raw, "raw");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(searchId, "searchId");
        this.f482732a = raw;
        this.f482733b = searchId;
        java.lang.String str = "";
        this.f482734c = "";
        this.f482735d = "";
        this.f482736e = "";
        try {
            java.lang.String optString = raw.optString("word", "");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
            this.f482734c = optString;
            java.lang.String optString2 = raw.optString("mixerCommonContext", "");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString2, "optString(...)");
            this.f482735d = optString2;
            org.json.JSONObject optJSONObject = raw.optJSONObject("tag");
            java.lang.String optString3 = optJSONObject != null ? optJSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, "") : null;
            if (optString3 != null) {
                str = optString3;
            }
            this.f482736e = str;
            int optInt = optJSONObject != null ? optJSONObject.optInt("type", 0) : 0;
            this.f482737f = optInt;
            if (optInt == 6 || optInt == 11) {
                this.f482738g = true;
            }
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FTSNativeTeachHistoryBoxUIC", "FTSHistoryLiveItem, init error: " + e17);
        }
    }

    /* renamed from: equals */
    public boolean m163410xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx4.j)) {
            return false;
        }
        rx4.j jVar = (rx4.j) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f482732a, jVar.f482732a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f482733b, jVar.f482733b);
    }

    /* renamed from: hashCode */
    public int m163411x8cdac1b() {
        return (this.f482732a.hashCode() * 31) + this.f482733b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m163412x9616526c() {
        return "FTSHistoryLiveItem(raw=" + this.f482732a + ", searchId=" + this.f482733b + ')';
    }
}
