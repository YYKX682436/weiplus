package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes9.dex */
public class q2 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f99045d = null;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f99046e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.feature.exdevice.NetworkDeviceInfo f99047f;

    public q2(r45.rf4 rf4Var, com.tencent.mm.feature.exdevice.NetworkDeviceInfo networkDeviceInfo) {
        this.f99046e = null;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.yo6();
        lVar.f70665b = new r45.zo6();
        lVar.f70666c = "/cgi-bin/mmiot-bin/mmiot/mmiot_transfermsgtodevice";
        lVar.f70667d = 6844;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f99046e = a17;
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.NetSceneTransferToIotDevice", "deviceid %s", networkDeviceInfo.f66586d);
        r45.yo6 yo6Var = (r45.yo6) a17.f70710a.f70684a;
        yo6Var.f391263d = networkDeviceInfo.f66595p;
        yo6Var.f391264e = networkDeviceInfo.f66586d;
        yo6Var.f391265f = rf4Var;
        this.f99047f = networkDeviceInfo;
    }

    public r45.zo6 H() {
        com.tencent.mm.protobuf.f fVar;
        com.tencent.mm.modelbase.o oVar = this.f99046e;
        if (oVar == null || (fVar = oVar.f70711b.f70700a) == null) {
            return null;
        }
        return (r45.zo6) fVar;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f99045d = u0Var;
        return dispatch(sVar, this.f99046e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 6844;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.NetSceneTransferToIotDevice", "onGYNetEnd netId = " + i17 + " errType = " + i18 + " errCode = " + i19 + str);
        this.f99045d.onSceneEnd(i18, i19, str, this);
    }
}
