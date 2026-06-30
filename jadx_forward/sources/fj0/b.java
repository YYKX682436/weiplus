package fj0;

/* loaded from: classes9.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344630d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f344631e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p780x208df1fe.app.p781x633faad.C10721x192da927 f344632f;

    public b(java.lang.String str, android.app.Activity activity, com.p314xaae8f345.mm.p780x208df1fe.app.p781x633faad.C10721x192da927 c10721x192da927) {
        this.f344630d = str;
        this.f344631e = activity;
        this.f344632f = c10721x192da927;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p347x615374d.gen.AbstractC3628xfac5d5f abstractC3628xfac5d5f = (com.p314xaae8f345.p347x615374d.gen.AbstractC3628xfac5d5f) fj0.c.f344633a.remove(this.f344630d);
        if (abstractC3628xfac5d5f != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DCEPHandler", "callback from resume");
            com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
            m27539xaf65a0fc.mo27566xe4673800("procSts", "0001");
            m27539xaf65a0fc.mo27557xc5c55e60("ret_scene", 2);
            abstractC3628xfac5d5f.mo28480x2e7a5e(m27539xaf65a0fc);
            android.app.Activity activity = this.f344631e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
            ((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) activity).mo273xed6858b4().c(this.f344632f);
        }
    }
}
