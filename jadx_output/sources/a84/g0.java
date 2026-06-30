package a84;

/* loaded from: classes4.dex */
public abstract class g0 extends com.tencent.mm.sdk.platformtools.c2 {
    public static double n(android.os.Bundle bundle, java.lang.String str, double d17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDouble", "com.tencent.mm.plugin.sns.ad.utils.IntentUtilEx");
        if (bundle == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDouble", "com.tencent.mm.plugin.sns.ad.utils.IntentUtilEx");
            return d17;
        }
        try {
            d17 = bundle.getDouble(str, d17);
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDouble", "com.tencent.mm.plugin.sns.ad.utils.IntentUtilEx");
        return d17;
    }
}
