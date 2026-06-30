package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes10.dex */
public final class ac0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nc0 f215302d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nc0 nc0Var) {
        super(2);
        this.f215302d = nc0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String suggestion = (java.lang.String) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(suggestion, "suggestion");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nc0 nc0Var = this.f215302d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(nc0Var.f216842d, "onSuggestion Click :".concat(suggestion));
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.c3) ((dd0.m0) ((ed0.a1) i95.n0.c(ed0.a1.class))).Di(nc0Var.m158354x19263085())).P6(2L, intValue);
        nc0Var.R6().m80997xdc5215a6().n(suggestion, null);
        nc0Var.R6().m80997xdc5215a6().d();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.m5 m5Var = nc0Var.f216849n;
        if (m5Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("historyLogic");
            throw null;
        }
        m5Var.a(suggestion);
        nc0Var.T6(suggestion);
        return jz5.f0.f384359a;
    }
}
