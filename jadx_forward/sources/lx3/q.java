package lx3;

/* loaded from: classes.dex */
public final class q implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.q f403644d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f403645e;

    public q(yz5.q qVar, yz5.l lVar) {
        this.f403644d = qVar;
        this.f403645e = lVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public final int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SvrReporter", "report, errType = " + i17 + ", errCode = " + i18 + ", errMsg = " + str);
        if (i17 != 0 || i18 != 0) {
            this.f403644d.mo147xb9724478(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            return 0;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
        r45.ak akVar = fVar instanceof r45.ak ? (r45.ak) fVar : null;
        if (akVar == null) {
            return 0;
        }
        this.f403645e.mo146xb9724478(akVar);
        return 0;
    }
}
