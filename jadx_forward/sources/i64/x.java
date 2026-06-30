package i64;

/* loaded from: classes4.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f370885a;

    /* renamed from: b, reason: collision with root package name */
    public final long f370886b;

    /* renamed from: c, reason: collision with root package name */
    public final org.json.JSONArray f370887c;

    public x(java.lang.String respString, long j17, org.json.JSONArray attrArray) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(respString, "respString");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrArray, "attrArray");
        this.f370885a = respString;
        this.f370886b = j17;
        this.f370887c = attrArray;
    }

    /* renamed from: equals */
    public boolean m134865xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager$LivingProductResp");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager$LivingProductResp");
            return true;
        }
        if (!(obj instanceof i64.x)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager$LivingProductResp");
            return false;
        }
        i64.x xVar = (i64.x) obj;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f370885a, xVar.f370885a)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager$LivingProductResp");
            return false;
        }
        if (this.f370886b != xVar.f370886b) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager$LivingProductResp");
            return false;
        }
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f370887c, xVar.f370887c);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager$LivingProductResp");
        return b17;
    }

    /* renamed from: hashCode */
    public int m134866x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager$LivingProductResp");
        int hashCode = (((this.f370885a.hashCode() * 31) + java.lang.Long.hashCode(this.f370886b)) * 31) + this.f370887c.hashCode();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager$LivingProductResp");
        return hashCode;
    }

    /* renamed from: toString */
    public java.lang.String m134867x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager$LivingProductResp");
        java.lang.String str = "LivingProductResp(respString=" + this.f370885a + ", productId=" + this.f370886b + ", attrArray=" + this.f370887c + ')';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager$LivingProductResp");
        return str;
    }
}
