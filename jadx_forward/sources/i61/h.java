package i61;

/* loaded from: classes9.dex */
public class h extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f370451d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.k f370452e;

    /* renamed from: f, reason: collision with root package name */
    public r45.l f370453f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f370454g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f370455h;

    public h(java.lang.String str, int i17, java.lang.String str2, long j17, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, boolean z17, java.util.LinkedList linkedList) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.k();
        lVar.f152198b = new r45.l();
        lVar.f152200d = 2831;
        lVar.f152199c = "/cgi-bin/mmpay-bin/newaalaunchbypayercustomize";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f370451d = a17;
        r45.k kVar = (r45.k) a17.f152243a.f152217a;
        this.f370452e = kVar;
        a17.m47986x306cfea3(true);
        try {
            kVar.f459769d = fp.s0.b(str, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
            kVar.f459770e = i17;
            kVar.f459771f = str2;
            kVar.f459772g = at4.g0.c();
            kVar.f459773h = j17;
            kVar.f459774i = str3;
            kVar.f459775m = str4;
            kVar.f459776n = str5;
            kVar.f459777o = str6;
            kVar.f459778p = z17;
            kVar.f459779q = linkedList;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneAALaunchByPersonCustomize", "build NetSceneAALaunchByPerson request error: %s", e17.getMessage());
        }
        this.f370455h = str2;
        java.lang.Object[] objArr = new java.lang.Object[8];
        r45.k kVar2 = this.f370452e;
        objArr[0] = kVar2.f459769d;
        objArr[1] = java.lang.Integer.valueOf(kVar2.f459770e);
        r45.k kVar3 = this.f370452e;
        objArr[2] = kVar3.f459771f;
        objArr[3] = java.lang.Long.valueOf(kVar3.f459773h);
        r45.k kVar4 = this.f370452e;
        java.lang.String str7 = kVar4.f459774i;
        objArr[4] = str7 == null ? "" : str7;
        java.lang.String str8 = kVar4.f459775m;
        objArr[5] = str8 == null ? "" : str8;
        java.lang.String str9 = kVar4.f459776n;
        objArr[6] = str9 == null ? "" : str9;
        java.lang.String str10 = kVar4.f459777o;
        objArr[7] = str10 != null ? str10 : "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneAALaunchByPersonCustomize", "NetSceneAALaunchByPersonCustomize, title: %s, scene: %s, groupid: %s, timestamp: %s, pic_cdn_url: %s, pic_cdn_thumb_url: %s, pf_order_no: %s , pic_cdn_md5: %s", objArr);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f370454g = u0Var;
        return mo9409x10f9447a(sVar, this.f370451d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 2831;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: onGYNetEnd */
    public void mo11134x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneAALaunchByPersonCustomize", "onGYNetEnd, errType: %s, errCode: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        r45.l lVar = (r45.l) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f370453f = lVar;
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Integer.valueOf(lVar.f460584d);
        r45.l lVar2 = this.f370453f;
        objArr[1] = lVar2.f460585e;
        objArr[2] = lVar2.f460586f;
        objArr[3] = java.lang.Boolean.valueOf(lVar2.f460587g == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneAALaunchByPersonCustomize", "retcode: %s, retmsg: %s, bill_no: %s, msgxml==null: %s", objArr);
        java.lang.String str2 = this.f370453f.f460587g;
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f370454g;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
