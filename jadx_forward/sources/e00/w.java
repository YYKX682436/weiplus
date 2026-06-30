package e00;

/* loaded from: classes9.dex */
public final class w implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e00.y f327359a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bw5.p10 f327360b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f327361c;

    public w(e00.y yVar, bw5.p10 p10Var, long j17) {
        this.f327359a = yVar;
        this.f327360b = p10Var;
        this.f327361c = j17;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public final void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RequestNativeCardJumpInfoTask", "get jumpInfo: errType = " + i17 + ", errCode = " + i18 + ", errMsg = " + str);
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
        bw5.x7 x7Var = null;
        bw5.q10 q10Var = fVar instanceof bw5.q10 ? (bw5.q10) fVar : null;
        e00.y yVar = this.f327359a;
        yz5.l lVar = yVar.f327366d;
        if (lVar != null) {
            if (q10Var != null) {
                x7Var = q10Var.f113429e[2] ? q10Var.f113428d : new bw5.x7();
            }
            lVar.mo146xb9724478(x7Var);
        }
        e00.g.f327305a.f(yVar.f327365c, this.f327360b, java.lang.System.currentTimeMillis() - this.f327361c, i17 == 0 && i18 == 0 ? bw5.f6.RESULT_SUCCESS : bw5.f6.RESULT_FAILED);
    }
}
