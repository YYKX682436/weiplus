package kc2;

/* loaded from: classes15.dex */
public final class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kc2.g1 f387893d;

    public e1(kc2.g1 g1Var) {
        this.f387893d = g1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int e17 = c01.id.e();
        kc2.g1 g1Var = this.f387893d;
        kc2.a2.a(g1Var.p(), e17, false, 2, null);
        g1Var.d().a(new kc2.a(kc2.k.f387974v, e17));
    }
}
