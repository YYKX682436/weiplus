package i64;

/* loaded from: classes4.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f370830a;

    /* renamed from: b, reason: collision with root package name */
    public final int f370831b;

    /* renamed from: c, reason: collision with root package name */
    public final int f370832c;

    public r(java.lang.String str, int i17, int i18) {
        this.f370830a = str;
        this.f370831b = i17;
        this.f370832c = i18;
    }

    public final int a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getState", "com.tencent.mm.plugin.sns.ad.model.AdDownloadData");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getState", "com.tencent.mm.plugin.sns.ad.model.AdDownloadData");
        return this.f370831b;
    }

    /* renamed from: equals */
    public boolean m134857xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.ad.model.AdDownloadData");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.model.AdDownloadData");
            return true;
        }
        if (!(obj instanceof i64.r)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.model.AdDownloadData");
            return false;
        }
        i64.r rVar = (i64.r) obj;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f370830a, rVar.f370830a)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.model.AdDownloadData");
            return false;
        }
        if (this.f370831b != rVar.f370831b) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.model.AdDownloadData");
            return false;
        }
        int i17 = this.f370832c;
        int i18 = rVar.f370832c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.model.AdDownloadData");
        return i17 == i18;
    }

    /* renamed from: hashCode */
    public int m134858x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.ad.model.AdDownloadData");
        java.lang.String str = this.f370830a;
        int hashCode = ((((str == null ? 0 : str.hashCode()) * 31) + java.lang.Integer.hashCode(this.f370831b)) * 31) + java.lang.Integer.hashCode(this.f370832c);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.ad.model.AdDownloadData");
        return hashCode;
    }

    /* renamed from: toString */
    public java.lang.String m134859x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ad.model.AdDownloadData");
        java.lang.String str = "AdDownloadData(appId=" + this.f370830a + ", state=" + this.f370831b + ", progress=" + this.f370832c + ')';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ad.model.AdDownloadData");
        return str;
    }

    public /* synthetic */ r(java.lang.String str, int i17, int i18, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(str, i17, (i19 & 4) != 0 ? 0 : i18);
    }
}
