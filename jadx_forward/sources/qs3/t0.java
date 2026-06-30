package qs3;

/* loaded from: classes15.dex */
public final class t0 implements ns.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16953xeaa414a7 f447924a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f447925b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.oi5 f447926c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ps3.e f447927d;

    public t0(com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16953xeaa414a7 c16953xeaa414a7, java.lang.String str, r45.oi5 oi5Var, ps3.e eVar) {
        this.f447924a = c16953xeaa414a7;
        this.f447925b = str;
        this.f447926c = oi5Var;
        this.f447927d = eVar;
    }

    @Override // ns.j
    public final void a(boolean z17) {
        ps3.e eVar = this.f447927d;
        r45.oi5 oi5Var = this.f447926c;
        java.lang.String str = this.f447925b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16953xeaa414a7 c16953xeaa414a7 = this.f447924a;
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16953xeaa414a7.a(c16953xeaa414a7, str, oi5Var, eVar);
            return;
        }
        ((ms.a) ((ns.k) i95.n0.c(ns.k.class))).Bi(c16953xeaa414a7.getContext(), 1, str, new qs3.s0(c16953xeaa414a7, str, oi5Var, eVar));
    }
}
