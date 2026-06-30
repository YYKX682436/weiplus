package a84;

/* loaded from: classes4.dex */
public final class b1 extends a84.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f2263a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(java.lang.String text) {
        super(null);
        kotlin.jvm.internal.o.g(text, "text");
        this.f2263a = text;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$XmlNode$XmlText");
        java.lang.String str = "XmlText(text='" + this.f2263a + "')";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$XmlNode$XmlText");
        return str;
    }
}
