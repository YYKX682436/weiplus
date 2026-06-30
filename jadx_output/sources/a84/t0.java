package a84;

/* loaded from: classes4.dex */
public abstract class t0 {
    public static void a(a84.r0 r0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("report", "com.tencent.mm.plugin.sns.ad.utils.SnsAdChannelReporter");
        if (r0Var != null) {
            try {
                b(r0Var.getChannel(), r0Var.j());
            } catch (java.lang.Throwable unused) {
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("report", "com.tencent.mm.plugin.sns.ad.utils.SnsAdChannelReporter");
    }

    public static void b(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("report", "com.tencent.mm.plugin.sns.ad.utils.SnsAdChannelReporter");
        try {
            ca4.m0.a(str, str2);
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("report", "com.tencent.mm.plugin.sns.ad.utils.SnsAdChannelReporter");
    }
}
