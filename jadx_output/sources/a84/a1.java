package a84;

/* loaded from: classes4.dex */
public final class a1 extends a84.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f2260a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(java.lang.String name) {
        super(null);
        kotlin.jvm.internal.o.g(name, "name");
        this.f2260a = name;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$XmlNode$TagEnd");
        java.lang.String str = "TagEnd(name='" + this.f2260a + "')";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$XmlNode$TagEnd");
        return str;
    }
}
