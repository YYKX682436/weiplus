package ch2;

/* loaded from: classes10.dex */
public final class k2 extends com.tencent.trtc.TRTCCloudListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ch2.o2 f41396a;

    public k2(ch2.o2 o2Var) {
        this.f41396a = o2Var;
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onSpeedTestResult(com.tencent.trtc.TRTCCloudDef.TRTCSpeedTestResult tRTCSpeedTestResult) {
        super.onSpeedTestResult(tRTCSpeedTestResult);
        com.tencent.mars.xlog.Log.i("FinderLiveKTVSingController", "onSpeedTestResult result: " + tRTCSpeedTestResult);
        this.f41396a.Q = tRTCSpeedTestResult != null ? tRTCSpeedTestResult.quality : 6;
    }
}
