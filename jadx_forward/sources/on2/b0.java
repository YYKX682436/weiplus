package on2;

/* loaded from: classes3.dex */
public final class b0 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ on2.v0 f428377a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s71.b f428378b;

    public b0(on2.v0 v0Var, s71.b bVar) {
        this.f428377a = v0Var;
        this.f428378b = bVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public final void a(boolean z17, java.lang.String str) {
        r45.cz1 cz1Var;
        r45.gm4 gm4Var;
        if (z17) {
            on2.v0 v0Var = this.f428377a;
            r45.ht1 ht1Var = v0Var.R;
            boolean z18 = ht1Var != null && ht1Var.m75939xb282bd08(10) == 3;
            s71.b bVar = this.f428378b;
            if (z18) {
                r45.ht1 ht1Var2 = v0Var.R;
                if (ht1Var2 == null || (gm4Var = (r45.gm4) ht1Var2.m75936x14adae67(13)) == null || pf5.e.m158343xd39de650(v0Var, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new on2.j0(v0Var, bVar, gm4Var, null), 2, null) == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveLotteryAudienceUIC", "post addr but lotteryInfo is empty!");
                    return;
                }
                return;
            }
            r45.ht1 ht1Var3 = v0Var.R;
            if (ht1Var3 == null || (cz1Var = (r45.cz1) ht1Var3.m75936x14adae67(1)) == null || pf5.e.m158343xd39de650(v0Var, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new on2.l0(v0Var, bVar, cz1Var, null), 2, null) == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveLotteryAudienceUIC", "post addr but lotteryInfo is empty!");
            }
        }
    }
}
