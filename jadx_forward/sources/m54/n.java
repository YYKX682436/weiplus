package m54;

/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f405825a;

    /* renamed from: b, reason: collision with root package name */
    public final int f405826b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f405827c;

    /* renamed from: d, reason: collision with root package name */
    public final long f405828d;

    public n(java.lang.String url, int i17, java.lang.String str, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        this.f405825a = url;
        this.f405826b = i17;
        this.f405827c = str;
        this.f405828d = j17;
    }

    /* renamed from: equals */
    public boolean m146847xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$PreloadResNode");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$PreloadResNode");
            return true;
        }
        if (!(obj instanceof m54.n)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$PreloadResNode");
            return false;
        }
        m54.n nVar = (m54.n) obj;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f405825a, nVar.f405825a)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$PreloadResNode");
            return false;
        }
        if (this.f405826b != nVar.f405826b) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$PreloadResNode");
            return false;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f405827c, nVar.f405827c)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$PreloadResNode");
            return false;
        }
        long j17 = this.f405828d;
        long j18 = nVar.f405828d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$PreloadResNode");
        return j17 == j18;
    }

    /* renamed from: hashCode */
    public int m146848x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$PreloadResNode");
        int hashCode = ((this.f405825a.hashCode() * 31) + java.lang.Integer.hashCode(this.f405826b)) * 31;
        java.lang.String str = this.f405827c;
        int hashCode2 = ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Long.hashCode(this.f405828d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$PreloadResNode");
        return hashCode2;
    }

    /* renamed from: toString */
    public java.lang.String m146849x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$PreloadResNode");
        java.lang.String str = "PreloadResNode(url=" + this.f405825a + ", type=" + this.f405826b + ", md5=" + this.f405827c + ", size=" + this.f405828d + ')';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$PreloadResNode");
        return str;
    }
}
