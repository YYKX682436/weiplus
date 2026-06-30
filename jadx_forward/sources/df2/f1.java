package df2;

/* loaded from: classes3.dex */
public final class f1 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.k1 f311633d;

    public f1(df2.k1 k1Var) {
        this.f311633d = k1Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.lang.String str;
        r45.nw1 m76794xd0557130;
        r45.tm1 tm1Var = (r45.tm1) obj;
        jz5.f0 f0Var = null;
        if (tm1Var != null) {
            int m75939xb282bd08 = tm1Var.m75939xb282bd08(0);
            df2.k1 k1Var = this.f311633d;
            if (k1Var.f312072r.contains(java.lang.Integer.valueOf(m75939xb282bd08))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderCreateLiveGuideController", "observe: has shown this guide, msgType=" + m75939xb282bd08);
                return;
            }
            k1Var.f312072r.add(java.lang.Integer.valueOf(m75939xb282bd08));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCreateLiveGuideController", "showBubble: show msgType=" + tm1Var.m75939xb282bd08(0) + ", guideTitle=" + tm1Var.m75945x2fec8307(3) + ", guideBtnText=" + tm1Var.m75945x2fec8307(4));
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf N6 = k1Var.N6();
            if (N6 != null) {
                yl2.g1 g1Var = new yl2.g1(N6, k1Var.f312070p, 0L, 4, null);
                k1Var.k7(k1Var);
                k1Var.f312074t = tm1Var.m75939xb282bd08(5);
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = ((mm2.c1) k1Var.m56788xbba4bfc0(mm2.c1.class)).f410379n;
                k1Var.f312075u = (c19792x256d2725 == null || (m76794xd0557130 = c19792x256d2725.m76794xd0557130()) == null) ? 0L : m76794xd0557130.m75942xfb822ef2(0);
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = ((mm2.c1) k1Var.m56788xbba4bfc0(mm2.c1.class)).f410379n;
                if (c19792x256d27252 == null || (str = c19792x256d27252.m76836x6c03c64c()) == null) {
                    str = "";
                }
                k1Var.f312076v = str;
                k1Var.o7(1);
                k1Var.n7(1, k1Var.f312070p, java.lang.Long.valueOf(g1Var.f544543c));
                k1Var.h7(new df2.g1(k1Var));
                java.lang.String m75945x2fec8307 = tm1Var.m75945x2fec8307(3);
                if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
                    m75945x2fec8307 = k1Var.O6().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nux);
                }
                java.lang.String str2 = m75945x2fec8307;
                java.lang.String m75945x2fec83072 = tm1Var.m75945x2fec8307(4);
                k1Var.l7(new df2.d9(str2, null, m75945x2fec83072 == null || m75945x2fec83072.length() == 0 ? k1Var.O6().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nuw) : m75945x2fec83072, null, 0, 0, 48, null));
                k1Var.g7(new df2.i1(k1Var, g1Var, tm1Var));
                long m75939xb282bd082 = tm1Var.m75939xb282bd08(1);
                p3325xe03a0797.p3326xc267989b.r2 r2Var = k1Var.f312073s;
                if (r2Var != null) {
                    p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
                }
                if (m75939xb282bd082 > 0) {
                    k1Var.f312073s = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(k1Var, null, null, new df2.j1(m75939xb282bd082, k1Var, null), 3, null);
                }
            }
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCreateLiveGuideController", "observe: post null");
        }
    }
}
