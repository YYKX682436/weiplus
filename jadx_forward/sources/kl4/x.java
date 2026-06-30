package kl4;

/* loaded from: classes11.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kl4.a0 f390502d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f390503e;

    public x(kl4.a0 a0Var, float f17) {
        this.f390502d = a0Var;
        this.f390503e = f17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ll4.d dVar = this.f390502d.f390401e;
        if (dVar != null) {
            dVar.mo145973x27f73e1c(this.f390503e);
        }
    }
}
