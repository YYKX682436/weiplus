package dk2;

/* loaded from: classes3.dex */
public final class ah implements l81.p0 {

    /* renamed from: e, reason: collision with root package name */
    public long f314745e;

    /* renamed from: f, reason: collision with root package name */
    public int f314746f;

    /* renamed from: n, reason: collision with root package name */
    public boolean f314751n;

    /* renamed from: p, reason: collision with root package name */
    public int f314753p;

    /* renamed from: q, reason: collision with root package name */
    public byte[] f314754q;

    /* renamed from: r, reason: collision with root package name */
    public int f314755r;

    /* renamed from: t, reason: collision with root package name */
    public boolean f314757t;

    /* renamed from: w, reason: collision with root package name */
    public boolean f314760w;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f314744d = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f314747g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f314748h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f314749i = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f314750m = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f314752o = "";

    /* renamed from: s, reason: collision with root package name */
    public boolean f314756s = true;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f314758u = "";

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f314759v = "";

    @Override // l81.p0
    public java.lang.String a() {
        try {
            java.lang.String jSONObject = b().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(jSONObject);
            return jSONObject;
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("WxLiveShoppingExtranData", e17, "", new java.lang.Object[0]);
            return "{}";
        }
    }

    public final org.json.JSONObject b() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099, this.f314744d);
        jSONObject.put("productId", this.f314745e);
        jSONObject.put("isPreRender", this.f314746f);
        jSONObject.put("openMode", this.f314747g);
        java.lang.String str = this.f314748h;
        if (str == null) {
            str = "";
        }
        jSONObject.put("shopExtraData", str);
        jSONObject.put("finderUsername", this.f314750m);
        jSONObject.put("finderLiveToken", this.f314749i);
        jSONObject.put("hasClientDragBar", this.f314751n);
        jSONObject.put("liveScene", this.f314752o);
        jSONObject.put("entranceGMsgID", this.f314758u);
        jSONObject.put("query", this.f314759v);
        jSONObject.put("forbidAutoFullScreenWhenTap", this.f314760w);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WxLiveShoppingExtranData", "finderUsername:" + this.f314750m + ", finderLiveToken:" + this.f314749i + ", entranceGMsgID:" + this.f314758u);
        return jSONObject;
    }

    /* renamed from: toString */
    public java.lang.String m124538x9616526c() {
        return a();
    }
}
