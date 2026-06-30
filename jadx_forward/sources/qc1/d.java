package qc1;

/* loaded from: classes7.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f442993d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f442994e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f442995f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qc1.e f442996g;

    public d(qc1.e eVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, java.lang.Integer num, int i17) {
        this.f442996g = eVar;
        this.f442993d = lVar;
        this.f442994e = num;
        this.f442995f = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f442993d;
        if (lVar.mo50262x39e05d35()) {
            qc1.e eVar = this.f442996g;
            eVar.getClass();
            if (lVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) {
                v5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) lVar;
            } else if (lVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) {
                v5Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar).t3().x0().m52169xfdaa7672().mo14682x9dee9c37();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHideKeyboard", "invalid component type while calling hide keyboard");
                v5Var = null;
            }
            lVar.a(this.f442995f, eVar.o(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.r1.d(v5Var, this.f442994e) ? "ok" : "fail:input not exists"));
        }
    }
}
