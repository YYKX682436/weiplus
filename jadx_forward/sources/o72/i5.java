package o72;

/* loaded from: classes4.dex */
public class i5 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f424898d;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f424900f;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f424902h;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f424899e = null;

    /* renamed from: g, reason: collision with root package name */
    public int f424901g = 0;

    public i5(java.util.LinkedList linkedList, java.util.Map map) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.te();
        lVar.f152198b = new r45.ue();
        lVar.f152199c = "/cgi-bin/micromsg-bin/batchdelfavitem";
        lVar.f152200d = 403;
        lVar.f152201e = 194;
        lVar.f152202f = 1000000194;
        this.f424898d = lVar.a();
        this.f424900f = linkedList;
        this.f424902h = map;
    }

    public final boolean H() {
        boolean z17 = false;
        java.util.LinkedList linkedList = this.f424900f;
        if (linkedList != null && this.f424901g < linkedList.size()) {
            z17 = true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBatchDelFavItem", "check need continue, indexOK %B", java.lang.Boolean.valueOf(z17));
        return z17;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2 = this.f424900f;
        if (linkedList2 == null || linkedList2.isEmpty() || this.f424901g >= linkedList2.size()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneBatchDelFavItem", "klem doScene idList null, begIndex %d", java.lang.Integer.valueOf(this.f424901g));
            return -1;
        }
        this.f424899e = u0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBatchDelFavItem", "ashutest::do netscene size %d, begIndex %d, total %s", java.lang.Integer.valueOf(linkedList2.size()), java.lang.Integer.valueOf(this.f424901g), linkedList2);
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f424898d;
        r45.te teVar = (r45.te) oVar.f152243a.f152217a;
        teVar.f467872e.clear();
        int i17 = this.f424901g;
        int i18 = 0;
        while (true) {
            int size = linkedList2.size();
            linkedList = teVar.f467874g;
            if (i17 >= size) {
                break;
            }
            int intValue = ((java.lang.Integer) linkedList2.get(i17)).intValue();
            if (intValue > 0) {
                teVar.f467872e.add(java.lang.Integer.valueOf(intValue));
                i18++;
                java.lang.String str = (java.lang.String) this.f424902h.get(java.lang.Integer.valueOf(intValue));
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    r45.uo6 uo6Var = new r45.uo6();
                    uo6Var.f469070e = intValue;
                    uo6Var.f469069d = str;
                    linkedList.add(uo6Var);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBatchDelFavItem", "id = " + intValue + ", ctx = " + str);
                }
            }
            if (i18 >= 20) {
                break;
            }
            i17++;
        }
        this.f424901g = i17 + 1;
        teVar.f467871d = teVar.f467872e.size();
        teVar.f467873f = linkedList.size();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBatchDelFavItem", "id size = " + teVar.f467871d + ", ctx size = " + teVar.f467873f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBatchDelFavItem", "ashutest::do netscene checkd size %d, %s", java.lang.Integer.valueOf(teVar.f467871d), teVar.f467872e);
        return mo9409x10f9447a(sVar, oVar, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 403;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBatchDelFavItem", "netId %d errType %d errCode %d begIndex %d idListSize %d errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(this.f424901g), java.lang.Integer.valueOf(this.f424900f.size()), str);
        if (i18 != 0 || i19 != 0) {
            if (H()) {
                mo807x6c193ac1(m47995xb7ba1aa7(), this.f424899e);
                return;
            } else {
                this.f424899e.mo815x76e0bfae(i18, i19, str, this);
                return;
            }
        }
        java.util.LinkedList linkedList = ((r45.ue) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a).f468812e;
        if (linkedList == null || linkedList.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneBatchDelFavItem", "klem onGYNet resp list null");
            if (H()) {
                mo807x6c193ac1(m47995xb7ba1aa7(), this.f424899e);
                return;
            } else {
                this.f424899e.mo815x76e0bfae(i18, i19, str, this);
                return;
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBatchDelFavItem", "klem onGYNet respList size:%d", java.lang.Integer.valueOf(linkedList.size()));
        for (int i27 = 0; i27 < linkedList.size(); i27++) {
            r45.bc0 bc0Var = (r45.bc0) linkedList.get(i27);
            if (bc0Var.f452196d < 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneBatchDelFavItem", "klem onGYNet favId:%d, delete failed", java.lang.Integer.valueOf(bc0Var.f452197e));
            } else {
                arrayList.add(java.lang.Integer.valueOf(bc0Var.f452197e));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBatchDelFavItem", "klem onGYNet favId:%d deleted", java.lang.Integer.valueOf(bc0Var.f452197e));
            }
        }
        o72.x1.E0(arrayList);
        if (H()) {
            mo807x6c193ac1(m47995xb7ba1aa7(), this.f424899e);
        } else {
            this.f424899e.mo815x76e0bfae(i18, i19, str, this);
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
