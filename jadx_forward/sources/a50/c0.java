package a50;

/* loaded from: classes11.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a50.e0 f82993d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f82994e;

    public c0(a50.e0 e0Var, int i17) {
        this.f82993d = e0Var;
        this.f82994e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.e eVar = this.f82993d.f83003a;
        if (eVar != null) {
            eVar.f(this.f82994e);
        }
    }
}
