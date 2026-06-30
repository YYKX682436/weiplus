package i64;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f370610a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f370611b;

    /* renamed from: c, reason: collision with root package name */
    public final a44.a f370612c;

    public b(java.lang.String str, boolean z17, a44.a aVar) {
        this.f370610a = str;
        this.f370611b = z17;
        this.f370612c = aVar;
    }

    public final a44.a a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getData", "com.tencent.mm.plugin.sns.ad.model.AdComplianceData");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getData", "com.tencent.mm.plugin.sns.ad.model.AdComplianceData");
        return this.f370612c;
    }

    /* renamed from: equals */
    public boolean m134828xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.ad.model.AdComplianceData");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.model.AdComplianceData");
            return true;
        }
        if (!(obj instanceof i64.b)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.model.AdComplianceData");
            return false;
        }
        i64.b bVar = (i64.b) obj;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f370610a, bVar.f370610a)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.model.AdComplianceData");
            return false;
        }
        if (this.f370611b != bVar.f370611b) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.model.AdComplianceData");
            return false;
        }
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f370612c, bVar.f370612c);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.model.AdComplianceData");
        return b17;
    }

    /* renamed from: hashCode */
    public int m134829x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.ad.model.AdComplianceData");
        java.lang.String str = this.f370610a;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f370611b)) * 31;
        a44.a aVar = this.f370612c;
        int hashCode2 = hashCode + (aVar != null ? aVar.hashCode() : 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.ad.model.AdComplianceData");
        return hashCode2;
    }

    /* renamed from: toString */
    public java.lang.String m134830x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ad.model.AdComplianceData");
        java.lang.String str = "AdComplianceData(snsId=" + this.f370610a + ", shouldShow=" + this.f370611b + ", data=" + this.f370612c + ')';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ad.model.AdComplianceData");
        return str;
    }

    public /* synthetic */ b(java.lang.String str, boolean z17, a44.a aVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(str, z17, (i17 & 4) != 0 ? null : aVar);
    }
}
