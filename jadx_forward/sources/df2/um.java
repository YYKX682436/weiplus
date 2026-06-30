package df2;

/* loaded from: classes3.dex */
public final class um implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.cn f313071d;

    public um(df2.cn cnVar) {
        this.f313071d = cnVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        jz5.l lVar = (jz5.l) obj;
        df2.cn cnVar = this.f313071d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(cnVar.f311425p, "[guideResultData] pair = " + lVar);
        if (((java.lang.Boolean) lVar.f384366d).booleanValue()) {
            df2.cn.m7(cnVar);
        } else {
            cnVar.r7(false, (r45.wg7) lVar.f384367e, true);
        }
        cnVar.f311430u.mo7808x76db6cb1(lVar.f384366d);
        p3325xe03a0797.p3326xc267989b.r2 r2Var = cnVar.f311434y;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        cnVar.f311434y = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(cnVar, null, null, new df2.qm(cnVar, "guideResultData.observe", null), 3, null);
    }
}
