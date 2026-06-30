package rf2;

/* loaded from: classes3.dex */
public final class m implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rf2.q f476337a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s71.b f476338b;

    public m(rf2.q qVar, s71.b bVar) {
        this.f476337a = qVar;
        this.f476338b = bVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public final void a(boolean z17, java.lang.String str) {
        if (z17) {
            rf2.q qVar = this.f476337a;
            df2.ln lnVar = qVar.f476387e;
            r45.f02 f02Var = lnVar.f312218v;
            if (f02Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(lnVar, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new rf2.l(qVar, this.f476338b, f02Var, null), 2, null);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(qVar.f476388f, "post addr but lotteryInfo is empty!");
            }
        }
    }
}
