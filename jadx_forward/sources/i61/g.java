package i61;

/* loaded from: classes9.dex */
public class g extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f370446d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.m f370447e;

    /* renamed from: f, reason: collision with root package name */
    public r45.n f370448f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f370449g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f370450h;

    public g(java.lang.String str, long j17, java.util.List list, int i17, java.lang.String str2, long j18, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, boolean z17, java.util.LinkedList linkedList) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.m();
        lVar.f152198b = new r45.n();
        lVar.f152200d = 1655;
        lVar.f152199c = "/cgi-bin/mmpay-bin/newaalaunchbyperson";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f370446d = a17;
        r45.m mVar = (r45.m) a17.f152243a.f152217a;
        this.f370447e = mVar;
        a17.m47986x306cfea3(true);
        try {
            mVar.f461549d = fp.s0.b(str, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
            mVar.f461550e = j17;
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            mVar.f461551f = linkedList2;
            linkedList2.addAll(list);
            mVar.f461552g = i17;
            mVar.f461553h = str2;
            mVar.f461554i = at4.g0.c();
            mVar.f461555m = j18;
            mVar.f461556n = str3;
            mVar.f461557o = str4;
            mVar.f461558p = str5;
            mVar.f461559q = str6;
            mVar.f461560r = z17;
            mVar.f461561s = linkedList;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneAALaunchByPerson", "build NetSceneAALaunchByPerson request error: %s", e17.getMessage());
        }
        this.f370450h = str2;
        java.lang.Object[] objArr = new java.lang.Object[10];
        r45.m mVar2 = this.f370447e;
        objArr[0] = mVar2.f461549d;
        objArr[1] = java.lang.Long.valueOf(mVar2.f461550e);
        r45.m mVar3 = this.f370447e;
        objArr[2] = mVar3.f461551f;
        objArr[3] = java.lang.Integer.valueOf(mVar3.f461552g);
        r45.m mVar4 = this.f370447e;
        objArr[4] = mVar4.f461553h;
        objArr[5] = java.lang.Long.valueOf(mVar4.f461555m);
        r45.m mVar5 = this.f370447e;
        java.lang.String str7 = mVar5.f461556n;
        objArr[6] = str7 == null ? "" : str7;
        java.lang.String str8 = mVar5.f461557o;
        objArr[7] = str8 == null ? "" : str8;
        java.lang.String str9 = mVar5.f461558p;
        objArr[8] = str9 == null ? "" : str9;
        java.lang.String str10 = mVar5.f461559q;
        objArr[9] = str10 != null ? str10 : "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneAALaunchByPerson", "NetSceneAALaunchByPerson, title: %s, total_pay_amount: %s, payer_list: %s, scene: %s, groupid: %s, timestamp: %s, pic_cdn_url: %s, pic_cdn_thumb_url: %s, pf_order_no: %s , pic_cdn_md5:%s", objArr);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f370449g = u0Var;
        return mo9409x10f9447a(sVar, this.f370446d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1655;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: onGYNetEnd */
    public void mo11134x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneAALaunchByPerson", "onGYNetEnd, errType: %s, errCode: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        r45.n nVar = (r45.n) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f370448f = nVar;
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Integer.valueOf(nVar.f462493d);
        r45.n nVar2 = this.f370448f;
        objArr[1] = nVar2.f462494e;
        objArr[2] = nVar2.f462495f;
        objArr[3] = java.lang.Boolean.valueOf(nVar2.f462496g == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneAALaunchByPerson", "retcode: %s, retmsg: %s, bill_no: %s, msgxml==null: %s", objArr);
        java.lang.String str2 = this.f370448f.f462496g;
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f370449g;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
