package tc5;

/* loaded from: classes10.dex */
public final class v implements android.view.Choreographer.FrameCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3 f499109d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kz5.q f499110e;

    public v(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3 activityC21814x1938a8b3, kz5.q qVar) {
        this.f499109d = activityC21814x1938a8b3;
        this.f499110e = qVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j17) {
        kz5.q qVar;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3 activityC21814x1938a8b3 = this.f499109d;
        if (activityC21814x1938a8b3.T || activityC21814x1938a8b3.isFinishing()) {
            activityC21814x1938a8b3.R = false;
            activityC21814x1938a8b3.S = false;
            return;
        }
        if (activityC21814x1938a8b3.F != 0) {
            activityC21814x1938a8b3.R = false;
            activityC21814x1938a8b3.S = false;
            return;
        }
        xm3.t0 b17 = xm3.u0.b(activityC21814x1938a8b3.m7());
        if (b17 == null) {
            activityC21814x1938a8b3.R = false;
            activityC21814x1938a8b3.S = false;
            return;
        }
        int i17 = 3;
        while (true) {
            int i18 = i17 - 1;
            qVar = this.f499110e;
            if (i17 <= 0 || !(!qVar.isEmpty())) {
                break;
            }
            int intValue = ((java.lang.Number) qVar.m144679xed1b9c8c()).intValue();
            if (intValue >= 0 && intValue < b17.mo1894x7e414b06()) {
                b17.m8147xed6e4d18(intValue);
            }
            i17 = i18;
        }
        if (!qVar.isEmpty()) {
            android.view.Choreographer.getInstance().postFrameCallback(this);
            return;
        }
        activityC21814x1938a8b3.R = false;
        if (activityC21814x1938a8b3.S) {
            activityC21814x1938a8b3.S = false;
            activityC21814x1938a8b3.z7();
        }
    }
}
