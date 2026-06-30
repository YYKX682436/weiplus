package a84;

/* loaded from: classes4.dex */
public final class d1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.xmlpull.v1.XmlSerializer f2269d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(org.xmlpull.v1.XmlSerializer xmlSerializer) {
        super(1);
        this.f2269d = xmlSerializer;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$serialize$1");
        a84.c1 curNode = (a84.c1) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$serialize$1");
        kotlin.jvm.internal.o.g(curNode, "curNode");
        boolean z17 = curNode instanceof a84.z0;
        org.xmlpull.v1.XmlSerializer xmlSerializer = this.f2269d;
        if (z17) {
            a84.z0 z0Var = (a84.z0) curNode;
            xmlSerializer.startTag(null, z0Var.b());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAttributeList", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$XmlNode$TagBegin");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAttributeList", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$XmlNode$TagBegin");
            for (jz5.l lVar : z0Var.f2381b) {
                xmlSerializer.attribute(null, (java.lang.String) lVar.f302833d, (java.lang.String) lVar.f302834e);
            }
        } else if (curNode instanceof a84.a1) {
            xmlSerializer.text("");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getName", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$XmlNode$TagEnd");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getName", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$XmlNode$TagEnd");
            xmlSerializer.endTag(null, ((a84.a1) curNode).f2260a);
        } else if (curNode instanceof a84.b1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getText", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$XmlNode$XmlText");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getText", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$XmlNode$XmlText");
            xmlSerializer.text(((a84.b1) curNode).f2263a);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$serialize$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$serialize$1");
        return f0Var;
    }
}
