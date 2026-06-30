package ec3;

/* loaded from: classes9.dex */
public final class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ec3.g1 f332521d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f332522e;

    public b1(ec3.g1 g1Var, yz5.a aVar) {
        this.f332521d = g1Var;
        this.f332522e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ec3.r1 r1Var = ec3.r1.f332620a;
        ec3.g1 g1Var = this.f332521d;
        r1Var.c(g1Var.W6(), ec3.m.f332585f, g1Var.m158354x19263085(), new ec3.a1(this.f332522e));
    }
}
