package kl4;

/* loaded from: classes11.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kl4.a0 f390504d;

    public y(kl4.a0 a0Var) {
        this.f390504d = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        il4.l lVar = il4.l.f373675a;
        il4.l.f373679e = null;
        kl4.a0 a0Var = this.f390504d;
        a0Var.f390402f = true;
        a0Var.f390409p = false;
        ll4.d dVar = a0Var.f390401e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a0Var.f390413t, "Ting-Trace [" + a0Var.a() + "] call playerCore[" + dVar + "] stop()");
        if (dVar != null) {
            dVar.mo145974x360802();
        }
        if (dVar != null) {
            dVar.mo145969x41012807();
        }
    }
}
