package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class nc0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5560x6f070be f195143d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nd0 f195144e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc0(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5560x6f070be c5560x6f070be, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nd0 nd0Var) {
        super(0);
        this.f195143d = c5560x6f070be;
        this.f195144e = nd0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5560x6f070be c5560x6f070be = this.f195143d;
        java.lang.String str = c5560x6f070be.f135879g.f90084a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nd0 nd0Var = this.f195144e;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, ((mm2.c1) nd0Var.P0(mm2.c1.class)).f410385o);
        am.zd zdVar = c5560x6f070be.f135879g;
        if (b17 || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(zdVar.f90084a, nd0Var.x1())) {
            int i17 = zdVar.f90085b;
            boolean z17 = true;
            if (!(i17 == 4 || i17 == 1)) {
                if (i17 != 5 && i17 != 2) {
                    z17 = false;
                }
                if (z17 && nd0Var.B.getVisibility() != 0) {
                    nd0Var.z1().mo50307xb9e94560(nd0Var.K, 0L);
                }
            } else if (i17 == 4) {
                zl2.r4 r4Var = zl2.r4.f555483a;
                android.widget.TextView view = nd0Var.f195158z;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
                view.performHapticFeedback(1, 3);
                nd0Var.G1(true, "#4", java.lang.Boolean.TRUE, java.lang.Boolean.FALSE);
                qo0.c.a(nd0Var.f195148p, qo0.b.P, null, 2, null);
                nd0Var.z1().mo50307xb9e94560(nd0Var.L, 5000L);
            }
        }
        return jz5.f0.f384359a;
    }
}
