package t21;

/* loaded from: classes12.dex */
public class g3 implements com.p314xaae8f345.mm.p944x882e457a.i1 {
    public int b(int i17, dn.h hVar, long j17, t21.v2 v2Var, java.lang.String str, java.lang.String str2, int i18, java.lang.String str3, long j18) {
        t21.v2 g17;
        if (i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoMsgExtension", "getThumbByCdn failed. startRet:%d msgSvrId:%d user:%s thumbUrl:%s thumbPath:%s", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), v2Var.h(), str2, str);
            return i17;
        }
        if (hVar == null) {
            return 0;
        }
        int i19 = hVar.f69553xb5f54fe9;
        if (i19 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoMsgExtension", "getThumbByCdn failed. sceneResult.field_retCode:%d msgSvrId:%d user:%s thumbUrl:%s thumbPath:%s", java.lang.Integer.valueOf(i19), java.lang.Long.valueOf(j17), v2Var.h(), str2, str);
        } else {
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
            java.lang.String str4 = a17.f294812f;
            if (str4 != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str4, false, false);
                if (!str4.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(str3);
            java.lang.String str5 = a18.f294812f;
            if (str5 != null) {
                java.lang.String l18 = com.p314xaae8f345.mm.vfs.e8.l(str5, false, false);
                if (!str5.equals(l18)) {
                    a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l18, a18.f294813g, a18.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a18, null);
            com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
            if (m17.a() && m18.a()) {
                try {
                    m18.f294799a.t(m18.f294800b, m17.f294799a, m17.f294800b);
                } catch (java.io.IOException unused) {
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoMsgExtension", "getThumbByCdn succ. msgSvrId:%d user:%s thumbUrl:%s thumbPath:%s", java.lang.Long.valueOf(j17), v2Var.h(), str2, str);
            if (v2Var.f496559x == 3) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                g0Var.mo68477x336bdfd8(198L, 6L, i18, false);
                g0Var.mo68477x336bdfd8(198L, 7L, 1L, false);
                g0Var.mo68477x336bdfd8(198L, com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(v2Var.h()) ? 9L : 8L, 1L, false);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                g0Var2.mo68477x336bdfd8(198L, 11L, i18, false);
                g0Var2.mo68477x336bdfd8(198L, 12L, 1L, false);
                g0Var2.mo68477x336bdfd8(198L, com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(v2Var.h()) ? 14L : 13L, 1L, false);
            }
        }
        t21.w2 Ui = t21.o2.Ui();
        java.lang.String d17 = v2Var.d();
        wf0.t1 t1Var = wf0.t1.NORMAL;
        Ui.getClass();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17) && (g17 = Ui.g(d17)) != null) {
            wf0.r1 r1Var = new wf0.r1(g17.d(), wf0.s1.UPDATE, t1Var, g17.f496559x, g17.f496560y);
            l75.v0 v0Var = Ui.f496591b;
            v0Var.d(r1Var);
            v0Var.c();
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x0884  */
    @Override // com.p314xaae8f345.mm.p944x882e457a.t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p314xaae8f345.mm.p944x882e457a.q0 b1(com.p314xaae8f345.mm.p944x882e457a.p0 r50) {
        /*
            Method dump skipped, instructions count: 2423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t21.g3.b1(com.tencent.mm.modelbase.p0):com.tencent.mm.modelbase.q0");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.t0
    public long k(java.lang.String str, r45.j4 j4Var, java.lang.String str2) {
        return !((kc5.x) ((wg3.j) i95.n0.c(wg3.j.class))).Di() ? c01.w9.m(str, j4Var.f459098o) : ((kc5.x) ((wg3.j) i95.n0.c(wg3.j.class))).Bi(str, j4Var, str2);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.t0
    public void x5(com.p314xaae8f345.mm.p944x882e457a.r0 r0Var) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = r0Var.f152290a;
        if (f9Var == null) {
            return;
        }
        t21.d3.f(f9Var.z0(), f9Var);
    }
}
