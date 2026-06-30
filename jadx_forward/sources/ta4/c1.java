package ta4;

/* loaded from: classes3.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f498264a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f498265b;

    public c1(int i17, java.util.List pathList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pathList, "pathList");
        this.f498264a = i17;
        this.f498265b = pathList;
    }

    /* renamed from: equals */
    public boolean m166049xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.report.SnsPostMediaMetaDataSource");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.report.SnsPostMediaMetaDataSource");
            return true;
        }
        if (!(obj instanceof ta4.c1)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.report.SnsPostMediaMetaDataSource");
            return false;
        }
        ta4.c1 c1Var = (ta4.c1) obj;
        if (this.f498264a != c1Var.f498264a) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.report.SnsPostMediaMetaDataSource");
            return false;
        }
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f498265b, c1Var.f498265b);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.report.SnsPostMediaMetaDataSource");
        return b17;
    }

    /* renamed from: hashCode */
    public int m166050x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.report.SnsPostMediaMetaDataSource");
        int hashCode = (java.lang.Integer.hashCode(this.f498264a) * 31) + this.f498265b.hashCode();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.report.SnsPostMediaMetaDataSource");
        return hashCode;
    }

    /* renamed from: toString */
    public java.lang.String m166051x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.report.SnsPostMediaMetaDataSource");
        java.lang.String str = "SnsPostMediaMetaDataSource(type=" + this.f498264a + ", pathList=" + this.f498265b + ')';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.report.SnsPostMediaMetaDataSource");
        return str;
    }
}
