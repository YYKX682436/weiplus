package bt3;

/* loaded from: classes9.dex */
public class r0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f24375d;

    /* renamed from: g, reason: collision with root package name */
    public final zs3.b0 f24378g;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f24376e = null;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f24377f = "";

    /* renamed from: h, reason: collision with root package name */
    public final android.util.SparseArray f24379h = new android.util.SparseArray();

    /* renamed from: i, reason: collision with root package name */
    public final android.util.SparseBooleanArray f24380i = new android.util.SparseBooleanArray();

    /* renamed from: m, reason: collision with root package name */
    public int f24381m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f24382n = 0;

    public r0(zs3.b0 b0Var) {
        this.f24378g = null;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.yg();
        lVar.f70665b = new r45.zg();
        lVar.f70666c = "/cgi-bin/micromsg-bin/batchtranscdnitem";
        lVar.f70667d = 632;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        this.f24375d = lVar.a();
        this.f24378g = b0Var;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        int i17;
        boolean z17;
        this.f24376e = u0Var;
        com.tencent.mm.modelbase.o oVar = this.f24375d;
        r45.yg ygVar = (r45.yg) oVar.f70710a.f70684a;
        android.util.SparseArray sparseArray = this.f24379h;
        sparseArray.clear();
        android.util.SparseBooleanArray sparseBooleanArray = this.f24380i;
        sparseBooleanArray.clear();
        zs3.b0 b0Var = this.f24378g;
        if (b0Var.field_dataProto.f370964f.size() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneTransCDN", "doScene data list null");
            this.f24381m = -100;
            return -100;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        int i18 = this.f24382n;
        while (true) {
            if (i18 >= b0Var.field_dataProto.f370964f.size()) {
                i17 = i18;
                break;
            }
            r45.gp0 gp0Var = (r45.gp0) b0Var.field_dataProto.f370964f.get(i18);
            z17 = false;
            if (gp0Var.N && com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.f375434s)) {
                i17 = i18;
                break;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.f375434s)) {
                i17 = i18;
            } else {
                r45.lo6 lo6Var = new r45.lo6();
                lo6Var.f379681e = gp0Var.f375434s;
                lo6Var.f379682f = gp0Var.f375438u;
                lo6Var.f379683g = gp0Var.I;
                i17 = i18;
                lo6Var.f379684h = (int) gp0Var.R;
                java.lang.String str = gp0Var.T;
                if (str == null) {
                    str = "";
                }
                lo6Var.f379680d = str.hashCode();
                linkedList.add(lo6Var);
                sparseArray.put(lo6Var.f379680d, gp0Var);
                sparseBooleanArray.put(lo6Var.f379680d, false);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.f375412h)) {
                r45.lo6 lo6Var2 = new r45.lo6();
                lo6Var2.f379681e = gp0Var.f375412h;
                lo6Var2.f379682f = gp0Var.f375420m;
                lo6Var2.f379683g = 2;
                lo6Var2.f379684h = (int) gp0Var.f375418l1;
                java.lang.String str2 = gp0Var.T;
                lo6Var2.f379680d = (str2 != null ? str2 : "").concat("@thumb").hashCode();
                linkedList.add(lo6Var2);
                sparseArray.put(lo6Var2.f379680d, gp0Var);
                sparseBooleanArray.put(lo6Var2.f379680d, true);
            }
            if (linkedList.size() >= 20) {
                break;
            }
            i18 = i17 + 1;
        }
        z17 = true;
        this.f24382n = i17 + 1;
        ygVar.f391043d = linkedList.size();
        java.util.LinkedList linkedList2 = ygVar.f391044e;
        linkedList2.clear();
        linkedList2.addAll(linkedList);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTransCDN", "ashutest::data list size %d, need check size %d, nextIndex %d", java.lang.Integer.valueOf(b0Var.field_dataProto.f370964f.size()), java.lang.Integer.valueOf(sparseArray.size()), java.lang.Integer.valueOf(this.f24382n));
        if (ygVar.f391043d > 0 && z17) {
            return dispatch(sVar, oVar, this);
        }
        this.f24377f = bt3.g2.g(b0Var.field_title, b0Var.field_desc, b0Var.field_dataProto);
        com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneTransCDN", "doScene no more data");
        this.f24381m = -100;
        return -100;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 632;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        int i27 = i18;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTransCDN", "netId %d errType %d errCode %d localErrCode %d begIndex %d errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(this.f24381m), java.lang.Integer.valueOf(this.f24382n), str);
        zs3.b0 b0Var = this.f24378g;
        if (i27 == 3 && this.f24381m == -100) {
            this.f24377f = bt3.g2.g(b0Var.field_title, b0Var.field_desc, b0Var.field_dataProto);
            this.f24376e.onSceneEnd(0, 0, str, this);
            return;
        }
        if (i27 != 0 || i19 != 0) {
            this.f24376e.onSceneEnd(i27, i19, str, this);
            return;
        }
        java.util.Iterator it = ((r45.zg) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a).f391992e.iterator();
        while (it.hasNext()) {
            r45.lo6 lo6Var = (r45.lo6) it.next();
            r45.gp0 gp0Var = (r45.gp0) this.f24379h.get(lo6Var.f379680d);
            if (gp0Var != null) {
                if (this.f24380i.get(lo6Var.f379680d)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTransCDN", "trans end, client id[%d], dataId[%s], isThumb[true], old thumb url[%s], new thumb url[%s], old size[%d], new size[%d]", java.lang.Integer.valueOf(lo6Var.f379680d), gp0Var.T, gp0Var.f375412h, lo6Var.f379681e, java.lang.Long.valueOf(gp0Var.f375418l1), java.lang.Long.valueOf(lo6Var.f379684h));
                    gp0Var.d0(lo6Var.f379681e);
                    gp0Var.c0(lo6Var.f379682f);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(lo6Var.f379681e) && !com.tencent.mm.sdk.platformtools.t8.K0(lo6Var.f379682f)) {
                        long j17 = lo6Var.f379684h;
                        if (j17 > 0) {
                            gp0Var.L0(j17);
                        }
                    }
                    com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneTransCDN", "match error server return");
                    i27 = 3;
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTransCDN", "trans end, client id[%d], dataId[%s], isThumb[false], old url[%s], new url[%s], old size[%d], new size[%d]", java.lang.Integer.valueOf(lo6Var.f379680d), gp0Var.T, gp0Var.f375434s, lo6Var.f379681e, java.lang.Long.valueOf(gp0Var.R), java.lang.Long.valueOf(lo6Var.f379684h));
                    gp0Var.b0(lo6Var.f379681e);
                    gp0Var.a0(lo6Var.f379682f);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(lo6Var.f379681e) && !com.tencent.mm.sdk.platformtools.t8.K0(lo6Var.f379682f)) {
                        long j18 = lo6Var.f379684h;
                        if (j18 > 0) {
                            gp0Var.q0(j18);
                        }
                    }
                    com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneTransCDN", "match error server return");
                    i27 = 3;
                }
            }
        }
        boolean z17 = true;
        boolean z18 = this.f24382n < b0Var.field_dataProto.f370964f.size();
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTransCDN", "check need continue, indexOK %B", java.lang.Boolean.valueOf(z18));
        if (z18) {
            z17 = doScene(dispatcher(), this.f24376e) == -100;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTransCDN", "do callback");
            this.f24377f = bt3.g2.g(b0Var.field_title, b0Var.field_desc, b0Var.field_dataProto);
            this.f24376e.onSceneEnd(i27, i19, str, this);
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int securityLimitCount() {
        return 10;
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.modelbase.o1 securityVerificationChecked(com.tencent.mm.network.v0 v0Var) {
        return com.tencent.mm.modelbase.o1.EOk;
    }
}
