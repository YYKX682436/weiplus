package ad4;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f3176d = true;

    /* renamed from: a, reason: collision with root package name */
    public final int f3177a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f3178b = jz5.h.b(ad4.c.f3174d);

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f3179c = jz5.h.b(new ad4.b(this));

    static {
        new ad4.a(null);
    }

    public d(int i17) {
        this.f3177a = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateServerConfig$default", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveAutoPlayManager$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateServerConfig", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveAutoPlayManager$Companion");
        boolean z17 = com.tencent.mm.sdk.platformtools.o4.L().o("MicroMsg.Improve.AutoPlayUtil", 0) <= 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setAutoPlayServerConfig$cp", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveAutoPlayManager");
        f3176d = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setAutoPlayServerConfig$cp", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveAutoPlayManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateServerConfig", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveAutoPlayManager$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateServerConfig$default", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveAutoPlayManager$Companion");
    }

    public final boolean a(android.content.Context context, android.graphics.Rect rect) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkItemVisible", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveAutoPlayManager");
        boolean z17 = false;
        if (rect.isEmpty()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkItemVisible", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveAutoPlayManager");
            return false;
        }
        pc4.d dVar = pc4.d.f353410a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getActionBottomPoistion", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        kotlin.jvm.internal.o.g(context, "context");
        int h17 = i65.a.h(context, com.tencent.mm.R.dimen.f479623ay) + com.tencent.mm.ui.bl.h(context);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getActionBottomPoistion", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        int i17 = rect.bottom;
        if (i17 > h17 && i17 > h17 + ((i17 - rect.top) / 2)) {
            int i18 = context.getResources().getDisplayMetrics().heightPixels;
            int i19 = rect.top;
            if (i18 - i19 > (rect.bottom - i19) / 2) {
                z17 = true;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkItemVisible", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveAutoPlayManager");
        return z17;
    }

    public final com.tencent.mm.plugin.sns.ui.zm b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsNetworkMgr", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveAutoPlayManager");
        com.tencent.mm.plugin.sns.ui.zm zmVar = (com.tencent.mm.plugin.sns.ui.zm) ((jz5.n) this.f3178b).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsNetworkMgr", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveAutoPlayManager");
        return zmVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ac, code lost:
    
        if (r12 != false) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(androidx.recyclerview.widget.RecyclerView r17, int r18, java.util.ArrayList r19) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ad4.d.c(androidx.recyclerview.widget.RecyclerView, int, java.util.ArrayList):void");
    }
}
