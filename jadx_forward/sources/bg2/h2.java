package bg2;

/* loaded from: classes3.dex */
public final class h2 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.n2 f101661d;

    public h2(bg2.n2 n2Var) {
        this.f101661d = n2Var;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        cm2.t tVar;
        bg2.n2 n2Var = this.f101661d;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var = n2Var.f101856f;
        r45.qc2 Y6 = n2Var.Y6((j2Var == null || (tVar = (cm2.t) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).mo144003x754a37bb()) == null) ? null : zl2.r4.f555483a.J2(tVar));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(n2Var.f101855e, "[updatePollingData] update polling extBUf = " + Y6.m75934xbce7f2f(1) + ", current_promoting_id = " + Y6.m75942xfb822ef2(0) + ", promote_info_buffer = " + Y6.m75934xbce7f2f(2) + ", ext_buffer = " + Y6.m75934xbce7f2f(1));
        bg2.g2 g2Var = (bg2.g2) n2Var.N6(bg2.g2.class);
        if (g2Var != null) {
            g2Var.b7(10, Y6);
        }
        return jz5.f0.f384359a;
    }
}
