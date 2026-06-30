package h62;

/* loaded from: classes8.dex */
public class l extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f360731d;

    /* renamed from: e, reason: collision with root package name */
    public final int f360732e;

    public l(int i17) {
        this.f360732e = i17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00bb, code lost:
    
        if (r15 == false) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.LinkedList H(boolean r15) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h62.l.H(boolean):java.util.LinkedList");
    }

    public final void I(int i17) {
        int i18 = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        if (i18 > i17) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GET_EXPT_LAST_TIME_SEC_INT, java.lang.Integer.valueOf(i18));
        } else {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GET_EXPT_LAST_TIME_SEC_INT, java.lang.Integer.valueOf(i17));
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f360731d = u0Var;
        try {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
            lVar.f152197a = new r45.df3();
            lVar.f152198b = new r45.ef3();
            lVar.f152199c = "/cgi-bin/mmexptappsvr-bin/getexptconfig";
            lVar.f152200d = 2738;
            lVar.f152201e = 0;
            lVar.f152202f = 0;
            com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
            r45.df3 df3Var = (r45.df3) a17.f152243a.f152217a;
            df3Var.f453910e = this.f360732e;
            df3Var.f453909d = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GET_EXPT_LAST_TIME_SEC_INT, 0)).intValue();
            h62.d vj6 = h62.d.vj();
            boolean z18 = vj6.f360721h;
            vj6.f360721h = false;
            df3Var.f453911f = H(z18);
            long wj6 = h62.d.vj().wj();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(863L, 0L, 1L, false);
            java.lang.Object[] objArr = new java.lang.Object[6];
            objArr[0] = java.lang.Integer.valueOf(df3Var.f453910e);
            objArr[1] = java.lang.Integer.valueOf(df3Var.f453909d);
            java.util.LinkedList linkedList = df3Var.f453911f;
            objArr[2] = java.lang.Integer.valueOf(linkedList != null ? linkedList.size() : 0);
            objArr[3] = java.lang.Long.valueOf(wj6);
            objArr[4] = java.lang.Boolean.valueOf(z18);
            objArr[5] = java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetExpt", "get expt config scene[%d] lastGetSvrSec[%d] localExptList[%d] exptKeyCount[%d] needFixAllExpt[%b] cost[%d]", objArr);
            return mo9409x10f9447a(sVar, a17, this);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneGetExpt", e17, "get expt error", new java.lang.Object[0]);
            return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 2738;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetExpt", "get expt on gy end. errType[%d] erroCode[%d] errMsg[%s]", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            r45.ef3 ef3Var = (r45.ef3) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
            ((ku5.t0) ku5.t0.f394148d).h(new h62.k(this, ef3Var), "netscene_getexpt");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(863L, 2L, 1L, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneGetExpt", "get expt error");
            I((int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1());
        }
        this.f360731d.mo815x76e0bfae(i18, i19, str, this);
    }
}
