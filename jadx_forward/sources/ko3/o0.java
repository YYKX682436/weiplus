package ko3;

/* loaded from: classes12.dex */
public class o0 implements com.p314xaae8f345.mm.p944x882e457a.u0 {
    public final void a() {
        gm0.j1.d().a(3644, this);
        gm0.j1.d().a(3789, this);
        gm0.j1.d().a(836, this);
        gm0.j1.d().a(3944, this);
    }

    public final void b() {
        gm0.j1.d().q(3644, this);
        gm0.j1.d().q(3789, this);
        gm0.j1.d().q(836, this);
        gm0.j1.d().q(3944, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        r45.fo0 fo0Var;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2;
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(i18);
        objArr[2] = str;
        objArr[3] = java.lang.Integer.valueOf(m1Var == null ? -1 : m1Var.mo808xfb85f7b0());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TrustRequestManager", java.lang.String.format("onSceneEnd: errType = %s errCode = %s errMsg =  %s reqType = %s", objArr));
        fo3.s sVar = fo3.s.INSTANCE;
        if (i17 == 0 && i18 == 0) {
            if (m1Var.mo808xfb85f7b0() == 3644 || m1Var.mo808xfb85f7b0() == 3789) {
                r45.ho0 ho0Var = ((o45.sh) ((go3.b) m1Var).mo47948x7f0c4558().mo13821x7f35c2d1()).f424541a;
                if (ho0Var != null && (gVar = ho0Var.f457860d) != null) {
                    sVar.Le(gVar.g(), 1, i18);
                }
            } else if ((m1Var.mo808xfb85f7b0() == 836 || m1Var.mo808xfb85f7b0() == 3944) && (fo0Var = ((o45.ph) ((go3.a) m1Var).mo47948x7f0c4558().mo13821x7f35c2d1()).f424529a) != null && (gVar2 = fo0Var.f456013d) != null) {
                sVar.Le(gVar2.g(), 2, i18);
            }
        }
        if (i18 != 0) {
            sVar.Le(null, 0, i18);
        }
        b();
    }
}
