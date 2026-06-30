package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29;

/* loaded from: classes8.dex */
public class p2 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f180575d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f180576e = null;

    public p2(long j17, java.lang.String str, java.lang.String str2, long j18, long j19, byte[] bArr, int i17) {
        this.f180575d = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.NetSceneSendHardDeviceMsg", "NetSceneSendHardDeviceMsg deviceType = %s, deviceId = %s, sessionId = %d, createTime = %d, data length = %d, msgType = %d", str, str2, java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j19), java.lang.Integer.valueOf(bArr.length), java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.az5();
        lVar.f152198b = new r45.bz5();
        lVar.f152200d = 538;
        lVar.f152199c = "/cgi-bin/micromsg-bin/sendharddevicemsg";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f180575d = a17;
        r45.az5 az5Var = (r45.az5) a17.f152243a.f152217a;
        r45.nv3 nv3Var = new r45.nv3();
        nv3Var.f463224d = str;
        nv3Var.f463225e = str2;
        az5Var.f451912d = nv3Var;
        r45.rv3 rv3Var = new r45.rv3();
        rv3Var.f466757d = j18;
        rv3Var.f466758e = (int) j19;
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(bArr);
        rv3Var.f466759f = cu5Var;
        rv3Var.f466760g = i17;
        az5Var.f451913e = rv3Var;
        if (j17 != 0) {
            r45.cu5 cu5Var2 = new r45.cu5();
            cu5Var2.d(u32.h1.a().b(j17, 2));
            az5Var.f451914f = cu5Var2;
        } else {
            v32.b P0 = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Ui().P0(str2);
            if (P0 != null) {
                r45.cu5 cu5Var3 = new r45.cu5();
                cu5Var3.d(P0.f66611x1c34a862);
                az5Var.f451914f = cu5Var3;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f180576e = u0Var;
        return mo9409x10f9447a(sVar, this.f180575d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 538;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.NetSceneSendHardDeviceMsg", "onGYNetEnd netId = " + i17 + " errType = " + i18 + " errCode = " + i19 + str);
        this.f180576e.mo815x76e0bfae(i18, i19, str, this);
    }
}
