package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes10.dex */
public final class z6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f186619d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.s7 f186620e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f186621f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6(so2.y0 y0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.s7 s7Var, in5.s0 s0Var) {
        super(1);
        this.f186619d = y0Var;
        this.f186620e = s7Var;
        this.f186621f = s0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String username = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        so2.y0 y0Var = this.f186619d;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76094x9781015 = y0Var.f492236d.u0().m76094x9781015();
        jz5.f0 f0Var = null;
        r45.xk b17 = m76094x9781015 != null ? ya2.d.b(ya2.d.h(m76094x9781015, null, false, 3, null), false) : null;
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        in5.s0 s0Var = this.f186621f;
        if (b17 != null) {
            so2.y0 y0Var2 = this.f186619d;
            android.content.Context context = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            java.lang.String m75945x2fec8307 = b17.m75945x2fec8307(0);
            java.lang.String str = m75945x2fec8307 == null ? "" : m75945x2fec8307;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.s7 s7Var = this.f186620e;
            so2.g0.b(y0Var2, context, str, s7Var.f186061e.mo56026x8fadefe3(), s7Var.f186061e.z0(), "");
            f0Var = f0Var2;
        }
        if (f0Var == null) {
            android.content.Context context2 = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            so2.g0.d(y0Var, username, context2, "");
        }
        return f0Var2;
    }
}
