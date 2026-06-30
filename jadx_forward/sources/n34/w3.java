package n34;

/* loaded from: classes4.dex */
public final class w3 {

    /* renamed from: a, reason: collision with root package name */
    public final n34.x3 f416300a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f416301b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f416302c;

    /* renamed from: d, reason: collision with root package name */
    public final r45.ed4 f416303d;

    /* renamed from: e, reason: collision with root package name */
    public final int f416304e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f416305f;

    public w3(n34.x3 type, byte[] bArr, java.lang.String str, r45.ed4 ed4Var, int i17, java.util.ArrayList arrayList, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        bArr = (i18 & 2) != 0 ? null : bArr;
        str = (i18 & 4) != 0 ? null : str;
        ed4Var = (i18 & 8) != 0 ? null : ed4Var;
        i17 = (i18 & 16) != 0 ? -1 : i17;
        arrayList = (i18 & 32) != 0 ? null : arrayList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        this.f416300a = type;
        this.f416301b = bArr;
        this.f416302c = str;
        this.f416303d = ed4Var;
        this.f416304e = i17;
        this.f416305f = arrayList;
    }

    public final r45.ed4 a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.e0.f34398x24728b, "com.tencent.mm.plugin.sns.SnsPostFinderData");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.e0.f34398x24728b, "com.tencent.mm.plugin.sns.SnsPostFinderData");
        return this.f416303d;
    }

    /* renamed from: equals */
    public boolean m149055xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.SnsPostFinderData");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.SnsPostFinderData");
            return true;
        }
        if (!(obj instanceof n34.w3)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.SnsPostFinderData");
            return false;
        }
        n34.w3 w3Var = (n34.w3) obj;
        if (this.f416300a != w3Var.f416300a) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.SnsPostFinderData");
            return false;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f416301b, w3Var.f416301b)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.SnsPostFinderData");
            return false;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f416302c, w3Var.f416302c)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.SnsPostFinderData");
            return false;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f416303d, w3Var.f416303d)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.SnsPostFinderData");
            return false;
        }
        if (this.f416304e != w3Var.f416304e) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.SnsPostFinderData");
            return false;
        }
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f416305f, w3Var.f416305f);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.SnsPostFinderData");
        return b17;
    }

    /* renamed from: hashCode */
    public int m149056x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.SnsPostFinderData");
        int hashCode = this.f416300a.hashCode() * 31;
        byte[] bArr = this.f416301b;
        int hashCode2 = (hashCode + (bArr == null ? 0 : java.util.Arrays.hashCode(bArr))) * 31;
        java.lang.String str = this.f416302c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        r45.ed4 ed4Var = this.f416303d;
        int hashCode4 = (((hashCode3 + (ed4Var == null ? 0 : ed4Var.hashCode())) * 31) + java.lang.Integer.hashCode(this.f416304e)) * 31;
        java.util.ArrayList arrayList = this.f416305f;
        int hashCode5 = hashCode4 + (arrayList != null ? arrayList.hashCode() : 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.SnsPostFinderData");
        return hashCode5;
    }

    /* renamed from: toString */
    public java.lang.String m149057x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.SnsPostFinderData");
        java.lang.String str = "SnsPostFinderData(type=" + this.f416300a + ", compositionInfo=" + java.util.Arrays.toString(this.f416301b) + ", videoPath=" + this.f416302c + ", location=" + this.f416303d + ", videoSourceScene=" + this.f416304e + ", photos=" + this.f416305f + ')';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.SnsPostFinderData");
        return str;
    }
}
