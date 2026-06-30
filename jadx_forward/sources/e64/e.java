package e64;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f331354a;

    /* renamed from: b, reason: collision with root package name */
    public e64.h f331355b;

    /* renamed from: c, reason: collision with root package name */
    public h64.a f331356c;

    public e(int i17, e64.h hVar, h64.a aVar, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        hVar = (i18 & 2) != 0 ? null : hVar;
        aVar = (i18 & 4) != 0 ? null : aVar;
        this.f331354a = i17;
        this.f331355b = hVar;
        this.f331356c = aVar;
    }

    public final h64.a a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMbInfoHelper", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushData");
        h64.a aVar = this.f331356c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMbInfoHelper", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushData");
        return aVar;
    }

    /* renamed from: equals */
    public boolean m127081xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushData");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushData");
            return true;
        }
        if (!(obj instanceof e64.e)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushData");
            return false;
        }
        e64.e eVar = (e64.e) obj;
        if (this.f331354a != eVar.f331354a) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushData");
            return false;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f331355b, eVar.f331355b)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushData");
            return false;
        }
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f331356c, eVar.f331356c);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushData");
        return b17;
    }

    /* renamed from: hashCode */
    public int m127082x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushData");
        int hashCode = java.lang.Integer.hashCode(this.f331354a) * 31;
        e64.h hVar = this.f331355b;
        int hashCode2 = (hashCode + (hVar == null ? 0 : hVar.hashCode())) * 31;
        h64.a aVar = this.f331356c;
        int hashCode3 = hashCode2 + (aVar != null ? aVar.hashCode() : 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushData");
        return hashCode3;
    }

    /* renamed from: toString */
    public java.lang.String m127083x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushData");
        java.lang.String str = "MagicBrushData(activityHash=" + this.f331354a + ", biz=" + this.f331355b + ", mbInfoHelper=" + this.f331356c + ')';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushData");
        return str;
    }
}
