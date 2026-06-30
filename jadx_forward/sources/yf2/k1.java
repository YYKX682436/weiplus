package yf2;

/* loaded from: classes3.dex */
public final class k1 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf2.m1 f543269d;

    public k1(yf2.m1 m1Var) {
        this.f543269d = m1Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        yf2.m1 m1Var = this.f543269d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m1Var.f543281m, "audioModeChangeData changed: " + num);
        if (num != null && num.intValue() == 1 && zl2.r4.f555483a.G1((r45.q12) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) m1Var.getStore().m56796xbba4bfc0(mm2.g1.class)).f410601f).mo144003x754a37bb()) && !((mm2.n0) m1Var.m56788xbba4bfc0(mm2.n0.class)).Q6(xy2.c.e(m1Var.O6()))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m1Var.f543281m, "[CoLive] reset enableAudioModeFlag from 1 to 0 (anchor side)");
            mm2.c1 c1Var = (mm2.c1) m1Var.m56788xbba4bfc0(mm2.c1.class);
            int i17 = (int) c1Var.f410399q;
            java.util.regex.Pattern pattern = pm0.v.f438335a;
            c1Var.p8(i17 & (-257));
            c1Var.D8(0);
        }
        m1Var.f543284p.a((r45.q12) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) m1Var.getStore().m56796xbba4bfc0(mm2.g1.class)).f410601f).mo144003x754a37bb());
    }
}
