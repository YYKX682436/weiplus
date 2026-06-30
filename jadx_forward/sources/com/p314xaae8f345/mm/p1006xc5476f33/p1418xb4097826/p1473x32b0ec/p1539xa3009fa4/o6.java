package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes3.dex */
public final class o6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yl2.o f198835d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8 f198836e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6(yl2.o oVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8 b8Var) {
        super(0);
        this.f198835d = oVar;
        this.f198836e = b8Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        yl2.o oVar = this.f198835d;
        boolean z17 = oVar instanceof yl2.n;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8 b8Var = this.f198836e;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostUIC", "collectAuthRequirementsAfterRefresh: all checks passed, starting live");
            b8Var.i7();
        } else if (oVar instanceof yl2.m) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostUIC", "collectAuthRequirementsAfterRefresh: still need auth, continuing");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8.Q6(b8Var, (yl2.m) oVar);
        } else if (oVar instanceof yl2.l) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostUIC", "collectAuthRequirementsAfterRefresh: blocked");
            b8Var.V6(((yl2.l) oVar).f544573a);
        }
        return jz5.f0.f384359a;
    }
}
