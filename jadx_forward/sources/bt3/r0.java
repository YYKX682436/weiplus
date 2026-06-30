package bt3;

/* loaded from: classes9.dex */
public class r0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f105908d;

    /* renamed from: g, reason: collision with root package name */
    public final zs3.b0 f105911g;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f105909e = null;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f105910f = "";

    /* renamed from: h, reason: collision with root package name */
    public final android.util.SparseArray f105912h = new android.util.SparseArray();

    /* renamed from: i, reason: collision with root package name */
    public final android.util.SparseBooleanArray f105913i = new android.util.SparseBooleanArray();

    /* renamed from: m, reason: collision with root package name */
    public int f105914m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f105915n = 0;

    public r0(zs3.b0 b0Var) {
        this.f105911g = null;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.yg();
        lVar.f152198b = new r45.zg();
        lVar.f152199c = "/cgi-bin/micromsg-bin/batchtranscdnitem";
        lVar.f152200d = 632;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        this.f105908d = lVar.a();
        this.f105911g = b0Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        int i17;
        boolean z17;
        this.f105909e = u0Var;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f105908d;
        r45.yg ygVar = (r45.yg) oVar.f152243a.f152217a;
        android.util.SparseArray sparseArray = this.f105912h;
        sparseArray.clear();
        android.util.SparseBooleanArray sparseBooleanArray = this.f105913i;
        sparseBooleanArray.clear();
        zs3.b0 b0Var = this.f105911g;
        if (b0Var.f68494x84214f59.f452497f.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneTransCDN", "doScene data list null");
            this.f105914m = -100;
            return -100;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        int i18 = this.f105915n;
        while (true) {
            if (i18 >= b0Var.f68494x84214f59.f452497f.size()) {
                i17 = i18;
                break;
            }
            r45.gp0 gp0Var = (r45.gp0) b0Var.f68494x84214f59.f452497f.get(i18);
            z17 = false;
            if (gp0Var.N && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.f456967s)) {
                i17 = i18;
                break;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.f456967s)) {
                i17 = i18;
            } else {
                r45.lo6 lo6Var = new r45.lo6();
                lo6Var.f461214e = gp0Var.f456967s;
                lo6Var.f461215f = gp0Var.f456971u;
                lo6Var.f461216g = gp0Var.I;
                i17 = i18;
                lo6Var.f461217h = (int) gp0Var.R;
                java.lang.String str = gp0Var.T;
                if (str == null) {
                    str = "";
                }
                lo6Var.f461213d = str.hashCode();
                linkedList.add(lo6Var);
                sparseArray.put(lo6Var.f461213d, gp0Var);
                sparseBooleanArray.put(lo6Var.f461213d, false);
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.f456945h)) {
                r45.lo6 lo6Var2 = new r45.lo6();
                lo6Var2.f461214e = gp0Var.f456945h;
                lo6Var2.f461215f = gp0Var.f456953m;
                lo6Var2.f461216g = 2;
                lo6Var2.f461217h = (int) gp0Var.f456951l1;
                java.lang.String str2 = gp0Var.T;
                lo6Var2.f461213d = (str2 != null ? str2 : "").concat("@thumb").hashCode();
                linkedList.add(lo6Var2);
                sparseArray.put(lo6Var2.f461213d, gp0Var);
                sparseBooleanArray.put(lo6Var2.f461213d, true);
            }
            if (linkedList.size() >= 20) {
                break;
            }
            i18 = i17 + 1;
        }
        z17 = true;
        this.f105915n = i17 + 1;
        ygVar.f472576d = linkedList.size();
        java.util.LinkedList linkedList2 = ygVar.f472577e;
        linkedList2.clear();
        linkedList2.addAll(linkedList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTransCDN", "ashutest::data list size %d, need check size %d, nextIndex %d", java.lang.Integer.valueOf(b0Var.f68494x84214f59.f452497f.size()), java.lang.Integer.valueOf(sparseArray.size()), java.lang.Integer.valueOf(this.f105915n));
        if (ygVar.f472576d > 0 && z17) {
            return mo9409x10f9447a(sVar, oVar, this);
        }
        this.f105910f = bt3.g2.g(b0Var.f68502x29dd02d3, b0Var.f68495x225aa2b6, b0Var.f68494x84214f59);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneTransCDN", "doScene no more data");
        this.f105914m = -100;
        return -100;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 632;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        int i27 = i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTransCDN", "netId %d errType %d errCode %d localErrCode %d begIndex %d errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(this.f105914m), java.lang.Integer.valueOf(this.f105915n), str);
        zs3.b0 b0Var = this.f105911g;
        if (i27 == 3 && this.f105914m == -100) {
            this.f105910f = bt3.g2.g(b0Var.f68502x29dd02d3, b0Var.f68495x225aa2b6, b0Var.f68494x84214f59);
            this.f105909e.mo815x76e0bfae(0, 0, str, this);
            return;
        }
        if (i27 != 0 || i19 != 0) {
            this.f105909e.mo815x76e0bfae(i27, i19, str, this);
            return;
        }
        java.util.Iterator it = ((r45.zg) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a).f473525e.iterator();
        while (it.hasNext()) {
            r45.lo6 lo6Var = (r45.lo6) it.next();
            r45.gp0 gp0Var = (r45.gp0) this.f105912h.get(lo6Var.f461213d);
            if (gp0Var != null) {
                if (this.f105913i.get(lo6Var.f461213d)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTransCDN", "trans end, client id[%d], dataId[%s], isThumb[true], old thumb url[%s], new thumb url[%s], old size[%d], new size[%d]", java.lang.Integer.valueOf(lo6Var.f461213d), gp0Var.T, gp0Var.f456945h, lo6Var.f461214e, java.lang.Long.valueOf(gp0Var.f456951l1), java.lang.Long.valueOf(lo6Var.f461217h));
                    gp0Var.d0(lo6Var.f461214e);
                    gp0Var.c0(lo6Var.f461215f);
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(lo6Var.f461214e) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(lo6Var.f461215f)) {
                        long j17 = lo6Var.f461217h;
                        if (j17 > 0) {
                            gp0Var.L0(j17);
                        }
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneTransCDN", "match error server return");
                    i27 = 3;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTransCDN", "trans end, client id[%d], dataId[%s], isThumb[false], old url[%s], new url[%s], old size[%d], new size[%d]", java.lang.Integer.valueOf(lo6Var.f461213d), gp0Var.T, gp0Var.f456967s, lo6Var.f461214e, java.lang.Long.valueOf(gp0Var.R), java.lang.Long.valueOf(lo6Var.f461217h));
                    gp0Var.b0(lo6Var.f461214e);
                    gp0Var.a0(lo6Var.f461215f);
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(lo6Var.f461214e) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(lo6Var.f461215f)) {
                        long j18 = lo6Var.f461217h;
                        if (j18 > 0) {
                            gp0Var.q0(j18);
                        }
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneTransCDN", "match error server return");
                    i27 = 3;
                }
            }
        }
        boolean z17 = true;
        boolean z18 = this.f105915n < b0Var.f68494x84214f59.f452497f.size();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTransCDN", "check need continue, indexOK %B", java.lang.Boolean.valueOf(z18));
        if (z18) {
            z17 = mo807x6c193ac1(m47995xb7ba1aa7(), this.f105909e) == -100;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTransCDN", "do callback");
            this.f105910f = bt3.g2.g(b0Var.f68502x29dd02d3, b0Var.f68495x225aa2b6, b0Var.f68494x84214f59);
            this.f105909e.mo815x76e0bfae(i27, i19, str, this);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityLimitCount */
    public int mo11249xbf5a7574() {
        return 10;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityVerificationChecked */
    public com.p314xaae8f345.mm.p944x882e457a.o1 mo11250x9215ac(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        return com.p314xaae8f345.mm.p944x882e457a.o1.EOk;
    }
}
