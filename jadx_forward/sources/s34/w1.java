package s34;

/* loaded from: classes4.dex */
public final class w1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f484353a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f484354b;

    public w1(java.lang.String aidString, java.lang.String tidString) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aidString, "aidString");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tidString, "tidString");
        this.f484353a = aidString;
        this.f484354b = tidString;
    }

    public final org.json.JSONObject a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toJson", "com.tencent.mm.plugin.sns.ad.adxml.SubAdRecord");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("aid", this.f484353a);
        jSONObject.put("tid", this.f484354b);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toJson", "com.tencent.mm.plugin.sns.ad.adxml.SubAdRecord");
        return jSONObject;
    }

    /* renamed from: equals */
    public boolean m163798xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.ad.adxml.SubAdRecord");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.adxml.SubAdRecord");
            return true;
        }
        if (!(obj instanceof s34.w1)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.adxml.SubAdRecord");
            return false;
        }
        s34.w1 w1Var = (s34.w1) obj;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f484353a, w1Var.f484353a)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.adxml.SubAdRecord");
            return false;
        }
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f484354b, w1Var.f484354b);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.adxml.SubAdRecord");
        return b17;
    }

    /* renamed from: hashCode */
    public int m163799x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.ad.adxml.SubAdRecord");
        int hashCode = (this.f484353a.hashCode() * 31) + this.f484354b.hashCode();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.ad.adxml.SubAdRecord");
        return hashCode;
    }

    /* renamed from: toString */
    public java.lang.String m163800x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ad.adxml.SubAdRecord");
        java.lang.String str = "SubAdRecord(aidString=" + this.f484353a + ", tidString=" + this.f484354b + ')';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ad.adxml.SubAdRecord");
        return str;
    }
}
