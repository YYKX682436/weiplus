package kc2;

/* loaded from: classes15.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb f388073d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kc2.c0 f388074e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f388075f;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar, kc2.c0 c0Var, int i17) {
        this.f388073d = jbVar;
        this.f388074e = c0Var;
        this.f388075f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar = this.f388073d;
        int i17 = this.f388075f;
        kc2.c0 c0Var = this.f388074e;
        if (jbVar == null) {
            kc2.a2.a(c0Var.e(), i17, false, 2, null);
            return;
        }
        kc2.a2.a(c0Var.c(), i17, false, 2, null);
        c0Var.f387880q = i17;
        kc2.h1.f387938a.b(c0Var.g(), c0Var.f387879p, c0Var.f387881r, c0Var.f387880q);
    }
}
