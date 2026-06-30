package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29;

/* loaded from: classes9.dex */
public class q extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 implements com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.t {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f238490d;

    /* renamed from: e, reason: collision with root package name */
    public r45.cp f238491e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f238492f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f238493g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5409x1e816faf f238494h = null;

    /* renamed from: i, reason: collision with root package name */
    public final int f238495i;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.p pVar) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.bp();
        lVar.f152198b = new r45.cp();
        lVar.f152200d = 1633;
        lVar.f152199c = "/cgi-bin/mmpay-bin/busif2fplaceorder";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        re4.v a17 = re4.u.a();
        java.lang.String str = pVar.f238474p;
        this.f238493g = str;
        this.f238495i = pVar.f238464f;
        com.p314xaae8f345.mm.p944x882e457a.o a18 = lVar.a();
        this.f238490d = a18;
        r45.bp bpVar = (r45.bp) a18.f152243a.f152217a;
        bpVar.f452454d = pVar.f238459a;
        bpVar.f452455e = java.net.URLDecoder.decode(pVar.f238460b);
        bpVar.f452456f = pVar.f238461c;
        bpVar.f452457g = pVar.f238462d;
        bpVar.f452458h = pVar.f238463e;
        bpVar.f452459i = pVar.f238464f;
        bpVar.M = pVar.f238484z;
        bpVar.f452460m = pVar.f238465g;
        bpVar.f452462o = pVar.f238466h;
        bpVar.f452461n = pVar.f238467i;
        bpVar.f452465r = pVar.f238468j;
        bpVar.F = pVar.f238478t;
        bpVar.H = pVar.f238480v;
        bpVar.f452466s = pVar.f238470l;
        bpVar.I = pVar.f238481w;
        r45.uq0 uq0Var = pVar.f238471m;
        if (uq0Var != null) {
            bpVar.f452467t = uq0Var;
        }
        bpVar.f452468u = pVar.f238472n;
        bpVar.f452469v = pVar.f238473o;
        if (pVar.f238469k == 1) {
            bpVar.f452463p = com.p314xaae8f345.mm.sdk.p2603x2137b148.v0.f274560a.f(false);
            bpVar.f452464q = 0;
        }
        bpVar.f452472y = a17.f476086a;
        bpVar.f452473z = a17.f476087b;
        bpVar.f452471x = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().v();
        pz2.a aVar = (pz2.a) gm0.j1.s(pz2.a.class);
        bpVar.f452470w = aVar != null ? aVar.mo148657xb9a85d2c() : false;
        bpVar.A = str;
        bpVar.B = pVar.f238475q;
        bpVar.C = pVar.f238476r;
        bpVar.G = pVar.f238479u;
        bpVar.D = pVar.f238477s;
        java.util.LinkedList linkedList = pVar.B;
        if (linkedList != null) {
            bpVar.L = linkedList;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBusiF2fPlaceOrder", "extra_buy_detail_infos count: %d", java.lang.Integer.valueOf(linkedList.size()));
        }
        java.lang.String str2 = pVar.f238482x;
        if (str2 != null) {
            bpVar.f452453J = str2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBusiF2fPlaceOrder", "inputRecvName:%s", str2);
        }
        java.lang.String str3 = pVar.f238483y;
        if (str3 != null) {
            bpVar.K = str3;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBusiF2fPlaceOrder", "checkRecvNameSign:%s", str3);
        }
        bpVar.N = pVar.A;
        bpVar.P = pVar.C.booleanValue();
        bpVar.R = pVar.E;
        if (pVar.C.booleanValue()) {
            bpVar.Q = pVar.D.booleanValue();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBusiF2fPlaceOrder", "NetSceneBusiF2fPlaceOrder dycodeurl: %s", pVar.f238474p);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBusiF2fPlaceOrder", "NetSceneBusiF2fPlaceOrder, scene: %s, channel: %s, total: %s, origin: %s, qrcode: %s, getPayWifi: %s favor_compose_info %s dynamicCodeUrl %s cancel_f2fid:%s cancel_reason:%s unpayType:%s amount_remind_sign:%s,qrcodeSenderName：%s", java.lang.Integer.valueOf(pVar.f238461c), java.lang.Integer.valueOf(pVar.f238465g), java.lang.Integer.valueOf(pVar.f238464f), java.lang.Integer.valueOf(pVar.f238484z), pVar.f238460b, java.lang.Integer.valueOf(pVar.f238469k), com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.a.c(pVar.f238471m), str, pVar.f238478t, java.lang.Integer.valueOf(pVar.f238480v), java.lang.Integer.valueOf(pVar.f238479u), pVar.f238481w, pVar.E);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f238492f = u0Var;
        return mo9409x10f9447a(sVar, this.f238490d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1633;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: onGYNetEnd */
    public void mo11134x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBusiF2fPlaceOrder", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f238491e = (r45.cp) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(java.lang.String.format("trans_id: %s,", this.f238491e.f453282q));
        stringBuffer.append(java.lang.String.format("zero_pay_flag: %s,", java.lang.Integer.valueOf(this.f238491e.f453284s)));
        stringBuffer.append(java.lang.String.format("can_use_fingerprint: %s,", java.lang.Integer.valueOf(this.f238491e.f453290y)));
        stringBuffer.append(java.lang.String.format("payer_need_auth_flag: %s,", java.lang.Integer.valueOf(this.f238491e.f453285t)));
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.o oVar = new com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.o(i18, i19, str);
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0.m83002x6758cc7e(i18, i19, str, oVar);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f238491e.f453272d);
        r45.cp cpVar = this.f238491e;
        java.lang.String str2 = cpVar.f453273e;
        java.lang.String str3 = cpVar.f453282q;
        java.lang.String str4 = cpVar.f453277i;
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(cpVar.f453281p);
        r45.cp cpVar2 = this.f238491e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBusiF2fPlaceOrder", "ret_code: %s, ret_msg: %s trans_id: %s f2f_id: %s re_getfavor: %s payok_checksign: %s reqKey %s ret:%s", valueOf, str2, str3, str4, valueOf2, cpVar2.f453278m, cpVar2.f453274f, stringBuffer.toString());
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f238492f;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(oVar.f295485a, oVar.f295486b, oVar.f295487c, this);
        }
    }
}
