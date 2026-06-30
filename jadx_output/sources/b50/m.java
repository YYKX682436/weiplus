package b50;

/* loaded from: classes11.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.finderbox.flutter.model.BoxFlutterBizPlugin f17959d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f17960e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f17961f;

    public m(com.tencent.mm.feature.finderbox.flutter.model.BoxFlutterBizPlugin boxFlutterBizPlugin, long j17, int i17) {
        this.f17959d = boxFlutterBizPlugin;
        this.f17960e = j17;
        this.f17961f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.pigeon.biz_base.BizPerformanceReportEvent bizPerformanceReportEvent = this.f17959d.f67065h;
        if (bizPerformanceReportEvent != null) {
            long j17 = this.f17960e;
            int i17 = this.f17961f;
            bizPerformanceReportEvent.onCgiGetFinderLiveInfoEnd(j17, i17 == 0, i17, b50.l.f17956d);
        }
    }
}
