package hr3;

/* loaded from: classes11.dex */
public class bb implements ns.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.eb f364958d;

    public bb(hr3.eb ebVar) {
        this.f364958d = ebVar;
    }

    @Override // ns.e
    public void a(boolean z17, boolean z18, java.lang.String str, java.lang.String str2) {
        r61.a h17;
        int i17;
        hr3.eb ebVar = this.f364958d;
        if (z17) {
            ebVar.f365053f.M1.d("hide_btn");
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16861xdcf09668 c16861xdcf09668 = ebVar.f365053f;
            c16861xdcf09668.M1.c();
            c16861xdcf09668.I1 = true;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NormalUserFooterPreference", "addContact respUsername is empty");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(931, 21);
            }
            if (((int) c16861xdcf09668.L.E2) == 0) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    c16861xdcf09668.L.X1(str);
                }
                ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).i0(c16861xdcf09668.L);
                ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).m(c16861xdcf09668.L.d1());
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = c16861xdcf09668.L;
            if (((int) z3Var.E2) <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NormalUserFooterPreference", "addContact : insert contact failed");
            } else {
                if (!z3Var.r2() && c16861xdcf09668.N == 15 && (h17 = m61.k.wi().h(c16861xdcf09668.L.d1())) != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                    java.lang.String d17 = c16861xdcf09668.L.d1();
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h17.e()) ? 1 : 0);
                    java.lang.String[] b17 = com.p314xaae8f345.mm.p670x38b72420.a.b(c16861xdcf09668.L);
                    if (b17 == null) {
                        i17 = 0;
                    } else {
                        i17 = 5;
                        if (b17.length < 5) {
                            i17 = b17.length;
                        }
                    }
                    g0Var.d(12040, d17, 3, valueOf, java.lang.Integer.valueOf(i17));
                }
                c01.e2.m0(c16861xdcf09668.L);
                c16861xdcf09668.L = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(c16861xdcf09668.L.d1(), true);
                ebVar.f();
                r61.z1.c(c16861xdcf09668.L.J0(), 0);
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5891xc4a59293 c5891xc4a59293 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5891xc4a59293();
                java.lang.String J0 = c16861xdcf09668.L.J0();
                am.hq hqVar = c5891xc4a59293.f136199g;
                hqVar.f88395a = J0;
                hqVar.f88396b = 1;
                c5891xc4a59293.e();
            }
        } else if (z18) {
            r21.w.wi().k1(str, 2);
            r61.z1.c(ebVar.f365053f.L.J0(), 1);
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5891xc4a59293 c5891xc4a592932 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5891xc4a59293();
            java.lang.String J02 = ebVar.f365053f.L.J0();
            am.hq hqVar2 = c5891xc4a592932.f136199g;
            hqVar2.f88395a = J02;
            hqVar2.f88396b = 1;
            c5891xc4a592932.e();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NormalUserFooterPreference", "canAddContact fail, maybe interrupt by IOnNeedSentVerify, username = " + str);
        }
        if (z17 || z18) {
            android.content.Intent intent = ebVar.f365053f.K1.getIntent();
            int intExtra = intent.getIntExtra("search_kvstat_scene", 0);
            int intExtra2 = intent.getIntExtra("search_kvstat_position", 0);
            if (intExtra <= 0 || intExtra2 <= 0 || com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.x2.d(6L)) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(10991, java.lang.Integer.valueOf(intExtra), 6, java.lang.Integer.valueOf(intExtra2));
        }
    }
}
