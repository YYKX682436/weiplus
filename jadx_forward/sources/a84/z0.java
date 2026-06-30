package a84;

/* loaded from: classes4.dex */
public final class z0 extends a84.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f83913a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f83914b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.List f83915c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f83916d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(java.lang.String name, java.util.List attributeList, java.util.List subNodes, java.lang.String aliasName) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attributeList, "attributeList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subNodes, "subNodes");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aliasName, "aliasName");
        this.f83913a = name;
        this.f83914b = attributeList;
        this.f83915c = subNodes;
        this.f83916d = aliasName;
    }

    public final void a(a84.c1 tag) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addTag", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$XmlNode$TagBegin");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        this.f83915c.add(0, tag);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addTag", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$XmlNode$TagBegin");
    }

    public final java.lang.String b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getName", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$XmlNode$TagBegin");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getName", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$XmlNode$TagBegin");
        return this.f83913a;
    }

    public final java.util.List c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSubNodes", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$XmlNode$TagBegin");
        java.util.List list = this.f83915c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSubNodes", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$XmlNode$TagBegin");
        return list;
    }

    public final void d(java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSubNodes", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$XmlNode$TagBegin");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "<set-?>");
        this.f83915c = list;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSubNodes", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$XmlNode$TagBegin");
    }

    /* renamed from: toString */
    public java.lang.String m862x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$XmlNode$TagBegin");
        java.lang.String str = "TagBegin(name='" + this.f83913a + "', attributeList=" + this.f83914b + ", aliasName" + this.f83916d + ')';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$XmlNode$TagBegin");
        return str;
    }
}
