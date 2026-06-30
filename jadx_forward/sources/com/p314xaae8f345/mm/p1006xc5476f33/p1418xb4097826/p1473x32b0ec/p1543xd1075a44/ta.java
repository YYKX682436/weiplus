package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class ta {
    public ta(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        dk2.ef efVar = dk2.ef.f314905a;
        gk2.e eVar = dk2.ef.I;
        mm2.n0 n0Var = eVar != null ? (mm2.n0) eVar.a(mm2.n0.class) : null;
        boolean P6 = n0Var != null ? n0Var.P6(xy2.c.e(context)) : true;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("openFromCurrentLive: hasSlice=");
        sb6.append(n0Var != null);
        sb6.append(", isInCoLive=");
        sb6.append(n0Var != null ? java.lang.Boolean.valueOf(n0Var.O6()) : null);
        sb6.append(", isInitiator=");
        sb6.append(P6);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveCoLiveInvitorPreparePanel", sb6.toString());
        re2.j1.f475970a.a();
        if (!P6) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ra raVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ra(context);
            raVar.H = n0Var;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.W(raVar, null, false, 0, 7, null);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.nb nbVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.nb(context);
            nbVar.H = n0Var;
            nbVar.V = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sa.f201278d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.W(nbVar, null, false, 0, 7, null);
        }
    }
}
