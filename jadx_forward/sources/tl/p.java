package tl;

/* loaded from: classes12.dex */
public class p implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {
    public p(tl.t tVar) {
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAudioRecorder", "Acc try interrupt read");
        try {
            ((android.view.accessibility.AccessibilityManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("accessibility")).interrupt();
            return true;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }
}
