package ah3;

/* loaded from: classes11.dex */
public final class d implements vg3.o3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f86403d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f86404e;

    public d(p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, java.util.Set set) {
        this.f86403d = f0Var;
        this.f86404e = set;
    }

    @Override // vg3.o3
    public void f(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
    }

    @Override // vg3.o3
    public void i(java.lang.String str, java.lang.String str2) {
        boolean z17 = true;
        this.f86403d.f391649d++;
        if (str != null && !r26.n0.N(str)) {
            z17 = false;
        }
        if (z17) {
            return;
        }
        this.f86404e.add(str);
    }

    @Override // vg3.o3
    public void q(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
    }

    @Override // vg3.o3
    public void t(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        boolean z17 = true;
        this.f86403d.f391649d++;
        java.lang.String d17 = z3Var != null ? z3Var.d1() : null;
        if (d17 != null && !r26.n0.N(d17)) {
            z17 = false;
        }
        if (z17) {
            return;
        }
        this.f86404e.add(d17);
    }
}
