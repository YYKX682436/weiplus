package kb4;

/* loaded from: classes11.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f387773a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f387774b;

    /* renamed from: c, reason: collision with root package name */
    public final kb4.c f387775c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f387776d;

    public c(java.lang.String key, java.lang.String label, java.util.List list, kb4.c cVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(label, "label");
        this.f387773a = key;
        this.f387774b = label;
        this.f387775c = cVar;
        this.f387776d = list;
    }

    public final java.util.List a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getChildNodes", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.PickDataNode");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getChildNodes", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.PickDataNode");
        return this.f387776d;
    }

    public final java.lang.String b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getKey", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.PickDataNode");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getKey", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.PickDataNode");
        return this.f387773a;
    }

    /* renamed from: toString */
    public java.lang.String m142347x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.PickDataNode");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("PickDataNode(key='");
        sb6.append(this.f387773a);
        sb6.append("', label='");
        sb6.append(this.f387774b);
        sb6.append("', childNodes=");
        java.util.List list = this.f387776d;
        sb6.append(list != null ? java.lang.Integer.valueOf(list.size()) : null);
        sb6.append(", parentNode=");
        sb6.append(this.f387775c);
        sb6.append(')');
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.PickDataNode");
        return sb7;
    }
}
