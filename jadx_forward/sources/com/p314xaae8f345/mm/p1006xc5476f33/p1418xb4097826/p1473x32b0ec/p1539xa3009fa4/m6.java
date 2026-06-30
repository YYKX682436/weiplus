package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes3.dex */
public final class m6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8 f198785d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yl2.o f198786e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8 b8Var, yl2.o oVar) {
        super(0);
        this.f198785d = b8Var;
        this.f198786e = oVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8 b8Var = this.f198785d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = b8Var.f198470e;
        yf2.s0 s0Var = lVar != null ? (yf2.s0) lVar.U0(yf2.s0.class) : null;
        boolean z17 = false;
        if (s0Var != null) {
            if (s0Var.b7() == 1) {
                z17 = true;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleAuthResult: authReq=");
        yl2.o oVar = this.f198786e;
        sb6.append(oVar);
        sb6.append(", isLicenseConfirmed=");
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostUIC", sb6.toString());
        if (oVar instanceof yl2.n) {
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostUIC", "handleAuthResult: passed and license confirmed, starting live");
                b8Var.i7();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostUIC", "handleAuthResult: passed but license not confirmed, showing license sheet");
                b8Var.d7(yf2.j2.f543264e, null);
            }
        } else if (oVar instanceof yl2.m) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostUIC", "handleAuthResult: need auth, showing auth sheet");
            b8Var.d7(yf2.j2.f543265f, (yl2.m) oVar);
        } else if (oVar instanceof yl2.l) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("handleAuthResult: blocked, errCode=");
            yl2.l lVar2 = (yl2.l) oVar;
            sb7.append(lVar2.f544573a);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostUIC", sb7.toString());
            b8Var.V6(lVar2.f544573a);
        }
        return jz5.f0.f384359a;
    }
}
