package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class kf implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg f194760d;

    public kf(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar) {
        this.f194760d = mgVar;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        dk2.zf zfVar = (dk2.zf) obj;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (zfVar != null && (!zl2.r4.f555483a.w1() || (zfVar.mo124533xfb85f7b0() != 20036 && zfVar.mo124533xfb85f7b0() != 100000))) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar = this.f194760d;
            if (mgVar.H) {
                p3325xe03a0797.p3326xc267989b.r2 r2Var = mgVar.U;
                if (r2Var != null) {
                    p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
                }
                dk2.zf zfVar2 = ((mm2.c1) mgVar.S0().a(mm2.c1.class)).Y1;
                if ((zfVar2 != null && zfVar2.mo124533xfb85f7b0() == 100000) && zfVar.mo124533xfb85f7b0() == 100000) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveCommentPlugin", "#onStickTopShowingTitleMsgReceived join live title again. ignore");
                } else {
                    dk2.zf zfVar3 = ((mm2.c1) mgVar.S0().a(mm2.c1.class)).Y1;
                    java.lang.Long valueOf = zfVar3 != null ? java.lang.Long.valueOf(zfVar3.m()) : null;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveCommentPlugin", "#onStickTopShowingTitleMsgReceived last:" + valueOf + ", cur:" + zfVar.m());
                    if (valueOf != null) {
                        if (valueOf.longValue() == zfVar.m()) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveCommentPlugin", "#onStickTopShowingTitleMsgReceived same one, or sticky. ignore");
                        }
                    }
                    ((mm2.c1) mgVar.S0().a(mm2.c1.class)).Y1 = zfVar;
                    mgVar.U = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(mgVar, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.rf(zfVar, mgVar, null), 3, null);
                }
            } else {
                p3325xe03a0797.p3326xc267989b.r2 r2Var2 = mgVar.U;
                if (r2Var2 != null) {
                    p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, null, 1, null);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveCommentPlugin", "#onStickTopShowingTitleMsgReceived comment ban");
            }
        }
        return f0Var;
    }
}
