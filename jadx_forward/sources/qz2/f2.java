package qz2;

/* loaded from: classes9.dex */
public final class f2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qz2.i2 f449394d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.m1 f449395e;

    public f2(qz2.i2 i2Var, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        this.f449394d = i2Var;
        this.f449395e = m1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = ((oz2.a) ((d50.l) this.f449395e)).f431772f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getChallenge(...)");
        this.f449394d.P6(new qz2.s1(str));
    }
}
