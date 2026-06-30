package wo2;

/* loaded from: classes2.dex */
public final class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.C14496x6858d351 f529646d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f529647e;

    public p0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.C14496x6858d351 c14496x6858d351, int i17) {
        this.f529646d = c14496x6858d351;
        this.f529647e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oa.i k17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.C14496x6858d351 c14496x6858d351 = this.f529646d;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = c14496x6858d351.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activity).a(wo2.m0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        int i17 = this.f529647e;
        int P6 = c14496x6858d351.P6(i17);
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff R6 = ((wo2.m0) a17).R6();
        if (R6 != null && (k17 = R6.k(P6)) != null && !k17.a()) {
            k17.b();
        }
        c14496x6858d351.f202988i.mo8333x510f45c9(c14496x6858d351.P6(i17));
    }
}
