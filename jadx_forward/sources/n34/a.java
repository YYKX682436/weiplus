package n34;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f416068a;

    /* renamed from: b, reason: collision with root package name */
    public final int f416069b;

    /* renamed from: c, reason: collision with root package name */
    public final int f416070c;

    /* renamed from: d, reason: collision with root package name */
    public final int f416071d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17683x770f5025 f416072e;

    public a(int i17, int i18, int i19, int i27, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17683x770f5025 c17683x770f5025) {
        this.f416068a = i17;
        this.f416069b = i18;
        this.f416070c = i19;
        this.f416071d = i27;
        this.f416072e = c17683x770f5025;
    }

    public final int a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBitrate", "com.tencent.mm.plugin.sns.ABAResult");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBitrate", "com.tencent.mm.plugin.sns.ABAResult");
        return this.f416071d;
    }

    /* renamed from: equals */
    public boolean m148955xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.ABAResult");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ABAResult");
            return true;
        }
        if (!(obj instanceof n34.a)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ABAResult");
            return false;
        }
        n34.a aVar = (n34.a) obj;
        if (this.f416068a != aVar.f416068a) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ABAResult");
            return false;
        }
        if (this.f416069b != aVar.f416069b) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ABAResult");
            return false;
        }
        if (this.f416070c != aVar.f416070c) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ABAResult");
            return false;
        }
        if (this.f416071d != aVar.f416071d) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ABAResult");
            return false;
        }
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f416072e, aVar.f416072e);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ABAResult");
        return b17;
    }

    /* renamed from: hashCode */
    public int m148956x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.ABAResult");
        int hashCode = ((((((java.lang.Integer.hashCode(this.f416068a) * 31) + java.lang.Integer.hashCode(this.f416069b)) * 31) + java.lang.Integer.hashCode(this.f416070c)) * 31) + java.lang.Integer.hashCode(this.f416071d)) * 31;
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17683x770f5025 c17683x770f5025 = this.f416072e;
        int hashCode2 = hashCode + (c17683x770f5025 == null ? 0 : c17683x770f5025.hashCode());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.ABAResult");
        return hashCode2;
    }

    /* renamed from: toString */
    public java.lang.String m148957x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ABAResult");
        java.lang.String str = "ABAResult(errCode=" + this.f416068a + ", width=" + this.f416069b + ", height=" + this.f416070c + ", bitrate=" + this.f416071d + ", abaParams=" + this.f416072e + ')';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ABAResult");
        return str;
    }
}
