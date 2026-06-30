package a84;

/* loaded from: classes4.dex */
public final class z0 extends a84.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f2380a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f2381b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.List f2382c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f2383d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(java.lang.String name, java.util.List attributeList, java.util.List subNodes, java.lang.String aliasName) {
        super(null);
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(attributeList, "attributeList");
        kotlin.jvm.internal.o.g(subNodes, "subNodes");
        kotlin.jvm.internal.o.g(aliasName, "aliasName");
        this.f2380a = name;
        this.f2381b = attributeList;
        this.f2382c = subNodes;
        this.f2383d = aliasName;
    }

    public final void a(a84.c1 tag) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addTag", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$XmlNode$TagBegin");
        kotlin.jvm.internal.o.g(tag, "tag");
        this.f2382c.add(0, tag);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addTag", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$XmlNode$TagBegin");
    }

    public final java.lang.String b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getName", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$XmlNode$TagBegin");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getName", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$XmlNode$TagBegin");
        return this.f2380a;
    }

    public final java.util.List c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSubNodes", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$XmlNode$TagBegin");
        java.util.List list = this.f2382c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSubNodes", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$XmlNode$TagBegin");
        return list;
    }

    public final void d(java.util.List list) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSubNodes", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$XmlNode$TagBegin");
        kotlin.jvm.internal.o.g(list, "<set-?>");
        this.f2382c = list;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSubNodes", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$XmlNode$TagBegin");
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$XmlNode$TagBegin");
        java.lang.String str = "TagBegin(name='" + this.f2380a + "', attributeList=" + this.f2381b + ", aliasName" + this.f2383d + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$XmlNode$TagBegin");
        return str;
    }
}
