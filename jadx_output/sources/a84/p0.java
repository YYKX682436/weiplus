package a84;

/* loaded from: classes4.dex */
public abstract class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Random f2347a = new java.util.Random();

    public static float a(float f17, float f18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRandom", "com.tencent.mm.plugin.sns.ad.utils.RandomUtils");
        float min = java.lang.Math.min(f17, f18);
        float max = java.lang.Math.max(f17, f18) - min;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRandom", "com.tencent.mm.plugin.sns.ad.utils.RandomUtils");
        float nextFloat = f2347a.nextFloat() * max;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRandom", "com.tencent.mm.plugin.sns.ad.utils.RandomUtils");
        float f19 = nextFloat + min;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRandom", "com.tencent.mm.plugin.sns.ad.utils.RandomUtils");
        return f19;
    }
}
