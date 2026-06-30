package qn2;

/* loaded from: classes3.dex */
public final class r0 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qn2.v0 f446677a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s71.b f446678b;

    public r0(qn2.v0 v0Var, s71.b bVar) {
        this.f446677a = v0Var;
        this.f446678b = bVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public final void a(boolean z17, java.lang.String str) {
        r45.cz1 cz1Var;
        if (z17) {
            qn2.v0 v0Var = this.f446677a;
            km2.z zVar = ((on2.z2) v0Var.f446709a.P0(on2.z2.class)).f428625m;
            if (zVar == null || (cz1Var = zVar.f390765d) == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("VisitorLotteryCardDoneWidget", "post addr but lotteryInfo is empty!");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.e(v0Var.f446709a, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new qn2.q0(v0Var, this.f446678b, cz1Var, null), 2, null);
            }
        }
    }
}
