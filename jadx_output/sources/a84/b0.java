package a84;

/* loaded from: classes4.dex */
public abstract class b0 {
    public static boolean a(int i17, java.util.Collection collection) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkIndexOutOfBounds", "com.tencent.mm.plugin.sns.ad.utils.CollectionUtils");
        boolean z17 = b(collection) || i17 < 0 || i17 >= collection.size();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkIndexOutOfBounds", "com.tencent.mm.plugin.sns.ad.utils.CollectionUtils");
        return z17;
    }

    public static boolean b(java.util.Collection collection) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isEmpty", "com.tencent.mm.plugin.sns.ad.utils.CollectionUtils");
        boolean z17 = collection == null || collection.isEmpty();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isEmpty", "com.tencent.mm.plugin.sns.ad.utils.CollectionUtils");
        return z17;
    }

    public static boolean c(java.util.Map map) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isEmpty", "com.tencent.mm.plugin.sns.ad.utils.CollectionUtils");
        boolean z17 = map == null || map.isEmpty();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isEmpty", "com.tencent.mm.plugin.sns.ad.utils.CollectionUtils");
        return z17;
    }

    public static boolean d(java.lang.Object[] objArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isEmpty", "com.tencent.mm.plugin.sns.ad.utils.CollectionUtils");
        boolean z17 = objArr == null || objArr.length == 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isEmpty", "com.tencent.mm.plugin.sns.ad.utils.CollectionUtils");
        return z17;
    }

    public static boolean e(java.util.Collection collection) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notEmpty", "com.tencent.mm.plugin.sns.ad.utils.CollectionUtils");
        boolean z17 = !b(collection);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notEmpty", "com.tencent.mm.plugin.sns.ad.utils.CollectionUtils");
        return z17;
    }

    public static boolean f(java.util.Map map) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notEmpty", "com.tencent.mm.plugin.sns.ad.utils.CollectionUtils");
        boolean z17 = !c(map);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notEmpty", "com.tencent.mm.plugin.sns.ad.utils.CollectionUtils");
        return z17;
    }

    public static boolean g(java.lang.Object[] objArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notEmpty", "com.tencent.mm.plugin.sns.ad.utils.CollectionUtils");
        boolean z17 = !d(objArr);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notEmpty", "com.tencent.mm.plugin.sns.ad.utils.CollectionUtils");
        return z17;
    }
}
