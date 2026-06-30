package lc4;

/* loaded from: classes4.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f399480a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f399481b;

    /* renamed from: c, reason: collision with root package name */
    public final int f399482c;

    /* renamed from: d, reason: collision with root package name */
    public final int f399483d;

    public b0(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        str = (i19 & 1) != 0 ? null : str;
        str2 = (i19 & 2) != 0 ? null : str2;
        i17 = (i19 & 4) != 0 ? -1 : i17;
        i18 = (i19 & 8) != 0 ? -1 : i18;
        this.f399480a = str;
        this.f399481b = str2;
        this.f399482c = i17;
        this.f399483d = i18;
    }

    /* renamed from: equals */
    public boolean m145592xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveLoadInfo");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveLoadInfo");
            return true;
        }
        if (!(obj instanceof lc4.b0)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveLoadInfo");
            return false;
        }
        lc4.b0 b0Var = (lc4.b0) obj;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f399480a, b0Var.f399480a)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveLoadInfo");
            return false;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f399481b, b0Var.f399481b)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveLoadInfo");
            return false;
        }
        if (this.f399482c != b0Var.f399482c) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveLoadInfo");
            return false;
        }
        int i17 = this.f399483d;
        int i18 = b0Var.f399483d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveLoadInfo");
        return i17 == i18;
    }

    /* renamed from: hashCode */
    public int m145593x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveLoadInfo");
        java.lang.String str = this.f399480a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f399481b;
        int hashCode2 = ((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f399482c)) * 31) + java.lang.Integer.hashCode(this.f399483d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveLoadInfo");
        return hashCode2;
    }

    /* renamed from: toString */
    public java.lang.String m145594x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveLoadInfo");
        java.lang.String str = "ImproveLoadInfo(seqUpLimit=" + this.f399480a + ", seqDownLimit=" + this.f399481b + ", adTimeUpLimit=" + this.f399482c + ", adTimeDownLimit=" + this.f399483d + ')';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveLoadInfo");
        return str;
    }
}
