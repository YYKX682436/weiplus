package fj0;

/* loaded from: classes9.dex */
public final class a implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344629d;

    public a(java.lang.String str) {
        this.f344629d = str;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public final void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DCEPHandler", "mmSetOnActivityResultCallback: " + i17 + ", " + i18 + ", " + intent);
        com.p314xaae8f345.p347x615374d.gen.AbstractC3628xfac5d5f abstractC3628xfac5d5f = (com.p314xaae8f345.p347x615374d.gen.AbstractC3628xfac5d5f) fj0.c.f344633a.remove(this.f344629d);
        if (abstractC3628xfac5d5f != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DCEPHandler", "callback from activity result");
            com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
            m27539xaf65a0fc.mo27566xe4673800("procSts", "0001");
            m27539xaf65a0fc.mo27557xc5c55e60("ret_scene", 2);
            abstractC3628xfac5d5f.mo28480x2e7a5e(m27539xaf65a0fc);
        }
    }
}
