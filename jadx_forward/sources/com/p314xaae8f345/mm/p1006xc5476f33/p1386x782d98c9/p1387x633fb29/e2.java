package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29;

/* loaded from: classes13.dex */
public class e2 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f180415d = null;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f180416e;

    public e2(java.lang.String str, int i17) {
        this.f180416e = null;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.xh();
        lVar.f152198b = new r45.yh();
        lVar.f152199c = "/cgi-bin/micromsg-bin/bindharddevice";
        lVar.f152200d = 536;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f180416e = a17;
        r45.xh xhVar = (r45.xh) a17.f152243a.f152217a;
        xhVar.f471623d = str == null ? "" : str;
        xhVar.f471624e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1(java.lang.Integer.valueOf(i17));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f180415d = u0Var;
        return mo9409x10f9447a(sVar, this.f180416e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 536;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.NetSceneBindHardDevice", "onGYNetEnd netId = " + i17 + " errType = " + i18 + " errCode = " + i19 + str);
        if (i18 == 0 && i19 == 0) {
            com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f180416e;
            r45.yh yhVar = (oVar == null || (fVar = oVar.f152244b.f152233a) == null) ? null : (r45.yh) fVar;
            r45.nv3 nv3Var = yhVar.f472606d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.NetSceneBindHardDevice", "hardDevice : DeviceIdServer = %s, DeviceType = %s", nv3Var.f463225e, nv3Var.f463224d);
            java.lang.Object[] objArr = new java.lang.Object[6];
            r45.ov3 ov3Var = yhVar.f472607e;
            objArr[0] = ov3Var.f464072e;
            boolean z17 = true;
            objArr[1] = ov3Var.f464071d;
            objArr[2] = ov3Var.f464073f;
            objArr[3] = ov3Var.f464074g;
            objArr[4] = java.lang.Integer.valueOf(ov3Var.f464075h);
            objArr[5] = yhVar.f472608f == 0 ? "sync" : "async";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.NetSceneBindHardDevice", "hardDeviceAttr : AuthKey = %s, BrandName = %s, Mac = %s, connProto = %s, ConnStrategy = %s, bindFlag = %s", objArr);
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Ui().d1(yhVar.f472607e.f464071d, yhVar.f472606d.f463225e) != null) {
                z17 = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Ui().y0(yhVar.f472606d.f463225e, yhVar.f472607e.f464071d);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.NetSceneBindHardDevice", "delete local deviceinfo : %s, ret : %b", yhVar.f472607e.f464071d, java.lang.Boolean.valueOf(z17));
            }
            v32.b bVar = new v32.b();
            com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.q0.a(bVar, yhVar.f472606d, yhVar.f472607e);
            bVar.f66613x4b6e88aa = "";
            u32.v d17 = u32.h1.a().d(bVar.f66609x4b6e688a);
            if (d17 != null && d17.f505916e == 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.NetSceneBindHardDevice", "before do bind netscene, stop the channel now");
                com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Bi().b(bVar.f66609x4b6e688a);
                u32.w a17 = u32.h1.a();
                long j17 = bVar.f66609x4b6e688a;
                java.util.HashMap hashMap = a17.f505923a;
                if (hashMap.containsKey(java.lang.Long.valueOf(j17))) {
                    hashMap.remove(java.lang.Long.valueOf(j17));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceInfoManager", "remove the device from map : %d", java.lang.Long.valueOf(j17));
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceInfoManager", "device id not contains in the map : %d", java.lang.Long.valueOf(j17));
                }
            }
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Ui().mo880xb970c2b9(bVar);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Ui().i1(bVar);
            }
        }
        this.f180415d.mo815x76e0bfae(i18, i19, str, this);
    }
}
