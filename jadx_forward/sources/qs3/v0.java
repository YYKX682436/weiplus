package qs3;

/* loaded from: classes15.dex */
public final class v0 implements ns.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16953xeaa414a7 f447933a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f447934b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.oi5 f447935c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ps3.e f447936d;

    public v0(com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16953xeaa414a7 c16953xeaa414a7, java.lang.String str, r45.oi5 oi5Var, ps3.e eVar) {
        this.f447933a = c16953xeaa414a7;
        this.f447934b = str;
        this.f447935c = oi5Var;
        this.f447936d = eVar;
    }

    @Override // ns.j
    public final void a(boolean z17) {
        ps3.e eVar = this.f447936d;
        r45.oi5 oi5Var = this.f447935c;
        java.lang.String str = this.f447934b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16953xeaa414a7 c16953xeaa414a7 = this.f447933a;
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16953xeaa414a7.d(c16953xeaa414a7, str, oi5Var, eVar);
            return;
        }
        ((ms.a) ((ns.k) i95.n0.c(ns.k.class))).Bi(c16953xeaa414a7.getContext(), 3, str, new qs3.u0(c16953xeaa414a7, str, oi5Var, eVar));
    }
}
