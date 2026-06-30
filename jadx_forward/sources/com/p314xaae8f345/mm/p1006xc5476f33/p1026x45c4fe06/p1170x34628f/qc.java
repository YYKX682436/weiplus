package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class qc implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.uc f168575a;

    public qc(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.uc ucVar) {
        this.f168575a = ucVar;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.uc ucVar = this.f168575a;
        if (ucVar.f168683d.Q()) {
            if (!"undefined".equals(str)) {
                float L = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L(str, -1.0f);
                if (L > 0.0f) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.MPPageViewRenderer", "[%s] update density with window.devicePixelRatio = %s", ucVar.a(), str);
                    float m52252xebd2e91b = ucVar.f168683d.f167914s.m52252xebd2e91b();
                    if (L != m52252xebd2e91b) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.MPPageViewRenderer", "[%s] mismatch devicePixelRatio!!! interface[%f], WebView[%f]", ucVar.a(), java.lang.Float.valueOf(m52252xebd2e91b), java.lang.Float.valueOf(L));
                    }
                    if (L > 0.0f) {
                        ik1.w.f373376b = java.lang.Float.valueOf(L);
                        return;
                    } else {
                        android.util.DisplayMetrics displayMetrics = ik1.w.f373375a;
                        return;
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.MPPageViewRenderer", "[%s] invalid window.devicePixelRatio %s", ucVar.a(), str);
        }
    }
}
