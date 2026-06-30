package mv2;

/* loaded from: classes8.dex */
public final class k0 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mv2.l0 f413129d;

    public k0(mv2.l0 l0Var) {
        this.f413129d = l0Var;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        java.lang.String str2;
        mv2.l0 l0Var = this.f413129d;
        java.lang.String str3 = l0Var.f413136h;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = str;
        objArr[1] = java.lang.Integer.valueOf(i17);
        if (hVar == null || (str2 = hVar.m125799x9616526c()) == null) {
            str2 = "null";
        }
        objArr[2] = str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "on cdn callback mediaId = %s, startRet = %d, sceneResult %s", objArr);
        if (i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(l0Var.f413136h, "start failed : %d, media id is :%s", java.lang.Integer.valueOf(i17), str);
            if (i17 != -21005) {
                mv2.l0.e(l0Var, "", false);
                l0Var.b(fp0.u.f346824g);
            }
            return 0;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && hVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(l0Var.f413136h, "retCode %d, fileId %s, url %s", java.lang.Integer.valueOf(hVar.f69553xb5f54fe9), hVar.f69522xf9dbbe9c, hVar.f69524x419c440e);
            if (hVar.f69553xb5f54fe9 != 0) {
                mv2.l0.e(l0Var, "", false);
                l0Var.b(fp0.u.f346824g);
                return 0;
            }
            if (ya2.h.f542017a.b(l0Var.f413135g) != null) {
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MY_FINDER_LOCAL_COVER_IMG_STRING_SYNC, hVar.f69524x419c440e);
                r45.ri2 ri2Var = new r45.ri2();
                ri2Var.set(2, hVar.f69524x419c440e);
                r45.hx0 hx0Var = new r45.hx0();
                hx0Var.set(0, 1);
                hx0Var.set(1, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(ri2Var.mo14344x5f01b1f6()));
                java.util.List c17 = kz5.b0.c(hx0Var);
                db2.v5 v5Var = new db2.v5(l0Var.f413135g, c17, false, 0, null, null, null, 124, null);
                gm0.j1.d().a(3870, new mv2.j0(l0Var, c17, hVar));
                gm0.j1.d().g(v5Var);
            }
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return null;
    }
}
