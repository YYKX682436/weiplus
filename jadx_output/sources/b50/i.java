package b50;

/* loaded from: classes11.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.finderbox.flutter.model.BoxFlutterBizPlugin f17946d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f17947e;

    public i(com.tencent.mm.feature.finderbox.flutter.model.BoxFlutterBizPlugin boxFlutterBizPlugin, long j17) {
        this.f17946d = boxFlutterBizPlugin;
        this.f17947e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.pigeon.biz_base.BizPerformanceReportEvent bizPerformanceReportEvent = this.f17946d.f67065h;
        if (bizPerformanceReportEvent != null) {
            bizPerformanceReportEvent.onCgiGetFinderLiveInfoStart(this.f17947e, b50.h.f17944d);
        }
    }
}
