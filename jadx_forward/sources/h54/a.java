package h54;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f360604a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f360605b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f360606c;

    /* renamed from: d, reason: collision with root package name */
    public final int f360607d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f360608e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f360609f;

    /* renamed from: g, reason: collision with root package name */
    public final fe0.z3 f360610g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f360611h;

    public a(int i17, java.lang.String url, java.lang.String compId, int i18, java.lang.String str, java.lang.String str2, fe0.z3 z3Var, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(compId, "compId");
        this.f360604a = i17;
        this.f360605b = url;
        this.f360606c = compId;
        this.f360607d = i18;
        this.f360608e = str;
        this.f360609f = str2;
        this.f360610g = z3Var;
        this.f360611h = z17;
    }

    public final java.lang.String a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCompId", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormData");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCompId", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormData");
        return this.f360606c;
    }

    public final java.lang.String b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormData");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormData");
        return this.f360605b;
    }

    public final void c(java.util.Map params) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onEvent", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        fe0.z3 z3Var = this.f360610g;
        if (z3Var != null) {
            z3Var.a(params);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onEvent", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormData");
    }

    /* renamed from: equals */
    public boolean m132903xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormData");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormData");
            return true;
        }
        if (!(obj instanceof h54.a)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormData");
            return false;
        }
        h54.a aVar = (h54.a) obj;
        if (this.f360604a != aVar.f360604a) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormData");
            return false;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f360605b, aVar.f360605b)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormData");
            return false;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f360606c, aVar.f360606c)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormData");
            return false;
        }
        if (this.f360607d != aVar.f360607d) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormData");
            return false;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f360608e, aVar.f360608e)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormData");
            return false;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f360609f, aVar.f360609f)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormData");
            return false;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f360610g, aVar.f360610g)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormData");
            return false;
        }
        boolean z17 = this.f360611h;
        boolean z18 = aVar.f360611h;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormData");
        return z17 == z18;
    }

    /* renamed from: hashCode */
    public int m132904x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormData");
        int hashCode = ((((((java.lang.Integer.hashCode(this.f360604a) * 31) + this.f360605b.hashCode()) * 31) + this.f360606c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f360607d)) * 31;
        java.lang.String str = this.f360608e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f360609f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        fe0.z3 z3Var = this.f360610g;
        int hashCode4 = ((hashCode3 + (z3Var != null ? z3Var.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f360611h);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormData");
        return hashCode4;
    }

    /* renamed from: toString */
    public java.lang.String m132905x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormData");
        java.lang.String str = "FormData(id=" + this.f360604a + ", url=" + this.f360605b + ", compId=" + this.f360606c + ", subType=" + this.f360607d + ", qrExtInfo=" + this.f360608e + ", canvasKey=" + this.f360609f + ", onEvent=" + this.f360610g + ", isBackgroundTransparent=" + this.f360611h + ')';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.FormData");
        return str;
    }

    public /* synthetic */ a(int i17, java.lang.String str, java.lang.String str2, int i18, java.lang.String str3, java.lang.String str4, fe0.z3 z3Var, boolean z17, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(i17, str, str2, i18, str3, str4, z3Var, (i19 & 128) != 0 ? false : z17);
    }
}
