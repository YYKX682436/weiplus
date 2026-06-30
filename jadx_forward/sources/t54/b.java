package t54;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f497375a;

    /* renamed from: b, reason: collision with root package name */
    public int f497376b;

    /* renamed from: c, reason: collision with root package name */
    public int f497377c;

    public final void a(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCompType", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$TypeTriple");
        this.f497376b = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCompType", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$TypeTriple");
    }

    public final void b(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setNodeType", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$TypeTriple");
        this.f497375a = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setNodeType", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$TypeTriple");
    }

    public final void c(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSubCompType", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$TypeTriple");
        this.f497377c = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSubCompType", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$TypeTriple");
    }

    /* renamed from: equals */
    public boolean m165914xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$TypeTriple");
        boolean z17 = false;
        if (obj instanceof t54.b) {
            t54.b bVar = (t54.b) obj;
            if (bVar.f497375a == this.f497375a && bVar.f497376b == this.f497376b && bVar.f497377c == this.f497377c) {
                z17 = true;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$TypeTriple");
        return z17;
    }

    /* renamed from: hashCode */
    public int m165915x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$TypeTriple");
        int i17 = this.f497375a + this.f497376b + this.f497377c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$TypeTriple");
        return i17;
    }

    /* renamed from: toString */
    public java.lang.String m165916x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$TypeTriple");
        java.lang.String str = "[nodeType=" + this.f497375a + ",compType=" + this.f497376b + ",subCompType=" + this.f497377c + ']';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$TypeTriple");
        return str;
    }
}
