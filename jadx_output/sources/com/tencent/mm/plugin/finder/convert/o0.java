package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class o0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f104136d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.q0 f104137e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.h1 f104138f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f104139g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f104140h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(java.lang.String str, com.tencent.mm.plugin.finder.convert.q0 q0Var, so2.h1 h1Var, r45.qt2 qt2Var, int i17) {
        super(0);
        this.f104136d = str;
        this.f104137e = q0Var;
        this.f104138f = h1Var;
        this.f104139g = qt2Var;
        this.f104140h = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.ey0 ey0Var;
        if (kotlin.jvm.internal.o.b(this.f104136d, "view_exp")) {
            com.tencent.mm.plugin.finder.convert.q0 q0Var = this.f104137e;
            r45.en2 en2Var = q0Var.f104302v;
            java.lang.Integer valueOf = (en2Var == null || (ey0Var = (r45.ey0) en2Var.getCustom(11)) == null) ? null : java.lang.Integer.valueOf(ey0Var.getInteger(0));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(valueOf);
            sb6.append('-');
            ey2.u s17 = q0Var.s();
            sb6.append(pm0.v.u(s17 != null ? s17.f257538t : 0L));
            java.lang.String sb7 = sb6.toString();
            zy2.zb zbVar = (zy2.zb) i95.n0.c(zy2.zb.class);
            so2.h1 h1Var = this.f104138f;
            ml2.x1 x1Var = ml2.x1.f328202f;
            java.lang.String valueOf2 = java.lang.String.valueOf(this.f104139g.getInteger(5));
            cl0.g gVar = new cl0.g();
            gVar.s("feed_columnid", valueOf);
            gVar.s("column_trace_id", sb7);
            gVar.s("column_exp_index", java.lang.Integer.valueOf(q0Var.f104301u + 1));
            java.lang.String gVar2 = gVar.toString();
            kotlin.jvm.internal.o.f(gVar2, "toString(...)");
            ((ml2.j0) zbVar).wj(h1Var, x1Var, valueOf2, gVar2, this.f104138f.g0(), this.f104140h);
        }
        return jz5.f0.f302826a;
    }
}
