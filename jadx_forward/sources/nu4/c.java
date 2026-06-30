package nu4;

/* loaded from: classes7.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nu4.b0 f421775d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nu4.d f421776e;

    public c(nu4.b0 b0Var, nu4.d dVar) {
        this.f421775d = b0Var;
        this.f421776e = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f421775d.C;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAppBackground delay run isBackground: %s, hashCode: ");
        nu4.d dVar = this.f421776e;
        sb6.append(dVar.hashCode());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString(), java.lang.Boolean.valueOf(dVar.f421780e));
        if (dVar.f421780e) {
            nu4.b0 b0Var = dVar.f421781f;
            if (b0Var.f412992w) {
                return;
            }
            b0Var.mo51548x65825f6();
        }
    }
}
