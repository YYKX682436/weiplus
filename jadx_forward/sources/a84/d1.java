package a84;

/* loaded from: classes4.dex */
public final class d1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.xmlpull.v1.XmlSerializer f83802d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(org.xmlpull.v1.XmlSerializer xmlSerializer) {
        super(1);
        this.f83802d = xmlSerializer;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$serialize$1");
        a84.c1 curNode = (a84.c1) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$serialize$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(curNode, "curNode");
        boolean z17 = curNode instanceof a84.z0;
        org.xmlpull.v1.XmlSerializer xmlSerializer = this.f83802d;
        if (z17) {
            a84.z0 z0Var = (a84.z0) curNode;
            xmlSerializer.startTag(null, z0Var.b());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAttributeList", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$XmlNode$TagBegin");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAttributeList", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$XmlNode$TagBegin");
            for (jz5.l lVar : z0Var.f83914b) {
                xmlSerializer.attribute(null, (java.lang.String) lVar.f384366d, (java.lang.String) lVar.f384367e);
            }
        } else if (curNode instanceof a84.a1) {
            xmlSerializer.text("");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getName", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$XmlNode$TagEnd");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getName", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$XmlNode$TagEnd");
            xmlSerializer.endTag(null, ((a84.a1) curNode).f83793a);
        } else if (curNode instanceof a84.b1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getText", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$XmlNode$XmlText");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getText", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$XmlNode$XmlText");
            xmlSerializer.text(((a84.b1) curNode).f83796a);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$serialize$1");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$serialize$1");
        return f0Var;
    }
}
