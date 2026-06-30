package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29;

/* loaded from: classes9.dex */
public class o1 extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y0 {

    /* renamed from: r, reason: collision with root package name */
    public r45.jy f238457r;

    /* renamed from: s, reason: collision with root package name */
    public final double f238458s;

    public o1(java.lang.String str, java.lang.String str2, double d17, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.f238458s = 0.0d;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.iy();
        lVar.f152198b = new r45.jy();
        lVar.f152200d = com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLType.f5295x7a6b238;
        lVar.f152199c = "/cgi-bin/mmpay-bin/mmpayweworkuniontransferappsvr_transfer_placeorder";
        int i17 = 0;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f295566n = a17;
        r45.iy iyVar = (r45.iy) a17.f152243a.f152217a;
        iyVar.f458933d = str;
        iyVar.f458934e = str2;
        this.f238458s = d17;
        iyVar.f458935f = java.lang.Math.round(d17 * 100.0d);
        iyVar.f458936g = str3;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
            int i18 = 0;
            loop0: while (true) {
                if (i18 >= str4.length()) {
                    break;
                }
                for (int i19 = 0; i19 < str5.length(); i19++) {
                    if (str4.charAt(i18) == str5.charAt(i19)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUnionTransferPlaceOrder", "find equal char: %s, %s, %s", java.lang.Character.valueOf(str4.charAt(i18)), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
                        i17 = 1;
                        break loop0;
                    }
                }
                i18++;
            }
        }
        iyVar.f458938i = i17;
        iyVar.f458937h = str4;
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(str)) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
            iyVar.f458939m = ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).fj(n17.Q0(), n17.G0());
        }
        iyVar.f458940n = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.x(str);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUnionTransferPlaceOrder", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.jy jyVar = (r45.jy) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f238457r = jyVar;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(jyVar.f459738d);
        r45.jy jyVar2 = this.f238457r;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUnionTransferPlaceOrder", "ret_code: %s, ret_msg: %s prepay_id:%s", valueOf, jyVar2.f459739e, jyVar2.f459744m);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f295567o;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y0
    public void I(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        r45.jy jyVar = (r45.jy) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f295561f = jyVar.f459738d;
        this.f295563h = jyVar.f459739e;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLType.f5295x7a6b238;
    }
}
