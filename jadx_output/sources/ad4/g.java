package ad4;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final ad4.g f3183a = new ad4.g();

    public final void a(android.view.View view, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("relocateFeed", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveFeedRelocateUtil");
        if (view == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("relocateFeed", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveFeedRelocateUtil");
            return;
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i18 = iArr[1];
        int height = i18 + view.getHeight();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("relocateFeed$default", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveFeedRelocateUtil");
        b(view, i18, height, i17, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("relocateFeed$default", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveFeedRelocateUtil");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("relocateFeed", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveFeedRelocateUtil");
    }

    public final void b(android.view.View view, int i17, int i18, int i19, java.lang.Runnable runnable) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("relocateFeed", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveFeedRelocateUtil");
        if (view == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("relocateFeed", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveFeedRelocateUtil");
            return;
        }
        int dimensionPixelSize = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479649bo) + i19;
        com.tencent.mm.autogen.events.SnsFeedRelocateEvent snsFeedRelocateEvent = new com.tencent.mm.autogen.events.SnsFeedRelocateEvent();
        am.pv pvVar = snsFeedRelocateEvent.f54807g;
        pvVar.f7661a = view;
        pvVar.f7662b = i17;
        pvVar.f7663c = i18;
        pvVar.f7664d = dimensionPixelSize;
        pvVar.f7665e = runnable;
        snsFeedRelocateEvent.e();
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.FeedRelocateUtil", "relocateFeed: changeAreaTop:" + i17 + ", changeAreaBottom:" + i18 + ", totalExtraOffsetY:" + dimensionPixelSize);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("relocateFeed", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveFeedRelocateUtil");
    }
}
