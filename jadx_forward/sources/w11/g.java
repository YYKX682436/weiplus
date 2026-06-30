package w11;

/* loaded from: classes8.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.b50 f523558d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.kl0 f523559e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f523560f;

    public g(r45.b50 b50Var, r45.kl0 kl0Var, java.lang.String str) {
        this.f523558d = b50Var;
        this.f523559e = kl0Var;
        this.f523560f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6396xb373c382 c6396xb373c382 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6396xb373c382();
        c6396xb373c382.f137397f = this.f523558d.f452063d;
        r45.kl0 kl0Var = this.f523559e;
        c6396xb373c382.f137396e = c6396xb373c382.b("reversion", kl0Var.f460334f, true);
        c6396xb373c382.f137398g = kl0Var.f460335g;
        c6396xb373c382.f137399h = kl0Var.f460337i;
        c6396xb373c382.f137395d = c6396xb373c382.b("wholeStack", this.f523560f, true);
        c6396xb373c382.f137400i = kl0Var.f460338m;
        c6396xb373c382.k();
    }
}
