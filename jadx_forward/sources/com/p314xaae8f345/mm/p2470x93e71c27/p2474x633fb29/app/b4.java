package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

/* loaded from: classes9.dex */
public class b4 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.c4 f270352d;

    public b4(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.c4 c4Var) {
        this.f270352d = c4Var;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6275x73c70a4d c6275x73c70a4d;
        int i18;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.c4 c4Var = this.f270352d;
        java.lang.String str2 = c4Var.f270377v;
        if (i17 == -21005) {
            java.lang.String str3 = c4Var.f270377v;
            return 0;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(c4Var.f270364f.Q0(), c4Var.f270364f.m124847x74d37ac6());
        if (i17 != 0) {
            Li.r1(5);
            bu.a.e(Li.m124847x74d37ac6(), bu.a.b(i17));
            jx3.f.INSTANCE.mo68477x336bdfd8(111L, 34L, 1L, true);
            ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).lb(Li.m124847x74d37ac6(), Li, true);
            c4Var.f270376u = android.os.SystemClock.elapsedRealtime() - c4Var.f270373r;
            c4Var.H(i17);
            c4Var.f270363e.mo815x76e0bfae(3, i17, "", c4Var);
            return 0;
        }
        if (hVar != null) {
            int i19 = hVar.f69553xb5f54fe9;
            if (i19 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneSendAppMsg", "cdntra sceneResult.retCode :%d arg[%s] info[%s]", java.lang.Integer.valueOf(i19), hVar.f69503x4b6e3d91, hVar.f69564xd94f6271, "", "", "", "", "", "", "", hVar.f323300b);
                Li.r1(5);
                bu.a.e(Li.m124847x74d37ac6(), bu.a.a(hVar.f69553xb5f54fe9));
                jx3.f.INSTANCE.mo68477x336bdfd8(111L, 34L, 1L, true);
                ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).lb(Li.m124847x74d37ac6(), Li, true);
                c4Var.f270376u = android.os.SystemClock.elapsedRealtime() - c4Var.f270373r;
                c4Var.H(hVar.f69553xb5f54fe9);
                c4Var.f270363e.mo815x76e0bfae(3, hVar.f69553xb5f54fe9, "", c4Var);
            } else {
                if (c4Var.f270381z > 0 && hVar.f69523x17c343e7 > 0 && Li.mo78013xfb85f7b0() != 738197553) {
                    iz5.a.g("SendAppMsgThumbTooBig " + c4Var.f270381z + "," + hVar.f69523x17c343e7 + "," + hVar.f69522xf9dbbe9c, c4Var.f270381z * 2 > hVar.f69523x17c343e7);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSendAppMsg", "summersafecdn cdnCallback upload attach by cdn, isHitCacheUpload: %d, onlyCheckExist[%b], exist[%b], aesKey[%s], md5[%s]", java.lang.Integer.valueOf(hVar.f69501xb9d727af), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(hVar.f69521xc9ff4d81), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(hVar.f69502xf11df5f5), hVar.f69526x419c9c3d);
                if (Li.mo78013xfb85f7b0() == 738197553) {
                    com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.y(Li.m124847x74d37ac6(), Li.Q0(), "", hVar, false);
                }
                ot0.q v17 = ot0.q.v(Li.j());
                if (v17 != null && ((i18 = v17.f430199i) == 33 || i18 == 36 || i18 == 44)) {
                    java.lang.String z07 = Li.z0();
                    ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                    java.lang.String D2 = m11.b1.Di().D2(Li, z07, true);
                    zz.b Zi = ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).Zi(D2, v17.f430199i, null, null);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSendAppMsg", "fileCheckDup %s ret:%s hitCache:%s deleteResult:%s copyResult:%s replaceResult:%s", D2, java.lang.Integer.valueOf(Zi.f559224a), java.lang.Boolean.valueOf(Zi.f559225b), java.lang.Boolean.valueOf(Zi.f559226c), java.lang.Boolean.valueOf(Zi.f559227d), java.lang.Long.valueOf(Zi.f559228e));
                }
                c4Var.f270376u = android.os.SystemClock.elapsedRealtime() - c4Var.f270373r;
                c4Var.f270374s = android.os.SystemClock.elapsedRealtime();
                c01.d9.e().g(new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.e4(c4Var.f270366h, c4Var.f270365g, false, hVar, new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a4(this), c4Var.f270367i, null, c4Var.f270369n, c4Var.f270370o));
            }
        }
        if (str == null || !str.equals(c4Var.f270377v) || (c6275x73c70a4d = c4Var.f270379x) == null || c6275x73c70a4d.f136524g.f89400a == -1) {
            return 0;
        }
        c6275x73c70a4d.e();
        c4Var.f270379x = null;
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return null;
    }
}
