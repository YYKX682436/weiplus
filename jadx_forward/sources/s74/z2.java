package s74;

/* loaded from: classes.dex */
public final class z2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f486160a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f486161b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f486162c;

    public z2(int i17, java.lang.String eventName, java.util.Map map, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i18 & 1) != 0 ? 0 : i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventName, "eventName");
        this.f486160a = i17;
        this.f486161b = eventName;
        this.f486162c = map;
    }

    /* renamed from: equals */
    public boolean m164091xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicTemplateEvent");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicTemplateEvent");
            return true;
        }
        if (!(obj instanceof s74.z2)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicTemplateEvent");
            return false;
        }
        s74.z2 z2Var = (s74.z2) obj;
        if (this.f486160a != z2Var.f486160a) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicTemplateEvent");
            return false;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f486161b, z2Var.f486161b)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicTemplateEvent");
            return false;
        }
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f486162c, z2Var.f486162c);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicTemplateEvent");
        return b17;
    }

    /* renamed from: hashCode */
    public int m164092x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicTemplateEvent");
        int hashCode = ((java.lang.Integer.hashCode(this.f486160a) * 31) + this.f486161b.hashCode()) * 31;
        java.util.Map map = this.f486162c;
        int hashCode2 = hashCode + (map == null ? 0 : map.hashCode());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicTemplateEvent");
        return hashCode2;
    }

    /* renamed from: toString */
    public java.lang.String m164093x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicTemplateEvent");
        java.lang.String str = "DynamicTemplateEvent(eventType=" + this.f486160a + ", eventName=" + this.f486161b + ", eventData=" + this.f486162c + ')';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicTemplateEvent");
        return str;
    }
}
