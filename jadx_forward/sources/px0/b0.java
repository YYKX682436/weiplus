package px0;

/* loaded from: classes5.dex */
public final class b0 extends oz5.a implements p3325xe03a0797.p3326xc267989b.r0 {
    public b0(p3325xe03a0797.p3326xc267989b.q0 q0Var) {
        super(q0Var);
    }

    @Override // p3325xe03a0797.p3326xc267989b.r0
    /* renamed from: handleException */
    public void mo565x9514ef07(oz5.l lVar, java.lang.Throwable th6) {
        if (th6 instanceof java.util.concurrent.CancellationException) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MaterialImportPreviewFragment", "scope cancelled");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MaterialImportPreviewFragment", "scope throwable", th6);
        }
    }
}
