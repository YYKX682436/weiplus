package a84;

/* loaded from: classes4.dex */
public abstract class u0 {
    public static void a(com.tencent.mm.modelsns.SnsAdClick snsAdClick, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsAdClickAction", "com.tencent.mm.plugin.sns.ad.utils.SnsAdClickUtil");
        if (snsAdClick != null) {
            snsAdClick.f71470h = i17;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsAdClickAction", "com.tencent.mm.plugin.sns.ad.utils.SnsAdClickUtil");
    }
}
