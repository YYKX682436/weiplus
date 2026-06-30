package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes8.dex */
public class p2 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f99042d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f99043e = null;

    public p2(long j17, java.lang.String str, java.lang.String str2, long j18, long j19, byte[] bArr, int i17) {
        this.f99042d = null;
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.NetSceneSendHardDeviceMsg", "NetSceneSendHardDeviceMsg deviceType = %s, deviceId = %s, sessionId = %d, createTime = %d, data length = %d, msgType = %d", str, str2, java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j19), java.lang.Integer.valueOf(bArr.length), java.lang.Integer.valueOf(i17));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.az5();
        lVar.f70665b = new r45.bz5();
        lVar.f70667d = 538;
        lVar.f70666c = "/cgi-bin/micromsg-bin/sendharddevicemsg";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f99042d = a17;
        r45.az5 az5Var = (r45.az5) a17.f70710a.f70684a;
        r45.nv3 nv3Var = new r45.nv3();
        nv3Var.f381691d = str;
        nv3Var.f381692e = str2;
        az5Var.f370379d = nv3Var;
        r45.rv3 rv3Var = new r45.rv3();
        rv3Var.f385224d = j18;
        rv3Var.f385225e = (int) j19;
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(bArr);
        rv3Var.f385226f = cu5Var;
        rv3Var.f385227g = i17;
        az5Var.f370380e = rv3Var;
        if (j17 != 0) {
            r45.cu5 cu5Var2 = new r45.cu5();
            cu5Var2.d(u32.h1.a().b(j17, 2));
            az5Var.f370381f = cu5Var2;
        } else {
            v32.b P0 = com.tencent.mm.plugin.exdevice.model.l3.Ui().P0(str2);
            if (P0 != null) {
                r45.cu5 cu5Var3 = new r45.cu5();
                cu5Var3.d(P0.field_sessionBuf);
                az5Var.f370381f = cu5Var3;
            }
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f99043e = u0Var;
        return dispatch(sVar, this.f99042d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 538;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.NetSceneSendHardDeviceMsg", "onGYNetEnd netId = " + i17 + " errType = " + i18 + " errCode = " + i19 + str);
        this.f99043e.onSceneEnd(i18, i19, str, this);
    }
}
