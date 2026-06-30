package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes13.dex */
public class l0 implements com.tencent.mm.plugin.exdevice.model.m0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f98965d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f98966e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f98967f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f98968g;

    public l0(com.tencent.mm.plugin.exdevice.model.o0 o0Var, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.f98965d = str;
        this.f98966e = str2;
        this.f98967f = str3;
        this.f98968g = str4;
    }

    @Override // com.tencent.mm.plugin.exdevice.model.m0
    public void D3(java.lang.String str, java.lang.String str2, boolean z17) {
        java.lang.String str3 = this.f98966e;
        if (str3 != null) {
            str3.equals(str2);
        }
    }

    @Override // com.tencent.mm.plugin.exdevice.model.m0
    public void V0(java.lang.String str, int i17, long j17) {
        java.lang.String str2 = this.f98966e;
        if (str2 == null || !str2.equals(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceEventManager", "onConnectStateChanged, mac(%s) is null or not correct.(mac : %s, state : %s, type : %s)", str2, str, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceEventManager", "mac(%s), connectState(%s), profileType(%s)", str, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17));
        java.lang.String str3 = this.f98968g;
        java.lang.String str4 = this.f98967f;
        java.lang.String str5 = this.f98965d;
        if (i17 == 0) {
            com.tencent.mm.plugin.exdevice.model.o0.n(str5, str4, 0, str3);
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceEventManager", "onConnectStateChanged, device state none.(mac : %s)", str);
            return;
        }
        if (i17 == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceEventManager", "onConnectStateChanged, device is connectiong.(mac: %s)", str);
            com.tencent.mm.plugin.exdevice.model.o0.n(str5, str4, 1, str3);
            return;
        }
        if (i17 != 2) {
            if (i17 != 4) {
                com.tencent.mm.plugin.exdevice.model.o0.n(str5, str4, -1, str3);
                return;
            } else {
                com.tencent.mm.plugin.exdevice.model.o0.n(str5, str4, 4, str3);
                com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceEventManager", "onConnectStateChanged, device disconnected.(mac : %s)", str);
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceEventManager", "onConnectStateChanged, device connected now start send data to it.(mac : %s)", str);
        com.tencent.mm.plugin.exdevice.model.o0.n(str5, str4, 2, str3);
        iq1.i iVar = new iq1.i();
        iVar.f293668e = iq1.i.f293696m;
        iVar.f293669f = 2;
        com.tencent.mm.plugin.exdevice.model.l3.Di().g(str2, iVar.c());
    }

    @Override // com.tencent.mm.plugin.exdevice.model.m0
    public void o1(java.lang.String str, byte[] bArr, boolean z17) {
        java.lang.String str2 = this.f98966e;
        if (str2 == null || !str2.equals(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceEventManager", "onRecvFromDevice, mac(%s) is null or not correct.(mac : %s, succ : %s)", str2, str, java.lang.Boolean.valueOf(z17));
            return;
        }
        if (!z17 || bArr == null) {
            return;
        }
        try {
            if (com.tencent.mm.plugin.exdevice.model.l3.Di().h(str2, this.f98965d, bArr)) {
                return;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.exdevice.ExdeviceEventManager", "The parser isn't a correct type.");
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceEventManager", "Read data from bytes failed.");
        }
    }
}
