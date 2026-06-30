package a54;

/* loaded from: classes4.dex */
public abstract class h {
    public static final java.lang.String a(ab4.n0 n0Var) {
        java.lang.String o17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("validUxInfo", "com.tencent.mm.plugin.sns.ad.landingpage.PageDataExKt");
        if (n0Var == null || (o17 = n0Var.n()) == null) {
            o17 = n0Var != null ? n0Var.o() : null;
            if (o17 == null) {
                o17 = "";
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("validUxInfo", "com.tencent.mm.plugin.sns.ad.landingpage.PageDataExKt");
        return o17;
    }
}
