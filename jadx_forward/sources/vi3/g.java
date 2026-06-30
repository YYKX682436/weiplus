package vi3;

/* loaded from: classes9.dex */
public class g extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f519118d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f519119e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f519120f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f519121g;

    /* renamed from: h, reason: collision with root package name */
    public final int f519122h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f519123i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f519124m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f519125n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f519126o;

    public g(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        this.f519120f = str;
        this.f519121g = str2;
        this.f519122h = i17;
        this.f519123i = str3;
        this.f519124m = str4;
        this.f519125n = str5;
        this.f519126o = str6;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.py5();
        lVar.f152198b = new r45.qy5();
        lVar.f152199c = "/cgi-bin/micromsg-bin/sendappmsg";
        lVar.f152200d = com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10111xba02d508;
        lVar.f152201e = 107;
        lVar.f152202f = 1000000107;
        this.f519118d = lVar.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgSynchronizeSendAppMsgNetScene", "MsgSynchronizeSendAppMsgNetScene action[%s], messagaction[%s], fileId[%s], fileLen[%d], selfName[%s], stack[%s]", str4, str4, str, java.lang.Integer.valueOf(i17), str3, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f519119e = u0Var;
        ot0.q qVar = new ot0.q();
        qVar.f430187f = "ChatSync";
        qVar.f430191g = "ChatSync";
        qVar.f430199i = 35;
        qVar.f430207k = this.f519120f;
        java.lang.String str = this.f519121g;
        qVar.T = str;
        qVar.f430215m = this.f519122h;
        qVar.U = str;
        qVar.f430167J = 0;
        qVar.f430195h = "phone";
        qVar.Y = this.f519124m;
        qVar.f430235r = "supportAfterSleep,supportGetMore";
        qVar.f430219n = this.f519125n;
        qVar.f430266y2 = this.f519126o;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f519118d;
        r45.py5 py5Var = (r45.py5) oVar.f152243a.f152217a;
        r45.b9 b9Var = new r45.b9();
        java.lang.String str2 = this.f519123i;
        b9Var.set(0, str2);
        b9Var.set(2, java.lang.Integer.valueOf(qVar.f430183e));
        b9Var.set(4, 35);
        b9Var.set(3, str2);
        b9Var.set(5, ot0.q.t(qVar, null, null, 0, 0));
        b9Var.set(6, java.lang.Integer.valueOf((int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()));
        py5Var.set(1, b9Var);
        return mo9409x10f9447a(sVar, oVar, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10111xba02d508;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgSynchronizeSendAppMsgNetScene", "msgSynchronize sendAppMsg onGYNetEnd. [%d,%d,%s]", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f519119e.mo815x76e0bfae(i18, i19, str, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityVerificationChecked */
    public com.p314xaae8f345.mm.p944x882e457a.o1 mo11250x9215ac(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        return com.p314xaae8f345.mm.p944x882e457a.o1.EOk;
    }
}
