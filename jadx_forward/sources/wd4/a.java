package wd4;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f526387a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f526388b;

    public a(boolean z17, java.util.List allNotReadyConditions) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(allNotReadyConditions, "allNotReadyConditions");
        this.f526387a = z17;
        this.f526388b = allNotReadyConditions;
    }

    /* renamed from: equals */
    public boolean m173540xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$CheckConditionsResult");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$CheckConditionsResult");
            return true;
        }
        if (!(obj instanceof wd4.a)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$CheckConditionsResult");
            return false;
        }
        wd4.a aVar = (wd4.a) obj;
        if (this.f526387a != aVar.f526387a) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$CheckConditionsResult");
            return false;
        }
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f526388b, aVar.f526388b);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$CheckConditionsResult");
        return b17;
    }

    /* renamed from: hashCode */
    public int m173541x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$CheckConditionsResult");
        int hashCode = (java.lang.Boolean.hashCode(this.f526387a) * 31) + this.f526388b.hashCode();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$CheckConditionsResult");
        return hashCode;
    }

    /* renamed from: toString */
    public java.lang.String m173542x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$CheckConditionsResult");
        java.lang.String str = "CheckConditionsResult(allConditionsGranted=" + this.f526387a + ", allNotReadyConditions=" + this.f526388b + ')';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$CheckConditionsResult");
        return str;
    }
}
