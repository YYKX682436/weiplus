package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes15.dex */
public final class o1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.t1 f200770d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f200771e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.t1 t1Var, boolean z17) {
        super(0);
        this.f200770d = t1Var;
        this.f200771e = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        jz5.f0 f0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.t1 t1Var = this.f200770d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(t1Var.i0(), "get cache valid");
        r45.ze2 ze2Var = t1Var.L;
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        if (ze2Var != null) {
            t1Var.m0(ze2Var);
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            boolean z17 = this.f200771e;
            if (z17) {
                t1Var.I.a();
            }
            ey2.k0 k0Var = (ey2.k0) ((ya2.o1) pf5.u.f435469a.e(zy2.b6.class).c(ya2.o1.class));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.t1.e0(t1Var, ((java.lang.Number) k0Var.P6().f384366d).floatValue(), ((java.lang.Number) k0Var.P6().f384367e).floatValue(), z17);
        }
        return f0Var2;
    }
}
