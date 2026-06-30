package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes.dex */
public class t2 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f99066d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f99067e = null;

    public t2(java.util.LinkedList linkedList, java.lang.String str, java.lang.String str2) {
        this.f99066d = null;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.vg3();
        lVar.f70665b = new r45.wg3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getharddeviceoperticket";
        lVar.f70667d = 543;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f99066d = a17;
        r45.vg3 vg3Var = (r45.vg3) a17.f70710a.f70684a;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            r45.tg3 tg3Var = new r45.tg3();
            tg3Var.f386394d = str;
            vg3Var.f388200e = tg3Var;
        }
        vg3Var.f388199d = linkedList;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f99067e = u0Var;
        return dispatch(sVar, this.f99066d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 543;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.NetsceneGetHardDeviceOperTicket", "GetHardDeviceOperTicket onGYNetEnd netId = %s, errType = %s, errCode = %s, errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        com.tencent.mm.modelbase.u0 u0Var = this.f99067e;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
