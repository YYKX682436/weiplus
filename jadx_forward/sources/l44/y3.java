package l44;

/* loaded from: classes4.dex */
public class y3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f397958a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f397959b;

    /* renamed from: c, reason: collision with root package name */
    public final int f397960c;

    public y3(java.lang.String str, java.lang.String str2, int i17) {
        this.f397958a = str;
        this.f397959b = str2;
        this.f397960c = i17;
    }

    /* renamed from: equals */
    public boolean m145135xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader$WeAppInfo");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader$WeAppInfo");
            return true;
        }
        if (obj instanceof l44.y3) {
            l44.y3 y3Var = (l44.y3) obj;
            if (this.f397960c == y3Var.f397960c && u46.l.c(this.f397958a, y3Var.f397958a) && u46.l.c(this.f397959b, y3Var.f397959b)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader$WeAppInfo");
                return true;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader$WeAppInfo");
        return false;
    }

    /* renamed from: toString */
    public java.lang.String m145136x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader$WeAppInfo");
        java.lang.String str = this.f397958a + "|" + this.f397960c + "|" + this.f397959b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader$WeAppInfo");
        return str;
    }
}
