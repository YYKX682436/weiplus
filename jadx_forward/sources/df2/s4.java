package df2;

/* loaded from: classes3.dex */
public final class s4 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.x4 f312822d;

    public s4(df2.x4 x4Var) {
        this.f312822d = x4Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        r45.tm1 tm1Var = (r45.tm1) obj;
        jz5.f0 f0Var = null;
        if (tm1Var != null) {
            df2.x4 x4Var = this.f312822d;
            x4Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSwitchStreamGuideController", "showBubble: show msgType=" + tm1Var.m75939xb282bd08(0) + ", guideTitle=" + tm1Var.m75945x2fec8307(3) + ", guideBtnText=" + tm1Var.m75945x2fec8307(4));
            if (x4Var.N6() != null) {
                x4Var.k7(x4Var);
                x4Var.h7(new df2.t4(x4Var));
                java.lang.String m75945x2fec8307 = tm1Var.m75945x2fec8307(3);
                java.lang.String str = m75945x2fec8307 == null || m75945x2fec8307.length() == 0 ? "" : m75945x2fec8307;
                java.lang.String m75945x2fec83072 = tm1Var.m75945x2fec8307(4);
                x4Var.l7(new df2.d9(str, null, m75945x2fec83072 == null || m75945x2fec83072.length() == 0 ? "" : m75945x2fec83072, null, 0, 0, 48, null));
                p3325xe03a0797.p3326xc267989b.r2 r2Var = x4Var.f313291r;
                if (r2Var != null) {
                    p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
                }
                long m75939xb282bd08 = tm1Var.m75939xb282bd08(1);
                if (m75939xb282bd08 > 0) {
                    x4Var.f313291r = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(x4Var, null, null, new df2.u4(m75939xb282bd08, x4Var, null), 3, null);
                }
                x4Var.g7(new df2.w4(x4Var, tm1Var));
                ((ml2.r0) i95.n0.c(ml2.r0.class)).Hk(ml2.u4.f409644e);
            }
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSwitchStreamGuideController", "observe: post null");
        }
    }
}
