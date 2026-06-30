package qz2;

/* loaded from: classes9.dex */
public final class g1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qz2.j1 f449398d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.m1 f449399e;

    public g1(qz2.j1 j1Var, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        this.f449398d = j1Var;
        this.f449399e = m1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = ((oz2.a) ((d50.l) this.f449399e)).f431772f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getChallenge(...)");
        this.f449398d.P6(new qz2.s0(str));
    }
}
