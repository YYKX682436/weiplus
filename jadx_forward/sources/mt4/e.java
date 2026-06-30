package mt4;

/* loaded from: classes9.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f412835a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f412836b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f412837c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f412838d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f412839e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f412840f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f412841g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f412842h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f412843i;

    public e(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f412835a = str;
        this.f412840f = str2;
        org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
        this.f412836b = jSONObject.optString("orderId");
        jSONObject.optString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56317xb68cafb1);
        this.f412837c = jSONObject.optString("productId");
        jSONObject.optLong("purchaseTime");
        jSONObject.optInt("purchaseState");
        java.lang.String optString = jSONObject.optString("developerPayload");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String str4 = optString;
        while (str4.indexOf("[#]") >= 0) {
            java.lang.String substring = str4.substring(0, str4.indexOf("[#]"));
            str4 = str4.substring(substring.length() + 3);
            arrayList.add(substring);
        }
        arrayList.add(str4);
        if (arrayList.size() == 3) {
            this.f412838d = (java.lang.String) arrayList.get(0);
            this.f412843i = (java.lang.String) arrayList.get(1);
            this.f412842h = (java.lang.String) arrayList.get(2);
        } else {
            this.f412838d = optString;
        }
        this.f412839e = jSONObject.optString("token", jSONObject.optString("purchaseToken"));
        this.f412841g = str3;
    }

    /* renamed from: toString */
    public java.lang.String m148377x9616526c() {
        return "PurchaseInfo(type:" + this.f412835a + "):" + this.f412840f;
    }

    public e(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.f412837c = str;
        this.f412838d = str2;
        this.f412842h = str3;
        this.f412843i = str4;
    }
}
