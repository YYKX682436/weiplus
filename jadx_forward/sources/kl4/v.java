package kl4;

/* loaded from: classes11.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kl4.a0 f390498d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f390499e;

    public v(kl4.a0 a0Var, long j17) {
        this.f390498d = a0Var;
        this.f390499e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kl4.a0 a0Var = this.f390498d;
        a0Var.f390404h = true;
        long j17 = this.f390499e;
        a0Var.f390403g = j17;
        a0Var.f390402f = true;
        ll4.d dVar = a0Var.f390401e;
        if (dVar != null) {
            dVar.mo145972x35ce78(j17);
        }
        a0Var.f390402f = false;
    }
}
