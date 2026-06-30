package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes3.dex */
public final class u6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yl2.h f198989d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8 f198990e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yl2.m f198991f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6(yl2.h hVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8 b8Var, yl2.m mVar) {
        super(0);
        this.f198989d = hVar;
        this.f198990e = b8Var;
        this.f198991f = mVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int ordinal = this.f198989d.ordinal();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8 b8Var = this.f198990e;
        if (ordinal == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostUIC", "handleRealnameAuth: auth succeeded");
            if (b8Var.f198485w != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAuthSuccess: precheckType=");
                yl2.m mVar = this.f198991f;
                sb6.append(mVar.f544577a);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostUIC", sb6.toString());
                ae2.in.f85221a.S().o();
                if (mVar.f544577a != -1) {
                    b8Var.b7(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.y6(b8Var));
                } else {
                    b8Var.b7(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.z6(b8Var));
                }
            }
        } else if (ordinal == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostUIC", "handleRealnameAuth: auth failed");
        } else if (ordinal == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostUIC", "handleRealnameAuth: need refresh, setting needRefreshUserFlag=true");
            b8Var.f198486x = true;
            ae2.in.f85221a.S().o();
        }
        return jz5.f0.f384359a;
    }
}
