package ch2;

/* loaded from: classes10.dex */
public final class k2 extends com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ch2.o2 f122929a;

    public k2(ch2.o2 o2Var) {
        this.f122929a = o2Var;
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c
    /* renamed from: onSpeedTestResult */
    public void mo14858xe38317(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCSpeedTestResult tRTCSpeedTestResult) {
        super.mo14858xe38317(tRTCSpeedTestResult);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveKTVSingController", "onSpeedTestResult result: " + tRTCSpeedTestResult);
        this.f122929a.Q = tRTCSpeedTestResult != null ? tRTCSpeedTestResult.f57115x26d0c0ff : 6;
    }
}
