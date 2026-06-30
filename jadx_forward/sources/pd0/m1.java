package pd0;

/* loaded from: classes9.dex */
public class m1 implements com.p314xaae8f345.mm.app.v6 {
    @Override // com.p314xaae8f345.mm.app.v6
    /* renamed from: onActivityCreated */
    public void mo9958x78cb4fa(android.app.Activity activity, android.os.Bundle bundle) {
        try {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                w04.l.INSTANCE.D9(activity);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SOALC", "call onActivityCreated error: " + e17);
        }
    }

    @Override // com.p314xaae8f345.mm.app.v6
    /* renamed from: onActivityDestroyed */
    public void mo9959xa9f48fab(android.app.Activity activity) {
    }

    @Override // com.p314xaae8f345.mm.app.v6
    /* renamed from: onActivityPaused */
    public void mo27324x99a658dc(android.app.Activity activity) {
    }

    @Override // com.p314xaae8f345.mm.app.v6
    /* renamed from: onActivityResumed */
    public void mo27339xba973e9(android.app.Activity activity) {
        try {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                w04.l.INSTANCE.Eg(activity);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SOALC", "call onActivityResumed error: " + e17);
        }
    }

    @Override // com.p314xaae8f345.mm.app.v6
    /* renamed from: onActivitySaveInstanceState */
    public void mo27340x634d9e11(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // com.p314xaae8f345.mm.app.v6
    /* renamed from: onActivityStarted */
    public void mo27341x59297693(android.app.Activity activity) {
    }

    @Override // com.p314xaae8f345.mm.app.v6
    /* renamed from: onActivityStopped */
    public void mo27342x59edc7df(android.app.Activity activity) {
    }
}
