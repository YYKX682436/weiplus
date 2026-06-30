package yf2;

/* loaded from: classes3.dex */
public final class i1 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf2.m1 f543249d;

    public i1(yf2.m1 m1Var) {
        this.f543249d = m1Var;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        r45.z53 z53Var;
        r45.n73 n73Var = (r45.n73) obj;
        zl2.r4 r4Var = zl2.r4.f555483a;
        yf2.m1 m1Var = this.f543249d;
        if (r4Var.T1((r45.q12) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) m1Var.getStore().m56796xbba4bfc0(mm2.g1.class)).f410601f).mo144003x754a37bb())) {
            yf2.m1.Z6(m1Var);
        }
        yf2.t tVar = m1Var.f543284p;
        kz5.h0.B(tVar.f543320a, yf2.s.f543313d);
        java.util.Iterator it = ((java.util.ArrayList) tVar.f543320a).iterator();
        while (it.hasNext()) {
            yf2.r rVar = (yf2.r) ((java.lang.ref.WeakReference) it.next()).get();
            if (rVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.z60 z60Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.z60) rVar;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onGameAppInfoChanged: gameName=");
                sb6.append((n73Var == null || (z53Var = (r45.z53) n73Var.m75936x14adae67(1)) == null) ? null : z53Var.m75945x2fec8307(1));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderStartLiveModeTabWidget", sb6.toString());
                z60Var.s();
            }
        }
        return jz5.f0.f384359a;
    }
}
