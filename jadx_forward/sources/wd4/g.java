package wd4;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622 f526436a;

    /* renamed from: b, reason: collision with root package name */
    public final bi1.g f526437b;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622 model, bi1.g scene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(model, "model");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        this.f526436a = model;
        this.f526437b = scene;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622 a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getModel", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$MaterialInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getModel", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$MaterialInfo");
        return this.f526436a;
    }

    public final bi1.g b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getScene", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$MaterialInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getScene", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$MaterialInfo");
        return this.f526437b;
    }

    /* renamed from: equals */
    public boolean m173546xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$MaterialInfo");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$MaterialInfo");
            return true;
        }
        if (!(obj instanceof wd4.g)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$MaterialInfo");
            return false;
        }
        wd4.g gVar = (wd4.g) obj;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f526436a, gVar.f526436a)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$MaterialInfo");
            return false;
        }
        bi1.g gVar2 = this.f526437b;
        bi1.g gVar3 = gVar.f526437b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$MaterialInfo");
        return gVar2 == gVar3;
    }

    /* renamed from: hashCode */
    public int m173547x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$MaterialInfo");
        int m52073x8cdac1b = (this.f526436a.m52073x8cdac1b() * 31) + this.f526437b.hashCode();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$MaterialInfo");
        return m52073x8cdac1b;
    }

    /* renamed from: toString */
    public java.lang.String m173548x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$MaterialInfo");
        java.lang.String str = "MaterialInfo(model=" + this.f526436a + ", scene=" + this.f526437b + ')';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$MaterialInfo");
        return str;
    }
}
