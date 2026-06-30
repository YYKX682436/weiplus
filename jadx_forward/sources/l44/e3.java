package l44;

/* loaded from: classes4.dex */
public final class e3 {

    /* renamed from: k, reason: collision with root package name */
    public static final l44.d3 f397641k = new l44.d3(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f397642a;

    /* renamed from: b, reason: collision with root package name */
    public final int f397643b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f397644c;

    /* renamed from: d, reason: collision with root package name */
    public final int f397645d;

    /* renamed from: e, reason: collision with root package name */
    public final int f397646e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f397647f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f397648g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f397649h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f397650i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.List f397651j;

    public e3(int i17, int i18, java.lang.String aId, int i19, int i27, java.lang.String snsId, java.lang.String traceId, java.lang.String tid, boolean z17, java.util.List subAdList, int i28, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i28 & 1) != 0 ? -1 : i17;
        i18 = (i28 & 2) != 0 ? 0 : i18;
        aId = (i28 & 4) != 0 ? "" : aId;
        i19 = (i28 & 8) != 0 ? 0 : i19;
        i27 = (i28 & 16) != 0 ? 0 : i27;
        snsId = (i28 & 32) != 0 ? "0" : snsId;
        traceId = (i28 & 64) != 0 ? "" : traceId;
        tid = (i28 & 128) != 0 ? "" : tid;
        z17 = (i28 & 256) != 0 ? false : z17;
        subAdList = (i28 & 512) != 0 ? new java.util.ArrayList() : subAdList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aId, "aId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsId, "snsId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(traceId, "traceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tid, "tid");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subAdList, "subAdList");
        this.f397642a = i17;
        this.f397643b = i18;
        this.f397644c = aId;
        this.f397645d = i19;
        this.f397646e = i27;
        this.f397647f = snsId;
        this.f397648g = traceId;
        this.f397649h = tid;
        this.f397650i = z17;
        this.f397651j = subAdList;
    }

    public final org.json.JSONObject a() {
        org.json.JSONObject jSONObject;
        java.util.List list = this.f397651j;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toJSON", "com.tencent.mm.plugin.sns.ad.helper.AdLocalRecordHelper$AdRecord");
        try {
            jSONObject = new org.json.JSONObject();
            jSONObject.putOpt("adPosAbs", java.lang.Integer.valueOf(this.f397642a));
            jSONObject.putOpt("adPosRelative", java.lang.Integer.valueOf(this.f397643b));
            jSONObject.putOpt("aid", this.f397644c);
            jSONObject.putOpt("createTime", java.lang.Integer.valueOf(this.f397645d));
            jSONObject.putOpt("exposeCnt", java.lang.Integer.valueOf(this.f397646e));
            jSONObject.putOpt("snsId", this.f397647f);
            jSONObject.putOpt("traceId", this.f397648g);
            jSONObject.putOpt("tid", this.f397649h);
            jSONObject.putOpt("isCollectedAd", java.lang.Boolean.valueOf(this.f397650i));
            if (!list.isEmpty()) {
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((s34.w1) it.next()).a());
                }
                jSONObject.putOpt("subAdList", jSONArray);
            }
        } catch (org.json.JSONException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdLocalRecordHelper", "there is exception when create json object when generate ad record json");
            jSONObject = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toJSON", "com.tencent.mm.plugin.sns.ad.helper.AdLocalRecordHelper$AdRecord");
        return jSONObject;
    }
}
