package ad4;

/* loaded from: classes3.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f3188a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f3189b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static android.os.HandlerThread f3190c;

    /* renamed from: d, reason: collision with root package name */
    public static t26.d f3191d;

    public static final /* synthetic */ java.util.HashMap a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getDownloadingTask$p", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveImageDownloadUtil");
        java.util.HashMap hashMap = f3188a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getDownloadingTask$p", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveImageDownloadUtil");
        return hashMap;
    }

    public static final void b(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeTask", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveImageDownloadUtil");
        if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeTask", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveImageDownloadUtil");
            return;
        }
        t26.d dVar = f3191d;
        if (dVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeTask", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveImageDownloadUtil");
        } else {
            kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, dVar, null, new ad4.k(str, null), 2, null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeTask", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveImageDownloadUtil");
        }
    }
}
