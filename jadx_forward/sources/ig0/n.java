package ig0;

/* loaded from: classes12.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ig0.o f372864d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f372865e;

    public n(ig0.o oVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f372864d = oVar;
        this.f372865e = f9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dg0.e eVar;
        c01.v8 v8Var;
        ig0.o oVar = this.f372864d;
        java.lang.ref.WeakReference weakReference = oVar.f372867n;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f372865e;
        if (weakReference != null && (v8Var = (c01.v8) weakReference.get()) != null) {
            v8Var.a(f9Var);
        }
        java.lang.ref.WeakReference weakReference2 = oVar.f372868o;
        if (weakReference2 == null || (eVar = (dg0.e) weakReference2.get()) == null) {
            return;
        }
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.v0) eVar).p(f9Var);
    }
}
