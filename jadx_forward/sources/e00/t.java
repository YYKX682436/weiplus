package e00;

/* loaded from: classes9.dex */
public final class t implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e00.v f327350a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bw5.ye0 f327351b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f327352c;

    public t(e00.v vVar, bw5.ye0 ye0Var, long j17) {
        this.f327350a = vVar;
        this.f327351b = ye0Var;
        this.f327352c = j17;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public final void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RequestBulkBuyCardTask", "get jumpInfo:  errType = " + i17 + ", errCode = " + i18 + ", errMsg = " + str);
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
        bw5.x7 x7Var = null;
        bw5.ze0 ze0Var = fVar instanceof bw5.ze0 ? (bw5.ze0) fVar : null;
        e00.v vVar = this.f327350a;
        yz5.l lVar = vVar.f327357d;
        if (lVar != null) {
            if (ze0Var != null) {
                x7Var = ze0Var.f117489e[2] ? ze0Var.f117488d : new bw5.x7();
            }
            lVar.mo146xb9724478(x7Var);
        }
        e00.g.f327305a.c(vVar.f327356c, this.f327351b, java.lang.System.currentTimeMillis() - this.f327352c, i18 == 0 && i17 == 0 ? bw5.f6.RESULT_SUCCESS : bw5.f6.RESULT_FAILED);
    }
}
