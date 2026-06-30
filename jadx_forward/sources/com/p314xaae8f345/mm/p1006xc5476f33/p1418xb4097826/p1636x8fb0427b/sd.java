package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b;

/* loaded from: classes5.dex */
public final class sd extends ob2.a {

    /* renamed from: u, reason: collision with root package name */
    public int f209075u;

    public sd() {
        super(0, "关注tab瀑布流形态", null, null, 12, null);
        this.f209075u = -1;
    }

    @Override // lb2.j
    public java.lang.Object r() {
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).m60126x74219ae7()) {
            return 0;
        }
        r45.ls2 ls2Var = (r45.ls2) g92.b.f351302e.k2().d().m75936x14adae67(26);
        java.lang.Integer valueOf = ls2Var != null ? java.lang.Integer.valueOf(ls2Var.m75939xb282bd08(2)) : null;
        if (valueOf != null && valueOf.intValue() == 1) {
            return 0;
        }
        if (valueOf != null && valueOf.intValue() == 2) {
            return 1;
        }
        boolean tj6 = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).tj();
        if (this.f209075u == -1 || !tj6) {
            this.f209075u = ((java.lang.Number) super.r()).intValue();
        }
        return java.lang.Integer.valueOf(this.f209075u);
    }
}
