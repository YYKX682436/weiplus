package rx4;

/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final org.json.JSONObject f482718a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f482719b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f482720c;

    /* renamed from: d, reason: collision with root package name */
    public final int f482721d;

    /* renamed from: e, reason: collision with root package name */
    public final int f482722e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f482723f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f482724g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f482725h;

    /* renamed from: i, reason: collision with root package name */
    public int f482726i;

    public i(org.json.JSONObject raw) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(raw, "raw");
        this.f482718a = raw;
        this.f482719b = "";
        this.f482720c = "";
        this.f482723f = "";
        this.f482725h = "";
        java.lang.String optString = raw.optString("hotword", "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
        this.f482719b = optString;
        java.lang.String optString2 = raw.optString("mixerCommonContext", "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString2, "optString(...)");
        this.f482720c = optString2;
        this.f482721d = raw.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
        this.f482722e = raw.optInt("businesstype", 0);
        java.lang.String optString3 = raw.optString("searchId", raw.optString("searchID", ""));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString3, "optString(...)");
        this.f482723f = optString3;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[hitest] FTSHistoryItem init, hotwordLen=");
        sb6.append(optString.length());
        sb6.append(", hasSearchId=");
        sb6.append(this.f482723f.length() > 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FTSNativeTeachHistoryBoxUIC", sb6.toString());
    }

    /* renamed from: equals */
    public boolean m163407xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rx4.i) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f482718a, ((rx4.i) obj).f482718a);
    }

    /* renamed from: hashCode */
    public int m163408x8cdac1b() {
        return this.f482718a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m163409x9616526c() {
        return "FTSHistoryItem(raw=" + this.f482718a + ')';
    }
}
