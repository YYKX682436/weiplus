package df2;

/* loaded from: classes3.dex */
public final class y4 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.d5 f313380d;

    public y4(df2.d5 d5Var) {
        this.f313380d = d5Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        r45.tm1 tm1Var = (r45.tm1) obj;
        jz5.f0 f0Var = null;
        if (tm1Var != null) {
            df2.d5 d5Var = this.f313380d;
            d5Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSwitchTestLiveGuideController", "showBubble: show msgType=" + tm1Var.m75939xb282bd08(0) + ", guideTitle=" + tm1Var.m75945x2fec8307(3) + ", guideBtnText=" + tm1Var.m75945x2fec8307(4));
            if (d5Var.N6() != null) {
                d5Var.k7(d5Var);
                d5Var.h7(new df2.z4(d5Var));
                java.lang.String m75945x2fec8307 = tm1Var.m75945x2fec8307(3);
                java.lang.String str = m75945x2fec8307 == null || m75945x2fec8307.length() == 0 ? "" : m75945x2fec8307;
                java.lang.String m75945x2fec83072 = tm1Var.m75945x2fec8307(4);
                d5Var.l7(new df2.d9(str, null, m75945x2fec83072 == null || m75945x2fec83072.length() == 0 ? "" : m75945x2fec83072, null, 0, 0, 48, null));
                p3325xe03a0797.p3326xc267989b.r2 r2Var = d5Var.f311476q;
                if (r2Var != null) {
                    p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
                }
                long m75939xb282bd08 = tm1Var.m75939xb282bd08(1);
                if (m75939xb282bd08 > 0) {
                    d5Var.f311476q = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(d5Var, null, null, new df2.a5(m75939xb282bd08, d5Var, null), 3, null);
                }
                d5Var.g7(new df2.c5(d5Var, tm1Var));
                ((ml2.j0) i95.n0.c(ml2.j0.class)).zj(ml2.c5.f408870e);
            }
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSwitchTestLiveGuideController", "observe: post null");
        }
    }
}
