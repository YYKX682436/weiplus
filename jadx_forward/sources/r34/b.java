package r34;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: m, reason: collision with root package name */
    public static final r34.a f450517m = new r34.a(null);

    /* renamed from: a, reason: collision with root package name */
    public long f450518a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f450519b;

    /* renamed from: c, reason: collision with root package name */
    public long f450520c;

    /* renamed from: d, reason: collision with root package name */
    public final int f450521d;

    /* renamed from: e, reason: collision with root package name */
    public int f450522e;

    /* renamed from: f, reason: collision with root package name */
    public final int f450523f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f450524g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f450525h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f450526i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f450527j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f450528k;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.List f450529l;

    public b(long j17, java.lang.String str, long j18, int i17, int i18, int i19, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z17, boolean z18, java.util.List list, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        long j19 = (i27 & 1) != 0 ? 0L : j17;
        java.lang.String snsIdStr = (i27 & 2) != 0 ? "" : str;
        long j27 = (i27 & 4) == 0 ? j18 : 0L;
        int i28 = (i27 & 8) != 0 ? 0 : i17;
        int i29 = (i27 & 16) != 0 ? -1 : i18;
        int i37 = (i27 & 32) != 0 ? 0 : i19;
        java.lang.String uxInfo = (i27 & 64) != 0 ? "" : str2;
        java.lang.String aboveSnsId = (i27 & 128) != 0 ? "" : str3;
        java.lang.String belowSnsId = (i27 & 256) == 0 ? str4 : "";
        boolean z19 = (i27 & 512) != 0 ? false : z17;
        boolean z27 = (i27 & 1024) == 0 ? z18 : false;
        java.util.List subAdList = (i27 & 2048) != 0 ? new java.util.ArrayList() : list;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsIdStr, "snsIdStr");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uxInfo, "uxInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aboveSnsId, "aboveSnsId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(belowSnsId, "belowSnsId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subAdList, "subAdList");
        this.f450518a = j19;
        this.f450519b = snsIdStr;
        this.f450520c = j27;
        this.f450521d = i28;
        this.f450522e = i29;
        this.f450523f = i37;
        this.f450524g = uxInfo;
        this.f450525h = aboveSnsId;
        this.f450526i = belowSnsId;
        this.f450527j = z19;
        this.f450528k = z27;
        this.f450529l = subAdList;
    }

    public final java.lang.String a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAboveSnsId", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord");
        java.lang.String str = this.f450525h;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAboveSnsId", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord");
        return str;
    }

    public final int b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdPosAbs", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord");
        int i17 = this.f450522e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdPosAbs", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord");
        return i17;
    }

    public final java.lang.String c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBelowSnsId", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord");
        java.lang.String str = this.f450526i;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBelowSnsId", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord");
        return str;
    }

    public final long d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCreateTime", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord");
        long j17 = this.f450520c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCreateTime", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord");
        return j17;
    }

    public final long e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsId", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord");
        long j17 = this.f450518a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsId", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord");
        return j17;
    }

    /* renamed from: equals */
    public boolean m161434xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord");
        boolean z17 = (obj instanceof r34.b) && this.f450518a == ((r34.b) obj).f450518a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord");
        return z17;
    }

    public final java.lang.String f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsIdStr", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord");
        java.lang.String str = this.f450519b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsIdStr", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord");
        return str;
    }

    public final void g(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setAboveSnsId", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        this.f450525h = str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAboveSnsId", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord");
    }

    public final void h(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setAdPosAbs", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord");
        this.f450522e = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAdPosAbs", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord");
    }

    /* renamed from: hashCode */
    public int m161435x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord");
        int hashCode = java.lang.Long.hashCode(this.f450518a);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord");
        return hashCode;
    }

    public final void i(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setBelowSnsId", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        this.f450526i = str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setBelowSnsId", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord");
    }

    public final void j(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSnsId", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord");
        this.f450518a = j17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsId", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord");
    }

    public final org.json.JSONObject k() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toJson", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("snsId", this.f450519b);
        jSONObject.put("createTime", this.f450520c);
        jSONObject.put("exposeCnt", this.f450521d);
        jSONObject.put("adPosAbs", this.f450522e);
        jSONObject.put("adPosRelative", this.f450523f);
        jSONObject.put("isExpired", this.f450527j);
        jSONObject.put("aboveSnsId", this.f450525h);
        jSONObject.put("belowSnsId", this.f450526i);
        jSONObject.put("uxInfo", this.f450524g);
        jSONObject.put("isCollectedAd", this.f450528k);
        java.util.List list = this.f450529l;
        if (!list.isEmpty()) {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(((s34.w1) it.next()).a());
            }
            jSONObject.put("subAdList", jSONArray);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toJson", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord");
        return jSONObject;
    }

    public final org.json.JSONObject l() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toStorageJson", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("snsId", this.f450518a);
        jSONObject.put("createTime", this.f450520c);
        jSONObject.put("aboveSnsId", this.f450525h);
        jSONObject.put("belowSnsId", this.f450526i);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toStorageJson", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord");
        return jSONObject;
    }

    /* renamed from: toString */
    public java.lang.String m161436x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord");
        java.lang.String str = "[id=" + this.f450519b + ", topId=" + this.f450525h + ", belowId=" + this.f450526i + ", time=" + this.f450520c + ']';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord");
        return str;
    }
}
