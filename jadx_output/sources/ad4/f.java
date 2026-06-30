package ad4;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f3181a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.GestureDetector f3182b;

    public f(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f3181a = "ImproveDebugUtil";
        this.f3182b = new android.view.GestureDetector(context, new ad4.e(this));
    }

    public static final /* synthetic */ java.lang.String a(ad4.f fVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTag$p", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveDebugUtil");
        java.lang.String str = fVar.f3181a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTag$p", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveDebugUtil");
        return str;
    }
}
