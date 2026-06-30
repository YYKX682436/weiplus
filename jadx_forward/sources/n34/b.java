package n34;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f416084a;

    /* renamed from: b, reason: collision with root package name */
    public final long f416085b;

    /* renamed from: c, reason: collision with root package name */
    public final long f416086c;

    public b(java.lang.String path, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        this.f416084a = path;
        this.f416085b = j17;
        this.f416086c = j18;
    }

    /* renamed from: equals */
    public boolean m148964xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.ABAVideoInfo");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ABAVideoInfo");
            return true;
        }
        if (!(obj instanceof n34.b)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ABAVideoInfo");
            return false;
        }
        n34.b bVar = (n34.b) obj;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f416084a, bVar.f416084a)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ABAVideoInfo");
            return false;
        }
        if (this.f416085b != bVar.f416085b) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ABAVideoInfo");
            return false;
        }
        long j17 = this.f416086c;
        long j18 = bVar.f416086c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ABAVideoInfo");
        return j17 == j18;
    }

    /* renamed from: hashCode */
    public int m148965x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.ABAVideoInfo");
        int hashCode = (((this.f416084a.hashCode() * 31) + java.lang.Long.hashCode(this.f416085b)) * 31) + java.lang.Long.hashCode(this.f416086c);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.ABAVideoInfo");
        return hashCode;
    }

    /* renamed from: toString */
    public java.lang.String m148966x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ABAVideoInfo");
        java.lang.String str = "ABAVideoInfo(path=" + this.f416084a + ", videoStart=" + this.f416085b + ", videoEnd=" + this.f416086c + ')';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ABAVideoInfo");
        return str;
    }
}
