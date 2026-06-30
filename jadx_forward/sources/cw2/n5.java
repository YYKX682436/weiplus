package cw2;

/* loaded from: classes15.dex */
public final class n5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw2.d6 f305416d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f305417e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f305418f;

    public n5(cw2.d6 d6Var, android.content.Context context, yz5.l lVar) {
        this.f305416d = d6Var;
        this.f305417e = context;
        this.f305418f = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean m47846x316510 = this.f305416d.f305182c.m47846x316510(com.p314xaae8f345.mm.p937x8ef83553.C11100x5c67d993.INSTANCE.m47861x23f08a57(this.f305417e), false);
        yz5.l lVar = this.f305418f;
        if (m47846x316510) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderThumbPlayerPostProcessor", "Init post processor. instance=" + cw2.d6.f305178g);
            lVar.mo146xb9724478(java.lang.Boolean.TRUE);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderThumbPlayerPostProcessor", "Init post processor failed. instance=" + cw2.d6.f305178g);
        lVar.mo146xb9724478(java.lang.Boolean.FALSE);
    }
}
