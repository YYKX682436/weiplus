package df2;

/* loaded from: classes.dex */
public final class uq implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.ar f313082d;

    public uq(df2.ar arVar) {
        this.f313082d = arVar;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        int intValue = ((java.lang.Number) obj).intValue();
        df2.ar arVar = this.f313082d;
        if (intValue == 2 || intValue == 3) {
            r45.lv1 lv1Var = arVar.f311279v;
            java.lang.String m75945x2fec8307 = lv1Var != null ? lv1Var.m75945x2fec8307(0) : null;
            if (m75945x2fec8307 != null && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(arVar.f311277t, m75945x2fec8307)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(arVar.f311270m, "autoShow:" + m75945x2fec8307 + ", lastStatus:" + arVar.f311278u);
                if (zl2.r4.f555483a.w1()) {
                    df2.ar arVar2 = this.f313082d;
                    p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(arVar2, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new df2.tq(arVar2, null), 2, null);
                } else if (arVar.f311278u == 1 && arVar.e7(arVar.f311279v)) {
                    arVar.k7(false);
                }
                arVar.f311277t = m75945x2fec8307;
            }
        }
        arVar.f311278u = intValue;
        return jz5.f0.f384359a;
    }
}
