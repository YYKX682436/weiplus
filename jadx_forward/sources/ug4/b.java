package ug4;

/* loaded from: classes3.dex */
public final class b extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "reportLiveAdsAction";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        oe0.v vVar;
        xu2.u uVar;
        xu2.v vVar2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        int optInt = data.optInt("liveAdAction", 0);
        if (optInt <= 0) {
            h(-1, "liveAdAction is null");
            return;
        }
        xg4.p pVar = (xg4.p) this.f399423a;
        if (pVar != null && (vVar = pVar.C) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.cj cjVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.bj) vVar).f193574a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(cjVar.f193693h, "[setFinderBubbleCallback] action=" + optInt);
            qo0.c cVar = cjVar.f193691f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = cVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) cVar : null;
            if (k0Var != null && (uVar = (xu2.u) k0Var.mo57682x2a5e9229(xu2.u.class)) != null && (vVar2 = uVar.f538765r) != null) {
                vVar2.c(optInt);
            }
        }
        k();
    }
}
