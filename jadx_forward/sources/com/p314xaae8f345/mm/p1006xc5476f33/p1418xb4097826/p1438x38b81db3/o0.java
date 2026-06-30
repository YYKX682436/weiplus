package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class o0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185669d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.q0 f185670e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.h1 f185671f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f185672g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f185673h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.q0 q0Var, so2.h1 h1Var, r45.qt2 qt2Var, int i17) {
        super(0);
        this.f185669d = str;
        this.f185670e = q0Var;
        this.f185671f = h1Var;
        this.f185672g = qt2Var;
        this.f185673h = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r45.ey0 ey0Var;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f185669d, "view_exp")) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.q0 q0Var = this.f185670e;
            r45.en2 en2Var = q0Var.f185835v;
            java.lang.Integer valueOf = (en2Var == null || (ey0Var = (r45.ey0) en2Var.m75936x14adae67(11)) == null) ? null : java.lang.Integer.valueOf(ey0Var.m75939xb282bd08(0));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(valueOf);
            sb6.append('-');
            ey2.u s17 = q0Var.s();
            sb6.append(pm0.v.u(s17 != null ? s17.f339071t : 0L));
            java.lang.String sb7 = sb6.toString();
            zy2.zb zbVar = (zy2.zb) i95.n0.c(zy2.zb.class);
            so2.h1 h1Var = this.f185671f;
            ml2.x1 x1Var = ml2.x1.f409735f;
            java.lang.String valueOf2 = java.lang.String.valueOf(this.f185672g.m75939xb282bd08(5));
            cl0.g gVar = new cl0.g();
            gVar.s("feed_columnid", valueOf);
            gVar.s("column_trace_id", sb7);
            gVar.s("column_exp_index", java.lang.Integer.valueOf(q0Var.f185834u + 1));
            java.lang.String gVar2 = gVar.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
            ((ml2.j0) zbVar).wj(h1Var, x1Var, valueOf2, gVar2, this.f185671f.g0(), this.f185673h);
        }
        return jz5.f0.f384359a;
    }
}
