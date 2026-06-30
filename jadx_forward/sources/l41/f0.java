package l41;

/* loaded from: classes4.dex */
public class f0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f397341d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f397342e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f397343f;

    public f0(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        this.f397343f = str;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.hz5();
        lVar.f152198b = new r45.iz5();
        lVar.f152199c = "/cgi-bin/micromsg-bin/sendopenimverifyrequest";
        lVar.f152200d = 243;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f397342e = a17;
        r45.hz5 hz5Var = (r45.hz5) a17.f152243a.f152217a;
        hz5Var.f458105d = str;
        hz5Var.f458106e = str2;
        hz5Var.f458107f = str3;
        hz5Var.f458108g = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSendOpenIMVerifyRequest", "init user:%s anti:%s", str, str3);
    }

    public void H(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSendOpenIMVerifyRequest", "setClientMsgIdWithExtInfo: clientMsgId=%s, openImCustomInfo=%s, openImAppId=%s, descWordingId=%s", java.lang.Long.valueOf(j17), str, str2, str3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSendOpenIMVerifyRequest", "setClientMsgId: %s", java.lang.Long.valueOf(j17));
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f397342e;
        ((r45.hz5) oVar.f152243a.f152217a).f458109h = java.lang.String.valueOf(j17);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (str != null && !str.isEmpty()) {
            r45.k15 k15Var = new r45.k15();
            k15Var.f459845d = "openImCustomInfo";
            k15Var.f459846e = str;
            arrayList.add(k15Var);
        }
        if (str2 != null && !str2.isEmpty()) {
            r45.k15 k15Var2 = new r45.k15();
            k15Var2.f459845d = "openImAppId";
            k15Var2.f459846e = str2;
            arrayList.add(k15Var2);
        }
        if (str3 != null && !str3.isEmpty()) {
            r45.k15 k15Var3 = new r45.k15();
            k15Var3.f459845d = "descWordingId";
            k15Var3.f459846e = str3;
            arrayList.add(k15Var3);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSendOpenIMVerifyRequest", "setMsgExtInfo: size=%s", java.lang.Integer.valueOf(arrayList.size()));
        r45.hz5 hz5Var = (r45.hz5) oVar.f152243a.f152217a;
        if (!arrayList.isEmpty()) {
            hz5Var.f458110i = new java.util.LinkedList(arrayList);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSendOpenIMVerifyRequest", "setClientMsgIdWithExtInfo: extInfo set, size=%s", java.lang.Integer.valueOf(arrayList.size()));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f397341d = u0Var;
        return mo9409x10f9447a(sVar, this.f397342e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 243;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSendOpenIMVerifyRequest", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, tp_username = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, this.f397343f);
        if (i18 != 0 || i19 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneSendOpenIMVerifyRequest", "errType:%d, errCode:%d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        }
        this.f397341d.mo815x76e0bfae(i18, i19, str, this);
    }
}
