package kl4;

/* loaded from: classes11.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kl4.a0 f390493d;

    public r(kl4.a0 a0Var) {
        this.f390493d = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kl4.a0 a0Var = this.f390493d;
        ll4.d dVar = a0Var.f390401e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a0Var.f390413t, "Ting-Trace [" + a0Var.a() + "] call playerCore[" + dVar + "] pause()");
        if (dVar != null) {
            dVar.f(true);
        }
    }
}
