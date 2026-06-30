package ka3;

/* loaded from: classes15.dex */
public final class g {

    /* renamed from: g, reason: collision with root package name */
    public static final ka3.e f387600g = new ka3.e(null);

    /* renamed from: h, reason: collision with root package name */
    public static final r26.t f387601h = new r26.t("^\\d{6,20}_[a-zA-Z0-9]+@pay$");

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String f387602i = "HceRegistChecker";

    /* renamed from: a, reason: collision with root package name */
    public final org.json.JSONObject f387603a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f387604b;

    /* renamed from: c, reason: collision with root package name */
    public final ka3.w f387605c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f387606d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f387607e;

    /* renamed from: f, reason: collision with root package name */
    public final ka3.f f387608f;

    public g(org.json.JSONObject registerOption, java.lang.String uin, ka3.w walletType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(registerOption, "registerOption");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uin, "uin");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(walletType, "walletType");
        this.f387603a = registerOption;
        this.f387604b = uin;
        this.f387605c = walletType;
        this.f387606d = new java.util.ArrayList();
        this.f387607e = "HceRegisterationManager";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(uin);
        sb6.append('_');
        java.lang.String optString = registerOption.optString("storeAppId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
        sb6.append(optString);
        this.f387608f = new ka3.f(registerOption, sb6.toString());
    }

    public final org.json.JSONArray a() {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.Iterator it = this.f387606d.iterator();
        while (it.hasNext()) {
            java.util.List list = ((ka3.f) it.next()).f387591a;
            if (list != null) {
                linkedHashSet.addAll(list);
            }
        }
        java.lang.String str = "get all registeredAids=" + linkedHashSet + ", registeringAids=" + b();
        java.lang.String str2 = this.f387607e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
        linkedHashSet.addAll(b());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "registeringAids allAids=" + linkedHashSet);
        return new org.json.JSONArray((java.util.Collection) linkedHashSet);
    }

    public final java.util.List b() {
        org.json.JSONArray optJSONArray = this.f387603a.optJSONArray("aidList");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = optJSONArray.length();
        for (int i17 = 0; i17 < length; i17++) {
            java.lang.String string = optJSONArray.getString(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            java.lang.String upperCase = string.toUpperCase(java.util.Locale.ROOT);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(upperCase, "toUpperCase(...)");
            arrayList.add(upperCase);
        }
        return arrayList;
    }
}
