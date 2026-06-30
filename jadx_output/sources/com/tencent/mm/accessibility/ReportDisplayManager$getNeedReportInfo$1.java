package com.tencent.mm.accessibility;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tencent/mm/accessibility/feature/DisplayReportInfo;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ReportDisplayManager$getNeedReportInfo$1 extends kotlin.jvm.internal.q implements yz5.l {
    public static final com.tencent.mm.accessibility.ReportDisplayManager$getNeedReportInfo$1 INSTANCE = new com.tencent.mm.accessibility.ReportDisplayManager$getNeedReportInfo$1();

    public ReportDisplayManager$getNeedReportInfo$1() {
        super(1);
    }

    @Override // yz5.l
    public final java.lang.CharSequence invoke(com.tencent.mm.accessibility.feature.DisplayReportInfo it) {
        kotlin.jvm.internal.o.g(it, "it");
        return it.toXml();
    }
}
