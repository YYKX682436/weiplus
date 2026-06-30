package ch2;

/* loaded from: classes10.dex */
public final class l2 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ch2.o2 f122933d;

    public l2(ch2.o2 o2Var) {
        this.f122933d = o2Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        r45.ha4 ha4Var;
        r45.ga4 ga4Var;
        ch2.o2 o2Var = this.f122933d;
        if ((!o2Var.i7().b7() || o2Var.q7().f427840n == null || (o2Var.B && o2Var.C && o2Var.P != com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusRole.TXChorusRoleLeadSinger)) ? false : true) {
            ah2.b k76 = this.f122933d.k7();
            if (k76 != null) {
                ((dh2.x) k76).f();
            }
            om2.i iVar = this.f122933d.q7().f427840n;
            if (iVar != null) {
                ch2.o2 o2Var2 = this.f122933d;
                r45.w84 w84Var = new r45.w84();
                synchronized (iVar.f427857d) {
                    ha4Var = new r45.ha4();
                    byte[] mo14344x5f01b1f6 = iVar.f427857d.mo14344x5f01b1f6();
                    if (mo14344x5f01b1f6 != null) {
                        try {
                            ha4Var.mo11468x92b714fd(mo14344x5f01b1f6);
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                        }
                    }
                }
                w84Var.f470497d = ha4Var;
                synchronized (iVar.f427858e) {
                    ga4Var = new r45.ga4();
                    byte[] mo14344x5f01b1f62 = iVar.f427858e.mo14344x5f01b1f6();
                    if (mo14344x5f01b1f62 != null) {
                        try {
                            ga4Var.mo11468x92b714fd(mo14344x5f01b1f62);
                        } catch (java.lang.Exception e18) {
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e18);
                        }
                    }
                }
                w84Var.f470498e = ga4Var;
                r45.x84 x84Var = new r45.x84();
                x84Var.f471399e = o2Var2.A;
                x84Var.f471400f = iVar.f427855b;
                x84Var.f471401g = o2Var2.h7().m8();
                java.lang.String str = o2Var2.q7().f427839m;
                if (str == null) {
                    str = "";
                }
                x84Var.f471402h = str;
                x84Var.f471403i = iVar.f427856c;
                x84Var.f471398d.add(w84Var);
                x84Var.f471404m = iVar.f427859f;
                x84Var.f471405n = o2Var2.n7().P6();
                o2Var2.t7(x84Var);
                if (o2Var2.G) {
                    o2Var2.H.add(w84Var);
                } else {
                    o2Var2.G = true;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(o2Var2, null, null, new ch2.v1(1000 / vn0.b.f519707a.c().f536965e, o2Var2, null), 3, null);
                }
            }
        }
        return true;
    }
}
