package com.p314xaae8f345.mm.p2615x3a3fddcb.p2616x34628f;

/* loaded from: classes4.dex */
public final class k0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n85.t f275044d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f275045e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2615x3a3fddcb.p2616x34628f.p1 f275046f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.y0 f275047g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p098xc4a6178c.p099x38a77192.e f275048h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(n85.t tVar, android.content.Context context, com.p314xaae8f345.mm.p2615x3a3fddcb.p2616x34628f.p1 p1Var, p3325xe03a0797.p3326xc267989b.y0 y0Var, p012xc85e97e9.p098xc4a6178c.p099x38a77192.e eVar) {
        super(1);
        this.f275044d = tVar;
        this.f275045e = context;
        this.f275046f = p1Var;
        this.f275047g = y0Var;
        this.f275048h = eVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        n85.t tVar = this.f275044d;
        int i17 = tVar.f417264k & 64;
        android.content.Context context = this.f275045e;
        if (i17 > 0) {
            com.p314xaae8f345.mm.p2615x3a3fddcb.p2616x34628f.s0.o(context, this.f275046f, this.f275047g, tVar);
        } else {
            m85.b bVar = m85.b.f406361a;
            bVar.e(context, tVar.f417258e, bVar.l().equals(tVar.f417254a), com.p314xaae8f345.mm.p2615x3a3fddcb.p2616x34628f.s0.m(it, this.f275048h));
        }
        return jz5.f0.f384359a;
    }
}
